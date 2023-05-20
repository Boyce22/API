# Pharmamax API

A API Pharmamax é uma aplicação para gerenciar produtos de uma loja de produtos farmacêuticos. Ela permite listar, buscar, atualizar, deletar e cadastrar produtos no banco de dados.

## Endpoints

A API possui os seguintes endpoints:

### Listar produtos da loja

Endpoint: `GET /pharma/produtos`

Este endpoint retorna a lista de todos os produtos cadastrados na loja.

### Buscar produto por código

Endpoint: `GET /pharma/{codigo}`

Este endpoint recebe o código do produto como parâmetro na URL e retorna as informações do produto correspondente.

### Atualizar nome e valor do produto

Endpoint: `PUT /pharma/atualizar/{codigo}`

Este endpoint permite atualizar o nome e o valor de um produto existente. É necessário fornecer o código do produto como parâmetro na URL e enviar o novo nome e valor do produto como parâmetros na requisição.

### Deletar produto

Endpoint: `DELETE /pharma/deletar/{codigo}`

Este endpoint permite deletar um produto existente com base no seu código. É necessário fornecer o código do produto como parâmetro na URL.

### Cadastrar produto

Endpoint: `POST /pharma`

Este endpoint permite cadastrar um novo produto no banco de dados. É necessário enviar as informações do produto no corpo da requisição.

## Executando a aplicação

Para executar a aplicação, siga os seguintes passos:

1. Certifique-se de ter o ambiente de desenvolvimento configurado com o JDK e o Maven instalados.

2. Clone o repositório do projeto.

git clone https://github.com/seu-usuario/pharmamax-api.git

3. Acesse o diretório do projeto.

cd pharmamax-api

4. Execute o comando Maven para compilar e executar a aplicação.

mvn spring-boot:run

5. A API estará disponível no seguinte endereço: `http://localhost:8080/pharma`

## Considerações finais

A API Pharmamax oferece funcionalidades básicas para gerenciar produtos de uma loja farmacêutica. Utilize os endpoints fornecidos para realizar as operações desejadas. Sinta-se à vontade para explorar e adaptar o código de acordo com as necessidades do seu projeto.



