package com.uc.webview.internal.android;

import android.os.Build;
import android.webkit.WebSettings;
import com.uc.webview.export.WebSettings;

/* loaded from: classes9.dex */
final class l extends WebSettings {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(android.webkit.WebSettings webSettings) {
        this.mSettings = webSettings;
    }

    @Override // com.uc.webview.export.WebSettings
    public final int getForceDark() {
        Integer num;
        if (Build.VERSION.SDK_INT < 29 || (num = (Integer) com.uc.webview.base.g.a(this.mSettings, "getForceDark")) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.uc.webview.export.WebSettings
    public final synchronized int getTextZoom() {
        if (Build.VERSION.SDK_INT >= 14) {
            return this.mSettings.getTextZoom();
        } else if (this.mSettings.getTextSize() == WebSettings.TextSize.SMALLEST) {
            return WebSettings.TextSize.SMALLEST.value;
        } else if (this.mSettings.getTextSize() == WebSettings.TextSize.SMALLER) {
            return WebSettings.TextSize.SMALLER.value;
        } else if (this.mSettings.getTextSize() == WebSettings.TextSize.LARGER) {
            return WebSettings.TextSize.LARGER.value;
        } else if (this.mSettings.getTextSize() == WebSettings.TextSize.LARGEST) {
            return WebSettings.TextSize.LARGEST.value;
        } else {
            return WebSettings.TextSize.NORMAL.value;
        }
    }

    @Override // com.uc.webview.export.WebSettings
    public final void setForceDark(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            com.uc.webview.base.g.a(this.mSettings, "setForceDark", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // com.uc.webview.export.WebSettings
    public final synchronized void setTextZoom(int i) {
        android.webkit.WebSettings webSettings;
        WebSettings.TextSize textSize;
        if (Build.VERSION.SDK_INT >= 14) {
            this.mSettings.setTextZoom(i);
            return;
        }
        if (i == 50) {
            webSettings = this.mSettings;
            textSize = WebSettings.TextSize.SMALLEST;
        } else if (i == 75) {
            webSettings = this.mSettings;
            textSize = WebSettings.TextSize.SMALLER;
        } else if (i != 150) {
            if (i == 200) {
                webSettings = this.mSettings;
                textSize = WebSettings.TextSize.LARGEST;
            }
            this.mSettings.setTextSize(WebSettings.TextSize.NORMAL);
        } else {
            webSettings = this.mSettings;
            textSize = WebSettings.TextSize.LARGER;
        }
        webSettings.setTextSize(textSize);
        this.mSettings.setTextSize(WebSettings.TextSize.NORMAL);
    }
}
