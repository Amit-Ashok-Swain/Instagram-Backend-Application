package com.project.application.InstagramBackend.Repository;

import com.project.application.InstagramBackend.Model.Admin;
import com.project.application.InstagramBackend.Model.Like;
import com.project.application.InstagramBackend.Model.Post;
import com.project.application.InstagramBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}