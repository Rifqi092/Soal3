// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import model.MataKuliah;
public class Main {
    public static void main(String[] args) {
      String nama ="Muhammad Rifqi Faisal";
      int bila = 5;
      int bilb = 4;
        System.out.println("Nama: " +nama);
        System.out.println("angka: " +(bila+bilb));

        MataKuliah mk = new MataKuliah();
        mk.KodeMatakuliah="A004";
        mk.NamaMatakuliah="PBO";
        mk.JumlahSks=3;

        System.out.println(mk.KodeMatakuliah+mk.NamaMatakuliah+mk.JumlahSks);
        mk.index();
        mk.store();
        mk.update();
        mk.show(1);
    }
}