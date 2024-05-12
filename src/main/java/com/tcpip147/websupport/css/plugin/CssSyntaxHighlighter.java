package com.tcpip147.websupport.css.plugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import com.tcpip147.websupport.css.language.CssLexerAdapter;
import com.tcpip147.websupport.css.language.psi.CssTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CssSyntaxHighlighter implements SyntaxHighlighter {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    public static final TextAttributesKey STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey CHARSET = createTextAttributesKey("CHARSET", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENT = createTextAttributesKey("IDENT", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey DIMENSION = createTextAttributesKey("DIMENSION", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] CHARSET_KEYS = new TextAttributesKey[]{CHARSET};
    private static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT};
    private static final TextAttributesKey[] DIMENSION_KEYS = new TextAttributesKey[]{DIMENSION};

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CssLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return EMPTY_KEYS;
    }
}
