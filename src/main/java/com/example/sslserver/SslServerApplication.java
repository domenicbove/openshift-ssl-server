package com.example.sslserver;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(SslServerApplication.class, args);
    }
    
}

@RestController
class SecuredServerController {
    
    @RequestMapping("/secured")
    public String secured(){
	System.out.println("Inside secured()");
	return "Hello user !!! : " + new Date();
    }
    
}

