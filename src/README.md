# Sistema de Gestão de Funcionários

Este é um projeto de exemplo de um sistema de gestão de funcionários desenvolvido em Java com Spring Boot. O sistema
permite o cadastro de funcionários, vendedores e gerentes, além de calcular valores relacionados aos salários e
benefícios dos funcionários.

## Classes

#### Funcionário

- A classe Funcionario representa um funcionário genérico da empresa, contendo nome, cargo e salário base.

#### Vendedor

- A classe Vendedor estende Funcionario e adiciona o campo vendasNoMes para rastrear o número de vendas
  realizadas no
  mês.

#### Empresa

- A classe Empresa contém todas as interações e métodos.

## Operações

O sistema oferece as seguintes operações:

- Cálculo do total pago (salário e benefício) a funcionários em um determinado mês.
- Cálculo do total pago somente em salários no mês.
- Cálculo do total pago em benefícios no mês.
- Identificação do funcionário que recebeu o valor mais alto no mês.
- Identificação do funcionário que recebeu o valor mais alto em benefícios no mês.
- Identificação do vendedor que mais vendeu no mês.

## Tecnologias Utilizadas

- Java

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades para este projeto. Basta fazer um fork do
repositório, implementar as mudanças e enviar um pull request.

Obrigado por usar o Sistema de Gestão de Funcionários!
