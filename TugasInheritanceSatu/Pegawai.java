public class Pegawai{
    public String nip,nama, alamat;
    public int gaji = 12000;

    public Pegawai(String nip, String nama, String alamat){
    this.nip = nip;
    this.nama = nama;
    this.alamat =alamat;   
    }

    public String getNama(){
        return nama;
    }

    public int getGaji(){
        return gaji;
    }


}