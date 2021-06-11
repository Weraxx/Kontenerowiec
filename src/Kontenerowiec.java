public class Kontenerowiec
{
    private Kontener ZaladowanyKontenerowiec[][][] = new Kontener[10][50][30]; // (poziomy) - (rzedy) - (kontenery w rzedzie)

    public Kontener[][][] zaladujKontenery( Kontener[] tablicaKontenerow )
    {
        int i = 0;
        bound:
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            if (i==tablicaKontenerow.length) break bound;
            if (wysokosc%2==0)
            {
                for (int rzedy=0; rzedy<50; rzedy++)
                {
                    for (int kontener=0; kontener<30; kontener++)
                    {
                        ZaladowanyKontenerowiec[wysokosc][rzedy][kontener] = tablicaKontenerow[i];
                        i++;
                    }
                }
            }
            else
            {
                for (int rzedy=49; rzedy>=0; rzedy--)
                {
                    for (int kontener=29; kontener>=0; kontener--)
                    {
                        ZaladowanyKontenerowiec[wysokosc][rzedy][kontener] = tablicaKontenerow[i];
                        i++;
                    }
                }
            }
        }

        return ZaladowanyKontenerowiec;
    }
}
