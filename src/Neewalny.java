import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Neewalny implements PresidentCandidate, SelfNominee, Opposition, Convicted, DudGuest {


    private Date declarationDate;
    private boolean active;
    private int funds;
    private List<String> meetings;
    private int sleeptime;


    public Neewalny() throws InterruptedException {
        this.declarationDate = new Date(2016, 12, 13);
        System.out.println(declareParticipation());
        meetings = new LinkedList<>();
        funds = 0;
        startCampaign();
        sleeptime = 5000;
    }

    @Override
    public String declareParticipation() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Навальный учавствует в выборах:" +
                "Настоящие выборы — это столкновение идей, программ, выбор пути. Я буду обсуждать то, о чем все молчат, но давно пора сказать\n";
    }

    @Override
    public void startCampaign() {
        this.active = true;
    }

    @Override
    public String stateFinalSpeech() {
        return null;
    }

    @Override
    public Date getDeclarationDate() {
        return declarationDate;
    }

    @Override
    public int getFunds() {
        return funds;
    }

    @Override
    public String begPublicForFunding() throws InterruptedException {
        Thread.sleep(sleeptime);
        streamOnTwitch();
        String news = "Новости: «Пострелявший в избирателей» Навальный разошелся на мемы\n" +
                "Алексей провел стрим в поддержку своей кампании\n";
        news = news.concat("Лучший твит недели: \"Наконец-то я реально убил чувака\" и другие цитаты кандидата в президенты России А.А.Навального\n");
        return news;
    }

    @Override
    public String listClaimsForPutin() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Навальный: " +
                "Путин - Вор!\n";
    }

    @Override
    public void haveAMeeting(String meeting) {
        meetings.add(meeting);
    }

    private void streamOnTwitch(){
        funds = funds + 200000;
    }

    @Override
    public void setCanNotRunForPresidency() throws InterruptedException {
        Thread.sleep(sleeptime);
        System.out.print( "Навального посадили.\n");
        Thread.sleep(sleeptime);
        System.out.print("Он больше не сможет учавствовать в выборах.\n");
        Thread.sleep(sleeptime);
        System.out.print("Извините.\n");
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public List<String> getMeetings() {
        return meetings;
    }

    @Override
    public String answerOddQuestion() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "О взятках: Наверное, когда я был студентом и ездил на машине, я не отрицаю, что у меня были эпизоды, когда я гаишникам платил. Это какие-то 90-е годы.\n";
    }
}
