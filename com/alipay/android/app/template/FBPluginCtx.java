package com.alipay.android.app.template;

import android.app.Dialog;

/* loaded from: classes3.dex */
public interface FBPluginCtx {
    boolean deliverOnBlur(long j);

    int deliverOnChange(long j, String str);

    boolean deliverOnClick(long j);

    boolean deliverOnFocus(long j);

    int deliverOnInput(long j, String str);

    boolean deliverOnKeyDown(long j, int i);

    boolean deliverOnLongpress(long j);

    boolean deliverOnMouseDown(long j, int i, int i2);

    boolean deliverOnMouseMove(long j, int i, int i2);

    boolean deliverOnMouseUp(long j, int i, int i2);

    Object getBodyView();

    TemplateKeyboardService getDefaultKeyboardService();

    FBContext getFbContext();

    Dialog getShowingDialog();

    TemplateKeyboardService getTemplateKeyboardService();

    TemplatePasswordService getTemplatePasswordService();

    boolean hasInput();

    boolean isFullscreen();

    boolean isOnloadFinish();

    @Deprecated
    int nativeExecuteJs(String str);

    void safeExecuteJs(String str);

    void setAutoFocus(FBFocusable fBFocusable);

    void setHasInput(boolean z);
}
