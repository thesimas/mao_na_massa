package org.example;

public class Motor {
    private int potencia;
    private ETipoCombustivel tipoCombustivel; // Associação unidirecional, onde o Motor conhece o ENUM tipo de combustivel.

    public Motor(int potencia, ETipoCombustivel tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }


    // getters para acessar os atributos.
    public int getPotencia() {
        return potencia;
    }

    public ETipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    // Não tem setters pois o Motor faz parte do Modelo em uma associação por COMPOSIÇÃO.
    // O motor compõe o Modelo, o Motor está dentro de Modelo.
    // Dessa forma o Motor só existe quando o Modelo é criado.


    @Override
    public String toString() {
        return "Informações do Motor - " +
                " | Potência: " + potencia +
                " | Tipo de Combustivel: " + tipoCombustivel ;
    }
}

