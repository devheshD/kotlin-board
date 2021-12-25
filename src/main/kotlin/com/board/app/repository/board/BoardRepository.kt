package com.board.app.repository.board

import com.board.app.repository.board.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author Rasung Ki
 */
interface BoardRepository : JpaRepository<Board, Long>
