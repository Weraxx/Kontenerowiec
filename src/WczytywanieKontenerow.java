import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class WczytywanieKontenerow
{

    private int idKontenera;
    private String typKontenera;
    private String towar;
    private String towar1;
    private String towar2;
    private double masa;
    private int wysokosc;
    private int dlugosc;
    private int szerokosc;
    private Kontener[] Kontenery = new Kontener[15000];

    public Kontener[] wczytywanieKontenera( File file )
    {
        try
        {
            Scanner odczyt = new Scanner(file);
            String zdanie;
            Kontener kontener;
            for ( int i=0 ; i<15000; i++ )
            {
                zdanie = odczyt.nextLine();
                //System.out.println(zdanie);
                String[] pom = zdanie.split(" ");
                idKontenera = parseInt(pom[0]);
                typKontenera = pom[1];
                towar1 = pom[2];
                towar2 = pom[3];
                towar = towar1 + " " + towar2;
                masa = parseDouble(pom[4]);
                wysokosc = parseInt(pom[5]);
                dlugosc = parseInt(pom[6]);
                szerokosc = parseInt(pom[7]);
                //System.out.println(idKontenera+" "+typKontenera+" "+towar+" "+masa+" "+wysokosc+" "+dlugosc+" "+szerokosc);
                kontener = new Kontener(idKontenera,typKontenera,towar,masa,wysokosc,dlugosc,szerokosc);
                Kontenery[i] = kontener;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return Kontenery;
    }
}
