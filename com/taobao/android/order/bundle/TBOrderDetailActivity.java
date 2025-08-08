package com.taobao.android.order.bundle;

import android.arch.lifecycle.Lifecycle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.ultron.event.ext.o;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.linkback.f;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.b;
import com.taobao.android.order.bundle.helper.k;
import com.taobao.android.order.bundle.helper.m;
import com.taobao.android.order.bundle.helper.rec.a;
import com.taobao.android.order.bundle.ultron.view.DetailBundleLineComponent;
import com.taobao.android.order.bundle.widget.AKVerticalGestureHandler;
import com.taobao.android.order.bundle.widget.OffsetBodyWrapper;
import com.taobao.android.order.bundle.widget.h;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.bundle.widget.recycle.g;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.e;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import com.taobao.android.order.map.model.OrderMapLifeCycleModel;
import com.taobao.android.order.map.model.OrderMapStatusModel;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.agc;
import tb.alz;
import tb.bwz;
import tb.bxa;
import tb.bxb;
import tb.hvn;
import tb.hvo;
import tb.hvr;
import tb.hvs;
import tb.hvt;
import tb.hvu;
import tb.hvv;
import tb.hvz;
import tb.hwb;
import tb.hwc;
import tb.hwf;
import tb.hyd;
import tb.hye;
import tb.hyf;
import tb.hyg;
import tb.hyj;
import tb.hyk;
import tb.hym;
import tb.hyn;
import tb.hyo;
import tb.hyq;
import tb.hyt;
import tb.hyx;
import tb.hyy;
import tb.hyz;
import tb.hza;
import tb.hzb;
import tb.ibm;
import tb.iro;
import tb.jpo;
import tb.jpx;
import tb.jqg;
import tb.jqm;
import tb.kge;
import tb.qzt;
import tb.raa;
import tb.rac;
import tb.rhy;
import tb.spk;
import tb.xjy;

