package com.taobao.android.weex;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class m implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final m f15874a;

    static {
        kge.a(1523304501);
        kge.a(7484533);
        f15874a = new m();
    }

    private m() {
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("85e6dae7", new Object[0]) : f15874a;
    }

    @Override // com.taobao.android.weex.l
    public WeexValue a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("31d34c04", new Object[]{this, jSONObject}) : WeexValueImpl.ofJSONObject(jSONObject);
    }

    @Override // com.taobao.android.weex.l
    public WeexValue a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("8db8b3c0", new Object[]{this, obj}) : WeexValueImpl.convert(obj);
    }
}
