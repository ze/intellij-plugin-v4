package org.antlr.intellij.plugin.parser;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.plugin.ANTLRv4TokenType;
import org.antlr.v4.runtime.Token;

public class ANTLRv4TokenTypes {
	public static IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
	public static IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
	public static ANTLRv4TokenType BAD_TOKEN = new ANTLRv4TokenType("BAD_TOKEN");
	public static ANTLRv4TokenType EOF = new ANTLRv4TokenType(Token.EOF, "EOF");

	public static ANTLRv4TokenType TOKEN_REF = new ANTLRv4TokenType(ANTLRv4Lexer.TOKEN_REF, "TOKEN_REF");
	public static ANTLRv4TokenType RULE_REF = new ANTLRv4TokenType(ANTLRv4Lexer.RULE_REF, "RULE_REF");
	public static ANTLRv4TokenType LEXER_CHAR_SET = new ANTLRv4TokenType(ANTLRv4Lexer.LEXER_CHAR_SET, "LEXER_CHAR_SET");
	public static ANTLRv4TokenType DOC_COMMENT = new ANTLRv4TokenType(ANTLRv4Lexer.DOC_COMMENT, "DOC_COMMENT");
	public static ANTLRv4TokenType BLOCK_COMMENT = new ANTLRv4TokenType(ANTLRv4Lexer.BLOCK_COMMENT, "BLOCK_COMMENT");
	public static ANTLRv4TokenType LINE_COMMENT = new ANTLRv4TokenType(ANTLRv4Lexer.LINE_COMMENT, "LINE_COMMENT");
	public static ANTLRv4TokenType DOUBLE_QUOTE_STRING_LITERAL = new ANTLRv4TokenType(ANTLRv4Lexer.DOUBLE_QUOTE_STRING_LITERAL, "DOUBLE_QUOTE_STRING_LITERAL");
	public static ANTLRv4TokenType BEGIN_ARG_ACTION = new ANTLRv4TokenType(ANTLRv4Lexer.BEGIN_ARG_ACTION, "BEGIN_ARG_ACTION");
	public static ANTLRv4TokenType OPTIONS = new ANTLRv4TokenType(ANTLRv4Lexer.OPTIONS, "OPTIONS");
	public static ANTLRv4TokenType TOKENS = new ANTLRv4TokenType(ANTLRv4Lexer.TOKENS, "TOKENS");
	public static ANTLRv4TokenType IMPORT = new ANTLRv4TokenType(ANTLRv4Lexer.IMPORT, "IMPORT");
	public static ANTLRv4TokenType FRAGMENT = new ANTLRv4TokenType(ANTLRv4Lexer.FRAGMENT, "FRAGMENT");
	public static ANTLRv4TokenType LEXER = new ANTLRv4TokenType(ANTLRv4Lexer.LEXER, "LEXER");
	public static ANTLRv4TokenType PARSER = new ANTLRv4TokenType(ANTLRv4Lexer.PARSER, "PARSER");
	public static ANTLRv4TokenType GRAMMAR = new ANTLRv4TokenType(ANTLRv4Lexer.GRAMMAR, "GRAMMAR");
	public static ANTLRv4TokenType PROTECTED = new ANTLRv4TokenType(ANTLRv4Lexer.PROTECTED, "PROTECTED");
	public static ANTLRv4TokenType PUBLIC = new ANTLRv4TokenType(ANTLRv4Lexer.PUBLIC, "PUBLIC");
	public static ANTLRv4TokenType PRIVATE = new ANTLRv4TokenType(ANTLRv4Lexer.PRIVATE, "PRIVATE");
	public static ANTLRv4TokenType RETURNS = new ANTLRv4TokenType(ANTLRv4Lexer.RETURNS, "RETURNS");
	public static ANTLRv4TokenType LOCALS = new ANTLRv4TokenType(ANTLRv4Lexer.LOCALS, "LOCALS");
	public static ANTLRv4TokenType THROWS = new ANTLRv4TokenType(ANTLRv4Lexer.THROWS, "THROWS");
	public static ANTLRv4TokenType CATCH = new ANTLRv4TokenType(ANTLRv4Lexer.CATCH, "CATCH");
	public static ANTLRv4TokenType FINALLY = new ANTLRv4TokenType(ANTLRv4Lexer.FINALLY, "FINALLY");
	public static ANTLRv4TokenType MODE = new ANTLRv4TokenType(ANTLRv4Lexer.MODE, "MODE");
	public static ANTLRv4TokenType COLON = new ANTLRv4TokenType(ANTLRv4Lexer.COLON, "COLON");
	public static ANTLRv4TokenType COLONCOLON = new ANTLRv4TokenType(ANTLRv4Lexer.COLONCOLON, "COLONCOLON");
	public static ANTLRv4TokenType COMMA = new ANTLRv4TokenType(ANTLRv4Lexer.COMMA, "COMMA");
	public static ANTLRv4TokenType SEMI = new ANTLRv4TokenType(ANTLRv4Lexer.SEMI, "SEMI");
	public static ANTLRv4TokenType LPAREN = new ANTLRv4TokenType(ANTLRv4Lexer.LPAREN, "LPAREN");
	public static ANTLRv4TokenType RPAREN = new ANTLRv4TokenType(ANTLRv4Lexer.RPAREN, "RPAREN");
	public static ANTLRv4TokenType RARROW = new ANTLRv4TokenType(ANTLRv4Lexer.RARROW, "RARROW");
	public static ANTLRv4TokenType LT = new ANTLRv4TokenType(ANTLRv4Lexer.LT, "LT");
	public static ANTLRv4TokenType GT = new ANTLRv4TokenType(ANTLRv4Lexer.GT, "GT");
	public static ANTLRv4TokenType ASSIGN = new ANTLRv4TokenType(ANTLRv4Lexer.ASSIGN, "ASSIGN");
	public static ANTLRv4TokenType QUESTION = new ANTLRv4TokenType(ANTLRv4Lexer.QUESTION, "QUESTION");
	public static ANTLRv4TokenType STAR = new ANTLRv4TokenType(ANTLRv4Lexer.STAR, "STAR");
	public static ANTLRv4TokenType PLUS = new ANTLRv4TokenType(ANTLRv4Lexer.PLUS, "PLUS");
	public static ANTLRv4TokenType PLUS_ASSIGN = new ANTLRv4TokenType(ANTLRv4Lexer.PLUS_ASSIGN, "PLUS_ASSIGN");
	public static ANTLRv4TokenType OR = new ANTLRv4TokenType(ANTLRv4Lexer.OR, "OR");
	public static ANTLRv4TokenType DOLLAR = new ANTLRv4TokenType(ANTLRv4Lexer.DOLLAR, "DOLLAR");
	public static ANTLRv4TokenType DOT = new ANTLRv4TokenType(ANTLRv4Lexer.DOT, "DOT");
	public static ANTLRv4TokenType RANGE = new ANTLRv4TokenType(ANTLRv4Lexer.RANGE, "RANGE");
	public static ANTLRv4TokenType AT = new ANTLRv4TokenType(ANTLRv4Lexer.AT, "AT");
	public static ANTLRv4TokenType POUND = new ANTLRv4TokenType(ANTLRv4Lexer.POUND, "POUND");
	public static ANTLRv4TokenType NOT = new ANTLRv4TokenType(ANTLRv4Lexer.NOT, "NOT");
	public static ANTLRv4TokenType RBRACE = new ANTLRv4TokenType(ANTLRv4Lexer.RBRACE, "RBRACE");
	public static ANTLRv4TokenType ID = new ANTLRv4TokenType(ANTLRv4Lexer.ID, "ID");
	public static ANTLRv4TokenType INT = new ANTLRv4TokenType(ANTLRv4Lexer.INT, "INT");
	public static ANTLRv4TokenType STRING_LITERAL = new ANTLRv4TokenType(ANTLRv4Lexer.STRING_LITERAL, "STRING_LITERAL");
	public static ANTLRv4TokenType WS = new ANTLRv4TokenType(ANTLRv4Lexer.WS, "WS");
	public static ANTLRv4TokenType ERRCHAR = new ANTLRv4TokenType(ANTLRv4Lexer.ERRCHAR, "ERRCHAR");
	public static ANTLRv4TokenType ARG_ACTION = new ANTLRv4TokenType(ANTLRv4Lexer.ARG_ACTION, "ARG_ACTION");
	public static ANTLRv4TokenType ACTION = new ANTLRv4TokenType(ANTLRv4Lexer.ACTION, "ACTION");
	public static ANTLRv4TokenType BEGIN_ACTION = new ANTLRv4TokenType(ANTLRv4Lexer.BEGIN_ACTION, "BEGIN_ACTION");

