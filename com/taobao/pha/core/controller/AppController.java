package com.taobao.pha.core.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.e;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.f;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.ResourcePrefetchModel;
import com.taobao.pha.core.offlineresource.OfflineResourceInterceptor;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.ViewPagerFragment;
import com.taobao.pha.core.rescache.RequestInterceptor;
import com.taobao.pha.core.tabcontainer.TabBar;
import com.taobao.pha.core.ui.fragment.AppFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.Cnew;
import tb.kge;
import tb.neh;
import tb.nfc;
import tb.nfi;
import tb.nfp;
import tb.nfr;
import tb.nfs;
import tb.nfz;
import tb.ngl;
import tb.ngn;
import tb.ngr;
import tb.ngu;
import tb.ngv;

/* loaded from: classes7.dex */
public class AppController extends com.taobao.pha.core.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ConcurrentHashMap<Long, AppController> I;
    private final Map<String, com.taobao.pha.core.phacontainer.c> A;
    private final List<com.taobao.pha.core.phacontainer.c> B;
    private com.taobao.pha.core.jsbridge.b C;
    private JSONObject D;
    private volatile boolean E;
    private boolean F;
    private com.taobao.pha.core.i G;
    private final long H;
    private final m J;
    private volatile ManifestProperty K;
    private volatile ngv L;
    private boolean M;
    private PageModel N;
    private ngl O;
    private l P;
    private h Q;
    private boolean R;
    private volatile RequestInterceptor S;
    private volatile com.taobao.pha.core.rescache.h T;
    private final FeatureStatistics U;
    private OnScreenChangedListener V;
    private Map<String, Long> W;
    private Map<String, Object> X;

    /* renamed from: a  reason: collision with root package name */
    public o f18708a;
    private volatile Context b;
    private final Uri c;
    private final int d;
    private final PHAContainerType e;
    private volatile d f;
    private final b g;
    private final JSONObject h;
    private i i;
    private j j;
    private volatile com.taobao.pha.core.phacontainer.a k;
    private Fragment l;
    private AppEntryType m;
    private int n;
    private volatile ManifestModel o;
    private n p;
    private com.taobao.pha.core.tabcontainer.b q;
    private neh r;
    private volatile OfflineResourceInterceptor s;
    private AtomicBoolean t;
    private volatile nfr u;
    private volatile e v;
    private g w;
    private final CountDownLatch x;
    private final CountDownLatch y;
    private boolean z;

    public static /* synthetic */ Object ipc$super(AppController appController, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(AppController appController, ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad7ce0e", new Object[]{appController, manifestModel});
        } else {
            appController.c(manifestModel);
        }
    }

    public static /* synthetic */ void a(AppController appController, ManifestModel manifestModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e022a686", new Object[]{appController, manifestModel, new Boolean(z)});
        } else {
            appController.b(manifestModel, z);
        }
    }

    public static /* synthetic */ int b(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("107a752a", new Object[]{appController})).intValue() : appController.d;
    }

    public static /* synthetic */ void b(AppController appController, ManifestModel manifestModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ce0307", new Object[]{appController, manifestModel, new Boolean(z)});
        } else {
            appController.a(manifestModel, z);
        }
    }

    public static /* synthetic */ boolean c(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("540592fc", new Object[]{appController})).booleanValue() : appController.E;
    }

    public static /* synthetic */ Uri d(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("4133e7f0", new Object[]{appController}) : appController.c;
    }

    public static /* synthetic */ i e(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("fb13fdbe", new Object[]{appController}) : appController.i;
    }

    public static /* synthetic */ CountDownLatch f(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("66037da1", new Object[]{appController}) : appController.x;
    }

    public static /* synthetic */ nfr g(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfr) ipChange.ipc$dispatch("e155e690", new Object[]{appController}) : appController.u;
    }

    public static /* synthetic */ b h(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d3121802", new Object[]{appController}) : appController.g;
    }

    public static /* synthetic */ boolean i(AppController appController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9484582", new Object[]{appController})).booleanValue() : appController.M;
    }

    public Map<String, Long> Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("32c19a95", new Object[]{this}) : this.W;
    }

    public Map<String, Object> Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6bfc56", new Object[]{this}) : this.X;
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.W.put(str, Long.valueOf(j));
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.X.put(str, obj);
        }
    }

    public g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("ae5f1f1", new Object[]{this}) : this.w;
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3423cc", new Object[]{this, gVar});
        } else {
            this.w = gVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.z;
    }

    public nfr d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfr) ipChange.ipc$dispatch("261d22c1", new Object[]{this}) : this.u;
    }

    public void a(nfr nfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61c32de", new Object[]{this, nfrVar});
        } else {
            this.u = nfrVar;
        }
    }

    public e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2eddc790", new Object[]{this}) : this.v;
    }

    static {
        kge.a(-468884031);
        kge.a(-956527043);
        I = new ConcurrentHashMap<>();
    }

    public RequestInterceptor f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestInterceptor) ipChange.ipc$dispatch("72d546f2", new Object[]{this}) : this.S;
    }

    public com.taobao.pha.core.rescache.h g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.rescache.h) ipChange.ipc$dispatch("6fcdf965", new Object[]{this}) : this.T;
    }

    public FeatureStatistics h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FeatureStatistics) ipChange.ipc$dispatch("5aa3c9b9", new Object[]{this}) : this.U;
    }

    public static long a(AppController appController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccef576a", new Object[]{appController})).longValue();
        }
        long hashCode = appController.hashCode();
        I.put(Long.valueOf(hashCode), appController);
        return hashCode;
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            I.remove(Long.valueOf(j));
        }
    }

    public static AppController b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("677d9649", new Object[]{new Long(j)}) : I.get(Long.valueOf(j));
    }

    public AppController(String str, PHAContainerType pHAContainerType, int i) {
        this(str, pHAContainerType, i, null);
    }

    public AppController(final String str, PHAContainerType pHAContainerType, int i, JSONObject jSONObject) {
        this.h = new JSONObject(new ConcurrentHashMap());
        boolean z = false;
        this.t = new AtomicBoolean(false);
        this.W = new HashMap();
        this.X = new HashMap();
        this.x = new CountDownLatch(1);
        this.y = new CountDownLatch(1);
        this.z = false;
        this.A = new HashMap();
        this.B = new ArrayList();
        this.E = false;
        this.F = false;
        this.J = new m();
        this.L = null;
        this.R = false;
        this.U = new FeatureStatistics();
        this.e = pHAContainerType;
        this.c = Uri.parse(str);
        this.d = i;
        c(jSONObject);
        this.g = new b(this);
        this.i = new i(this);
        this.j = new j(this);
        if (!pHAContainerType.equals(PHAContainerType.EMBEDDED) && !"default".equals(this.c.getQueryParameter("pha_manifest"))) {
            this.r = new neh(this);
        }
        this.H = a(this);
        if ("true".equals(this.c.getQueryParameter(com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA)) && p.c().B()) {
            z = true;
        }
        this.R = z;
        ngr.b("AppController", "mLoadWebViewParallel: " + this.R);
        this.P = new l(this);
        if (this.R) {
            this.Q = new h(this);
        }
        this.z = StringUtils.equals(this.c.getQueryParameter("disableProgress"), "true");
        this.k = new com.taobao.pha.core.phacontainer.a(this);
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.controller.AppController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ManifestModel b = com.taobao.pha.core.manifest.e.a().b(AppController.b(AppController.this));
                if (AppController.c(AppController.this)) {
                    return;
                }
                if (b != null) {
                    AppController.a(AppController.this, b, false);
                    return;
                }
                ngr.b("AppController", "getManifest url: " + str + " is null");
                AppController appController = AppController.this;
                appController.a(AppController.d(appController), DowngradeType.MANIFEST_DATA_EMPTY, (Boolean) false);
            }
        });
        if (this.R) {
            Cnew.a(new Runnable() { // from class: com.taobao.pha.core.controller.AppController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ManifestModel b = com.taobao.pha.core.manifest.e.a().b(AppController.d(AppController.this));
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (b == null) {
                        ngr.b("AppController", "no expired manifest in the disk.");
                    } else if (!b.enableExpiredManifest) {
                    } else {
                        AppController.e(AppController.this).a("expiredManifestStartLoad", uptimeMillis);
                        AppController.e(AppController.this).a("expiredManifestFinishedLoad", uptimeMillis2);
                        AppController.a(AppController.this, b);
                    }
                }
            });
        }
        if (ngu.m()) {
            this.V = new OnScreenChangedListener() { // from class: com.taobao.pha.core.controller.AppController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i2, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i2, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i2, Configuration configuration) {
                    TabBar c;
                    ManifestModel u;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i2), configuration});
                    } else if (AppController.this.v() == null || (c = AppController.this.v().c()) == null || (u = AppController.this.u()) == null) {
                    } else {
                        c.getLayoutParams().height = u.tabBar.height > 0 ? ngn.a(AppController.this.C(), u.tabBar.height) : ngn.c(49);
                        c.requestLayout();
                    }
                }
            };
        }
    }

    @Deprecated
    public AppController(Context context, String str, PHAContainerType pHAContainerType, d dVar, int i, JSONObject jSONObject) {
        this(str, pHAContainerType, i, jSONObject);
        a(dVar, context);
    }

    @Deprecated
    public AppController(Context context, String str, PHAContainerType pHAContainerType, d dVar, int i) {
        this(context, str, pHAContainerType, dVar, i, null);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.R;
    }

    public l j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("157ad784", new Object[]{this}) : this.P;
    }

    public h k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("76cd73a7", new Object[]{this}) : this.Q;
    }

    public ngl l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngl) ipChange.ipc$dispatch("63aa50c0", new Object[]{this}) : this.O;
    }

    public void a(ngl nglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6279025", new Object[]{this, nglVar});
        } else {
            this.O = nglVar;
        }
    }

    public ngv m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngv) ipChange.ipc$dispatch("6b5bf755", new Object[]{this});
        }
        if (this.L == null) {
            synchronized (this) {
                ManifestModel manifestModel = this.o;
                this.L = new ngv(p.b().a().a(this.c, com.taobao.pha.core.o.a(this), manifestModel == null ? null : manifestModel.customDataSource));
            }
        }
        return this.L;
    }

    public OfflineResourceInterceptor n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OfflineResourceInterceptor) ipChange.ipc$dispatch("e86def07", new Object[]{this}) : this.s;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.E;
    }

    public PHAContainerType p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PHAContainerType) ipChange.ipc$dispatch("abb7c285", new Object[]{this}) : this.e;
    }

    public com.taobao.pha.core.phacontainer.a q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.phacontainer.a) ipChange.ipc$dispatch("fd548ac", new Object[]{this}) : this.k;
    }

    public Fragment r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("61cc615b", new Object[]{this}) : this.l;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.t.get();
    }

    public Uri t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("c1b29e32", new Object[]{this}) : this.c;
    }

    public ManifestModel u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ManifestModel) ipChange.ipc$dispatch("fc43a770", new Object[]{this}) : this.o;
    }

    public o v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("a55a2f55", new Object[]{this}) : this.f18708a;
    }

    public void a(d dVar, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299657f9", new Object[]{this, dVar, context});
            return;
        }
        this.f = dVar;
        this.b = context;
        this.h.put(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, (Object) this.c.toString());
        this.h.put("containerType", (Object) this.e.name().toLowerCase());
        this.h.put("navigationBarHidden", (Object) Boolean.valueOf(dVar.isNavigationBarHidden()));
        this.h.put("navigationBarHeight", (Object) Integer.valueOf(dVar.getNavigationBarHeight()));
        this.h.put("disableNativeStatistic", (Object) Boolean.valueOf(K()));
        h hVar = this.Q;
        if (hVar != null) {
            hVar.a(context);
        }
        ManifestModel manifestModel = this.o;
        if (manifestModel != null && !this.M) {
            ngr.b("AppController", "loadUI directly");
            a(manifestModel, false);
        } else if ("default".equals(this.c.getQueryParameter("pha_manifest"))) {
            nfi b = p.b().b();
            if ("true".equals(this.c.getQueryParameter("x-ssr")) && (!ngu.h() || b == null || !b.a(this.c.toString()))) {
                z = true;
            }
            if (!z) {
                ngr.b("AppController", "preload webview");
                this.h.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_CACHE_TYPE, (Object) 1);
                PageModel pageModel = new PageModel();
                pageModel.manifestPreset = true;
                pageModel.setUrl(this.c.toString());
                this.P.a(pageModel);
            } else {
                ngr.b("AppController", "can't preload webView because of signing");
            }
        }
        neh nehVar = this.r;
        if (nehVar != null) {
            nehVar.b();
        }
        this.i.h = dVar.isFragment();
        this.i.a();
        this.y.countDown();
    }

    public k w() {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("6accb78", new Object[]{this});
        }
        k b = this.j.b();
        return (b != null || (oVar = this.f18708a) == null) ? b : oVar.a();
    }

    public k a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f5b320fb", new Object[]{this, new Integer(i)});
        }
        o oVar = this.f18708a;
        if (oVar == null) {
            return null;
        }
        return oVar.b(i);
    }

    public ViewPagerFragment x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPagerFragment) ipChange.ipc$dispatch("b9373e58", new Object[]{this});
        }
        k b = this.j.b();
        if (b != null) {
            com.taobao.pha.core.phacontainer.c c = b.c();
            if (c instanceof ViewPagerFragment) {
                return (ViewPagerFragment) c;
            }
        }
        o oVar = this.f18708a;
        if (oVar == null) {
            return null;
        }
        com.taobao.pha.core.phacontainer.c b2 = oVar.b();
        if (!(b2 instanceof ViewPagerFragment)) {
            return null;
        }
        return (ViewPagerFragment) b2;
    }

    public List<nfz> y() {
        List<nfz> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19a221c7", new Object[]{this});
        }
        o oVar = this.f18708a;
        if (oVar == null) {
            d = new ArrayList<>();
        } else {
            d = oVar.d();
        }
        for (k kVar : this.j.a()) {
            if (kVar != null) {
                d.addAll(kVar.j());
            }
        }
        ngl nglVar = this.O;
        if (nglVar != null && nglVar.a() != null) {
            d.add(this.O.a());
        }
        return d;
    }

    public ManifestProperty z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ManifestProperty) ipChange.ipc$dispatch("dccb6005", new Object[]{this}) : this.K;
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.h.putAll(jSONObject);
        }
    }

    public JSONObject A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fba50768", new Object[]{this}) : this.h;
    }

    public List<nfz> a(String str) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(str) || (oVar = this.f18708a) == null) {
            return arrayList;
        }
        List<nfz> d = oVar.d();
        if ("*".equals(str)) {
            return d;
        }
        for (nfz nfzVar : d) {
            if (nfzVar != null && StringUtils.equals(nfzVar.d(), str)) {
                arrayList.add(nfzVar);
            }
        }
        return arrayList;
    }

    public nfz B() {
        k w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("20852d1b", new Object[]{this});
        }
        nfz nfzVar = null;
        k b = this.j.b();
        if (b != null && b.c() != null) {
            nfzVar = b.c().getPageView();
        }
        return (nfzVar != null || (w = w()) == null) ? nfzVar : w.d();
    }

    public Context C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9e374c42", new Object[]{this}) : this.b;
    }

    public d D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a33796f2", new Object[]{this}) : this.f;
    }

    public b E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("48a3353", new Object[]{this}) : this.g;
    }

    public JSONObject F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5dec28ed", new Object[]{this}) : this.D;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.D = jSONObject;
        }
    }

    public com.taobao.pha.core.i G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.i) ipChange.ipc$dispatch("3e8548ed", new Object[]{this}) : this.G;
    }

    public void a(com.taobao.pha.core.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdff087", new Object[]{this, iVar});
        } else {
            this.G = iVar;
        }
    }

    public com.taobao.pha.core.n H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.n) ipChange.ipc$dispatch("77d65a49", new Object[]{this}) : p.b();
    }

    @Deprecated
    public com.taobao.pha.core.tabcontainer.b I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.tabcontainer.b) ipChange.ipc$dispatch("9c07d21f", new Object[]{this}) : this.q;
    }

    @Deprecated
    public void a(com.taobao.pha.core.tabcontainer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31ae501", new Object[]{this, bVar});
        } else {
            this.q = bVar;
        }
    }

    public neh J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (neh) ipChange.ipc$dispatch("5e125224", new Object[]{this}) : this.r;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.F;
    }

    public long L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec7", new Object[]{this})).longValue() : this.H;
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else {
            this.F = p.c().d(uri);
        }
    }

    public List<com.taobao.pha.core.phacontainer.c> M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("49d14973", new Object[]{this}) : this.B;
    }

    public com.taobao.pha.core.jsbridge.b N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.jsbridge.b) ipChange.ipc$dispatch("b0feee34", new Object[]{this}) : this.C;
    }

    public void a(com.taobao.pha.core.jsbridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2333b", new Object[]{this, bVar});
        } else {
            this.C = bVar;
        }
    }

    public void a(final ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cd715c", new Object[]{this, manifestModel});
            return;
        }
        V();
        this.o = manifestModel;
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.controller.AppController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AppController.f(AppController.this).await(p.c().s(), TimeUnit.SECONDS);
                    AppController.a(AppController.this, manifestModel, true);
                } catch (InterruptedException unused) {
                    ngr.b("AppController", "fragment host loaded timeout");
                    AppController appController = AppController.this;
                    appController.a(AppController.d(appController), DowngradeType.FRAGMENT_ATTACH_FAILED, (Boolean) false);
                }
            }
        });
        ngn.a(this, "pha.setAppData", (JSONObject) null);
    }

    private void V() {
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        this.f18708a = null;
        this.A.clear();
        this.B.clear();
        Fragment fragment = this.l;
        if (fragment == null || fragment.isDetached() || !this.l.isAdded() || (childFragmentManager = this.l.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null || fragments.size() <= 0) {
            return;
        }
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        for (Fragment fragment2 : fragments) {
            if (fragment2 != null) {
                beginTransaction.remove(fragment2);
            }
        }
        beginTransaction.commitNowAllowingStateLoss();
    }

    public void a(com.taobao.pha.core.phacontainer.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a48cfe", new Object[]{this, cVar, str});
            return;
        }
        this.B.add(cVar);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.A.put(str, cVar);
    }

    public n O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("d1c452fd", new Object[]{this}) : this.p;
    }

    public i P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("3316ef01", new Object[]{this}) : this.i;
    }

    public j Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("94698bbf", new Object[]{this}) : this.j;
    }

    public int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4990bcc", new Object[]{this})).intValue();
        }
        d D = D();
        if (D == null) {
            return 0;
        }
        if (D.isImmersiveStatus()) {
            return Math.max(D.getStatusBarHeight(), D.getNotchHeight());
        }
        return Math.max(D.getNotchHeight() - D.getStatusBarHeight(), 0);
    }

    private void a(ManifestModel manifestModel, boolean z) {
        PageModel W;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16cf8", new Object[]{this, manifestModel, new Boolean(z)});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        com.taobao.pha.core.l i = p.b().i();
        if (i != null) {
            ngr.c("AppController", "Send UT updatePageName:" + this.c.toString());
            i.b(this.b, this.c.toString());
        }
        this.M = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFragment", dVar.isFragment());
        bundle.putLong("AppControllerInstanceId", L());
        if (dVar.isFragment() && !dVar.isImmersiveStatus()) {
            bundle.putInt(AppFragment.TOP_MARGIN_FRAGMENT, dVar.getStatusBarHeight());
        }
        if (this.m == AppEntryType.DEFAULT) {
            W = W();
            if (W == null) {
                z2 = false;
            }
            bundle.putBoolean("key_load_sub_page", z2);
        } else {
            W = W();
        }
        if (o()) {
            return;
        }
        this.i.a(16, SystemClock.uptimeMillis());
        if (this.l == null) {
            this.l = Fragment.instantiate(this.b, AppFragment.class.getName(), bundle);
        }
        Fragment fragment = this.l;
        if (fragment != null && (fragment.isAdded() || dVar.attachToHost(this.l))) {
            e(manifestModel);
            if (W != null) {
                a(W);
            } else if (z) {
                b(manifestModel);
            }
        } else {
            a(this.c, DowngradeType.FRAGMENT_ATTACH_FAILED, (Boolean) false);
        }
        this.x.countDown();
    }

    private void c(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbc8c9a", new Object[]{this, manifestModel});
            return;
        }
        d(manifestModel);
        a(manifestModel, this.c);
        h hVar = this.Q;
        if (hVar == null) {
            return;
        }
        hVar.b(manifestModel);
    }

    private void b(final ManifestModel manifestModel, final boolean z) {
        neh nehVar;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765b9339", new Object[]{this, manifestModel, new Boolean(z)});
            return;
        }
        com.taobao.pha.core.manifest.b z3 = p.b().z();
        if (z3 != null && p.c().z()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            manifestModel = z3.a(this, manifestModel);
            ngr.c("AppController", "processing manifest costs " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms.");
        }
        this.K = com.taobao.pha.core.manifest.e.a().c(this.d);
        if (this.K != null) {
            this.h.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_CACHE_TYPE, (Object) Integer.valueOf(this.K.i));
        }
        if (manifestModel.customDataSource != null && !manifestModel.customDataSource.isEmpty()) {
            Iterator<Object> it = manifestModel.customDataSource.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    m().a(((JSONObject) next).getString("key"));
                }
            }
        }
        if (manifestModel.offlineResources != null && !manifestModel.offlineResources.isEmpty()) {
            this.s = new OfflineResourceInterceptor(this, manifestModel.offlineResources);
        }
        if (ngu.e()) {
            this.S = new RequestInterceptor(manifestModel.offlineResources);
            if (manifestModel.resourcePrefetch != null) {
                for (int i = 0; i < manifestModel.resourcePrefetch.size(); i++) {
                    ResourcePrefetchModel resourcePrefetchModel = manifestModel.resourcePrefetch.get(i);
                    if (resourcePrefetchModel != null && resourcePrefetchModel.headers != null) {
                        resourcePrefetchModel.headers = m().a(resourcePrefetchModel.headers);
                    }
                }
                this.T = new com.taobao.pha.core.rescache.h(this.S, manifestModel.resourcePrefetch);
            }
        }
        if (manifestModel.enableListenCapture && (C() instanceof Activity)) {
            this.u = new nfr((Activity) C());
            this.u.a(new nfp() { // from class: com.taobao.pha.core.controller.AppController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nfp
                public void a(nfs nfsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f61ca73d", new Object[]{this, nfsVar});
                        return;
                    }
                    final JSONObject jSONObject = new JSONObject();
                    jSONObject.put("intercepted", (Object) Boolean.valueOf(!AppController.g(AppController.this).a()));
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.core.controller.AppController.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                AppController.h(AppController.this).a("capturescreen", jSONObject, "native", "*");
                            }
                        }
                    });
                }
            });
        }
        d(manifestModel);
        a(manifestModel, this.c);
        this.o = manifestModel;
        h hVar = this.Q;
        if (hVar != null) {
            hVar.a(manifestModel);
        }
        if (!z && (nehVar = this.r) != null) {
            nehVar.a(manifestModel);
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.taobao.pha.core.controller.AppController.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AppController.i(AppController.this) && !z) {
                } else {
                    AppController.b(AppController.this, manifestModel, z);
                }
            }
        });
        PageModel pageModel = null;
        if (this.m == AppEntryType.DEFAULT) {
            pageModel = W();
        }
        if (p.c().j() && pageModel == null && this.k != null) {
            this.k.a();
        }
        a(this.c);
        this.i.d();
        this.i.a("launch", new JSONObject());
        if (!"update".equals(this.c.getQueryParameter("pha_manifest"))) {
            return;
        }
        if (this.K == null || !"update".equals(this.K.h)) {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        ngr.c("AppController", "detect the fetchType is update, and ready to cache the manifest and prefetch data");
        ManifestModel b = com.taobao.pha.core.manifest.e.a().b(com.taobao.pha.core.manifest.e.a().a(this.c, false));
        if (b == null || !(b.dataPrefetch instanceof JSONArray) || this.k == null) {
            return;
        }
        this.k.a((JSONArray) b.dataPrefetch);
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        if (bundle != null) {
            this.i.a(false);
        } else if (!PHAContainerType.GENERIC.equals(this.e)) {
            this.i.a(15, SystemClock.uptimeMillis());
        }
        if (this.f.isImmersiveStatus() && !this.f.isFragment() && (this.b instanceof AppCompatActivity)) {
            a((AppCompatActivity) this.b);
        }
        Context C = C();
        boolean isNavigationBarHidden = D().isNavigationBarHidden();
        if ((C instanceof AppCompatActivity) && isNavigationBarHidden) {
            try {
                ActionBar supportActionBar = ((AppCompatActivity) C).getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.e();
                }
            } catch (Exception unused) {
            }
        }
        if (p.b().i() != null && !this.F) {
            ngr.c("AppController", "Send UT skipPage");
            p.b().i().a(this.b);
        }
        if (this.V == null) {
            return;
        }
        com.taobao.android.autosize.h.a().c(this.V);
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.g.a("appappear", "", "native", "AppWorker");
        this.g.a("phaappear", "", "native", "AppWorker");
        com.taobao.pha.core.l i = p.b().i();
        if (i == null || this.F) {
            return;
        }
        ngr.c("AppController", "Send UT pageAppear:" + this.c.toString());
        i.a(this.b, this.c);
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.g.a("appdisappear", "", "native", "AppWorker");
        this.g.a("phadisappear", "", "native", "AppWorker");
        com.taobao.pha.core.l i = p.b().i();
        if (i == null || this.F) {
            return;
        }
        ngr.c("AppController", "Send UT pageDisappear.");
        i.b(this.b);
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else {
            this.i.e();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.i.f();
        this.E = true;
        com.taobao.pha.core.manifest.e.a().a(this.d);
        a(this.H);
        neh nehVar = this.r;
        if (nehVar != null) {
            nehVar.a();
            this.r = null;
        }
        this.k = null;
        l lVar = this.P;
        if (lVar != null) {
            lVar.a();
            this.P = null;
        }
        this.A.clear();
        this.B.clear();
        n nVar = this.p;
        if (nVar != null) {
            nVar.b();
            this.p = null;
        }
        if (this.f18708a != null) {
            this.f18708a = null;
        }
        com.taobao.pha.core.tabcontainer.b bVar = this.q;
        if (bVar != null) {
            bVar.a();
        }
        com.taobao.pha.core.jsbridge.b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.a();
        }
        if (this.u != null) {
            this.u.b();
        }
        a();
        this.J.a();
        if (this.V == null) {
            return;
        }
        com.taobao.android.autosize.h.a().d(this.V);
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue();
        }
        g gVar = this.w;
        if (gVar != null && gVar.a()) {
            return true;
        }
        return this.j.a(1, 1);
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (nfz nfzVar : y()) {
            if (nfzVar != null) {
                nfzVar.a(i, i2, intent);
            }
        }
    }

    public boolean a(Uri uri, DowngradeType downgradeType, Boolean bool) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92270b6", new Object[]{this, uri, downgradeType, bool})).booleanValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                this.y.await(p.c().r(), TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                ngr.b("AppController", "waiting for fragment host to be loaded timeout.");
            }
        }
        if (!this.t.compareAndSet(false, true)) {
            return false;
        }
        if (downgradeType != DowngradeType.DEFAULT && downgradeType != DowngradeType.USER && (dVar = this.f) != null && dVar.downgrade(uri, downgradeType, bool)) {
            a(downgradeType, true);
            return true;
        }
        com.taobao.pha.core.n b = p.b();
        if (!PHAContainerType.EMBEDDED.equals(this.e) && b != null && b.u() != null && b.u().a(uri, this.b, bool)) {
            if (this.b instanceof Activity) {
                ((Activity) this.b).finish();
                ((Activity) this.b).overridePendingTransition(0, 0);
            }
            a(downgradeType, true);
            return true;
        }
        a(downgradeType, false);
        return false;
    }

    private void d(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45341a39", new Object[]{this, manifestModel});
            return;
        }
        this.m = AppEntryType.DEFAULT;
        String queryParameter = this.c.getQueryParameter("pha_active_page_key");
        if (StringUtils.isEmpty(queryParameter) || manifestModel.tabBar == null) {
            return;
        }
        ArrayList<PageModel> arrayList = manifestModel.pages;
        int i = 0;
        int i2 = -1;
        loop0: while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            PageModel pageModel = arrayList.get(i);
            if (pageModel != null) {
                i2 = pageModel.getDefaultFrameIndex();
                if (StringUtils.equals(pageModel.key, queryParameter)) {
                    break;
                } else if (pageModel.frames != null) {
                    for (int i3 = 0; i3 < pageModel.frames.size(); i3++) {
                        PageModel pageModel2 = pageModel.frames.get(i3);
                        if (pageModel2 != null && StringUtils.equals(pageModel2.key, queryParameter)) {
                            i2 = i3;
                            break loop0;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
            i++;
        }
        if (i < 0) {
            return;
        }
        this.m = AppEntryType.ACTIVE_PAGE_KEY;
        manifestModel.tabBar.selectedIndex = i;
        PageModel pageModel3 = arrayList.get(i);
        if (pageModel3 == null || i2 < 0 || pageModel3.getPageHeader() == null) {
            return;
        }
        pageModel3.setActiveIndex(i2);
    }

    private void a(DowngradeType downgradeType, boolean z) {
        PHAErrorType pHAErrorType;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2504dd0", new Object[]{this, downgradeType, new Boolean(z)});
            return;
        }
        switch (downgradeType) {
            case MANIFEST_DATA_EMPTY:
                pHAErrorType = PHAErrorType.REFERENCE_ERROR;
                str = com.taobao.pha.core.error.a.ERR_MSG_MANIFEST_DATA_IS_NULL;
                break;
            case WORKER_LOAD_FAILED:
                pHAErrorType = PHAErrorType.THIRD_PARTY_ERROR;
                str = com.taobao.pha.core.error.a.ERR_MSG_WORKER_INIT_FAILED;
                break;
            case UC_NOT_READY:
                pHAErrorType = PHAErrorType.THIRD_PARTY_ERROR;
                str = com.taobao.pha.core.error.a.ERR_MSG_WEBVIEW_NOT_READY;
                break;
            case FRAGMENT_ATTACH_FAILED:
                pHAErrorType = PHAErrorType.UI_ERROR;
                str = com.taobao.pha.core.error.a.ERR_MSG_FRAGMENT_ATTACH_FAILED;
                break;
            case EMPTY_CONTEXT:
                pHAErrorType = PHAErrorType.CLIENT_ERROR;
                str = com.taobao.pha.core.error.a.ERR_MSG_CLIENT_CONTEXT_IS_NULL;
                break;
            case USER:
                pHAErrorType = PHAErrorType.OTHERS;
                str = com.taobao.pha.core.error.a.ERR_MSG_EXECUTE_JSAPI_DOWNGRADE;
                break;
            default:
                pHAErrorType = PHAErrorType.CLIENT_ERROR;
                str = "Default Downgrade";
                break;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", (Object) downgradeType.toString());
        jSONObject.put("downgradeSuccess", (Object) Boolean.valueOf(z));
        this.i.a("launch", new com.taobao.pha.core.error.a(pHAErrorType, str, jSONObject));
        HashMap hashMap = new HashMap();
        hashMap.put("downgradeType", downgradeType);
        a(new e.a("downgrade", hashMap));
    }

    public static void a(ManifestModel manifestModel, Uri uri) {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef5876b", new Object[]{manifestModel, uri});
        } else if (manifestModel.pages.size() <= 0) {
        } else {
            Iterator<PageModel> it = manifestModel.pages.iterator();
            while (it.hasNext()) {
                ManifestModel.setUpLayoutIndex(manifestModel, it.next(), uri);
            }
            if (manifestModel.tabBar != null) {
                ManifestModel.setUpHtmlTemplate(manifestModel, manifestModel.tabBar, uri);
            }
            if (manifestModel.tabBar != null) {
                i = manifestModel.tabBar.selectedIndex;
            }
            if (i < 0 || i >= manifestModel.pages.size() || (pageModel = manifestModel.pages.get(i)) == null || pageModel.getPageHeader() == null) {
                return;
            }
            pageModel.getPageHeader().firstPage = true;
        }
    }

    private void e(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaba7d8", new Object[]{this, manifestModel});
        } else if (!(this.l instanceof AppFragment)) {
        } else {
            if (!StringUtils.isEmpty(manifestModel.backgroundColor)) {
                ((AppFragment) this.l).setBackgroundColor(ngn.f(manifestModel.backgroundColor));
            }
            this.p = new n(this);
            this.p.a();
        }
    }

    public void b(ManifestModel manifestModel) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d244fefb", new Object[]{this, manifestModel});
            return;
        }
        ngr.b("AppController", "load TabUI");
        Fragment fragment = this.l;
        if (fragment instanceof AppFragment) {
            ((AppFragment) fragment).loadTabBar(C(), manifestModel);
        }
        if (manifestModel.pages.size() == 0) {
            ngr.b("AppController", "pages is empty");
        }
        if (manifestModel.tabBar != null && (i = manifestModel.tabBar.selectedIndex) >= 0 && i < manifestModel.pages.size()) {
            this.n = i;
        }
        if (this.n >= manifestModel.pages.size()) {
            return;
        }
        this.f18708a = new o(this, this.l, manifestModel, this.n);
    }

    public String getDowngradeUrlFromManifest() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b3fb50", new Object[]{this});
        }
        ManifestModel manifestModel = this.o;
        if (manifestModel == null || manifestModel.pages.size() == 0) {
            return null;
        }
        int i2 = this.n;
        if (i2 < 0 || i2 >= manifestModel.pages.size()) {
            i2 = 0;
        }
        PageModel pageModel = manifestModel.pages.get(i2);
        if (pageModel == null) {
            return null;
        }
        if (pageModel.frames.size() == 0) {
            return pageModel.getUrl();
        }
        int defaultFrameIndex = pageModel.getDefaultFrameIndex();
        if (defaultFrameIndex >= 0 && defaultFrameIndex < pageModel.frames.size()) {
            i = defaultFrameIndex;
        }
        PageModel pageModel2 = pageModel.frames.get(i);
        if (pageModel2 == null) {
            return null;
        }
        return pageModel2.getUrl();
    }

    private PageModel W() {
        PageModel pageModel;
        PageModel pageModel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("ae77932", new Object[]{this});
        }
        PageModel pageModel3 = this.N;
        if (pageModel3 != null) {
            return pageModel3;
        }
        com.taobao.pha.core.error.a aVar = null;
        if (!p.c().y()) {
            return null;
        }
        String queryParameter = this.c.getQueryParameter("pha_sub_page_key");
        String queryParameter2 = this.c.getQueryParameter("pha_jump_url");
        if (StringUtils.isEmpty(queryParameter) && StringUtils.isEmpty(queryParameter2)) {
            return null;
        }
        if (!StringUtils.isEmpty(queryParameter)) {
            Iterator<PageModel> it = this.o.pages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pageModel = null;
                    break;
                }
                pageModel = it.next();
                if (pageModel != null && !StringUtils.isEmpty(pageModel.key) && queryParameter.equals(pageModel.key)) {
                    break;
                }
            }
            if (pageModel != null) {
                this.m = AppEntryType.SUB_PAGE_KEY;
                String url = pageModel.getUrl();
                if (pageModel.frames.size() > 0 && (pageModel2 = pageModel.frames.get(pageModel.getActiveIndex())) != null) {
                    url = pageModel2.getUrl();
                }
                if (StringUtils.isEmpty(url) || !this.f.isTrustedUrl(url)) {
                    pageModel = null;
                    aVar = new com.taobao.pha.core.error.a(PHAErrorType.SECURITY_ERROR, com.taobao.pha.core.error.a.ERR_MSG_INVALID_DOMAIN);
                }
            } else {
                aVar = new com.taobao.pha.core.error.a(PHAErrorType.TYPE_ERROR, com.taobao.pha.core.error.a.ERR_MSG_SUBPAGE_KEY_NOT_EXIST);
            }
        } else {
            pageModel = null;
        }
        if (pageModel == null && !StringUtils.isEmpty(queryParameter2)) {
            queryParameter2 = Uri.decode(queryParameter2);
            if (!StringUtils.isEmpty(queryParameter2)) {
                this.m = AppEntryType.SUB_PAGE_JUMP_URL;
                if (this.f.isTrustedUrl(queryParameter2)) {
                    pageModel = new PageModel();
                    pageModel.key = queryParameter2;
                    pageModel.setUrl(queryParameter2);
                } else {
                    aVar = new com.taobao.pha.core.error.a(PHAErrorType.SECURITY_ERROR, com.taobao.pha.core.error.a.ERR_MSG_INVALID_DOMAIN);
                }
            }
        }
        if (aVar != null) {
            if (!StringUtils.isEmpty(queryParameter)) {
                aVar.c.put("subPageKey", (Object) queryParameter);
            } else if (!StringUtils.isEmpty(queryParameter2)) {
                aVar.c.put("jumpUrl", (Object) queryParameter2);
            }
            this.i.a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_SUB_PAGE, aVar);
        }
        this.N = pageModel;
        return pageModel;
    }

    private boolean a(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("737dfcc0", new Object[]{this, pageModel})).booleanValue();
        }
        ngr.b("AppController", "load SubPageUI");
        Boolean valueOf = Boolean.valueOf(this.j.a(pageModel));
        JSONObject jSONObject = new JSONObject();
        if (this.m == AppEntryType.SUB_PAGE_KEY && !StringUtils.isEmpty(pageModel.key)) {
            jSONObject.put("subPageKey", (Object) pageModel.key);
        } else if (this.m == AppEntryType.SUB_PAGE_JUMP_URL && !StringUtils.isEmpty(pageModel.getUrl())) {
            jSONObject.put("jumpUrl", (Object) pageModel.getUrl());
        }
        if (valueOf.booleanValue()) {
            this.i.a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_SUB_PAGE, jSONObject);
        } else {
            this.i.a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_SUB_PAGE, new com.taobao.pha.core.error.a(PHAErrorType.CLIENT_ERROR, com.taobao.pha.core.error.a.ERR_MSG_LOAD_SUBPAGE_FAILED, jSONObject));
        }
        return valueOf.booleanValue();
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else if (this.f18708a != null || this.o == null) {
        } else {
            p.c();
            if (this.k != null) {
                this.k.a();
            }
            b(this.o);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        f p = p.b().p();
        if (p == null) {
            return;
        }
        p.a(this, str, jSONObject);
    }

    public Fragment b(JSONObject jSONObject) {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("1e7dc589", new Object[]{this, jSONObject});
        }
        Fragment fragment = null;
        if (!X()) {
            return null;
        }
        try {
            pageModel = (PageModel) JSONObject.toJavaObject(jSONObject, PageModel.class);
        } catch (Throwable th) {
            ngr.b("AppController", "getSubPageFragment:" + th.getLocalizedMessage());
            pageModel = null;
        }
        if (pageModel == null) {
            return null;
        }
        if (!this.j.e()) {
            ngr.b("AppController", "Navigator disabled by inner");
            return null;
        }
        this.j.c();
        com.taobao.pha.core.phacontainer.c c = this.j.b(pageModel).c();
        if (c instanceof Fragment) {
            fragment = (Fragment) c;
            if (this.k != null) {
                this.k.a(pageModel);
            }
        }
        return fragment;
    }

    private boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue() : p.c().a("__enable_outer_navigator__", true);
    }

    private static void a(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cb6f21", new Object[]{appCompatActivity});
        } else if (Build.VERSION.SDK_INT < 21 || appCompatActivity.getWindow() == null) {
        } else {
            appCompatActivity.getWindow().getDecorView().setSystemUiVisibility(1280);
            appCompatActivity.getWindow().setStatusBarColor(0);
        }
    }
}
