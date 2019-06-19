package com.example.demo;

import java.util.Date;
import org.springframework.data.annotation.Id;


public class MyDataMongo {
	@Id
	
	private String id;
 	
	private String name;
	private String number;
	private String java;
	private String springboot;
	private String database;
	private Date date;
	
	public MyDataMongo(String name, String number) 
	{
        super();
        this.name = name;
        this.name = number;
        this.name = java;
        this.name = springboot;
        this.name = database;
        this.date = new Date();
	}
   
    public String getName() 
    {
        return name;
    }
    public String getNumber() 
    {
        return number;
    }
    public String getJava() 
    {
        return java;
    }
    public String getSpringboot() 
    {
        return springboot;
    }
    public String getDatabase() 
    {
        return database;
    }	
    public Date getDate() 
    {
        return date;
    }
}