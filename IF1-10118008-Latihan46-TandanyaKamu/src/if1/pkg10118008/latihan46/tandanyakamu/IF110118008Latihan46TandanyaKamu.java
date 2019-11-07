/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class IF110118008Latihan46TandanyaKamu {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
		System.out.print("Masukkan Tahun Lahir Anda : ");
		age.setYearBirth(sc.nextInt());
		System.out.println("\n======Hasil Perhitungan Umur======");
		System.out.println("Tahun lahir anda : " + age.getYearBirth());
		System.out.println("Hari ini Tahun : " + age.getYearNow());
		System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur()+ " tahun");
		System.out.println("Tandanya kamu "+age.tandanyaKamu(age.hitungUmur()));
	}
	
}
