package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.fut;
import tb.fva;
import tb.fzm;
import tb.kge;

/* loaded from: classes5.dex */
public class by {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f11832a;
    public int b;
    public int c;
    public String d;
    public com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> e;
    public com.taobao.android.dinamicx.model.b<fut> f;
    public WeakReference<com.taobao.android.dinamicx.model.b<bn>> g;
    public WeakReference<Context> h;
    public WeakReference<fzm> i;
    public WeakReference<am> j;
    public WeakReference<fva> k;
    public r l;
    @Deprecated
    public Object m;
    public ba n;
    public com.taobao.analysis.v3.h o;
    public Map<String, String> p;
    public WeakReference<DXRootView> q;
    public WeakReference<bo> r;

    static {
        kge.a(-1514904017);
    }

    public by(r rVar) {
        this.l = rVar;
        DXEngineConfig a2 = rVar.a();
        if (a2 != null) {
            this.d = a2.c();
        }
    }

    public by a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (by) ipChange.ipc$dispatch("6a370df3", new Object[]{this});
        }
        by byVar = new by(this.l);
        byVar.b = this.b;
        byVar.f11832a = this.f11832a;
        byVar.c = this.c;
        byVar.d = this.d;
        byVar.e = this.e;
        byVar.f = this.f;
        byVar.g = this.g;
        byVar.h = this.h;
        byVar.i = this.i;
        byVar.r = this.r;
        byVar.j = this.j;
        byVar.k = this.k;
        byVar.m = this.m;
        byVar.n = this.n;
        byVar.o = this.o;
        byVar.p = this.p;
        byVar.q = this.q;
        return byVar;
    }
}
