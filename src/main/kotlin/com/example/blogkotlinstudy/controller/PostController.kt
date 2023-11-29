package com.example.blogkotlinstudy.controller

import com.example.blogkotlinstudy.dto.PostDto
import com.example.blogkotlinstudy.service.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/posts")
class PostController(private val postService: PostService) {


	@GetMapping
	fun getPosts(): List<PostDto> {
		return (this.postService.getPosts())
	}

	@GetMapping("/{postId}")
	fun getPost(@PathVariable postId: Long): ResponseEntity<Any> {
		return ResponseEntity.ok(this.postService.getPost(postId))
	}
}
