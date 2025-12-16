<div align="center">
  <h1>Sistema de Gerenciamento de Veículos em Java</h1>
  <p>
    <strong>Projeto simples em Java de console para demonstrar na prática os principais conceitos de Programação Orientada a Objetos (POO).</strong>
  </p>
</div>

<hr>

### Diagrama de Classes
<div align="center">
  <img src="Lavacao - Associacao Unidirecional, Bidirecional Composicao, Enum.png" width="800"/>
</div>

<hr>

### 🚀 Conceitos de POO Aplicados

<ul>
  <li>
    <strong>Encapsulamento:</strong> Atributos de todas as classes são <code>private</code>, com acesso controlado por métodos <code>getters</code> e <code>setters</code>.
  </li>
  <li>
    <strong>Associações entre Classes:</strong>
    <ul>
      <li><strong>Unidirecional:</strong> Relações de sentido único, como <code>Veiculo</code> conhecendo seu <code>Modelo</code>.</li>
      <li><strong>Bidirecional:</strong> Relação <code>Cliente</code> ↔ <code>Veiculo</code>, onde um cliente pode ter múltiplos veículos e um veículo pertence a um cliente.</li>
      <li><strong>Composição:</strong> Relação forte entre <code>Modelo</code> e <code>Motor</code>, onde o <code>Motor</code> é criado e gerenciado exclusivamente pelo <code>Modelo</code>.</li>
    </ul>
  </li>
  <li>
    <strong>Enumerações:</strong> Uso de <code>enum</code> para tipos fixos como <code>ECategoria</code> e <code>ETipoCombustivel</code>, garantindo segurança e legibilidade do código.
  </li>
</ul>
