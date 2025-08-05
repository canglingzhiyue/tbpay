package com.alibaba.triver.triver_shop.newShop.manager;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f3872a = new ArrayList<>();
    private final int b;

    static {
        kge.a(-1996632652);
    }

    public c(int i) {
        this.b = Math.max(i, 1);
    }

    public final ArrayList<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f3872a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final synchronized void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.f3872a.add(t);
        }
    }

    public final synchronized T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        } else if (this.f3872a.isEmpty()) {
            return null;
        } else {
            return (T) p.h((List<? extends Object>) this.f3872a);
        }
    }

    public final synchronized T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("50c537a7", new Object[]{this});
        }
        T c = c();
        if (c == null) {
            return null;
        }
        this.f3872a.remove(c);
        return c;
    }

    public final synchronized void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else {
            this.f3872a.remove(t);
        }
    }

    public final synchronized int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return this.f3872a.size();
    }

    public final synchronized boolean c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, t})).booleanValue();
        }
        return this.f3872a.contains(t);
    }

    public final synchronized void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, t});
            return;
        }
        b(t);
        a(t);
    }
}
