package it.polimi.ingsw.view;

import it.polimi.ingsw.model.Game;

public interface View {
    void askNickname();
    void askCreateOrJoin();
    void askGameInfo();
    void askGameNumber();
    void askWizardID();
    void askAssistantCard();
    void askMoveStudent();
    void askMotherNatureSteps();
    void askCloud();
    void askCharacterCard();
    void askAction();
    void showGenericMessage(String message);
    void showGameStatusFirstActionPhase(Game game);
    void showGameStatus(Game game);
    void showDeck(Game game);
}
