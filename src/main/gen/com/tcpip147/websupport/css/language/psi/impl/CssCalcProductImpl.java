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

public class CssCalcProductImpl extends ASTWrapperPsiElement implements CssCalcProduct {

  public CssCalcProductImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitCalcProduct(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CssCalcValue> getCalcValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssCalcValue.class);
  }

  @Override
  @NotNull
  public List<CssNumber_> getNumber_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssNumber_.class);
  }

  @Override
  @NotNull
  public List<CssWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssWs.class);
  }

}
