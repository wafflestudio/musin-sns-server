package com.wafflestudio.msns.domain.post.repository

import com.wafflestudio.msns.domain.post.model.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional
import java.util.UUID

interface PostRepository : JpaRepository<Post, UUID?>, PostCustomRepository {
    fun findPostById(id: UUID): Post?

    fun countByUser_Id(userId: UUID): Long
}
