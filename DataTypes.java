import javax.swing.JOptionPane;
import java.util.*;

public class DataTypes{
 public static void main(String[] args){
  String namaDepan = "Hasanur";
  String namaBelakang = "Rahman";
  int usia = 21;
  int lamaKuliah = 4;
  double ipk =3.89;
  char nilai = 'A';
  boolean tampan = true;

  Scanner input = new Scanner(System.in);

  System.out.println("==== INPUT ====");
  System.out.print("Input nama depan : ");
  namaDepan = input.nextLine();
  System.out.print("Input usia : ");
  usia = input.nextInt();
  System.out.print("Input IPK : ");
  ipk = input.nextDouble();
  System.out.print("");
  System.out.print("Input Nilai Abjad : ");
  nilai = input.next().charAt(0);
  System.out.print("Tampan? : ");
  tampan = input.nextBoolean();

  System.out.println("==== OUTPUT ===="); 
  System.out.println("Nama Depan : " + namaDepan); 
  System.out.println("Nama Belakang : " + namaBelakang);
  System.out.println("Usia : " + usia);
  System.out.println("Target Kuliah : " + lamaKuliah + " Tahun");
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai : " + nilai);
  System.out.println("Tampan : " + tampan);

  int usiaLulus = usia + lamaKuliah;
  System.out.println("Usia Lulus : " + usiaLulus + " Tahun");

  JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + " " + namaBelakang);
 }
}