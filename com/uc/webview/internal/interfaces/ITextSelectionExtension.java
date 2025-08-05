package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;
import com.uc.webview.export.extension.TextSelectionExtension;

/* loaded from: classes9.dex */
public interface ITextSelectionExtension extends IExtender {
    void expandSelection();

    String getSelection();

    void paste(String str);

    void selectAll();

    boolean selectText();

    void selectionDone();

    void setTextSelectionClient(TextSelectionExtension.TextSelectionClient textSelectionClient);
}
