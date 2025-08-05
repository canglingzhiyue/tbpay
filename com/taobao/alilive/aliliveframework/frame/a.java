package com.taobao.alilive.aliliveframework.frame;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.core.b;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import com.taobao.taolive.sdk.ui.media.u;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import tb.dds;
import tb.ddt;
import tb.ddu;
import tb.ded;
import tb.kge;
import tb.pmd;
import tb.pns;
import tb.ppa;
import tb.ssr;
import tb.sss;
import tb.tfu;
import tb.tna;

/* loaded from: classes4.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ppa B;
    private sss D;
    private String E;
    public boolean F;
    private u G;
    public boolean K;
    public boolean L;

    /* renamed from: a  reason: collision with root package name */
    public String f8395a;
    public boolean b;
    public boolean c;
    public String d;
    public dds e;
    public ddu f;
    public b g;
    public pns h;
    public ddt i;
    public View j;
    public ded m;
    public ATaoLiveOpenEntity n;
    private Map<String, String> o;
    private r p;
    private ViewGroup q;
    private ComponentGroupConfig s;
    private String t;
    public g u;
    private String v;
    private Object w;
    private Object x;
    public boolean z;
    private boolean M = false;
    public HashMap<String, String> k = new HashMap<>();
    private boolean J = true;
    public BlockingQueue<List<SideGudieInfo>> A = new LinkedBlockingDeque();
    private boolean y = false;
    private boolean C = false;
    public List<View> l = new ArrayList();
    private boolean r = false;
    private boolean N = false;
    private boolean O = false;
    public Queue<tfu> H = new LinkedList();
    public Queue<tfu> I = new LinkedList();

    static {
        kge.a(-31566553);
    }

    public u R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("a5790b32", new Object[]{this}) : this.G;
    }

    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbf7101", new Object[]{this, uVar});
        } else {
            this.G = uVar;
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("661f112", new Object[]{this}) : this.v;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public sss M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sss) ipChange.ipc$dispatch("7529bdff", new Object[]{this}) : this.D;
    }

    public void a(sss sssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5c13e5", new Object[]{this, sssVar});
        } else {
            this.D = sssVar;
        }
    }

    public Object H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9a24ce43", new Object[]{this}) : this.w;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.w = obj;
        }
    }

    public List<View> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.l;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.l.add(view);
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.j;
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.j = view;
        }
    }

    public void a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc049cf2", new Object[]{this, rVar});
        } else {
            this.p = rVar;
        }
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.p;
    }

    public dds d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dds) ipChange.ipc$dispatch("26188fa8", new Object[]{this}) : this.e;
    }

    public void a(dds ddsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f00205", new Object[]{this, ddsVar});
        } else {
            this.e = ddsVar;
        }
    }

    public ddu e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddu) ipChange.ipc$dispatch("2dca3545", new Object[]{this}) : this.f;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4b88b043", new Object[]{this}) : this.g;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.o;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public pns h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pns) ipChange.ipc$dispatch("44e4bf22", new Object[]{this}) : this.h;
    }

    public ddt i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddt) ipChange.ipc$dispatch("4c90caa2", new Object[]{this}) : this.i;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.t;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public ded k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ded) ipChange.ipc$dispatch("5bf41731", new Object[]{this}) : this.m;
    }

    public void a(ded dedVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f747f5", new Object[]{this, dedVar});
        } else {
            this.m = dedVar;
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.q = viewGroup;
        }
    }

    public ViewGroup l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e56c89c2", new Object[]{this}) : this.q;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.r;
    }

    public ComponentGroupConfig n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComponentGroupConfig) ipChange.ipc$dispatch("a7e62ddf", new Object[]{this}) : this.s;
    }

    public void a(ComponentGroupConfig componentGroupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfae3c6", new Object[]{this, componentGroupConfig});
        } else {
            this.s = componentGroupConfig;
        }
    }

    public ATaoLiveOpenEntity o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ATaoLiveOpenEntity) ipChange.ipc$dispatch("63354e9b", new Object[]{this}) : this.n;
    }

    public void a(ATaoLiveOpenEntity aTaoLiveOpenEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c613a3e3", new Object[]{this, aTaoLiveOpenEntity});
        } else {
            this.n = aTaoLiveOpenEntity;
        }
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.x = obj;
        }
    }

    public Object I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("20aa88e2", new Object[]{this});
        }
        if (pmd.a() != null && pmd.a().u() != null && pmd.a().u().c() != null && pmd.a().u().c().getApplicationContext() != null) {
            Context applicationContext = pmd.a().u().c().getApplicationContext();
            if (com.taobao.taolive.sdk.utils.b.d(applicationContext) && this.x == null) {
                Toast.makeText(applicationContext, "mAtmosphereManager is null", 1);
                q.b("FrameContext", "mAtmosphereManager is null");
            }
        }
        return this.x;
    }

    public g z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5477abf2", new Object[]{this}) : this.u;
    }

    public ppa D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppa) ipChange.ipc$dispatch("2fe9831a", new Object[]{this}) : this.B;
    }

    public void a(ppa ppaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0b14d7", new Object[]{this, ppaVar});
            return;
        }
        this.B = ppaVar;
        ppa ppaVar2 = this.B;
        if (ppaVar2 == null) {
            return;
        }
        ppaVar2.a(this);
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.y;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : this.C;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this}) : this.E;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public tna P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tna) ipChange.ipc$dispatch("8c3f0d88", new Object[]{this});
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.n;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.taoliveOpenContext != null) {
            return this.n.taoliveOpenContext.a();
        }
        return null;
    }

    public ssr Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssr) ipChange.ipc$dispatch("93f0535c", new Object[]{this});
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.n;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.eventCompontent != null && this.n.eventCompontent.a() != null) {
            return this.n.eventCompontent.a().d();
        }
        return null;
    }

    public void a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
            return;
        }
        q.b("liveInteractiveMsg", "向第三方发送互动消息，msg = " + map + ", params = " + map2);
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.n;
        if (aTaoLiveOpenEntity == null) {
            return;
        }
        aTaoLiveOpenEntity.accessListener(AccessListenerEnum.postInteractiveMsg, map, map2);
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue() : this.J;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue() : this.M;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.M = z;
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : this.N;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue() : this.O;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue() : this.L;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.L = z;
        }
    }
}
