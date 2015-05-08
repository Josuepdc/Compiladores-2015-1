/* 
* A primeira seção da especificação vai até o primeiro %%,
* e consiste de código Java que é copiado ao pé da letra
*
*/

package minijava;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

%%

/*
* A segunda seção vai até o próximo %%, e são diversos parâmetros
* de configuração, além de código Java copiado para o corpo da
* classe do analisador léxico
*
*/

%class Scanner          // nome da classe do analisador
%public                 // classe deve ser pública
%line                   // guarde número da linha em yyline
%column                 // guarde número da coluna em yycolumn
%function nextToken     // nome do método que vai fornecer um token
%type Token             // classe usado para tokens

// Código Java entre %{ e %} é copiado pro corpo da classe
// do analisador
%{ 

	public Scanner() { }

	public void input(String input) {
	    // inicializa entrada pro analisador
		yyreset(new StringReader(input));
	}
	
	public List<Token> tokens() throws IOException {
		List<Token> tokens = new ArrayList<Token>();
		Token tok = nextToken();
		while(tok.tipo != Token.EOF) {
			tokens.add(tok);
			tok = nextToken();
		}
		tokens.add(tok);
		return tokens;
	}

%}

%%

/*
* A última seção contém as regras léxicas, cada regra é um
* par com uma expressão regular e um trecho de código Java
* entre { e }.
*
*/

// Espaços são ignorados
[ \r\n\t\f]    { }



// Inicia Comentário
[/][*]                  { yybegin(COMMENT); }

// Leitura interna ao comentário
<COMMENT> {
  [*][/]                { yybegin(YYINITIAL); }
  // Todo o resto é ignorado, afinal é só um comentário
  .+                    { }
  \n                    { }
}



/* Palavras Reservadas */
boolean      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
class      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
extends      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
public      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
static      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
void      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
main      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
String      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
return      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
int      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
if      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
else				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
while				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
System.out.println				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
length					{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
true      				{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
false					{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
this					{ return new Token(Token.BOOLEAN, yyline, yycolumn); }
new						{ return new Token(Token.BOOLEAN, yyline, yycolumn); }



/* Operadores */
[!]				{ return new Token('!', yyline, yycolumn); }
[=]				{ return new Token('=', yyline, yycolumn); }
[=][=]				{ return new Token(Token.EQ, yyline, yycolumn); }
[!][=]				{ return new Token(Token.NEQ, yyline, yycolumn); }
[&][&]				{ return new Token(Token.AND, yyline, yycolumn); }
[<]				{ return new Token('<', yyline, yycolumn); }

[+]				{ return new Token('+', yyline, yycolumn); }
[-]				{ return new Token('-', yyline, yycolumn); }
[*]				{ return new Token('*', yyline, yycolumn); }
[/]				{ return new Token('/', yyline, yycolumn); }

[(]                     { return new Token('(', yyline, yycolumn); }
[)]                     { return new Token(')', yyline, yycolumn); }
[\[]                     { return new Token('[', yyline, yycolumn); }
[\]]                     { return new Token(']', yyline, yycolumn); }
[{]                     { return new Token('{', yyline, yycolumn); }
[}]                     { return new Token('}', yyline, yycolumn); }

[;]                     { return new Token(';', yyline, yycolumn); }
[.]                     { return new Token('.', yyline, yycolumn); }
[,]                     { return new Token(',', yyline, yycolumn); }


	
// Identificadores e numerais
[a-zA-Z]	   				{ return new Token(Token.ID, yytext(), yyline, yycolumn); }
[a-zA-Z_][a-zA-Z0-9_]+		{ return new Token(Token.ID, yytext(), yyline, yycolumn); }
[0-9]+	











// Regra para EOF
<<EOF>>      { return new Token(Token.EOF, yyline, yycolumn); }

// Erros léxicos 
.            { throw new RuntimeException("erro léxico, linha: " + 
               (yyline+1) + ", coluna : " + (yycolumn+1) + ", char: " + 
               yytext()); }