	public static ANTLRv4TokenType grammarSpec = new ANTLRv4TokenType("grammarSpec");
	public static ANTLRv4TokenType grammarType = new ANTLRv4TokenType("grammarType");
	public static ANTLRv4TokenType prequelConstruct = new ANTLRv4TokenType("prequelConstruct");
	public static ANTLRv4TokenType optionsSpec = new ANTLRv4TokenType("optionsSpec");
	public static ANTLRv4TokenType option = new ANTLRv4TokenType("option");
	public static ANTLRv4TokenType optionValue = new ANTLRv4TokenType("optionValue");
	public static ANTLRv4TokenType delegateGrammars = new ANTLRv4TokenType("delegateGrammars");
	public static ANTLRv4TokenType delegateGrammar = new ANTLRv4TokenType("delegateGrammar");
	public static ANTLRv4TokenType tokensSpec = new ANTLRv4TokenType("tokensSpec");
	public static ANTLRv4TokenType action = new ANTLRv4TokenType("action");
	public static ANTLRv4TokenType actionScopeName = new ANTLRv4TokenType("actionScopeName");
	public static ANTLRv4TokenType modeSpec = new ANTLRv4TokenType("modeSpec");
	public static ANTLRv4TokenType rules = new ANTLRv4TokenType("rules");
	public static ANTLRv4TokenType ruleSpec = new ANTLRv4TokenType("ruleSpec");
	public static ANTLRv4TokenType parserRuleSpec = new ANTLRv4TokenType("parserRuleSpec");
	public static ANTLRv4TokenType exceptionGroup = new ANTLRv4TokenType("exceptionGroup");
	public static ANTLRv4TokenType exceptionHandler = new ANTLRv4TokenType("exceptionHandler");
	public static ANTLRv4TokenType finallyClause = new ANTLRv4TokenType("finallyClause");
	public static ANTLRv4TokenType rulePrequel = new ANTLRv4TokenType("rulePrequel");
	public static ANTLRv4TokenType ruleReturns = new ANTLRv4TokenType("ruleReturns");
	public static ANTLRv4TokenType throwsSpec = new ANTLRv4TokenType("throwsSpec");
	public static ANTLRv4TokenType localsSpec = new ANTLRv4TokenType("localsSpec");
	public static ANTLRv4TokenType ruleAction = new ANTLRv4TokenType("ruleAction");
	public static ANTLRv4TokenType ruleModifiers = new ANTLRv4TokenType("ruleModifiers");
	public static ANTLRv4TokenType ruleModifier = new ANTLRv4TokenType("ruleModifier");
	public static ANTLRv4TokenType ruleBlock = new ANTLRv4TokenType("ruleBlock");
	public static ANTLRv4TokenType ruleAltList = new ANTLRv4TokenType("ruleAltList");
	public static ANTLRv4TokenType labeledAlt = new ANTLRv4TokenType("labeledAlt");
	public static ANTLRv4TokenType lexerRule = new ANTLRv4TokenType("lexerRule");
	public static ANTLRv4TokenType lexerRuleBlock = new ANTLRv4TokenType("lexerRuleBlock");
	public static ANTLRv4TokenType lexerAltList = new ANTLRv4TokenType("lexerAltList");
	public static ANTLRv4TokenType lexerAlt = new ANTLRv4TokenType("lexerAlt");
	public static ANTLRv4TokenType lexerElements = new ANTLRv4TokenType("lexerElements");
	public static ANTLRv4TokenType lexerElement = new ANTLRv4TokenType("lexerElement");
	public static ANTLRv4TokenType labeledLexerElement = new ANTLRv4TokenType("labeledLexerElement");
	public static ANTLRv4TokenType lexerBlock = new ANTLRv4TokenType("lexerBlock");
	public static ANTLRv4TokenType lexerCommands = new ANTLRv4TokenType("lexerCommands");
	public static ANTLRv4TokenType lexerCommand = new ANTLRv4TokenType("lexerCommand");
	public static ANTLRv4TokenType lexerCommandName = new ANTLRv4TokenType("lexerCommandName");
	public static ANTLRv4TokenType lexerCommandExpr = new ANTLRv4TokenType("lexerCommandExpr");
	public static ANTLRv4TokenType altList = new ANTLRv4TokenType("altList");
	public static ANTLRv4TokenType alternative = new ANTLRv4TokenType("alternative");
	public static ANTLRv4TokenType elements = new ANTLRv4TokenType("elements");
	public static ANTLRv4TokenType element = new ANTLRv4TokenType("element");
	public static ANTLRv4TokenType labeledElement = new ANTLRv4TokenType("labeledElement");
	public static ANTLRv4TokenType ebnf = new ANTLRv4TokenType("ebnf");
	public static ANTLRv4TokenType blockSuffix = new ANTLRv4TokenType("blockSuffix");
	public static ANTLRv4TokenType ebnfSuffix = new ANTLRv4TokenType("ebnfSuffix");
	public static ANTLRv4TokenType lexerAtom = new ANTLRv4TokenType("lexerAtom");
	public static ANTLRv4TokenType atom = new ANTLRv4TokenType("atom");
	public static ANTLRv4TokenType notSet = new ANTLRv4TokenType("notSet");
	public static ANTLRv4TokenType blockSet = new ANTLRv4TokenType("blockSet");
	public static ANTLRv4TokenType setElement = new ANTLRv4TokenType("setElement");
	public static ANTLRv4TokenType block = new ANTLRv4TokenType("block");
	public static ANTLRv4TokenType ruleref = new ANTLRv4TokenType("ruleref");
	public static ANTLRv4TokenType range = new ANTLRv4TokenType("range");
	public static ANTLRv4TokenType terminal = new ANTLRv4TokenType("terminal");
	public static ANTLRv4TokenType elementOptions = new ANTLRv4TokenType("elementOptions");
	public static ANTLRv4TokenType elementOption = new ANTLRv4TokenType("elementOption");
	public static ANTLRv4TokenType id = new ANTLRv4TokenType("id");

