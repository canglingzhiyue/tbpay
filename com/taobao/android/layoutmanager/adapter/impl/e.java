package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements com.taobao.tao.flexbox.layoutmanager.adapter.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1158204520);
        kge.a(-462494402);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.c
    public com.taobao.tao.flexbox.layoutmanager.ac.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.ac.c) ipChange.ipc$dispatch("33e34c7a", new Object[]{this}) : new TNodeJSCore();
    }
}
