package com.taobao.tbliveinteractive;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.tbliveinteractive.business.tradetrack.b;
import com.taobao.tbliveinteractive.componentlist.b;
import com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.taobao.tbliveinteractive.jsbridge.h;
import com.taobao.tbliveinteractive.view.panel.InteractPanelSDKView2;
import com.taobao.tbliveinteractive.view.system_component.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.qmn;
import tb.qmo;
import tb.qmp;
import tb.qmr;
import tb.qne;
import tb.qng;
import tb.qnh;
import tb.svb;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENTCENTER_BIZCODE = "EVENTCENTER_BIZCODE_TBLiveInteractiveManager";
    private static final String b;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    public qmr f22129a;
    private Context c;
    private com.taobao.alilive.aliliveframework.frame.a d;
    private final String e;
    private String f;
    private String g;
    private b h;
    private com.taobao.tbliveinteractive.componentlist.b i;
    private com.taobao.tbliveinteractive.view.right_component.c j;
    private f k;
    private com.taobao.tbliveinteractive.container.h5.b l;
    private com.taobao.tbliveinteractive.view.panel.a m;
    private com.taobao.tbliveinteractive.container.h5.c n;
    private c p;
    private com.taobao.tbliveinteractive.jsbridge.d q;
    private com.taobao.tbliveinteractive.business.task.a r;
    private int s;
    private boolean t;
    private qmp u;
    private qmo v;
    private qmn w;
    private com.taobao.tbliveinteractive.jsbridge.e x;
    private h y;
    private svb z;
    private com.taobao.tbliveinteractive.business.tradetrack.b o = null;
    private boolean A = false;
    private String C = "mask";

    static {
        kge.a(432561375);
        b = e.class.getSimpleName();
    }

    public e(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, long j) {
        String str = null;
        this.c = context;
        this.d = aVar;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.d;
        this.e = aVar2 != null ? aVar2.G() : str;
        String str2 = this.e;
        com.taobao.tbliveinteractive.jsbridge.e.a(str2, new com.taobao.tbliveinteractive.jsbridge.e(str2, this.c, this.d));
        if (com.taobao.tbliveinteractive.jsbridge.e.c() != null) {
            com.taobao.tbliveinteractive.jsbridge.e.c().a(this);
        }
        this.x = new com.taobao.tbliveinteractive.jsbridge.e(this.e, this.c, this.d);
        this.x.a(this);
        this.p = new c(this, j);
        this.i = new com.taobao.tbliveinteractive.componentlist.b(context, this.p);
        this.h = new b(this.e, this, this.i, this.p);
        this.B = qne.o();
    }

    public Context q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a925b70", new Object[]{this}) : this.c;
    }

    public com.taobao.alilive.aliliveframework.frame.a r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("3559312e", new Object[]{this}) : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.s;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.t;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        f fVar = this.k;
        if (fVar == null) {
            return;
        }
        fVar.a(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.jsbridge.d dVar = this.q;
        if (dVar != null) {
            dVar.b();
        }
        this.q = new com.taobao.tbliveinteractive.jsbridge.d(this.e, this.d, this);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h hVar = this.y;
        if (hVar != null) {
            hVar.e();
        }
        this.y = new h(this.e, this.d, this);
    }

    public com.taobao.tbliveinteractive.view.right_component.c a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.view.right_component.c) ipChange.ipc$dispatch("9d7ab760", new Object[]{this, viewGroup, new Boolean(z)});
        }
        com.taobao.tbliveinteractive.view.right_component.c cVar = this.j;
        if (cVar != null) {
            cVar.c();
        }
        this.j = new com.taobao.tbliveinteractive.view.right_component.c(this.e, this.c, this.d, this, this.h, this.p);
        this.j.a(viewGroup, z);
        return this.j;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.tbliveinteractive.view.right_component.c cVar = this.j;
        if (cVar == null) {
            return;
        }
        cVar.a(i);
    }

    public f a(ViewGroup viewGroup, VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5a6f1f23", new Object[]{this, viewGroup, videoInfo, new Boolean(z)});
        }
        f fVar = this.k;
        if (fVar != null) {
            fVar.b();
        }
        this.k = new f(this.e, this.c, this.d, videoInfo, this, this.h, this.i, this.p);
        this.k.a(viewGroup, z);
        return this.k;
    }

    public com.taobao.tbliveinteractive.container.h5.b a(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.container.h5.b) ipChange.ipc$dispatch("e797441a", new Object[]{this, viewGroup, str});
        }
        com.taobao.tbliveinteractive.container.h5.b bVar = this.l;
        if (bVar != null) {
            bVar.m();
        }
        Context context = this.c;
        svb svbVar = this.z;
        c cVar = this.p;
        qmo qmoVar = this.v;
        this.l = new com.taobao.tbliveinteractive.container.h5.b(context, this, viewGroup, svbVar, str, cVar, qmoVar != null && qmoVar.c());
        this.l.a(this.s);
        this.l.a(this.e, this, this.d);
        this.l.a(this.x);
        b bVar2 = this.h;
        if (bVar2 != null) {
            bVar2.a(this.l);
        }
        a("TBLiveWVPlugin.Event.nativeEnvReady", "");
        return this.l;
    }

    public com.taobao.tbliveinteractive.container.h5.b a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.container.h5.b) ipChange.ipc$dispatch("bfe9bd10", new Object[]{this, viewGroup});
        }
        com.taobao.tbliveinteractive.container.h5.b bVar = new com.taobao.tbliveinteractive.container.h5.b(this.c, this, viewGroup, this.z, "extendH5Container", null, false);
        bVar.a(this.e, this, this.d);
        bVar.a(this.x);
        return bVar;
    }

    public com.taobao.tbliveinteractive.view.panel.a a(ViewGroup viewGroup, View view, boolean z, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.view.panel.a) ipChange.ipc$dispatch("fc5faf", new Object[]{this, viewGroup, view, new Boolean(z), videoInfo});
        }
        com.taobao.tbliveinteractive.view.panel.a aVar = this.m;
        if (aVar != null) {
            aVar.destroy();
        }
        this.m = new InteractPanelSDKView2(this.c, viewGroup, view, this.e, this, this.h, z, videoInfo);
        return this.m;
    }

    public void a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84243444", new Object[]{this, interactiveComponent});
        } else if (this.m != null) {
            if (!interactiveComponent.migrationFlag) {
                return;
            }
            this.m.addInteractComponent(interactiveComponent);
        } else {
            b bVar = this.h;
            if (bVar == null) {
                return;
            }
            bVar.b(interactiveComponent);
        }
    }

    public void b(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855a8723", new Object[]{this, interactiveComponent});
        } else if (this.m != null) {
            if (!interactiveComponent.migrationFlag) {
                return;
            }
            this.m.removeInteractComponent(interactiveComponent);
        } else {
            b bVar = this.h;
            if (bVar == null) {
                return;
            }
            bVar.c(interactiveComponent);
        }
    }

    public c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4773d0b2", new Object[]{this}) : this.p;
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        com.taobao.tbliveinteractive.container.h5.b bVar = this.l;
        if (bVar == null) {
            return;
        }
        bVar.a(str, map);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        com.taobao.tbliveinteractive.container.h5.b bVar = this.l;
        if (bVar == null) {
            return;
        }
        bVar.a(str, str2);
    }

    public void a(com.taobao.tbliveinteractive.componentlist.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4ab332", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        com.taobao.tbliveinteractive.componentlist.b bVar = this.i;
        if (bVar != null) {
            bVar.a(cVar, z);
            return;
        }
        cVar.onError(-2, null, null);
        qnh.a("getComponentList_track", "errorCode=mComponentListInfo is null");
    }

    public com.taobao.tbliveinteractive.jsbridge.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.jsbridge.d) ipChange.ipc$dispatch("753ebcbb", new Object[]{this}) : this.q;
    }

    public com.taobao.tbliveinteractive.business.task.a a(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.business.task.a) ipChange.ipc$dispatch("93ddbdea", new Object[]{this, videoInfo, new Boolean(z)});
        }
        if (this.r == null && ((videoInfo != null && videoInfo.presentHierarchy) || z)) {
            this.r = new com.taobao.tbliveinteractive.business.task.a(this.d, this);
        }
        return this.r;
    }

    public void a(VideoInfo videoInfo, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fc951a", new Object[]{this, videoInfo, str, str2, hashMap});
        } else {
            a(videoInfo, str, str2, hashMap, null);
        }
    }

    public void a(VideoInfo videoInfo, String str, String str2, HashMap<String, String> hashMap, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25636798", new Object[]{this, videoInfo, str, str2, hashMap, aVar});
            return;
        }
        this.f = str2;
        this.g = str;
        if (videoInfo == null) {
            return;
        }
        String a2 = com.taobao.taolive.sdk.utils.b.a(this.c);
        if (hashMap != null && hashMap.get("channel") != null) {
            a2 = String.valueOf(hashMap.get("channel"));
        }
        String str3 = a2;
        com.taobao.tbliveinteractive.componentlist.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.d, videoInfo, str, str2, str3, aVar);
        }
        b bVar2 = this.h;
        if (bVar2 != null) {
            bVar2.c();
            this.h.a(hashMap);
        }
        this.o = new com.taobao.tbliveinteractive.business.tradetrack.b(videoInfo.liveId);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.b();
        }
        com.taobao.tbliveinteractive.jsbridge.d dVar = this.q;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.jsbridge.e eVar = this.x;
        if (eVar != null) {
            eVar.b();
            this.x = null;
        }
        com.taobao.tbliveinteractive.jsbridge.d dVar = this.q;
        if (dVar != null) {
            dVar.b();
            this.q = null;
        }
        h hVar = this.y;
        if (hVar != null) {
            hVar.e();
            this.y = null;
        }
        com.taobao.tbliveinteractive.business.task.a aVar = this.r;
        if (aVar != null) {
            aVar.a();
            this.r = null;
        }
        com.taobao.tbliveinteractive.componentlist.b bVar = this.i;
        if (bVar != null) {
            bVar.a();
            this.i = null;
        }
        b bVar2 = this.h;
        if (bVar2 != null) {
            bVar2.a();
            this.h = null;
        }
        c cVar = this.p;
        if (cVar != null) {
            cVar.g();
        }
        com.taobao.tbliveinteractive.container.h5.b bVar3 = this.l;
        if (bVar3 != null) {
            bVar3.m();
            this.l = null;
        }
        com.taobao.tbliveinteractive.view.panel.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.destroy();
            this.m = null;
        }
        com.taobao.tbliveinteractive.view.right_component.c cVar2 = this.j;
        if (cVar2 != null) {
            cVar2.c();
            this.j = null;
        }
        f fVar = this.k;
        if (fVar != null) {
            fVar.b();
            this.k = null;
        }
        if (p.A() && this.d.z() != null && this.d.z().H) {
            q.b(b, "不销毁橱窗弹窗");
        } else {
            m();
            com.taobao.tbliveinteractive.container.h5.c cVar3 = this.n;
            if (cVar3 != null && !cVar3.d()) {
                this.n.b();
            }
            q.b(b, "销毁橱窗弹窗");
        }
        qne.a();
        com.taobao.tbliveinteractive.jsbridge.e.a(this.e);
        this.o = null;
        qng.a();
    }

    public b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8cafea6e", new Object[]{this}) : this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.g;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
        } else {
            com.taobao.tbliveinteractive.container.h5.c cVar = this.n;
            if (cVar != null) {
                if (cVar.f() || Uri.parse(str).equals(this.n.c())) {
                    return;
                }
                this.n.b();
            }
            this.n = new com.taobao.tbliveinteractive.container.h5.c(this.c, null, this);
            this.n.a(this.x);
            this.n.b(str);
        }
    }

    public boolean a(ViewGroup viewGroup, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ebb34b8", new Object[]{this, viewGroup, str, map})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (this.n == null || (this.A && this.B)) {
            this.n = new com.taobao.tbliveinteractive.container.h5.c(this.c, map, this);
            this.n.a(this.x);
        } else {
            this.n.a(map);
        }
        this.n.a(str);
        this.n.bg_();
        return true;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.C = str;
        }
    }

    public void a(com.taobao.tbliveinteractive.container.h5.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4603a0f0", new Object[]{this, cVar});
            return;
        }
        this.A = false;
        if (cVar != this.n && this.B) {
            return;
        }
        this.n = null;
    }

    @Deprecated
    public boolean b(ViewGroup viewGroup, String str, Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2f9a457", new Object[]{this, viewGroup, str, map})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        qmr qmrVar = this.f22129a;
        if (qmrVar != null && StringUtils.equals(qmrVar.b(), str)) {
            return false;
        }
        String str2 = map.get(aw.PARAM_ACTIVITY_POSITION);
        if (!StringUtils.isEmpty(str2) && (split = str2.split("-")) != null && split.length == 4) {
            map.put("x", split[0]);
            map.put("y", split[1]);
            map.put("width", split[2]);
            map.put("height", split[3]);
        }
        qmr qmrVar2 = this.f22129a;
        if (qmrVar2 != null) {
            qmrVar2.m();
            this.f22129a = null;
        }
        this.f22129a = new com.taobao.tbliveinteractive.container.h5.b(this.c, this, viewGroup, this.z, map);
        this.f22129a.a(this.x);
        this.f22129a.a(new qmr.a() { // from class: com.taobao.tbliveinteractive.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qmr.a
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (e.this.f22129a == null) {
                } else {
                    e.this.f22129a.c();
                }
            }

            @Override // tb.qmr.a
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                } else {
                    e.this.m();
                }
            }
        });
        this.f22129a.c(str);
        String str3 = map.get("bizData");
        if (!StringUtils.isEmpty(str3)) {
            this.f22129a.a(str3);
        }
        ((com.taobao.tbliveinteractive.container.h5.b) this.f22129a).n();
        return true;
    }

    public boolean m() {
        TaoLiveWebBottomFragment taoLiveWebBottomFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        this.A = true;
        com.taobao.tbliveinteractive.container.h5.c cVar = this.n;
        if (cVar != null) {
            cVar.k = this.C;
        }
        qmr qmrVar = this.f22129a;
        if (qmrVar != null) {
            qmrVar.m();
            this.f22129a = null;
        }
        Context context = this.c;
        if ((context instanceof FragmentActivity) && (taoLiveWebBottomFragment = (TaoLiveWebBottomFragment) ((FragmentActivity) context).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.tag())) != null) {
            taoLiveWebBottomFragment.dismissAllowingStateLoss();
        }
        return true;
    }

    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1816cf", new Object[]{this, aVar})).booleanValue();
        }
        com.taobao.tbliveinteractive.business.tradetrack.b bVar = this.o;
        return bVar != null && bVar.a(aVar);
    }

    public qmp n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmp) ipChange.ipc$dispatch("730f0f9d", new Object[]{this}) : this.u;
    }

    public void a(qmp qmpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9c7884", new Object[]{this, qmpVar});
        } else {
            this.u = qmpVar;
        }
    }

    public qmo o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmo) ipChange.ipc$dispatch("7ac0b4dd", new Object[]{this}) : this.v;
    }

    public void a(qmo qmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9c0425", new Object[]{this, qmoVar});
        } else {
            this.v = qmoVar;
        }
    }

    public qmn p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmn) ipChange.ipc$dispatch("82725a1d", new Object[]{this}) : this.w;
    }

    public void a(qmn qmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9b8fc6", new Object[]{this, qmnVar});
        } else {
            this.w = qmnVar;
        }
    }

    public void a(svb svbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7ea019", new Object[]{this, svbVar});
        } else {
            this.z = svbVar;
        }
    }
}
