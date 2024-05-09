// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssSimpleSelectorSequence extends PsiElement {

  @NotNull
  List<CssAttrib> getAttribList();

  @NotNull
  List<CssClassName> getClassNameList();

  @NotNull
  List<CssNegation> getNegationList();

  @NotNull
  List<CssPseudo> getPseudoList();

  @Nullable
  CssTypeSelector getTypeSelector();

  @Nullable
  CssUniversal getUniversal();

}
