package com.example.seminar3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.seminar3.domain.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userRepository;

    public UserService() {
        userRepository = new ArrayList<>();
    }

    public void addUser(User user) {
        userRepository.add(user);
    }

    public List<User> getUsersByAge(int age) {
        // Реализация фильтрации пользователей по возрасту
        return null;
    }

    public int calculateAverageAge() {
        // Реализация вычисления среднего возраста пользователей
        return 0;
    }


    @Autowired
    private NotificationService notificationService;


    //    public UserService(NotificationService notificationService) {
    //        this.notificationService = notificationService;
    //    }

    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }
}