	public static TokenSet COMMENTS = TokenSet.create(DOC_COMMENT,BLOCK_COMMENT,LINE_COMMENT);
	public static TokenSet WHITESPACES = TokenSet.create(WS);
	public static TokenSet KEYWORDS = TokenSet.create(LEXER,PROTECTED,IMPORT,CATCH,
													  PRIVATE,FRAGMENT,PUBLIC,MODE,
													  FINALLY,RETURNS,THROWS,GRAMMAR,
													  LOCALS,PARSER);

	public static ANTLRv4TokenType[] typeToIDEATokenType = new ANTLRv4TokenType[54+1];
	public static ANTLRv4TokenType[] ruleToIDEATokenType = new ANTLRv4TokenType[60+1];

	static {
		typeToIDEATokenType[ANTLRv4Lexer.TOKEN_REF] = TOKEN_REF;
		typeToIDEATokenType[ANTLRv4Lexer.RULE_REF] = RULE_REF;
		typeToIDEATokenType[ANTLRv4Lexer.LEXER_CHAR_SET] = LEXER_CHAR_SET;
		typeToIDEATokenType[ANTLRv4Lexer.DOC_COMMENT] = DOC_COMMENT;
		typeToIDEATokenType[ANTLRv4Lexer.BLOCK_COMMENT] = BLOCK_COMMENT;
		typeToIDEATokenType[ANTLRv4Lexer.LINE_COMMENT] = LINE_COMMENT;
		typeToIDEATokenType[ANTLRv4Lexer.DOUBLE_QUOTE_STRING_LITERAL] = DOUBLE_QUOTE_STRING_LITERAL;
		typeToIDEATokenType[ANTLRv4Lexer.BEGIN_ARG_ACTION] = BEGIN_ARG_ACTION;
		typeToIDEATokenType[ANTLRv4Lexer.OPTIONS] = OPTIONS;
		typeToIDEATokenType[ANTLRv4Lexer.TOKENS] = TOKENS;
		typeToIDEATokenType[ANTLRv4Lexer.IMPORT] = IMPORT;
		typeToIDEATokenType[ANTLRv4Lexer.FRAGMENT] = FRAGMENT;
		typeToIDEATokenType[ANTLRv4Lexer.LEXER] = LEXER;
		typeToIDEATokenType[ANTLRv4Lexer.PARSER] = PARSER;
		typeToIDEATokenType[ANTLRv4Lexer.GRAMMAR] = GRAMMAR;
		typeToIDEATokenType[ANTLRv4Lexer.PROTECTED] = PROTECTED;
		typeToIDEATokenType[ANTLRv4Lexer.PUBLIC] = PUBLIC;
		typeToIDEATokenType[ANTLRv4Lexer.PRIVATE] = PRIVATE;
		typeToIDEATokenType[ANTLRv4Lexer.RETURNS] = RETURNS;
		typeToIDEATokenType[ANTLRv4Lexer.LOCALS] = LOCALS;
		typeToIDEATokenType[ANTLRv4Lexer.THROWS] = THROWS;
		typeToIDEATokenType[ANTLRv4Lexer.CATCH] = CATCH;
		typeToIDEATokenType[ANTLRv4Lexer.FINALLY] = FINALLY;
		typeToIDEATokenType[ANTLRv4Lexer.MODE] = MODE;
		typeToIDEATokenType[ANTLRv4Lexer.COLON] = COLON;
		typeToIDEATokenType[ANTLRv4Lexer.COLONCOLON] = COLONCOLON;
		typeToIDEATokenType[ANTLRv4Lexer.COMMA] = COMMA;
		typeToIDEATokenType[ANTLRv4Lexer.SEMI] = SEMI;
		typeToIDEATokenType[ANTLRv4Lexer.LPAREN] = LPAREN;
		typeToIDEATokenType[ANTLRv4Lexer.RPAREN] = RPAREN;
		typeToIDEATokenType[ANTLRv4Lexer.RARROW] = RARROW;
		typeToIDEATokenType[ANTLRv4Lexer.LT] = LT;
		typeToIDEATokenType[ANTLRv4Lexer.GT] = GT;
		typeToIDEATokenType[ANTLRv4Lexer.ASSIGN] = ASSIGN;
		typeToIDEATokenType[ANTLRv4Lexer.QUESTION] = QUESTION;
		typeToIDEATokenType[ANTLRv4Lexer.STAR] = STAR;
		typeToIDEATokenType[ANTLRv4Lexer.PLUS] = PLUS;
		typeToIDEATokenType[ANTLRv4Lexer.PLUS_ASSIGN] = PLUS_ASSIGN;
		typeToIDEATokenType[ANTLRv4Lexer.OR] = OR;
		typeToIDEATokenType[ANTLRv4Lexer.DOLLAR] = DOLLAR;
		typeToIDEATokenType[ANTLRv4Lexer.DOT] = DOT;
		typeToIDEATokenType[ANTLRv4Lexer.RANGE] = RANGE;
		typeToIDEATokenType[ANTLRv4Lexer.AT] = AT;
		typeToIDEATokenType[ANTLRv4Lexer.POUND] = POUND;
		typeToIDEATokenType[ANTLRv4Lexer.NOT] = NOT;
		typeToIDEATokenType[ANTLRv4Lexer.RBRACE] = RBRACE;
		typeToIDEATokenType[ANTLRv4Lexer.ID] = ID;
		typeToIDEATokenType[ANTLRv4Lexer.INT] = INT;
		typeToIDEATokenType[ANTLRv4Lexer.STRING_LITERAL] = STRING_LITERAL;
		typeToIDEATokenType[ANTLRv4Lexer.WS] = WS;
		typeToIDEATokenType[ANTLRv4Lexer.ERRCHAR] = ERRCHAR;
		typeToIDEATokenType[ANTLRv4Lexer.ARG_ACTION] = ARG_ACTION;
		typeToIDEATokenType[ANTLRv4Lexer.ACTION] = ACTION;
		typeToIDEATokenType[ANTLRv4Lexer.BEGIN_ACTION] = BEGIN_ACTION;
		ruleToIDEATokenType[0] = grammarSpec;
		ruleToIDEATokenType[1] = grammarType;
		ruleToIDEATokenType[2] = prequelConstruct;
		ruleToIDEATokenType[3] = optionsSpec;
		ruleToIDEATokenType[4] = option;
		ruleToIDEATokenType[5] = optionValue;
		ruleToIDEATokenType[6] = delegateGrammars;
		ruleToIDEATokenType[7] = delegateGrammar;
		ruleToIDEATokenType[8] = tokensSpec;
		ruleToIDEATokenType[9] = action;
		ruleToIDEATokenType[10] = actionScopeName;
		ruleToIDEATokenType[11] = modeSpec;
		ruleToIDEATokenType[12] = rules;
		ruleToIDEATokenType[13] = ruleSpec;
		ruleToIDEATokenType[14] = parserRuleSpec;
		ruleToIDEATokenType[15] = exceptionGroup;
		ruleToIDEATokenType[16] = exceptionHandler;
		ruleToIDEATokenType[17] = finallyClause;
		ruleToIDEATokenType[18] = rulePrequel;
		ruleToIDEATokenType[19] = ruleReturns;
		ruleToIDEATokenType[20] = throwsSpec;
		ruleToIDEATokenType[21] = localsSpec;
		ruleToIDEATokenType[22] = ruleAction;
		ruleToIDEATokenType[23] = ruleModifiers;
		ruleToIDEATokenType[24] = ruleModifier;
		ruleToIDEATokenType[25] = ruleBlock;
		ruleToIDEATokenType[26] = ruleAltList;
		ruleToIDEATokenType[27] = labeledAlt;
		ruleToIDEATokenType[28] = lexerRule;
		ruleToIDEATokenType[29] = lexerRuleBlock;
		ruleToIDEATokenType[30] = lexerAltList;
		ruleToIDEATokenType[31] = lexerAlt;
		ruleToIDEATokenType[32] = lexerElements;
		ruleToIDEATokenType[33] = lexerElement;
		ruleToIDEATokenType[34] = labeledLexerElement;
		ruleToIDEATokenType[35] = lexerBlock;
		ruleToIDEATokenType[36] = lexerCommands;
		ruleToIDEATokenType[37] = lexerCommand;
		ruleToIDEATokenType[38] = lexerCommandName;
		ruleToIDEATokenType[39] = lexerCommandExpr;
		ruleToIDEATokenType[40] = altList;
		ruleToIDEATokenType[41] = alternative;
		ruleToIDEATokenType[42] = elements;
		ruleToIDEATokenType[43] = element;
		ruleToIDEATokenType[44] = labeledElement;
		ruleToIDEATokenType[45] = ebnf;
		ruleToIDEATokenType[46] = blockSuffix;
		ruleToIDEATokenType[47] = ebnfSuffix;
		ruleToIDEATokenType[48] = lexerAtom;
		ruleToIDEATokenType[49] = atom;
		ruleToIDEATokenType[50] = notSet;
		ruleToIDEATokenType[51] = blockSet;
		ruleToIDEATokenType[52] = setElement;
		ruleToIDEATokenType[53] = block;
		ruleToIDEATokenType[54] = ruleref;
		ruleToIDEATokenType[55] = range;
		ruleToIDEATokenType[56] = terminal;
		ruleToIDEATokenType[57] = elementOptions;
		ruleToIDEATokenType[58] = elementOption;
		ruleToIDEATokenType[59] = id;
	}
}