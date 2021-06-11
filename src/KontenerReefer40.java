public class KontenerReefer40 extends Kontener
{
    public static double maksymalanaMasa = 29400;
    public static double minimalnaMasa = 4600;
    private static int wysokosc = 2161;
    private static int dlugosc = 12192;
    private static int szerokosc = 2294;
    private int temperatura;


    public KontenerReefer40(int idKontenera, String typKontenera, String towar, double masa, int temperatura)
    {
        super(idKontenera, typKontenera, towar, masa, wysokosc, dlugosc, szerokosc);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " " + temperatura;
    }
}
