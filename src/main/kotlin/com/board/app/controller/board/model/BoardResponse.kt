package com.board.app.controller.board.model

import com.board.app.repository.board.entity.Board
import java.time.LocalDateTime

data class BoardResponse(
    val id: Long,
    val name: String,
    val title: String,
    val content: String,
    val registDate: LocalDateTime,
) {
    companion object {
        fun by(board: Board): BoardResponse {
            return with(board) {
                BoardResponse(
                    id = this.id,
                    name = this.name,
                    title = this.title,
                    content = this.content,
                    registDate = this.registerDate,
                )
            }
        }
    }
}
