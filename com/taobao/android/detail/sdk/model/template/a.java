package com.taobao.android.detail.sdk.model.template;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, DescModel> f10306a = new HashMap<>();

    static {
        kge.a(-149069942);
    }

    public a() {
        tpc.a("com.taobao.android.detail.sdk.model.template.DescDynamicModel");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f10306a.containsKey(str);
    }
}
