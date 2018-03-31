# JPA - Mapeamento e Relacionamento de Entidades
Repositório destinado ao código da atividade avaliativa 4 da disciplina de DAC 

#####  Observações:
 - A pasta filmes contém os requisitos do cenário 1 
	- Para esse cenário, como foi pedido: nada está sendo persistido.
 - A pasta naval contém os requisitos do cenário 2 
	- Nessa aplicação existe uma classe `Main` que executa a persistência do transporte (como pedido).
### Implantação da aplicação naval
####  Requisitos
 - Tenha o docker-compose instalado
#### Comandos
- Para rodar a aplicação abra o terminal no diretório /naval e execute
>**sh run.sh**
- Para desimplantar a aplicação abra o terminal no diretório /naval e execute
>**sh kill.sh**
- Verifique se a persistência aconteceu
>**sudo docker logs app**

Se tudo funcionou, nos logs da aplicação deve ter: TRANPORTE PERSISTIDO
- Para verificar as tabelas do banco execute
>**sudo docker exec -it banco psql -U postgres -d naval**

