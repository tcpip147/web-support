// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.tcpip147.websupport.css.language.psi;

import com.intellij.psi.tree.IElementType;
import com.tcpip147.websupport.css.file.CssLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CssElementType extends IElementType {

    public CssElementType(@NotNull @NonNls String debugName) {
        super(debugName, CssLanguage.INSTANCE);
    }

}
