package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class bc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f12076a;
    public int f;
    public int g;
    public String j;
    public HashMap<String, Integer> k;
    public int b = -1;
    public boolean c = false;
    public int d = 1;
    public boolean e = true;
    public int h = 0;
    public boolean i = false;
    public boolean l = false;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;

    static {
        kge.a(-1129133717);
    }

    public bc a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bc) ipChange.ipc$dispatch("e2a643c4", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        bc bcVar = new bc();
        bcVar.f12076a = this.f12076a;
        bcVar.b = this.b;
        bcVar.c = this.c;
        bcVar.d = this.d;
        bcVar.e = this.e;
        bcVar.f = this.f;
        bcVar.g = this.g;
        bcVar.h = this.h;
        bcVar.i = this.i;
        bcVar.j = this.j;
        bcVar.k = this.k;
        bcVar.l = this.l;
        bcVar.n = this.n;
        bcVar.m = this.m;
        bcVar.o = this.o;
        return bcVar;
    }
}
