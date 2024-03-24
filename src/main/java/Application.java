import controller.ChessController;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ChessController chessController = new ChessController(inputView, outputView);

        chessController.run();
    }
}
