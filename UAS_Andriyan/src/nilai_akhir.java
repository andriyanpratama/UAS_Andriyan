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
public class nilai_akhir {
    public static void main(String[] args)

{
String nama,grade;
int n1,n2,n3 ;
double m1,m2,m3 ,mm;

Scanner input = new Scanner(System.in);
System.out.println("PROGRAM HITUNG NILAI AKHIR");

System.out.print("Nama Siswa : " );
nama =input.nextLine();

System.out.print("Nilai Tugas : ");
n1=input.nextInt();

System.out.print("Nilai UTS: ");
n2=input.nextInt();

System.out.print("Nilai UAS : ");
n3=input.nextInt();


m1= 0.2 * n1;
m2= 0.3 * n2;
m3= 0.4 * n3;
mm= m1+m2+m3;

if(mm >=80)
{
grade= "A" ;
}
else if (mm >=70)
{
grade= "B" ;
}

else if (mm >=59)
{
grade= "C" ;
}
else if (mm >=50)
{
grade= "D" ;
}
else
{
grade="E" ;

}


System.out.print("Siswa yang bernama =" + nama + " ");
System.out.println("Dengan Nilai Persentasi Yang dihasilkan" );
System.out.println("Nilai Tugas * 60% =" + (int)m1);
System.out.println ("Nilai UTS * 20% =" + (int)m2 );
System.out.println("Nilai UAS * 20% = " + (int)m3 );


System.out.print("Jadi Siswa yang bernama" + nama + " ");

System.out.println("memperoleh nilai akhir sebesar " + mm);
System.out.println("Grade nilai yang didapat adalah" + " " + grade);

}
}

