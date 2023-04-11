/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import model.Pedido;

/**
 *
 * @author 182120013
 */
public class CPedido {
    ArrayList<Pedido> pedidos = new ArrayList();
    public void addPedido(Pedido p){
        this.addPedido(p);
    }//fim do addPedido
    public void removePedido(Pedido p){
        this.removePedido(p);
    }//fim do removePedido
    public ArrayList<Pedido> getPedidos(){
        return this.pedidos;
    }//fim getPedidos
    public Pedido getPedido(int idPedido){
        Pedido p = null;
        for(Pedido pedido : pedidos){
            if (pedido.getIdPedido()==(idPedido)){
                p = pedido;
                break;
            }//fim do if
        }//fim do for
        return p;
    }
}//fim da class
