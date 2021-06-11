public class KontenerOpenTop20 extends Kontener
{
    public static double maksymalanaMasa = 30250;
    public static double minimalnaMasa = 2250;
    private static int wysokosc = 2591;
    private static int dlugosc = 6058;
    private static int szerokosc = 2438;

    public KontenerOpenTop20(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
