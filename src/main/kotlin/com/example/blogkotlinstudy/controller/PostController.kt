package com.example.blogkotlinstudy.controller

import com.example.blogkotlinstudy.dto.PostDto
import com.example.blogkotlinstudy.service.PostService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@Tag(name = "예제 API", description = "Swagger 테스트용 API")
@RestController
@RequestMapping("/posts")
class PostController(private val postService: PostService) {


	@Operation(summary = "게시글 목록 조회")
	@GetMapping
	fun getPosts(): List<PostDto> {
		return (this.postService.getPosts())
	}

	@Operation(summary = "게시글 상세 조회")
	@Parameter(name = "postId", description = "게시글 ID", required = true)
	@GetMapping("/{postId}")
	fun getPost(@PathVariable postId: Long): ResponseEntity<Any> {
		return ResponseEntity.ok(this.postService.getPost(postId))
	}
}
