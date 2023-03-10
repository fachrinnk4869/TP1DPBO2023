import java.util.ArrayList;

public class Bem{
  private String namaHimpunan;// atribut NAMAHIMPUNAN
  private String namaKabinet;// atribut NamaKabinet
  private String tahun;// atribut NamaKabinet
  private ArrayList<AnggotaBem> anggotaBem;// Jenis Kelamin
  private ArrayList<Proker> proker;// Jenis Kelamin

  Bem(){
    // inisiasi dengan string kosong
    this.namaHimpunan = "";
    this.namaKabinet = "";
    this.tahun = "";
    this.anggotaBem = new ArrayList<AnggotaBem>();
  }
  Bem(String namaHimpunan, String namaKabinet,String tahun){
    // inisiasi dengan value awal
    this.namaHimpunan = namaHimpunan;
    this.namaKabinet = namaKabinet;
    this.tahun = tahun;
    this.anggotaBem = new ArrayList<AnggotaBem>();
    this.proker = new ArrayList<Proker>();
  }

  public String getNamaKabinet(){
    // return namaKabinet dosen
    return this.namaKabinet;
  }
  public void setNamaKabinet(String namaKabinet){
    // mengganti value namaKabinet
    this.namaKabinet = namaKabinet;
  }
  public String getNamaHimpunan(){
    // return namaHimpunan dosen
    return this.namaHimpunan;
  }
  public void setNamaHimpunan(String namaHimpunan){
    // mengganti value namaHimpunan
    this.namaHimpunan = namaHimpunan;
  }
  public String getTahun(){
    // return tahun dosen
    return this.tahun;
  }
  public void setTahun(String tahun){
    // mengganti value tahun
    this.tahun = tahun;
  }
  public ArrayList<AnggotaBem> getAnggotaBem(){
    // rettun jenis kelamin
    return this.anggotaBem;
  }
  public void addAnggotaBem(AnggotaBem anggotaBem){
    // mengganti value Jenis Kelamin
    this.anggotaBem.add(anggotaBem);
  }
  public ArrayList<Proker> getProker(){
    // rettun jenis kelamin
    return this.proker;
  }
  public void addProker(Proker proker){
    // mengganti value Jenis Kelamin
    this.proker.add(proker);
  }
}
