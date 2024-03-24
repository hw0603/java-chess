package domain.strategy;

import domain.position.Position;

import java.util.Set;

@FunctionalInterface
public interface MoveStrategy {
    boolean isMovable(Position source, Position destination, Set<Position> otherPiecesPosition);
}
