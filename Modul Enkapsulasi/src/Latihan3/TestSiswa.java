/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Lenovo
 */
public class TestSiswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();
        siswa.setNama ("Pidi");
        siswa.setAbsen (20);
        siswa.setAlamat ("Bandung");
        
        System.out.println("Nama = "+ siswa.getNama());
        System.out.println ("Absen = "+ siswa.getAbsen());
        System.out.println("Alamat = "+ siswa.getAlamat());
                
    }
}
