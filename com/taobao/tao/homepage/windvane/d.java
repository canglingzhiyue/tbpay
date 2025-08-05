package com.taobao.tao.homepage.windvane;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tmv;

/* loaded from: classes8.dex */
public class d implements tmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f20617a;
    private final long b;

    static {
        kge.a(-1846568295);
        kge.a(101029828);
    }

    public d(JSONObject jSONObject, long j) {
        this.f20617a = jSONObject;
        this.b = j;
    }

    @Override // tb.tmv
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f20617a;
    }

    @Override // tb.tmv
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }
}
