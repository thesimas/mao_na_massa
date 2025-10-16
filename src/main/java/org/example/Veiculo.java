package org.example;

public class Veiculo {
    private int id;
    private String placa;
    private String observacoes;
    private Modelo modelo; // Associação Unidirecional
    private Cor cor; // Associação Unidirecional
    private Cliente cliente; // Associação Bidirecional;


    public Veiculo(int id, String placa, String observacoes, Modelo modelo, Cor cor, Cliente cliente) {
        this.id = id;
        this.placa = placa;
        this.observacoes = observacoes;
        this.modelo = modelo;
        this.cor = cor;
        this.cliente = cliente;
        cliente.addVeiculo(this); // Utilizando o Método addVeiculo eu garanto que ao instanciar a classe veiculo,
        // e também adciono o veiculo criado a lista de veiculos dele.
        // é uma forma segura de garantir que isso sempre será feito.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Informações do Veículo - " +
                "Identificação: " + id +
                " | Placa:  " + placa +
                " | Observações: " + observacoes +
                " | Modelo - " + modelo +
                " | Cor - " + cor +
                " | Proprietário - " + cliente.getNome();
    }
}

