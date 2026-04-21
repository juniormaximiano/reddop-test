# 📋 Reddop Test

Resolução de 3 exercícios propostos em teste técnico, desenvolvidos em **Java**, com execução via terminal nos exercícios 1 e 2, e aplicação separada no exercício 3.

---

## 📁 Estrutura do Projeto

```
reddop-test/
├── src/
│   ├── exercicio1/
│   └── exercicio2/
└── exercicio3/
    └── Tarefas/
```

---

## 🧩 Exercícios
### Exercício 1 — Segundo maior número distinto

Função que recebe uma lista de números inteiros e retorna o **segundo maior número distinto**.

**Regras:**
- Se existir um segundo maior número distinto, ele deve ser retornado
- Caso contrário, o retorno deve ser `null`

**Exemplo:**

```
Entrada: [3, 2, 1, 5, 5, 4]
Saída:   4
```

---

### Exercício 2 — Situação dos alunos

Programa que recebe uma lista de nomes e uma lista de notas, exibindo a situação de cada aluno e os totais por categoria.

**Critérios de avaliação:**

| Nota           | Situação      |
|----------------|---------------|
| >= 7           | ✅ Aprovado    |
| >= 5 e < 7     | 🔄 Recuperação |
| < 5            | ❌ Reprovado   |

**Exemplo:**

```
Entrada:
  nomes = ["Ana", "Bruno", "Carlos", "Diana"]
  notas = [8, 4, 7, 6]

Saída:
  Ana    -> Aprovado
  Bruno  -> Reprovado
  Carlos -> Aprovado
  Diana  -> Recuperação

  Aprovados:    2
  Recuperação:  1
  Reprovados:   1
```

---

### Exercício 3 — Aplicação de Tarefas

Aplicação para **gerenciamento de tarefas**, com as seguintes funcionalidades:

- 📝 Cadastro de tarefa com título, descrição, data de vencimento e status
- 🔄 Alteração de status da tarefa
- 📅 Listagem de tarefas ordenadas por data de vencimento (ordem decrescente)

**Status disponíveis:**

| Status       |
|--------------|
| Pendente     |
| Em Andamento |
| Concluída    |

---

## 🛠️ Tecnologias Utilizadas

- **Java** — linguagem principal
- Estruturas nativas da linguagem (sem frameworks externos)
- Execução via terminal nos exercícios 1 e 2

---

## ▶️ Como Executar

### Pré-requisitos

- Java instalado (JDK recomendado)
- IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse) ou terminal configurado

### Passos

1. Clone o repositório
2. Navegue até o diretório do exercício desejado
3. Compile e execute o arquivo correspondente

```bash
# Exemplo para exercício 1
javac src/exercicio1/Main.java
java -cp src exercicio1.Main
```

> O exercício 3 está em diretório separado (`exercicio3/`) e deve ser executado de forma independente.

---

## 📌 Observações

- O foco deste repositório foi a **resolução objetiva** dos problemas propostos
- Não foi implementado frontend nos exercícios 1 e 2, conforme permitido no enunciado
- O exercício 3 foi organizado em diretório próprio por decisão de estrutura durante o desenvolvimento

---
