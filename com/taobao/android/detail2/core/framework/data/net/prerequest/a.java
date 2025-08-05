package com.taobao.android.detail2.core.framework.data.net.prerequest;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fjx;
import tb.fjy;
import tb.kge;

/* loaded from: classes.dex */
public class a implements com.taobao.android.preload.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(570555127);
        kge.a(1375254923);
    }

    @Override // com.taobao.android.preload.b
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : fjx.b(fjy.a(str), fjx.a(str));
    }
}
