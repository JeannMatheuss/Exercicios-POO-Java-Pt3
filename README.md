# Praticando Conceitos de Herança em Orientação a Objetos

Este projeto explora conceitos fundamentais da programação orientada a objetos, com ênfase em herança, polimorfismo e sobrescrita de métodos. A ideia é fornecer uma abordagem prática para solidificar sua compreensão sobre esses temas cruciais.

---

## Conceitos Abordados

- **Herança**: Uso da palavra-chave `extends` para criar subclasses e reaproveitar códigos.
- **Sobrescrita de Métodos**: Uso da anotação `@Override` para redefinir o comportamento de métodos herdados.
- **Polimorfismo**: Permite que um método seja utilizado de forma genérica para diferentes tipos de objetos, evitando a duplicidade de códigos.

---

## Atividades Propostas

### 1. Classe Carro e Subclasse ModeloCarro

- **Objetivo**: Criar uma estrutura para representar modelos de carros e seus preços ao longo de três anos.
- **Instruções**:
  - Crie uma classe `Carro` para definir o nome do modelo e os preços médios para três anos.
  - Adicione métodos para calcular e exibir o menor e o maior preço.
  - Crie uma subclasse `ModeloCarro` para instanciar modelos específicos.

---

### 2. Classe Animal e Subclasses Cachorro e Gato

- **Objetivo**: Demonstrar o uso de herança e sobrescrita de métodos com diferentes comportamentos.
- **Instruções**:
  - Crie uma classe `Animal` com o método `emitirSom()`.
  - Substitua o método `emitirSom()` nas subclasses `Cachorro` e `Gato`, usando a anotação `@Override`.
  - Adicione métodos específicos como `abanarRabo()` para `Cachorro` e `arranharMoveis()` para `Gato`.

---

### 3. Classe ContaBancaria e Subclasse ContaCorrente

- **Objetivo**: Implementar operações bancárias com especializações para contas correntes.
- **Instruções**:
  - Crie uma classe `ContaBancaria` com métodos para depositar, sacar e consultar saldo.
  - Adicione uma subclasse `ContaCorrente` com o método adicional `cobrarTarifaMensal()`.

---

### 4. Classe NumerosPrimos e Subclasses VerificadorPrimo e GeradorPrimo

- **Objetivo**: Trabalhar com números primos de forma modular e especializada.
- **Instruções**:
  - Crie uma classe `NumerosPrimos` com métodos para verificar primalidade e listar números primos.
  - Crie duas subclasses: `VerificadorPrimo` com o método `verificarSeEhPrimo()` e `GeradorPrimo` com o método `gerarProximoPrimo()`.

---

## Como Utilizar Este Projeto

1. **Clone o Repositório**: Utilize `git clone` para copiar este repositório para sua máquina.
2. **Configure seu Ambiente**: Certifique-se de ter uma IDE como IntelliJ IDEA, Eclipse ou qualquer outro ambiente compatível com Java.
3. **Implemente as Atividades**: Siga as instruções de cada atividade para criar as classes e testar os conceitos abordados.
4. **Teste seu Código**: Crie classes de teste para garantir que suas implementações estejam corretas e funcionando conforme esperado.

---

Pronto para explorar a herança em orientação a objetos? Divirta-se codificando!
