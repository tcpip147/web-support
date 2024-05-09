// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssAny_ extends PsiElement {

  @NotNull
  List<CssAny_> getAny_List();

  @Nullable
  CssDimension getDimension();

  @Nullable
  CssIdent getIdent();

  @Nullable
  CssNumber getNumber();

  @Nullable
  CssPercentage getPercentage();

  @Nullable
  CssUnknownDimension getUnknownDimension();

  @NotNull
  List<CssUnused> getUnusedList();

  @Nullable
  CssUrl getUrl();

  @NotNull
  List<CssWs> getWsList();

}
