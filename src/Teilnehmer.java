public class Teilnehmer {

    private Teilnehmer __ = this;
    public int martikelnummer;
    public String name;
    public String ausbildung;
    public boolean anwesend;
    public int[] noten;

    public Teilnehmer(){
        this(-1);
    }

    public Teilnehmer(int martikelnummer){
        this(martikelnummer, "none");
    }

    public Teilnehmer(int martikelnummer, String name){
        this(martikelnummer, name, "none");
    }

    public Teilnehmer(int martikelnummer, String name, String ausbildung){
        this(martikelnummer, name, ausbildung, false);
    }


    public Teilnehmer(int martikelnummer, String name, String ausbildung, boolean anwesend){
        this(martikelnummer, name, ausbildung, anwesend, new int[0]);
    }


    public Teilnehmer(int martikelnummer, String name, String ausbildung, boolean anwesend, int[] noten){
        __.martikelnummer = martikelnummer;
        __.name = name;
        __.ausbildung = ausbildung;
        __.anwesend = anwesend;
        __.noten = noten;
    }

    public void anwesenheit(){
        System.out.print("Der Teilnehmer " + name + " mit der Martikelnummer " + martikelnummer);
        if (anwesend) {
            System.out.println(" ist anwesend");
        } else System.out.println(" ist nicht anwesend");
    }

    public void notenDurschnitt(){
        double summe = 0;
        for(int i: noten)
            summe += i;
        double durschnitt = summe / noten.length;
        System.out.printf("Der Teilnehmer " + name + " hat einen Notendurschnitt von: %.2f\n", durschnitt);
    }
}
