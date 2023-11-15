package com.example.blogkotlinstudy.service

import com.example.blogkotlinstudy.entity.Post
import com.example.blogkotlinstudy.repository.PostRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service


@Service
class PostService (
	private val postRepository: PostRepository,
) {

	@Transactional
	fun getPosts(): List<Post> {
		return this.postRepository.findAll()
	}

	fun getPost(postId: Long): Post {
		return postRepository.findById(postId).orElseThrow()
	}

}



