package com.taobao.phenix.intf;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.e;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nis;
import tb.nit;
import tb.niw;
import tb.nje;
import tb.njk;
import tb.nna;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PREFETCH_COUNT_ONCE = 100;

    /* renamed from: a  reason: collision with root package name */
    private final njk f18929a;
    private List<String> b;
    private com.taobao.phenix.intf.event.a<e> c;
    private com.taobao.phenix.intf.event.a<e> d;
    private final e e;

    static {
        kge.a(-661537943);
    }

    public d(njk njkVar, List<String> list) {
        com.taobao.tcommon.core.b.a(njkVar, "module strategy for prefetch cannot be null");
        com.taobao.tcommon.core.b.a(list != null && list.size() > 0, "Urls of prefetch cannot be empty");
        this.f18929a = njkVar;
        this.b = list;
        this.e = new e(new ArrayList(), new ArrayList());
        int size = this.b.size();
        if (size > 100) {
            this.e.h.addAll(this.b.subList(100, size));
            this.b = this.b.subList(0, 100);
            niw.c("Prefetch", "fetch count exceed MAX_PREFETCH_COUNT_ONCE(%d), slice the part exceeding to list of failed", 100);
        }
        this.e.f18930a = this.b.size();
    }

    public d a(com.taobao.phenix.intf.event.a<e> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("826fc396", new Object[]{this, aVar});
        }
        this.d = aVar;
        return this;
    }

    private com.taobao.phenix.request.b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.phenix.request.b) ipChange.ipc$dispatch("8605d7cd", new Object[]{this, str});
        }
        com.taobao.phenix.request.b bVar = new com.taobao.phenix.request.b(str, b.h().l(), b.h().g());
        bVar.a(this.f18929a.f31501a);
        bVar.f(1);
        bVar.d(this.f18929a.c);
        bVar.e(this.f18929a.d);
        bVar.a(this.f18929a.e, 2);
        bVar.a(this.f18929a.f, 4);
        return bVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        niw.a("Prefetch", "Start to prefetch with business=%s, total=%d", this.f18929a.f31501a, Integer.valueOf(this.e.f18930a));
        nis k = b.h().k();
        nna<nje, com.taobao.phenix.request.b> c = k.c();
        if (c == null) {
            niw.d("Prefetch", "Cannot prefetch before Phenix.build() calling", new Object[0]);
            this.e.h.addAll(this.b);
            com.taobao.phenix.intf.event.a<e> aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.onHappen(this.e);
            return;
        }
        com.taobao.phenix.request.a m = b.h().m();
        for (String str : this.b) {
            nit nitVar = new nit(a(str), this);
            nitVar.a(m);
            c.b(nitVar.a(k.a().e()));
        }
    }

    public void a(com.taobao.phenix.request.b bVar, nje njeVar, Throwable th) {
        e eVar;
        e eVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0c3bcb", new Object[]{this, bVar, njeVar, th});
            return;
        }
        if (njeVar != null) {
            this.e.g.add(bVar.p());
            this.e.c = (int) (eVar.c + njeVar.b);
            this.e.e = (int) (eVar2.e + (njeVar.c ? 0L : njeVar.b));
            this.e.d += !njeVar.c ? 1 : 0;
        } else {
            this.e.h.add(bVar.p());
            if (th != null) {
                this.e.i.add(th);
            }
        }
        this.e.b++;
        if (this.c != null) {
            niw.a("Prefetch", "Progress on happen with business=%s, event=%s", this.f18929a.f31501a, this.e);
            this.c.onHappen(this.e);
        }
        if (this.d == null || this.e.b != this.e.f18930a) {
            return;
        }
        e eVar3 = this.e;
        eVar3.f = eVar3.h.size() == 0;
        niw.a("Prefetch", "Complete on happen with business=%s, event=%s", this.f18929a.f31501a, this.e);
        this.d.onHappen(this.e);
    }
}
