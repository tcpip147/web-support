package com.tcpip147.websupport.css.plugin;

import com.intellij.lang.Language;

public class CssLanguage extends Language {

    public static final CssLanguage INSTANCE = new CssLanguage();

    protected CssLanguage() {
        super("Css");
    }
}
