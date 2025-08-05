package com.alipay.android.app.template;

import android.view.View;

/* loaded from: classes3.dex */
public interface ITemplateDisposable extends View.OnKeyListener {
    void destroy();

    int getContextHashCode();

    boolean hiddenKeyboardService(boolean z);

    boolean isDestroyed();
}
