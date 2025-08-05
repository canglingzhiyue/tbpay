package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<T extends UINode> implements com.taobao.android.weex_framework.ui.d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-697028094);
        kge.a(-1337233073);
    }

    @Override // com.taobao.android.weex_framework.bridge.a
    public com.taobao.android.weex_framework.bridge.c<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.ui.d
    public com.taobao.android.weex_framework.bridge.c<T> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("3943a539", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.ui.d
    public com.taobao.android.weex_framework.bridge.c<T> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("a3732d58", new Object[]{this, str});
        }
        return null;
    }
}
