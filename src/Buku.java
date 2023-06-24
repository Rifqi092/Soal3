public class Buku {
    String judul,pengarang,penerbit,tahun;

    public Buku(String judul, String pengarang, String penerbit, String tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public void cetakBuku(){
        System.out.println(this.judul);
        System.out.println(this.pengarang);
        System.out.println(this.penerbit);
        System.out.println(this.tahun);
    }
}
