package com.example.blogkotlinstudy

import org.springframework.data.jpa.repository.JpaRepository

interface BlogRepository : JpaRepository<Blog, Long>
