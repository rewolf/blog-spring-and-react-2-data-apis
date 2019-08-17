package com.andrew_flower.demo.springandreact.controller;

import com.andrew_flower.demo.springandreact.model.Friend;
import com.andrew_flower.demo.springandreact.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friends")
public class FriendController {

    @Autowired
    private FriendRepository friendRepository;

    @GetMapping
    Iterable<Friend> list() {
        return friendRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Friend create(@RequestParam final String name) {
        return friendRepository.save(Friend.builder().name(name).build());
    }
}
