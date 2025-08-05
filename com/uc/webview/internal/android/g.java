package com.uc.webview.internal.android;

import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebHistoryItem;

/* loaded from: classes9.dex */
final class g extends WebBackForwardList {

    /* loaded from: classes9.dex */
    class a extends WebHistoryItem {
        a(android.webkit.WebHistoryItem webHistoryItem) {
            this.mItem = webHistoryItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(android.webkit.WebBackForwardList webBackForwardList) {
        this.mList = webBackForwardList;
    }

    @Override // com.uc.webview.export.WebBackForwardList
    public final WebHistoryItem createItem(android.webkit.WebHistoryItem webHistoryItem) {
        return new a(webHistoryItem);
    }
}
