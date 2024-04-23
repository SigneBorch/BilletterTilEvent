import java.util.ArrayList;
import java.util.Collections;

public class SolgteBilletter {
    private ArrayList<Billet> billetter;

    public SolgteBilletter() {
        billetter = new ArrayList<>();
    }

    public void tilføjBillet(Billet billet) {
        billetter.add(billet);
    }

    public String hvorMangeAfHverBillettypeSolgt() {
        int studie = 0;
        int dør = 0;
        int forsalg = 0;
        for (Billet billet : billetter) {
            if (billet instanceof StudieBillet) {
                studie++;
            } else if (billet instanceof Dørbillet) {
                dør++;
            } else if (billet instanceof Forsalgsbillet) {
                forsalg++;
            }
        }
        return "Der er solgt " + dør + " billetter i døren, " + forsalg + " billetter i forsalg, og " + studie + " studiebilletter";
    }

    public String hentAlleStudiekortId() {
        String result = "Studie-id for solgte studiebilletter \n";
        ArrayList<String> studieId = new ArrayList<>();
        for (Billet billet : billetter) {
            if (billet instanceof StudieBillet) {
                studieId.add(((StudieBillet) billet).getStudieId());
            }
            Collections.sort(studieId);
        }
        for (String id : studieId) {
            result += id + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        Collections.sort(billetter);
        for (Billet billet : billetter) {
            result += billet + "\n";
        }
        return result;
    }
}
