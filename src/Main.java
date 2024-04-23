public class Main {
    public static void main(String[] args) {
        //testdatainput til programmet
        SolgteBilletter solgteBilletter = new SolgteBilletter();
        StudieBillet studieBillet1 = new StudieBillet(5, 33, "sieb_500");
        Dørbillet dørbillet1 = new Dørbillet(4);
        Dørbillet dørbillet2 = new Dørbillet(40);
        Dørbillet dørbillet3 = new Dørbillet(18);
        Forsalgsbillet forsalgsbillet1 = new Forsalgsbillet(30, 55);
        Forsalgsbillet forsalgsbillet2 = new Forsalgsbillet(3, 49);
        StudieBillet studieBillet2 = new StudieBillet(20, 44, "edan_469");
        solgteBilletter.tilføjBillet(studieBillet1);
        solgteBilletter.tilføjBillet(dørbillet1);
        solgteBilletter.tilføjBillet(forsalgsbillet1);
        solgteBilletter.tilføjBillet(forsalgsbillet2);
        solgteBilletter.tilføjBillet(studieBillet2);
        solgteBilletter.tilføjBillet(dørbillet2);
        solgteBilletter.tilføjBillet(dørbillet3);

        //afprøvning af metoderne
        System.out.println(studieBillet1.getPris());
        System.out.println(forsalgsbillet2.getPris());
        System.out.println(dørbillet2.getPris());

        System.out.println(solgteBilletter);
        System.out.println(solgteBilletter.hvorMangeAfHverBillettypeSolgt());
        System.out.println(solgteBilletter.hentAlleStudiekortId());

    }
}
