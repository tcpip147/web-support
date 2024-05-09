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

public class CssNegationArgImpl extends ASTWrapperPsiElement implements CssNegationArg {

  public CssNegationArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitNegationArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CssAttrib getAttrib() {
    return findChildByClass(CssAttrib.class);
  }

  @Override
  @Nullable
  public CssClassName getClassName() {
    return findChildByClass(CssClassName.class);
  }

  @Override
  @Nullable
  public CssPseudo getPseudo() {
    return findChildByClass(CssPseudo.class);
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
