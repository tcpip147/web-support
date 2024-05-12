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

public class CssCalcValueImpl extends ASTWrapperPsiElement implements CssCalcValue {

  public CssCalcValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitCalcValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CssCalcSum getCalcSum() {
    return findChildByClass(CssCalcSum.class);
  }

  @Override
  @Nullable
  public CssDimension_ getDimension_() {
    return findChildByClass(CssDimension_.class);
  }

  @Override
  @Nullable
  public CssNumber_ getNumber_() {
    return findChildByClass(CssNumber_.class);
  }

  @Override
  @Nullable
  public CssPercentage_ getPercentage_() {
    return findChildByClass(CssPercentage_.class);
  }

  @Override
  @Nullable
  public CssUnknownDimension_ getUnknownDimension_() {
    return findChildByClass(CssUnknownDimension_.class);
  }

  @Override
  @NotNull
  public List<CssWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssWs.class);
  }

}
