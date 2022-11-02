package ru.netology.coroutines.dto

data class PostWithCommentsAndAuthors (
    val post: Post,
    val comments: List<Comment>,
    val authors: Author,
    val authorsOfComment: List<AuthorsOfComment>
        )