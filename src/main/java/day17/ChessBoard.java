package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public ChessPiece[][] getChessPieces() {
        return chessPieces;
    }

    public void print(ChessBoard s) {
        for (int i = 0; i<chessPieces.length; i++) {
            for (int j=0; j<chessPieces.length; j++) {
                System.out.print(chessPieces[i][j].getStringNnotation());
            }
            System.out.println();
        }
    }
}
