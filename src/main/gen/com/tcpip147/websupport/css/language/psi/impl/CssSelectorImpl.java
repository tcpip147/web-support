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

public class CssSelectorImpl extends ASTWrapperPsiElement implements CssSelector {

  public CssSelectorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitSelector(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CssCombinator getCombinator() {
    return findChildByClass(CssCombinator.class);
  }

  @Override
  @Nullable
  public CssSelector getSelector() {
    return findChildByClass(CssSelector.class);
  }

  @Override
  @NotNull
  public CssSimpleSelector getSimpleSelector() {
    return findNotNullChildByClass(CssSimpleSelector.class);
  }

}
