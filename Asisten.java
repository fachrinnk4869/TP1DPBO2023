public class Asisten extends Mahasiswa {
  private String asistenMatkul;
  Asisten(){
    asistenMatkul = "";
  }
  Asisten(String nik, String nama, String jenisKelamin, String nim, String prodi, String laptop, String asistenMatkul){
    super(nik, nama, jenisKelamin, nim, prodi, laptop);
    this.asistenMatkul = "";
  }

  public String getAsistenMatkul(){
    return asistenMatkul;
  }
  public void setAsistenMatkul(String asistenMatkul){
    this.asistenMatkul = asistenMatkul;
  }
  public void setNilaiMahasiswa(Mahasiswa mhs, Integer nilai){
    mhs.setNilaiAsisten(nilai);
  }
}
