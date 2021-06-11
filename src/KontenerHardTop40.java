public class KontenerHardTop40 extends Kontener
{
    public static double maksymalanaMasa = 25780;
    public static double minimalnaMasa = 4700;
    private static int wysokosc = 2388;
    private static int dlugosc = 12192;
    private static int szerokosc = 2342;

    public KontenerHardTop40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
