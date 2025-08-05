package com.taobao.mrt;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.LogService;
import com.taobao.mrt.service.a;
import com.taobao.mrt.service.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static f f;
    public a b;
    public b d;
    private Map<String, e> e = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public LogService f18247a = null;
    public com.taobao.mrt.service.c c = null;

    static {
        kge.a(2065810804);
        f = new f();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3365668a", new Object[0]) : f;
    }

    public f a(LogService logService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("212b0b17", new Object[]{this, logService});
        }
        this.f18247a = logService;
        return this;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4858be28", new Object[]{this}) : this.b;
    }

    public f a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3516b80f", new Object[]{this, aVar});
        }
        this.b = aVar;
        return this;
    }

    public com.taobao.mrt.service.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mrt.service.c) ipChange.ipc$dispatch("49056a05", new Object[]{this}) : this.c;
    }

    public f a(com.taobao.mrt.service.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4e48a311", new Object[]{this, cVar});
        }
        this.c = cVar;
        return this;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("49b21585", new Object[]{this}) : this.d;
    }

    public f a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("41afad90", new Object[]{this, bVar});
        }
        this.d = bVar;
        return this;
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0a8def", new Object[]{this, str, eVar});
        } else {
            this.e.put(str, eVar);
        }
    }

    public e a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("8d61d3e1", new Object[]{this, str}) : this.e.get(str);
    }
}
