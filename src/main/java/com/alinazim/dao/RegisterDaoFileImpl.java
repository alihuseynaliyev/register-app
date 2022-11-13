package com.alinazim.dao;

import com.alinazim.dao.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RegisterDaoListImpl implements RegisterDao{

    private static final List<UserEntity> USERS = new ArrayList<>(
            Arrays.asList(
                    new UserEntity(24, "Ali", "alinazim@gmail.com", "123"),
                    new UserEntity(20, "Ali2", "alinazim@gmail.com", "123")
            )
    );

    public Optional<UserEntity> findByEmail(String email) {
        return USERS.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public UserEntity addUser(UserEntity newUserEntity) {
        newUserEntity.setId((long) (Math.random() * 1000));
        newUserEntity.setCreateDate(LocalDateTime.now());
        newUserEntity.setUpdateDate(LocalDateTime.now());
        USERS.add(newUserEntity);
        USERS.forEach(System.err::println);
        return newUserEntity;
    }
}
