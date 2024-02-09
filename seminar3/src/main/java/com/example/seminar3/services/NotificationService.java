package com.example.seminar3.services;


import org.springframework.stereotype.Service;
import com.example.seminar3.domain.User;

@Service
public class NotificationService {
    public void showMessage(String message){
        System.out.println(message);
    }

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
