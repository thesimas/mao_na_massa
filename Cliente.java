package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String celular;
    private String email;
    private LocalDate dataCadastro;
    private List<Veiculo> listaDeVeiculos; // Associção Bidirecional com multiplicidade 1(cliente) para Muitos(veiculo).

    public Cliente(int id, String nome, String celular, String email, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.listaDeVeiculos = new ArrayList<>(); // Desta forma ao cria um cliente eu inicializo a lista de veiculos dele.
    }

    public void addVeiculo(Veiculo veiculo) {
        this.listaDeVeiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo) {
        this.listaDeVeiculos.remove(veiculo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    @Override
    public String toString() {
        return "Informaçãoes do Cliente - " +
                "Identificação: " + id +
                " | Nome: " + nome +
                " | Celular: " + celular +
                " | E-mail: " + email +
                " | Data de Cadastro: " + dataCadastro +
                " | Número de Veículos: " + listaDeVeiculos.size();
    }
}
