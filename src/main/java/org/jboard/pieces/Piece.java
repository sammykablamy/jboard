package org.jboard.pieces;

import org.jboard.Alliance;
import org.jboard.board.Board;
import org.jboard.board.Move;

import java.util.List;

public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }
    public abstract List<Move> calculateLegalMoves(final Board board);



}
