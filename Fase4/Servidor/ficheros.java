package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class ficheros {
	public void guardarUsers(List<Player> u) 
	{
		try 
		{
		PrintStream flujo;
		flujo = new PrintStream(new FileOutputStream("users.txt"));
		for (int i = 0; i<u.size();i++) 
		{			
			flujo.println(u.get(i));
		}
		}catch(FileNotFoundException e)
		{
			System.out.println("Fichero no encontrado");
		}catch(IOException exc)
		{
			System.out.println("Excepcion");
		}
	}
}
