import java.util.ArrayList;

public class Proker{
  private int idProker;
  private String namaProker;// atribut NAMAPROKER
  private int statusProker;// atribut StatusProker
  private ArrayList<AnggotaBem> anggotaBem;// Jenis Kelamin

  Proker(){
    // inisiasi dengan string kosong
    this.namaProker = "";
    this.statusProker = 1;
    this.anggotaBem = new ArrayList<AnggotaBem>();
  }
  Proker(int idProker, String namaProker){
    // inisiasi dengan value awal
    this.idProker = idProker;
    this.statusProker = 1;
    this.namaProker = namaProker;
    this.anggotaBem = new ArrayList<AnggotaBem>();
  }

  public int getIdProker(){
    // return idProker dosen
    return this.idProker;
  }
  public void setIdProker(int idProker){
    // mengganti value idProker
    this.idProker = idProker;
  }
  public String getStatusProker(){
    // return statusProker dosen
    if(statusProker == 1) return"Proker dalam tahap perencanaan";
    else if(statusProker == 2) return"Proker dalam tahap pelaksanaan";
    else if(statusProker == 3) return"Proker dalam tahap evaluasi";
    return "Proker telah selesai";
  }
  public void setStatusProker(int statusProker){
    // mengganti value statusProker
    this.statusProker = statusProker;
  }
  public String getNamaProker(){
    // return namaProker dosen
    return this.namaProker;
  }
  public void setNamaProker(String namaProker){
    // mengganti value namaProker
    this.namaProker = namaProker;
  }
  public ArrayList<AnggotaBem> getAnggotaBem(ArrayList<ProkerAnggotaBem> gabungan){
    // return anggotaBem
    ArrayList<AnggotaBem> anggota = new ArrayList<AnggotaBem>();
    for(int i = 0;i < gabungan.size();i++){
      if(this.idProker == gabungan.get(i).getProker().getIdProker()){
        anggota.add(gabungan.get(i).getAnggotaBem());
        // System.out.println("masuk");
      }
    }
    return anggota;
  }
  // 1 = tahap perancangan proker
  // 2 = tahap pelaksanaan proker
  // 3 = tahap evaluasi proker
  // 4 = proker selesai
  public void updateStatus(){
    if(statusProker == 4){
      return;
    }
    statusProker++;
  }
}
