public class KontenerOpenTop40 extends Kontener
{
    public static double maksymalanaMasa = 28450;
    public static double minimalnaMasa = 4050;
    private static int wysokosc = 2380;
    private static int dlugosc = 12192;
    private static int szerokosc = 2350;

    public KontenerOpenTop40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
