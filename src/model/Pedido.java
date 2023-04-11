/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120013
 */
public class Pedido {
    private int idPedido;
    private Carta card;
    private int Quantidade;
    private Jogador dono;
    private int Preço;

    public Pedido(int idPedido, Carta card, int Quantidade, Jogador dono, int Preço) {
        this.idPedido = idPedido;
        this.card = card;
        this.Quantidade = Quantidade;
        this.dono = dono;
        this.Preço = Preço;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Carta getCard() {
        return card;
    }

    public void setCard(Carta card) {
        this.card = card;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }

    public int getPreço() {
        return Preço;
    }

    public void setPreço(int Preço) {
        this.Preço = Preço;
    }

    @Override
    public String toString() {
        return "Pedido{" + "\nidPedido= \t" + idPedido + "\ncard= \t" + card + "\nQuantidade= \t" + Quantidade + "\ndono= \t" + dono + "\nPre\u00e7o= \t" + Preço + '}';
    }
    
}
