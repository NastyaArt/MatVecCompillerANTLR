grammar Grammar;

O_BRACKET : '(';
C_BRACKET : ')';
O_FIGURE_BRACKET : '{';
C_FIGURE_BRACKET : '}';

VECTOR: 'vector';
MATRIX: 'matrix';

NAME: [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER: [0-9]+ ;
STRING: '"'(.)+?'"';

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
FUNCTION: 'func';
SHOW: 'show';
LENGTH: 'length';
GET: 'get';
ADD: 'add';
REMOVE: 'remove';

ASSIGN: '=';
DOT: '.';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
SEMICOLON: ';';

EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';

WS: [ \n\t\r]+ -> skip;

program: 'main' block (functionReturn|functionNonReturn)*;
block: O_FIGURE_BRACKET content* C_FIGURE_BRACKET;

declaration: type NAME SEMICOLON;
set: O_FIGURE_BRACKET NUMBER (COMMA NUMBER)* C_FIGURE_BRACKET;
vectorAssignment: VECTOR? NAME ASSIGN set SEMICOLON;
matrixAssignment: MATRIX? NAME ASSIGN O_FIGURE_BRACKET set (COMMA set)* C_FIGURE_BRACKET SEMICOLON;
assignment: type? NAME ASSIGN expression SEMICOLON;

showFunct: NAME DOT SHOW O_BRACKET C_BRACKET SEMICOLON;
getFunct: NAME DOT GET O_BRACKET NUMBER (COMMA NUMBER)? C_BRACKET SEMICOLON?;
lengthFunct: NAME DOT LENGTH O_BRACKET C_BRACKET SEMICOLON?;
addFunct: NAME DOT ADD O_BRACKET NUMBER C_BRACKET SEMICOLON;
removeFunct: NAME DOT REMOVE O_BRACKET NUMBER C_BRACKET SEMICOLON;

inputSignature: O_BRACKET NAME (COMMA NAME)* C_BRACKET;
functionCall: NAME (inputSignature | (O_BRACKET C_BRACKET)) SEMICOLON?;

type: MATRIX | VECTOR;
signatureFunction: O_BRACKET type NAME (COMMA type NAME)* C_BRACKET;
functionReturn: FUNCTION type NAME (signatureFunction|(O_BRACKET C_BRACKET)) blockReturn;
functionNonReturn: FUNCTION NAME (signatureFunction|(O_BRACKET C_BRACKET)) blockNonReturn;
blockReturn: O_FIGURE_BRACKET content* RETURN NAME SEMICOLON C_FIGURE_BRACKET;
blockNonReturn: O_FIGURE_BRACKET content* RETURN SEMICOLON C_FIGURE_BRACKET;

compareExpr: EQUAL|NON_EQUAL|LESS|GREATER;
compareOp: NUMBER | getFunct | lengthFunct;
compare: compareOp compareExpr compareOp | compareOp (PLUS|MINUS|MULTIPLY) compareOp;
elseBlock: ELSE block;
ifBlock: IF O_BRACKET compare C_BRACKET block elseBlock?;
whileBlock: WHILE O_BRACKET compare C_BRACKET block;
forBlock: FOR O_BRACKET compareOp ((PLUS|MINUS|MULTIPLY) compareOp)? C_BRACKET block;

expression: NAME PLUS NAME | NAME MINUS NAME | NAME MULTIPLY (NAME|NUMBER) | functionCall;

content: declaration | vectorAssignment | matrixAssignment | assignment | showFunct | addFunct |
         removeFunct | ifBlock | whileBlock | forBlock | functionCall;

