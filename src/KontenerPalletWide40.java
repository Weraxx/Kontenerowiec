public class KontenerPalletWide40 extends Kontener
{
    public static double maksymalanaMasa = 29900;
    public static double minimalnaMasa = 4100;
    private static int wysokosc = 2379;
    private static int dlugosc = 12192;
    private static int szerokosc = 2426;

    public KontenerPalletWide40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
