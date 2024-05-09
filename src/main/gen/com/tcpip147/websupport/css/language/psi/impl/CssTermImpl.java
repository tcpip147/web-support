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

public class CssTermImpl extends ASTWrapperPsiElement implements CssTerm {

  public CssTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CssCalc getCalc() {
    return findChildByClass(CssCalc.class);
  }

  @Override
  @Nullable
  public CssDimension getDimension() {
    return findChildByClass(CssDimension.class);
  }

  @Override
  @Nullable
  public CssDxImageTransform getDxImageTransform() {
    return findChildByClass(CssDxImageTransform.class);
  }

  @Override
  @Nullable
  public CssFunction_ getFunction_() {
    return findChildByClass(CssFunction_.class);
  }

  @Override
  @Nullable
  public CssHexcolor getHexcolor() {
    return findChildByClass(CssHexcolor.class);
  }

  @Override
  @Nullable
  public CssIdent getIdent() {
    return findChildByClass(CssIdent.class);
  }

  @Override
  @Nullable
  public CssNumber getNumber() {
    return findChildByClass(CssNumber.class);
  }

  @Override
  @Nullable
  public CssPercentage getPercentage() {
    return findChildByClass(CssPercentage.class);
  }

  @Override
  @Nullable
  public CssUnknownDimension getUnknownDimension() {
    return findChildByClass(CssUnknownDimension.class);
  }

  @Override
  @Nullable
  public CssUrl getUrl() {
    return findChildByClass(CssUrl.class);
  }

  @Override
  @Nullable
  public CssVar_ getVar_() {
    return findChildByClass(CssVar_.class);
  }

  @Override
  @Nullable
  public CssWs getWs() {
    return findChildByClass(CssWs.class);
  }

}
