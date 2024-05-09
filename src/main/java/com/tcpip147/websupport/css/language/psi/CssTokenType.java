package com.tcpip147.websupport.css.language.psi;

import com.intellij.psi.tree.IElementType;
import com.tcpip147.websupport.css.plugin.CssLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CssTokenType extends IElementType {

    public CssTokenType(@NonNls @NotNull String debugName) {
        super(debugName, CssLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CssTokenType." + super.toString();
    }
}
