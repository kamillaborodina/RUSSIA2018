import java.util.Date;

public class Zyuganov implements PresidentCandidate, ForeverTheSecondBest {

    private int popularity;
    private int relevance; //актуальность кандидата
    private int funds;
    private boolean dead;
    private int sleeptime;

    public Zyuganov() throws InterruptedException {
        sleeptime = 3000;
        this.popularity = 7;
        this.relevance = 0;
        funds = - 1;
        System.out.print(declareParticipation());
    }

    @Override
    public String revealTheTruth() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Зюганов: Я всегда был вторым, и на этих выборах я уже точно не стану первым\n" +
                "Но я иду, сам не знаю, зачем\n";
    }

    @Override
    public String declareParticipation() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Зюганов: Превращать выборы в посмешище стыдно\n" +
                "Но у нас не настоящие выборы, так что я выдвигаюсь\n";
    }

    @Override
    public void startCampaign() {
            dead = false;
    }

    @Override
    public String stateFinalSpeech() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Зюганов: Я даже не написал речь на случай победы, а вот на случай поражения можно достать речь с начала 90-х," +
                " все равно никто не заметит подмены\n";
    }

    @Override
    public Date getDeclarationDate() {
        return null;
    }

    @Override
    public int getFunds() {
        return funds;
    }
}
