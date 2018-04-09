Homework 6 (tcs5)
=========

**Status**

:white_check_mark: High availability for Eureka

:large_blue_circle: High availability of Zuul

 ## High availability for Eureka
 
 __How to get high availability with Eureka?__
 
Mesmo com a característica dos clientes Eureka de armazenar localmente as infomações de estado das dependências (dadas pelo servidor). Se esta informação passa muito tempo desatualizada, no caso de um downtime do servidor Eureka, o cache local pode comprometer a disponibilidade do serviço.

Como não existe uma base de dados centralizada, apenas o registro em memória nos servidores Eureka, sincronização ocorre através de troca de mensagens peer-to-peer entre si, assim para conseguir alta disponibilidade com Eureka é necessário utilizar uma abordagem bem tradicional. 

Um cluster com múltiplas instâncias por trás de um DNS ou load balancer local. Outra configuração necessária é fazer com que cada instância seja 'cliente' da outra e se registre com eu par, assim eles irão sincronizar corretamente seus dados.

## High availability of Zuul

__1. How to use Zuul proxy as the API gateway?__

__2.How to setup High availability capability of Zuul?__


## References


Captions
=========
:red_circle: **todo**

:large_blue_circle: **doing**

:white_check_mark: **done**

