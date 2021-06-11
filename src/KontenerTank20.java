public class KontenerTank20 extends Kontener
{
    public static double maksymalanaMasa = 32580;
    public static double minimalnaMasa = 3385;
    public static double maksymalnaPojemnosc = 24000;
    public static double minimalnaPojemnosc = 24000*0.8;
    private static int wysokosc = 2591;
    private static int dlugosc = 6058;
    private static int szerokosc = 2438;
    private double pojemnosc;


    public KontenerTank20(int idKontenera, String typKontenera, String towar, double masa, double pojemnosc)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + pojemnosc;
    }
}
