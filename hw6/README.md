Homework 6 (tcs5)
=========

**Status**

:white_check_mark: High availability for Eureka

:white_check_mark: High availability of Zuul

 ## High availability for Eureka
 
 __How to get high availability with Eureka?__
 
Mesmo com a característica dos clientes Eureka de armazenar localmente as infomações de estado das dependências (dadas pelo servidor). Se esta informação passa muito tempo desatualizada, no caso de um downtime do servidor Eureka, o cache local pode comprometer a disponibilidade do serviço.

Como não existe uma base de dados centralizada, apenas o registro em memória nos servidores Eureka, sincronização ocorre através de troca de mensagens peer-to-peer entre si, assim para conseguir alta disponibilidade com Eureka é necessário utilizar uma abordagem bem tradicional. 

Um cluster com múltiplas instâncias por trás de um DNS ou load balancer local. Outra configuração necessária é fazer com que cada instância seja 'cliente' da outra e se registre com eu par, assim eles irão sincronizar corretamente seus dados.

## High availability of Zuul

__1. How to use Zuul proxy as the API gateway?__
Teoricamente deveríamos configurar o proxy Zuul para consultar a lista de _Microservices (registro + referência)_, configurar uma arquitetura de _Chains & Interceptors_ para adicionar lógica à requisição ao proxy e no final da cadeia repassar ao _Microservice_ próprio a requisição, modificada ou não pela cadeia de interceptadores.

__2.How to setup High availability capability of Zuul?__
Como o Zuul é uma aplicação stateless, para configurar alta disponibilidade é necessário criar 'instâncias' da aplicação para redundância da aplicação. Porém, como se trata de um load balancer, no contexto de aplicações Spring Boot utilizando as capacidades do Spring Cloud, temos de diferenciar 2 cenários. O cenário em que a aplicação 'cliente' do Zuul é uma aplicação registrada no Eureka, e outro em que não existe essa 'facilidade'.

O Zuul, assim como outros diversos projetos da Netflix OSS, é uma aplicação Spring Boot portando podemos registrá-la como uma instância Eureka e o próprio Eureka irá resolver a alta disponibilidade. No caso em que o sistema não dispõe da utilização do Eureka, é necessário configurar um DNS ou LoadBalancer tradicional, contendo o registro das instâncias do Zuul.

## References


Captions
=========
:red_circle: **todo**

:large_blue_circle: **doing**

:white_check_mark: **done**

