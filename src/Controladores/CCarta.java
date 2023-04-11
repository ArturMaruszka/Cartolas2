/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import model.Carta;

/**
 *
 * @author 182120013
 */
public class CCarta {
    ArrayList<Carta> cartas = new ArrayList<>();
    public void addCarta(Carta c){
        this.cartas.add(c);
        
    }//fim addCarta
    public void removeCarta(Carta c){
        this.removeCarta(c);
    }//fim removeCarta
    public ArrayList<Carta> getCartas(){
        return this.cartas;
    }//fim array carta
    public Carta getCarta(String Nome){
        Carta c = null;
        for(Carta carta : cartas){
            if(carta.getNome().equals(Nome)){
                c =carta;
                break;
            }//fim do if
        }//fim do for
        return c;
    }//fim do getCarta
}//fim da class
