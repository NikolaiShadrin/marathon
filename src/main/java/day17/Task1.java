package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = {
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
        };

        for (ChessPiece chessPiece: chessPieces)
            System.out.print(chessPiece.getStringNnotation());

    }
}