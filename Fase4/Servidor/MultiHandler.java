package com.example.demo;

import org.springframework.web.socket.handler.TextWebSocketHandler;
import java.util.*;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class MultiHandler extends TextWebSocketHandler {
	private Queue<String> busqueda = new LinkedList<>();
	private Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
	private Map<String, String> pjM = new ConcurrentHashMap<>();
	private Map<String, String> uNamM = new ConcurrentHashMap<>();
	private ObjectMapper mapper = new ObjectMapper();
	private Map<String, String> partida = new ConcurrentHashMap<>();
	private int player = 0;
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		
		ObjectNode desinc = mapper.createObjectNode();
		desinc.put("tipo", "desinc");

		sessions.get(partida.get(session.getId())).sendMessage(new TextMessage(desinc.toString()));
		session.sendMessage(new TextMessage(desinc.toString()));

		
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session,TextMessage message) throws Exception {
		JsonNode node = mapper.readTree(message.getPayload());
		String tipo = node.get("tipo").asText();
		
		
		System.out.println("Message received: " +
		message.getPayload());
		String msg = message.getPayload();
		session.sendMessage(new TextMessage(msg));
		
		
		if(tipo.equals("buscando")) {
			String pj = node.get("pjS").asText();
			String uName = node.get("uName").asText();
			sessions.put(session.getId(), session);
			pjM.put(session.getId(), pj);
			uNamM.put(session.getId(), uName);
			busqueda.add(session.getId());
			ObjectNode asigna = mapper.createObjectNode();
			player++;
			
			asigna.put("tipo", "asignaP" );
			asigna.put("nPlayer", String.valueOf(player) );
			
			session.sendMessage(new TextMessage(asigna.toString()));
			
			
			if (busqueda.size() > 1) {
				String p1 = busqueda.remove();
				String p2 = busqueda.remove();
				
				partida.put(p1,p2);
				partida.put(p2,p1);
				
				ObjectNode startP1 = mapper.createObjectNode();
				startP1.put("tipo", "game" );
				startP1.put("pjR", pjM.get(p2));
				startP1.put("uNameR", uNamM.get(p2));
				System.out.println(startP1.toString());
				ObjectNode startP2 = mapper.createObjectNode();
				startP2.put("tipo", "game" );
				startP2.put("pjR", pjM.get(p1));
				startP2.put("uNameR", uNamM.get(p1));
				System.out.println(startP1.toString());
				
				sessions.get(p1).sendMessage(new TextMessage(startP1.toString()));
				sessions.get(p2).sendMessage(new TextMessage(startP2.toString()));
				
				player = 0;
				pjM.clear();
				uNamM.clear();
				
			}
		}else if(tipo.equals("Input")){
			
			sessions.get(partida.get(session.getId())).sendMessage(new TextMessage(message.getPayload()));
		}else if(tipo.equals("Power")){
			
			sessions.get(partida.get(session.getId())).sendMessage(new TextMessage(message.getPayload()));
		}
			
		
	}
	

}
