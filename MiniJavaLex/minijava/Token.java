package minijava;

public class Token {
	public int tipo;
	public String texto;
	public int lin;
	public int col;

	public final static int EOF        = 0;
	
	// Palavras reservadas
	public final static int BOOLEAN    = 1;
	public final static int CLASS      = 2;
	public final static int EXTENDS    = 3;
	public final static int PUBLIC     = 4;
	public final static int STATIC     = 5;
	public final static int VOID       = 6;
	public final static int MAIN       = 7;
	public final static int STRING     = 8;
	public final static int RETURN     = 9;
	public final static int INT        = 10;
	public final static int IF         = 11;
	public final static int ELSE       = 12;
	public final static int WHILE      = 13;
	public final static int PRINTLN    = 14;
	public final static int LENGTH     = 15;
	public final static int TRUE       = 16;
	public final static int FALSE      = 17;
	public final static int THIS       = 18;
	public final static int NEW        = 19;
	
	// Operadores
	public final static int EQ         = 20;
	public final static int NEQ        = 21;
	public final static int AND        = 22;
	
	// Identificadores e numerais
	public final static int ID         = 23;
	public final static int NUM        = 24;
	
	public final static String[] nomes = new String[] {
		"<<EOF>>",
		"boolean", "class", "extends", "public", "static",
		"void", "main", "String", "return", "int", "if",
		"else", "while", "System.out.println", "length",
		"true", "false", "this", "new", "==", "!=", "&&",
		"id", "num"
	};
	
	public Token(int tipo, String texto, int lin, int col) {
		this.tipo = tipo;
		this.texto = texto;
		this.lin = lin + 1;
		this.col = col + 1;
	}

	public Token(int tipo, int lin, int col) {
		this.tipo = tipo;
		this.texto = tipo < nomes.length ? nomes[tipo] :
			Character.toString((char)tipo);
		this.lin = lin + 1;
		this.col = col + 1;
	}

	@Override
	public boolean equals(Object other) {
		Token tok = (Token)other;
		return tipo == tok.tipo;
	}
	
	@Override
	public int hashCode() {
		return tipo;
	}

	@Override
	public String toString() {
		String tok = "," + lin + "," + col + ")";
		if(tipo < nomes.length && !texto.equals(nomes[tipo]))
			return "(" + nomes[tipo] + "," + texto + tok;
		else
			return "(" + texto + tok;
	}
}
