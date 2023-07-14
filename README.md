# DSLIST Backend
Backend desenvolvido durante o intensivão java spring da DevSuperior <br>
Foi implementado na nuvem com esteira de CI/CD com o Railway
<br><br>
## 💻 Tecnologias Utilizadas nesse Projeto
<div style="display: inline_block">
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg">
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" />
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg" />
  <img align="center" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original-wordmark.svg" />
  
</div>
<br><br>

## Rotas Desenvolvidas
Para testagem foi utilizado a plataforma Postman
<br>
- GET /games > Pega todos os games
- GET /games/:id > Pega o game por id
- GET /lists > Pega as listas de games
- GET /lists/:listId/games > Pega os games por lista
- POST /lists/:listId/replacement > Muda a posição de um game passando na rota o id da lista, no body a posição inicial em que seu game está e a posição de destino que você quer colocar. Exemplo: { "sourceIndex": 1, "destinationIndex": 3 }  
<br><br>

## Link do Postman para acessar as rotas
https://www.postman.com/planetary-firefly-627422/workspace/dev-superior/collection/17431542-2acfab5b-cdd8-4d88-abfa-80f61f011b45?action=share&creator=17431542

<br><br>

## Link do backend implementado na nuvem
https://dslist-backend-production-d8af.up.railway.app/



