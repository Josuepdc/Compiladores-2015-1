/* The following code was generated by JFlex 1.6.1 */

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


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/igorvaz/git/Compiladores-2015-1/MiniJavaLex/minijava/minijava.jflex</tt>
 */
public class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\4\1\6\1\5\1\5\22\0\1\1\1\36\4\0"+
    "\1\40\1\0\1\44\1\45\1\3\1\42\1\54\1\43\1\53\1\2"+
    "\12\57\1\0\1\52\1\41\1\37\3\0\22\55\1\27\7\55\1\46"+
    "\1\0\1\47\1\0\1\56\1\0\1\13\1\7\1\15\1\21\1\12"+
    "\1\32\1\31\1\34\1\24\2\55\1\11\1\26\1\14\1\10\1\22"+
    "\1\55\1\30\1\16\1\20\1\23\1\25\1\33\1\17\1\35\1\55"+
    "\1\50\1\0\1\51\7\0\1\6\u1fa2\0\1\6\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\20\5\1\6\1\7"+
    "\1\1\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\1\1\24\2\2"+
    "\1\25\13\5\1\26\7\5\1\27\1\30\1\31\1\32"+
    "\34\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\140\0\220\0\140\0\300\0\360"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\u0420\0\140\0\140\0\140\0\140\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\360\0\u0450\0\u0480"+
    "\0\u04b0\0\140\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\360\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\140\0\140\0\140"+
    "\0\u0480\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0"+
    "\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0"+
    "\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\u10e0"+
    "\0\u1110\0\u1140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\2\4\1\0\1\7\1\10"+
    "\1\11\1\12\1\10\1\13\1\14\1\15\1\10\1\16"+
    "\1\10\1\17\1\10\1\20\1\21\1\22\1\23\1\24"+
    "\1\10\1\25\1\26\2\10\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\10\1\46\1\47\3\50\1\51"+
    "\1\4\2\0\51\50\63\0\1\52\63\0\1\10\1\53"+
    "\25\10\17\0\3\10\7\0\27\10\17\0\3\10\7\0"+
    "\3\10\1\54\23\10\17\0\3\10\7\0\2\10\1\55"+
    "\5\10\1\56\16\10\17\0\3\10\7\0\3\10\1\57"+
    "\23\10\17\0\3\10\7\0\2\10\1\60\24\10\17\0"+
    "\3\10\7\0\11\10\1\61\15\10\17\0\3\10\7\0"+
    "\21\10\1\62\3\10\1\63\1\10\17\0\3\10\7\0"+
    "\14\10\1\64\12\10\17\0\3\10\7\0\5\10\1\65"+
    "\15\10\1\66\3\10\17\0\3\10\7\0\1\10\1\67"+
    "\25\10\17\0\3\10\7\0\4\10\1\70\22\10\17\0"+
    "\3\10\7\0\11\10\1\71\14\10\1\72\17\0\3\10"+
    "\7\0\3\10\1\73\23\10\17\0\3\10\7\0\4\10"+
    "\1\74\22\10\17\0\3\10\7\0\25\10\1\75\1\10"+
    "\17\0\3\10\37\0\1\76\57\0\1\77\60\0\1\100"+
    "\76\0\1\47\4\50\3\0\53\50\1\101\1\50\3\0"+
    "\51\50\7\0\1\10\1\102\25\10\17\0\3\10\7\0"+
    "\5\10\1\103\21\10\17\0\3\10\7\0\7\10\1\104"+
    "\17\10\17\0\3\10\7\0\11\10\1\105\15\10\17\0"+
    "\3\10\7\0\24\10\1\66\2\10\17\0\3\10\7\0"+
    "\4\10\1\106\22\10\17\0\3\10\7\0\4\10\1\107"+
    "\22\10\17\0\3\10\7\0\14\10\1\104\12\10\17\0"+
    "\3\10\7\0\15\10\1\110\11\10\17\0\3\10\7\0"+
    "\1\111\26\10\17\0\3\10\7\0\11\10\1\66\15\10"+
    "\17\0\3\10\7\0\15\10\1\112\11\10\17\0\3\10"+
    "\7\0\15\10\1\113\11\10\17\0\3\10\7\0\21\10"+
    "\1\114\5\10\17\0\3\10\7\0\7\10\1\115\17\10"+
    "\17\0\3\10\7\0\11\10\1\116\15\10\17\0\3\10"+
    "\7\0\2\10\1\55\24\10\17\0\3\10\7\0\15\10"+
    "\1\117\11\10\17\0\3\10\7\0\2\10\1\120\24\10"+
    "\17\0\3\10\7\0\22\10\1\121\4\10\17\0\3\10"+
    "\7\0\3\10\1\66\23\10\17\0\3\10\7\0\3\10"+
    "\1\122\23\10\17\0\3\10\7\0\7\10\1\110\17\10"+
    "\17\0\3\10\7\0\11\10\1\123\15\10\17\0\3\10"+
    "\7\0\7\10\1\66\17\10\17\0\3\10\7\0\2\10"+
    "\1\123\24\10\17\0\3\10\7\0\12\10\1\66\14\10"+
    "\17\0\3\10\7\0\5\10\1\66\21\10\17\0\3\10"+
    "\7\0\15\10\1\124\11\10\17\0\3\10\7\0\11\10"+
    "\1\125\15\10\17\0\3\10\7\0\14\10\1\126\12\10"+
    "\17\0\3\10\7\0\2\10\1\104\24\10\17\0\3\10"+
    "\7\0\3\10\1\127\23\10\17\0\3\10\7\0\11\10"+
    "\1\130\15\10\17\0\3\10\7\0\5\10\1\131\21\10"+
    "\17\0\3\10\7\0\15\10\1\132\11\10\17\0\3\10"+
    "\7\0\5\10\1\133\21\10\17\0\3\10\7\0\3\10"+
    "\1\134\23\10\17\0\3\10\7\0\21\10\1\113\5\10"+
    "\17\0\3\10\7\0\4\10\1\113\22\10\17\0\3\10"+
    "\7\0\25\10\1\66\1\10\17\0\3\10\7\0\12\10"+
    "\1\110\14\10\17\0\3\10\7\0\6\10\1\66\20\10"+
    "\17\0\3\10\7\0\22\10\1\66\4\10\17\0\3\10"+
    "\7\0\17\10\1\135\7\10\17\0\3\10\4\136\3\0"+
    "\27\137\17\136\3\137\10\0\1\140\56\0\1\10\1\141"+
    "\25\10\17\0\3\10\23\0\1\142\43\0\14\10\1\143"+
    "\12\10\17\0\3\10\20\0\1\144\46\0\11\10\1\145"+
    "\15\10\17\0\3\10\4\146\3\0\55\146\3\0\27\147"+
    "\17\146\3\147\22\0\1\150\44\0\13\10\1\151\13\10"+
    "\17\0\3\10\30\0\1\152\36\0\21\10\1\153\5\10"+
    "\17\0\3\10\24\0\1\154\42\0\15\10\1\155\11\10"+
    "\17\0\3\10\14\0\1\156\52\0\5\10\1\157\21\10"+
    "\17\0\3\10\20\0\1\160\46\0\11\10\1\161\15\10"+
    "\17\0\3\10\11\0\1\162\55\0\2\10\1\113\24\10"+
    "\17\0\3\10\14\0\1\163\43\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4464];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\1\1\1\11\23\1\14\11\4\1\1\11"+
    "\23\1\3\11\35\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                return new Token(Token.EOF,yyline, yycolumn);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("erro léxico, linha: " + 
               (yyline+1) + ", coluna : " + (yycolumn+1) + ", char: " + 
               yytext());
            }
          case 27: break;
          case 2: 
            { 
            }
          case 28: break;
          case 3: 
            { return new Token('/', yyline, yycolumn);
            }
          case 29: break;
          case 4: 
            { return new Token('*', yyline, yycolumn);
            }
          case 30: break;
          case 5: 
            { return new Token(Token.ID, yytext(), yyline, yycolumn);
            }
          case 31: break;
          case 6: 
            { return new Token('!', yyline, yycolumn);
            }
          case 32: break;
          case 7: 
            { return new Token('=', yyline, yycolumn);
            }
          case 33: break;
          case 8: 
            { return new Token('<', yyline, yycolumn);
            }
          case 34: break;
          case 9: 
            { return new Token('+', yyline, yycolumn);
            }
          case 35: break;
          case 10: 
            { return new Token('-', yyline, yycolumn);
            }
          case 36: break;
          case 11: 
            { return new Token('(', yyline, yycolumn);
            }
          case 37: break;
          case 12: 
            { return new Token(')', yyline, yycolumn);
            }
          case 38: break;
          case 13: 
            { return new Token('[', yyline, yycolumn);
            }
          case 39: break;
          case 14: 
            { return new Token(']', yyline, yycolumn);
            }
          case 40: break;
          case 15: 
            { return new Token('{', yyline, yycolumn);
            }
          case 41: break;
          case 16: 
            { return new Token('}', yyline, yycolumn);
            }
          case 42: break;
          case 17: 
            { return new Token(';', yyline, yycolumn);
            }
          case 43: break;
          case 18: 
            { return new Token('.', yyline, yycolumn);
            }
          case 44: break;
          case 19: 
            { return new Token(',', yyline, yycolumn);
            }
          case 45: break;
          case 20: 
            { return new Token(Token.NUM, yytext(), yyline, yycolumn);
            }
          case 46: break;
          case 21: 
            { yybegin(COMMENT);
            }
          case 47: break;
          case 22: 
            { return new Token(Token.BOOLEAN, yyline, yycolumn);
            }
          case 48: break;
          case 23: 
            { return new Token(Token.NEQ, yyline, yycolumn);
            }
          case 49: break;
          case 24: 
            { return new Token(Token.EQ, yyline, yycolumn);
            }
          case 50: break;
          case 25: 
            { return new Token(Token.AND, yyline, yycolumn);
            }
          case 51: break;
          case 26: 
            { yybegin(YYINITIAL);
            }
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
