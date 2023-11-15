package com.example.blogkotlinstudy

import javax.persistence.*

@Entity
class Blog(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(nullable = false)
        var title: String,

        @Column(nullable = false)
        var content: String
)
