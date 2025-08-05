package com.taobao.android.live.plugin.atype.flexalocal.comments.notify;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.InteractiveComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.hgo;
import tb.hgp;
import tb.hgq;
import tb.hgr;
import tb.kge;
import tb.phq;
import tb.plx;
import tb.ply;
import tb.xkw;

/* loaded from: classes5.dex */
public class f implements com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b, d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private phq f13696a;
    private ArrayList<c> b;
    private hgr c;
    private hgp d;
    private hgo e;
    private hgq f;
    private a g;
    private volatile boolean h;
    private FrameLayout i;
    private FrameLayout j;
    private ConcurrentHashMap<Object, Long> k = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> l = new ConcurrentHashMap<>();
    private com.taobao.tbliveinteractive.b m;
    private com.taobao.tbliveinteractive.e n;
    private b o;
    private boolean p;
    private boolean q;
    private SubRewardNiubilityEnterEventController r;

    static {
        kge.a(1666411019);
        kge.a(-1473782326);
        kge.a(-2012849775);
    }

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ead280a", new Object[]{fVar});
        } else {
            fVar.k();
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f88c0e", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.h = z;
        return z;
    }

    public static /* synthetic */ ConcurrentHashMap b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("9506cedd", new Object[]{fVar}) : fVar.l;
    }

    public static /* synthetic */ hgp c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgp) ipChange.ipc$dispatch("245c8a8d", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ a d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("428daf2c", new Object[]{fVar}) : fVar.g;
    }

    public f(phq phqVar, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z) {
        this.f13696a = phqVar;
        this.i = frameLayout;
        this.j = frameLayout2;
        this.q = z;
        if (phqVar != null) {
            this.n = phqVar.p();
        }
        this.o = new b();
        com.taobao.tbliveinteractive.e eVar = this.n;
        if (eVar != null) {
            this.m = eVar.h();
        }
        if (!this.p) {
            this.p = true;
            com.taobao.tbliveinteractive.e eVar2 = this.n;
            if (eVar2 != null && eVar2.c() != null) {
                this.n.c().a(this.o);
            }
        }
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.g = new a();
        this.c = new hgr(this, this.f13696a, this.q);
        this.d = new hgp(this, this.f13696a, this.q);
        this.r = new SubRewardNiubilityEnterEventController(this, this.f13696a, this.q);
        this.e = new hgo(this, this.f13696a, this.q);
        this.f = new hgq(this, this.f13696a, this.q);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        phq phqVar = this.f13696a;
        if (phqVar != null) {
            this.n = phqVar.p();
        }
        if (!this.p) {
            this.p = true;
            com.taobao.tbliveinteractive.e eVar = this.n;
            if (eVar != null && eVar.c() != null) {
                this.n.c().a(this.o);
            }
        }
        if (ply.y()) {
            this.h = false;
        }
        this.b = new ArrayList<>();
        this.b.add(this.d);
        this.b.add(this.c);
        this.b.add(this.f);
        this.b.add(this.e);
        this.b.add(this.r);
        Collections.sort(this.b, new Comparator<c>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(c cVar, c cVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, cVar, cVar2})).intValue() : a(cVar, cVar2);
            }

            public int a(c cVar, c cVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("28dbca3b", new Object[]{this, cVar, cVar2})).intValue() : cVar2.b() - cVar.b();
            }
        });
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.p = false;
        com.taobao.tbliveinteractive.e eVar = this.n;
        if (eVar != null && eVar.c() != null) {
            this.n.c().b(this.o);
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                c cVar = this.b.get(i);
                if (cVar != null) {
                    cVar.f();
                }
            }
        }
        this.l.clear();
        this.k.clear();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.d
    public void a(VideoInfo.AccountTag accountTag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5944fa", new Object[]{this, accountTag});
            return;
        }
        hgr hgrVar = this.c;
        if (hgrVar == null) {
            return;
        }
        hgrVar.a(accountTag);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.d
    public void a(List<ImportantEventItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        hgp hgpVar = this.d;
        if (hgpVar != null) {
            hgpVar.a(list);
        }
        if (!this.q) {
            a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateImportantData");
        sb.append(list == null ? "null" : Integer.valueOf(list.size()));
        plx.a("ImportantEventController", sb.toString());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h) {
        } else {
            phq phqVar = this.f13696a;
            if (phqVar != null && phqVar.z() != null && this.f13696a.z().M()) {
                return;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                k();
            } else {
                this.g.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            f.a(f.this);
                        }
                    }
                });
            }
        }
    }

    private void k() {
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.q) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                c cVar = this.b.get(i2);
                if (cVar.e()) {
                    this.h = true;
                    cVar.c();
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            while (true) {
                if (i >= this.b.size()) {
                    break;
                }
                c cVar2 = this.b.get(i);
                if (cVar2.d()) {
                    this.h = true;
                    cVar2.c();
                    break;
                }
                i++;
            }
        }
        phq phqVar = this.f13696a;
        String G = phqVar == null ? null : phqVar.G();
        if (!this.h) {
            c().e().a(xkw.EVENT_RESUME_GIFT_MESSAGE, "start", G);
            plx.a("ImportantEventController", "notify gift message start resume");
            return;
        }
        c().e().a(xkw.EVENT_RESUME_GIFT_MESSAGE, "stop", G);
        plx.a("ImportantEventController", "notify gift message stop resume");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.h) {
        } else {
            this.g.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    f.a(f.this, false);
                    plx.a("ImportantEventController", "endConsumeMessage mIsConsuming false");
                    f.this.a();
                }
            }, z ? ply.x().longValue() : 0L);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(true);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public com.taobao.alilive.aliliveframework.frame.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("3c492b1f", new Object[]{this}) : this.f13696a;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public Handler d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this}) : this.j;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.k.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
        }
        if (this.k.isEmpty() || !this.k.containsKey(obj)) {
            return true;
        }
        if (Long.valueOf(SystemClock.elapsedRealtime()).longValue() - this.k.get(obj).longValue() > ply.t().longValue()) {
            try {
                if (obj instanceof ImportantEventItem) {
                    plx.a("ImportantEventController", "type:" + ((ImportantEventItem) obj).type + "utParams:" + ((ImportantEventItem) obj).utParams.showParams);
                }
                return true;
            } catch (Exception e) {
                plx.b("ImportantEventController", "isMessageTimeout Exception:" + e.getMessage());
                return true;
            }
        }
        this.k.remove(obj);
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        com.taobao.tbliveinteractive.b bVar = this.m;
        return !(bVar == null || bVar.a(str) == null || !this.m.a(str).isInitComponentComplete()) || this.l.containsKey(str);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b
    public boolean a(c cVar) {
        c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eabcaf1", new Object[]{this, cVar})).booleanValue();
        }
        boolean z = false;
        for (int i = 0; i < this.b.size() && (cVar2 = this.b.get(i)) != cVar; i++) {
            if (cVar2.d()) {
                z = true;
            }
        }
        return z;
    }

    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1668308327);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class b extends com.taobao.tbliveinteractive.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1991230131);
        }

        private b() {
        }

        @Override // com.taobao.tbliveinteractive.d, com.taobao.tbliveinteractive.a
        public void a(InteractiveComponent interactiveComponent, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f37e16c1", new Object[]{this, interactiveComponent, map});
                return;
            }
            f.b(f.this).put(interactiveComponent.name, interactiveComponent);
            plx.a("ImportantEventController", "receive component name:" + interactiveComponent.name);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f.c(f.this) == null) {
                    return;
                }
                f.c(f.this).g();
                return;
            }
            f.d(f.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.f.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (f.c(f.this) == null) {
                    } else {
                        f.c(f.this).g();
                    }
                }
            });
        }
    }
}
