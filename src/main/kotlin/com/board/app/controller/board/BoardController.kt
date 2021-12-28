package com.board.app.controller.board

import com.board.app.controller.board.model.BoardRequest
import com.board.app.controller.board.model.BoardResponse
import com.board.app.service.board.BoardService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("board")
class BoardController(
    private val boardService: BoardService,
) {
    @PostMapping("create")
    fun createBoard(
        @RequestBody boardRequest: BoardRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.ok().body(
            boardService.createBoard(
                boardRequest.toModel()
            )
        )
    }

    @GetMapping("")
    fun getAll(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(
            boardService.getAll()
        )
    }

    @GetMapping("{id}")
    fun getBoardDetail(
        @PathVariable("id") id: Long,
    ): ResponseEntity<BoardResponse> {
        return ResponseEntity.ok().body(
            BoardResponse.by(
                boardService.getBoardDetail(id)
            )
        )
    }

}
