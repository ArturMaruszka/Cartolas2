/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nsei;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Carta;
import model.Jogador;
import model.Pedido;

/**
 *
 * @author 182120013
 */
public class Cartolas {
public static CJogador cadJogador  = new CJogador();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
    }//fim da main

     public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Добро пожаловать в товарищеский Советский Союз!");
        }
        return 99;
    }//fim do leiaNumInt
}//fim da class
