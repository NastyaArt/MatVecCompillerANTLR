grammar Grammar;

O_BRACKET: '(';
C_BRACKET: ')';
O_FIGURE_BRACKET: '{';
C_FIGURE_BRACKET: '}';

MATRIX: 'matrix';
VECTOR: 'vector';
INT: 'int';

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
FUNCTION: 'func';
PRINT: 'print';
LENGTH: 'length';
NCOL: 'ncol';
NROW: 'nrow';
SET: 'set';
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

SPACE: [ \n\t\r]+ -> skip;

NAME: [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER: [0-9]+ ;
STRING: '"'(.)+?'"';


program: 'main' block (functionReturn|functionNonReturn)*;
block: O_FIGURE_BRACKET content* C_FIGURE_BRACKET;

declaration: type NAME SEMICOLON;
set: O_FIGURE_BRACKET NUMBER (COMMA NUMBER)* C_FIGURE_BRACKET;
intAssignment: INT? NAME ASSIGN NUMBER SEMICOLON;
vectorAssignment: VECTOR? NAME ASSIGN set SEMICOLON;
matrixAssignment: MATRIX? NAME ASSIGN O_FIGURE_BRACKET set (COMMA set)* C_FIGURE_BRACKET SEMICOLON;
assignment: type? NAME ASSIGN expression SEMICOLON;

printFunc: NAME DOT PRINT O_BRACKET C_BRACKET SEMICOLON;
getFunc: NAME DOT GET O_BRACKET (NAME|NUMBER) (COMMA (NAME|NUMBER))? C_BRACKET SEMICOLON?;
setFunc: NAME DOT SET O_BRACKET (NAME|NUMBER) (COMMA (NAME|NUMBER))? COMMA (intOperation|NAME|NUMBER|getFunc) C_BRACKET SEMICOLON;
lengthFunc: NAME DOT LENGTH O_BRACKET C_BRACKET SEMICOLON?;
ncolFunc: NAME DOT NCOL O_BRACKET C_BRACKET SEMICOLON?;
nrowFunc: NAME DOT NROW O_BRACKET C_BRACKET SEMICOLON?;
addFunc: NAME DOT ADD O_BRACKET NUMBER C_BRACKET SEMICOLON;
removeFunc: NAME DOT REMOVE O_BRACKET NUMBER C_BRACKET SEMICOLON;

inputSignature: O_BRACKET NAME (COMMA NAME)* C_BRACKET;
functionCall: NAME (inputSignature | (O_BRACKET C_BRACKET)) SEMICOLON?;

type: MATRIX | VECTOR;
signatureFunction: O_BRACKET type NAME (COMMA type NAME)* C_BRACKET;
functionReturn: FUNCTION type NAME (signatureFunction|(O_BRACKET C_BRACKET)) blockReturn;
functionNonReturn: FUNCTION NAME (signatureFunction|(O_BRACKET C_BRACKET)) blockNonReturn;
blockReturn: O_FIGURE_BRACKET content* RETURN NAME SEMICOLON C_FIGURE_BRACKET;
blockNonReturn: O_FIGURE_BRACKET content* RETURN SEMICOLON C_FIGURE_BRACKET;

compareExpr: EQUAL|NON_EQUAL|LESS|GREATER;
compareOp: NUMBER | NAME | getFunc | lengthFunc | ncolFunc | nrowFunc;
compare: compareOp compareExpr compareOp | compareOp (PLUS|MINUS|MULTIPLY) compareOp;
elseBlock: ELSE block;
ifBlock: IF O_BRACKET compare C_BRACKET block elseBlock?;
whileBlock: WHILE O_BRACKET compare C_BRACKET block;
forBlock: FOR O_BRACKET intAssignment compare SEMICOLON NAME ASSIGN intOperation C_BRACKET block;

intOperation: (NAME|NUMBER|getFunc) (PLUS|MINUS|MULTIPLY) (NAME|NUMBER|getFunc);
expression: NAME PLUS (NAME|NUMBER) | NAME MINUS (NAME|NUMBER) | NAME MULTIPLY (NAME|NUMBER) | functionCall;

content: declaration | vectorAssignment | matrixAssignment | intAssignment | assignment | printFunc | addFunc |
         removeFunc | ifBlock | whileBlock | forBlock | functionCall | setFunc;
