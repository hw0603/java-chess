package domain;

import static domain.position.UnitVector.DOWN;
import static domain.position.UnitVector.DOWN_LEFT;
import static domain.position.UnitVector.DOWN_RIGHT;
import static domain.position.UnitVector.LEFT;
import static domain.position.UnitVector.RIGHT;
import static domain.position.UnitVector.UP;
import static domain.position.UnitVector.UP_LEFT;
import static domain.position.UnitVector.UP_RIGHT;

import domain.game.TeamColor;
import domain.position.File;
import domain.position.Position;
import domain.position.Rank;
import domain.position.UnitVector;
import domain.strategy.ContinuousMoveStrategy;
import domain.strategy.KnightMoveStrategy;
import domain.strategy.MoveStrategy;
import domain.strategy.PawnMoveStrategy;
import java.util.Set;

@SuppressWarnings("unused")
public class Fixture {
    private Fixture() {
    }

    public static class Positions {
        public static final Position A1 = new Position(File.A, Rank.ONE);
        public static final Position A2 = new Position(File.A, Rank.TWO);
        public static final Position A3 = new Position(File.A, Rank.THREE);
        public static final Position A4 = new Position(File.A, Rank.FOUR);
        public static final Position A5 = new Position(File.A, Rank.FIVE);
        public static final Position A6 = new Position(File.A, Rank.SIX);
        public static final Position A7 = new Position(File.A, Rank.SEVEN);
        public static final Position A8 = new Position(File.A, Rank.EIGHT);

        public static final Position B1 = new Position(File.B, Rank.ONE);
        public static final Position B2 = new Position(File.B, Rank.TWO);
        public static final Position B3 = new Position(File.B, Rank.THREE);
        public static final Position B4 = new Position(File.B, Rank.FOUR);
        public static final Position B5 = new Position(File.B, Rank.FIVE);
        public static final Position B6 = new Position(File.B, Rank.SIX);
        public static final Position B7 = new Position(File.B, Rank.SEVEN);
        public static final Position B8 = new Position(File.B, Rank.EIGHT);

        public static final Position C1 = new Position(File.C, Rank.ONE);
        public static final Position C2 = new Position(File.C, Rank.TWO);
        public static final Position C3 = new Position(File.C, Rank.THREE);
        public static final Position C4 = new Position(File.C, Rank.FOUR);
        public static final Position C5 = new Position(File.C, Rank.FIVE);
        public static final Position C6 = new Position(File.C, Rank.SIX);
        public static final Position C7 = new Position(File.C, Rank.SEVEN);
        public static final Position C8 = new Position(File.C, Rank.EIGHT);

        public static final Position D1 = new Position(File.D, Rank.ONE);
        public static final Position D2 = new Position(File.D, Rank.TWO);
        public static final Position D3 = new Position(File.D, Rank.THREE);
        public static final Position D4 = new Position(File.D, Rank.FOUR);
        public static final Position D5 = new Position(File.D, Rank.FIVE);
        public static final Position D6 = new Position(File.D, Rank.SIX);
        public static final Position D7 = new Position(File.D, Rank.SEVEN);
        public static final Position D8 = new Position(File.D, Rank.EIGHT);

        public static final Position E1 = new Position(File.E, Rank.ONE);
        public static final Position E2 = new Position(File.E, Rank.TWO);
        public static final Position E3 = new Position(File.E, Rank.THREE);
        public static final Position E4 = new Position(File.E, Rank.FOUR);
        public static final Position E5 = new Position(File.E, Rank.FIVE);
        public static final Position E6 = new Position(File.E, Rank.SIX);
        public static final Position E7 = new Position(File.E, Rank.SEVEN);
        public static final Position E8 = new Position(File.E, Rank.EIGHT);

        public static final Position F1 = new Position(File.F, Rank.ONE);
        public static final Position F2 = new Position(File.F, Rank.TWO);
        public static final Position F3 = new Position(File.F, Rank.THREE);
        public static final Position F4 = new Position(File.F, Rank.FOUR);
        public static final Position F5 = new Position(File.F, Rank.FIVE);
        public static final Position F6 = new Position(File.F, Rank.SIX);
        public static final Position F7 = new Position(File.F, Rank.SEVEN);
        public static final Position F8 = new Position(File.F, Rank.EIGHT);

        public static final Position G1 = new Position(File.G, Rank.ONE);
        public static final Position G2 = new Position(File.G, Rank.TWO);
        public static final Position G3 = new Position(File.G, Rank.THREE);
        public static final Position G4 = new Position(File.G, Rank.FOUR);
        public static final Position G5 = new Position(File.G, Rank.FIVE);
        public static final Position G6 = new Position(File.G, Rank.SIX);
        public static final Position G7 = new Position(File.G, Rank.SEVEN);
        public static final Position G8 = new Position(File.G, Rank.EIGHT);

        public static final Position H1 = new Position(File.H, Rank.ONE);
        public static final Position H2 = new Position(File.H, Rank.TWO);
        public static final Position H3 = new Position(File.H, Rank.THREE);
        public static final Position H4 = new Position(File.H, Rank.FOUR);
        public static final Position H5 = new Position(File.H, Rank.FIVE);
        public static final Position H6 = new Position(File.H, Rank.SIX);
        public static final Position H7 = new Position(File.H, Rank.SEVEN);
        public static final Position H8 = new Position(File.H, Rank.EIGHT);

    }

    public static class Vectors {
        public static final Set<UnitVector> ORTHOGONAL_VECTORS = Set.of(UP, RIGHT, DOWN, LEFT);
        public static final Set<UnitVector> DIAGONAL_VECTORS = Set.of(UP_RIGHT, DOWN_RIGHT, DOWN_LEFT, UP_LEFT);
        public static final Set<UnitVector> OMNIDIRECTIONAL_VECTORS = Set.of(UP, RIGHT, DOWN, LEFT, UP_RIGHT, DOWN_RIGHT, DOWN_LEFT, UP_LEFT);
    }

    public static class Strategies {
        public static final MoveStrategy KING_MOVE_STRATEGY = new ContinuousMoveStrategy(Vectors.OMNIDIRECTIONAL_VECTORS, 1);
        public static final MoveStrategy QUEEN_MOVE_STRATEGY = new ContinuousMoveStrategy(Vectors.OMNIDIRECTIONAL_VECTORS, 8);
        public static final MoveStrategy BISHOP_MOVE_STRATEGY = new ContinuousMoveStrategy(Vectors.DIAGONAL_VECTORS, 8);
        public static final MoveStrategy ROOK_MOVE_STRATEGY = new ContinuousMoveStrategy(Vectors.ORTHOGONAL_VECTORS, 8);
        public static final MoveStrategy KNIGHT_MOVE_STRATEGY = new KnightMoveStrategy();
        public static final MoveStrategy WHITE_PAWN_MOVE_STRATEGY = new PawnMoveStrategy(TeamColor.WHITE);
        public static final MoveStrategy BLACK_PAWN_MOVE_STRATEGY = new PawnMoveStrategy(TeamColor.BLACK);
    }
}