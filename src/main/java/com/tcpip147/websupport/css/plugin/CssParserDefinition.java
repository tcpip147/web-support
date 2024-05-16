package com.tcpip147.websupport.css.plugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.tcpip147.websupport.css.language.*;
import com.tcpip147.websupport.css.language.psi.CssTypes;
import org.jetbrains.annotations.NotNull;

public class CssParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(CssLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CssLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new CssParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return CssTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return CssTokenSets.WHITE_SPACE;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return CssTokenSets.STRING;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CssTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CssFile(viewProvider);
    }
}
