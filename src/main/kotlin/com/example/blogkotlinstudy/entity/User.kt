package com.example.blogkotlinstudy.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(nullable = false)
        var username: String,

        @Column(nullable = false)
        var email: String,

        @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], orphanRemoval = true)
        var posts: MutableList<Post> = mutableListOf()
)
