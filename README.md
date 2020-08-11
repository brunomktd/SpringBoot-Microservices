# SpringBoot-Microservices
Aplicação desenvolvida com Spring Boot utilizando micro serviços através do curso DevDojo

Baixe o projeto e espere baixar as dependências

Acesse o diretório microservices e rode o comando
docker-compose -f stack.yml up

Acesse seu client de banco de dados e crie o database devdojo

Em seguida rode as aplicações na seguinte sequência:

DiscoveryApplication
GatewayApplication
AuthApplication
CourseApplication


As aplicações estarão rodando

Discovery (Eureka) - http://localhost:8081
Gateway (Netflix Zuul) - http://localhost:8080
Auth (Spring Security com JWT) - http://localhost:8083
Course (Spring boot com JPA) - http://localhost:8082

Documentações Swagger podem ser conferidas através das seguintes uri's:
Auth - http://localhost:8080/gateway/auth/swagger-ui.html
Course - http://localhost:8080/gateway/course/swagger-ui.html
