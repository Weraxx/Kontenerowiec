public class KontenerHighCubePalletWide40 extends Kontener
{
    public static double maksymalanaMasa = 29650;
    public static double minimalnaMasa = 4350;
    private static int wysokosc = 2683;
    private static int dlugosc = 12192;
    private static int szerokosc = 2426;

    public KontenerHighCubePalletWide40(int idKontenera, String typKontenera, String towar, double masa)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
    }
}
