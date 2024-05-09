// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tcpip147.websupport.css.language.psi.CssTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tcpip147.websupport.css.language.psi.*;

public class CssSupportsRuleImpl extends ASTWrapperPsiElement implements CssSupportsRule {

  public CssSupportsRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitSupportsRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CssGroupRuleBody getGroupRuleBody() {
    return findNotNullChildByClass(CssGroupRuleBody.class);
  }

  @Override
  @NotNull
  public CssSupportsCondition getSupportsCondition() {
    return findNotNullChildByClass(CssSupportsCondition.class);
  }

  @Override
  @NotNull
  public List<CssWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssWs.class);
  }

}
