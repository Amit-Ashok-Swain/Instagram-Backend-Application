package com.project.application.InstagramBackend.Repository;

import com.project.application.InstagramBackend.Model.Admin;
import com.project.application.InstagramBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}