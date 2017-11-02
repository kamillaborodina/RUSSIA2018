import java.util.Date;

public interface PresidentCandidate {
    String declareParticipation() throws InterruptedException;
    void startCampaign() throws InterruptedException;
    String stateFinalSpeech() throws InterruptedException;
    Date getDeclarationDate();
    int getFunds();

}
