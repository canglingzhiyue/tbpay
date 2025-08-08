package com.taobao.android.detail.core.open;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dzr;
import tb.dzy;
import tb.egb;
import tb.egf;
import tb.egk;
import tb.egq;
import tb.ehs;
import tb.ehw;
import tb.eic;
import tb.eig;
import tb.emu;
import tb.emx;
import tb.enn;
import tb.eno;
import tb.eon;
import tb.eop;
import tb.eov;
import tb.epf;
import tb.epi;
import tb.epj;
import tb.epk;
import tb.kge;

/* loaded from: classes4.dex */
public class h implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f9776a;
    private c c;
    private k d;
    private egf e;
    private dzy f;
    private e g;
    private e h;
    private e i;
    private b j;
    private ArrayList<com.taobao.android.detail.core.detail.widget.container.b> k;
    private HashMap<Integer, com.taobao.android.detail.core.detail.widget.container.b> l;
    private f m;
    private eig n;
    private egk o;
    private com.taobao.android.detail.core.detail.popup.h q;
    private eic r;
    private SparseArray<Map<String, Object>> b = new SparseArray<>();
    private ProtocolType p = ProtocolType.TYPE_UNKNOWN;

    static {
        kge.a(911799561);
        kge.a(1100933961);
    }

    public h(Context context, a aVar) {
        if (context == null || aVar == null || StringUtils.isEmpty(aVar.a())) {
            throw new IllegalArgumentException("传参异常");
        }
        this.f9776a = context;
        l();
        this.c = new c();
        this.d = new k();
        this.e = new egf();
        this.f = new dzy();
        this.q = new com.taobao.android.detail.core.detail.popup.h();
        a("default", (com.taobao.android.detail.core.detail.popup.f) new com.taobao.android.detail.core.detail.popup.c(context));
        epj b = emx.a(context).b();
        b.a(this.e);
        this.o = new egk();
        this.r = new eic();
        b.a(this.o);
        ehs.a(context, new egb());
        b.a(ehs.a(context).b());
        emu.a("com.taobao.android.detail.core.open.DetailSdkImpl");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (epj.a() == null) {
            throw new RuntimeException("AppAdapter is null, pay attention to DetailAdapterManager");
        } else {
            if (epj.f() == null) {
                throw new RuntimeException("NavAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.g() == null) {
                throw new RuntimeException("ShareAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.j() == null) {
                throw new RuntimeException("TrackAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.h() == null) {
                throw new RuntimeException("ConfigAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.i() == null) {
                throw new RuntimeException("LogAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.b() == null) {
                throw new RuntimeException("ImageLoaderAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.c() == null) {
                throw new RuntimeException("LoginAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.k() == null) {
                throw new RuntimeException("LocationAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.p() == null) {
                throw new RuntimeException("HttpAdapter is null, pay attention to DetailAdapterManager");
            }
            if (epj.q() == null) {
                throw new RuntimeException("IDataHub is null, pay attention to DetailAdapterManager");
            }
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(ehw ehwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6df0a24", new Object[]{this, ehwVar});
        } else {
            this.d.a(ehwVar);
        }
    }

    public ehw b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehw) ipChange.ipc$dispatch("16b5c8c9", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(eop eopVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73e8012", new Object[]{this, eopVar});
        } else {
            this.e.a(eopVar, 5);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(eov eovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7413a4c", new Object[]{this, eovVar});
        } else {
            this.o.a(eovVar, 5);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(eon eonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73d9754", new Object[]{this, eonVar});
        } else {
            ehs.a(this.f9776a, eonVar);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(dzr dzrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62592bc", new Object[]{this, dzrVar});
        } else {
            this.f.a(dzrVar, 5);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(epk epkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74a51b8", new Object[]{this, epkVar});
        } else {
            emx.a(this.f9776a).b().a(epkVar);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public com.taobao.android.detail.core.detail.kit.view.holder.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> a(Activity activity, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.c) ipChange.ipc$dispatch("6d46f79b", new Object[]{this, activity, bVar}) : this.f.a(activity, bVar);
    }

    @Override // com.taobao.android.detail.core.open.g
    public com.taobao.android.detail.core.detail.kit.view.holder.desc.b<epf> a(Activity activity, epf epfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) ipChange.ipc$dispatch("f7bcaee7", new Object[]{this, activity, epfVar}) : this.f.a(activity, epfVar);
    }

    @Override // com.taobao.android.detail.core.open.g
    public com.taobao.android.detail.core.detail.kit.view.holder.c<egq> a(Activity activity, egq egqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.c) ipChange.ipc$dispatch("e978434", new Object[]{this, activity, egqVar}) : this.f.a(activity, egqVar);
    }

    @Override // com.taobao.android.detail.core.open.g
    public com.taobao.android.detail.core.detail.kit.view.holder.c<epi> a(Activity activity, epi epiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.c) ipChange.ipc$dispatch("6c9bcdc5", new Object[]{this, activity, epiVar}) : this.f.a(activity, epiVar);
    }

    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("88b1ba96", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843e9bd4", new Object[]{this, eVar});
        } else {
            this.g = eVar;
        }
    }

    public e d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6df32957", new Object[]{this}) : this.h;
    }

    public e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("53349818", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e8a50", new Object[]{this, event});
        } else {
            com.taobao.android.trade.event.f.a(this.f9776a).a(event);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public <T extends enn> void a(Class<T> cls, com.taobao.android.trade.event.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1b378d", new Object[]{this, cls, jVar});
        } else {
            com.taobao.android.trade.event.f.a(this.f9776a).a(eno.a(cls), jVar);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(DetailBusinessDetector detailBusinessDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9c2640", new Object[]{this, detailBusinessDetector});
        } else {
            this.c.a(detailBusinessDetector);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(com.taobao.android.detail.core.detail.widget.container.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aab6575", new Object[]{this, bVar});
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        com.taobao.android.detail.core.detail.widget.container.b bVar2 = this.l.get(Integer.valueOf(bVar.b()));
        if (bVar2 != null) {
            this.k.remove(bVar2);
        }
        this.l.put(Integer.valueOf(bVar.b()), bVar);
        this.k.add(bVar);
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843f1033", new Object[]{this, fVar});
        } else {
            this.m = fVar;
        }
    }

    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("387606f8", new Object[]{this}) : this.m;
    }

    public Iterator<com.taobao.android.detail.core.detail.widget.container.b> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("70ae7349", new Object[]{this}) : this.k.iterator();
    }

    public com.taobao.android.detail.core.detail.widget.container.b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.widget.container.b) ipChange.ipc$dispatch("c659f868", new Object[]{this, new Integer(i)});
        }
        HashMap<Integer, com.taobao.android.detail.core.detail.widget.container.b> hashMap = this.l;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    public DetailBusinessDetector h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailBusinessDetector) ipChange.ipc$dispatch("49d6fe1f", new Object[]{this}) : this.c;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d("DetailSdk", "destroy");
        this.j = null;
        this.h = null;
        this.g = null;
        ArrayList<com.taobao.android.detail.core.detail.widget.container.b> arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
            this.k = null;
        }
        HashMap<Integer, com.taobao.android.detail.core.detail.widget.container.b> hashMap = this.l;
        if (hashMap != null) {
            hashMap.clear();
            this.l = null;
        }
        this.m = null;
        SparseArray<Map<String, Object>> sparseArray = this.b;
        if (sparseArray != null) {
            sparseArray.clear();
            this.b = null;
        }
        com.taobao.android.detail.core.detail.popup.h hVar = this.q;
        if (hVar != null) {
            hVar.a();
            this.q = null;
        }
        com.taobao.android.trade.event.f.a(this.f9776a).c();
        j();
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(eig eigVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e5dbb5", new Object[]{this, eigVar});
        } else {
            this.n = eigVar;
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public ProtocolType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProtocolType) ipChange.ipc$dispatch("a849a90b", new Object[]{this}) : this.p;
    }

    @Override // com.taobao.android.detail.core.open.g
    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8441ca6d", new Object[]{this, lVar});
        } else {
            this.r.a(lVar);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public void b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472e33cc", new Object[]{this, lVar});
        } else {
            this.r.b(lVar);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.r.a();
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue() : this.r.a(str, obj);
    }

    public void a(ProtocolType protocolType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92257345", new Object[]{this, protocolType});
        } else {
            this.p = protocolType;
        }
    }

    public eig k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eig) ipChange.ipc$dispatch("5bf49af1", new Object[]{this}) : this.n;
    }

    public void a(String str, com.taobao.android.detail.core.detail.popup.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c334e85", new Object[]{this, str, fVar});
        } else {
            this.q.a(str, fVar);
        }
    }

    @Override // com.taobao.android.detail.core.open.g
    public com.taobao.android.detail.core.detail.popup.f a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.popup.f) ipChange.ipc$dispatch("8f2f8d9", new Object[]{this, str}) : this.q.a(str);
    }
}
