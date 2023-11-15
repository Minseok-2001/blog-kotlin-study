package com.example.blogkotlinstudy.entity

import jakarta.persistence.*

@Entity
class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(nullable = false)
        var title: String,

        @Column(nullable = false, length = 5000)
        var content: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        var author: User,

        @OneToMany(mappedBy = "post", cascade = [CascadeType.ALL], orphanRemoval = true)
        var comments: List<Comment> = mutableListOf()
)
