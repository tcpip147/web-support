// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssBlock extends PsiElement {

  @NotNull
  List<CssAny_> getAny_List();

  @NotNull
  List<CssBlock> getBlockList();

  @NotNull
  List<CssDeclarationList> getDeclarationListList();

  @NotNull
  List<CssNestedStatement> getNestedStatementList();

  @NotNull
  List<CssWs> getWsList();

}
