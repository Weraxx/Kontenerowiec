public class KontenerReefer20 extends Kontener
{
    public static double maksymalanaMasa = 27575;
    public static double minimalnaMasa = 2905;
    private static int wysokosc = 2591;
    private static int dlugosc = 6058;
    private static int szerokosc = 2438;
    private int temperatura;


    public KontenerReefer20(int idKontenera, String typKontenera, String towar, double masa, int temperatura)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " " + temperatura;
    }
}
