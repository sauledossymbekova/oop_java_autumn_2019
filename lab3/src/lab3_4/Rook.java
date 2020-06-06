package lab3_4;

public class Rook extends Piece{
    Rook(int x1, int y1) {
        super(x1, y1);
    }

    @Override
    public boolean isLegalMove(int x2, int y2) {
        return (x1 == x2) || (y1 == y2);
    }
}
