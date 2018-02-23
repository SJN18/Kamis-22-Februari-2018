import java.util.Scanner;

public class percabangan{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Angka : ");
		int angka = sc.nextInt();
		
		if(angka<0){
			System.out.println(angka + " ini bilangan negatif");
		}
		else{
			System.out.println(angka + " ini bilangan positif");
		}
	}
}