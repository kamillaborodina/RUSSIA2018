public class Main {
    /**
     * This program is a model of elections in 2018.
     * All characters and events in the program
     * Even those based on real people
     * Are entirely fictional
     * There are many fun features implemented but not used in the main section
     *
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        Putin president = new Putin();
        Neewalny Navalny = new Neewalny();
        System.out.println(Navalny.listClaimsForPutin());
        System.out.print("Funds before stream: ");
        System.out.println(Navalny.getFunds());
        System.out.println(Navalny.begPublicForFunding());
        System.out.print("Funds after stream: ");
        System.out.println(Navalny.getFunds());
        Navalny.setCanNotRunForPresidency();

        Zhirik zhirik = new Zhirik();
        zhirik.declareParticipation();

        Zyuganov zyuganov = new Zyuganov();
        System.out.print(zyuganov.revealTheTruth());

        Sobchak sobchak = new Sobchak();
        System.out.println(sobchak.listClaimsForPutin());

        president.startCampaign();

        holdElections(president);

        System.out.println(zhirik.stateFinalSpeech());
        System.out.println(zyuganov.stateFinalSpeech());
        System.out.println(sobchak.stateFinalSpeech());
        System.out.println(president.stateFinalSpeech());

    }


    static void holdElections(Putin president) throws InterruptedException {
        president.falsifyVoices();
    }
}
