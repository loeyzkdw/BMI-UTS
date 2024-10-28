/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bmi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class bmiberaksi {
    public static void main(String[] args) {
        Scanner inputanku = new Scanner(System.in);
        System.out.print("masukkan tinggi badan anda : ");
        double tinggi = inputanku.nextDouble();
        System.out.print("masukkan berat badan anda : ");
        double berat = inputanku.nextDouble();
        bmi bmiku = new bmi(tinggi, berat);
        bmiku.hasil();
    }
}
