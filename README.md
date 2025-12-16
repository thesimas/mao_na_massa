<div align="center">
  <h1>🚗 Sistema de Gestão de Veículos (Lavação) - v1.0</h1>
  <p>
    <strong>Projeto "Mão na Massa 1" - Fundamentos de POO | IFSC Florianópolis</strong>
  </p>
  
  <p>
    <img src="https://img.shields.io/badge/Java-17+-orange?style=flat&logo=java" alt="Java" />
    <img src="https://img.shields.io/badge/Conceito-Fundamentos-blue?style=flat" alt="Basics" />
    <img src="https://img.shields.io/badge/Status-Concluído-success?style=flat" alt="Status" />
  </p>
</div>

## 📖 Sobre
Primeira iteração do sistema de gestão para uma lavação automotiva. O objetivo desta etapa foi estabelecer o modelo de domínio (Domain Model) e aplicar os conceitos estruturais da Programação Orientada a Objetos, focando na interação entre objetos e armazenamento de dados em memória.

A lógica principal reside na manipulação direta de objetos e listas na classe `Main`, simulando um banco de dados volátil.

## 💻 Conceitos Aplicados

### 1. Classes e Objetos
Definição de entidades que representam o mundo real, como `Cliente`, `Veiculo` e `Marca`, instanciadas diretamente para criar os registros do sistema.

### 2. Relacionamentos (Associação vs. Composição)
* **Composição (Forte):** Aplicada na classe `Modelo`. Ao instanciar um modelo, um novo `Motor` é criado automaticamente no construtor, indicando que o motor é parte intrínseca do modelo.
* **Associação Bidirecional:** Implementada entre `Cliente` e `Veiculo`.
    * O `Veiculo` conhece seu dono.
    * O `Cliente` possui uma lista de veículos.
    * **Destaque:** No construtor de `Veiculo`, o código `cliente.addVeiculo(this)` garante automaticamente a consistência dos dois lados da relação.

### 3. Encapsulamento
Uso de modificadores de acesso `private` para proteger os atributos (como `id`, `nome`, `placa`) e exposição controlada através de métodos Getters e Setters.

### 4. Enumeradores (Enums)
Utilização de Enums simples (`ECategoria` e `ETipoCombustivel`) para restringir os valores permitidos para categorias de carros e tipos de combustível, garantindo a integridade dos dados.

### 5. Collections (Básico)
Uso introdutório de `ArrayList` na classe `Main` para armazenar as listas de clientes, veículos e marcas em tempo de execução, permitindo operações simples de listagem e remoção.


## 👨‍💻 Autor
Desenvolvido por **Luciano Simas Junior** | IFSC Florianópolis
