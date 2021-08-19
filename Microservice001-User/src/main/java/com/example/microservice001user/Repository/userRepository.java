package com.example.microservice001user.Repository;

import com.example.microservice001user.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
    User findByuserID(int userID);
}
