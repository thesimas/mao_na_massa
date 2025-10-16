package org.example;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando ArrayList's PARA armazenar os objetos e deixar o codigo mais organizado.

        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Veiculo> veiculos = new ArrayList<>();
        List<Marca> marcas = new ArrayList<>();
        List<Modelo> modelos = new ArrayList<>();
        List<Cor> cores = new ArrayList<>();

        // Instanciando Cores e adcionando ao seus arrays List.

        Cor corVermelho  = new Cor("Vermelho");
        cores.add(corVermelho);
        Cor corCinza  = new Cor("Cinza");
        cores.add(corCinza);
        Cor corPreto  = new Cor("Preto");
        cores.add(corPreto);

        // Instanciando Marcas e adcionado ao seu respectivo array list.

        Marca marcaVolkswagen = new Marca(1, "Volkswagen");
        marcas.add(marcaVolkswagen);
        Marca marcaChevrolet = new Marca(2, "Chevrolet");
        marcas.add(marcaChevrolet);
        Marca marcaRenault = new Marca(3, "Renault");
        marcas.add(marcaRenault);

        // Instanciando Modelos e adcionado ao seu respectivo array list.

        Modelo modeloGol = new Modelo(1, "Gol", 120, ETipoCombustivel.GNV, ECategoria.PADRAO, marcaVolkswagen);
        modelos.add(modeloGol);
        Modelo modeloClio = new Modelo(2, "Clio", 100, ETipoCombustivel.GASOLINA, ECategoria.PEQUENO, marcaRenault);
        modelos.add(modeloClio);
        Modelo modeloOnix = new Modelo(3, "Onix", 130, ETipoCombustivel.FLEX, ECategoria.MEDIO, marcaChevrolet);
        modelos.add(modeloOnix);
        Modelo modeloPolo = new Modelo(4, "Polo", 135, ETipoCombustivel.FLEX, ECategoria.PADRAO, marcaVolkswagen);
        modelos.add(modeloPolo);

        // Instanciando CLientes e adcionado ao seu respectivo array list.

        Cliente cliente1 = new Cliente(1, "Maria Silva", "987654321", "maria@gmail.com", LocalDate.now());
        clientes.add(cliente1);
        Cliente cliente2 = new Cliente(2, "João da Sila", "984613528", "joao@gmail.com",  LocalDate.now());
        clientes.add(cliente2);
        Cliente cliente3 = new Cliente(3, "Pedro Souza", "984648728", "pedro@gmail.com",  LocalDate.now());
        clientes.add(cliente3);
        Cliente cliente4 = new Cliente(4, "Juninho", "98448368", "juninho@gmail.com",  LocalDate.now());
        clientes.add(cliente4);

        // Instanciando Veiculos e adcionado ao seu respectivo array list.

        Veiculo veiculo1 = new Veiculo(1, "ACR-489X", "Carro Usado", modeloClio, corPreto, cliente1);
        veiculos.add(veiculo1);
        Veiculo veiculo2 = new Veiculo(2, "BCS-428U", "Carro Batido", modeloClio, corVermelho, cliente3);
        veiculos.add(veiculo2);
        Veiculo veiculo3 = new Veiculo(3, "STU-381X", "Carro SemiNovo", modeloPolo, corCinza, cliente3);
        veiculos.add(veiculo3);
        Veiculo veiculo4 = new Veiculo(4, "LOP-783C", "Carro Moderno", modeloClio, corPreto, cliente2);
        veiculos.add(veiculo4);
        Veiculo veiculo5 = new Veiculo(5, "LOP-783C", "Carro Usado", modeloGol, corCinza, cliente2);
        veiculos.add(veiculo5);




        System.out.println();
        System.out.println("\n----- RELATÓRIO GERAL DE VEÍCULOS CADASTRADOS -----");
        for (Veiculo veiculo : veiculos) {
            System.out.println("---");
            informacoesVeiculo(veiculo);
        }

        System.out.println();
        exibirVeiculosDoCliente(cliente1);
        System.out.println();
        exibirVeiculosDoCliente(cliente2);
        System.out.println();
        exibirVeiculosDoCliente(cliente3);
        System.out.println();
        exibirVeiculosDoCliente(cliente4);

        System.out.println();
        cliente2.removeVeiculo(veiculo5);
        exibirVeiculosDoCliente(cliente2);
    }

    public static void informacoesVeiculo(Veiculo veiculo){
        System.out.println("Nome do Cliente ...: " + veiculo.getCliente().getNome());
        System.out.println("Placa ...: " + veiculo.getPlaca());
        System.out.println("Nome da Marca ...: " + veiculo.getModelo().getMarca().getNome());
        System.out.println("Descrição do Modelo ...: " + veiculo.getModelo().getDescricao());
        System.out.println("Categoria do Modelo ...: " + veiculo.getModelo().getCategoria());
        System.out.println("Potência ...: " + veiculo.getModelo().getMotor().getPotencia());
        System.out.println("Tipo de Combustivel ...: " + veiculo.getModelo().getMotor().getTipoCombustivel());
    }

    public static void exibirVeiculosDoCliente(Cliente cliente) {
        System.out.println("\n----- LISTA DE VEÍCULOS DE: " + cliente.getNome() + " -----");
        if (cliente.getListaDeVeiculos().isEmpty()) {
            System.out.println("Este cliente não possui veículos cadastrados.");
            return;
        }
        // Usando um for-each para percorrer a lista
        for (Veiculo v : cliente.getListaDeVeiculos()) {
            System.out.println("Placa: " + v.getPlaca() + " | Modelo: " + v.getModelo().getDescricao());
        }
    }
}