public class TugasIn{
    public static void main(String[] args) {
        Dosen dosen = new Dosen(25000,"21823726","Sinta","Malang");
        dosen.setSKS();
        Pegawai pegawai = new Pegawai("2131424","Tina","Nganjuk");
        DaftarGaji daftarGaji = new DaftarGaji(10);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);
        daftarGaji.printSemuaGaji();
    }
}