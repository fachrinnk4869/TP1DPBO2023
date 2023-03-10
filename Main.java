import java.util.ArrayList;

// import java.util.Scanner;
// import java.util.ArrayList;`
// import util.Mahasiswa;

public class Main {
  public static void main(String[] args){
    ArrayList<AnggotaBem> arrAnggotaBem = new ArrayList<AnggotaBem>();
    ArrayList<Proker> arrProker = new ArrayList<Proker>();
    ArrayList<ProkerAnggotaBem> arrProkerAnggotaBem = new ArrayList<ProkerAnggotaBem>();

    AnggotaBem anggota = new AnggotaBem(1, "123123", "pahri", "laki", "2106515", "ilkom", "acerr", "anggota", "sosppol");
    arrAnggotaBem.add(anggota);
    
    anggota = new AnggotaBem(2, "490247", "raray", "cw", "2105765", "pilkom", "acerr", "anggota", "rohani");
    arrAnggotaBem.add(anggota);
    
    
    
    Proker proker = new Proker(1, "p2m");
    arrProker.add(proker);
    
    proker = new Proker(2, "kajian");
    arrProker.add(proker);
    


    ProkerAnggotaBem gabungan = new ProkerAnggotaBem(arrProker.get(0), arrAnggotaBem.get(0));
    arrProkerAnggotaBem.add(gabungan);

    gabungan = new ProkerAnggotaBem(arrProker.get(0), arrAnggotaBem.get(1));
    arrProkerAnggotaBem.add(gabungan);

    gabungan = new ProkerAnggotaBem(arrProker.get(1), arrAnggotaBem.get(0));
    arrProkerAnggotaBem.add(gabungan);

    // gabungan = new ProkerAnggotaBem(arrProker.get(1), arrAnggotaBem.get(1));
    // arrProkerAnggotaBem.add(gabungan);

    for(int i = 0; i < arrProker.size();i++){
      System.out.println(i + 1);
      System.out.println("Nama Proker : " + arrProker.get(i).getNamaProker());
      System.out.println("Status Proker : " + arrProker.get(i).getStatusProker());
        
      System.out.print("Anggota nya : ");
      ArrayList<AnggotaBem> listAnggotaProker = arrProker.get(i).getAnggotaBem(arrProkerAnggotaBem);
      for(int j = 0; j < listAnggotaProker.size();j++){
        System.out.print(listAnggotaProker.get(j).getNama() + ", ");
      }
      System.out.println("\n");
    }
    
    System.out.println("/// print proker beserta anggota bem yang mengikuti prokernya");
    System.out.println("=============================================");
    for(int i = 0; i < arrAnggotaBem.size();i++){
      System.out.println(i + 1);
      System.out.println("Nama Anggota BEM : " + arrAnggotaBem.get(i).getNama());
      System.out.print("Dengan Proker nya : ");
      ArrayList<Proker> listProkerAnggota = arrAnggotaBem.get(i).getProker(arrProkerAnggotaBem);
      for(int j = 0; j < listProkerAnggota.size();j++){
        System.out.print(listProkerAnggota.get(j).getNamaProker());
        System.out.print(" (" + listProkerAnggota.get(j).getStatusProker() + "), ");
      }
      System.out.println("\n");
    }
    System.out.println("/// print anggota beserta proker yang diikutinya");
    System.out.println("=============================================");
    
    System.out.println("Mengupdate Status");
    arrProker.get(0).updateStatus();
    
    for(int i = 0; i < arrProker.size();i++){
      System.out.println(i + 1);
      System.out.println("Nama Proker : " + arrProker.get(i).getNamaProker());
      System.out.println("Status Proker : " + arrProker.get(i).getStatusProker());
        
      System.out.print("Anggota nya : ");
      ArrayList<AnggotaBem> listAnggotaProker = arrProker.get(i).getAnggotaBem(arrProkerAnggotaBem);
      for(int j = 0; j < listAnggotaProker.size();j++){
        System.out.print(listAnggotaProker.get(j).getNama() + ", ");
      }
      System.out.println("\n");
    }
    System.out.println("=============================================");
    
    System.out.println("/// memasukkan nilai ke mahasiswa bernama " + arrAnggotaBem.get(0).getNama());
    Asisten asisten1 = new Asisten("012030", "Mila", "cw", "12345", "ilkom", "acer", "alpro"); 
    Dosen dosen1 = new Dosen("12039101", "asus", asisten1);
    
    dosen1.setNilaiMahasiswa(arrAnggotaBem.get(0), 97);
    asisten1.setNilaiMahasiswa(arrAnggotaBem.get(0), 100);
    System.out.println("nilai " + arrAnggotaBem.get(0).getNama() + " adalah");
    System.out.println("nilai dosen : " + arrAnggotaBem.get(0).getNilaiDosen());
    System.out.println("nilai asisten: " + arrAnggotaBem.get(0).getNilaiAsisten());
    System.out.println("/// karena memasukkan nilai dosen sebelum nilai dari asisten");
    
    System.out.println("\n=============================================");
    dosen1.setNilaiMahasiswa(arrAnggotaBem.get(0), 97);
    System.out.println("nilai " + arrAnggotaBem.get(0).getNama() + " adalah");
    System.out.println("nilai dosen : " + arrAnggotaBem.get(0).getNilaiDosen());
    System.out.println("nilai asisten: " + arrAnggotaBem.get(0).getNilaiAsisten());
    System.out.println("/// karena sudah memasukkan nilai dosen setelah nilai dari asisten");

    System.out.println("\n=============================================");
    
  }
}
