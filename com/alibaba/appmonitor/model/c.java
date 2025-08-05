package com.alibaba.appmonitor.model;

import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class c implements com.alibaba.appmonitor.pool.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<a, d> f2889a = Collections.synchronizedMap(new HashMap());

    static {
        kge.a(-190462532);
        kge.a(1105107017);
    }

    public List<d> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : new ArrayList(this.f2889a.values());
    }

    public d a(Integer num, String str, String str2, String str3, Class<? extends d> cls) {
        a aVar;
        boolean z;
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("70d9c7b", new Object[]{this, num, str, str2, str3, cls});
        }
        if (num.intValue() == EventType.STAT.getEventId()) {
            aVar = b.a().a(str, str2);
            z = false;
        } else {
            aVar = (a) com.alibaba.appmonitor.pool.a.a().a(a.class, str, str2, str3);
            z = true;
        }
        d dVar2 = null;
        if (aVar != null) {
            if (this.f2889a.containsKey(aVar)) {
                dVar2 = this.f2889a.get(aVar);
            } else {
                synchronized (c.class) {
                    dVar = (d) com.alibaba.appmonitor.pool.a.a().a(cls, num, str, str2, str3);
                    this.f2889a.put(aVar, dVar);
                }
                dVar2 = dVar;
                z = false;
            }
            if (z) {
                com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) aVar);
            }
        }
        return dVar2;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        for (d dVar : this.f2889a.values()) {
            com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) dVar);
        }
        this.f2889a.clear();
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        } else if (this.f2889a != null) {
        } else {
            this.f2889a = Collections.synchronizedMap(new HashMap());
        }
    }
}
