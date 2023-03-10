import java.util.ArrayList;

public class AnggotaBem extends Mahasiswa {
  private int idAnggotaBem;// atribut POSISI
  private String posisi;// atribut POSISI
  private String divisi;// atribut divisi
  private ArrayList<Proker> proker;// atribut proker

  AnggotaBem(){
    // inisiasi dengan string kosong
    this.posisi = "";
    this.divisi = "";
    this.proker = new ArrayList<Proker>();
  }
  AnggotaBem(int idAnggotaBem, String nik, String nama, String jenisKelamin, String nim, String prodi, String laptop, String posisi, String divisi){
    // inisiasi dengan value awal
    super(nik, nama, jenisKelamin, nim, prodi, laptop);
    this.idAnggotaBem = idAnggotaBem;
    this.posisi = posisi;
    this.divisi = divisi;
    this.proker = new ArrayList<Proker>();
  }

  public int getIdAnggotaBem(){
    // return IDANGGOTABEM anggotaBem
    return this.idAnggotaBem;
  }
  public void setIdAnggotaBem(int idAnggotaBem){
    // menggati value IDANGGOTABEM
    this.idAnggotaBem = idAnggotaBem;
  }
  public String getPosisi(){
    // return POSISI anggotaBem
    return this.posisi;
  }
  public void setPosisi(String posisi){
    // menggati value POSISI
    this.posisi = posisi;
  }
  public String getDivisi(){
    // return divisi
    return this.divisi;
  }
  public void setDivisi(String divisi){
    // mengganti value divisi
    this.divisi = divisi;
  }
  public ArrayList<Proker> getProker(ArrayList<ProkerAnggotaBem> gabungan){
    // return proker
    ArrayList<Proker> proker = new ArrayList<Proker>();
    for(int i = 0;i < gabungan.size();i++){
      if(this.idAnggotaBem == gabungan.get(i).getAnggotaBem().getIdAnggotaBem()){
        proker.add(gabungan.get(i).getProker());
        // System.out.println("masuk");
      }
    }

    return proker;
  }

}

