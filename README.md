# Trabalho de Construção de Interpretadores

Este é o repositório do trabalho da disciplina de Construção de Interpretadores. O trabalho consiste na implementação de um interpretador para uma calculadora simples, capaz de avaliar expressões aritméticas e armazenar valores em memória.

## Estrutura do Repositório

- src/: Pasta contendo o código-fonte do interpretador.
  - CalculatorLexer.py: Analisador léxico da calculadora, responsável por tokenizar a entrada.
  - CalculatorParser.py: Analisador sintático da calculadora, responsável por analisar a estrutura da entrada.
  - teste.py: Arquivo de teste para verificar o funcionamento do interpretador.

## Funcionamento do Interpretador

O interpretador implementado é capaz de avaliar expressões aritméticas simples, utilizando os operadores +, -, *, /, %, ^ e |. Além disso, ele suporta a utilização de memória, permitindo armazenar valores e referenciá-los posteriormente nas expressões.


Exemplo de uso:

## Arquivos de Teste

O arquivo de teste test_input.txt contém uma série de expressões que serão avaliadas pelo interpretador. Certifique-se de que as expressões estejam formatadas corretamente antes de executar o interpretador.

## Contribuindo

Se encontrar algum problema ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request. Toda contribuição é bem-vinda!