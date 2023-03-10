public class AnggotaKlub extends Mahasiswa{
    private String namaKlub;
    AnggotaKlub(){
      namaKlub = "";
    }
    AnggotaKlub(String namaKlub){
      this.namaKlub = "";
    }
  
    public String namaKlub(){
      return namaKlub;
    }
    public void namaKlub(String namaKlub){
      this.namaKlub = namaKlub;
    }  
}
