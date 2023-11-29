package com.example.blogkotlinstudy.service

import com.example.blogkotlinstudy.dto.PostDto
import com.example.blogkotlinstudy.entity.Post
import com.example.blogkotlinstudy.repository.PostRepository
import org.springframework.stereotype.Service


@Service
class PostService (
	private val postRepository: PostRepository,
) {

	fun getPosts(): List<PostDto> {
		return postRepository.findAll().map { post ->
			PostDto(
				id = post.id,
				title = post.title,
				content = post.content
			)
		}
	}


	fun getPost(postId: Long): Post {
		return postRepository.findById(postId).orElseThrow()
	}

}



