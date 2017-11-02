import java.util.Date;
import java.util.List;
import java.util.Random;

public class Sobchak implements PresidentCandidate, SelfNominee, Opposition, Lady, Horse, DudGuest {
    private List<String> meetings;
    private int popularity;
    private boolean active;
    private Date declarationdate;
    private int sleeptime;

    public Sobchak() throws InterruptedException {
        sleeptime = 3000;
        this.popularity = 1000;
        System.out.println(declareParticipation());
        startCampaign();
        declarationdate = new Date(2017,10,18);

    }

    @Override
    public void showTheSmile() {
        popularity--;
    }

    @Override
    public void useCharm() {
        popularity++;
    }

    @Override
    public String listClaimsForPutin() throws InterruptedException {
        Thread.sleep(sleeptime+ 2000);
        return "Собчак: Я бы потребовала от Путина:\n" +
                "провести честные выборы и допустить к ним Навального,\n" +
                "прекратить использовать суд в качестве своего инструмента против противников,\n" +
                "реформировать экономику — то, в какой изоляции мы оказались, приведет к катастрофе.\n";
    }

    @Override
    public void haveAMeeting(String meeting) {
        meetings.add(meeting);
    }

    @Override
    public String declareParticipation() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Собчак: Да, я действительно сейчас говорю из своей кухни\n" +
                "Я - кандидат не для всех,\n" +
                "а только для тех, кто не знает о моих фотографиях в журнале Максим" +
                "(ну или слишком хорошо о них знает)\n";
    }

    @Override
    public void startCampaign() {
        active = true;
    }

    @Override
    public String stateFinalSpeech() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Собчак: Я еще не написала свою речь\n";
    }

    @Override
    public Date getDeclarationDate() {
        return declarationdate;
    }

    @Override
    public int getFunds() {
        Random random = new Random();
        return random.nextInt();
    }

    @Override
    public String begPublicForFunding() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Собчак: я не очень люблю людей, а уж просить их о чем-нибудь точно ненавижу\n";
    }

    @Override
    public String answerOddQuestion() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Собчак: Моего крестного зовут отец Гурий. \n" +
                "Почему я отвечала на вопросы, был ли Путин моим крестным, «без комментариев»? \n" +
                "Я сама не помнила, кто был моим крестным. \n";
    }
}
