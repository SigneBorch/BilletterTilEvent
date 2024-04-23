public class Dørbillet implements Billet {
    private double pris;
    private int id;

    public Dørbillet(int id) {
        this.id = id;
        pris = 150;
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
        return "Dørbillet: " +
                "pris: " + pris +
                ", id: " + id;
    }
}
