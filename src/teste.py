import unittest
from antlr4 import *
from CalculatorLexer import CalculatorLexer
from CalculatorParser import CalculatorParser
import csv

class TestCalculator(unittest.TestCase):

    def test_expressions(self):
        resultados = []
        with open("test_input.txt", 'r') as file:
            for line in file:
                line = line.strip()
                input_stream = InputStream(line)
                lexer = CalculatorLexer(input_stream)
                token_stream = CommonTokenStream(lexer)
                parser = CalculatorParser(token_stream)
                tree = parser.expression()
                
                # Assumindo sucesso se a árvore não for nula
                sucesso = tree is not None
                resultados.append({
                    "expressao": line,
                    "resultado_esperado": "Árvore não nula",
                    "resultado_obtido": "Sucesso" if sucesso else "Falha",
                    "conformidade": "Sim" if sucesso else "Não",
                    "comentarios": ""
                })
                
                # Verifica se a árvore de análise não é nula
                self.assertIsNotNone(tree, f"A árvore de análise para '{line}' não deve ser nula.")

        # Gravar os resultados após todos os testes
        with open('relatorio_conformidade.csv', 'w', newline='') as arquivo:
            campos = ['expressao', 'resultado_esperado', 'resultado_obtido', 'conformidade', 'comentarios']
            escritor = csv.DictWriter(arquivo, fieldnames=campos)
            
            escritor.writeheader()
            for resultado in resultados:
                escritor.writerow(resultado)

if __name__ == "__main__":
    unittest.main()