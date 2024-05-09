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

public class CssBlockImpl extends ASTWrapperPsiElement implements CssBlock {

  public CssBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CssVisitor visitor) {
    visitor.visitBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CssVisitor) accept((CssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CssAny_> getAny_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssAny_.class);
  }

  @Override
  @NotNull
  public List<CssBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssBlock.class);
  }

  @Override
  @NotNull
  public List<CssDeclarationList> getDeclarationListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssDeclarationList.class);
  }

  @Override
  @NotNull
  public List<CssNestedStatement> getNestedStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssNestedStatement.class);
  }

  @Override
  @NotNull
  public List<CssWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CssWs.class);
  }

}
