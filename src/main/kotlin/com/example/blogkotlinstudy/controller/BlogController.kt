package com.example.blogkotlinstudy

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/blogs")
class BlogController(private val blogService: BlogService) {
}
