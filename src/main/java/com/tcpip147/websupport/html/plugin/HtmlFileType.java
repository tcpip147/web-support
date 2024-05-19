package com.tcpip147.websupport.html.plugin;

import com.intellij.lang.html.HTMLLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HtmlFileType extends LanguageFileType {

    public static final HtmlFileType INSTANCE = new HtmlFileType();
    public static final Icon ICON = IconLoader.getIcon("/html.svg", HtmlFileType.class);
    public static final String EXTENSION = "html";

    protected HtmlFileType() {
        super(HTMLLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Html";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Html Language File";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return EXTENSION;
    }

    @Override
    public Icon getIcon() {
        return ICON;
    }
}
