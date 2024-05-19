package com.tcpip147.websupport.css.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.tcpip147.websupport.css.language.psi.CssTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CssBlock extends AbstractBlock {

    private static final int INDENT_SPACE = 2;

    protected CssBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment) {
        super(node, wrap, alignment);
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE) {
                blocks.add(new CssBlock(child, null, null));
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public @Nullable Indent getIndent() {
        if (myNode.getElementType() == CssTypes.DECLARATION) {
            return Indent.getSpaceIndent(INDENT_SPACE);
        }
        return Indent.getNoneIndent();
    }

    @Override
    public @Nullable Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        int minSpaces = 1;
        int maxSpaces = 1;
        int minLineFeeds = 0;
        boolean keepLineBreaks = false;
        int keepBlankLines = 0;

        ASTNode node1 = child1 != null ? ((ASTBlock) child1).getNode() : null;
        ASTNode node2 = ((ASTBlock) child2).getNode();

        if (node1 != null) {
            if (node1.getElementType() == CssTypes.BRACKET_OPEN) {
                minLineFeeds = 1;
            } else if (node1.getElementType() == CssTypes.SEMI_COLON) {
                minLineFeeds = 1;
            }
        }

        if (node2 != null) {
            if (node2.getElementType() == CssTypes.SEMI_COLON) {
                minSpaces = 0;
                maxSpaces = 0;
            } else if (node2.getElementType() == CssTypes.COLON) {
                minSpaces = 0;
                maxSpaces = 0;
            } else if (node2.getElementType() == CssTypes.BRACKET_CLOSE) {
                minLineFeeds = 1;
            } else if (node2.getElementType() == CssTypes.RULESET) {
                minLineFeeds = 2;
            }
        }

        return Spacing.createSpacing(minSpaces, maxSpaces, minLineFeeds, keepLineBreaks, keepBlankLines);
    }

    @Override
    public @NotNull ChildAttributes getChildAttributes(int newChildIndex) {
        Block prevBlock = newChildIndex == 0 ? null : getSubBlocks().get(newChildIndex - 1);
        if (prevBlock != null) {
            ASTNode prevNode = ((ASTBlock) prevBlock).getNode();
            if (prevNode.getElementType() == CssTypes.SEMI_COLON) {
                return new ChildAttributes(Indent.getSpaceIndent(INDENT_SPACE), null);
            } else if (prevNode.getElementType() == CssTypes.BRACKET_OPEN) {
                return new ChildAttributes(Indent.getSpaceIndent(INDENT_SPACE), null);
            }
        }
        return new ChildAttributes(Indent.getNoneIndent(), null);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}
