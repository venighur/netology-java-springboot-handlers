package ru.netology.authdemo.repositories;

import org.springframework.stereotype.Repository;
import ru.netology.authdemo.enums.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("user1") && password.equals("pass")) {
            authorities.add(Authorities.READ);
        }
        return authorities;
    }
}
