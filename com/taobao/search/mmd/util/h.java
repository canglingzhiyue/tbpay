package com.taobao.search.mmd.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    static {
        kge.a(32468938);
        INSTANCE = new h();
    }

    private h() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : q.a((Object) "CUN", (Object) g.d());
    }
}
