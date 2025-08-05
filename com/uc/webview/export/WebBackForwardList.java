package com.uc.webview.export;

/* loaded from: classes9.dex */
public class WebBackForwardList {
    protected android.webkit.WebBackForwardList mList = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public synchronized WebBackForwardList m1602clone() {
        return null;
    }

    protected WebHistoryItem createItem(android.webkit.WebHistoryItem webHistoryItem) {
        return null;
    }

    public synchronized int getCurrentIndex() {
        return this.mList.getCurrentIndex();
    }

    public synchronized WebHistoryItem getCurrentItem() {
        android.webkit.WebHistoryItem currentItem = this.mList.getCurrentItem();
        if (currentItem == null) {
            return null;
        }
        return createItem(currentItem);
    }

    public synchronized WebHistoryItem getItemAtIndex(int i) {
        android.webkit.WebHistoryItem itemAtIndex = this.mList.getItemAtIndex(i);
        if (itemAtIndex == null) {
            return null;
        }
        return createItem(itemAtIndex);
    }

    public synchronized int getSize() {
        return this.mList.getSize();
    }
}
