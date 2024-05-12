package com.tcpip147.websupport.css.ui;

import com.intellij.codeInsight.highlighting.HighlightManager;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.tcpip147.websupport.node.NodeJsObserver;
import com.tcpip147.websupport.node.NodeJsObservable;
import com.tcpip147.websupport.node.NodeJsRequest;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CssTextEditor extends JPanel implements NodeJsObservable {

    private CssContext ctx;
    private Editor editor;

    public CssTextEditor(CssContext ctx) {
        this.ctx = ctx;
        setLayout(new BorderLayout());
        NodeJsObserver.getInstance().subscribe(ctx.getFile().toString(), this);

        FileType fileType = FileTypeManager.getInstance().getFileTypeByExtension("sql");
        Document document = FileDocumentManager.getInstance().getDocument(ctx.getFile());
        editor = EditorFactory.getInstance().createEditor(document, ctx.getProject(), fileType, false);
        editor.getContentComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.isControlDown() && e.isAltDown() && e.getKeyCode() == 76) {
                    NodeJsObserver.getInstance().call(new NodeJsRequest(NodeJsRequest.MODULE_TYPE_PRETTIER, "css", ctx.getFile().toString(), editor.getDocument().getText()));
                }
            }
        });
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void documentChanged(@NotNull DocumentEvent event) {
                TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
                HighlightManager.getInstance(ctx.getProject()).addRangeHighlight(editor, 0, 10, KEYWORD, false, null);
            }
        });
        add(editor.getComponent(), BorderLayout.CENTER);
    }

    public void releaseMemory() {
        EditorFactory.getInstance().releaseEditor(editor);
    }

    @Override
    public void publish(String moduleType, String text) {
        ApplicationManager.getApplication().invokeLaterOnWriteThread(() -> {
            WriteCommandAction.runWriteCommandAction(ctx.getProject(), () -> {
                if ("prettier".equals(moduleType)) {
                    editor.getDocument().setText(text);
                }
            });
        });
    }
}
