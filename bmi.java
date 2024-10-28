/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bmi;

/**
 *
 * @author user
 */
public class bmi {

    double tinggi;
    double berat;

    public bmi(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

     double hitung() {
        return berat / (tinggi * tinggi);
    }

     void hasil() {
        double bmi = hitung();
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obesitas");
        }
        System.out.printf("hasil bmi anda : %.1f%n" , hitung());
    }
}
