# trabalho-backend-uninter
"Trabalho de Desenvolvimento Web Back-end - Uninter"

API de Gerenciamento de Tarefas

Projeto desenvolvido para a disciplina de Desenvolvimento Web Back-end do curso de Tecnologia em Banco de Dados da Uninter.

👨‍🎓 Identificação do Aluno

Nome: Douglas Alexander Scaramuzzi

RU: 5120066

📝 Sobre o Projeto

Este projeto consiste em uma API RESTful desenvolvida com Java e Spring Boot para o gerenciamento de tarefas. A aplicação permite realizar as operações básicas de CRUD (Create, Read, Update, Delete).

Funcionalidades

Criar Tarefa: Cadastra uma nova tarefa com nome, data de entrega e responsável.

Listar Tarefas: Exibe todas as tarefas cadastradas.

Buscar por ID: Retorna os detalhes de uma tarefa específica.

Atualizar Tarefa: Permite alterar os dados de uma tarefa existente.

Remover Tarefa: Exclui uma tarefa do banco de dados.

🛠️ Tecnologias Utilizadas

Java 17

Spring Boot 3

Spring Data JPA

H2 Database (Banco de dados em memória para facilitar os testes)

Maven (Gerenciador de dependências)

🚀 Como Rodar o Projeto

Clone este repositório ou baixe o arquivo ZIP.

Importe o projeto na sua IDE favorita (Eclipse, IntelliJ ou VS Code).

Aguarde o Maven baixar as dependências.

Execute a classe principal TarefasApplication.java.

A API estará disponível em: http://localhost:8081/api/tarefas

🧪 Testes (Endpoints)

Método

Endpoint

Descrição

POST

/api/tarefas

Cria uma nova tarefa

GET

/api/tarefas

Lista todas as tarefas

GET

/api/tarefas/{id}

Busca uma tarefa pelo ID

PUT

/api/tarefas/{id}

Atualiza uma tarefa existente

DELETE

/api/tarefas/{id}

Remove uma tarefa
