/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: F:\eclipse-workspace\decaf_PA1B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 18:29:38 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SEALED = 285; //# line 22
    public static final int TOR = 286; //# line 22
    public static final int DMOD = 287; //# line 22
    public static final int SCOPY = 288; //# line 22
    public static final int IN = 289; //# line 22
    public static final int VAR = 290; //# line 22
    public static final int FOREACH = 291; //# line 22
    public static final int DADD = 292; //# line 22
    public static final int DEFAULT = 293; //# line 22
    
    public static final int ExprDAdd = 294;
    public static final int VariableDef = 295;
    public static final int ExprT5 = 296;
    public static final int GuardedCont = 297;
    public static final int Oper3 = 298;
    public static final int Oper6 = 299;
    public static final int VariableList = 300;
    public static final int Formals = 301;
    public static final int Oper7 = 302;
    public static final int IfSubStmt = 303;
    public static final int Expr8 = 304;
    public static final int AfterSimpleTypeExpr = 305;
    public static final int Constants = 306;
    public static final int Expr2 = 307;
    public static final int Oper2 = 308;
    public static final int SealedOpt = 309;
    public static final int ExprDMod = 310;
    public static final int MoreConstants = 311;
    public static final int OperDAdd = 312;
    public static final int IfBranchs = 313;
    public static final int Expr6 = 314;
    public static final int BreakStmt = 315;
    public static final int ExprT2 = 316;
    public static final int StmtList = 317;
    public static final int Constant = 318;
    public static final int SubVariableList = 319;
    public static final int PrintStmt = 320;
    public static final int ForStmt = 321;
    public static final int Expr9 = 322;
    public static final int Expr1 = 323;
    public static final int ArrayConstant = 324;
    public static final int GuardedStmt = 325;
    public static final int Oper1 = 326;
    public static final int ElseClause = 327;
    public static final int ExprDAddT = 328;
    public static final int FieldList = 329;
    public static final int IfBranch = 330;
    public static final int SubExprList = 331;
    public static final int ExprDModT = 332;
    public static final int AfterParenExpr = 333;
    public static final int ClassDef = 334;
    public static final int ReturnStmt = 335;
    public static final int ExprList = 336;
    public static final int StmtBlock = 337;
    public static final int FunctionField = 338;
    public static final int AfterIdentExpr = 339;
    public static final int Program = 340;
    public static final int Expr = 341;
    public static final int Type = 342;
    public static final int Expr5 = 343;
    public static final int AfterNewExpr = 344;
    public static final int Assignment = 345;
    public static final int ExtendsClause = 346;
    public static final int Oper5 = 347;
    public static final int ArrayType = 348;
    public static final int Expr3 = 349;
    public static final int Actuals = 350;
    public static final int Variable = 351;
    public static final int ExprT3 = 352;
    public static final int Stmt = 353;
    public static final int SimpleStmt = 354;
    public static final int SimpleType = 355;
    public static final int WhileStmt = 356;
    public static final int ExprT1 = 357;
    public static final int IfSuf = 358;
    public static final int Expr4 = 359;
    public static final int ExprT4 = 360;
    public static final int ReturnExpr = 361;
    public static final int OperDMod = 362;
    public static final int IfStmt = 363;
    public static final int OCStmt = 364;
    public static final int ExprT6 = 365;
    public static final int ExprT8 = 366;
    public static final int SubArrayExpr = 367;
    public static final int Expr7 = 368;
    public static final int ClassList = 369;
    public static final int Oper4 = 370;
    public static final int Field = 371;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 294;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SEALED", "TOR",
        "DMOD", "SCOPY", "IN", "VAR", "FOREACH",
        "DADD", "DEFAULT", "ExprDAdd", "VariableDef", "ExprT5",
        "GuardedCont", "Oper3", "Oper6", "VariableList", "Formals",
        "Oper7", "IfSubStmt", "Expr8", "AfterSimpleTypeExpr", "Constants",
        "Expr2", "Oper2", "SealedOpt", "ExprDMod", "MoreConstants",
        "OperDAdd", "IfBranchs", "Expr6", "BreakStmt", "ExprT2",
        "StmtList", "Constant", "SubVariableList", "PrintStmt", "ForStmt",
        "Expr9", "Expr1", "ArrayConstant", "GuardedStmt", "Oper1",
        "ElseClause", "ExprDAddT", "FieldList", "IfBranch", "SubExprList",
        "ExprDModT", "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList",
        "StmtBlock", "FunctionField", "AfterIdentExpr", "Program", "Expr",
        "Type", "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause",
        "Oper5", "ArrayType", "Expr3", "Actuals", "Variable",
        "ExprT3", "Stmt", "SimpleStmt", "SimpleType", "WhileStmt",
        "ExprT1", "IfSuf", "Expr4", "ExprT4", "ReturnExpr",
        "OperDMod", "IfStmt", "OCStmt", "ExprT6", "ExprT8",
        "SubArrayExpr", "Expr7", "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {SEALED, CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {DADD},
        {TOR, Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('[')},
        {Integer.valueOf('{')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {DADD, LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {TOR},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {DMOD, LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {SEALED, CLASS},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, IF},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {DMOD},
        {Integer.valueOf('(')},
        {SCOPY},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {SEALED, CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 294);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {TOR, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('}')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {TOR, Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 294);
    }
    
    public Table() {
        for (int i = 0; i < 78; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 566
            case ExprDAdd: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(ExprDMod, ExprDAddT));
                    default: return null;
                }
            }
            //# line 50
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 646
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(2, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case DADD:
                    case AND:
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 276
            case GuardedCont: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList(IfSubStmt, IfBranchs));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 354
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 414
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 176
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 166
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList());
                    default: return null;
                }
            }
            //# line 431
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 302
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 702
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 821
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 871
            case Constants: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Constant, MoreConstants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 479
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 347
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 109
            case SealedOpt: {
                switch (lookahead) {
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(SEALED));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList());
                    default: return null;
                }
            }
            //# line 602
            case ExprDMod: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(Expr5, ExprDModT));
                    default: return null;
                }
            }
            //# line 879
            case MoreConstants: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(Integer.valueOf(','), Constant, MoreConstants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList());
                    default: return null;
                }
            }
            //# line 395
            case OperDAdd: {
                switch (lookahead) {
                    case DADD:
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(DADD));
                    default: return null;
                }
            }
            //# line 284
            case IfBranchs: {
                switch (lookahead) {
                    case TOR:
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(IfBranch, IfBranchs));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList());
                    default: return null;
                }
            }
            //# line 663
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 933
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 491
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 203
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 845
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 186
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 965
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 927
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 765
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 450
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 859
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(Integer.valueOf('['), Constants, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 268
            case GuardedStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(Integer.valueOf('{'), GuardedCont, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 340
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 945
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case TOR:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 582
            case ExprDAddT: {
                switch (lookahead) {
                    case DADD:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(OperDAdd, ExprDMod, ExprDAddT));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList());
                    default: return null;
                }
            }
            //# line 126
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList());
                    default: return null;
                }
            }
            //# line 295
            case IfBranch: {
                switch (lookahead) {
                    case TOR:
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(TOR, IfSubStmt));
                    default: return null;
                }
            }
            //# line 908
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList());
                    default: return null;
                }
            }
            //# line 614
            case ExprDModT: {
                switch (lookahead) {
                    case DMOD:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(OperDMod, Expr5, ExprDModT));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case DADD:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList());
                    default: return null;
                }
            }
            //# line 833
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 103
            case ClassDef: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(SealedOpt, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 952
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 900
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 197
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 158
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 758
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case DMOD:
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 28
            case Program: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 444
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 84
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 634
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 807
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 331
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 119
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 402
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 93
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList());
                    default: return null;
                }
            }
            //# line 508
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 890
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList());
                    default: return null;
                }
            }
            //# line 56
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 520
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 211
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(OCStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(IF, IfSuf));
                    default: return null;
                }
            }
            //# line 316
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 62
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 921
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 462
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 258
            case IfSuf: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(IfStmt));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(GuardedStmt));
                    default: return null;
                }
            }
            //# line 537
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(ExprDAdd, ExprT4));
                    default: return null;
                }
            }
            //# line 549
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(Oper4, ExprDAdd, ExprT4));
                    case ']':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 958
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 388
            case OperDMod: {
                switch (lookahead) {
                    case DMOD:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(DMOD));
                    default: return null;
                }
            }
            //# line 939
            case IfStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 309
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 675
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 732
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(Integer.valueOf('['), Expr, SubArrayExpr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 722
            case SubArrayExpr: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(Integer.valueOf(':'), Expr));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList());
                    default: return null;
                }
            }
            //# line 692
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 39
            case ClassList: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList());
                    default: return null;
                }
            }
            //# line 366
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 142
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 567
                if(params[2].svec==null) params[0].expr = params[1].expr ;
                else{
                	int len=params[2].svec.size() ;
                	params[0].expr = params[2].evec.get(len-1);
                	for(int i = len-2 ; i>=0; --i){
                		params[0].expr = new Tree.Binary(params[2].svec.get(i+1), params[2].evec.get(i),
                		 		params[0].expr, params[2].lvec.get(i+1));
                	}
                	params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr,
                				params[0].expr, params[2].lvec.get(0)) ;
                }
                return;
            }
            case 1: {
                //# line 51
                params[0].vdef = params[1].vdef;
                return;
            }
            case 2: {
                //# line 647
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 3: {
                /* no action */
                return;
            }
            case 4: {
                //# line 277
                params[0].gif = new GuardedIf(params[2].glist, params[2].loc) ;
                params[0].gif.fields.add(0, new IfSubStmt(params[1].expr, params[1].stmt, params[1].loc)) ;
                return;
            }
            case 5: {
                /* no action */
                return;
            }
            case 6: {
                //# line 355
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 360
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 415
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 420
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 425
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 177
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 12: {
                //# line 167
                params[0].vlist = params[1].vlist;
                return;
            }
            case 13: {
                //# line 171
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 14: {
                //# line 432
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 15: {
                //# line 437
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 303
                params[0].expr = params[1].expr ;
                params[0].stmt = params[3].stmt ;
                return;
            }
            case 17: {
                //# line 703
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(false, params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 18: {
                //# line 822
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 19: {
                //# line 827
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 20: {
                //# line 872
                params[0].elist = params[2].elist ;
                params[0].elist.add(0, params[1].expr) ;
                return;
            }
            case 21: {
                /* no action */
                return;
            }
            case 22: {
                //# line 480
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 23: {
                //# line 348
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 24: {
                //# line 110
                params[0] = params[1] ;
                return;
            }
            case 25: {
                //# line 114
                params[0] = new SemValue() ;
                return;
            }
            case 26: {
                //# line 603
                params[0].expr = params[1].expr ;
                if (params[2].svec != null) {
                                      for (int i = 0; i < params[2].svec.size(); ++i) {
                                          params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                                              params[2].evec.get(i), params[2].lvec.get(i));
                                      }
                                  }
                return;
            }
            case 27: {
                //# line 880
                params[0].elist = params[3].elist ;
                params[0].elist.add(0, params[2].expr) ;
                return;
            }
            case 28: {
                //# line 885
                params[0].elist = new ArrayList<Tree.Expr>() ;
                return;
            }
            case 29: {
                //# line 396
                params[0].counter = Tree.DADD;
                params[0].loc = params[1].loc;
                return;
            }
            case 30: {
                //# line 285
                params[0].glist=params[2].glist ;
                params[0].glist.add(0, new IfSubStmt(params[1].expr, params[1].stmt, params[1].loc)) ;
                return;
            }
            case 31: {
                //# line 290
                params[0].glist = new ArrayList<IfSubStmt>() ;
                return;
            }
            case 32: {
                //# line 664
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 33: {
                //# line 934
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 34: {
                //# line 492
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 35: {
                /* no action */
                return;
            }
            case 36: {
                //# line 204
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 37: {
                /* no action */
                return;
            }
            case 38: {
                //# line 846
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 39: {
                //# line 850
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 40: {
                //# line 854
                params[0].expr = params[1].acons ;
                return;
            }
            case 41: {
                //# line 187
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 42: {
                /* no action */
                return;
            }
            case 43: {
                //# line 966
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 44: {
                //# line 928
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 45: {
                //# line 766
                params[0].expr = params[1].expr;
                return;
            }
            case 46: {
                //# line 770
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 47: {
                //# line 774
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 48: {
                //# line 778
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 49: {
                //# line 782
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 50: {
                //# line 790
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 51: {
                //# line 794
                params[0].expr = params[2].expr;
                return;
            }
            case 52: {
                //# line 798
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(false, null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 53: {
                //# line 451
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 54: {
                //# line 860
                if(params[2].elist != null){
                	params[0].acons = new Tree.ArrayConstant(params[2].elist, params[2].loc) ;
                }
                else{
                	params[0].acons = new Tree.ArrayConstant(new ArrayList<Tree.Expr>(), params[2].loc) ;
                }
                return;
            }
            case 55: {
                //# line 269
                params[0].stmt = params[2].gif ;
                if(params[0].stmt==null)
                	params[0].stmt = new GuardedIf(new ArrayList<IfSubStmt>() , params[1].loc) ;
                return;
            }
            case 56: {
                //# line 341
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 57: {
                //# line 946
                params[0].stmt = params[2].stmt;
                return;
            }
            case 58: {
                /* no action */
                return;
            }
            case 59: {
                //# line 583
                params[0].svec = new Vector<Integer>() ;
                params[0].lvec = new Vector<Location>() ;
                params[0].evec = new Vector<Expr>() ;
                params[0].svec.add(params[1].counter) ;
                params[0].lvec.add(params[1].loc) ;
                params[0].evec.add(params[2].expr) ;
                if(params[3].svec!=null){
                	params[0].svec.addAll(params[3].svec) ;
                	params[0].lvec.addAll(params[3].lvec) ;
                	params[0].evec.addAll(params[3].evec) ;
                }
                return;
            }
            case 60: {
                //# line 597
                params[0].svec = null ;
                return;
            }
            case 61: {
                //# line 127
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 62: {
                //# line 137
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 63: {
                //# line 296
                params[0].expr = params[2].expr;
                params[0].stmt = params[2].stmt;
                return;
            }
            case 64: {
                //# line 909
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 65: {
                //# line 915
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 66: {
                //# line 615
                params[0].svec = new Vector<Integer>() ;
                params[0].lvec = new Vector<Location>() ;
                params[0].evec = new Vector<Expr>() ;
                params[0].svec.add(params[1].counter) ;
                params[0].lvec.add(params[1].loc) ;
                params[0].evec.add(params[2].expr) ;
                if(params[3].svec!=null){
                	params[0].svec.addAll(params[3].svec) ;
                	params[0].lvec.addAll(params[3].lvec) ;
                	params[0].evec.addAll(params[3].evec) ;
                }
                return;
            }
            case 67: {
                //# line 629
                params[0].svec = null ;
                return;
            }
            case 68: {
                //# line 834
                params[0].expr = params[1].expr;
                return;
            }
            case 69: {
                //# line 838
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 70: {
                //# line 104
                params[0].cdef = new Tree.ClassDef(params[1].code==SEALED, params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 71: {
                //# line 953
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 72: {
                //# line 901
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 73: {
                //# line 198
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 74: {
                //# line 159
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 75: {
                /* no action */
                return;
            }
            case 76: {
                //# line 759
                params[0].elist = params[2].elist;
                return;
            }
            case 77: {
                /* no action */
                return;
            }
            case 78: {
                //# line 29
                params[0].clist = new ArrayList<ClassDef>(	);
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 79: {
                //# line 445
                params[0].expr = params[1].expr;
                return;
            }
            case 80: {
                //# line 85
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 81: {
                //# line 635
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 82: {
                //# line 808
                params[0].ident = params[1].ident;
                return;
            }
            case 83: {
                //# line 812
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 84: {
                //# line 332
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 85: {
                /* no action */
                return;
            }
            case 86: {
                //# line 120
                params[0].ident = params[2].ident;
                return;
            }
            case 87: {
                /* no action */
                return;
            }
            case 88: {
                //# line 403
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 89: {
                //# line 408
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 90: {
                //# line 94
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 91: {
                //# line 98
                params[0].counter = 0;
                return;
            }
            case 92: {
                //# line 509
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 93: {
                //# line 891
                params[0].elist = params[1].elist;
                return;
            }
            case 94: {
                //# line 895
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 95: {
                //# line 57
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 96: {
                //# line 521
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 97: {
                /* no action */
                return;
            }
            case 98: {
                //# line 212
                params[0].stmt = params[1].vdef;
                return;
            }
            case 99: {
                //# line 216
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 100: {
                //# line 224
                params[0].stmt = params[1].stmt;
                return;
            }
            case 101: {
                //# line 228
                params[0].stmt = params[1].stmt;
                return;
            }
            case 102: {
                //# line 232
                params[0].stmt = params[1].stmt;
                return;
            }
            case 103: {
                //# line 236
                params[0].stmt = params[1].stmt;
                return;
            }
            case 104: {
                //# line 240
                params[0].stmt = params[1].stmt;
                return;
            }
            case 105: {
                //# line 244
                params[0].stmt = params[1].stmt;
                return;
            }
            case 106: {
                //# line 248
                params[0].stmt = params[1].stmt;
                return;
            }
            case 107: {
                //# line 252
                params[0].stmt = params[2].stmt;
                return;
            }
            case 108: {
                //# line 317
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 109: {
                //# line 325
                params[0].stmt = new Tree.Assign(new Tree.Ident(true, null, params[2].ident, params[2].loc), params[4].expr, params[1].loc);
                return;
            }
            case 110: {
                /* no action */
                return;
            }
            case 111: {
                //# line 63
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 112: {
                //# line 67
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 113: {
                //# line 71
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 114: {
                //# line 75
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 115: {
                //# line 79
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 116: {
                //# line 922
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 117: {
                //# line 463
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 118: {
                /* no action */
                return;
            }
            case 119: {
                //# line 259
                params[0].stmt = params[1].stmt ;
                return;
            }
            case 120: {
                //# line 263
                params[0].stmt = params[1].stmt ;					
                return;
            }
            case 121: {
                //# line 538
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 122: {
                //# line 550
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 123: {
                /* no action */
                return;
            }
            case 124: {
                //# line 959
                params[0].expr = params[1].expr;
                return;
            }
            case 125: {
                /* no action */
                return;
            }
            case 126: {
                //# line 389
                params[0].counter = Tree.DMOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 127: {
                //# line 940
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 128: {
                //# line 310
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr , params[3].loc) ;
                return;
            }
            case 129: {
                //# line 676
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 130: {
                /* no action */
                return;
            }
            case 131: {
                //# line 733
                SemValue sem = new SemValue();
                if(params[3].expr == null) sem.expr = params[2].expr;
                else sem.expr = new Tree.ArrayRange(params[2].expr, params[3].expr, params[1].loc) ;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[5].vec != null) {
                    params[0].vec.addAll(params[5].vec);
                }
                return;
            }
            case 132: {
                //# line 744
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 133: {
                /* no action */
                return;
            }
            case 134: {
                //# line 723
                params[0].expr = params[2].expr ;
                return;
            }
            case 135: {
                //# line 727
                params[0].expr=null ;
                return;
            }
            case 136: {
                //# line 693
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 137: {
                //# line 697
                params[0].expr = params[1].expr;
                return;
            }
            case 138: {
                //# line 40
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 139: {
                /* no action */
                return;
            }
            case 140: {
                //# line 367
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 141: {
                //# line 372
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 142: {
                //# line 377
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 143: {
                //# line 382
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 144: {
                //# line 143
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 145: {
                //# line 148
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
