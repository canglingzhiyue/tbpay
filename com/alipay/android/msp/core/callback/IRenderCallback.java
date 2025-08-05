package com.alipay.android.msp.core.callback;

import com.alipay.android.app.template.ITemplateClickCallback;

/* loaded from: classes3.dex */
public interface IRenderCallback {
    void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str);

    void onEvent(Object obj, String str);
}
