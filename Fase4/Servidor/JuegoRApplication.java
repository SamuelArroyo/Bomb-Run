package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@SpringBootApplication
@EnableWebSocket
public class JuegoRApplication implements WebSocketConfigurer {
@Override
public void registerWebSocketHandlers(
WebSocketHandlerRegistry registry) {
registry.addHandler(multiHandler(), "/multi").setAllowedOrigins("*");
}
@Bean
public MultiHandler multiHandler() {
return new MultiHandler();
}
public static void main(String[] args) {
	SpringApplication.run(JuegoRApplication.class, args);
}

}