Homework 4 (tcs5)
=========

**Status**

:white_check_mark: Service endpoint design consideration. 

:white_check_mark: Use of ESB and iPaaS with microservices.

:large_blue_circle: Microservices challenges - Data islands.


 ## Service endpoint design consideration.
 
 __1. What is the main concepts and principles of Consumer Driven Contracts (CDC)?__

Consumer driven contracts (CDC) não é um conceito novo, mas com o advento de microserviços vem tornando-se mais e mais conhecido. CDC se trata de um padrão utilizado para evolução de serviços onde o provedor de serviço 'se compromete' a suprir as necessidades de cada consumidor. 
Essas necessidades são descritas através de contratos entre cliente e provedor, que guiam o desenvolvimento do serviço (API) a partir do ponto de vista dos clientes.

Os principais conceitos de CDC são: 
- Consumers: A parte que irá 'consumir' serviço (cliente da API)
- Provider: A parte provedora do serviço (quem deve garantir os diversos contratos)
- Contrato: O 'pacto' entre _Consumers_ e _Providers_. Descreve um conjunto de restrições que descreve como devem se comportar as interações entre as partes.


__2. How does it fit into the microservices approach?__

CDC ganhou certa visibilidade e está alinhado a arquitetura de _microservices_ uma vez que foca na evolução de serviços não limitando esta evolução, nem estritamente ao ponto de vista do provedor do serviço (_provider contract_), nem ao ponto de vista do consumidor do mesmo, mas a um contrato definido entre as partes garantindo a compatibilidade da comunicação. Assim, ao utilizar uma abordagem baseada em _microservices_ onde diversas composições de serviços são realizadas _on the fly_, garatir que ambas as partes 'falem a mesma língua' permite a evolução e validação do serviço (_provider_ & _client_) de maneira ágil e independente.



__3. How Postel's law could be also relevant in this scenario?__

_Be conservative in what you do, be liberal in what you accept from others (often reworded as "Be conservative in what you send, be liberal in what you accept")._

A lei de Postel praticamente descreve o cenário. No CDC o provedor do serviço deve ser 'liberal' e aceitar diversos contratos de seus clientes, porém, uma vez que o contrato é defindo, ele deve manter-se 'conservador' ao que foi definido no contrato, mantendo a integridade e robustez da comunicação.


__4. What are the main solutions (patterns, architectural styles, tools, etc.) to implement:__
- __Message-oriented services:__ MoMs (Message-oriented middleware), Reactive programming), Kafka, RabbitMQ & Streamming, etc.
- __HTTP and REST endpoints:__ Java::Spring boot, Rails::Roar, Python::Restless, Elixir::Phoenix, Json-Server, Postman
- __Optimized communication protocols:__ AMPQ (Advanced Message Queuing Protocol), Apache Thrift, Finagle, etc.
- __API documentations:__ RestDocs, CDC (Consumer Driven Contracts), Swagger, API Studio,  


## Use of ESB and iPaaS with microservices

__1. How can we have the same features present in EBS's with lightweight tools in the universe of microservices? Justify your answer.__

Diferente de um ESB onde existe a figura do barramento central onde a 'inteligência' é concentrada, no universo de _microservices_ existe um 'ecossistema' onde essa 'inteligência' passa a ser coletiva. _"Smart Endpoints and Dumb Pipes."_
Desta forma, as _features_ presentes no ESB, de uma maneira geral, passam a integrarar o ecosistema de maneira descentralizada. 

- Transformação, envio e armazenamento de mensagens são 'convertidos' em soluções distribuídas de eventos.
- Segurança e auditoria(_tracing_) da comunicação evoluíram para novos protocolos de distribuídos utilizando tokens de validação e correlação de _requests_.
- Roteamento passa a fazer parte do serviço, tornando a solução utilizada coerente com a necessidade. _(Evita a velha bazuca matadora de formigas)_.


## Microservices challenges - Data islands


## References
[[1] - Consumer-Driven Contracts: A Service Evolution Pattern][cdc1]

[[2] - Pact][cdc2]

[[3] - Spring Cloud Contract in a polyglot world][cdc3]

[[4] -  A collection of useful resources for building RESTful HTTP+JSON APIs.][api-dev4]

[[5] - Microservice Principles: Smart Endpoints and Dumb Pipes][micro5]

Captions
=========
:red_circle: **todo**

:large_blue_circle: **doing**

:white_check_mark: **done**

[cdc1]: https://martinfowler.com/articles/consumerDrivenContracts.html
[cdc2]: https://docs.pact.io/
[cdc3]: https://spring.io/blog/2018/02/13/spring-cloud-contract-in-a-polyglot-world
[api-dev4]: https://github.com/yosriady/api-development-tools
[micro5]: https://medium.com/@nathankpeck/microservice-principles-smart-endpoints-and-dumb-pipes-5691d410700f
