/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CodeCraftGrammar;

@header{
package antlr4;
}


// starting point for parsing
program
    :  constantStatement* mainFunction functionList EOF 
    ;

constantStatement 
    : ABSOLUTE dataType ID ASSIGN expression SEMI     
    ;
// VARIABLE DECL

variableDeclaration 
    : dataType ID SEMI
    ;
dataType
    : INT       #dataTypeInt
    | FLOAT     #dataTypeFloat
    | CHAR      #dataTypeChar
    | STRING    #dataTypeString
    | BOOLEAN   #dataTypeBoolean
    ;
//Function Decl

functionList
    : functionDeclaration functionList
    |//e
    ;
functionDeclaration
    : returnType ID LPAREN parameterList? RPAREN block
    ;
returnType
    : dataType #returnDataType
    | DARKNESS  #returnDarkness
    ;
parameterList
    : parameter (COMMA parameterList)*	
    ;
parameter
    : dataType ID
    ;
block
    : LBRACE statement* RBRACE
    ;
mainFunction
    : DARKNESS MINE LPAREN parameterList RPAREN block
    ;

//Statement rules

statement
    : block #blockStatement
    | variableDeclaration   #varDec
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
    : ID ASSIGN expression    #assignExpr               
    | ID ASSIGN functionCallStatement    #assignFuncCall 
    ;
functionCallStatement
    : ID LPAREN actualParameterList RPAREN  #funcCallID
    | PRINT LPAREN actualParameterList RPAREN   #funcCallPrint
    | PRINTLN LPAREN actualParameterList RPAREN #funcCallPrintln
    ;
actualParameterList
    : actualParameters
    |//e
    ;
actualParameters
    : (expression) COMMA actualParameters   
    | (expression)
    ;
ifStatement
    : WETHER condition block OTHERWISE block  #ifelse
    | WETHER condition block #ifonly
    ;
condition
    : LPAREN booleanExpression RPAREN  
    ;
whileStatement
    : UNTIL condition block
    ;
doWhileStatement
    : EXECUTE block UNTIL condition SEMI
    ;
forStatement
    : AS LPAREN assignmentStatement SEMI booleanExpression SEMI assignmentStatement RPAREN block
    ;
returnStatement
    : REPLY expression SEMI
    ;

//expression rules

expression
    : StringLiteral #stringExpr
    | CharacterLiteral  #charExpr
    | numExpression #numExpr
    | booleanExpression #boolExpr
    | functionCallStatement #funcExpr
    | ID         #var
    | NULL  #nullExpr
    ;
numExpression
    : numTerm   #Term
    | numTerm ADD numExpression #add
    | numTerm SUB numExpression #sub
    ;
numTerm
    : numFactor #Factor
    | numFactor MUL numTerm #mul
    | numFactor DIV numTerm #div
    | numFactor MOD numTerm #mod
    ;
numFactor
    : LPAREN numExpression RPAREN   #parens
    | IntegerLiteral    #factorInt
    | FloatingPointLiteral    #factorFloat
    | functionCallStatement #funcNumExpr
    | ID  #numVar
    ;
booleanExpression
    : numExpression relationalOperator numExpression    #relational
    | booleanLogical EQUAL booleanExpression    #equal
    | booleanLogical NOTEQUAL booleanExpression #notequal
    | booleanLogical    #logical
    ;
relationalOperator
    : EQUAL #opEqual
    | NOTEQUAL  #opNotequal
    | GE    #opGreaterequal
    | LE    #opLessequal
    | GT    #opGreater
    | LT    #opLess
    ;
booleanLogical
    : booleanTerm OR booleanLogical #or
    | booleanTerm   #boolTerm
    ;
booleanTerm
    : booleanFactor AND booleanTerm #and
    | booleanFactor #boolFactor
    ;
booleanFactor
    : LPAREN booleanExpression RPAREN #boolParen
    | BANG booleanExpression    #bang
    | BooleanLiteral    #bool
    | ID  #boolVar
    ;
//LEXICAL RULES


// Keywords
PRINT           : 'print';
PRINTLN         : 'println';
SUMMON          : 'summon';
PARTY           : 'party';
ABSOLUTE        : 'absolute';
DARKNESS        : 'darkness';
MINE            : 'mine';
CHOKE           : 'choke';
PROLONG         : 'prolong';
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
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';              
              
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