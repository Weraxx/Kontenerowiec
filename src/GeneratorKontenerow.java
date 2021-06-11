import java.util.Random;

public class GeneratorKontenerow
{
    Random random = new Random();
    private int idKontenera = 0;
    String[] TypyKontenerow = {"KontenerDryVan20","KontenerDryVan40","KontenerHighCube40","KontenerPalletWide40","KontenerHighCubePalletWide40","KontenerOpenTop20","KontenerOpenTop20","KontenerHardTop20","KontenerHardTop40","KontenerHighCubeHardTop40","KontenerReefer20","KontenerReefer40","KontenerFlatRack20","KontenerFlatRack40","KontenerTank20"};
    String[] TowarKontenerDryVan_HighCube = {"kartony ryzu","paczki maseczek","worki cementu"};
    String[] TowarKontenerFlatRack = {"koparki chwytakowe","koparki zbierakowe","wywrotki uniwersalne","zageszczarki jednokierunkowe","zageszczarki nawrotne"};
    String[] TowarKontenerPalletWide_HighCubePaletWide = {"palety kart","palety procesorow"};
    String[] TowarKontenerOpenTop_HardTop = {"piasek kwarcowy","piasek wapienny","piasek wulkaniczny","piasek polimineralny","żwir płukany"};
    String[] TowarKontenerReefer = {"skrzynie pomaranczy","skrzynie jablek","skrzynie bananow"};
    String[] TowarKontenerTank = {"benzyna ekstrakcyjna","benzyna lakowa","olej napendowy","substancje chemiczne","ciecze pitne"};

