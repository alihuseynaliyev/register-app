package com.alinazim.dao;

import com.alinazim.dao.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RegisterDaoFileImpl implements RegisterDao {

    public Optional<UserEntity> findByEmail(String email) {
        return Optional.empty();
    }

    public UserEntity addUser(UserEntity newUserEntity) {
        return null;
    }
}
