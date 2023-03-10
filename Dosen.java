import java.util.ArrayList;

public class Dosen extends Human {
  private String nip;// atribut NIP
  private String laptop;// atribut Laptop
  private ArrayList<Asisten> asisten;// Jenis Kelamin

  Dosen(){
    // inisiasi dengan string kosong
    this.nip = "";
    this.laptop = "";
    this.asisten = new ArrayList<Asisten>();
  }
  Dosen(String nip, String laptop, Asisten asisten){
    // inisiasi dengan value awal
    this.laptop = laptop;
    this.nip = nip;
    this.asisten = new ArrayList<Asisten>();
  }

  public String getLaptop(){
    // return laptop dosen
    return this.laptop;
  }
  public void setLaptop(String laptop){
    // mengganti value laptop
    this.laptop = laptop;
  }
  public String getNip(){
    // return nip dosen
    return this.nip;
  }
  public void setNip(String nip){
    // mengganti value nip
    this.nip = nip;
  }
  public ArrayList<Asisten> getAsisten(){
    // rettun jenis kelamin
    return this.asisten;
  }
  public void addAsisten(Asisten asisten){
    // mengganti value Jenis Kelamin
    this.asisten.add(asisten);
  }
  public void setNilaiMahasiswa(Mahasiswa mhs, Integer nilai){
    mhs.setNilaiDosen(nilai);
  }
}
