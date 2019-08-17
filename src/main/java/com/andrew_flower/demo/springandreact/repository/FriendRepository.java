package com.andrew_flower.demo.springandreact.repository;

import com.andrew_flower.demo.springandreact.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendRepository extends CrudRepository<Friend, Long> {
}