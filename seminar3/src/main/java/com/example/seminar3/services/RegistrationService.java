package com.example.seminar3.services;

import com.example.seminar3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserService userService;
    private NotificationService notificationService;
    public RegistrationService(UserService userService, NotificationService notificationService){
        this.userService = userService;
        this.notificationService = notificationService;
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    public void processRegistration(String name, int age){
        User user = new User();
        userService.addUser(user);
        notificationService.showMessage("Пользователь добавлен: " + user.getName());
    }
}
