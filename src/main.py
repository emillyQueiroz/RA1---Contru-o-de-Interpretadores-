from antlr4 import *
from CalculatorLexer import CalculatorLexer
from CalculatorParser import CalculatorParser
from antlr4.tree.Trees import Trees
from graphviz import Digraph
import sys

class CalculatorListener(ParseTreeListener):
    def enterExpression(self, ctx):
        print("Entrou na expressão:", ctx.getText())

    def exitExpression(self, ctx):
        print("Saiu da expressão:", ctx.getText())

def generate_tree_diagram(tree, parser, filename):
    dot = Digraph(comment='Árvore de Análise')
    
    # Corrigido: Acessando a lista de nomes das regras através de parser.ruleNames
    ruleNames = parser.ruleNames
    
    def add_node(dot, parent, child):
        if child is not None:
            # Atualizado: Passar ruleNames diretamente para toStringTree
            label = Trees.getNodeText(child, ruleNames=ruleNames).replace('\'', '')
            dot.node(str(id(child)), label)
            if parent is not None:
                dot.edge(str(id(parent)), str(id(child)))
            for i in range(child.getChildCount()):
                add_node(dot, child, child.getChild(i))
                
    add_node(dot, None, tree)
    dot.render(filename, view=True)

def process_expression(expression, visualize=False, filename=None):
    input_stream = InputStream(expression)
    lexer = CalculatorLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = CalculatorParser(token_stream)
    tree = parser.expression()
    
    if visualize:
        if filename is not None:
            generate_tree_diagram(tree, parser, filename)  # Agora passando 'filename'
        else:
            raise ValueError("O nome do arquivo deve ser fornecido para visualização da árvore")

def main():
    visualize = "--visualize" in sys.argv
    counter = 1  # Contador para gerar nomes de arquivo únicos

    with open("test_input.txt", 'r') as file:
        for line in file:
            line = line.strip()
            if line:
                print(f"Processando: {line}")
                output_filename = f'output_tree_{counter}.gv'  # Nome de arquivo baseado no contador
                process_expression(line, visualize=visualize, filename=output_filename)
                counter += 1  # Incremento do contador para o próximo arquivo

if __name__ == "__main__":
    main()
