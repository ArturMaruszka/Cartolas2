/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120013
 */
public class Jogador {
    private int idUsuario;
    private String Usuário;
    private String Telefone;
    private String email;
    private String Cidade;

    public Jogador() {
    }

    public Jogador(int idUsuario, String Usuário, String Telefone, String email, String Cidade) {
        this.idUsuario = idUsuario;
        this.Usuário = Usuário;
        this.Telefone = Telefone;
        this.email = email;
        this.Cidade = Cidade;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuário() {
        return Usuário;
    }

    public void setUsuário(String Usuário) {
        this.Usuário = Usuário;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    @Override
    public String toString() {
        return "Jogador{" + "\nidUsuario= \t" + idUsuario + "\nUsu\u00e1rio= \t" + Usuário + "\nTelefone= \t" + Telefone + "\nemail= \t" + email + "\nCidade= \t" + Cidade + '}';
    }
    
}//fim da class
