package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPostion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new  ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPostion source =  UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPostion target = UI.readChessPosition(sc);
			
			ChessPiece capterdPiece = chessMatch.performChessMove(source, target);
		}
	}

}
