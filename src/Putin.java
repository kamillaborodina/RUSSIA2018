import java.util.Date;

public class Putin implements PresidentCandidate, FuturePresident{
    private int funds;
    private int sleeptime;
    public Putin() throws InterruptedException {
        System.out.print(declareParticipation());
        sleeptime = 3000;
        funds = 10000000;
    }

    @Override
    public void falsifyVoices() throws InterruptedException {
        Thread.sleep(sleeptime);
        System.out.println("Итоги выборов президента России:" +
                "Ничего не изменилось\n" +
                "МОЙ ПРЕЗИДЕНТ - ОПЯТЬ ПУТИН\n" );
    }

    @Override
    public String declareParticipation() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Путин не раскалывается, что пойдет на выборы, но мы то с вами все знаем\n";
    }

    @Override
    public void startCampaign() throws InterruptedException {
        Thread.sleep(sleeptime);
        System.out.print("Кампания в поддержку Путина официально все еще не началась\n");
    }

    @Override
    public String stateFinalSpeech() throws InterruptedException {
        Thread.sleep(sleeptime);
        return "Путин: Мы победили, мы победили в открытой и честной борьбе! Спасибо, что вы с нами! *плачет*\n ";
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
