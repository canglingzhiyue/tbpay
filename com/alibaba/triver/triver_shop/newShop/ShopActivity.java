package com.alibaba.triver.triver_shop.newShop;

import android.app.ActionBar;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.adapter.ShopNavAdapter;
import com.alibaba.triver.triver_shop.extension.ShopCommonActivityLifeCycle;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.d;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.component.f;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.preload.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.a;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cei;
import tb.cen;
import tb.dlx;
import tb.fmg;
import tb.kge;
import tb.qzp;
import tb.rmx;

/* loaded from: classes3.dex */
public final class ShopActivity extends FragmentActivity implements com.alibaba.triver.triver_shop.newShop.data.c, d.a, dlx, fmg, qzp, rmx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final d Companion;
    public static final String RESTORE_KEY = "shopAcRestoreKey";

    /* renamed from: a  reason: collision with root package name */
    private boolean f3815a;
    private com.alibaba.triver.triver_shop.newShop.ext.e b;
    private com.alibaba.triver.triver_shop.newShop.data.d c;
    private com.alibaba.triver.triver_shop.newShop.event.broadcast.b d;
    private boolean e;
    private com.alibaba.triver.triver_shop.newShop.view.component.a g;
    private FrameLayout h;
    private Intent i;
    private long l;
    private Boolean m;
    private f n;
    private boolean o;
    private boolean f = true;
    private final Set<dlx> j = new LinkedHashSet();
    private final List<fmg> k = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Pair<Integer, Integer> b;
        public final /* synthetic */ String c;

        public b(Pair<Integer, Integer> pair, String str) {
            this.b = pair;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.view.component.a b = ShopActivity.b(ShopActivity.this);
            if (b == null) {
                return;
            }
            b.a(this.b.getFirst().intValue(), this.b.getSecond().intValue(), this.c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        public c(String str, JSONObject jSONObject) {
            this.b = str;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.view.component.a b = ShopActivity.b(ShopActivity.this);
            if (b == null) {
                return;
            }
            b.b(this.b, this.c);
        }
    }

    static {
        kge.a(-2099220506);
        kge.a(-810970374);
        kge.a(815071235);
        kge.a(2123619074);
        kge.a(1861127946);
        kge.a(514757849);
        kge.a(478546929);
        Companion = new d(null);
    }

    public static /* synthetic */ Object ipc$super(ShopActivity shopActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -842839078:
                return super.getIntent();
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
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

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public static final /* synthetic */ void a(ShopActivity shopActivity, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd071b73", new Object[]{shopActivity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            shopActivity.a(i, i2, i3, i4);
        }
    }

    public static final /* synthetic */ void a(ShopActivity shopActivity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b402a3a4", new Object[]{shopActivity, new Integer(i), new Boolean(z)});
        } else {
            shopActivity.a(i, z);
        }
    }

    public static final /* synthetic */ void a(ShopActivity shopActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08322f0", new Object[]{shopActivity, intent});
        } else {
            shopActivity.i = intent;
        }
    }

    public static final /* synthetic */ void a(ShopActivity shopActivity, Intent intent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe1b1d4", new Object[]{shopActivity, intent, new Long(j)});
        } else {
            shopActivity.a(intent, j);
        }
    }

    public static final /* synthetic */ void a(ShopActivity shopActivity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b7366", new Object[]{shopActivity, str, new Integer(i)});
        } else {
            shopActivity.a(str, i);
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.view.component.a b(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.component.a) ipChange.ipc$dispatch("15698dbd", new Object[]{shopActivity}) : shopActivity.g;
    }

    public static final /* synthetic */ Intent c(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("207e1b82", new Object[]{shopActivity}) : shopActivity.i;
    }

    public static final /* synthetic */ boolean c(ShopActivity shopActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de5f732", new Object[]{shopActivity, intent})).booleanValue() : shopActivity.a(intent);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        static {
            kge.a(-680905810);
        }

        public /* synthetic */ d(o oVar) {
            this();
        }

        private d() {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, newConfig});
            return;
        }
        q.d(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (com.alibaba.triver.triver_shop.f.INSTANCE.b() && this.c != null) {
            ShopActivity shopActivity = this;
            boolean z = !h.a().b((Context) shopActivity);
            if (z != this.f3815a) {
                com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
                if (dVar == null) {
                    q.b("shopDataParser");
                    throw null;
                } else {
                    l.a(shopActivity, com.alibaba.triver.triver_shop.newShop.ext.h.c(dVar, z));
                    return;
                }
            }
        }
        com.alibaba.triver.triver_shop.newShop.view.component.a aVar = this.g;
        if (aVar != null) {
            aVar.a(newConfig);
        }
        if (!cen.Companion.h() || !com.alibaba.triver.triver_shop.f.INSTANCE.a() || newConfig.orientation != 1) {
            return;
        }
        ceg.Companion.a("ggg ShopActivity onConfigurationChanged ORIENTATION_PORTRAIT");
        this.o = true;
        com.alibaba.triver.triver_shop.preload.f.INSTANCE.b(this.l);
        if (this.i != null) {
            com.alibaba.triver.triver_shop.preload.f.INSTANCE.a(this.l, new e());
        }
        getIntent().addFlags(65536);
        startActivity(getIntent());
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopActivity$onConfigurationChanged$3(this));
    }

    /* loaded from: classes3.dex */
    public static final class e implements f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            } else {
                q.d(intent, "intent");
            }
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            } else {
                q.d(intent, "intent");
            }
        }

        public e() {
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public Intent a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this}) : ShopActivity.c(ShopActivity.this);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ShopActivity shopActivity = this;
        boolean d2 = com.alibaba.triver.triver_shop.newShop.ext.b.d(shopActivity);
        if (com.alibaba.triver.triver_shop.newShop.ext.b.e(shopActivity)) {
            this.f3815a = !h.a().b((Context) shopActivity);
        }
        ceg.Companion.b(q.a("isPad : ", (Object) Boolean.valueOf(d2)));
        ShopActivity shopActivity2 = this;
        com.taobao.android.autosize.f.a((Activity) shopActivity2);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            ceg.Companion.b("activity recycle by system , refresh page");
            Intent intent = (Intent) getIntent().clone();
            long j = bundle.getLong(RESTORE_KEY, 0L);
            if (j == 0 || !com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.c().containsKey(Long.valueOf(j))) {
                ceg.Companion.b("restore data not exist, restore failed");
                finish();
                return;
            }
            intent.putExtra(RESTORE_KEY, bundle.getLong(RESTORE_KEY, 0L));
            intent.putExtra(g.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
            intent.setClass(shopActivity, ShopActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.h = new FrameLayout(shopActivity);
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            q.b("containerRootView");
            throw null;
        }
        setContentView(frameLayout);
        boolean booleanExtra = getIntent().getBooleanExtra(g.KEY_ENABLE_DIRECTLY_PUSH_AC, false);
        long longExtra = getIntent().getLongExtra(RESTORE_KEY, 0L);
        Intent remove = com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.c().remove(Long.valueOf(longExtra));
        if (booleanExtra) {
            long longExtra2 = getIntent().getLongExtra(RVConstants.EXTRA_START_TOKEN, longExtra);
            if (longExtra2 == 0) {
                ceg.Companion.b("startToken == 0 ,finish");
                finish();
            }
            this.l = longExtra2;
            if (com.alibaba.triver.triver_shop.newShop.ext.h.b(getIntent().getStringExtra(g.KEY_FIRST_IN_SHOP_URL)) && cen.Companion.as()) {
                ceg.Companion.b("startPreload xsdWeex");
                com.alibaba.triver.triver_shop.shop2023.c.Companion.a(shopActivity2);
            }
            Intent a2 = com.alibaba.triver.triver_shop.preload.f.INSTANCE.a(longExtra2);
            if (a2 == null && remove != null) {
                a2 = remove;
            }
            ceg.Companion.a(q.a("ggg ShopActivity onCreate intentByStartToken ", (Object) a2));
            if (a2 == null) {
                com.alibaba.triver.triver_shop.preload.f.INSTANCE.a(longExtra2, new a(currentTimeMillis));
                return;
            }
            Log.e(ShopView.SP_NAMESPACE, "has token data");
            this.i = a2;
            if (a(a2)) {
                return;
            }
            a(a2, currentTimeMillis);
            return;
        }
        a(getIntent(), currentTimeMillis);
    }

    /* loaded from: classes3.dex */
    public static final class a implements f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public Intent a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this});
            }
            return null;
        }

        public a(long j) {
            this.b = j;
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
                return;
            }
            q.d(intent, "intent");
            Log.e(ShopView.SP_NAMESPACE, "onDataGet token data");
            ShopActivity.a(ShopActivity.this, intent);
            ShopActivity.a(ShopActivity.this, intent, this.b);
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
                return;
            }
            q.d(intent, "intent");
            if (ShopActivity.c(ShopActivity.this, intent)) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopActivity$onCreate$1$onFailed$1(ShopActivity.this), 300L);
        }
    }

    private final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            z = extras.getBoolean(a.C0430a.SHOW_ERROR, false);
        }
        if (z) {
            FrameLayout frameLayout = this.h;
            if (frameLayout == null) {
                q.b("containerRootView");
                throw null;
            }
            frameLayout.removeAllViews();
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 == null) {
                q.b("containerRootView");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout2, com.alibaba.triver.triver_shop.newShop.ext.h.b(this));
        }
        return z;
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        Intent intent = this.i;
        if (intent != null) {
            return intent;
        }
        Intent intent2 = super.getIntent();
        q.b(intent2, "super.getIntent()");
        return intent2;
    }

    private final void a(Intent intent, long j) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864bf3f", new Object[]{this, intent, new Long(j)});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            q.b("containerRootView");
            throw null;
        }
        frameLayout.removeAllViews();
        long currentTimeMillis = System.currentTimeMillis();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        com.alibaba.triver.triver_shop.f.INSTANCE.c().a((com.alibaba.triver.triver_shop.newShop.manager.g<Activity>) this);
        if (com.alibaba.triver.triver_shop.newShop.ext.h.a(this, intent)) {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopActivity$continueActivityOnCreate$1(this), 500L);
        } else if (!c(intent)) {
        } else {
            boolean aA = cen.Companion.aA();
            try {
                Result.a aVar = Result.Companion;
                this.f = cen.Companion.H();
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
            Lifecycle lifecycle = getLifecycle();
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
            if (dVar == null) {
                q.b("shopDataParser");
                throw null;
            }
            lifecycle.addObserver(new ShopCommonActivityLifeCycle(dVar));
            com.alibaba.triver.triver_shop.newShop.view.component.a f = f();
            com.alibaba.triver.triver_shop.newShop.view.component.f aD = f.aD();
            if (aD != null && aA) {
                this.n = aD;
                g();
            }
            a(f);
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 == null) {
                q.b("containerRootView");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout2, f.x());
            this.g = f;
            if (!aA) {
                g();
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.a("startPoint process", new ShopActivity$continueActivityOnCreate$4(this, currentTimeMillis, j, intent));
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopActivity$continueActivityOnCreate$5(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopActivity$continueActivityOnCreate$6(this), 2000L);
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        e();
        i();
    }

    private final void i() {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!cen.Companion.at()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
            if (dVar2 == null) {
                q.b("shopDataParser");
                throw null;
            } else if (q.a((Object) dVar2.as(), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.XSD_SHOP)) {
            } else {
                try {
                    Result.a aVar = Result.Companion;
                    dVar = this.c;
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
                }
                if (dVar == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.c;
                if (dVar3 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                int p = dVar3.p();
                com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.c;
                if (dVar4 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.data.g e2 = dVar.e(p, dVar4.q());
                if (e2 != null) {
                    if (!e2.n()) {
                        return;
                    }
                    e2.a(this.n);
                    com.alibaba.triver.triver_shop.newShop.view.a aVar3 = new com.alibaba.triver.triver_shop.newShop.view.a(this, e2);
                    aVar3.c();
                    com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.c;
                    if (dVar5 == null) {
                        q.b("shopDataParser");
                        throw null;
                    }
                    dVar5.bt().a(aVar3);
                }
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                if (m2374exceptionOrNullimpl == null) {
                    return;
                }
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
        }
    }

    private final com.alibaba.triver.triver_shop.newShop.view.component.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.view.component.a) ipChange.ipc$dispatch("44928758", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        String as = dVar.as();
        if (as == null) {
            ceg.Companion.b("industry shop type is null , use brandFlagshipShop");
            as = com.alibaba.triver.triver_shop.newShop.manager.e.FLAG_SHIP_SHOP;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.c a2 = com.alibaba.triver.triver_shop.newShop.manager.e.Companion.a(as);
        if (a2 == null) {
            ceg.Companion.b(q.a("shopComponent not found , industry shop type : ", (Object) as));
            a2 = new com.alibaba.triver.triver_shop.newShop.view.component.c();
        }
        ceg.Companion.b(q.a("ggg component ", (Object) a2));
        return a2;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object m2371constructorimpl;
        Object m2371constructorimpl2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ceg.Companion.b("shopActivity onResume");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        try {
            Result.a aVar = Result.Companion;
            com.alibaba.triver.triver_shop.newShop.view.component.a aVar2 = this.g;
            if (aVar2 != null) {
                z = aVar2.P();
            }
            booleanRef.element = z;
            if (!booleanRef.element) {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        try {
            Result.a aVar4 = Result.Companion;
            if (!this.e && this.f) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(getIntent(), this);
                this.e = true;
            }
            m2371constructorimpl2 = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th2) {
            Result.a aVar5 = Result.Companion;
            m2371constructorimpl2 = Result.m2371constructorimpl(i.a(th2));
        }
        Throwable m2374exceptionOrNullimpl2 = Result.m2374exceptionOrNullimpl(m2371constructorimpl2);
        if (m2374exceptionOrNullimpl2 != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl2);
        }
        com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
        if (bVar != null) {
            if (bVar != null) {
                bVar.d();
                com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar2 = this.d;
                if (bVar2 == null) {
                    q.b("shopBroadCastDelegate");
                    throw null;
                }
                bVar2.c();
            } else {
                q.b("shopBroadCastDelegate");
                throw null;
            }
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopActivity$onResume$4(this, booleanRef));
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopActivity$onResume$5(this));
        super.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ceg.Companion.b("shop activity onPause");
        com.alibaba.triver.triver_shop.newShop.view.component.a aVar = this.g;
        if (aVar != null) {
            z = aVar.O();
        }
        if (!z) {
            try {
                Result.a aVar2 = Result.Companion;
                h();
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar3 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object m2371constructorimpl;
        Object m2371constructorimpl2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.alibaba.triver.triver_shop.f.INSTANCE.c().b((com.alibaba.triver.triver_shop.newShop.manager.g<Activity>) this);
        try {
            Result.a aVar = Result.Companion;
            if (this.d != null) {
                com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
                if (bVar == null) {
                    q.b("shopBroadCastDelegate");
                    throw null;
                }
                bVar.a();
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        try {
            Result.a aVar3 = Result.Companion;
            com.alibaba.triver.triver_shop.newShop.view.component.a aVar4 = this.g;
            if (aVar4 != null) {
                aVar4.R();
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th2) {
            Result.a aVar5 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th2));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        try {
            Result.a aVar6 = Result.Companion;
            if (!this.o) {
                com.alibaba.triver.triver_shop.preload.f.INSTANCE.b(this.l);
            }
            m2371constructorimpl2 = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th3) {
            Result.a aVar7 = Result.Companion;
            m2371constructorimpl2 = Result.m2371constructorimpl(i.a(th3));
        }
        Throwable m2374exceptionOrNullimpl2 = Result.m2374exceptionOrNullimpl(m2371constructorimpl2);
        if (m2374exceptionOrNullimpl2 == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl2);
    }

    private final boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue();
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        cei ceiVar = new cei();
        this.b = new com.alibaba.triver.triver_shop.newShop.ext.e(this);
        long a2 = ceiVar.a();
        ceiVar.b();
        ShopActivity shopActivity = this;
        if (intent == null) {
            intent = getIntent();
        }
        com.alibaba.triver.triver_shop.newShop.data.d a3 = com.alibaba.triver.triver_shop.newShop.ext.h.a(shopActivity, intent, new ShopActivity$init$shopData$1(this));
        if (a3 == null) {
            com.alibaba.triver.triver_shop.newShop.ext.e eVar = this.b;
            if (eVar != null) {
                eVar.d();
                return false;
            }
            q.b("shopDXEngine");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.e eVar2 = this.b;
        if (eVar2 == null) {
            q.b("shopDXEngine");
            throw null;
        }
        eVar2.a(a3);
        this.c = a3;
        a3.b(g.KEY_INIT_DX_ENGINE_COST, Long.valueOf(a2));
        a3.b(g.KEY_PARSE_SHOP_DATA_COST, Long.valueOf(ceiVar.a()));
        if (p.a((Iterable<? extends String>) ShopNavAdapter.Companion.b(), a3.as())) {
            a3.c(true);
            com.alibaba.triver.triver_shop.newShop.ext.e eVar3 = this.b;
            if (eVar3 == null) {
                q.b("shopDXEngine");
                throw null;
            }
            eVar3.c().a(true);
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
            if (dVar == null) {
                q.b("shopDataParser");
                throw null;
            }
            dVar.b(true);
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
        if (dVar2 != null) {
            this.d = new com.alibaba.triver.triver_shop.newShop.event.broadcast.b(shopActivity, dVar2, this);
            com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.c;
            if (dVar3 == null) {
                q.b("shopDataParser");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
            if (bVar != null) {
                dVar3.a((com.alibaba.triver.triver_shop.newShop.event.broadcast.a) bVar);
                return true;
            }
            q.b("shopBroadCastDelegate");
            throw null;
        }
        q.b("shopDataParser");
        throw null;
    }

    private final void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("parseData error : " + ((Object) str) + " , code : " + i);
    }

    private final void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
        if (bVar == null) {
            q.b("shopBroadCastDelegate");
            throw null;
        }
        bVar.b(i3, i4);
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopActivity$onPageChanged$1(this, i, i2));
    }

    private final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!z) {
            com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
            if (bVar != null) {
                bVar.a(i);
            } else {
                q.b("shopBroadCastDelegate");
                throw null;
            }
        } else {
            com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar2 = this.d;
            if (bVar2 != null) {
                bVar2.b(i);
            } else {
                q.b("shopBroadCastDelegate");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public com.alibaba.triver.triver_shop.newShop.data.d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("820aec79", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
        if (dVar == null) {
            return null;
        }
        if (dVar != null) {
            return dVar;
        }
        q.b("shopDataParser");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            List a2 = n.a((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
            if (a2.size() < 3) {
                return;
            }
            int a3 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) a2.get(0));
            int a4 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) (q.a((Object) "0", a2.get(2)) ? a2.get(1) : a2.get(2)));
            ceg.a aVar = ceg.Companion;
            aVar.a("onPageReady : mainTab = " + a3 + " subTab = " + a4);
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
            if (dVar == null) {
                q.b("shopDataParser");
                throw null;
            }
            if (a3 == dVar.o()) {
                com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
                if (dVar2 == null) {
                    q.b("shopDataParser");
                    throw null;
                } else if (a4 == dVar2.n()) {
                    com.alibaba.triver.triver_shop.newShop.event.broadcast.d a5 = com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a((Context) this);
                    com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.c;
                    if (dVar3 != null) {
                        a5.a(a3, a4, dVar3.T());
                        return;
                    } else {
                        q.b("shopDataParser");
                        throw null;
                    }
                }
            }
            ceg.Companion.a("onPageRead : but mainIndex and subIndex not match");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a(z, jSONObject);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
            if (dVar == null) {
                q.b("shopDataParser");
                throw null;
            }
            dVar.a(str, str2);
            com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
            if (dVar2 == null) {
                q.b("shopDataParser");
                throw null;
            } else {
                runOnUiThread(new b(com.alibaba.triver.triver_shop.newShop.ext.h.a(str, dVar2.I()), str));
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void b_(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3220692c", new Object[]{this, jSONObject});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        if (dVar != null) {
            dVar.A().a(jSONObject);
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void b_(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67489a2", new Object[]{this, str, jSONObject});
        } else {
            runOnUiThread(new c(str, jSONObject));
        }
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
        if (dVar != null) {
            if (dVar != null) {
                if (dVar.s()) {
                    m.b(this, "is2022Style", "true");
                }
                ShopActivity shopActivity = this;
                com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
                if (dVar2 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                m.b(shopActivity, "identityCode", dVar2.ba());
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.c;
                if (dVar3 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                String K = dVar3.K();
                if (com.alibaba.triver.triver_shop.newShop.ext.i.a(K)) {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.c;
                    if (dVar4 != null) {
                        m.a(shopActivity, dVar4.s() ? "a2141.b37071050" : "a2141.7631671", "Page_Shop_All_Item");
                        Pair[] pairArr = new Pair[2];
                        com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.c;
                        if (dVar5 == null) {
                            q.b("shopDataParser");
                            throw null;
                        }
                        pairArr[0] = kotlin.j.a("shop_id", dVar5.T());
                        com.alibaba.triver.triver_shop.newShop.data.d dVar6 = this.c;
                        if (dVar6 != null) {
                            pairArr[1] = kotlin.j.a("seller_id", dVar6.U());
                            m.a(shopActivity, ai.b(pairArr));
                        } else {
                            q.b("shopDataParser");
                            throw null;
                        }
                    } else {
                        q.b("shopDataParser");
                        throw null;
                    }
                }
                if (com.alibaba.triver.triver_shop.newShop.ext.i.b(K)) {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar7 = this.c;
                    if (dVar7 != null) {
                        m.a(shopActivity, dVar7.s() ? ag.SPM_TAOLIVE_WATCH_4_SHOPCARD : "a2141.7631565", ShopConstants.PAGE_SHOP);
                        Pair[] pairArr2 = new Pair[2];
                        com.alibaba.triver.triver_shop.newShop.data.d dVar8 = this.c;
                        if (dVar8 == null) {
                            q.b("shopDataParser");
                            throw null;
                        }
                        pairArr2[0] = kotlin.j.a("shop_id", dVar8.T());
                        com.alibaba.triver.triver_shop.newShop.data.d dVar9 = this.c;
                        if (dVar9 != null) {
                            pairArr2[1] = kotlin.j.a("seller_id", dVar9.U());
                            m.a(shopActivity, ai.b(pairArr2));
                        } else {
                            q.b("shopDataParser");
                            throw null;
                        }
                    } else {
                        q.b("shopDataParser");
                        throw null;
                    }
                }
                com.alibaba.triver.triver_shop.newShop.data.d dVar10 = this.c;
                if (dVar10 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                m.a(shopActivity, dVar10);
            } else {
                q.b("shopDataParser");
                throw null;
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        com.alibaba.triver.triver_shop.newShop.event.broadcast.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        if (bVar != null) {
            bVar.b();
        } else {
            q.b("shopBroadCastDelegate");
            throw null;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        try {
            Result.a aVar = Result.Companion;
            dVar = this.c;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar.H();
        m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        try {
            Result.a aVar = Result.Companion;
            dVar = this.c;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar.e(i);
        m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.a aVar = this.g;
        if (aVar != null && !aVar.z()) {
            z = true;
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.c
    public com.alibaba.triver.triver_shop.newShop.data.d r_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("65696f45", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
        if (dVar == null) {
            return null;
        }
        if (dVar != null) {
            return dVar;
        }
        q.b("shopDataParser");
        throw null;
    }

    @Override // tb.rmx
    public void a(fmg fmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d31258", new Object[]{this, fmgVar});
        } else if (fmgVar == null) {
        } else {
            this.k.add(fmgVar);
        }
    }

    @Override // tb.fmg
    public void b(String state, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, state, jSONObject});
            return;
        }
        q.d(state, "state");
        for (fmg fmgVar : this.k) {
            fmgVar.b(state, jSONObject);
        }
    }

    @Override // tb.qzp
    public void a(dlx dlxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56303e8", new Object[]{this, dlxVar});
        } else if (dlxVar == null) {
        } else {
            this.j.add(dlxVar);
        }
    }

    @Override // tb.dlx
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        for (dlx dlxVar : this.j) {
            dlxVar.a(jSONObject);
        }
    }

    @Override // tb.dlx
    public void a(String state, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, state, jSONObject});
            return;
        }
        q.d(state, "state");
        for (dlx dlxVar : this.j) {
            dlxVar.a(state, jSONObject);
        }
    }

    @Override // android.app.Activity
    public boolean isInMultiWindowMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b86a5e8", new Object[]{this})).booleanValue();
        }
        if (this.m == null) {
            this.m = Boolean.valueOf(super.isInMultiWindowMode());
        }
        Boolean bool = this.m;
        q.a(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        super.onMultiWindowModeChanged(z, configuration);
        this.m = Boolean.valueOf(z);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, outState});
            return;
        }
        q.d(outState, "outState");
        super.onSaveInstanceState(outState);
        long currentTimeMillis = System.currentTimeMillis();
        outState.putLong(RESTORE_KEY, currentTimeMillis);
        com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.c().put(Long.valueOf(currentTimeMillis), getIntent());
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("shopBundleId")) {
            z = true;
        }
        if (!z || (dVar = this.c) == null) {
            return;
        }
        if (dVar != null) {
            Bundle j = dVar.j();
            if (j == null) {
                return;
            }
            Intent intent = (Intent) getIntent().clone();
            intent.putExtras(j);
            j.putAll(getIntent().getExtras());
            intent.putExtra(g.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
            com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.c().put(Long.valueOf(currentTimeMillis), intent);
            return;
        }
        q.b("shopDataParser");
        throw null;
    }

    private final void e() {
        Object m2371constructorimpl;
        ShopWrapWebView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            if (!cen.Companion.z()) {
                ceg.Companion.b("tryTopPreloadWebShopIndex disable by orange");
            } else {
                com.alibaba.triver.triver_shop.newShop.data.d dVar = this.c;
                if (dVar == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.c;
                if (dVar2 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                int p = dVar2.p();
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.c;
                if (dVar3 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.data.g e2 = dVar.e(p, dVar3.q());
                if (e2 != null && e2.o()) {
                    e2.a(this.n);
                    if (e2.m() == NativeShopRenderContainerType.TYPE_H5 && (a2 = com.alibaba.triver.triver_shop.preload.b.INSTANCE.a()) != null) {
                        a2.printPreloadStatus();
                        if (a2.getAlreadyPreloadPageFinished() && !a2.getAlreadyInjectOnNShopPreloadResume()) {
                            com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.c;
                            if (dVar4 == null) {
                                q.b("shopDataParser");
                                throw null;
                            }
                            a2.setShopId(dVar4.T());
                            com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.c;
                            if (dVar5 == null) {
                                q.b("shopDataParser");
                                throw null;
                            }
                            a2.setShopData(dVar5);
                            a2.setOuterCtx(this);
                            a2.setCurrentPageName(e2.f());
                            a2.startRenderByRealUrl(e2.h());
                            ceg.Companion.b("try to preload shopIndex web early");
                        } else {
                            ceg.Companion.b("try to preload shopIndex web early , but not finished");
                        }
                        com.alibaba.triver.triver_shop.newShop.data.d dVar6 = this.c;
                        if (dVar6 == null) {
                            q.b("shopDataParser");
                            throw null;
                        }
                        dVar6.a(a2);
                    }
                }
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.a aVar) {
        Object m2371constructorimpl;
        ShopActivity shopActivity;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400d9913", new Object[]{this, aVar});
            return;
        }
        try {
            Result.a aVar2 = Result.Companion;
            shopActivity = this;
            dVar = this.c;
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.e eVar = this.b;
        if (eVar == null) {
            q.b("shopDXEngine");
            throw null;
        }
        aVar.a(shopActivity, dVar, eVar);
        m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        aVar.a(new ShopActivity$initComponent$2(this));
        aVar.a(new ShopActivity$initComponent$3(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
    public void a(JSONArray performanceArray) {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, performanceArray});
            return;
        }
        q.d(performanceArray, "performanceArray");
        try {
            Result.a aVar = Result.Companion;
            dVar = this.c;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar.b(performanceArray);
        m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
