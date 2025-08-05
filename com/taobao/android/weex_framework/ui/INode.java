package com.taobao.android.weex_framework.ui;

import android.graphics.Rect;
import android.view.View;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;

/* loaded from: classes6.dex */
public interface INode {
    void bindNodeHolder(d dVar);

    /* renamed from: getAttachedView */
    View mo1035getAttachedView();

    int getBottom();

    Rect getGlobalVisibleRect();

    MUSDKInstance getInstance();

    com.taobao.android.weex_framework.bridge.c getInvoker(MUSValue mUSValue);

    int getLeft();

    float getOpacity();

    int getRight();

    int getTop();

    void setInstance(MUSDKInstance mUSDKInstance);

    void setOpacity(float f);

    void updateAttrs(MUSProps mUSProps);

    void updateStyles(MUSProps mUSProps);
}
