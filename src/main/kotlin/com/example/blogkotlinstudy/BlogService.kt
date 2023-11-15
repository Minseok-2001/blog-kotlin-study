package com.example.blogkotlinstudy

import org.springframework.stereotype.Service

@Service
class BlogService(private val blogRepository: BlogRepository) {
}
