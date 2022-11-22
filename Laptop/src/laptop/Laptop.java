package laptop;

public class Laptop {
String Merk;
String Warna;
String Jenisprocessor;
String UkuranLayar;

    public static void main(String[] args) {
        Laptop laptopku= new Laptop ();
        laptopku.Merk="Lenovo";
        laptopku.Warna="pink";
        laptopku.Jenisprocessor="AMD";
        laptopku.UkuranLayar="17 inchi";
        
        System.out.println("Merk           :"+ laptopku.Merk);
        System.out.println("Warna          :"+ laptopku.Warna);
        System.out.println("Jenis Processor:"+ laptopku.Jenisprocessor);
        System.out.println("Ukuran Layar   :"+ laptopku.UkuranLayar);

    }
    
}
