package com.example.Transaction.service;

import com.example.Transaction.Entities.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {


    HashMap<String , User> userHashMap = new HashMap<>();

    public String createUser(User user){

        if(userHashMap.containsKey(user.getPhoneNumber())){
            return "user already created";
        }

        detailsOfHashMap();

        userHashMap.put(user.getPhoneNumber() , user);
        return "user created successfully";


    }


    public void detailsOfHashMap(){
        for( Map.Entry<String,User> entry : userHashMap.entrySet()){
            System.out.println(entry.getKey());
            User user = entry.getValue();
            System.out.println(user.getPhoneNumber());
            System.out.println(user.getUserName());
            System.out.println(user.getEmailAddress());

        }
    }
}
