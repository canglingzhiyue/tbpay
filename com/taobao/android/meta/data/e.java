package com.taobao.android.meta.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.a;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e<C extends a> extends a.C0571a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private C k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Map<String, String> o;

    static {
        kge.a(-777892323);
    }

    public e(boolean z, Object obj, boolean z2, boolean z3) {
        super(new a.C0571a.C0572a().a(z).f(z2).a(obj).b(z3));
        this.m = true;
    }

    public final C a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e1079caa", new Object[]{this}) : this.k;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.m;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.n;
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.o;
    }

    public final e<C> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b22655a2", new Object[]{this, new Boolean(z)});
        }
        this.l = z;
        return this;
    }

    public final e<C> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c5ce2923", new Object[]{this, new Boolean(z)});
        }
        this.n = z;
        return this;
    }

    public final e<C> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("94da80d1", new Object[]{this, map});
        }
        this.o = map;
        return this;
    }

    public final e<C> c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d975fca4", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }

    public final e<C> a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d1f98daa", new Object[]{this, c});
        }
        this.k = c;
        C c2 = this.k;
        if (c2 != null) {
            c2.a(this);
        }
        return this;
    }
}
