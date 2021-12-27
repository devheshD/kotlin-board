package com.board.app.service.board

import com.board.app.repository.board.BoardRepository
import com.board.app.repository.board.entity.Board
import com.board.app.service.board.model.BoardReqModel
import org.springframework.stereotype.Service
import java.util.*

@Service
class BoardService(
    private val boardRepository: BoardRepository,
) {
    fun createBoard(boardModel: BoardReqModel) {
        boardRepository.save(boardModel.toEntity())
    }

    fun getAll(): List<Board> {
        return boardRepository.findAll()
    }

    fun getBoardDetail(id: Long): Board {
        return boardRepository.findBoardById(id)
    }
}
