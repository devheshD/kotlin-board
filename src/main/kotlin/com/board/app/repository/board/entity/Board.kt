package com.board.app.repository.board.entity

import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author Rasung Ki
 */
@Entity
@Table(name = "board")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,

    val title: String,

    val content: String,

    @Column(name = "regist_date")
    val registerDate: LocalDateTime = LocalDateTime.now(),
)
