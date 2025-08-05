package com.taobao.tbliveinteractive;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbliveinteractive.business.list.InteractiveShowInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f22107a;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private e i;
    private List<a> h = new ArrayList();
    private final long b = h();

    static {
        kge.a(-604396599);
        kge.a(782545871);
    }

    public c(e eVar, long j) {
        this.i = eVar;
        this.f22107a = j;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        list.clear();
        this.h = null;
    }

    public void a(a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0ac70", new Object[]{this, aVar});
        } else if (aVar == null || (list = this.h) == null) {
        } else {
            list.add(aVar);
        }
    }

    public void b(a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7887ff1", new Object[]{this, aVar});
        } else if (aVar == null || (list = this.h) == null) {
        } else {
            list.remove(aVar);
        }
    }

    private long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : System.currentTimeMillis();
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = h();
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(z);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void dl_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678ac5de", new Object[]{this});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.dl_();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = h();
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.c();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.b();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = h();
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.d();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f = h();
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.e();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84243444", new Object[]{this, interactiveComponent});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(interactiveComponent);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37e16c1", new Object[]{this, interactiveComponent, map});
            return;
        }
        if (this.g == 0) {
            this.g = h();
            i();
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(interactiveComponent, map);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767001c2", new Object[]{this, interactiveComponent, interactiveShowInfo});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(interactiveComponent, interactiveShowInfo);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9ca02", new Object[]{this, interactiveComponent, map});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.b(interactiveComponent, map);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<a> list = this.h;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.f();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enterRoom", Long.valueOf(this.f22107a));
        hashMap.put("gotLiveDetail", Long.valueOf(this.b));
        hashMap.put("gotComponentList", Long.valueOf(this.c));
        hashMap.put("initWebView", Long.valueOf(this.d));
        hashMap.put("firstInteractComponent", Long.valueOf(this.g));
        this.i.a("TBLiveWVPlugin.Event.performanceInfo", hashMap);
    }
}
