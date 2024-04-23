public class StudieBillet implements Billet {

    private double pris;
    private int id;
    private String studieId;

    public StudieBillet(int antalDage, int id, String studieId) {
        this.id = id;
        this.studieId = studieId;
        if (antalDage < 10) {
            pris = 90;
        } else {
            pris = 90 - 90 * 0.15;
        }
    }

    @Override
    public double getPris() {
        return pris;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getStudieId() {
        return studieId;
    }

    @Override
    public int compareTo(Object o) {
        Billet billet = (Billet)o;
        return billet.getId() - id;
    }

    @Override
    public String toString() {
        return "HUSK STUDIEKORT TIL EVENTET!  " +
                "StudieBillet: " +
                "pris: " + pris +
                ", id: " + id +
                ", studieId: " + studieId;
    }

}
