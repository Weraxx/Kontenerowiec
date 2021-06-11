public class KontenerHardTop20 extends Kontener
{
    public static double maksymalanaMasa = 27890;
    public static double minimalnaMasa = 2590;
    private static int wysokosc = 2591;
    private static int dlugosc = 6058;
    private static int szerokosc = 2438;

    public KontenerHardTop20(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
