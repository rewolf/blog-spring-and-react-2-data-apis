package com.andrew_flower.demo.springandreact.controller;

import com.andrew_flower.demo.springandreact.model.Friend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class FriendController {

    @GetMapping
    List<Friend> list() {
        return Arrays.asList(
                Friend.builder().name("Andrew").build()
        );
    }
}
