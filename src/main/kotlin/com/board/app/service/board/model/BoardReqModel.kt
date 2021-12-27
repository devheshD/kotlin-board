package com.board.app.service.board.model

import com.board.app.repository.board.entity.Board
import java.time.LocalDateTime

class BoardReqModel(
    val name: String,
    val title: String,
    val content: String,
    val registDate: LocalDateTime = LocalDateTime.now()
) {
    fun toEntity() = Board(
        name = name,
        title = title,
        content = content,
        registerDate = registDate
    )
}
