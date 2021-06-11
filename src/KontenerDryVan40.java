public class KontenerDryVan40 extends Kontener
{
    public static double maksymalanaMasa = 28520;
    public static double minimalnaMasa = 3980;
    private static int wysokosc = 2395;
    private static int dlugosc = 12192;
    private static int szerokosc = 2352;

    public KontenerDryVan40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
