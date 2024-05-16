package com.tcpip147.websupport.css.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.tcpip147.websupport.css.plugin.CssFileType;
import com.tcpip147.websupport.css.plugin.CssLanguage;
import org.jetbrains.annotations.NotNull;

public class CssFile extends PsiFileBase {

    public CssFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CssLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CssFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Css File";
    }
}
