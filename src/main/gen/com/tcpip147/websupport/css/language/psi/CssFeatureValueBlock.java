// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssFeatureValueBlock extends PsiElement {

  @NotNull
  CssFeatureType getFeatureType();

  @NotNull
  List<CssFeatureValueDefinition> getFeatureValueDefinitionList();

  @NotNull
  List<CssWs> getWsList();

}
