package com.grobster.game {
	sealed trait Square
	case object O extends Square // represents a square containing an O on the tic tac toe board
	case object X extends Square // represents a square containing an X on the tic tac toe board
	case object E extends Square // represents an empty square on the tic tac toe board
	
	//case class Square(isOccupied: Boolean)
	
	case class Player(name: String, xOrO: Square)
	
	class Game(player1: Player, player2: Player) {
		val playerToMove: Player = player1 // change possibly
		
		
		//keep track of player's turn
		// keep track of what squares are occupied by what piece
		// declare eval board
		
		def setupBoard(column: Int, row: Int) = Array.fill[Square](column,row) { E } // creates board and gives each square an initial value of E for empty
		
		def placeOnSquare(player: Player, board: Array[Array[Square]], row: Int, column: Int) = { // allows player to put either an X or O onto any E square
			if(board(row)(column) == E) board(row)(column) = player.xOrO
		}
	
	}
	
	object Game {
		def main(args: Array[String]): Unit = {
			val player1 = Player("Jeffery", O)
			val player2 = Player("John Doe", X)
			val game1 = new Game(player1, player2)
			val board = game1.setupBoard(3,3)
			println(board.toString) //debug
			println(player1.xOrO)
			println("square: " + board(2)(0))
			val nb = board(1)(0) = X
			println("square new: " + board(1)(0))
			println("new board starting square: " + board(0)(0))
			board(1)(1) = O
			println(board(1)(1))
		}
	}
}