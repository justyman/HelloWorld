package com.home.sample;

import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
        
        SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/")
    String home(){
    	return "Hello World!";
    }
    
    @RequestMapping("/getNow")
    String getNow(){
    	return "Now the time is " + new Timestamp(System.currentTimeMillis());
    }
}
