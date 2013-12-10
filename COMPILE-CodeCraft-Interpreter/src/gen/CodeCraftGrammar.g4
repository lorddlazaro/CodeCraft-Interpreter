/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CodeCraftGrammar;

@header{
package gen;
}

program
    :  constantStatement* mainFunction functionDeclaration* EOF 
    ;
constantStatement 
    : ABSOLUTE dataType ID ASSIGN expression SEMI     
    ;
variableDeclaration 
    : dataType ID 
    ;
dataType
    : INT       
    | FLOAT     
    | CHAR     
    | STRING    
    | BOOLEAN   
    ;
functionDeclaration
    : returnType ID parameterList block
    ;
returnType
    : dataType #returnDataType
    | DARKNESS  #returnDarkness
    ;
parameterList
    : LPAREN parameter? (COMMA parameter)* RPAREN
    ;
parameter
    : dataType ID
    ;
block
    : LBRACE statement* RBRACE
    ;
mainFunction
    : DARKNESS MINE parameterList block
    ;

statement
    : block #blockStatement
    | variableDeclaration SEMI  #varDec
    | assignmentStatement SEMI  #assign
    | functionCallStatement SEMI #funcCall
    | ifStatement   #if
    | whileStatement    #while
    | doWhileStatement  #dowhile
    | forStatement  #for
    | returnStatement   #return
    | CHOKE SEMI    #choke
    ;
assignmentStatement
    : ID ASSIGN expression
    ;
functionCallStatement
    : ID actualParameters  #funcCallID
    | PRINT actualParameters   #funcCallPrint
    | PRINTLN actualParameters #funcCallPrintln
    ;
actualParameters
    : LPAREN expression? (COMMA expression)* RPAREN
    ;
ifStatement
    : WETHER condition block OTHERWISE block  #ifelse
    | WETHER condition block #ifonly
    ;
condition
    : LPAREN expression RPAREN  
    ;
whileStatement
    : UNTIL condition block
    ;
doWhileStatement
    : EXECUTE block UNTIL condition SEMI
    ;
forStatement
    : AS LPAREN assignmentStatement SEMI expression SEMI assignmentStatement RPAREN block
    ;
returnStatement
    : REPLY expression SEMI
    ;
expression
    : '!' expression #bangExpr
    | '(' expression ')'  #parensExpr
    | expression ('*'|'/'|'%') expression #multdivmodExpr
    | expression ('+'|'-') expression   #addminusExpr
    | expression ('>='|'<='|'<'|'>') expression  #relationalExpr
    | expression ('=='|'!=') expression               #equalityExpr
    | expression '&&' expression               #andExpr
    | expression '||' expression                #orExpr
    | IntegerLiteral #intExpr
    | BooleanLiteral #boolExpr
    | FloatingPointLiteral #floatExpr
    | StringLiteral #stringExpr
    | CharacterLiteral #charExpr
    | ID actualParameters #funcCallExpr
    | ID         #idExpr
    | NULL  #nullExpr
    ;
//LEXICAL RULES
// Keywords
PRINT           : 'print';
PRINTLN         : 'println';
ABSOLUTE        : 'absolute';
DARKNESS        : 'darkness';
MINE            : 'mine';
CHOKE           : 'choke';
WETHER          : 'wether';
OTHERWISE       : 'otherwise';
UNTIL           : 'until';
EXECUTE         : 'execute';
AS              : 'as';
REPLY           : 'reply';
NULL            : 'NULL';
INT             : 'int';
CHAR            : 'char';
STRING          : 'string';
FLOAT           : 'float';
BOOLEAN         : 'boolean';
                   
// Separators
LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
SEMI            : ';';
COMMA           : ',';          
              
// Operators
ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
MOD             : '%';

//Literals
IntegerLiteral
    :   '0'
    |   NonZeroDigit Digits
    ;
fragment
Digits
    : Digit
    | Digit Digits
    | //e
    ;
fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;
fragment
NonZeroDigit
    :   [1-9]
    ;
FloatingPointLiteral
    :   Digits '.' Digits?
    |   '.' Digits
    ;
CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;
fragment
SingleCharacter
    :   ~['\\]
    ;
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    : StringCharacter
    | StringCharacter StringCharacters
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    ;
BooleanLiteral
    : 'true'
    | 'false'
    ;
ID
    :   Letter LetterOrDigit*
    ;
fragment
Letter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;
fragment
LetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

//
// Whitespace and comments
//
WS  :  [ \t\r\n\u000C]+ -> skip
    ;
COMMENT
    :   '/*' .*? '*/' -> skip
    ;
LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;