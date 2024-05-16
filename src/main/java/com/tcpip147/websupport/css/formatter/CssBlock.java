package com.tcpip147.websupport.css.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CssBlock extends AbstractBlock {

    private final SpacingBuilder spacingBuilder;

    protected CssBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment, SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE) {
                Block block = new CssBlock(child, null, null, spacingBuilder);
                blocks.add(block);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public @Nullable Indent getIndent() {
        if (!"BRACKET_CLOSE".equals(myNode.getElementType().getDebugName())) {
            if (findPrevBracket(myNode)) {
                return Indent.getNormalIndent();
            }
        }
        return Indent.getNoneIndent();
    }

    private boolean findPrevBracket(ASTNode myNode) {
        ASTNode prev = myNode.getTreePrev();
        while (prev != null) {
            if ("BRACKET_OPEN".equals(prev.getElementType().getDebugName())) {
                return true;
            }
            prev = prev.getTreePrev();
        }
        return false;
    }

    @Override
    public @Nullable Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}
