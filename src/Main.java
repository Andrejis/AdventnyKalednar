public class Main {
    public static void main(String[] args) {
        Adventnykalendar kalendar = new Adventnykalendar();
        kalendar.vypisCelkoveInfo();
        System.out.println(kalendar.dajPocetOtvorenychPolicok() + " otvorenych policok ");
        System.out.println(kalendar.dajPocetZatvorenychPolicok() + " zatvorenych policok");

        kalendar.otvorPolicko(24, 16);
        kalendar.otvorPolicko(10, 16);
        kalendar.otvorPolicko(7, 16);
        kalendar.otvorPolicko(15, 16);
        for (int i = 1; i <= 16; i++) {
            kalendar.otvorPolicko(i, 16);
        }
        kalendar.vypisCelkoveInfo();
        System.out.println(kalendar.dajPocetOtvorenychPolicok() + " otvorenych policok ");
        System.out.println(kalendar.dajPocetZatvorenychPolicok() + " zatvorenych policok");
    }
}