/* loaded from: classes6.dex */
public class TBOrderDetailActivity extends TBOrderBaseActivity implements e, agc, raa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private h E;
    private String F;
    public String b;
    private OrderRecyclerView c;
    private LinearLayout e;
    private LinearLayout f;
    private View g;
    private a k;
    private com.taobao.android.order.core.h l;
    private boolean m;
    private g n;
    private ViewGroup o;
    private OffsetBodyWrapper p;
    private String q;
    private hyx r;
    private String t;
    private String u;
    private String w;
    private String h = "";
    private String G = "";
    private String i = "";
    private boolean j = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14498a = true;
    private boolean v = true;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private final hym B = new hym();
    private HashMap<String, Object> s = null;
    private BroadcastReceiver C = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (intent.getBooleanExtra(com.taobao.android.order.bundle.helper.a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, false)) {
                    TBOrderDetailActivity.a(TBOrderDetailActivity.this, true);
                }
                if (!TBOrderDetailActivity.a(TBOrderDetailActivity.this) || !intent.getBooleanExtra(b.IMMEDIATELY_REFRESH, false)) {
                    return;
                }
                TBOrderDetailActivity.a(TBOrderDetailActivity.this, "EventRefresh");
            } catch (Exception e) {
                bxb.a(TBOrderDetailActivity.b(TBOrderDetailActivity.this), "BroadcastException", e.getMessage());
            }
        }
    };
    private BroadcastReceiver D = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !StringUtils.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS", intent.getAction()) || context == null) {
                bxb.a(bxb.a.b(TBOrderDetailActivity.d(TBOrderDetailActivity.this), "payResultOfDetail").a(1.0f).a("支付失败").a(false));
            } else {
                com.taobao.android.order.bundle.helper.a.a(context.getApplicationContext(), false);
                com.taobao.android.order.bundle.helper.a.c(context.getApplicationContext(), false);
                bxb.a(bxb.a.b(TBOrderDetailActivity.c(TBOrderDetailActivity.this), "payResultOfDetail").a(0.1f).a("支付成功").a(true));
            }
        }
    };

    static {
        kge.a(2061568903);
        kge.a(-90167419);
        kge.a(-686169512);
        kge.a(640280651);
    }

    public static /* synthetic */ Object ipc$super(TBOrderDetailActivity tBOrderDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -753588267:
                super.bS_();
                return null;
            case 143326307:
                super.onBackPressed();
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
            case 1265012588:
                super.a((Bundle) objArr[0]);
                return null;
            case 1877256764:
                super.onCreate((Bundle) objArr[0], (PersistableBundle) objArr[1]);
                return null;
            case 2058746343:
                return new Boolean(super.dispatchGenericMotionEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
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

    public static /* synthetic */ void a(TBOrderDetailActivity tBOrderDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6599fc", new Object[]{tBOrderDetailActivity, str});
        } else {
            tBOrderDetailActivity.a(str);
        }
    }

    public static /* synthetic */ boolean a(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d678b6", new Object[]{tBOrderDetailActivity})).booleanValue() : tBOrderDetailActivity.j;
    }

    public static /* synthetic */ boolean a(TBOrderDetailActivity tBOrderDetailActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2f95066", new Object[]{tBOrderDetailActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderDetailActivity.j = z;
        return z;
    }

    public static /* synthetic */ String b(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("386034af", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.A();
    }

    public static /* synthetic */ String c(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("392eb330", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.A();
    }

    public static /* synthetic */ String d(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39fd31b1", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.A();
    }

    public static /* synthetic */ hyx e(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hyx) ipChange.ipc$dispatch("65931bf1", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.r;
    }

    public static /* synthetic */ g f(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8c4dee1f", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.n;
    }

    public static /* synthetic */ OrderRecyclerView g(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderRecyclerView) ipChange.ipc$dispatch("c44c9095", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.c;
    }

    public static /* synthetic */ d h(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d0cd8db0", new Object[]{tBOrderDetailActivity}) : tBOrderDetailActivity.I();
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity
    public BroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("9ef5465f", new Object[]{this}) : this.D;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe4aa3c", new Object[]{this, bundle, persistableBundle});
            return;
        }
        super.onCreate(bundle, persistableBundle);
        jqg.b("TBOrderDetailActivity", i.b.MEASURE_ONCREATE);
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        jqg.b("TBOrderDetailActivity", "onStart");
        h hVar = this.E;
        if (hVar == null) {
            return;
        }
        hVar.a(Lifecycle.Event.ON_START);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        super.a(bundle);
        jqg.b("TBOrderDetailActivity", "onActivityCreate begin");
        setContentView(R.layout.activity_order_detail);
        g();
        h();
        b.a(this, this.C);
        this.m = true;
        if (!jpx.a() && !bxa.a()) {
            z = false;
        }
        this.x = z;
        String A = A();
        if (!this.x) {
            jqg.a(hzb.f28847a, "OrderAmapRemoteLoadErr", "地图远程模块加载失败");
        }
        this.z = false;
        bxb.a(A, 0.001f);
        jqg.b("TBOrderDetailActivity", "onActivityCreate end");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.h = com.taobao.android.order.bundle.helper.g.d(getIntent());
        if (StringUtils.isEmpty(this.h)) {
            if (getIntent() != null && getIntent().getData() != null) {
                hyq.a(this, "TBOrderDetailActivity", alz.BizKeyOrderDetail, "orderId", "orderId 为空,formType = " + getIntent().getData().toString());
            }
            finish();
        }
        this.i = com.taobao.android.order.bundle.helper.g.e(getIntent());
        this.b = UemAnalysis.getTraceId();
        this.q = com.taobao.android.order.bundle.helper.g.b(getIntent(), CoreConstants.IN_PARAMS_VIEW_LOGISTICS);
        this.F = com.taobao.android.order.bundle.helper.g.b(getIntent(), "pageFrom");
        this.t = com.taobao.android.order.bundle.helper.g.b(getIntent(), CoreConstants.IN_PARAMS_ORDER_CODE);
        this.u = com.taobao.android.order.bundle.helper.g.b(getIntent(), CoreConstants.IN_PARAMS_SELECT_INDEX);
        this.w = com.taobao.android.order.bundle.helper.g.b(getIntent(), CoreConstants.IN_PARAMS_SCROLL_COMPONENT_KEY);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        b(4473924);
        this.c = (OrderRecyclerView) findViewById(R.id.recycler_view);
        com.taobao.android.order.bundle.widget.recycle.e eVar = new com.taobao.android.order.bundle.widget.recycle.e(this) { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 1092366570) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                com.taobao.android.order.bundle.widget.b bVar = new com.taobao.android.order.bundle.widget.b(recyclerView.getContext());
                bVar.setTargetPosition(i);
                startSmoothScroll(bVar);
            }

            @Override // com.taobao.android.order.bundle.widget.recycle.e, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("411c30ea", new Object[]{this, state});
                    return;
                }
                super.onLayoutCompleted(state);
                if (state.getItemCount() <= 0) {
                    return;
                }
                jpo.b(TBOrderDetailActivity.this).a("apmClientLayoutComplete", false, (Map<String, String>) null);
            }
        };
        eVar.a(this.ab);
        OrderRecyclerView orderRecyclerView = this.c;
        orderRecyclerView.setLayoutManager(eVar.a(orderRecyclerView));
        this.c.bizType = OrderConfigs.BizNameType.ORDER_DETAIL;
        this.e = (LinearLayout) findViewById(R.id.top_layout);
        this.f = (LinearLayout) findViewById(R.id.bottom_layout);
        this.g = findViewById(R.id.net_error_view);
        this.o = (ViewGroup) findViewById(R.id.background_container);
        this.p = (OffsetBodyWrapper) findViewById(R.id.body_wrapper);
        View findViewById = findViewById(R.id.mask_layout);
        hza hzaVar = new hza(this);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            viewGroup.removeAllViews();
            hzaVar.a(viewGroup).b();
        }
        updateSkeleton(hzaVar.c());
        hyz hyzVar = new hyz(this);
        View view = this.g;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).removeAllViews();
        hyzVar.a((ViewGroup) this.g).b();
    }

    public void updateSkeleton(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0a7f5", new Object[]{this, view});
            return;
        }
        ImageView imageView = view == null ? null : (ImageView) view.findViewById(R.id.skeleton_iv);
        int i = hyo.b(this).heightPixels;
        int i2 = hyo.b(this).widthPixels;
        if (imageView != null && s()) {
            Bitmap a2 = hyo.a(getResources(), R.drawable.babel_order_logistic_loading, i2, i);
            if (a2 == null) {
                return;
            }
            imageView.setImageBitmap(a2);
            return;
        }
        Bitmap a3 = hyo.a(getResources(), R.drawable.babel_order_detail_loading, i2, i);
        if (imageView == null || a3 == null) {
            return;
        }
        imageView.setImageBitmap(a3);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void bS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31527d5", new Object[]{this});
            return;
        }
        super.bS_();
        m();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.r = new hyx(this.p, this.c);
        this.n = new g(i(), this.c);
        i().a(hvr.BINDINGXSCROLLANIMINIT, new hvr.a(this.n));
        this.r.a(this.n);
        this.r.a(new AKVerticalGestureHandler(new AKVerticalGestureHandler.a() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public JSONObject f14502a = new JSONObject();

            @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.a
            public void a(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                } else if (!TBOrderDetailActivity.e(TBOrderDetailActivity.this).d()) {
                } else {
                    this.f14502a.put("yOffset", (Object) String.valueOf(hyo.b(TBOrderDetailActivity.this, (int) view.getTranslationY())));
                    if (i == 3 || i == 2 || i == 1) {
                        if (TBOrderDetailActivity.this.i() == null) {
                            return;
                        }
                        TBOrderDetailActivity.this.i().a("onOrderBodyScrollEnd", this.f14502a);
                    }
                    TBOrderDetailActivity.f(TBOrderDetailActivity.this).a((int) (TBOrderDetailActivity.e(TBOrderDetailActivity.this).a() - view.getTranslationY()));
                }
            }

            @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.a
            public boolean a(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : TBOrderDetailActivity.g(TBOrderDetailActivity.this).canScrollVertically(-1);
            }

            @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.a
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    TBOrderDetailActivity.f(TBOrderDetailActivity.this).a((int) (TBOrderDetailActivity.e(TBOrderDetailActivity.this).a() - view.getTranslationY()));
                }
            }
        }, new com.taobao.android.order.bundle.widget.a(), false, this));
        this.p.setBusiness(this.r);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.order.core.h hVar = this.l;
        if (hVar == null || hVar.l() == null || jSONObject == null) {
            return;
        }
        try {
            String str = this.l.l().get("extParams");
            if (!StringUtils.isEmpty(str)) {
                JSONObject parseObject = JSON.parseObject(str);
                for (String str2 : jSONObject.keySet()) {
                    parseObject.put(str2, jSONObject.get(str2));
                }
                this.l.l().put("extParams", parseObject.toJSONString());
            } else {
                this.l.l().put("extParams", jSONObject.toJSONString());
            }
            i().b();
            a("ReloadWithParams");
        } catch (Throwable th) {
            hyq.a(this, "TBOrderDetailActivity", "MULTIPACKAGE_SWITCH", "TBOrderDetailActivity", "MULTIPACKAGE_SWITCH_ERROR", th.toString(), null);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.order.core.g i = i();
        i.a(com.taobao.android.order.bundle.ultron.view.a.COMPONENT_TAG, com.taobao.android.order.bundle.ultron.view.a.CREATOR);
        i.a(DetailBundleLineComponent.COMPONENT_TAG, com.taobao.android.order.bundle.ultron.view.b.CREATOR);
        if (!s()) {
            r();
        }
        i.a(hyg.SUBSCRIBER_ID, new hyg());
        i.a(hye.SUBSCRIBER_ID, new hye());
        i.a(hyf.SUBSCRIBER_ID, new hyf());
        i.a("ultronAlipayBindV2", new o.a(I(), hyf.SUBSCRIBER_ID));
        i.a("ultronReallyPayV2", new o.a(I(), hyg.SUBSCRIBER_ID));
        i.a("ultronAliPayV2", new o.a(I(), hye.SUBSCRIBER_ID));
        i.a(Long.valueOf((long) hwb.DX_PARSER_GET_FESTIVAL), new hwb());
        i.a(Long.valueOf((long) hwc.DX_PARSER_GET_STATUS_BAR_HEIGHT), new hwc());
        i.a(Long.valueOf((long) hwf.DXNAVIBARMOREVIEW_NAVIBARMOREVIEW), new hwf());
        DXWidgetNode dXWidgetNode = (DXWidgetNode) bwz.a("com.taobao.android.order.bundle.dinamicX.view.DXBabelAMapViewWidgetNode");
        if (dXWidgetNode != null) {
            i.a((Long) 2720428826385695965L, dXWidgetNode);
        }
        DXWidgetNode dXWidgetNode2 = (DXWidgetNode) bwz.a("com.taobao.android.order.map.common.dx.DXBabelAMapViewV4WidgetNode");
        if (dXWidgetNode2 != null) {
            i.a((Long) 3824218203085984617L, dXWidgetNode2);
        }
        i.a(hvv.UPDATEMAPAREAHEIGHT, new hvv.a());
        i.a(hvt.PRELOADGOODSDETAIL, new hvt.a());
        i.a(hvz.KEY, new hvz.a());
        i.a(hvs.OPENNOTIFICATIONSETTING, new hvs.a());
        i.a(hvu.ULTRONBUYNOW, new hvu.a());
        i.a(xjy.TRADEONSTAGE, new xjy.a());
    }

    @Override // com.taobao.android.order.core.c
    public void onReloadRequested(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.j = true;
        } else if (this.f14498a) {
            this.j = true;
        } else {
            a("Reload");
        }
        com.taobao.android.order.bundle.helper.a.b(this, false);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b988dd", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        jqg.b("TBOrderDetailActivity", "onResume begin");
        this.f14498a = false;
        if (this.j) {
            a(this.m ? "FirstScreen" : "Reload");
            this.j = false;
        }
        t();
        com.taobao.android.order.bundle.base.parallelbiz.a.a(this, w());
        getIntent();
        BehaviR.getInstance().commitEnter(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        a aVar = this.k;
        if (aVar != null) {
            aVar.c();
        }
        hyo.a(this.c);
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(Lifecycle.Event.ON_RESUME);
        }
        com.taobao.android.order.bundle.helper.j.a().a(j(), new rhy() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rhy
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    m.a(TBOrderDetailActivity.h(TBOrderDetailActivity.this), TBOrderDetailActivity.this.j());
                }
            }
        });
        jqg.b("TBOrderDetailActivity", "onResume end");
        if (this.m && this.ab != null) {
            this.ab.c().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
        }
        this.m = false;
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (StringUtils.isEmpty(this.h)) {
            bxb.a(bxb.a.b(OrderBizCode.orderDetail, "odetail2UTReport").a(0.01f).a("orderId丢失").a(false));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("newOrderId", this.h);
            hashMap.put("olVersion", "2");
            boolean s = s();
            if (!StringUtils.isEmpty(this.G)) {
                hashMap.put("orderStatus", this.G);
            } else {
                bxb.a(bxb.a.b(OrderBizCode.orderDetail, "odetail2UTReport").a(0.01f).a(String.format("orderStatus丢失，是否为物流详情页 - %s", Boolean.valueOf(s))).a(false));
            }
            if (s) {
                hashMap.put("spm-cnt", ParallelBizValueHelper.b(ParallelBizValueHelper.PageType.logistics_detail));
            } else {
                Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(this);
                if (pageProperties == null || pageProperties.isEmpty() || !pageProperties.containsKey("spm-cnt")) {
                    hashMap.put("spm-cnt", ParallelBizValueHelper.b(ParallelBizValueHelper.PageType.order_detail));
                }
            }
            com.taobao.android.order.bundle.base.parallelbiz.a.a(this, hashMap);
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f14498a = true;
        jqg.b("TBOrderDetailActivity", "onPause");
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        if (!this.A) {
            this.A = true;
            k.a(this, this.h, this.c);
        }
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(Lifecycle.Event.ON_PAUSE);
        }
        com.taobao.android.order.bundle.helper.j.a().b(j());
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jqg.b("TBOrderDetailActivity", MessageID.onStop);
        h hVar = this.E;
        if (hVar == null) {
            return;
        }
        hVar.a(Lifecycle.Event.ON_STOP);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        jqg.b("TBOrderDetailActivity", MessageID.onDestroy);
        BroadcastReceiver broadcastReceiver = this.C;
        if (broadcastReceiver != null) {
            b.b(this, broadcastReceiver);
        }
        bxa.c();
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(true);
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().c(alz.BizKeyOrderDetail);
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, alz.BizKeyOrderDetail, null);
        if (!iro.b("waitPay", "")) {
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "waitPay", null);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        jqg.b("TBOrderDetailActivity", str);
        if (i() == null) {
            return;
        }
        k();
        i().a(this);
        this.j = false;
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public com.taobao.android.order.core.g d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.g) ipChange.ipc$dispatch("ed5fe251", new Object[]{this});
        }
        this.l = e();
        return com.taobao.android.order.core.g.a(new OrderConfigs.a(this).a(this.l).a(this.e, this.c, this.f, this.o).a(OrderConfigs.BizNameType.ORDER_DETAIL).a(this.b).a(this.ab).a(new com.taobao.android.order.bundle.widget.c(this)).a(new hyd()).a());
    }

    public com.taobao.android.order.core.h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.h) ipChange.ipc$dispatch("107b5f1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CoreConstants.IN_PARAM_BIZ_ORDER_ID, this.h);
        if (jqm.a()) {
            com.taobao.android.order.bundle.helper.g.a(hashMap, getIntent());
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        if (!StringUtils.isEmpty(this.F)) {
            hashMap.put("pageFrom", this.F);
        }
        hashMap.put(CoreConstants.IN_PARAM_ARCHIVE, String.valueOf(p()));
        hashMap.put("appName", hvo.b());
        hashMap.put("appVersion", hvo.c());
        hashMap.put("extParams", n());
        hashMap.putAll(com.taobao.android.order.bundle.helper.g.a(getIntent()));
        return new com.taobao.android.order.core.h(this).a(hyk.c()).b("1.0").d("UNIT_TRADE").d(Boolean.parseBoolean(this.q)).e(s() ? "logisticDetail" : alz.BizKeyOrderDetail).a(true).a(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[Catch: Throwable -> 0x00e5, TryCatch #0 {Throwable -> 0x00e5, blocks: (B:13:0x0031, B:15:0x003f, B:20:0x0047, B:22:0x0053, B:29:0x0068, B:33:0x0075, B:36:0x007c, B:38:0x0097, B:39:0x009e, B:41:0x00a6, B:42:0x00ad, B:44:0x00b3, B:45:0x00bc, B:47:0x00cc, B:48:0x00d3, B:50:0x00d9, B:51:0x00e0), top: B:56:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String n() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderDetailActivity.n():java.lang.String");
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadError(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
        } else if (mtopResponse == null) {
        } else {
            if (mtopResponse.isApiSuccess()) {
                if (hyk.l()) {
                    a(mtopResponse, "ReturnH5");
                } else {
                    b(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
                }
            } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
                if (hvn.a()) {
                    a(mtopResponse);
                    i().a(hyj.a(), (com.taobao.android.order.core.c) null);
                    l();
                    o();
                } else {
                    b(mtopResponse, mtopResponse.getRetCode());
                }
                hyq.a(this, "TBOrderDetailActivity", mtopResponse);
            } else if ("ReturnH5".equals(mtopResponse.getRetCode())) {
                a(mtopResponse, mtopResponse.getRetCode());
            } else if (!hzb.CODE_REDIRECT_302.equals(mtopResponse.getRetCode())) {
            } else {
                hyq.a(this, "TBOrderDetailActivity", "OrderDetail", mtopResponse.getRetCode() + "-detail", "detail", mtopResponse);
                org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                String optString = dataJsonObject != null ? dataJsonObject.optString(Constants.WEIBO_REDIRECTURL_KEY) : null;
                if (!StringUtils.isEmpty(optString)) {
                    a(optString, mtopResponse.getRetCode(), mtopResponse);
                    return;
                }
                a(mtopResponse);
                i().a(hyj.a(), (com.taobao.android.order.core.c) null);
                l();
                o();
            }
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!this.v) {
        } else {
            this.v = false;
            this.H = new hyy(this);
            View findViewById = findViewById(R.id.mask_layout);
            if (findViewById instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                viewGroup.removeAllViews();
                this.H.a(viewGroup).b();
            }
            View c = this.H.c();
            if (c == null) {
                return;
            }
            c.setVisibility(8);
        }
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        b(mtopResponse);
        l();
        o();
        c(mtopResponse);
        HashMap hashMap = new HashMap();
        hashMap.put("orderId", this.h);
        l.getInstance().updatePageProperties(hashMap);
        if (mtopResponse != null && mtopResponse.getDataJsonObject() == null) {
            hyq.b(this, "TBOrderDetailActivity", mtopResponse);
        }
        if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
            this.p.initBodyWrapper(mtopResponse.getDataJsonObject().optJSONObject("global"));
        }
        if (!StringUtils.isEmpty(this.w) && i() != null) {
            i().a(this.w);
        }
        f();
        this.B.a(mtopResponse);
        b();
    }

    private void c(MtopResponse mtopResponse) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONObject optJSONObject3;
        org.json.JSONObject optJSONObject4;
        org.json.JSONObject optJSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3dbcaf", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            try {
                if (mtopResponse.getDataJsonObject() == null || (optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global")) == null || (optJSONObject2 = optJSONObject.optJSONObject("events")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("utExplosure")) == null || (optJSONObject4 = optJSONObject3.optJSONObject("fields")) == null || (optJSONObject5 = optJSONObject4.optJSONObject("args")) == null) {
                    return;
                }
                this.G = optJSONObject5.optString("orderStatus");
                jqg.a("TBOrderDetailActivity", "updateOrderStatus:", "orderStatus = " + this.G);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (s()) {
        } else {
            bxb.a(bxb.a.b(OrderBizCode.orderDetail, "odetail2PV").a(spk.a("babelorder", "odetail2Sampling", 1.0f)).c("c1", StringUtils.isEmpty(this.h) ? "unknown" : this.h).a(String.format("pageName: %s, orderStatus: %s", ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), this.G)).a(true));
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.p.updateBodyOffset();
        }
    }

    private void b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
        } else if (!s()) {
        } else {
            if (mtopResponse == null || mtopResponse.getDataJsonObject() == null || mtopResponse.getDataJsonObject().optJSONObject("data") == null || !mtopResponse.getDataJsonObject().optJSONObject("data").has("weexInfoFlow")) {
                r();
                return;
            }
            h hVar = this.E;
            if (hVar != null) {
                hVar.a(false);
            }
            OrderRecyclerView orderRecyclerView = this.c;
            if (orderRecyclerView == null) {
                return;
            }
            this.E = new h(this.p, orderRecyclerView);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        boolean equals = "true".equals(com.taobao.android.order.bundle.helper.g.f(getIntent()));
        if (i() == null) {
            return;
        }
        if (jqm.a() && equals) {
            return;
        }
        i().a(com.taobao.android.order.bundle.ultron.view.c.COMPONENT_TAG, com.taobao.android.order.bundle.ultron.view.c.CREATOR);
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
        } else {
            onLoadSuccess((MtopResponse) null, dataStatus, pageStatus);
        }
    }

    private void a(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5edaa41", new Object[]{this, str, str2, mtopResponse});
            return;
        }
        hyq.a(this, "TBOrderDetailActivity", "OrderDetail", str2 + "-detail", "detail", mtopResponse);
        hyn.a("TBOrderDetailActivity", "handleMtopResponseByUrl", "DownGradeByUrl downGrade = " + str2);
        Nav.from(this).toUri(str);
        overridePendingTransition(0, 0);
        finish();
    }

    private void a(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dca6b7", new Object[]{this, mtopResponse, str});
            return;
        }
        hyq.a(this, "TBOrderDetailActivity", "OrderDetail", str + "-detail", "detail", mtopResponse);
        hyn.a("TBOrderDetailActivity", "handleMtopResponseByH5", "DownGradeTOH5Detail downGrade = " + str);
        com.taobao.android.order.bundle.helper.d.c(this, this.h, str);
        overridePendingTransition(0, 0);
        finish();
    }

    private void b(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c70afb8", new Object[]{this, mtopResponse, str});
            return;
        }
        hyq.a(this, "TBOrderDetailActivity", "OrderDetail", str + "-detail", "detail", mtopResponse);
        com.taobao.android.order.bundle.helper.d.a(this, this.h, "true", str);
        overridePendingTransition(0, 0);
        finish();
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : "1".equals(this.i) || "true".equalsIgnoreCase(this.i);
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        this.g.setVisibility(0);
        this.c.setVisibility(8);
        TBErrorView tBErrorView = (TBErrorView) this.g.findViewById(R.id.tb_order_error_view);
        if (tBErrorView == null) {
            return;
        }
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.order_biz_refresh), new View.OnClickListener() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TBOrderDetailActivity.this.i().a(TBOrderDetailActivity.this);
                }
            }
        });
        if (mtopResponse == null) {
            return;
        }
        tBErrorView.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
    }

    private boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : w() == ParallelBizValueHelper.PageType.logistics_detail;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.g == null) {
            this.g = findViewById(R.id.net_error_view);
        }
        this.g.setVisibility(8);
        this.c.setVisibility(0);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this}) : hyt.a(this, this.h);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this}) : this.n_;
    }

    @Override // tb.agc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        OffsetBodyWrapper offsetBodyWrapper = this.p;
        if (offsetBodyWrapper == null) {
            return;
        }
        offsetBodyWrapper.resetState(i);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab5f9e7", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!hyk.r()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        try {
            return super.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            hyq.a("TBOrderDetailActivity", "DISPATCH_GME_ERROR", Log.getStackTraceString(th));
            return false;
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
        if (i == 1001 && ibm.e(this)) {
            String j = j();
            ParallelBizValueHelper.PageType w = w();
            com.taobao.android.order.bundle.base.parallelbiz.a.a(w, j + "_Click_Enable_Notification", null);
        }
        if (i() == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", (Object) Integer.valueOf(i));
        i().a("action_orderdetail_onpageback", jSONObject);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        this.z = true;
        this.B.a(this);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        try {
            f.a(getIntent(), this);
        } catch (Exception e) {
            bxb.a(A(), "OrderDetail#LinkBackXException", e.getMessage());
        }
        if (!this.z && this.y) {
            this.B.a(this);
        }
        super.finish();
        a aVar = this.k;
        if (aVar != null) {
            aVar.d();
        }
        OffsetBodyWrapper offsetBodyWrapper = this.p;
        if (offsetBodyWrapper != null) {
            offsetBodyWrapper.release();
        }
        this.z = false;
        this.y = false;
        hyn.a("TBOrderDetailActivity", "finish", new String[0]);
    }

    @Override // com.taobao.android.order.core.e
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    @Override // tb.raa
    public List<OrderMapBubbleModel> a(Context context, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("247fa56", new Object[]{this, context, dXRuntimeContext});
        }
        d I = I();
        if (I != null) {
            return qzt.a(I.x());
        }
        return null;
    }

    @Override // tb.raa
    public View a(Context context, OrderMapBubbleModel orderMapBubbleModel, DXRuntimeContext dXRuntimeContext, rac racVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f31580dc", new Object[]{this, context, orderMapBubbleModel, dXRuntimeContext, racVar});
        }
        d I = I();
        if (I != null) {
            return qzt.a(context, orderMapBubbleModel, I.l().a(), racVar);
        }
        return null;
    }

    @Override // tb.raa
    public void a(OrderMapStatusModel orderMapStatusModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646d43fb", new Object[]{this, orderMapStatusModel});
        } else {
            a("Reload");
        }
    }

    @Override // tb.raa
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.s == null) {
            this.s = new HashMap<>();
        }
        this.s.put(str, obj);
    }

    @Override // tb.raa
    public void a(OrderMapLifeCycleModel orderMapLifeCycleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad42453f", new Object[]{this, orderMapLifeCycleModel});
        } else if (!"onMapLoaded".equals(orderMapLifeCycleModel.code) || this.ab == null) {
        } else {
            this.ab.e();
        }
    }

    @Override // tb.raa
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.s;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }
}
