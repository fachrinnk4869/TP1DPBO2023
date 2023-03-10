public class Human {
  private String nik;// atribut NIK
  private String nama;// atribut Nama
  private String jenisKelamin;// Jenis Kelamin

  Human(){
    // inisiasi dengan string kosong
    this.nik = "";
    this.nama = "";
    this.jenisKelamin = "";
  }
  Human(String nik, String nama, String jenisKelamin){
    // inisiasi dengan value awal
    this.nama = nama;
    this.nik = nik;
    this.jenisKelamin = jenisKelamin;
  }

  public String getNama(){
    // return nama human
    return this.nama;
  }
  public String getNik(){
    // return nik human
    return this.nik;
  }
  public String getJenisKelamin(){
    // rettun jenis kelamin
    return this.jenisKelamin;
  }
  public void setNama(String nama){
    // mengganti value nama
    this.nama = nama;
  }
  public void setNik(String nik){
    // mengganti value nik
    this.nik = nik;
  }
  public void setJenisKelamin(String jenisKelamin){
    // mengganti value Jenis Kelamin
    this.jenisKelamin = jenisKelamin;
  }
}
