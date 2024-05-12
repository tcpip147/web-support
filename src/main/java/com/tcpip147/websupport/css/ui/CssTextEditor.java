package com.tcpip147.websupport.css.ui;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.tcpip147.websupport.Prettier;
import com.tcpip147.websupport.PrettierObservable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CssTextEditor extends JPanel implements PrettierObservable {

    private CssContext ctx;
    private Editor editor;

    public CssTextEditor(CssContext ctx) {
        this.ctx = ctx;
        setLayout(new BorderLayout());
        Prettier.getInstance().subscribe(ctx.getFile().toString(), this);

        FileType fileType = FileTypeManager.getInstance().getFileTypeByExtension("sql");
        Document document = FileDocumentManager.getInstance().getDocument(ctx.getFile());
        editor = EditorFactory.getInstance().createEditor(document, ctx.getProject(), fileType, false);
        editor.getContentComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.isControlDown() && e.isAltDown() && e.getKeyCode() == 76) {
                    Prettier.getInstance().call(ctx.getFile().toString(), editor.getDocument().getText());
                }
            }
        });
        add(editor.getComponent(), BorderLayout.CENTER);
    }

    public void releaseMemory() {
        EditorFactory.getInstance().releaseEditor(editor);
    }

    @Override
    public void publish(String text) {
        ApplicationManager.getApplication().invokeLaterOnWriteThread(() -> {
            WriteCommandAction.runWriteCommandAction(ctx.getProject(), () -> {
                editor.getDocument().setText(text);
            });
        });
    }
}
