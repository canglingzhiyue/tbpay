package com.alipay.android.app.template;

import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
public interface TemplateKeyboardService {
    void destroyKeyboard(View view);

    boolean hideKeyboard(View view);

    boolean showKeyboard(EditText editText, KeyboardType keyboardType, View view, View view2, boolean z, int i);
}
