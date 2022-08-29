package com.example.messageapp.service;

import com.example.messageapp.entity.Entity;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getService(Entity entity) {
     String response=entity.getFirstName()+" "+entity.getLastName();
     return response;
    }

    public String getGreet(String name) {
        return "<h1><font color=pink>Hello World "+name+" !</font></h1>";
    }
}
