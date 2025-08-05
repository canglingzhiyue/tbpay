package com.uc.webview.export.extension;

import com.uc.webview.export.WebHistoryItem;

/* loaded from: classes9.dex */
public interface IBackForwardListListener {
    void onIndexChanged(WebHistoryItem webHistoryItem, int i);

    void onNewHistoryItem(WebHistoryItem webHistoryItem);
}
