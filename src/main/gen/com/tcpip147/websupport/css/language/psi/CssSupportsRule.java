// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CssSupportsRule extends PsiElement {

  @NotNull
  CssGroupRuleBody getGroupRuleBody();

  @NotNull
  CssSupportsCondition getSupportsCondition();

  @NotNull
  List<CssWs> getWsList();

}
