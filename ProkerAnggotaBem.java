public class ProkerAnggotaBem {
  private Proker proker;
  private AnggotaBem anggotaBem;

  ProkerAnggotaBem(Proker proker, AnggotaBem anggotaBem){
    this.proker = proker;
    this.anggotaBem = anggotaBem;
  }

  public Proker getProker(){
    return proker;
  }
  public void getProker(Proker proker){
    this.proker = proker;
  }
  public AnggotaBem getAnggotaBem(){
    return anggotaBem;
  }
  public void setAnggotaBem(AnggotaBem anggotaBem){
    this.anggotaBem = anggotaBem;
  }
}
