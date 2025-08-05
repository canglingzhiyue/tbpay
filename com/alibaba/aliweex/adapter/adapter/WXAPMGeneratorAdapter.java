package com.alibaba.aliweex.adapter.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.performance.a;
import com.taobao.weex.performance.c;
import java.io.Serializable;
import tb.and;
import tb.kge;

/* loaded from: classes2.dex */
public class WXAPMGeneratorAdapter implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2130672088);
        kge.a(-108192764);
        kge.a(1028243835);
    }

    @Override // com.taobao.weex.performance.a
    public c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9192775a", new Object[]{this, str}) : new and();
    }
}
