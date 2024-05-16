package com.tcpip147.websupport.css.formatter;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.tcpip147.websupport.css.file.CssLanguage;
import org.jetbrains.annotations.NotNull;

public class CssFormattingModelBuilder implements FormattingModelBuilder {

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, CssLanguage.INSTANCE);
    }

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        CodeStyleSettings settings = formattingContext.getCodeStyleSettings();
        CssBlock block = new CssBlock(formattingContext.getNode(), null, null, createSpaceBuilder(settings));
        return FormattingModelProvider.createFormattingModelForPsiFile(formattingContext.getContainingFile(), block, settings);
    }
}
