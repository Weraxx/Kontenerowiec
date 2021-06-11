public class Kontener
{
    int idKontenera;
    private String typKontenera;
    private String towar;
    private double masa;
    private int wysokosc;
    private int dlugosc;
    private int szerokosc;

    public Kontener()
    {

    }

    public Kontener(int idKontenera, String typKontenera, String towar, double masa, int wysokosc, int dlugosc, int szerokosc)
    {
        this.idKontenera = idKontenera;
        this.typKontenera = typKontenera;
        this.towar = towar;
        this.masa = masa;
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int getIdKontenera()
    {
        return idKontenera;
    }
    public double getMasa()
    {
        return masa;
    }
    public String getTowar()
    {
        return towar;
    }

    public void setIdKontenera(int idKontenera)
    {
        this.idKontenera = idKontenera;
    }

    public void setTypKontenera(String typKontenera)
    {
        this.typKontenera = typKontenera;
    }

    public void setTowar(String towar)
    {
        this.towar = towar;
    }

    public void setMasa(double masa)
    {
        this.masa = masa;
    }

    public void setDlugosc(int dlugosc)
    {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(int szerokosc)
    {
        this.szerokosc = szerokosc;
    }

    public void setWysokosc(int wysokosc)
    {
        this.wysokosc = wysokosc;
    }


    @Override
    public String toString()
    {
        return idKontenera + " " + typKontenera + " " + towar + " " + masa + " " + wysokosc + " " + dlugosc + " " + szerokosc;
    }
}
