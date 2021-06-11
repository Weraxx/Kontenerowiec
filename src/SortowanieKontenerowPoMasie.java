public class SortowanieKontenerowPoMasie
{
    private Kontener pomocnicza;

    public Kontener[] sortujPoMasie( Kontener[] tablicaKontenerow )
    {
        int size = tablicaKontenerow.length;
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                if (tablicaKontenerow[j].getMasa()<=tablicaKontenerow[i].getMasa())
                {
                    pomocnicza = tablicaKontenerow[j];
                    tablicaKontenerow[j]=tablicaKontenerow[i];
                    tablicaKontenerow[i] = pomocnicza;
                }
            }
        }
        return tablicaKontenerow;
    }
}
