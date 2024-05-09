// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssDeclaration extends PsiElement {

  @Nullable
  CssExpr getExpr();

  @Nullable
  CssPrio getPrio();

  @NotNull
  CssProperty_ getProperty_();

  @Nullable
  CssValue getValue();

  @NotNull
  CssWs getWs();

}
