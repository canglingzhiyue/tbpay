package com.alibaba.android.umbrella.link;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bpq;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2820a = new ConcurrentHashMap();

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2820a.isEmpty();
    }

    public static c a(com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("224c3c9f", new Object[]{aVar});
        }
        c cVar = new c();
        if (aVar == null) {
            cVar.a("userData", "");
            return cVar;
        }
        Map<String, ?> a2 = aVar.a();
        if (a2 == null || a2.isEmpty()) {
            cVar.a("userData", "");
            return cVar;
        }
        bpq.a(cVar.f2820a, a2);
        return cVar;
    }

    public c a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("71eb4be7", new Object[]{this, str, obj});
        }
        if (j.a(str)) {
            return this;
        }
        if (obj == null) {
            this.f2820a.put(str, "null value");
            return this;
        }
        this.f2820a.put(str, obj);
        return this;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f2820a;
    }
}
