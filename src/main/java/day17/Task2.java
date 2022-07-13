package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPieces = {
                {ChessPiece.ROOK_BLACK, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMRTY},
                {ChessPiece.EMRTY, ChessPiece.ROOK_WHITE, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMRTY, ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMRTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.PAWN_BLACK, ChessPiece.EMRTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY},
                {ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY},
                {ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMRTY, ChessPiece.EMRTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMRTY, ChessPiece.PAWN_WHITE, ChessPiece.EMRTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.EMRTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMRTY}
        };

        ChessBoard chessBoard = new ChessBoard(chessPieces);

        chessBoard.print(chessBoard);
    }
}
