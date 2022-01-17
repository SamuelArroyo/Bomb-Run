package com.example.demo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PlayerRestController {
	private List<Player> users = new ArrayList<Player>();
	@PostConstruct
	public void crear(){
		/*Player a = new Player("jorge","dmc3");
		Player b = new Player("jordan","botw");
		Player c = new Player("javi","er");
		Player d = new Player("alex","apex");
		Player e = new Player("karu","furry");
		Player f = new Player("cesar","sf2");
		a.setPunt(115);
		a.setHpunt();
		b.setPunt(250);
		b.setHpunt();
		c.setPunt(420);
		c.setHpunt();
		d.setPunt(69);
		d.setHpunt();
		e.setPunt(13);
		e.setHpunt();
		f.setPunt(5);
		f.setHpunt();
		addUser(a);
		addUser(b);
		addUser(c);
		addUser(d);
		addUser(e);
		addUser(f);*/
		
		//guardarUsers();
		cargarUsers();
	}
	
	@PostMapping(value = "/users")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Boolean> addUser (@RequestBody Player i ){
		users.add(i);
		guardarUsers();
		return new ResponseEntity<>(true, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<Player> getUsers() {
		return users;
	}
	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public List<Player> getHscore() {
		return users;
	}
	@PutMapping(value = "/score")
	public ResponseEntity<Boolean> updatePunts(@RequestBody Player o){
		//Revisar!!!
		boolean found = false;
		int indice = -1;
		for (int i = 0; i<users.size();i++) 
		{			
			if (o.getuName().equals(users.get(i).getuName())) 
			{
				found = true;
				indice = i;
			}
		}
		if (found) 
		{
			users.get(indice).setPunt(o.getPunt()) ;
			users.get(indice).setHpunt();
			return new ResponseEntity<>(true,HttpStatus.OK);
		}else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping(value = "/registro")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Boolean> regisUser(@RequestBody Player o) {
		boolean isAlready = false;
		for (int i = 0; i<users.size();i++) 
		{			
			if (o.getuName().equals(users.get(i).getuName())) 
			{
				isAlready = true;
				//break;
			}
		}
		if (isAlready) 
		{
			return new ResponseEntity<>(true,HttpStatus.FORBIDDEN);
		}else 
		{
			users.add(o);
			guardarUsers();
			return new ResponseEntity<>(true,HttpStatus.CREATED);
		}
	}
	@PostMapping(value = "/login")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Boolean> logUser(@RequestBody Player o) {
		boolean isAlready = false;
		for (int i = 0; i<users.size();i++) 
		{			
			if (o.getuName().equals(users.get(i).getuName())&&o.getPw().equals(users.get(i).getPw())) 
			{
				isAlready = true;
				//break;
			}
		}
		if (isAlready) 
		{		
			return new ResponseEntity<>(false,HttpStatus.CREATED);
		}else 
		{
			return new ResponseEntity<>(false,HttpStatus.FORBIDDEN);
			
		}
	}
	public void guardarUsers() 
	{
		try 
		{
		FileOutputStream flujo = new FileOutputStream("users.txt") ;
		ObjectOutputStream so = new ObjectOutputStream(flujo);
		for (int i = 0; i<users.size();i++) 
		{			
			so.writeObject(users.get(i));
			
		}
		so.close();
		flujo.close();
		
		}catch(FileNotFoundException e)
		{
			System.out.println("Fichero no encontrado");
		}catch(IOException exc)
		{
			System.out.println("Excepcion A");
			exc.printStackTrace();
		}
		
	}
	
	public void cargarUsers() 
	{
		try 
		{
		FileInputStream flujo = new FileInputStream("users.txt") ;
		ObjectInputStream in = new ObjectInputStream(flujo);
		while(true) 
		{
			try 
			{
				users.add((Player) in.readObject());
			}catch(EOFException e) 
			{
				break;
			}catch(ClassNotFoundException e) 
			{
				break;
			}
		}
		in.close();
		flujo.close();
		
		}catch(FileNotFoundException e)
		{
			System.out.println("Fichero no encontrado");
		}catch(IOException exc)
		{
			System.out.println("Excepcion A");
			exc.printStackTrace();
		}
		
	}
		
		
}
	

