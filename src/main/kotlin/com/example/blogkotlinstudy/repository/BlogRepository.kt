package com.example.blogkotlinstudy.repository

import com.example.blogkotlinstudy.entity.Comment
import com.example.blogkotlinstudy.entity.Post
import com.example.blogkotlinstudy.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>
interface CommentRepository : JpaRepository<Comment, Long>
interface UserRepository : JpaRepository<User, Long>
