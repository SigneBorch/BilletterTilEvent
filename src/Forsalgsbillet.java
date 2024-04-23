public class Forsalgsbillet implements Billet {
    private double pris;
    private int id;

    public Forsalgsbillet(int dage, int id) {
        this.id = id;
        if (dage < 10) {
            pris = 120 - 120 * 0.15;
        } else {
            pris = 120;
        }
    }

    @Override
    public double getPris() {
        return pris;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Billet billet = (Billet)o;
        return billet.getId() - id;
    }

    @Override
    public String toString() {
        return "Forsalgsbillet: " +
                "pris: " + pris +
                ", id: " + id;
    }
}
