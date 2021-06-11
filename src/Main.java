import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main
{
    public static void main(String[] args)
    {
        GeneratorKontenerow generatorKontenerow = new GeneratorKontenerow();

        try
        {
            PrintWriter out = new PrintWriter("listaKontenerow.txt");
            for ( int i=0; i<15000; i++ )
            {
               Kontener kontener = generatorKontenerow.generuj(); // generacja 15000 kontenerow
               out.println(kontener);
               //Kontenery[i] = kontener; -> II SPOSÓB TWORZENIE OD RAZU TABLICY OBIEKTOW (BEZ POBIERANIA Z PLIKU)
            }
            out.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }


        WczytywanieKontenerow wczytywanieKontenerow = new WczytywanieKontenerow(); // wczytywanie kontenerow z pliku txt do tablicy obiektow
        File file = new File("listaKontenerow.txt");
        Kontener[] Kontenery = wczytywanieKontenerow.wczytywanieKontenera(file);


        SortowanieKontenerowPoMasie sortowanieKontenerowPoMasie = new SortowanieKontenerowPoMasie(); // sortujemy kontenery po masie co ulatwi ich zaladunek na kontenerowiec
        sortowanieKontenerowPoMasie.sortujPoMasie(Kontenery);


        /*PrintWriter out2;
        try
        {
            out2 = new PrintWriter("listaKontenerowPoSortowaniu.txt");
            for (Kontener kontener : Kontenery)
            {
                out2.println(kontener);
            }
            out2.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }*/


        PrintWriter out3 = null;
        try
        {
            out3 = new PrintWriter("Kontenerowiec.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        Kontener[][][] ZaladowanyKontenerowiec;
        Kontenerowiec kontenerowiec = new Kontenerowiec();
        ZaladowanyKontenerowiec = kontenerowiec.zaladujKontenery(Kontenery); // ladowanie kontenerowca
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            for (int rzedy=0; rzedy<50; rzedy++)
            {
                for (int kontener=0; kontener<30; kontener++)
                {
                    assert out3 != null;
                    out3.println(ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getIdKontenera() + "\t(" + wysokosc + "," + rzedy + "," + kontener+ ")\t" + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getMasa() + "\t" + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getTowar());
                }
            }
        }
        out3.close();


        // ============================================SPRAWDZENIE ROZKLADU MASY============================
        double masaLewa=0;
        double masaPrawa=0;
        double masaDol=0;
        double masaGora=0;
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            for (int rzedy=0; rzedy<50; rzedy++)
            {
                for (int kontener=0; kontener<15; kontener++)
                {
                    masaLewa = masaLewa + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getIdKontenera();
                }
            }
        }
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            for (int rzedy=0; rzedy<50; rzedy++)
            {
                for (int kontener=15; kontener<30; kontener++)
                {
                    masaPrawa = masaPrawa + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getIdKontenera();
                }
            }
        }
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            for (int rzedy=0; rzedy<25; rzedy++)
            {
                for (int kontener=0; kontener<30; kontener++)
                {
                    masaGora = masaGora + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getIdKontenera();
                }
            }
        }
        for (int wysokosc=0; wysokosc<10; wysokosc++)
        {
            for (int rzedy=25; rzedy<50; rzedy++)
            {
                for (int kontener=0; kontener<30; kontener++)
                {
                    masaDol = masaDol + ZaladowanyKontenerowiec[wysokosc][rzedy][kontener].getIdKontenera();
                }
            }
        }


        System.out.println("MASA LEWA: " + masaLewa/7500 + " MASA PRAWA: " + masaPrawa/7500 + " ROZNICA W KG: " + Math.abs(masaLewa/7500-masaPrawa/7500));
        System.out.println("MASA DOL: " + masaDol/7500 + " MASA GORA: " + masaGora/7500 + " ROZNICA W KG: " + Math.abs(masaDol/7500-masaGora/7500));
    }
}
