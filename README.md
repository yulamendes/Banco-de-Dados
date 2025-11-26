<h1 align="center">📚 Sistema de Banco de Dados em Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=flat-square" alt="Status Badge"/>
  <img src="https://img.shields.io/badge/License-MIT-blue?style=flat-square" alt="License Badge"/>
</p>

--- 

## 👥 **Integrantes do grupo**
- 01786636 Daniel Tenorio Barbosa
- 01259839 Mariana Cristina da Silva Ferreira
- 01790685 Victor De Moraes Silva
- 01751630 Yula Eduarda Silva Mendes

## 🧩 Sobre o Projeto
Este projeto consiste em um sistema simples de gerenciamento de pessoas utilizando **Java** e conceitos fundamentais de **Programação Orientada a Objetos (POO)**.
Ele simula um **banco de dados** em memória, permitindo que o usuário execute operações de cadastro, listagem, edição e busca de registros diretamente pelo console.

---

## 🚀 Funcionalidades

O sistema oferece as seguintes operações:

- **Cadastrar pessoa**  
- **Listar pessoas cadastradas**  
- **Buscar pessoa pelo ID ou Nome**  
- **Editar dados de uma pessoa**  
- **Remover pessoa do banco de dados**  
- **Sair da aplicação**

---

## 🧩 Estrutura do Projeto

### **1. Pessoa.java**
Define a estrutura de dados da pessoa (ID, nome, idade, etc.).  
Inclui getters, setters e `toString()`.

---

### **2. BancoDeDados.java**
Gerencia o armazenamento das pessoas em memória com `ArrayList`.  
Permite adicionar, remover, editar e listar registros.

---

### **3. Menu.java**
Interface via console que exibe as opções e coleta entrada do usuário.

---

### **4. ListaMain.java**
Classe principal que inicia o programa chamando o menu.

---

## 🏗️ Tecnologias Utilizadas
- **Java 8+**  
- Programação Orientada a Objetos  
- Estruturas de dados (ArrayList)  
- Console I/O

---

## ▶️ Como Executar

1. Abra um terminal na pasta do projeto.
2. Compile todos os arquivos
3. Execute a aplicação: ListaMain.java
