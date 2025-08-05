package com.taobao.search.musie.taowise;

import android.content.Context;
import android.view.View;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;

/* loaded from: classes7.dex */
public interface a {
    View a(Context context);

    void a(int i, int i2, int i3, int i4, int[] iArr);

    void a(MUSDKInstance mUSDKInstance, Object obj);

    void a(UINode uINode);

    boolean a(UINode uINode, String str, MUSValue mUSValue);

    boolean b(UINode uINode, String str, MUSValue mUSValue);
}
