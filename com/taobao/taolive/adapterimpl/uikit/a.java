package com.taobao.taolive.adapterimpl.uikit;

import com.alilive.adapter.uikit.d;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1036207250);
        kge.a(276862012);
    }

    @Override // com.alilive.adapter.uikit.d
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : com.taobao.phenix.request.d.a(str);
    }
}
