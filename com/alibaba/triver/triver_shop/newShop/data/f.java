package com.alibaba.triver.triver_shop.newShop.data;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f3832a;
    private final d b;
    private final int c;
    private int d;
    private g[] e;

    static {
        kge.a(653531421);
    }

    public f(JSONArray jSONArray, d dVar, int i) {
        this.f3832a = jSONArray;
        this.b = dVar;
        this.c = i;
        b();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.f3832a;
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        g[] gVarArr = new g[size];
        for (int i = 0; i < size; i++) {
            gVarArr[i] = new g(this.f3832a.getJSONObject(i), this.b, this.c, i);
        }
        this.e = gVarArr;
        this.d = this.f3832a.size();
    }

    public final g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b32972c9", new Object[]{this, new Integer(i)});
        }
        g[] gVarArr = this.e;
        if (gVarArr == null || i >= this.d) {
            return null;
        }
        q.a(gVarArr);
        return gVarArr[i];
    }
}
