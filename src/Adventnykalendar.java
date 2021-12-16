import java.util.ArrayList;
import java.util.Random;

public class Adventnykalendar {
    private ArrayList<Policko> aKalendar;

    public Adventnykalendar() {
        this.aKalendar = new ArrayList<>();
    }

    public void naplPolicka () {
        Random r = new Random();
        int nahodneCislo;
        for (int i = 0; i < 24; i++){
            nahodneCislo = r.nextInt(4);
            Policko p = new Policko(i, ObsahPolicka.values()[nahodneCislo]);
            this.aKalendar.add(p);
        }
    }
    public int dajPocetOtvorenychPolicok () {
        int pocetOtvorenych = 0;
        for (int i = 1; i <= 24; i++) {
           if (aKalendar.get(i).isaOtvorene()) {
               pocetOtvorenych++;
           }
        }
        return pocetOtvorenych;
    }
    public int dajPocetZatvorenychPolicok () {
        return aKalendar.size() - dajPocetOtvorenychPolicok();
    }
    public void vypisOtvorenePoicka () {
        for (int i = 0; i < aKalendar.size(); i++) {
            if (aKalendar.get(i).isaOtvorene()) {
                System.out.println(aKalendar.get(i).getaCislo() + " ");
            }
        }
        System.out.println();
    }
    public void vypisCelkoveInfo () {
        for(int i = 0; i < aKalendar.size(); i++){
            aKalendar.get(i).vypisInfo();
        }
    }
    public void otvorPolicko(int paKtore, int paAkyJeDen) {
        aKalendar.get(paKtore - 1).otvor(paAkyJeDen);
    }
}
