# API Forbidden

Este é o controlador REST para o jogo Forbidden Land, responsável por lidar com as requisições relacionadas aos jogadores

## Endpoints

A seguir estão os endpoints disponíveis neste controlador:

### Listar todos os jogadores

`GET /game/player/all`

Este endpoint retorna uma lista de todos os jogadores presentes no banco de dados.

### Encontrar jogador por ID

`GET /game/player/find/{id}`

Este endpoint retorna as informações de um jogador específico com base no ID fornecido.

### Editar informações do jogador

PUT /game/player/edit/{id}


Este endpoint permite editar as informações de um jogador específico com base no ID fornecido. Os parâmetros para a edição das informações devem ser fornecidos como parâmetros de consulta na URL.

### Remover jogador

`DELETE /game/player/remove/{id}`


Este endpoint permite remover um jogador específico do banco de dados com base no ID fornecido.

### Adicionar jogador

`POST /game/player/add`


Este endpoint permite adicionar um novo jogador ao jogo. As informações do jogador devem ser fornecidas no corpo da requisição como um objeto JSON.

## Requisições e Respostas

### Adicionar jogador - Requisição

`POST /game/player/add`
Content-Type: application/json

`{
"health": 100,
"mana": 50,
"nickname": "Player1",
"level": 1,
"classe": "Warrior",
"damage": 10,
"defense": 5,
"isActive": true
}`

### Adicionar jogador - Resposta de sucesso

`HTTP/1.1 200 OK
Content-Type: application/json`

`{
"id": 1,
"health": 100,
"mana": 50,
"nickname": "Player1",
"level": 1,
"classe": "Warrior",
"damage": 10,
"defense": 5,
"isActive": true
}`


### Adicionar jogador - Resposta de erro

`HTTP/1.1 500 Internal Server Error`

## Como executar as requisições

Este controlador pode ser acessado localmente em `http://localhost:8080/forbiddenland-api`. Você pode usar uma ferramenta como cURL, Postman ou qualquer outra aplicação cliente REST para executar as requisições nos endpoints mencionados acima.

Certifique-se de que o serviço Forbidden Land esteja em execução e de que o banco de dados esteja corretamente configurado antes de realizar as requisições.

Espero que este README seja útil para entender e utilizar o controlador Forbidden Controller do jogo Forbidden Land. Se você tiver alguma dúvida adicional, não hesite em perguntar.




