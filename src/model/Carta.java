/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120013
 */
public class Carta {
    private int idCarta;
    private String Nome;
    private String Edição;
    private String Concervação;
    private String Quantidade;
    private int Preço;
    private Jogador Dono;

    public Carta() {
    }
    

    public Carta(int idCarta, String Nome, String Edição, String Concervação, String Quantidade, int Preço, Jogador Dono) {
        this.idCarta = idCarta;
        this.Nome = Nome;
        this.Edição = Edição;
        this.Concervação = Concervação;
        this.Quantidade = Quantidade;
        this.Preço = Preço;
        this.Dono = Dono;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEdição() {
        return Edição;
    }

    public void setEdição(String Edição) {
        this.Edição = Edição;
    }

    public String getConcervação() {
        return Concervação;
    }

    public void setConcervação(String Concervação) {
        this.Concervação = Concervação;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getPreço() {
        return Preço;
    }

    public void setPreço(int Preço) {
        this.Preço = Preço;
    }

    public Jogador getDono() {
        return Dono;
    }

    public void setDono(Jogador Dono) {
        this.Dono = Dono;
    }

    @Override
    public String toString() {
        return "Carta{" + "\nidCarta= " + idCarta + "\nNome= " + Nome + "Edi\u00e7\u00e3o= " + Edição + "\nConcerva\u00e7\u00e3o=" + Concervação + "\nQuantidade=" + Quantidade + "\nPre\u00e7o=" + Preço + "\nDono=" + Dono + '}';
    }
    
}
