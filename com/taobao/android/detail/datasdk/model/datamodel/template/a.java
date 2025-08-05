package com.taobao.android.detail.datasdk.model.datamodel.template;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, DescModel> f10062a = new HashMap<>();

    static {
        kge.a(239401168);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f10062a.containsKey(str);
    }

    public a() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.DescDynamicModel");
    }
}
