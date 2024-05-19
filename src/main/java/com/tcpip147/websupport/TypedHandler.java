package com.tcpip147.websupport;

import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class TypedHandler extends TypedHandlerDelegate {

    @NotNull
    @Override
    public Result charTyped(char c, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
        if ("css".equals(file.getVirtualFile().getExtension())) {
            if (c == '(' || c == '[' || c == '{') {
                Document document = editor.getDocument();
                int offset = editor.getCaretModel().getOffset();
                document.insertString(offset, getClosingBracket(c));
                editor.getCaretModel().moveToOffset(offset);
            }
        }
        return super.charTyped(c, project, editor, file);
    }

    private String getClosingBracket(char openingBracket) {
        switch (openingBracket) {
            case '(':
                return ")";
            case '[':
                return "]";
            case '{':
                return "}";
            default:
                return "";
        }
    }
}
