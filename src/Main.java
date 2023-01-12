public class Main {
    public static void main(String[] args) {
        Teilnehmer teilnehmer1 = new Teilnehmer(
                547657,
                "Sandro",
                "FIA",
                true,
                new int[]{1, 2, 2, 1, 1, 1, 1}
        );
        System.out.println("Teilnehmer1");
        teilnehmer1.anwesenheit();
        teilnehmer1.notenDurschnitt();

        Teilnehmer teilnehmer2 = new Teilnehmer(56546);
        System.out.println("\nTeilnehmer2");
        teilnehmer2.notenDurschnitt();
        teilnehmer2.anwesenheit();

        System.out.println("\nTeilnehmer3");
        Teilnehmer teilnehmer3 = new Teilnehmer(
                66666,
                "Robert",
                "FIA",
                false,
                new int[]{3, 5, 2, 1, 5, 4}
        );
        teilnehmer3.anwesenheit();
        teilnehmer3.notenDurschnitt();
    }
}
