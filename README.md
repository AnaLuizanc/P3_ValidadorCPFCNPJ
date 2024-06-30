# P3_ValidadorCPFCNPJ

O objetivo é planejar, construir e testar uma classe capaz de realizar validar CPFs e CNPJs.

## Requisitos

Elabore a classe apresentada contendo os métodos estáticos indicados.
O método ```obterDigito(long, int):int``` recebe um inteiro longo como fonte de pesquisa e um inteiro
como indicador do dígito a ser recuperado como resposta. Esse método, portanto, extrai um dado dígito de
um inteiro longo.

O método ```obterDigito(long, int):int``` deve ser empregado internamente ao método
```isCpfValido(long):boolean``` a fim validar CPFs recebidos como parâmetros.

O método ```obterDigito(long, int):int``` deve ser empregado internamente ao método
```isCpfValido(String):boolean``` a fim validar CPFs recebidos como parâmetros.

O ```método obterDigito(long, int):int``` deve ser empregado internamente ao método
```isCnpjValido(long):boolean``` a fim validar CNPJs recebidos como parâmetros.

O ```método obterDigito(long, int):int``` deve ser empregado internamente ao método
```isCnpjValido(String):boolean``` a fim validar CNPJs recebidos como parâmetros.

Os métodos que recebem strings devem converter tais strings em inteiros longos e operar sobre estes
inteiros. Nenhuma outra operação deve ser executada sobre strings.
Elabore um diagrama UML de classes completo que modele a solução.

## Testes

Teste 1
CPF: 14230703058
Resposta: Válido

Teste 2
CPF: 142.307.030-58
Resposta: Válido

Teste 3
CPF: 230703058
Resposta: Inválido

Teste 4
CPF: 002.307.030-58
Resposta: Inválido

Teste 5
CPF: 456789014
Resposta: Válido

Teste 6
CNPJ: 35.017.120/0001-86
Resposta: Válido

Teste 7
CNPJ: 35017120000186
Resposta: Válido

Teste 8
CNPJ: 35.017.120/0001-88
Resposta: Inválido