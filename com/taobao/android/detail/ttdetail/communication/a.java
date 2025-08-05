package com.taobao.android.detail.ttdetail.communication;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class a<T extends JSONObject> implements d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f10518a = h.a(getClass());
    private T b;

    static {
        kge.a(1387324010);
        kge.a(1717454186);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.d
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f10518a;
    }

    public T bZ_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("72b9874e", new Object[]{this}) : this.b;
    }
}
