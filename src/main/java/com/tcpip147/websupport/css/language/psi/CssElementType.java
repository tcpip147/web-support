package com.tcpip147.websupport.css.language.psi;

import com.intellij.psi.tree.IElementType;
import com.tcpip147.websupport.css.plugin.CssLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CssElementType extends IElementType {

    public CssElementType(@NonNls @NotNull String debugName) {
        super(debugName, CssLanguage.INSTANCE);
    }
}
