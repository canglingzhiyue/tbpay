package com.uc.webview.export;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public class WebHistoryItem {
    protected android.webkit.WebHistoryItem mItem = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public synchronized WebHistoryItem m1603clone() {
        return null;
    }

    public Bitmap getFavicon() {
        return this.mItem.getFavicon();
    }

    public String getOriginalUrl() {
        return this.mItem.getOriginalUrl();
    }

    public String getTitle() {
        return this.mItem.getTitle();
    }

    public String getUrl() {
        return this.mItem.getUrl();
    }
}
