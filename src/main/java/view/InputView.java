package view;

import domain.GameCommand;
import domain.position.Position;
import dto.RequestDto;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputView {
    private static final String START_COMMAND = "start";
    private static final String MOVE_COMMAND = "move";
    private static final String STATUS_COMMAND = "status";
    private static final String END_COMMAND = "end";
    private static final Map<String, GameCommand> gameCommands = Map.of(
            START_COMMAND, GameCommand.START,
            MOVE_COMMAND, GameCommand.MOVE,
            STATUS_COMMAND, GameCommand.STATUS,
            END_COMMAND, GameCommand.END
    );

    private final Scanner sc = new Scanner(System.in);

    public GameCommand inputGameStart() {
        String input = sc.nextLine();
        if (!gameCommands.containsKey(input)) {
            throw new IllegalArgumentException("잘못된 명령입니다.");
        }
        return gameCommands.get(input);
    }

    public RequestDto inputGameCommand() {
        List<String> input = Arrays.stream(sc.nextLine().split(" ")).toList();
        String commandType = input.get(0);

        if (!gameCommands.containsKey(commandType)) {
            throw new IllegalArgumentException("유효하지 않은 명령입니다.");
        }
        GameCommand command = gameCommands.get(commandType);

        if (input.size() == 3) {
            return createRequestDtoFromInput(input, command);
        }
        return RequestDto.of(command);
    }

    private RequestDto createRequestDtoFromInput(List<String> input, GameCommand command) {
        String sourcePosition = input.get(1);
        String destinationPosition = input.get(2);
        Position source = PositionConvertor.convertPosition(sourcePosition);
        Position destination = PositionConvertor.convertPosition(destinationPosition);

        return RequestDto.of(command, source, destination);
    }
}
