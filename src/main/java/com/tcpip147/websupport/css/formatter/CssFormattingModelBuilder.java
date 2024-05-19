package com.tcpip147.websupport.css.formatter;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.ui.icons.RasterizedImageDataLoaderKt;
import org.jetbrains.annotations.NotNull;

public class CssFormattingModelBuilder implements FormattingModelBuilder {

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        CodeStyleSettings settings = formattingContext.getCodeStyleSettings();
        CssBlock block = new CssBlock(formattingContext.getNode(), null, null);
        return FormattingModelProvider.createFormattingModelForPsiFile(formattingContext.getContainingFile(), block, settings);
    }
}
