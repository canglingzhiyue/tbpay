package com.taobao.android.detail.core.detail.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.aura.g;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity;
import com.taobao.android.detail.core.open.DetailBusinessDetector;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.perf.PerfTimelineFragment;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.e;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.standard.widget.d;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.o;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.core.utils.t;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.utils.bb;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.monitor.procedure.v;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.i;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arc;
import tb.bay;
import tb.dwk;
import tb.dya;
import tb.dyb;
import tb.dyk;
import tb.dyo;
import tb.ear;
import tb.eaz;
import tb.ebx;
import tb.ecb;
import tb.ecd;
import tb.ecg;
import tb.ecn;
import tb.ecq;
import tb.ecu;
import tb.ehs;
import tb.ehu;
import tb.eip;
import tb.eiq;
import tb.ejh;
import tb.elq;
import tb.elr;
import tb.emj;
import tb.emu;
import tb.emx;
import tb.epe;
import tb.epo;
import tb.eps;
import tb.ept;
import tb.epu;
import tb.eqb;
import tb.eqc;
import tb.gbg;
import tb.god;
import tb.ieg;
import tb.iuy;
import tb.kge;
import tb.lcp;
import tb.lcq;
import tb.rjq;
import tb.rly;

/* loaded from: classes4.dex */
public abstract class DetailCoreActivity extends TaobaoBaseActivity implements com.taobao.android.detail.core.perf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_ITEM_ID = "detail_item_id";
    public static final String KEY_ID = "id";
    public static final String KEY_ITEM_ID = "item_id";
    public static final String PAGE_NAME = "Page_Detail";
    public static final String SKU_ID = "skuId";
    public static final String TAG = "DetailCoreActivity";
    private static boolean z;
    private String B;
    private Boolean C;
    private JSONObject D;
    private com.alibaba.android.spindle.stage.b G;
    private volatile boolean L;
    private String O;
    private String P;
    public boolean X;

    /* renamed from: a  reason: collision with root package name */
    public ebx f9411a;
    public dya b;
    public boolean c;
    public bd d;
    public com.taobao.android.detail.datasdk.model.datamodel.node.c e;
    public long f;
    public String g;
    private ViewGroup r;
    private DetailCoreActivity t;
    private ImageView u;
    private TUrlImageView v;
    private ImageView w;
    private ImageView x;
    private long y;
    private Map<String, Object> A = new HashMap();
    private int E = -1;
    private final com.taobao.android.detail.core.ultronengine.c F = new com.taobao.android.detail.core.ultronengine.c();
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    public String h = "uniqueId" + System.currentTimeMillis();
    private boolean M = f.a();
    private ArrayDeque<Runnable> N = new ArrayDeque<>();
    private ejh Q = new ejh();

    public static /* synthetic */ Object ipc$super(DetailCoreActivity detailCoreActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1398848845:
                super.onPostResume();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
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
            case 1281559479:
                super.onRestart();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1788467647:
                return new Boolean(super.a((Message) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public dwk G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwk) ipChange.ipc$dispatch("46f91a40", new Object[]{this});
        }
        return null;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        }
    }

    public void a(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1c04a", new Object[]{this, jSONObject, view});
        }
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        }
    }

    public abstract void a(epe epeVar);

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    public void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public abstract void q();

    public abstract ehu r();

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        }
    }

    public static /* synthetic */ DetailCoreActivity a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("f68be23e", new Object[]{detailCoreActivity}) : detailCoreActivity.t;
    }

    public static /* synthetic */ ImageView b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("4a67c7fe", new Object[]{detailCoreActivity}) : detailCoreActivity.x;
    }

    public static /* synthetic */ ImageView c(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("7a1efbff", new Object[]{detailCoreActivity}) : detailCoreActivity.u;
    }

    static {
        kge.a(-175816858);
        kge.a(-1534847633);
        z = true;
    }

    public ejh aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ejh) ipChange.ipc$dispatch("21b92a46", new Object[]{this}) : this.Q;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.B;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.B = str;
        }
    }

    public boolean K_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("854bb3ff", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
            return;
        }
        Boolean bool = this.C;
        if (bool != null && !bool.booleanValue()) {
            return;
        }
        this.C = Boolean.valueOf(z2);
    }

    public JSONObject L_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2dd64fba", new Object[]{this}) : this.D;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.D = jSONObject;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.E;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.E = i;
        }
    }

    public DetailCoreActivity() {
        this.y = 0L;
        this.y = System.currentTimeMillis();
        ept.a();
        this.G = new com.alibaba.android.spindle.stage.b("Page_Detail");
    }

    public void a(Bundle bundle, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216c10e8", new Object[]{this, bundle, new Boolean(z2)});
        } else if (!z2) {
        } else {
            super.onCreate(null);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        i.d("DetailCoreActivity", "finalize");
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        i.d(j.a("DetailCoreActivity"), "onCreate start");
        emu.a("com.taobao.android.detail.core.detail.activity.DetailCoreActivity");
        g.f2141a = false;
        this.F.a(com.taobao.android.detail.core.ultronengine.c.STAGE_BEFORE_MTOP);
        this.F.a(com.taobao.android.detail.core.ultronengine.c.STAGE_PAGE_TOTAL);
        i.d(j.a("DetailCoreActivity"), "onCreate " + z);
        super.onCreate(null);
        i.d(j.a("DetailCoreActivity"), "onCreate " + z);
        this.t = this;
        Rect a2 = com.taobao.android.autosize.i.a(this);
        iuy.f29328a = a2.width();
        iuy.d = a2.width();
        iuy.c = a2.width();
        iuy.b = a2.height();
        if (s.a()) {
            boolean b = com.taobao.android.autosize.h.a().b((Context) this);
            s.a(s.d() && !b);
            if (!b && !s.h()) {
                iuy.d /= 2;
            }
            if (s.c() && !s.h()) {
                iuy.c = lcp.a(this);
            }
        } else {
            com.taobao.android.autosize.f.a((Activity) this);
        }
        g();
        rly.a().a(this);
        this.f9411a = new ebx().a(this, this.q);
        this.A.put("itemId", this.f9411a.f27180a);
        if (StringUtils.isEmpty(t.a(this))) {
            if (e.b(this.f9411a.q)) {
                overridePendingTransition(R.anim.detail_nav_enter_anim, R.anim.detail_nav_exit_anim);
            } else if (e.a(this.f9411a.q, this.f9411a.f27180a, true)) {
                overridePendingTransition(R.anim.detail_enter_anim, R.anim.detail_exit_anim);
            }
        }
        epu.a("stage", WXExceptionConfig.KEY_BIZ, i.b.MEASURE_ONCREATE, null, this.A);
        if (this.f9411a.x != 0 && this.f9411a.v != 0) {
            eqc.a(this.t, "navRouter", this.f9411a.v, this.f9411a.x - this.f9411a.v, "路由时间");
            eqc.a(this.t, "activityPrepare", this.f9411a.x, this.y - this.f9411a.x, "Activity启动时间");
        }
        Uri data = getIntent().getData();
        if (data != null && (hVar = (h) n.a(this)) != null && hVar.h() != null) {
            DetailBusinessDetector h = hVar.h();
            DetailBusinessDetector.DetectResult detect = h.detect(data.toString(), this);
            if (detect == DetailBusinessDetector.DetectResult.yes_native) {
                h.reCustomizeDetail(hVar, this);
            } else if (detect == DetailBusinessDetector.DetectResult.yes_h5) {
                com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailCoreActivity"), BTags.DowngradeTag), "onCreate DetectResult.yes_h5 finish:" + z);
                finish();
                return;
            }
        }
        ear.c();
        this.f9411a.a(ecq.a());
        com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "itemId " + this.f9411a.f27180a);
        this.F.b(com.taobao.android.detail.core.ultronengine.c.STAGE_BEFORE_MTOP);
        this.F.a("mtopTime");
        this.d = eaz.e();
        this.b = new dya(this, this.f9411a);
        if (e.b(this.f9411a.q) || e.a(this.f9411a.q, this.f9411a.f27180a)) {
            com.alibaba.android.ultron.engine.utils.g.a(eiq.f);
            com.taobao.android.detail.core.utils.i.c(l.a("DetailCoreActivity"), "详情页面创建 奥创解析优化标识：" + eiq.f);
            this.b.a(new dyb(this));
        }
        if (N() && O()) {
            P();
            finish();
        } else {
            this.b.a(true);
        }
        a();
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "onCreate end");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f9411a.d()) {
            ecb.a(this);
        }
        if (StringUtils.isEmpty(this.f9411a.f27180a)) {
            return;
        }
        eps.a((Activity) this, (String) null, this.f9411a.c());
        HashMap hashMap = new HashMap();
        hashMap.put("queryParams", this.f9411a);
        ecg.b(this, hashMap);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        epo.g().a();
        long currentTimeMillis2 = System.currentTimeMillis();
        String a2 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a2, "login refresh cookies " + (currentTimeMillis2 - currentTimeMillis));
        long currentTimeMillis3 = System.currentTimeMillis();
        com.taobao.android.detail.core.perf.c.a(this, "contentView");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (eip.k) {
            setContentView(R.layout.x_detail_activity_no_surfaceview_opt);
        } else {
            setContentView(R.layout.x_detail_activity_no_surfaceview);
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        com.taobao.android.detail.core.perf.c.b(this, "contentView");
        com.taobao.android.detail.core.utils.h.b(this.t, uptimeMillis2 - uptimeMillis);
        long currentTimeMillis4 = System.currentTimeMillis();
        String a3 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a3, "set content view " + (currentTimeMillis4 - currentTimeMillis3));
        long currentTimeMillis5 = System.currentTimeMillis();
        q();
        long currentTimeMillis6 = System.currentTimeMillis();
        String a4 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a4, "loadDefaultActionBar " + (currentTimeMillis6 - currentTimeMillis5));
        this.l.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.activity.DetailCoreActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(DetailCoreActivity.a(DetailCoreActivity.this));
                bb.b(DetailCoreActivity.a(DetailCoreActivity.this));
                DetailCoreActivity detailCoreActivity = DetailCoreActivity.this;
                ecd.a(detailCoreActivity, detailCoreActivity.f9411a);
            }
        }, 300L);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "================  hide mask");
        final View o = this.t.o();
        if (o == null || o.getParent() == null) {
            return;
        }
        if (this.l == null || this.t.y() == null || this.t.y().f() == null || !this.t.y().f().a()) {
            ((ViewGroup) o.getParent()).removeView(o);
            return;
        }
        TUrlImageView tUrlImageView = this.v;
        if (tUrlImageView != null && !StringUtils.isEmpty(tUrlImageView.getImageUrl())) {
            this.l.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.activity.DetailCoreActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view = o;
                    if (view == null || view.getParent() == null) {
                        return;
                    }
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(200L);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setInterpolator(new AccelerateInterpolator());
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.core.detail.activity.DetailCoreActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                            } else {
                                ((ViewGroup) o.getParent()).removeView(o);
                            }
                        }
                    });
                    o.startAnimation(alphaAnimation);
                    if (!com.taobao.android.detail.core.utils.e.c()) {
                        return;
                    }
                    if (DetailCoreActivity.b(DetailCoreActivity.this) != null) {
                        DetailCoreActivity.b(DetailCoreActivity.this).setVisibility(4);
                    }
                    if (DetailCoreActivity.c(DetailCoreActivity.this) == null) {
                        return;
                    }
                    DetailCoreActivity.c(DetailCoreActivity.this).setVisibility(4);
                }
            });
        } else {
            ((ViewGroup) o.getParent()).removeView(o);
        }
        this.H = true;
    }

    private void a(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!com.taobao.android.detail.core.utils.e.c()) {
        } else {
            this.u = (ImageView) view.findViewById(R.id.tb_detail_preset_desktop);
            this.v = (TUrlImageView) view.findViewById(R.id.tb_detail_preset_img);
            this.w = (ImageView) view.findViewById(R.id.tb_detail_preset_search_bar);
            this.x = (ImageView) view.findViewById(R.id.tb_detail_preset_bottom_bar);
            String str2 = null;
            try {
                str = getIntent().getData().getQueryParameter("prefetchImg");
                try {
                    str2 = getIntent().getData().getQueryParameter("prefetchImgRatio");
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str = null;
            }
            float f = ("4:3".equals(str2) || com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO.equals(str2)) ? 1.3333334f : 1.0f;
            TLog.loge("DetailCoreActivity", "遮罩图片高宽比=" + f);
            if (s.a()) {
                this.w.setVisibility(8);
            } else {
                ViewGroup viewGroup = (ViewGroup) this.u.getParent();
                if (f == 1.0f) {
                    ((LinearLayout.LayoutParams) this.w.getLayoutParams()).topMargin = Build.VERSION.SDK_INT >= 19 ? SystemBarDecorator.getStatusBarHeight(this.t) : 0;
                    this.w.setVisibility(0);
                } else {
                    viewGroup.removeView(this.w);
                }
            }
            ((LinearLayout.LayoutParams) this.v.getLayoutParams()).height = (int) (this.t.getResources().getDisplayMetrics().widthPixels * f);
            if (!StringUtils.isEmpty(str) && !s.a()) {
                TLog.logw("DetailCoreActivity", "load mask img = " + str);
                this.v.setStrategyConfig(ImageStrategyConfig.a("detail", 15));
                PhenixOptions phenixOptions = new PhenixOptions();
                phenixOptions.fuzzyMatchCache(true);
                this.v.setPhenixOptions(phenixOptions);
                this.v.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.core.detail.activity.DetailCoreActivity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        TLog.logw("DetailCoreActivity", "mask img load success");
                        return false;
                    }
                });
                this.v.setImageUrl(str);
            }
            c();
            ImageView imageView = this.u;
            if (imageView == null) {
                return;
            }
            imageView.setImageDrawable(new d());
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        ebx ebxVar = this.f9411a;
        return ebxVar != null && e.a(ebxVar.q, this.f9411a.f27180a);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        ebx ebxVar = this.f9411a;
        return ebxVar != null && e.b(ebxVar.q);
    }

    public boolean m() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        if (k() && (cVar = this.e) != null && cVar.f10055a != null) {
            return this.e.f10055a.n();
        }
        return false;
    }

    public boolean aZ() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[]{this})).booleanValue();
        }
        if (god.d && (cVar = this.e) != null && cVar.f10055a != null && this.e.f10055a.a() != null) {
            return this.e.f10055a.a().containsKey(ieg.KEY_FLOATING_BARRAGE);
        }
        return false;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!k()) {
        } else {
            ViewGroup p = p();
            if (p != null && p.getChildCount() > 0) {
                p.removeAllViews();
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.bottombar_layout);
            if (relativeLayout != null && relativeLayout.getChildCount() > 0) {
                relativeLayout.removeAllViews();
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.float_view_layout);
            if (frameLayout == null || frameLayout.getChildCount() <= 0) {
                return;
            }
            frameLayout.removeAllViews();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("28161c38", new Object[]{this});
        }
        ac();
        return this.o;
    }

    private void ac() {
        final View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
        } else if (this.o != null || !ecu.y) {
        } else {
            if (!l() && !k() && com.taobao.android.detail.core.utils.e.c() && !s.a()) {
                this.o = u();
                return;
            }
            this.o = t();
            if (this.o == null || (findViewById = this.o.findViewById(R.id.view_new_arch_snapshot)) == null) {
                return;
            }
            String a2 = t.a(this);
            Drawable remove = !StringUtils.isEmpty(a2) ? TTDetailPageManager.sDowngradeSnapshotData.remove(a2) : null;
            if (remove == null) {
                return;
            }
            findViewById.setBackgroundDrawable(remove);
            findViewById.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.activity.DetailCoreActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        findViewById.setVisibility(8);
                    }
                }
            }, 500L);
        }
    }

    public ViewGroup p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a8b0a73e", new Object[]{this});
        }
        if (this.r == null) {
            this.r = (ViewGroup) findViewById(R.id.actionbar_layout);
        }
        return this.r;
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public View s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("50dc813c", new Object[]{this}) : com.taobao.android.detail.core.async.d.b(this.t, R.layout.x_taodetail_loading_mask);
    }

    public View t() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9b0e1a7d", new Object[]{this});
        }
        ViewStub viewStub = (ViewStub) this.t.findViewById(R.id.detail_mask);
        try {
            view = viewStub.inflate();
        } catch (Exception unused) {
            View findViewById = findViewById(R.id.inflated_mask);
            viewStub.setVisibility(0);
            view = findViewById;
        }
        view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        this.u = (ImageView) view.findViewById(R.id.tb_detail_preset_desktop);
        this.x = (ImageView) view.findViewById(R.id.tb_detail_preset_bottombar);
        if (this.u != null) {
            this.u.setImageDrawable(new com.taobao.android.detail.core.standard.widget.c().a(s.b() ? 0.0f : s.h() ? 0.5f : 1.0f));
        }
        if (s.b() && eip.E) {
            ImageView imageView = this.u;
            if (imageView != null && (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
                layoutParams.width = iuy.c;
                layoutParams.addRule(11);
                layoutParams.rightMargin = gbg.a((Context) this, 16.0f);
            }
            View view2 = new View(this);
            view2.setBackgroundColor(Color.rgb(236, 236, 236));
            ((ViewGroup) view).addView(view2, 0, new ViewGroup.LayoutParams(iuy.c - gbg.a((Context) this, 8.0f), iuy.c));
            if (view2.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.leftMargin = gbg.a((Context) this, 16.0f);
                layoutParams2.addRule(15);
            }
        }
        c();
        return view;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ImageView imageView = this.x;
        if (imageView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.height = (int) ((bay.b() / 750.0f) * 102.0f);
        if (s.a() && eip.E) {
            layoutParams.width = iuy.d;
            layoutParams.height = (int) ((layoutParams.width / 750.0f) * 102.0f);
            layoutParams.rightMargin = gbg.a((Context) this, 16.0f);
            layoutParams.addRule(11);
        }
        this.x.setImageDrawable(new com.taobao.android.detail.core.standard.widget.b());
    }

    public View u() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e53fb3be", new Object[]{this});
        }
        if (eip.k) {
            view = this.t.findViewById(R.id.detail_mask_transmit);
        } else {
            ViewStub viewStub = (ViewStub) this.t.findViewById(R.id.detail_mask_transmit_stub);
            if (viewStub == null) {
                return null;
            }
            try {
                view = viewStub.inflate();
            } catch (Exception unused) {
                View findViewById = findViewById(R.id.inflated_mask_transmit);
                viewStub.setVisibility(0);
                view = findViewById;
            }
        }
        if (view == null) {
            return null;
        }
        view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        a(view);
        return view;
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core onStart");
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "onStart", null, this.A);
        super.onStart();
        ecg.c(this, (Map<String, Object>) null);
        dyk y = this.b.y();
        if (y != null) {
            y.g();
        }
        com.taobao.android.trade.event.f.a(this, new com.taobao.android.detail.core.event.basic.e(26));
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core onResume start");
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "onResume", null, this.A);
        super.onResume();
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core super onResume start");
        a.b(this);
        a.a(this);
        bb.a(this);
        dya dyaVar = this.b;
        if (dyaVar != null) {
            dyaVar.j();
        }
        com.taobao.android.trade.event.f.a(this, new com.taobao.android.detail.core.event.basic.e(27));
        com.taobao.android.detail.core.utils.b.b(this, C());
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core onResume end");
        ecg.d(this, (Map<String, Object>) null);
        ebx ebxVar = this.f9411a;
        if (ebxVar == null || !e.a(ebxVar.q, this.f9411a.f27180a)) {
            return;
        }
        com.alibaba.android.ultron.engine.utils.g.a(eiq.f);
        String a2 = l.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.c(a2, "详情页面恢复 奥创解析优化标识：" + eiq.f);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f42b3", new Object[]{this});
            return;
        }
        try {
            super.onPostResume();
        } catch (IllegalArgumentException | IllegalStateException e) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "onPostResume", e);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        ecd.a(this, this.f9411a);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        a.b(this);
        bb.c(this);
        super.finish();
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        String a2 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a2, "activty:" + hashCode() + ",onDestroy begin,activity:" + this.t);
        ebx ebxVar = this.f9411a;
        if (ebxVar != null && e.b(ebxVar.q)) {
            k.a().a(String.valueOf(hashCode()));
        }
        if (getIntent() != null) {
            o.b(getIntent().getStringExtra(dyo.STREAM_FLAG));
        }
        epu.a("stage", WXExceptionConfig.KEY_BIZ, MessageID.onDestroy, null, this.A);
        a.b(this);
        bb.c(this);
        dyo.a(this);
        S();
        dya dyaVar = this.b;
        if (dyaVar != null) {
            com.taobao.android.detail.core.ultronengine.f f = dyaVar.f();
            if (f != null) {
                f.i();
            }
            this.b.m();
            this.b = null;
        }
        if (this.m != null) {
            this.m.removeAllViews();
            this.m = null;
        }
        n.b(this);
        ehs.b(this);
        emx.b(this);
        ecn.a(this, (com.taobao.android.detail.datasdk.model.datamodel.node.c) null);
        com.taobao.android.detail.core.async.d.a().a(this);
        ae();
        String a3 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a3, "activty:" + hashCode() + ",super.onDestroy begin,activity:" + this.t);
        super.onDestroy();
        String a4 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a4, "activty:" + hashCode() + ",super.onDestroy end,activity:" + this.t);
        ecg.f(this, null);
        a(this.f9411a);
        ad();
        com.taobao.android.sku.weex.c.a(this.h);
        s.e();
        String a5 = j.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.d(a5, "activty:" + hashCode() + ",onDestroy end,activity:" + this.t);
    }

    private void ad() {
        ebx ebxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
        } else if (!eiq.o || (ebxVar = this.f9411a) == null || ebxVar.f27180a == null || !e.b(this.f9411a.q)) {
        } else {
            k.a().a("preload", this.f9411a.f27180a);
            k.a().a("refresh", this.f9411a.f27180a);
        }
    }

    private void a(ebx ebxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68af17d", new Object[]{this, ebxVar});
        } else if (ebxVar == null || !e.a(ebxVar.q, ebxVar.f27180a)) {
        } else {
            com.alibaba.android.ultron.engine.utils.g.a(false);
            com.taobao.android.detail.core.utils.i.c(l.a("DetailCoreActivity"), "页面不可见时 奥创解析优化关闭");
        }
    }

    private void ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.detail.core.aura.utils.b.a();
            dwk G = G();
            if (G == null) {
                return;
            }
            G.g();
        } catch (Exception e) {
            arc.a().c("DetailCoreActivity", "destroyAURAWhenActivityDestroy", e.toString());
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core onPause");
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "onPause", null, this.A);
        dya dyaVar = this.b;
        if (dyaVar != null) {
            dyaVar.k();
        }
        super.onPause();
        ecg.e(this, (Map<String, Object>) null);
        com.taobao.android.trade.event.f.a(this, new com.taobao.android.detail.core.event.basic.e(28));
        com.taobao.android.detail.core.utils.b.a(this, C());
        a(this.f9411a);
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "core onStop");
        epu.a("stage", WXExceptionConfig.KEY_BIZ, MessageID.onStop, null, this.A);
        dya dyaVar = this.b;
        if (dyaVar != null) {
            dyaVar.l();
        }
        super.onStop();
        com.taobao.android.trade.event.f.a(this, new com.taobao.android.detail.core.event.basic.e(29));
        if (!this.H) {
            com.taobao.android.detail.core.perf.b.b((Context) this, com.alibaba.android.spindle.stage.b.ERROR_PLACEHOLDER, "页面处于placeholder退出");
        }
        dyk y = this.b.y();
        if (y != null) {
            y.h();
        }
        com.taobao.android.detail.core.perf.b.b(this);
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        dya dyaVar = this.b;
        return dyaVar != null && dyaVar.a(i, keyEvent);
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 256) {
            epo.a(R.string.taodetail_network_err_tip);
            finish();
            return true;
        }
        return super.a(message);
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{this, mtopResponse})).booleanValue();
        }
        if (mtopResponse == null || mtopResponse.isSystemError() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) {
            w();
            return false;
        } else if (mtopResponse.isNetworkError()) {
            com.taobao.android.detail.core.detail.kit.view.widget.base.a Z = Z();
            Z.a((String) null);
            Z.a(false);
            Z.a();
            return true;
        } else if (rjq.a(mtopResponse.getRetMsg())) {
            return true;
        } else {
            epo.a(mtopResponse.getRetMsg());
            return false;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            epo.a(R.string.taodetail_server_busy);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, com.taobao.android.detail.core.detail.kit.view.widget.base.b
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        dya dyaVar = this.b;
        if (dyaVar == null) {
            return;
        }
        dyaVar.a(false);
    }

    public dya y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dya) ipChange.ipc$dispatch("c7ab6d1a", new Object[]{this}) : this.b;
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.c z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("4aec87ae", new Object[]{this});
        }
        dya dyaVar = this.b;
        if (dyaVar != null) {
            return dyaVar.i();
        }
        return null;
    }

    public Handler A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2fe4fd7e", new Object[]{this}) : this.l;
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (!this.q.c() || intent == null || !Boolean.parseBoolean(intent.getStringExtra("skipPvFromRouterAc"))) {
        } else {
            this.q.a();
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
        a(intent);
        if (i2 != -1 || i != 10 || y().y() == null || y().y().e() == null) {
            return;
        }
        y().y().e().j();
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 24) {
            b(i);
        } else if (i == 25) {
            b(i);
            if ((keyEvent.getFlags() & 128) != 0 && ecu.u) {
                ag();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        elq a2 = elr.a(this.h);
        dwk G = G();
        if (a2 == null || a2.h() == null || G == null || G.c() == null || a2.h().g() == null || !emj.d(G.c())) {
            return;
        }
        a2.h().a(i);
    }

    private void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
        } else {
            getSupportFragmentManager().beginTransaction().add(16908290, new PerfTimelineFragment(), "").addToBackStack("").commit();
        }
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.c C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("71828c85", new Object[]{this}) : this.e;
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public com.taobao.android.detail.core.ultronengine.c D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.ultronengine.c) ipChange.ipc$dispatch("2682108d", new Object[]{this}) : this.F;
    }

    @Override // com.taobao.android.detail.core.perf.a
    public com.alibaba.android.spindle.stage.b E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.spindle.stage.b) ipChange.ipc$dispatch("2331ee01", new Object[]{this}) : this.G;
    }

    public void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z2)});
            return;
        }
        com.taobao.android.detail.core.utils.i.d("DetailCoreActivity", "setFinalUltronType " + z2);
        this.I = z2;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.I;
    }

    public String aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7f77cc6", new Object[]{this}) : StringUtils.isEmpty(this.O) ? com.taobao.android.detail.core.aura.presenter.c.AURA_CONFIG : this.O;
    }

    public boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.O);
    }

    public String aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("502f204", new Object[]{this}) : StringUtils.isEmpty(this.P) ? elq.AURA_CONFIG : this.P;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.J;
    }

    public void d(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z2)});
        } else {
            this.J = z2;
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.M;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.K;
    }

    public void e(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z2)});
        } else {
            this.K = z2;
        }
    }

    public boolean K() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = this.e;
        if (cVar != null && cVar.f10055a != null && (f = eqb.f(this.e.f10055a)) != null) {
            return f.immersiveAuraAnchor;
        }
        return false;
    }

    public boolean L() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = this.e;
        if (cVar != null && cVar.f10055a != null && (f = eqb.f(this.e.f10055a)) != null) {
            return f.industryDynamicLayout;
        }
        return false;
    }

    public boolean Q() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = this.e;
        return (cVar == null || cVar.f10055a == null || (f = eqb.f(this.e.f10055a)) == null || !F() || !f.lightOffTrans) ? false : true;
    }

    public void f(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z2)});
        } else {
            this.L = z2;
        }
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : this.L;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            try {
                this.N.offerFirst(runnable);
            } catch (Exception e) {
                com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "addToDelayMessageList error", e);
            }
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        try {
            if (this.l == null) {
                return;
            }
            int size = this.N.size();
            for (int i = 0; i < size; i++) {
                Runnable pollFirst = this.N.pollFirst();
                if (pollFirst != null) {
                    this.l.removeCallbacks(pollFirst);
                }
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "removeMessageCallbacks error", e);
        }
    }

    public ViewGroup T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("51d3d8da", new Object[]{this}) : (ViewGroup) findViewById(R.id.pagegroup);
    }

    public ViewPager U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("1d9aafc8", new Object[]{this});
        }
        dya dyaVar = this.b;
        if (dyaVar == null) {
            return null;
        }
        return dyaVar.z();
    }

    public lcq aX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcq) ipChange.ipc$dispatch("296de50e", new Object[]{this});
        }
        dya dyaVar = this.b;
        if (dyaVar != null) {
            return dyaVar.I();
        }
        return null;
    }
}
