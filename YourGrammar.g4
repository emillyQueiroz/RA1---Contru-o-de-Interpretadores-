grammar SuaGramatica;

expr: expr '+' expr
    | expr '-' expr
    | NUMBER
    ;

NUMBER: [0-9]+ ;
