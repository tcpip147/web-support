// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssCalcValue extends PsiElement {

  @Nullable
  CssCalcSum getCalcSum();

  @Nullable
  CssDimension_ getDimension_();

  @Nullable
  CssNumber_ getNumber_();

  @Nullable
  CssPercentage_ getPercentage_();

  @Nullable
  CssUnknownDimension_ getUnknownDimension_();

  @NotNull
  List<CssWs> getWsList();

}
