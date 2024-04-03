grammar Calculator;

// Definição dos tokens
NUMBER : INTEGER | DECIMAL ;
INTEGER : [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ;

// Definição dos operadores
PLUS        : '+';
MINUS       : '-';
MULTIPLY    : '*';
DIVIDE      : '/';
MODULO      : '%';
POWER       : '^';
REAL_DIVIDE : '|';

// Outros símbolos
RES : 'RES';
MEM : 'MEM';

// Definição de regras sintáticas
expression  : term ((PLUS | MINUS) term)*;
term        : factor ((MULTIPLY | DIVIDE | MODULO | POWER) factor)*
            | REAL_DIVIDE expression REAL_DIVIDE ; // Modificado para tratar a divisão real
factor      : NUMBER | '(' expression ')' | RES | MEM;

// Ignorar espaços em branco e quebras de linha
WS : [ \t\r\n]+ -> skip ;