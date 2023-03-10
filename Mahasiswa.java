public class Mahasiswa extends Human {
  private String nim;// atribut NIM
  private String prodi;// atribut prodi
  private String laptop;// atribut laptop
  private Integer nilaiDosen;// atribut laptop
  private Integer nilaiAsisten;// atribut laptop

  Mahasiswa(){
    // inisiasi dengan string kosong
    this.nim = "";
    this.prodi = "";
    this.laptop = "";
    this.nilaiDosen = null;
    this.nilaiAsisten = null;
  }
  Mahasiswa(String nik, String nama, String jenisKelamin, String nim, String prodi, String laptop){
    // inisiasi dengan value awal
    super(nik, nama, jenisKelamin);
    this.nim = nim;
    this.prodi = prodi;
    this.laptop = laptop;
    this.nilaiDosen = null;
    this.nilaiAsisten = null;
  }

  public String getNim(){
    // return NIM mahasiswa
    return this.nim;
  }
  public void setNim(String nim){
    // menggati value NIM
    this.nim = nim;
  }
  public String getProdi(){
    // return prodi
    return this.prodi;
  }
  public void setProdi(String prodi){
    // mengganti value prodi
    this.prodi = prodi;
  }
  public String getLaptop(){
    //return laptop
    return this.laptop;
  }
  public void setLaptop(String laptop){
    // mengganti value laptop
    this.laptop = laptop;
  }

  public Integer getNilaiDosen(){
    //return nilaiDosen
    return this.nilaiDosen;
  }
  protected void setNilaiDosen(Integer nilaiDosen){
    // mengganti value nilaiDosen
    if(nilaiAsisten == null) {
      System.out.println("Masukkan dulu nilai dari asisten!!!");
      return;
    }
    this.nilaiDosen = nilaiDosen;
  }

  public Integer getNilaiAsisten(){
    //return nilaiAsisten
    return this.nilaiAsisten;
  }
  protected void setNilaiAsisten(Integer nilaiAsisten){
    // mengganti value nilaiAsisten
    this.nilaiAsisten = nilaiAsisten;
  }

}
