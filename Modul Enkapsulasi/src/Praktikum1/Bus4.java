/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Lenovo
 */
public class Bus4 {
     public double penumpang;
    public double maxpenumpang;
    public int counter;
    public double penumpangbaru;

    public Bus4(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

     
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kapasitas");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }

    public void getpenumpang(int password) {
        if (password == 52) {
            System.out.println("Password anda Benar");
        } else {
            System.out.println("Password anda Salah");
        }

    }

    public double getAverage() {
        double average;
        return penumpang / counter;

    }

    public void cetakpenumpang() {
        System.out.println("Penumpang Bus Sekarang adalah = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);

    }
}
