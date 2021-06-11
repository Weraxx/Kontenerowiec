public class KontenerHighCube40 extends Kontener
{
    public static double maksymalanaMasa = 28490;
    public static double minimalnaMasa = 4010;
    private static int wysokosc = 2700;
    private static int dlugosc = 12192;
    private static int szerokosc = 2350;

    public KontenerHighCube40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
