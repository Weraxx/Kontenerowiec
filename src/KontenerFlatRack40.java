public class KontenerFlatRack40 extends Kontener
{
    public static double maksymalanaMasa = 26280;
    public static double minimalnaMasa = 4200;
    private static int wysokosc = 1981;
    private static int dlugosc = 12192;
    private static int szerokosc = 2224;

    public KontenerFlatRack40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
