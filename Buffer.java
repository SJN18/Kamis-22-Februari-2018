import java.io.*;
public class Buffer{
	public static void main(String[]Yuri)throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Masukkan Nama: ");
	String nama = br.readLine();
	
	System.out.print("Hallo "+nama);
	
	}
}