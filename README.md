# 🚗 Estacionamento Restaurante
Este é um sistema simples de gerenciamento de estacionamento para um restaurante. Ele permite adicionar veículos, remover veículos e verificar a disponibilidade de vagas.

## 📌 Funcionalidades
✅ Estacionar um veículo (Verifica se há vagas disponíveis antes de adicionar)
✅ Remover um veículo (Calcula o valor total a pagar com base no tempo estacionado)
✅ Verificar o status do estacionamento (Total de vagas, vagas ocupadas e preço por hora)
✅ Conectar-se a um banco de dados Oracle

## 🛠 Tecnologias Utilizadas
- Java (JDK 8+)

- JDBC (Para conexão com o banco de dados)

- Banco de Dados Oracle

- Git e GitHub

## ⚙️ Como Executar o Projeto
1️⃣ Pré-requisitos
📌 Certifique-se de ter instalado:

- JDK 8+

- Oracle Database

- Git

## 2️⃣ Clonar o repositório
Abra o terminal e execute:

```
git clone https://github.com/RafaelDevProjects/Restaurante_ModuloRestauraten.git
cd Restaurante_ModuloRestauraten
```

## 3️⃣ Configurar o Banco de Dados
Crie uma tabela estacionamento e veiculo no Oracle com os seguintes comandos SQL:

```
CREATE TABLE estacionamento (
    id NUMBER PRIMARY KEY,
    total_vagas NUMBER NOT NULL,
    vagas_ocupadas NUMBER DEFAULT 0,
    preco_por_hora NUMBER NOT NULL
);


CREATE TABLE veiculo (
    placa VARCHAR2(10) PRIMARY KEY,
    modelo VARCHAR2(50) NOT NULL,
    horas_estacionado NUMBER NOT NULL,
    estacionamento_id NUMBER REFERENCES estacionamento(id)
);
```

## 4️⃣ Compilar e executar o projeto
```
javac -d bin -sourcepath src src/br/com/restaurante/estacionamento/Main.java
java -cp bin br.com.restaurante.estacionamento.Main
```

## 🚀 Como Usar
1️⃣ Inicie o programa
2️⃣ Escolha uma das opções do menu:

1 → Estacionar um veículo (Informe a placa, modelo e horas estacionado)

2 → Remover um veículo (Informe a placa e veja o valor a pagar)

3 → Consultar o status do estacionamento

4 → Sair do programa
