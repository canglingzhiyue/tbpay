package com.taobao.android.detail.wrapper.ext.floatview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.d;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.vessel.weex.VesselWeexView;
import com.uc.webview.export.media.MessageID;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.dxz;
import tb.dyd;
import tb.ecg;
import tb.ehs;
import tb.emu;
import tb.eoz;
import tb.fin;
import tb.kge;
import tb.rgu;
import tb.rgy;

/* loaded from: classes5.dex */
public class b extends eoz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ID_PREFIX = "detail_container_floatweex_container";
    private static final JSONObject b;
    private static final JSONObject c;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f11309a = new JSONObject(1);
    private boolean d;
    private boolean e;
    private long f;
    private final List<String> g;
    private boolean h;
    private FragmentManager i;
    private com.taobao.android.detail.core.detail.activity.b j;
    private int k;
    private VesselWeexView l;
    private ViewGroup m;
    private DetailActivity n;
    private String o;
    private String p;
    private final g q;
    private boolean r;
    private final List<JSONObject> s;
    private volatile boolean t;
    private final Handler u;
    private FragmentManager.OnBackStackChangedListener v;
    private final d w;
    private final dxz.a x;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1467730997) {
            super.onMessage(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fb93cbc", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.k = i;
        return i;
    }

    public static /* synthetic */ long a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fb9407e", new Object[]{bVar, new Long(j)})).longValue();
        }
        bVar.f = j;
        return j;
    }

    public static /* synthetic */ FragmentManager a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("c817bc8d", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beecf719", new Object[]{bVar, context, str, str2, str3, map});
        } else {
            bVar.a(context, str, str2, str3, map);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3503ecae", new Object[]{bVar, new Boolean(z), str, str2});
        } else {
            bVar.a(z, str, str2);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb97c9e", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.r = z;
        return z;
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9fa384c", new Object[]{bVar})).intValue() : bVar.k;
    }

    public static /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954d859b", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.a(z);
        }
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab308b3c", new Object[]{bVar})).booleanValue() : bVar.r;
    }

    public static /* synthetic */ boolean c(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bae18ea0", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.t = z;
        return z;
    }

    public static /* synthetic */ List d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3de22350", new Object[]{bVar}) : bVar.s;
    }

    public static /* synthetic */ g e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("fe35c760", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ String f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eeddf56b", new Object[]{bVar}) : bVar.p;
    }

    public static /* synthetic */ void g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b009d6b4", new Object[]{bVar});
        } else {
            bVar.k();
        }
    }

    public static /* synthetic */ DetailActivity h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("296bcab", new Object[]{bVar}) : bVar.n;
    }

    public static /* synthetic */ boolean i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2767c76", new Object[]{bVar})).booleanValue() : bVar.e;
    }

    public static /* synthetic */ long j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3accf45", new Object[]{bVar})).longValue() : bVar.f;
    }

    public static /* synthetic */ JSONObject k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a08d0d50", new Object[]{bVar}) : bVar.f11309a;
    }

    static {
        kge.a(517073148);
        b = new JSONObject(1);
        c = new JSONObject(1);
        b.put("infoviewappear", (Object) String.valueOf(true));
        c.put("infoviewappear", (Object) String.valueOf(false));
    }

    public b(DetailActivity detailActivity) {
        this.f11309a.put("pageScrollState", (Object) String.valueOf(1));
        this.d = false;
        this.e = true;
        this.f = 0L;
        this.g = new ArrayList();
        this.h = false;
        this.p = "";
        this.r = true;
        this.s = new ArrayList();
        this.t = false;
        this.u = new Handler(Looper.getMainLooper());
        this.v = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2062519", new Object[]{this});
                } else if (b.a(b.this).getBackStackEntryCount() == 0) {
                    b.this.e();
                } else {
                    b.this.f();
                }
            }
        };
        this.w = new d() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.container.d
            public void a(int i, String str, int i2) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
                } else if (b.b(b.this) == i) {
                } else {
                    b.a(b.this, i);
                    if (i > 0) {
                        z = false;
                    }
                    if ((b.c(b.this) || !z) && (!b.c(b.this) || z)) {
                        return;
                    }
                    b.a(b.this, z);
                    b bVar = b.this;
                    b.b(bVar, b.c(bVar));
                }
            }
        };
        this.x = new dxz.a() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dxz.a
            public void a(int i, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
                } else {
                    b.a(b.this, true, str, str2);
                }
            }

            @Override // tb.dxz.a
            public void a(int i, boolean z, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
                } else {
                    b.a(b.this, false, str, str2);
                }
            }
        };
        this.l = new VesselWeexView(detailActivity);
        this.n = detailActivity;
        this.q = n.a(this.n);
        d();
        emu.a("com.taobao.android.detail.wrapper.ext.floatview.VesselWeexViewDecorator");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (this.t) {
                g gVar = this.q;
                if (gVar == null) {
                    return;
                }
                gVar.a(a.a("detail_floatweex_instance", this.p), jSONObject);
                return;
            }
            this.s.add(jSONObject);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.u.postDelayed(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.c(b.this, true);
                    for (JSONObject jSONObject : b.d(b.this)) {
                        if (jSONObject != null && b.e(b.this) != null) {
                            b.e(b.this).a(a.a("detail_floatweex_instance", b.f(b.this)), jSONObject);
                        }
                    }
                    b.d(b.this).clear();
                }
            }, 200L);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        this.o = str;
        n.a(this.n).a(new l() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.open.l
            public void notifyDataSetChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eee9a4ec", new Object[]{this});
                }
            }

            @Override // com.taobao.android.detail.core.open.l
            public eoz getMessageChannel(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (eoz) ipChange2.ipc$dispatch("ed3ce113", new Object[]{this, str2});
                }
                if (!TextUtils.equals(str2, a.a("detail_container_floatweex_container", b.f(b.this)))) {
                    return null;
                }
                return b.this;
            }
        });
        if (this.l == null) {
            return;
        }
        this.p = str + "&_weexfloatParams=" + URLEncoder.encode(JSONObject.toJSONString(jSONObject)) + "&enableMulitMessageChannel=true";
        this.l.loadUrl(this.p, null);
        this.t = false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.onStart();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.onResume();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.onPause();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = this.n.getSupportFragmentManager();
        }
        FragmentManager fragmentManager = this.i;
        if (fragmentManager != null) {
            fragmentManager.addOnBackStackChangedListener(this.v);
        }
        if (this.j == null) {
            try {
                this.j = this.n.b.k;
            } catch (Throwable unused) {
                i.a("floatView.VesselWeexViewDecorator", "addListener");
            }
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar != null) {
            bVar.a(this.w);
            this.j.a(this.x);
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setOnLoadListener(new rgu() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                } else {
                    b.g(b.this);
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                b.g(b.this);
                b bVar2 = b.this;
                b.a(bVar2, b.h(bVar2), b.f(b.this), rgyVar.f33150a, rgyVar.b, null);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                b.g(b.this);
                b bVar2 = b.this;
                b.a(bVar2, b.h(bVar2), b.f(b.this), rgyVar.f33150a, rgyVar.b, map);
            }
        });
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.h) {
        } else {
            l();
            this.h = false;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.h = true;
        m();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        i.c("floatView.VesselWeexViewDecorator", "show");
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(0);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        i.c("floatView.VesselWeexViewDecorator", "dismiss");
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(8);
    }

    private void a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.q;
        if (gVar == null || (str = this.p) == null) {
            return;
        }
        gVar.a(a.a("detail_floatweex_instance", str), z ? b : c);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar == null || bVar.f9420a == null) {
            return;
        }
        this.e = false;
        this.j.f9420a.setOnScrollListener(new NestedScrollContainer.b() { // from class: com.taobao.android.detail.wrapper.ext.floatview.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (b.i(b.this) || currentTimeMillis - b.j(b.this) <= 500) {
                    return;
                }
                b.a(b.this, currentTimeMillis);
                b.e(b.this).a(a.a("detail_floatweex_instance", b.f(b.this)), b.k(b.this));
            }
        });
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar == null || bVar.f9420a == null) {
            return;
        }
        this.e = true;
        this.j.f9420a.setOnScrollListener(null);
    }

    private void p() {
        int q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar == null || bVar.f9420a == null || (q = q()) < 0) {
            return;
        }
        this.j.f9420a.scrollToPos(q, false, false);
    }

    private int q() {
        List<com.taobao.android.detail.core.detail.widget.container.c> scrollChildList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar == null || bVar.f9420a == null || (scrollChildList = this.j.f9420a.getScrollChildList()) == null || scrollChildList.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < scrollChildList.size(); i++) {
            if (scrollChildList.get(i) instanceof dyd) {
                return i;
            }
        }
        return -1;
    }

    private void a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
        } else if (this.q == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("#");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            if (!this.g.contains(sb2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(z ? "ComponentDidAppear" : "ComponentDisAppear", (Object) sb2);
            this.q.a(a.a("detail_floatweex_instance", this.p), jSONObject);
        }
    }

    public VesselWeexView g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselWeexView) ipChange.ipc$dispatch("f15b317b", new Object[]{this}) : this.l;
    }

    public ViewGroup h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("22286c46", new Object[]{this});
        }
        ViewGroup viewGroup = this.m;
        return viewGroup == null ? this.l : viewGroup;
    }

    public ViewGroup a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("67f4ed8e", new Object[]{this, viewGroup});
        }
        this.m = viewGroup;
        return viewGroup;
    }

    @Override // tb.eoz
    public String getkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96f6ff50", new Object[]{this}) : a.a("detail_container_floatweex_container", this.p);
    }

    @Override // tb.eoz
    public void onMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            return;
        }
        super.onMessage(obj);
        if (!(obj instanceof Map)) {
            return;
        }
        a((Map) obj);
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            b(map);
            c(map);
            d(map);
        }
    }

    private void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get("operate");
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (TextUtils.equals(str, "show")) {
                l();
            } else if (TextUtils.equals(str, "dismiss")) {
                m();
            } else if (TextUtils.equals(str, "destroy")) {
                i();
            } else if (TextUtils.equals(str, "getItemId")) {
                r();
            } else if (TextUtils.equals(str, "registerPageScrollState")) {
                n();
            } else if (TextUtils.equals(str, "unRegisterPageScrollState")) {
                o();
            } else if (TextUtils.equals(str, "scrollToDetailInfo")) {
                p();
            } else {
                i.a("floatView.VesselWeexViewDecorator", "无法处理operate_detail_weex_float operate:" + str);
            }
        } catch (Throwable th) {
            i.a("floatView.VesselWeexViewDecorator", "postOperate", th);
        }
    }

    private void c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get("monitor");
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (TextUtils.equals(str, "componentLifeCycle")) {
                Object obj2 = map.get("componentKey");
                if (obj2 == null || !(obj2 instanceof String)) {
                    return;
                }
                this.g.add((String) obj2);
                return;
            }
            i.a("floatView.VesselWeexViewDecorator", "无法处理operate_detail_weex_float monitor:" + str);
        } catch (Throwable th) {
            i.a("floatView.VesselWeexViewDecorator", "postMonitor", th);
        }
    }

    private void d(Map map) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get(fin.EVENT_KEY);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            ActionModel actionModel = new ActionModel(new JSONObject());
            actionModel.type = (String) obj;
            if (map.get("params") != null) {
                actionModel.params = new JSONObject((Map) map.get("params"));
            }
            try {
                bVar = this.n.y().t.f10055a;
            } catch (Throwable unused) {
                bVar = null;
            }
            Event a2 = ehs.a(this.n, actionModel, bVar, null, null);
            if (a2 == null) {
                return;
            }
            f.a(this.n).a(a2);
        } catch (Throwable th) {
            i.a("floatView.VesselWeexViewDecorator", "postEvent", th);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        i.c("floatView.VesselWeexViewDecorator", MessageID.onDestroy);
        j();
        this.g.clear();
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView != null) {
            vesselWeexView.onDestroy();
        }
        o();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        i.c("floatView.VesselWeexViewDecorator", "onGetItemId");
        String str = null;
        try {
            str = this.n.y().t.i();
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put("itemId", (Object) str);
        g gVar = this.q;
        if (gVar == null) {
            return;
        }
        gVar.a(a.a("detail_floatweex_instance", this.p), jSONObject);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.j;
        if (bVar != null) {
            bVar.b(this.w);
            this.j.b(this.x);
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView != null) {
            vesselWeexView.setOnLoadListener(null);
        }
        FragmentManager fragmentManager = this.i;
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.removeOnBackStackChangedListener(this.v);
    }

    private void a(Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{this, context, str, str2, str3, map});
        } else {
            ecg.a(context, str, str2, str3, map);
        }
    }
}
