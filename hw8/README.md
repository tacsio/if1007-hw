Homework 8 (tcs5)
=========

**Status**

:red_circle: Logging

:red_circle: Monitoring

 ## Logging
 
 __How to implement a custom centralized logging using Elasticsearch, Logstash, and Kibana (ELK)?__
Quando migramos de uma arquitetura tradicional para um ambiente em nuvem, as aplicações não estão mais restritas a "viver" em uma máquina e mesmo em aplicações tradicionais, os _logs_ das mesmas podem estar distribuídos entre as diversas réplicas da aplicação monolítica.
No contexto de microserviços auto-escaláveis, esse cenário ainda é mais evidente, uma vez que, ao adotar uma abordagem de utilização de containers, a característica fugaz do ciclo de vida dos containers em execução torna mandatória a adoção de uma abordagem de armazenamento dos logs, dado que a persistência dos dados em um container trata-se de uma camada 'extra' a ser incluída em sua execução[[1]][volumes]. 

Desta forma, a maneira recomendada para tratar _logs_ é através da abstraí-los em _Streams_ de eventos[[2]][21apps].
![logarch][logarch]

No caso da _stack_ ELK, através do **Logstash** o  _streams_ do log seria 'enviado' para uma base centralizada, o **Elastic**, onde iria indexá-los e realizar o processamento dos mesmo, para assim extrairmos informação através de um dashboard, no caso o **Kibana**, que seria responsável pela visualização das informações processadas.

![elk][elk] 

## Monitoring

__How to enhance The BrownField microservices with Spring Cloud Hystrix and Turbine to monitor latencies and failures in inter-service communications?__
Para monitorar a comunicação _inter-service_, através do Hystrix e o Hystrix dashboard, poderíamos aplicar o padrão _Circuit Breaker_ nos endpoints responsáveis por essa comunicação. Porém, como temos o contexto de microserviços auto-escaláveis na BrownField, utilizar apenas o Hystrix não é suficiente, uma vez que o Dashboard apenas só suporta o monitoramento de 1 stream hystrix por vez [3].

Nesse contexto, utilizamos o Turbine para agregar os vários streams, assim teremos uma visão holística da comunicação inter-serviços das várias instâncias do microserviço, identificando quantidade de requisições, percentuais de falhas, latência e até dados relativos a estatística descritiva das requisições em um determinado circuito.
![turbine][turbine]

## References
[[1] - Manage data in Docker][volumes]
[[2] - Logs][21apps]
[[3] - Hystrix Dashboard][hystrix]

Captions
=========
:red_circle: **todo**

:large_blue_circle: **doing**

:white_check_mark: **done**

[volumes]: https://docs.docker.com/storage/
[21apps]: https://12factor.net/logs
[hystrix]: https://github.com/Netflix-Skunkworks/hystrix-dashboard/wiki

[logarch]: https://github.com/tacsio/IF1007-HW/raw/master/hw8/img/arch.png
[elk]: https://github.com/tacsio/IF1007-HW/raw/master/hw8/img/elk.png
[turbine]: https://github.com/tacsio/IF1007-HW/raw/master/hw8/img/turbine.png
