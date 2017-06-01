# xy-inc

Este projeto utiliza spring-boot. Para rodar o projeto, utilize o comando:

mvn clean spring-boot:run

no mesmo diretório em que se encontra o pom.xml.

O projeto se conecta a um banco MySql. O banco deve conter uma database chamada "poi". 
Na primeira execução através do spring-boot:run, o hibernate criará o que for necessário nessa database.
Para alterar os dados da coneção com o banco de dados, altere o arquivo /src/main/resources/application.properties

Após a criação das tabelas, execute os seguintes inserts no seu client do MySql para inserir os dados iniciais:

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (1,27,12,'Lanchonete');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (2,31,18,'Posto');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (3,15,12,'Joalheria');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (4,19,21,'Floricultura');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (5,12,8,'Pub');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (6,23,6,'Supermercado');

INSERT INTO poi (id,coordinate_x,coordinate_y,name) VALUES (7,28,2,'Churrascaria');

Foi criada uma autenticação através do spring-security. Por default, existe somente um usuário com o login:user e senha:password.
Para alterar os dados de autenticação, altere a classe com.xyinc.poi.WebSecurityConfig.java

Após se logar ao sistema, clique na aba POI. 
Essa tela lista os POIs já cadastrados. 
Dela, você pode cadastrar novos POIs através do botão cadastrar, ou realizar o cálculo de proximidade, através do botão Cálculo de Próximidade.
