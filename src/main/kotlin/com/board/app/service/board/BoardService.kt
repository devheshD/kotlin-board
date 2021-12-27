package com.board.app.service.board

import com.board.app.repository.board.BoardRepository
import com.board.app.repository.board.entity.Board
import com.board.app.service.board.model.BoardReqModel
import org.springframework.stereotype.Service

/**
 * @author Rasung Ki
 */
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
}
