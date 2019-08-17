package com.andrew_flower.demo.springandreact;

import com.andrew_flower.demo.springandreact.model.Friend;
import com.andrew_flower.demo.springandreact.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FriendFaker implements ApplicationRunner {
    @Autowired
    private FriendRepository friendRepository;

    @Override
    public void run(ApplicationArguments args) {
        friendRepository.save(
                Friend.builder().name("Andrew").build()
        );
    }
}
