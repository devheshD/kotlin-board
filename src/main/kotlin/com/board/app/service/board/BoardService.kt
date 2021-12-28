package com.board.app.service.board

import com.board.app.common.exception.BoardNotFoundException
import com.board.app.repository.board.BoardRepository
import com.board.app.repository.board.entity.Board
import com.board.app.service.board.model.BoardReqModel
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun createBoard(boardModel: BoardReqModel) {
        boardRepository.save(boardModel.toEntity())
    }

    fun getAll(): List<Board> {
        return boardRepository.findAll()
    }

    fun getBoardDetail(id: Long): Board {
        return boardRepository.findBoardById(id).let {
            it ?: throw BoardNotFoundException()
        }
    }
}
