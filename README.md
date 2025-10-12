# 📋 Projeto Queue - Implementações de Filas em Java

Este projeto implementa diferentes tipos de estruturas de dados de fila (Queue) em Java, incluindo implementações estáticas e dinâmicas, com e sem prioridade.

## 🚀 Funcionalidades

### Tipos de Fila Implementados

1. **DinamicQueue** - Fila dinâmica simples (FIFO)
2. **DinamicQueueOP** - Fila dinâmica com prioridade
3. **StaticQueue** - Fila estática com redimensionamento automático
4. **StaticQueue2** - Implementação alternativa de fila estática

## 📁 Estrutura do Projeto

```
src/
├── DinamicQueue.java      # Fila dinâmica usando lista ligada
├── DinamicQueueOP.java    # Fila dinâmica com prioridade
├── StaticQueue.java       # Fila estática com array
├── StaticQueue2.java      # Implementação alternativa de fila estática
├── Main.java              # Classe principal com exemplos
├── No.java                # Nó para fila dinâmica simples
└── Node.java              # Nó para fila dinâmica com prioridade
```

## 🔧 Classes Principais

### DinamicQueue&lt;T&gt;
Implementação de fila dinâmica usando lista ligada simples.

**Métodos principais:**
- `enQueue(T elemento)` - Adiciona elemento ao final da fila
- `deQueue()` - Remove e retorna o primeiro elemento
- `front()` - Retorna o primeiro elemento sem remover
- `isEmpty()` - Verifica se a fila está vazia
- `size()` - Retorna o tamanho da fila
- `indexOf(T element)` - Retorna o índice do elemento
- `contains(T element)` - Verifica se contém o elemento
- `clear()` - Limpa a fila

### DinamicQueueOP&lt;T&gt;
Fila dinâmica com prioridade, onde elementos com menor prioridade ficam na frente.

**Métodos principais:**
- `enQueue(T elem, int priority)` - Adiciona elemento com prioridade
- `deQueue()` - Remove elemento com maior prioridade (menor número)
- `front()` - Retorna o primeiro elemento
- `get(int i)` - Retorna elemento na posição i
- `indexOf(T element)` - Busca elemento e retorna índice

### StaticQueue&lt;T&gt;
Implementação de fila usando array com redimensionamento automático.

**Características:**
- Capacidade inicial de 10 elementos
- Redimensionamento automático quando necessário
- Implementação circular para otimização

## 💻 Como Usar

### Exemplo Básico - Fila Dinâmica
```java
DinamicQueue<Integer> fila = new DinamicQueue<>();
fila.enQueue(10);
fila.enQueue(20);
fila.enQueue(30);

System.out.println(fila); // Output: 10, 20, 30
int primeiro = fila.deQueue(); // Remove e retorna 10
```

### Exemplo - Fila com Prioridade
```java
DinamicQueueOP<Integer> filaPrioridade = new DinamicQueueOP<>();
filaPrioridade.enQueue(100, 100); // valor, prioridade
filaPrioridade.enQueue(120, 120);
filaPrioridade.enQueue(30, 30);   // Maior prioridade (menor número)

System.out.println(filaPrioridade); // 30 vem primeiro por ter menor prioridade
```

## 🏃‍♂️ Executando o Projeto

1. **Compilar:**
   ```bash
   javac src/*.java
   ```

2. **Executar:**
   ```bash
   java -cp src Main
   ```

## 📊 Complexidade dos Algoritmos

### DinamicQueue
- **Inserção (enQueue):** O(1)
- **Remoção (deQueue):** O(1)
- **Busca (indexOf):** O(n)

### DinamicQueueOP
- **Inserção (enQueue):** O(n) - devido à ordenação por prioridade
- **Remoção (deQueue):** O(1)
- **Busca (indexOf):** O(n)

### StaticQueue
- **Inserção (enQueue):** O(1) amortizado
- **Remoção (deQueue):** O(1)
- **Redimensionamento:** O(n) quando necessário

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Generics** - Para tipagem segura
- **Exception Handling** - Tratamento de erros

## 📝 Recursos Implementados

- ✅ Fila FIFO (First In, First Out)
- ✅ Fila com prioridade
- ✅ Redimensionamento automático
- ✅ Operações de busca e índice
- ✅ Tratamento de exceções
- ✅ Implementação genérica (suporte a qualquer tipo)

## 🚫 Tratamento de Erros

O projeto implementa tratamento adequado de erros:
- `IllegalStateException` - Quando tenta acessar fila vazia
- `NoSuchElementException` - Quando tenta remover de fila vazia
- `IndexOutOfBoundsException` - Quando índice está fora dos limites

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é de uso educacional e está disponível sob a licença MIT.

---

⭐ **Nota:** Este projeto foi desenvolvido para fins educacionais para demonstrar diferentes implementações de estruturas de dados de fila em Java.