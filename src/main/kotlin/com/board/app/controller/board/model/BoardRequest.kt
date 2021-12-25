package com.board.app.controller.board.model

import com.board.app.service.board.model.BoardReqModel
import java.time.LocalDateTime

/**
 * @author Rasung Ki
 */
data class BoardRequest(
    private val name: String,
    private val title: String,
    private val content: String,
    private val registDate: LocalDateTime = LocalDateTime.now(),
) {
    fun toModel() = BoardReqModel(
        name = name,
        title = title,
        content = content,
        registDate = registDate,
    )
}
