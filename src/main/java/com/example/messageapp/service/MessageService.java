package com.example.messageapp.service;

import com.example.messageapp.entity.Model;
import com.example.messageapp.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    MessageRepo repo1;
    public String getService(Model entity) {
        repo1.save(entity);
     String response=entity.getFirstName()+" "+entity.getLastName();
     return response;
    }

    public String getGreet(String name) {
        return "<h1><font color=pink>Hello World "+name+" !</font></h1>";
    }

    public String getCondition(String first, String last) {
        if (first.isEmpty() && last.isEmpty())
        {
            return "<h1><font color=brown style=italic>Hello World!!!</font></h1>";
        }
        else if (first.isEmpty() && !last.isEmpty()){
            return "<h1><font color=brown style=italic>Hello "+last+" !!!</font></h1>";
        }
        else if ((!first.isEmpty() && last.isEmpty())){
            return "<h1><font color=brown style=italic>Hello "+first+"!!!</font></h1>";
        }
        else return "<h1><font color=brown style=italic>Hello "+first+" "+last+" !!!</font></h1>";
    }

    public Optional<Model> findById(int id) {
        return repo1.findById(id);

    }
}
