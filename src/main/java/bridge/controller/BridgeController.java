package bridge.controller;

import bridge.service.BridgeGame;
import bridge.service.BridgeMaker;
import bridge.view.InputView;
import bridge.view.OutputView;

import java.util.List;

public class BridgeController {

    private final InputView inputView;
    private final OutputView outputView;
    private final BridgeMaker bridgeMaker;
    public BridgeController(InputView inputView, OutputView outputView, BridgeMaker bridgeMaker) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.bridgeMaker = bridgeMaker;
    }

    public void run() {
        BridgeGame game = initGame();


    }

    public BridgeGame initGame() {
        outputView.printGameStartMsg();

        outputView.printInputBridgeSizeMsg();
        int bridgeSize = inputView.readBridgeSize(3, 20);

        List<String> bridge = bridgeMaker.makeBridge(bridgeSize);

        return new BridgeGame(bridge);
    }
}
