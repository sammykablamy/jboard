package org.jboard.pieces;

import org.jboard.Alliance;
import org.jboard.board.Board;
import org.jboard.board.BoardUtils;
import org.jboard.board.Move;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pawn extends Piece{

    private final static int[] CANDIDATE_MOVE_COORDINATE = {8};
    public Pawn(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {

        final List<Move> legalMoves = new ArrayList<>();

        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE) {

            int candidateDestination = this.piecePosition + (this.getPieceAlliance().getDirection() * currentCandidateOffset);

            if(!BoardUtils.isValidTileCoordinate(candidateDestination)) {
                continue;
            }

            if(currentCandidateOffset == 8 && !board.getTile(candidateDestination).isTileOccupied()) {
                //TODO placeholder Move for now; gonna make a PawnMove
                legalMoves.add(new Move.MajorMove(board, this, candidateDestination));
            }

        }

        return legalMoves;
    }
}