    public Kontener generuj()
    {
        int indexTypyKontenerow = random.nextInt(TypyKontenerow.length);
        String typKontenera = TypyKontenerow[indexTypyKontenerow];
        int indexTowaru;
        String towar;

        double masa;
        if (typKontenera.equals("KontenerDryVan20"))
        {
            indexTowaru = random.nextInt(TowarKontenerDryVan_HighCube.length);
            towar = TowarKontenerDryVan_HighCube[indexTowaru];
            masa = random.nextDouble()*KontenerDryVan20.minimalnaMasa;
            if (masa <KontenerDryVan20.minimalnaMasa) masa = KontenerDryVan20.minimalnaMasa;
            idKontenera++;
            return new KontenerDryVan20(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerDryVan40"))
        {
            indexTowaru = random.nextInt(TowarKontenerDryVan_HighCube.length);
            towar = TowarKontenerDryVan_HighCube[indexTowaru];
            masa = random.nextDouble()*KontenerDryVan40.maksymalanaMasa;
            if (masa <KontenerDryVan40.minimalnaMasa) masa = KontenerDryVan20.minimalnaMasa;
            idKontenera++;
            return new KontenerDryVan40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerHighCube40"))
        {
            indexTowaru = random.nextInt(TowarKontenerDryVan_HighCube.length);
            towar = TowarKontenerDryVan_HighCube[indexTowaru];
            masa = random.nextDouble()*KontenerHighCube40.maksymalanaMasa;
            if (masa <KontenerHighCube40.minimalnaMasa) masa = KontenerHighCube40.minimalnaMasa;
            idKontenera++;
            return new KontenerDryVan40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerPalletWide40"))
        {
            indexTowaru = random.nextInt(TowarKontenerPalletWide_HighCubePaletWide.length);
            towar = TowarKontenerPalletWide_HighCubePaletWide[indexTowaru];
            masa = random.nextDouble()*KontenerPalletWide40.maksymalanaMasa;
            if (masa <KontenerPalletWide40.minimalnaMasa) masa = KontenerPalletWide40.minimalnaMasa;
            idKontenera++;
            return new KontenerPalletWide40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerHighCubePalletWide40"))
        {
            indexTowaru = random.nextInt(TowarKontenerPalletWide_HighCubePaletWide.length);
            towar = TowarKontenerPalletWide_HighCubePaletWide[indexTowaru];
            masa = random.nextDouble()*KontenerHighCubePalletWide40.maksymalanaMasa;
            if (masa <KontenerHighCubePalletWide40.minimalnaMasa) masa = KontenerHighCubePalletWide40.minimalnaMasa;
            idKontenera++;
            return new KontenerHighCubePalletWide40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerOpenTop20"))
        {
            indexTowaru = random.nextInt(TowarKontenerOpenTop_HardTop.length);
            towar = TowarKontenerOpenTop_HardTop[indexTowaru];
            masa = random.nextDouble()*KontenerOpenTop20.maksymalanaMasa;
            if (masa <KontenerOpenTop20.minimalnaMasa) masa = KontenerOpenTop20.minimalnaMasa;
            idKontenera++;
            return new KontenerOpenTop20(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerOpenTop40"))
        {
            indexTowaru = random.nextInt(TowarKontenerOpenTop_HardTop.length);
            towar = TowarKontenerOpenTop_HardTop[indexTowaru];
            masa = random.nextDouble()*KontenerOpenTop40.maksymalanaMasa;
            if (masa <KontenerOpenTop40.minimalnaMasa) masa = KontenerOpenTop40.minimalnaMasa;
            idKontenera++;
            return new KontenerOpenTop40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerHardTop20"))
        {
            indexTowaru = random.nextInt(TowarKontenerOpenTop_HardTop.length);
            towar = TowarKontenerOpenTop_HardTop[indexTowaru];
            masa = random.nextDouble()*KontenerHardTop20.maksymalanaMasa;
            if (masa <KontenerHardTop20.minimalnaMasa) masa = KontenerHardTop20.minimalnaMasa;
            idKontenera++;
            return new KontenerHardTop20(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerHardTop40"))
        {
            indexTowaru = random.nextInt(TowarKontenerOpenTop_HardTop.length);
            towar = TowarKontenerOpenTop_HardTop[indexTowaru];
            masa = random.nextDouble()*KontenerHardTop40.maksymalanaMasa;
            if (masa <KontenerHardTop40.minimalnaMasa) masa = KontenerHardTop40.minimalnaMasa;
            idKontenera++;
            return new KontenerHardTop40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerHighCubeHardTop40"))
        {
            indexTowaru = random.nextInt(TowarKontenerOpenTop_HardTop.length);
            towar = TowarKontenerOpenTop_HardTop[indexTowaru];
            masa = random.nextDouble()*KontenerHighCubeHardTop40.maksymalanaMasa;
            if (masa <KontenerHighCubeHardTop40.minimalnaMasa) masa = KontenerHighCubeHardTop40.minimalnaMasa;
            idKontenera++;
            return new KontenerHighCubeHardTop40(idKontenera, typKontenera, towar, masa);
        }
        int temperatura;
        if (typKontenera.equals("KontenerReefer20"))
        {
            indexTowaru = random.nextInt(TowarKontenerReefer.length);
            towar = TowarKontenerReefer[indexTowaru];
            masa = random.nextDouble()*KontenerReefer20.maksymalanaMasa;
            if (masa <KontenerReefer20.minimalnaMasa) masa = KontenerReefer20.minimalnaMasa;
            temperatura = random.nextInt(85)-60;
            idKontenera++;
            return new KontenerReefer20(idKontenera, typKontenera, towar, masa, temperatura);
        }
        if (typKontenera.equals("KontenerReefer40"))
        {
            indexTowaru = random.nextInt(TowarKontenerReefer.length);
            towar = TowarKontenerReefer[indexTowaru];
            masa = random.nextDouble()*KontenerReefer40.maksymalanaMasa;
            if (masa <KontenerReefer40.minimalnaMasa) masa = KontenerReefer40.minimalnaMasa;
            temperatura = random.nextInt(50)-25;
            idKontenera++;
            return new KontenerReefer40(idKontenera, typKontenera, towar, masa, temperatura);
        }
        if (typKontenera.equals("KontenerFlatRack20"))
        {
            indexTowaru = random.nextInt(TowarKontenerFlatRack.length);
            towar = TowarKontenerFlatRack[indexTowaru];
            masa = random.nextDouble()*KontenerFlatRack20.maksymalanaMasa;
            if (masa <KontenerFlatRack20.minimalnaMasa) masa = KontenerFlatRack20.minimalnaMasa;
            idKontenera++;
            return new KontenerFlatRack20(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerFlatRack40"))
        {
            indexTowaru = random.nextInt(TowarKontenerFlatRack.length);
            towar = TowarKontenerFlatRack[indexTowaru];
            masa = random.nextDouble()*KontenerFlatRack40.maksymalanaMasa;
            if (masa <KontenerFlatRack40.minimalnaMasa) masa = KontenerFlatRack40.minimalnaMasa;
            idKontenera++;
            return new KontenerFlatRack40(idKontenera, typKontenera, towar, masa);
        }
        if (typKontenera.equals("KontenerTank20"))
        {
            indexTowaru = random.nextInt(TowarKontenerTank.length);
            towar = TowarKontenerTank[indexTowaru];
            masa = random.nextDouble()*KontenerTank20.maksymalanaMasa;
            if (masa <KontenerTank20.minimalnaMasa) masa = KontenerTank20.minimalnaMasa;
            idKontenera++;
            double pojemnosc = random.nextDouble() * KontenerTank20.maksymalnaPojemnosc;
            if (pojemnosc<KontenerTank20.minimalnaPojemnosc) pojemnosc = KontenerTank20.minimalnaPojemnosc;
            return new KontenerTank20(idKontenera, typKontenera, towar, masa, pojemnosc);
        }



        idKontenera++;
        return new Kontener();
    }

}
