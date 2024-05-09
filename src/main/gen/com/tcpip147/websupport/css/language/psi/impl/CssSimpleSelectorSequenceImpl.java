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

public class CssSimpleSelectorSequenceImpl extends ASTWrapperPsiElement implements CssSimpleSelectorSequence {

  public CssSimpleSelectorSequenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitSimpleSelectorSequence(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CssAttrib> getAttribList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssAttrib.class);
  }

  @Override
  @NotNull
  public List<CssClassName> getClassNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssClassName.class);
  }

  @Override
  @NotNull
  public List<CssNegation> getNegationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssNegation.class);
  }

  @Override
  @NotNull
  public List<CssPseudo> getPseudoList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssPseudo.class);
  }

  @Override
  @Nullable
  public CssTypeSelector getTypeSelector() {
    return findChildByClass(CssTypeSelector.class);
  }

  @Override
  @Nullable
  public CssUniversal getUniversal() {
    return findChildByClass(CssUniversal.class);
  }

}
