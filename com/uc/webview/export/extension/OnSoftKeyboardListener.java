package com.uc.webview.export.extension;

import android.webkit.ValueCallback;

/* loaded from: classes9.dex */
public interface OnSoftKeyboardListener {
    boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback);

    boolean hideSoftKeyboard();

    boolean onFinishComposingText();
}
