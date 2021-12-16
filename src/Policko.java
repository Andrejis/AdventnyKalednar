public class Policko {
    private int aCislo;
    private ObsahPolicka aObsah;
    private boolean aOtvorene;

    public Policko(int aCislo, ObsahPolicka aObsah) {
        this.aCislo = aCislo;
        this.aObsah = aObsah;
        this.aOtvorene = false;
    }

    public int getaCislo() {
        return aCislo;
    }

    public void setaCislo(int aCislo) {
        this.aCislo = aCislo;
    }

    public ObsahPolicka getaObsah() {
        return aObsah;
    }

    public void setaObsah(ObsahPolicka aObsah) {
        this.aObsah = aObsah;
    }

    public boolean isaOtvorene() {
        return aOtvorene;
    }

    public void setaOtvorene(boolean aOtvorene) {
        this.aOtvorene = aOtvorene;
    }

    public void otvor (int paAktualnyden) {
        if (this.aCislo <= paAktualnyden) {
            this.aOtvorene = true;
        } else {
            System.out.println("Nemozes otvori policko c. " + this.aCislo + " ked je " + paAktualnyden + " .12 ");
        }
    }

    public void vypisInfo () {
        System.out.println(this.aCislo + " ");
        if (this.aOtvorene) {
            System.out.println(this.aObsah);
        } else {
            System.out.println("Zatvorene");
        }
    }

}
