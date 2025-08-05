package com.uc.webview.export.extension;

import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public class ISoftKeyboardListener implements IExtender {
    public boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback) {
        return false;
    }

    public boolean hideSoftKeyboard() {
        return false;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public boolean onFinishComposingText() {
        return false;
    }
}
