package com.taobao.android.revisionswitch.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, Object> f14897a = new ConcurrentHashMap();

    public void a(T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, t, new Boolean(z)});
        } else {
            this.f14897a.put(t, Boolean.valueOf(z));
        }
    }

    public void a(T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{this, t, obj});
        } else {
            this.f14897a.put(t, obj);
        }
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue() : b(t, false);
    }

    public boolean b(T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a7f77f3", new Object[]{this, t, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f14897a.get(t);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public Map<T, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f14897a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f14897a.equals(((c) obj).a());
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue() : this.f14897a.containsKey(t);
    }

    public Set<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.f14897a.keySet();
    }
}
