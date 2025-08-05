package com.taobao.search.searchdoor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.k;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.voiceassistant.context.AssistantContext;
import com.taobao.android.voiceassistant.helper.Objects;
import com.taobao.android.weex_framework.p;
import com.taobao.monitor.procedure.o;
import com.taobao.monitor.procedure.s;
import com.taobao.search.common.SearchBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.i;
import com.taobao.search.common.util.n;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.common.util.w;
import com.taobao.search.sf.b;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.util.NetWorkUtils;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.drb;
import tb.imn;
import tb.imo;
import tb.ipl;
import tb.ipn;
import tb.irg;
import tb.ium;
import tb.jrw;
import tb.jrx;
import tb.jry;
import tb.jrz;
import tb.kge;
import tb.nde;
import tb.nnd;
import tb.nnq;
import tb.noa;
import tb.nre;
import tb.nrj;
import tb.nrk;
import tb.ntl;
import tb.pop;
import tb.tqn;
import tb.tqo;
import tb.tqp;

/* loaded from: classes7.dex */
public class SearchDoorActivity extends SearchBaseActivity implements com.taobao.android.searchbaseframe.uikit.a, com.taobao.android.xsearchplugin.muise.f, com.taobao.android.xsearchplugin.muise.g, com.taobao.search.searchdoor.sf.widgets.a, com.taobao.search.sf.c, drb, irg, ium, jrw, pop, tqn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIFE_CYCLE_DESTROY = 3;
    public static final int LIFE_CYCLE_PAUSE = 2;
    public static final int LIFE_CYCLE_RESUME = 1;
    public static final String PAGE_NAME = "Page_SearchDoor";

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.search.searchdoor.sf.widgets.f f19325a;
    private View d;
    private jrz f;
    private ScreenType h;
    private int l;
    private boolean n;
    private tqo p;
    private Handler r;
    private boolean b = r.bL();
    private com.taobao.search.c c = new com.taobao.search.c();
    private com.taobao.search.sf.h i = new com.taobao.search.sf.h();
    private final boolean k = false;
    private tqp j = new tqp();
    private boolean m = false;
    private String o = "";
    private AtomicBoolean q = new AtomicBoolean(false);
    private boolean s = false;
    private final boolean e = r.aj();
    private boolean g = true;

    static {
        kge.a(2048200362);
        kge.a(1057278578);
        kge.a(-1747045540);
        kge.a(1811067990);
        kge.a(673775850);
        kge.a(754605064);
        kge.a(773855988);
        kge.a(-629875645);
        kge.a(-1119321216);
        kge.a(-1955873753);
        kge.a(-313475756);
        kge.a(712939868);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorActivity searchDoorActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 93762283:
                super.d();
                return null;
            case 109462140:
                super.u();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1553572081:
                return super.getSystemService((String) objArr[0]);
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.searchbaseframe.uikit.a
    public boolean aF_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87ffec85", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ View a(SearchDoorActivity searchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e7049a85", new Object[]{searchDoorActivity, view});
        }
        searchDoorActivity.d = view;
        return view;
    }

    public static /* synthetic */ jrz a(SearchDoorActivity searchDoorActivity, jrz jrzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrz) ipChange.ipc$dispatch("489ce287", new Object[]{searchDoorActivity, jrzVar});
        }
        searchDoorActivity.f = jrzVar;
        return jrzVar;
    }

    public static /* synthetic */ void a(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54922f6f", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.E();
        }
    }

    public static /* synthetic */ void a(SearchDoorActivity searchDoorActivity, com.taobao.search.searchdoor.sf.widgets.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c24b763", new Object[]{searchDoorActivity, fVar});
        } else {
            searchDoorActivity.a(fVar);
        }
    }

    public static /* synthetic */ void b(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eadae0e", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.a();
        }
    }

    public static /* synthetic */ tqo c(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqo) ipChange.ipc$dispatch("2d876de7", new Object[]{searchDoorActivity}) : searchDoorActivity.p;
    }

    public static /* synthetic */ boolean d(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2e4ab50", new Object[]{searchDoorActivity})).booleanValue() : searchDoorActivity.n;
    }

    public static /* synthetic */ void e(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0029eb", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.F();
        }
    }

    public static /* synthetic */ void f(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71ba88a", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.x();
        }
    }

    public static /* synthetic */ void g(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1372729", new Object[]{searchDoorActivity});
        } else {
            super.u();
        }
    }

    public static /* synthetic */ int h(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b52a5bb", new Object[]{searchDoorActivity})).intValue() : searchDoorActivity.l;
    }

    public static /* synthetic */ void i(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256e2467", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.B();
        }
    }

    public static /* synthetic */ void j(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f89a306", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.w();
        }
    }

    public static /* synthetic */ void k(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a521a5", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.v();
        }
    }

    public static /* synthetic */ void l(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c0a044", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.z();
        }
    }

    public static /* synthetic */ void m(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddc1ee3", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.y();
        }
    }

    public static /* synthetic */ void n(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f79d82", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.H();
        }
    }

    public static /* synthetic */ boolean o(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2131c25", new Object[]{searchDoorActivity})).booleanValue() : searchDoorActivity.s;
    }

    public static /* synthetic */ void p(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2e9ac0", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.r();
        }
    }

    public static /* synthetic */ void q(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64a195f", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.I();
        }
    }

    public static /* synthetic */ View r(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d8596cc0", new Object[]{searchDoorActivity}) : searchDoorActivity.d;
    }

    public static /* synthetic */ void s(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81169d", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.p();
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.m = k();
        this.s = com.alibaba.ability.localization.b.f();
        if (this.m) {
            this.p = new tqo(new WeakReference(this));
        }
        m();
        this.h = ScreenType.b(this);
        this.c.a((Activity) this, true);
        if (g()) {
            ah.a(getWindow().getDecorView());
        }
        if (this.m || t()) {
            z = true;
        }
        if (z) {
            this.r = com.taobao.search.e.a();
        }
        if (this.m) {
            this.r.post(new Runnable() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchDoorActivity.a(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            E();
        }
        if (z) {
            this.r.post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        SearchDoorActivity.b(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            a();
        }
        super.onCreate(bundle);
        setContentView(e());
        if (this.m) {
            getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (SearchDoorActivity.c(SearchDoorActivity.this) == null) {
                    } else {
                        SearchDoorActivity.c(SearchDoorActivity.this).a(SearchDoorActivity.d(SearchDoorActivity.this));
                    }
                }
            });
        }
        if (z) {
            this.r.post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        SearchDoorActivity.f(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            x();
        }
        if (this.m) {
            this.r.post(new Runnable() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchDoorActivity.e(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            F();
        }
        if (TextUtils.isEmpty(this.o)) {
            return;
        }
        s.f18233a.a(o.f18229a.a(this).c()).a("search_door_opt", this.o);
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        i.b.a.a();
        i.b.a.a("load");
        i.b.a.a(i.b.MEASURE_ONCREATE);
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            i.b.a.b(i.b.MEASURE_ONCREATE);
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.m) {
            this.r.post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        SearchDoorActivity.g(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            super.u();
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else if (this.q.get()) {
        } else {
            this.q.set(true);
            k.a().c(this, "tbsearch_remote");
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g = o();
        TLogTracker.a("MainSearchDoor");
        if (this.m) {
            SearchSdk.partInit();
            this.j.a();
        } else {
            SearchSdk.init();
        }
        if (!a(getIntent()) && com.alibaba.ability.localization.b.f()) {
            this.n = u.b();
        }
        TLogTracker.a(r.bk());
        if (this.m) {
            return;
        }
        com.taobao.search.d.a(getCore());
        com.taobao.search.common.util.o.INSTANCE.a(this);
        r.B();
        if (imo.b() == null) {
            return;
        }
        imo.b().c().j().o = r.ch();
    }

    private void a(com.taobao.search.searchdoor.sf.widgets.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27af78ca", new Object[]{this, fVar});
            return;
        }
        this.f19325a = fVar;
        this.f19325a.postEvent(nre.b.a());
        this.f19325a.subscribeEvent(this);
        TLogTracker.a(this.f19325a.f19370a.c());
        this.c.a(f(), 0);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        ipl.g().a();
        c();
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (!hasWindowFocus()) {
        } else {
            this.f19325a.a(true);
        }
    }

    public static boolean a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("channelSrp");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = data.getQueryParameter(nde.G_CHANNELSRP);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = intent.getStringExtra("channelSrp");
            }
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = intent.getStringExtra(nde.G_CHANNELSRP);
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                return true;
            }
        }
        return false;
    }

    private void b(final com.taobao.search.searchdoor.sf.widgets.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617a1aa9", new Object[]{this, fVar});
        } else {
            runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    SearchDoorActivity.a(SearchDoorActivity.this, fVar);
                    int h = SearchDoorActivity.h(SearchDoorActivity.this);
                    if (h == 1) {
                        SearchDoorActivity.i(SearchDoorActivity.this);
                        SearchDoorActivity.j(SearchDoorActivity.this);
                        SearchDoorActivity.k(SearchDoorActivity.this);
                    } else if (h == 2) {
                        SearchDoorActivity.m(SearchDoorActivity.this);
                        SearchDoorActivity.k(SearchDoorActivity.this);
                    } else if (h != 3) {
                    } else {
                        SearchDoorActivity.l(SearchDoorActivity.this);
                    }
                }
            });
        }
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        n.INSTANCE.h();
        G();
        if (this.m) {
            boolean b = this.j.b();
            com.taobao.search.searchdoor.sf.widgets.f fVar = new com.taobao.search.searchdoor.sf.widgets.f(this, this);
            if (b) {
                b = fVar.a(this.r);
            }
            SearchSdk.init();
            if (!b) {
                fVar.b();
            }
            n.INSTANCE.h();
            b(fVar);
            com.taobao.search.d.a(getCore());
            com.taobao.search.common.util.o.INSTANCE.a(this);
            r.B();
            nnd.b();
        } else {
            com.taobao.search.searchdoor.sf.widgets.f fVar2 = new com.taobao.search.searchdoor.sf.widgets.f(this, this);
            fVar2.b();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a(fVar2);
                v();
            } else {
                b(fVar2);
            }
            nnd.b();
        }
        com.taobao.search.searchdoor.sf.config.a aVar = com.taobao.search.searchdoor.sf.config.a.INSTANCE;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!r.bw() || !r.e("preloadInstance")) {
        } else {
            if (!ipl.g().c()) {
                com.taobao.search.e.a().post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.searchbaseframe.util.i
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            String a2 = i.a(SearchDoorActivity.o(SearchDoorActivity.this));
                            if (TextUtils.isEmpty(a2)) {
                                return;
                            }
                            JSONObject parseObject = JSON.parseObject(a2);
                            ipl.g().a(parseObject, SearchDoorActivity.this.getCore());
                            ipl.g().b(parseObject, SearchDoorActivity.this.getCore());
                            SearchDoorActivity.this.runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.11.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.searchbaseframe.util.i
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else {
                                        SearchDoorActivity.p(SearchDoorActivity.this);
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                });
            } else {
                new Handler().post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.searchbaseframe.util.i
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            SearchDoorActivity.p(SearchDoorActivity.this);
                        }
                    }
                });
            }
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (isFinishing() || !r.cx() || !ipl.g().e()) {
        } else {
            s();
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (ipl.g().c()) {
            if (n.INSTANCE.e() && this.s) {
                return;
            }
            if (!this.s && !u.s()) {
                return;
            }
            String valueOf = String.valueOf(com.taobao.android.searchbaseframe.util.j.d(b.g.a(ListStyle.WATERFALL, getWindow().getDecorView().getMeasuredWidth())));
            f a2 = f.a();
            if (a2.b() >= 4) {
                return;
            }
            int b = 4 - a2.b();
            List<MuiseCellBean> f = ipl.g().f();
            HashMap hashMap = new HashMap();
            hashMap.put("containerWidth", valueOf);
            hashMap.put("layoutStyle", 1);
            hashMap.put("preload", "true");
            for (int i = 0; i < b; i++) {
                MuiseCellBean muiseCellBean = f.get(i);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("model", muiseCellBean.mMuiseBean.model);
                hashMap2.put("status", hashMap);
                ipn ipnVar = new ipn(this, getCore(), null, null, null);
                ipnVar.a(getApplication());
                ipnVar.a(muiseCellBean.mMuiseBean, hashMap2);
                a2.a(ipnVar.e());
            }
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        this.o = u.q();
        return u.n();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        if (this.m) {
            return R.layout.tbsearch_sf_searchdoor_immersive_opt;
        }
        return R.layout.tbsearch_sf_searchdoor_immersive;
    }

    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : getWindow().getDecorView();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            getWindow().requestFeature(12);
            supportRequestWindowFeature(12);
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        r.a("search_onesearch_nx", noa.KEY_CATMAP, "");
        r.d();
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.f fVar = this.f19325a;
        if (fVar == null) {
            return;
        }
        fVar.onCtxPauseInternal();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.l = 2;
        y();
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.f fVar = this.f19325a;
        if (fVar == null) {
            return;
        }
        fVar.onCtxDestroyInternal();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.l = 3;
        z();
        TLogTracker.c();
        this.i.a();
        f.a().d();
        J();
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.f fVar = this.f19325a;
        if (fVar == null) {
            return;
        }
        fVar.onCtxResumeInternal();
        c();
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            i.b.a.a("onResume");
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else {
            i.b.a.b("onResume");
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        System.currentTimeMillis();
        this.l = 1;
        if (this.m) {
            this.r.post(new Runnable() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchDoorActivity.n(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            H();
        }
        TLogTracker.a("MainSearchDoor");
        super.onResume();
        B();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, PAGE_NAME);
        if (this.m) {
            this.r.post(new Runnable() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchDoorActivity.q(SearchDoorActivity.this);
                    }
                }
            });
        } else {
            I();
        }
        if (r.e()) {
            nnq.a(getApplicationContext());
        }
        if (NetWorkUtils.isNetworkAvailable(getActivity())) {
            return;
        }
        w.a(getActivity());
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        if (dR_() && a(getIntent())) {
            Nav.from(this).toUri(intent.getData());
            finish();
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.f fVar = this.f19325a;
        if (fVar != null) {
            fVar.d();
        }
        this.g = o();
        p();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        i.b.a.a("onStart");
        super.onStart();
        i.b.a.b("onStart");
        TLogTracker.a();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (n() && this.f19325a != null && r.bI()) {
            this.f19325a.postEvent(nrj.a.a());
            overridePendingTransition(0, 0);
        }
        J();
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        tqo tqoVar = this.p;
        if (tqoVar == null) {
            return;
        }
        tqoVar.c();
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        try {
            if (this.f19325a != null) {
                return TextUtils.equals(this.f19325a.f19370a.a(noa.KEY_G_POP_UP), "true");
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        com.taobao.search.searchdoor.sf.widgets.f fVar = this.f19325a;
        if (fVar == null) {
            return;
        }
        fVar.a(z);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : aF_();
    }

    @Override // tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : com.taobao.search.sf.j.f19452a;
    }

    public void onEventMainThread(final nre.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b78b2", new Object[]{this, fVar});
        } else {
            com.alibaba.flexa.compat.c.a("com.taobao.android.voiceassistant.helper.Objects", new c.a() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                        return;
                    }
                    SearchDoorActivity.a(SearchDoorActivity.this, Objects.findNestedRecyclerView(fVar.f31679a));
                    if (SearchDoorActivity.r(SearchDoorActivity.this) == null) {
                        return;
                    }
                    SearchDoorActivity.r(SearchDoorActivity.this).setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.9.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                            }
                            if (motionEvent.getAction() == 2 && SearchDoorActivity.this.f19325a != null) {
                                SearchDoorActivity.this.f19325a.postEvent(nrj.a.a());
                            }
                            return false;
                        }
                    });
                }
            });
        }
    }

    @Override // tb.jrw
    public jrx bO_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jrx) ipChange.ipc$dispatch("10f974dd", new Object[]{this}) : new jrx.a().b(this.e).a(this.e).c(false).a(81).b(15).a();
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        String str = "";
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getQueryParameter(nde.G_CHANNELSRP);
                if (TextUtils.isEmpty(str)) {
                    str = data.getQueryParameter("channelSrp");
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(nde.G_CHANNELSRP);
            }
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra("channelSrp");
            }
        }
        return ntl.INSTANCE.a(str);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        jrz jrzVar = this.f;
        if (jrzVar == null || !this.e) {
            return;
        }
        if (this.g) {
            jrzVar.show();
        } else {
            jrzVar.hide();
        }
    }

    @Override // tb.jrw
    public jry b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jry) ipChange.ipc$dispatch("16b8346c", new Object[]{this}) : new jry.a().a(new jry.b() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jry.b
            public void a(jrz jrzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eff58d66", new Object[]{this, jrzVar});
                    return;
                }
                SearchDoorActivity.a(SearchDoorActivity.this, jrzVar);
                SearchDoorActivity.s(SearchDoorActivity.this);
            }
        }).a(new jry.c() { // from class: com.taobao.search.searchdoor.SearchDoorActivity.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jry.c
            public View a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("195fbaaa", new Object[]{this}) : SearchDoorActivity.r(SearchDoorActivity.this);
            }
        }).a();
    }

    @Override // com.taobao.search.sf.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        try {
            return AssistantContext.get().isAssistantEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.taobao.search.sf.c
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.a
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "connectivity") && r.bV()) {
            return getApplicationContext().getSystemService(str);
        }
        return super.getSystemService(str);
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c.a();
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void a(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf8a69d", new Object[]{this, eVar});
        } else {
            this.c.a(eVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void b(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172ccde", new Object[]{this, eVar});
        } else {
            this.c.b(eVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void closeViewDarkMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dae15", new Object[]{this, view});
        } else if (view == null || !r.cB()) {
        } else {
            ah.a(view);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.i.a(pVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i.a(str);
        }
    }

    @Override // tb.drb
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (isFinishing()) {
        } else {
            s();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || 136 != i || intent == null || this.f19325a == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("q");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f19325a.postEvent(nrk.a.a(stringExtra, ""));
    }

    @Override // tb.pop
    public boolean dR_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b2cc5bc", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // tb.tqn
    public tqp l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqp) ipChange.ipc$dispatch("63ad3100", new Object[]{this}) : this.j;
    }

    @Override // tb.tqn
    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // tb.tqn
    public tqo C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqo) ipChange.ipc$dispatch("2839b4aa", new Object[]{this}) : this.p;
    }

    @Override // tb.tqn
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        tqo tqoVar = this.p;
        if (tqoVar == null) {
            return;
        }
        tqoVar.d();
    }
}
