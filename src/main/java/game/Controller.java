package game;

import engine.ABCGTSolver;
import engine.OutcomeType;

public class Controller {

	public static void main(String[] args) {
		Board board = new Board(4, 4, true);

//		Board board = new Board(new Piece[][] {
//			{null, null, new Piece(0, 2, true), new Piece(0, 3, false)},
//			{new Piece(1, 0, false), null, null, null},
//			{new Piece(2, 0, true), null, null, new Piece(2, 3, false)},
//			{null, null, null, null}
//		});
		
		System.out.println(board.getBoardRepresentation());

//		CGTSolver solver = new CGTSolver();
//		AlphaBetaSolver solver = new AlphaBetaSolver();
		ABCGTSolver solver = new ABCGTSolver();

		OutcomeType result = solver.solve(board);
		
		System.out.println(result);
	}
}