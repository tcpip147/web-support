// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssAny_ extends PsiElement {

  @NotNull
  List<CssAny_> getAny_List();

  @Nullable
  CssDimension_ getDimension_();

  @Nullable
  CssIdent_ getIdent_();

  @Nullable
  CssNumber_ getNumber_();

  @Nullable
  CssPercentage_ getPercentage_();

  @Nullable
  CssUnknownDimension_ getUnknownDimension_();

  @NotNull
  List<CssUnused> getUnusedList();

  @Nullable
  CssUrlWrap getUrlWrap();

  @NotNull
  List<CssWs> getWsList();

}
