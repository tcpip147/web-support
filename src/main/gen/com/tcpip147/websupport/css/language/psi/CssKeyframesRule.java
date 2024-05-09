// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssKeyframesRule extends PsiElement {

  @NotNull
  CssIdent getIdent();

  @NotNull
  List<CssKeyframeBlock> getKeyframeBlockList();

  @NotNull
  List<CssWs> getWsList();

}
