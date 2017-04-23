/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andriyan
 */
import java.util.Scanner;
public class nilai {
public static void main(String args[])


{
//membuat objek baru
Scanner input = new Scanner(System.in);

//deklarasi variabel
String nama;
int n1,n2, n3;
double m1,m2,m3,m4;
System.out.print("Masukan Nama Siswa : ");
nama = input.nextLine();
System.out.print("Nilai UTS: ");
n1 = input.nextInt();
System.out.print("Nilai UAS: ");
n2 = input.nextInt();
System.out.print("Nilai Tugas Mandiri : ");
n3 = input.nextInt();

m1= n1*0.35;
m2= n2*0.45;
m3= n3*0.20;
m4= m1+m2+m3;
System.out.println("============================");
System.out.println("Nilai murni yang di peroleh");
System.out.println("Niali murni UTS: " +(int) m1 );
System.out.println("Niali murni UAS :" +(int) m2);
System.out.println("Niali murni Tugas : " +(int) m3);
System.out.println("Nilai Akhir yang diperoleh yaitu :" +(int) m4 );
}
}

