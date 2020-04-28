# calclex.py

from sly import Lexer

class CalcLexer(Lexer):
    # Set of token names.   This is always required
    tokens = {  INT, FLOAT, BOOL, ID, WHILE, IF, ELSE, EQ, LE, GE, NE, AND, OR, RETURN, BREAK, NEW, SIZE,
                VOID, INT_LIT, FLOAT_LIT, BOOL_LIT, NEW,  SIZE, ENDIF, CONST, CHAR, CHAR_LIT}



    literals = { '+', '-', '*', '/', '(', ')', '{', '}', ';', '.', ',', '<', '>'
    , '=', '!', '[', ']','|', '&', '_', '’', '%', '!'}

    # String containing ignored characters
    ignore = ' \t'

    # Regular expression rules for tokens
    EQ      = r'=='
    LE      = r'<='
    GE      = r'>='
    NE      = r'!='
    AND      = r'&&'
    OR = r'(\|\|)'





    # Identifiers and keywords
    ID = r'[a-zA-Z_][a-zA-Z0-9_]*'
    ID['if'] = IF
    ID['else'] = ELSE
    ID['while'] = WHILE
    ID['float'] = FLOAT
    ID['bool'] = BOOL
    ID['return'] = RETURN
    ID['break'] = BREAK
    ID['new'] = NEW
    ID['size'] = SIZE
    ID['void'] = VOID
    ID['int_lit'] = INT_LIT
    ID['float_lit'] = FLOAT_LIT
    ID['bool_lit'] = BOOL_LIT
    ID['new'] = NEW
    ID['size'] = SIZE
    ID['endif'] = ENDIF
    ID['const'] = CONST
    ID['char'] = CHAR
    ID['char'] = CHAR_LIT


    ignore_comment = r'\#.*'

    @_(r'"\.{1}";')
    def CHAR(self,t):
    	return t


    @_(r'-?\d*\.\d*')
    def FLOAT(self,t):
        return t

    @_(r'\b[0][b][01]+\b')
    def BINARIO(self, t):
        numeroBinario  = t.value
        print("el numero binario %s es %d en decimal " %(numeroBinario,int(numeroBinario,2)))
        t.value = int(numeroBinario,2)
        return t

    @_(r'\b[0][o][0-7]+\b')
    def OCTAL(self, t):
        numeroOctal  = t.value
        print("el numero octal %s es %d en decimal " %(numeroOctal,int(numeroOctal,8)))
        t.value = int(numeroOctal,8)
        return t


    @_(r'-?[0-9]+(\.\d+)?[eE]-?\+?\d+')
    def CIENTIFICO(self,t):
        t.value=float(t.value)
        return t


    @_(r'0[xX][0-9a-fA-F]+')
    def HEXA (self, t):
        print("el numero hexadecimal %s es %d en el sistema decimal" %(t.value,int(t.value,16)))
        t.value = int(t.value,16)
        return t

    #^(?:(?<Accessibility>Public)\s)?Const\s(?<variable>[a-zA-Z][a-zA-Z0-9_]*(?:[%&@!#$])?(?:\sAs)?\s(?:(?:[a-zA-Z][a-zA-Z0-9_]*)\s)?=\s[^',]+(?:(?:(?!"").)+"")?(?:,\s)?){1,}(?:'(?<comment>.+))?$



    @_(r'[-]?\d+')
    def INT(self, t):
        t.value = int(t.value)
        if t.value < -2147483648 or t.value > 2147483647:
            print("\n*************************ERROR!!!!!***************************")
            print("el numero %d que aparece en la linea %d no esta permitido" %(t.value,t.lineno))
            print("**************************************************************\n")
        else: return t

    # Line number tracking
    @_(r'\n+')
    def ignore_newline(self, t):
        self.lineno += t.value.count('\n')

    @_(r'(/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+/)|(//.*)')
    def COMENTARIO(self, t):
        #toca sumarle 1 al contador de lineas del lexer porque si \n esta
        #dentro de un token, no lo detecta en la funcion t_newline()
    	self.lineno += 1
    	return t

    @_(r'/\*(.|\n)+$')
    def ERRORCOMENTARIOMULTILINEA(self,t):

    	print("\n*************************ERROR!!!!!r'-?\d+\.\d+'***************************")
    	print("Comentario multilinea sin cerrar en la linea %d" %t.lineno)
    	print("**************************************************************\n")





    def error(self, t):
        print("\n*************************ERROR!!!!!***************************")
        print('Linea %d: Caracter no valido %r' % (self.lineno, t.value[0]))
        print("**************************************************************\n")
        self.index += 1

if __name__ == '__main__':
	#main()
    data = '''
# Counting
void main (void) {
; 8E2
X0FA
}
'''

    lexer = CalcLexer()
    for tok in lexer.tokenize(data):
        print(tok)
