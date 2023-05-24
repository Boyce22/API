## Arsenal Game API - README

Este README fornece informações sobre a API do Arsenal Game, que permite gerenciar armas no arsenal do jogo.

### Começando

Para começar com a API do Arsenal Game, siga as instruções abaixo.

### URL Base

A URL base para acessar a API é: `http://localhost:8080/arsenal/game`

### Endpoints

#### Obter Todas as Armas

- **URL:** `/all`
- **Método:** `GET`
- **Descrição:** Recupera uma lista de todas as armas no arsenal.

#### Obter Arma por ID

- **URL:** `/{weaponId}`
- **Método:** `GET`
- **Descrição:** Recupera uma arma específica pelo ID.

#### Adicionar Arma

- **URL:** `/add`
- **Método:** `POST`
- **Descrição:** Adiciona uma nova arma ao arsenal. Os detalhes da arma devem ser fornecidos no corpo da solicitação no formato JSON.

Exemplo de corpo da solicitação:

{
"name": "Espada Mágica",
"damage": 50,
"description": "Uma espada poderosa imbuida de magia",
"nature": "Físico",
"isActive": true
}

#### Editar Arma

- **URL:** `/edit/{weaponId}`
- **Método:** `PUT`
- **Descrição:** Atualiza os detalhes de uma arma existente no arsenal. O ID da arma a ser atualizada deve ser fornecido na URL, e os novos detalhes devem ser fornecidos no corpo da solicitação no formato JSON.

Exemplo de corpo da solicitação:

{
"name": "Arco Élfico",
"damage": 40,
"description": "Um arco mágico feito pelos elfos",
"nature": "À distância"
}


#### Remover Arma

- **URL:** `/remove/{weaponId}`
- **Método:** `DELETE`
- **Descrição:** Remove uma arma do arsenal. O ID da arma a ser removida deve ser fornecido na URL. A arma será marcada como inativa.

### Exemplos

Aqui estão alguns exemplos de como usar a API do Arsenal Game:

- Para obter uma lista de todas as armas do arsenal:

GET http://localhost:8080/arsenal/game/all


- Para obter informações sobre uma arma específica (ID da arma = 1):

GET http://localhost:8080/arsenal/game/1


- Para adicionar uma nova arma ao arsenal:

POST http://localhost:8080/arsenal/game/add

Corpo da solicitação:
{
"name": "Espada Mágica",
"damage": 50,
"description": "Uma espada poderosa imbuida de magia",
"nature": "Físico",
"isActive": true
}


- Para atualizar os detalhes de uma arma existente (ID da arma = 2):

PUT http://localhost:8080/arsenal/game/edit/2

Corpo da solicitação:
{
"name": "Arco Élfico",
"damage": 40,
"description": "Um arco poderoso"
"nature": "Físico",
"isActive": true
}

- Para remover uma arma

Delete http://localhost:8080/arsenal/game/remove/{weaponId}

Corpo da solicitação:
{
"name": "Arco Élfico",
"damage": 40,
"description": "Um arco poderoso"
"nature": "Físico",
"isActive": false
}




