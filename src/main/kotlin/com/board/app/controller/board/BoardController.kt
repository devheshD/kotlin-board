package com.board.app.controller.board

import com.board.app.controller.board.model.BoardRequest
import com.board.app.service.board.BoardService
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.function.ServerResponse

/**
 * @author Rasung Ki
 */
@RestController
@RequestMapping("/board")
class BoardController(
    private val boardService: BoardService,
) {
    @PostMapping("/create")
    fun createBoard(
        @RequestBody boardRequest: BoardRequest
    ): ServerResponse {
        return ServerResponse.ok().body(
            boardService.createBoard(boardRequest.toModel())
        )
    }

}
