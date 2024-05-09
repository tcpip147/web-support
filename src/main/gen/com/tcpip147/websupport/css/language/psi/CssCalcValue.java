// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssCalcValue extends PsiElement {

  @Nullable
  CssCalcSum getCalcSum();

  @Nullable
  CssDimension getDimension();

  @Nullable
  CssNumber getNumber();

  @Nullable
  CssPercentage getPercentage();

  @Nullable
  CssUnknownDimension getUnknownDimension();

  @NotNull
  List<CssWs> getWsList();

}
