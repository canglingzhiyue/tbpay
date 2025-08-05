package com.taobao.android.detail.industry.hourlydelivery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.fullfeeds.DXViewLoader;
import com.taobao.android.detail.industry.fullfeeds.a$a;
import com.taobao.android.detail.industry.hourlydelivery.b;
import com.taobao.android.detail.industry.hourlydelivery.d;
import com.taobao.android.detail.industry.hourlydelivery.e;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.ask.ASK_CONST;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.weex.ui.component.WXBasicComponentType;
import com.taobao.zcache.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.gbg;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends com.taobao.tao.topmultitab.protocol.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView.OnScrollListener f10081a;
    private DXTemplateItem b;
    private DXViewLoader c;
    private com.taobao.tao.topmultitab.protocol.c d;
    private b e;
    private com.taobao.android.detail.industry.hourlydelivery.a f;
    private d g;
    private View h;
    private FrameLayout i;
    private DXRootView j;
    private DinamicXEngine k;
    private Context l;
    private DXRecyclerLayout m;
    private RecyclerView n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private a s;
    public Runnable t;
    private Handler u;
    public e.a v;
    private e w;
    private boolean x;
    private Map<String, String> y;
    private Uri z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, boolean z2);
    }

    static {
        kge.a(755963723);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 180486803:
                super.notifyOutLinkParams((Intent) objArr[0], (String) objArr[1]);
                return null;
            case 1101850916:
                super.onClickRocket();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("359a719c", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.r = i;
        return i;
    }

    public static /* synthetic */ RecyclerView a(c cVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d46993fc", new Object[]{cVar, recyclerView});
        }
        cVar.n = recyclerView;
        return recyclerView;
    }

    public static /* synthetic */ DXRootView a(c cVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("ad53255c", new Object[]{cVar, dXRootView});
        }
        cVar.j = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXTemplateItem a(c cVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("62dc51dc", new Object[]{cVar, dXTemplateItem});
        }
        cVar.b = dXTemplateItem;
        return dXTemplateItem;
    }

    public static /* synthetic */ DXRecyclerLayout a(c cVar, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("6bb4192e", new Object[]{cVar, dXRecyclerLayout});
        }
        cVar.m = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ Map a(c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c60aa0", new Object[]{cVar, map});
        }
        cVar.y = map;
        return map;
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f978949a", new Object[]{cVar});
        } else {
            cVar.h();
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359ab17a", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.c(z);
        }
    }

    public static /* synthetic */ boolean a(c cVar, DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99a35f30", new Object[]{cVar, dXTemplateItem, dXTemplateItem2})).booleanValue() : cVar.a(dXTemplateItem, dXTemplateItem2);
    }

    public static /* synthetic */ FrameLayout b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("94edd180", new Object[]{cVar}) : cVar.i;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1352c2d8", new Object[]{cVar});
        } else {
            cVar.i();
        }
    }

    public static /* synthetic */ com.taobao.tao.topmultitab.protocol.c d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.topmultitab.protocol.c) ipChange.ipc$dispatch("fb16bcbe", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ DXRootView e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("e7d30801", new Object[]{cVar}) : cVar.j;
    }

    public static /* synthetic */ DXRecyclerLayout f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerLayout) ipChange.ipc$dispatch("852aca51", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47071f54", new Object[]{cVar});
        } else {
            cVar.j();
        }
    }

    public static /* synthetic */ boolean h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3f43677", new Object[]{cVar})).booleanValue() : cVar.x;
    }

    public static /* synthetic */ DXTemplateItem i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("a2e9a96d", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ DinamicXEngine j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("edbc76b6", new Object[]{cVar}) : cVar.k;
    }

    public static /* synthetic */ void k(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abb7bd0", new Object[]{cVar});
        } else {
            cVar.l();
        }
    }

    public static /* synthetic */ int l(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a892e2", new Object[]{cVar})).intValue() : cVar.r;
    }

    public static /* synthetic */ void m(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9495aa0e", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    public static /* synthetic */ Context n(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c219a925", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ b o(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f05e665f", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ void p(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5cef6b", new Object[]{cVar});
        } else {
            cVar.e();
        }
    }

    public c(com.taobao.tao.topmultitab.protocol.c cVar) {
        super(cVar);
        this.o = false;
        this.p = true;
        this.q = false;
        this.f10081a = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                c cVar2 = c.this;
                c.a(cVar2, c.l(cVar2) + i2);
                c.m(c.this);
            }
        };
        this.s = new a() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.hourlydelivery.c.a
            public void a(boolean z, boolean z2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                } else {
                    c.a(c.this, z2);
                }
            }
        };
        this.v = new e.a() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.hourlydelivery.e.a
            public void a(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                if (c.d(c.this) != null) {
                    c.d(c.this).a(c.this, map);
                }
                c.a(c.this, map);
            }
        };
        this.t = new Runnable() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    n.a(Arrays.asList("same-hour-delivery-store", "tb-store-core-modules", "tb-store-txd-modules"));
                }
            }
        };
        this.d = cVar;
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.l = context;
        this.x = false;
        if (this.i != null && com.taobao.android.detail.industry.tool.b.f()) {
            return this.i;
        }
        o();
        return this.i;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.g = new d(k());
        this.e = new b();
        this.f = new com.taobao.android.detail.industry.hourlydelivery.a(this.s);
        this.w = new e(this.v);
        this.i = new FrameLayout(this.l);
        this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        f();
        this.b = null;
        this.y = new HashMap();
        d();
        e();
        com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", "create view");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.k = new DinamicXEngine(new DXEngineConfig.a("TBHourDelivery").a(true, true).a());
        this.c = new DXViewLoader(this.l, this.k);
        this.k.a(com.taobao.android.detail.industry.hourlydelivery.a.DX_PARSER_HOURDELIVERYROCKETSTATUS, this.f);
        this.k.a(e.DX_PARSER_HOURCITYINFOCALLBACK, this.w);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e.a(this.l, new b.a() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.industry.hourlydelivery.b.a
                public void a(DXTemplateItem dXTemplateItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
                        return;
                    }
                    c cVar = c.this;
                    if (c.a(cVar, c.i(cVar), dXTemplateItem)) {
                        return;
                    }
                    c.a(c.this, dXTemplateItem);
                    c.b(c.this).post(new Runnable() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.a(c.this);
                            }
                        }
                    });
                }

                @Override // com.taobao.android.detail.industry.hourlydelivery.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    c.a(c.this, (DXTemplateItem) null);
                    c.b(c.this).post(new Runnable() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.c(c.this);
                            }
                        }
                    });
                }
            });
        }
    }

    private boolean a(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0ac6dfe", new Object[]{this, dXTemplateItem, dXTemplateItem2})).booleanValue() : (dXTemplateItem == null || dXTemplateItem2 == null || dXTemplateItem.f11925a == null || !dXTemplateItem.f11925a.equals(dXTemplateItem2.f11925a) || dXTemplateItem.b != dXTemplateItem2.b) ? false : true;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        m();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        this.x = true;
        m();
        com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", "on page selected");
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.k;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.b(this.j);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        b bVar = this.e;
        if (bVar == null) {
            return null;
        }
        return bVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        b bVar = this.e;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        b bVar = this.e;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (!this.d.g(this).getJSONObject("content").getBoolean(ASK_CONST.KEY_IS_IMMERSIVE).booleanValue()) {
                return;
            }
            this.i.setPadding(0, this.d.b(), 0, 0);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBoxData() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        Context context = this.l;
        if (context == null || (bVar = this.e) == null) {
            return null;
        }
        JSONObject b = bVar.b(context);
        n();
        return b;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.e.a(this.l, this.y, new b.InterfaceC0389b() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.industry.hourlydelivery.b.InterfaceC0389b
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    } else if (c.d(c.this) == null) {
                    } else {
                        c.d(c.this).a((IHomeSubTabController) c.this, jSONObject);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue() : this.p;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        this.q = true;
        c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        com.taobao.tao.topmultitab.protocol.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        super.onClickRocket();
        a();
        if (this.o || (cVar = this.d) == null) {
            return;
        }
        cVar.a(this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.m;
        if (dXRecyclerLayout == null) {
            return;
        }
        this.r = 0;
        dXRecyclerLayout.a(false, 0);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue() : this.o;
    }

    private void a(boolean z) {
        com.taobao.tao.topmultitab.protocol.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.o == z || (cVar = this.d) == null) {
        } else {
            this.o = z;
            cVar.c(this, z);
        }
    }

    private void b(boolean z) {
        com.taobao.tao.topmultitab.protocol.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.p == z || (cVar = this.d) == null) {
        } else {
            this.p = z;
            cVar.a(this, z);
        }
    }

    private void c(boolean z) {
        com.taobao.tao.topmultitab.protocol.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!z || !this.q || (cVar = this.d) == null) {
        } else {
            cVar.b(this);
            this.q = false;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.r < 10) {
            b(true);
        } else {
            b(false);
        }
        if (this.r > 200) {
            a(true);
        } else {
            a(false);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.r = 0;
        this.j = null;
        this.m = null;
        this.n = null;
        this.h = null;
        this.i.removeAllViews();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        super.notifyOutLinkParams(intent, str);
        Uri data = intent.getData();
        com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", "notifyOutLinkParams: " + data);
        if (this.j != null) {
            a(data);
        } else {
            this.z = data;
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startRenderDX: ");
        if (this.z != null) {
            z = false;
        }
        sb.append(z);
        com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", sb.toString());
        this.c.a(this.b, a(gbg.b(this.k, this.l, this.i.getHeight())), false, new a$a() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.fullfeeds.a$a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.taobao.android.detail.industry.fullfeeds.a$a
            public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                    return;
                }
                try {
                    com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", "render success");
                    c.this.b();
                    c.a(c.this, dXResult.f11780a);
                    c.a(c.this, (DXRecyclerLayout) c.e(c.this).getExpandWidgetNode().queryWidgetNodeByUserId(WXBasicComponentType.RECYCLER));
                    c.a(c.this, c.f(c.this).l());
                    c.g(c.this);
                    c.b(c.this).addView(c.e(c.this));
                    if (c.h(c.this)) {
                        c.j(c.this).b(c.e(c.this));
                    }
                    c.k(c.this);
                    if (!dXResult.b()) {
                        return;
                    }
                    com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryViewController", "renderFailure : " + dXResult.a().toString());
                } catch (Exception e) {
                    com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryViewController", "addToRootView error: " + e.getMessage());
                }
            }

            @Override // com.taobao.android.detail.industry.fullfeeds.a$a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryViewController", "hourdelivery download dx error");
                c.c(c.this);
            }
        });
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (this.j == null || uri == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) "paramsTransfer");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(com.taobao.android.detail.industry.tool.d.a(uri));
            jSONObject.put("data", (Object) jSONObject2);
            com.taobao.android.detail.industry.tool.a.d("TBHourDeliveryViewController", "sendOutLinkParamsMessage " + jSONObject);
            this.k.l().a("hourDeliveryHomePostMessageFromNative", jSONObject);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            b();
            b(false);
            this.h = this.g.a(this.l);
            this.i.addView(this.h);
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryViewController", "showErrorView error: " + e.getMessage());
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            return;
        }
        recyclerView.removeOnScrollListener(this.f10081a);
        this.n.addOnScrollListener(this.f10081a);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.m;
        if (dXRecyclerLayout == null || dXRecyclerLayout.getDXRuntimeContext() == null) {
            return;
        }
        DXEvent dXEvent = new DXEvent(5288680013941347641L);
        HashMap hashMap = new HashMap();
        hashMap.put("pullDown", f.a("true"));
        dXEvent.setArgs(hashMap);
        this.m.postEvent(dXEvent);
    }

    private JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerHeight", (Object) Integer.valueOf(i));
        jSONObject.put("data", (Object) new JSONArray());
        if (this.z != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(com.taobao.android.detail.industry.tool.d.a(this.z));
            jSONObject.put(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, (Object) jSONObject2);
            this.z = null;
        }
        return jSONObject;
    }

    private d.a k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("1f7cfa6", new Object[]{this}) : new d.a() { // from class: com.taobao.android.detail.industry.hourlydelivery.c.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.hourlydelivery.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (c.n(c.this) == null || c.j(c.this) == null || c.o(c.this) == null) {
                } else {
                    if (c.i(c.this) == null) {
                        c.p(c.this);
                    } else {
                        c.a(c.this);
                    }
                }
            }
        };
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.u == null) {
            this.u = new Handler(Looper.getMainLooper());
        }
        this.u.postDelayed(this.t, 2000L);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Handler handler = this.u;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.t);
    }
}
