import java.util.Date;

public class Zhirik implements PresidentCandidate, DudGuest {

    private boolean tellsTruth;
    private int jokeStat;
    private Date declarationDate;
    private int funds;
    private int sleeptime;

    public Zhirik() throws InterruptedException {
        sleeptime = 3000;
        this.tellsTruth = false;
        this.jokeStat = 0;
        System.out.println(declareParticipation());
        funds = 7800000;
        declarationDate = new Date(2017, 8, 21);
    }

    @Override
    public String answerOddQuestion() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Жириновский: В ЛДПР геев нету.\n";
    }

    @Override
    public String declareParticipation() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Жириновский: Я обязательно буду баллотироваться на выборах в марте 2018 года\n";
    }

    @Override
    public void startCampaign() {
        jokeStat+=1;
    }

    @Override
    public String stateFinalSpeech() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Жириновский: Владимир Владимирович, я от души поздравляю вас с победой!\n";
    }

    @Override
    public Date getDeclarationDate() {
        return declarationDate;
    }

    @Override
    public int getFunds() {
        return funds;
    }
}
