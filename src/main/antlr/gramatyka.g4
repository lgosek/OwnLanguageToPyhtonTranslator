grammar gramatyka;

//Tokeny:
AND :       'and';
OR:         'or';
FUN:        'fun';
IF:         'if';
ELSIF:      'elsif';
ELSE:       'else';
WHILE:      'while';
FOR:        'for';
SWITCH:     'switch';
CASE:       'case';
DEFAULT:    'default';
RETURN:     'return';
BREAK:      'break';

LPAR:       '(';
RPAR:       ')';
LCURL:      '{';
RCURL:      '}';

ASSIGN:     '=';
PLUS:       '+';
MINUS:      '-';
MULTIPLY:   '*';
DIVIDE:     '/';

EQUAL:      '==';
LT:         '<';
GT:         '>';
LE:         '<=';
GE:         '>=';

SEMICOL:    ';';
DOT:        '.';
COMMA:      ',';


STRING_LITERAL:   '\"' ('\'\'' | ~('\''))* '\"';
IDENT:            ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

NUM_INT:          ('0'..'9')+;
NUM_REAL:         ('0'..'9')+ DOT ('0'..'9')+;

//gramatyka

program
  : (functionDeclaration | instructions)+ EOF
  ;

identifier
  : IDENT
  ;

value
  : number
  | STRING_LITERAL
  ;

number
  : NUM_INT
  | NUM_REAL
  ;

functionCall
  : identifier LPAR arguments? RPAR
  ;

functionDeclaration
  : FUN identifier LPAR argumentsDeclaration RPAR LCURL functionBody RCURL
  ;

values
  : value
  | identifier
  | mathOperation
  ;

argumentsDeclaration
  : identifier (COMMA identifier)*
  ;

arguments
  : values (COMMA values)*
  ;

functionBody
  : instructions? r_return?
  ;

r_return
  : RETURN values
  ;

instructions
  :instruction+
  ;

instruction
  : assigment
  | r_if
  | r_while
  | r_for
  | r_switch
  | functionCall
  ;

assigment
  : identifier ASSIGN (values | functionCall)
  ;

mathOperation
  : operand operator (operand | mathOperation)
  ;

operand
  : number
  | identifier
  ;

operator
  : PLUS
  | MINUS
  | MULTIPLY
  | DIVIDE
  ;

r_if
  : IF LPAR logicalOperation RPAR LCURL instructions? RCURL elsif* r_else?
  ;

elsif
  : ELSIF LPAR logicalOperation RPAR LCURL instructions? RCURL
  ;

r_else
  :ELSE LCURL instructions? RCURL
  ;

logicalOperation
  : logicalOperand logicalOperator (logicalOperand | logicalOperation)
  ;

logicalOperand
  : number
  | identifier
  ;

logicalOperator
  : EQUAL
  | LT
  | GT
  | LE
  | GE
  ;

r_while
  : WHILE LPAR logicalOperation RPAR LCURL loopBody RCURL
  ;

r_for
  : FOR LPAR assigment SEMICOL logicalOperation SEMICOL assigment RPAR LCURL loopBody RCURL
  ;

loopBody
    : (instruction|BREAK)*
    ;

r_switch
  : SWITCH LPAR identifier RPAR LCURL switchContent RCURL
  ;

switchContent
  : r_case+ r_default?
  ;

r_case
  : CASE LPAR values RPAR LCURL instructions? BREAK? RCURL
  ;

r_default
  : DEFAULT LCURL instructions? BREAK? RCURL
  ;

 WS : (' ' | '\t'|'\n')+ -> channel(HIDDEN);