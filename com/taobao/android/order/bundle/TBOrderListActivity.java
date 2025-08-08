package com.taobao.android.order.bundle;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.helper.TBWebOrder;
import com.taobao.android.order.bundle.helper.d;
import com.taobao.android.order.bundle.helper.rec.OrderRecommendWrapper;
import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import com.taobao.android.order.bundle.weex2.TBRefundInstanceManager;
import com.taobao.android.order.bundle.weex2.b;
import com.taobao.android.order.bundle.widget.f;
import com.taobao.android.order.bundle.widget.g;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.h;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.m;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.l;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import tb.alz;
import tb.bax;
import tb.bip;
import tb.bnn;
import tb.bxb;
import tb.bxd;
import tb.cts;
import tb.cup;
import tb.gbg;
import tb.hvn;
import tb.hyj;
import tb.hyk;
import tb.hyn;
import tb.hyp;
import tb.hyq;
import tb.hyt;
import tb.hyy;
import tb.hzc;
import tb.hzf;
import tb.hzp;
import tb.ibl;
import tb.ibm;
import tb.ibn;
import tb.ibo;
import tb.iro;
import tb.jjj;
import tb.jnr;
import tb.jpo;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;
import tb.kpn;
import tb.nkj;
import tb.qpf;
import tb.rhz;
import tb.ria;
import tb.scn;
import tb.shc;
import tb.spk;
import tb.tey;

/* loaded from: classes6.dex */
public class TBOrderListActivity extends TBOrderBaseActivity implements com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a, g.a, m, rhz, tey {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, JSONObject> e;
    private boolean A;
    private RecyclerView I;
    private p K;
    private ibo P;
    private RecyclerView.OnScrollListener Q;
    private b Z;

    /* renamed from: a  reason: collision with root package name */
    private qpf f14505a;
    private Map<String, Object> ac;
    private TBSwipeRefreshLayout b;
    private OrderConfigs f;
    private shc j;
    private View k;
    private String l;
    private Long m;
    private Long n;
    private a s;
    private a t;
    private f v;
    private boolean o = true;
    private org.json.JSONObject p = null;
    private org.json.JSONObject q = null;
    private boolean r = true;
    private OrderRecommendWrapper i = null;
    private long x = -1;
    private HashMap<String, Object> N = null;
    private UltronWeex2DataPrefetchCache O = new UltronWeex2DataPrefetchCache();
    public boolean g = false;
    public boolean h = false;
    public BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:10:0x0046, B:13:0x0054, B:19:0x0068, B:21:0x0070, B:23:0x007f, B:25:0x0095), top: B:30:0x0046 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.TBOrderListActivity.AnonymousClass1.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L18
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r5
                r1[r2] = r6
                r6 = 2
                r1[r6] = r7
                java.lang.String r6 = "3c04d85a"
                r0.ipc$dispatch(r6, r1)
                return
            L18:
                java.lang.String r6 = r7.getAction()
                java.lang.String[] r0 = new java.lang.String[r2]
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "action = "
                r1.append(r4)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r0[r3] = r1
                java.lang.String r1 = "TBOrderListActivity"
                java.lang.String r4 = "BroadcastReceiver"
                tb.hyn.a(r1, r4, r0)
                java.lang.String r0 = "orderListNeedRefreshAction"
                boolean r6 = r0.equals(r6)
                if (r6 == 0) goto L46
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this
                com.taobao.android.order.bundle.TBOrderListActivity.a(r6)
                return
            L46:
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListActivity.b(r6)     // Catch: java.lang.Exception -> L9a
                java.lang.String r6 = "orderListNeedRefresh"
                boolean r6 = r7.getBooleanExtra(r6, r3)     // Catch: java.lang.Exception -> L9a
                if (r6 != 0) goto L54
                return
            L54:
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListActivity.a(r6, r2)     // Catch: java.lang.Exception -> L9a
                java.lang.String r6 = "orderQueryParamCondition"
                java.io.Serializable r6 = r7.getSerializableExtra(r6)     // Catch: java.lang.Exception -> L9a
                boolean r0 = r6 instanceof java.util.HashMap     // Catch: java.lang.Exception -> L9a
                r1 = 0
                if (r0 == 0) goto L67
                java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: java.lang.Exception -> L67
                goto L68
            L67:
                r6 = r1
            L68:
                java.lang.String r0 = "immediatelyRefresh"
                boolean r7 = r7.getBooleanExtra(r0, r3)     // Catch: java.lang.Exception -> L9a
                if (r7 == 0) goto L7d
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                java.lang.String r0 = "EventRefresh"
                com.taobao.android.order.bundle.TBOrderListActivity.a(r7, r0, r6)     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListActivity.a(r6, r1)     // Catch: java.lang.Exception -> L9a
                goto L9a
            L7d:
                if (r6 == 0) goto L9a
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                tb.qpf r7 = com.taobao.android.order.bundle.TBOrderListActivity.c(r7)     // Catch: java.lang.Exception -> L9a
                java.lang.String r7 = r7.j()     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.constants.TabType r0 = com.taobao.android.order.bundle.constants.TabType.ALL     // Catch: java.lang.Exception -> L9a
                java.lang.String r0 = r0.getValue()     // Catch: java.lang.Exception -> L9a
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L9a
                if (r7 == 0) goto L9a
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListActivity.a(r7, r6)     // Catch: java.lang.Exception -> L9a
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListActivity.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    private boolean R = false;
    private BroadcastReceiver S = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.10
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !StringUtils.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS", intent.getAction()) || context == null) {
                bxb.a(bxb.a.b(OrderBizCode.orderList, "payResultOfList").a(1.0f).a("支付失败").a(false));
            } else {
                TBOrderListActivity.b(TBOrderListActivity.this);
                com.taobao.android.order.bundle.helper.a.a(context.getApplicationContext(), false);
                com.taobao.android.order.bundle.helper.a.b(context.getApplicationContext(), false);
                bxb.a(bxb.a.b(OrderBizCode.orderList, "payResultOfList").a(0.1f).a("支付成功").a(true));
            }
        }
    };

    /* renamed from: com.taobao.android.order.bundle.TBOrderListActivity$13  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass13 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14509a = new int[ParallelBizValueHelper.PageType.values().length];

        static {
            try {
                f14509a[ParallelBizValueHelper.PageType.order_detail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14509a[ParallelBizValueHelper.PageType.logistics_detail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TBOrderListActivity tBOrderListActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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
            case 1281559479:
                super.onRestart();
                return null;
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

    public void c_(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb21606d", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public Context getContainerContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e86b45e3", new Object[]{this}) : this;
    }

    public static /* synthetic */ b a(TBOrderListActivity tBOrderListActivity, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bc7622b7", new Object[]{tBOrderListActivity, bVar});
        }
        tBOrderListActivity.Z = bVar;
        return bVar;
    }

    public static /* synthetic */ p a(TBOrderListActivity tBOrderListActivity, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("fa681065", new Object[]{tBOrderListActivity, pVar});
        }
        tBOrderListActivity.K = pVar;
        return pVar;
    }

    public static /* synthetic */ Map a(TBOrderListActivity tBOrderListActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d614255", new Object[]{tBOrderListActivity, map});
        }
        tBOrderListActivity.ac = map;
        return map;
    }

    public static /* synthetic */ void a(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff83b0c5", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.m();
        }
    }

    public static /* synthetic */ void a(TBOrderListActivity tBOrderListActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eda134f", new Object[]{tBOrderListActivity, str});
        } else {
            tBOrderListActivity.e(str);
        }
    }

    public static /* synthetic */ void a(TBOrderListActivity tBOrderListActivity, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e8c604", new Object[]{tBOrderListActivity, str, hashMap});
        } else {
            tBOrderListActivity.a(str, (HashMap<String, Object>) hashMap);
        }
    }

    public static /* synthetic */ boolean a(TBOrderListActivity tBOrderListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0f31ab3", new Object[]{tBOrderListActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderListActivity.o = z;
        return z;
    }

    public static /* synthetic */ String b(TBOrderListActivity tBOrderListActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc1865b2", new Object[]{tBOrderListActivity, str});
        }
        tBOrderListActivity.l = str;
        return str;
    }

    public static /* synthetic */ void b(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c70c7e4", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.H();
        }
    }

    public static /* synthetic */ boolean b(TBOrderListActivity tBOrderListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a8e774", new Object[]{tBOrderListActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderListActivity.R = z;
        return z;
    }

    public static /* synthetic */ qpf c(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpf) ipChange.ipc$dispatch("54a2cdc", new Object[]{tBOrderListActivity}) : tBOrderListActivity.f14505a;
    }

    public static /* synthetic */ String d(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad9c6be", new Object[]{tBOrderListActivity}) : tBOrderListActivity.T;
    }

    public static /* synthetic */ String e(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e87f17f", new Object[]{tBOrderListActivity}) : tBOrderListActivity.T;
    }

    public static /* synthetic */ View f(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9f0764a2", new Object[]{tBOrderListActivity}) : tBOrderListActivity.k;
    }

    public static /* synthetic */ f g(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("da8f8a52", new Object[]{tBOrderListActivity}) : tBOrderListActivity.v;
    }

    public static /* synthetic */ boolean h(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9ff52a2", new Object[]{tBOrderListActivity})).booleanValue() : tBOrderListActivity.R;
    }

    public static /* synthetic */ org.json.JSONObject i(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("6e7b9a2b", new Object[]{tBOrderListActivity}) : tBOrderListActivity.p;
    }

    public static /* synthetic */ void j(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d980dc", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.l();
        }
    }

    public static /* synthetic */ void k(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c697fb", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.l();
        }
    }

    public static /* synthetic */ void l(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3af1a", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.k();
        }
    }

    public static /* synthetic */ void m(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa0c639", new Object[]{tBOrderListActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ b n(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e219bb1e", new Object[]{tBOrderListActivity}) : tBOrderListActivity.Z;
    }

    static {
        kge.a(1067490452);
        kge.a(-1603490154);
        kge.a(24233887);
        kge.a(477856532);
        kge.a(1515948808);
        kge.a(1220076611);
        e = new HashMap<>(4);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.f14505a.q() == null) {
        } else {
            this.f14505a.q().put("waitPayDowngrade", (Object) "true");
            e("WaitPayDowngrade");
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        this.m = Long.valueOf(System.currentTimeMillis());
        bxb.a(OrderBizCode.orderList, 0.001f);
        d.a(this, getIntent());
        super.a(bundle);
        if (cup.d()) {
            AsyncInstanceLoadManager.INSTANCE.b();
        }
        this.f14505a = com.taobao.android.order.bundle.nav.list.g.INSTANCE.a();
        qpf qpfVar = this.f14505a;
        if (qpfVar == null || !qpfVar.c()) {
            this.f14505a = new qpf(this);
        } else {
            this.f14505a.a(this);
        }
        this.f14505a.a(this.ab);
        setContentView(R.layout.activity_order_list);
        n();
        jqi.a(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), this.d);
        if (this.f14505a.p()) {
            if (!TBRefundInstanceManager.isNetStart()) {
                TBRefundInstanceManager.startPreRequestOnIdle();
            }
            this.f14505a.a(new FrameLayout(this));
            if (cup.d()) {
                AsyncInstanceLoadManager.INSTANCE.b(new AsyncInstanceLoadManager.a() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
                    public void a(boolean z, p pVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2ea220a1", new Object[]{this, new Boolean(z), pVar});
                        } else if (!z || pVar == null) {
                            TBOrderListActivity tBOrderListActivity = TBOrderListActivity.this;
                            TBOrderListActivity.a(tBOrderListActivity, TBRefundInstanceManager.refundWeex2PreRender(tBOrderListActivity, TBOrderListActivity.c(tBOrderListActivity).r(), TBOrderListActivity.c(TBOrderListActivity.this).o(), new TBRefundInstanceManager.a(TBOrderListActivity.e(TBOrderListActivity.this), true, false, Boolean.valueOf("true".equals(TBOrderListActivity.c(TBOrderListActivity.this).C())))));
                        } else {
                            TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
                            TBOrderListActivity tBOrderListActivity2 = TBOrderListActivity.this;
                            tBRefundInstanceManager.prepareReloadInstance(tBOrderListActivity2, TBOrderListActivity.c(tBOrderListActivity2).r(), new TBRefundInstanceManager.a(TBOrderListActivity.d(TBOrderListActivity.this), true, false, Boolean.valueOf("true".equals(TBOrderListActivity.c(TBOrderListActivity.this).C()))), pVar);
                            TBOrderListActivity.a(TBOrderListActivity.this, pVar);
                        }
                    }
                });
            } else {
                this.K = TBRefundInstanceManager.refundWeex2PreRender(this, this.f14505a.r(), this.f14505a.o(), new TBRefundInstanceManager.a(this.T, true, false, Boolean.valueOf("true".equals(this.f14505a.C()))));
            }
        }
        o();
        x();
        y();
        J();
        this.f14505a.G();
        com.taobao.android.order.bundle.helper.b.a(this, this.c);
        com.taobao.android.order.bundle.helper.b.a(this);
        q.a(CoreConstants.ORDER_VESSEL_WV_KEY, (Class<? extends e>) TBWebOrder.class, true);
        ParallelBizValueHelper.PageType w = w();
        com.taobao.android.order.bundle.base.parallelbiz.a.a(w, "_Button-" + this.f14505a.j(), null);
        hyn.a("TBOrderListActivity", "onActivityCreate", "页面创建");
        this.A = true;
        this.f14505a.a(bundle);
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        p pVar = this.K;
        if (pVar != null) {
            pVar.onActivityStart();
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.f14505a.a(TradeHybridTMSFragment.b.e.INSTANCE);
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(3);
                }
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        qpf qpfVar = this.f14505a;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.f14505a.a(new TradeHybridTMSFragment.b.a(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.taobao.android.order.bundle.helper.e.b();
        if (i() != null) {
            i().d();
        }
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            com.taobao.android.order.bundle.helper.b.b(this, broadcastReceiver);
        }
        com.taobao.android.order.bundle.helper.b.a();
        com.taobao.android.order.bundle.helper.b.b();
        RecyclerView.OnScrollListener onScrollListener = this.Q;
        if (onScrollListener != null && (recyclerView = this.I) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        com.taobao.android.order.bundle.nav.list.g.INSTANCE.b();
        if (this.f14505a.s() != null) {
            this.f14505a.s().destroyWeex2Instance();
            this.s = null;
            this.f14505a.s().setFragmentLifeCycleListener(null);
        }
        if (this.f14505a.E() != null) {
            this.f14505a.E().destroyWeex2Instance();
            this.t = null;
            this.f14505a.E().setFragmentLifeCycleListener(null);
        }
        this.Z = null;
        HashMap<String, Object> hashMap = this.N;
        if (hashMap != null) {
            hashMap.clear();
        }
        p pVar = this.K;
        if (pVar != null) {
            pVar.destroy();
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar != null && qpfVar.F() != null) {
            this.f14505a.a(TradeHybridTMSFragment.b.C0106b.INSTANCE);
        }
        qpf qpfVar2 = this.f14505a;
        if (qpfVar2 != null) {
            qpfVar2.H();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) getApplicationContext());
        jSONObject.put("useCustomDataSource", (Object) "true");
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.j f = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().f();
        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundOrderList", true) && f.c("first_data", alz.BizKeyRefund)) {
            jSONObject.put("enablePreRequestRefund", (Object) true);
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, alz.BizKeyOrderList, jSONObject);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (!this.f14505a.c()) {
            this.f14505a.a(intent);
        }
        if (OrderType.ORDERLIST.getValue().equals(this.f14505a.n())) {
            if (this.ab != null) {
                this.ab.c(com.taobao.android.order.bundle.cache.a.g());
            }
            if (this.ab != null) {
                a("isOLFirstScreen", (Object) true);
            }
            this.f14505a.a();
        } else {
            this.f14505a.a(hyj.c());
        }
        if ((!OrderType.ORDERLIST.getValue().equals(this.f14505a.n()) || this.f14505a.p()) && this.ab != null) {
            this.ab.a(true, false, "其他页面");
            this.ab = null;
        }
        this.f14505a.a(new g(this));
        ((g) this.f14505a.k()).a(this.ab);
        this.v = (f) this.f14505a.k();
        if (!hyk.x()) {
            return;
        }
        this.f14505a.a(new jnr() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnr
            public void a(List<String> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (list.size() > 0) {
                } else {
                    TBOrderListActivity.c(TBOrderListActivity.this).q().put("taoTmRoute", (Object) "mergeError");
                    TBOrderListActivity.a(TBOrderListActivity.this, "PullToRefresh");
                    hyq.a("TBOrderListActivity", "ORDER_3_MERGE_ERROR", "ORDER_3_MERGE_ERROR");
                }
            }
        });
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.f14505a.a((LinearLayout) findViewById(R.id.top_layout));
        this.f14505a.a((SimpleViewpager) findViewById(R.id.viewpager));
        b(4473924);
        this.H = new hyy(this);
        this.H.a(R.id.mask_layout).b();
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("responseMtopData");
            } catch (JSONException e2) {
                hyn.a("TBOrderListActivity", "updateParams-parse-res", e2);
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = String.valueOf(UUID.randomUUID());
                e.put(str, jSONObject2);
                this.f14505a.b(str);
            } else {
                str = null;
            }
            Object obj = jSONObject.get("openNewPage");
            if (obj instanceof JSONObject) {
                Bundle bundle = new Bundle();
                bundle.putString("tabCode", this.f14505a.j());
                JSONObject jSONObject4 = (JSONObject) obj;
                String string = jSONObject4.getString("url");
                if (!StringUtils.isEmpty(string)) {
                    Object obj2 = jSONObject4.get("queryParams");
                    if (!StringUtils.isEmpty(str) && (obj2 instanceof JSONObject)) {
                        JSONObject jSONObject5 = (JSONObject) obj2;
                        jSONObject5.put(CoreConstants.PRESETRES_KEY, (Object) str);
                        for (String str2 : jSONObject5.keySet()) {
                            bundle.putString(str2, jSONObject5.getString(str2));
                        }
                        string = ibm.a(string, jSONObject5);
                    }
                    Nav.from(this).withExtras(bundle).toUri(string);
                    return;
                }
            }
            if (this.f14505a.h() == null || this.f14505a.h().l() == null) {
                return;
            }
            Object obj3 = jSONObject.get("extraConditionParams");
            if (obj3 instanceof JSONObject) {
                try {
                    jSONObject3 = JSONObject.parseObject(this.f14505a.h().l().get("condition"));
                } catch (JSONException e3) {
                    hyn.a("TBOrderListActivity", "extCondition-parse-error", e3);
                }
                if (jSONObject3 != null) {
                    JSONObject jSONObject6 = (JSONObject) obj3;
                    for (String str3 : jSONObject6.keySet()) {
                        jSONObject3.put(str3, (Object) jSONObject6.getString(str3));
                    }
                }
            }
            Object obj4 = jSONObject.get("extraBizParams");
            if (obj4 instanceof JSONObject) {
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = JSONObject.parseObject(this.f14505a.h().l().get("condition"));
                    } catch (JSONException e4) {
                        hyn.a("TBOrderListActivity", "extBiz-parse-error", e4);
                    }
                }
                if (jSONObject3 != null) {
                    JSONObject jSONObject7 = (JSONObject) obj4;
                    for (String str4 : jSONObject7.keySet()) {
                        jSONObject3.put(str4, (Object) jSONObject7.getString(str4));
                    }
                }
            }
            if (jSONObject3 == null) {
                return;
            }
            try {
                this.f14505a.b(jSONObject3);
                this.f14505a.h().l().put("condition", jSONObject3.toJSONString());
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void b(String str) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        boolean a2 = spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableTabChangePreRender", true);
        p();
        f();
        this.f14505a.H();
        String str2 = null;
        this.p = null;
        if (TabType.REFUND.getValue().equals(this.f14505a.j()) && this.f14505a.r() != null && a2) {
            this.f14505a.r().removeAllViews();
        }
        if (str != null) {
            this.f14505a.a(str);
        }
        this.f14505a.h().l().put("tabCode", this.f14505a.j());
        this.b.enablePullRefresh(!StringUtils.equals(this.f14505a.j(), TabType.REFUND.getValue()));
        v();
        if (TabType.REFUND.getValue().equals(str) && a2) {
            hzc e2 = i().e();
            if (this.f14505a.r() != null && (pVar = this.K) != null) {
                if (pVar.getRenderRoot().getParent() != null) {
                    ((ViewGroup) this.K.getRenderRoot().getParent()).removeView(this.K.getRenderRoot());
                }
                this.f14505a.r().addView(this.K.getRenderRoot());
                this.K.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "instance.expose", null);
                this.f.b((View) this.f14505a.r());
                this.f14505a.a(e2);
                return;
            }
            TBRefundInstanceManager.startPreRequestOnIdle();
            if (!StringUtils.isEmpty(this.f.i())) {
                str2 = this.f.i();
            }
            FrameLayout frameLayout = new FrameLayout(this);
            this.f14505a.a(frameLayout);
            long currentTimeMillis = System.currentTimeMillis();
            if (e2 instanceof hzf) {
                currentTimeMillis = ((hzf) e2).h();
            }
            this.K = TBRefundInstanceManager.refundWeex2PreRender(this, frameLayout, str2, new TBRefundInstanceManager.a(Long.toString(currentTimeMillis), false, false, Boolean.valueOf("true".equals(this.f14505a.C()))));
            this.f.b((View) frameLayout);
            this.f14505a.a(e2);
            return;
        }
        B();
        a(true);
        e("SwitchTab");
    }

    private void B() {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (!bxd.a("enableOListTabCache", true) || "OrderSearch".equals(this.f14505a.h().l().get("OrderType")) || (a2 = com.taobao.android.order.bundle.cache.a.a(this, this.f14505a.j(), com.taobao.android.order.bundle.cache.a.SCENE_RELOADCONTAINER)) == null) {
        } else {
            this.f14505a.c(a2);
            this.f14505a.b(true);
            this.f14505a.d(true);
            this.f.b(true);
            i().a(this.f14505a.t(), (com.taobao.android.order.core.c) null);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.Q;
        if (onScrollListener == null) {
            return;
        }
        RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.I = this.f14505a.k().b(this.k);
        RecyclerView recyclerView2 = this.I;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.removeOnScrollListener(this.Q);
        this.I.addOnScrollListener(this.Q);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void bS_() {
        if (this.f14505a.p() && spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableAdvanceLoadRefund", true)) {
            this.f.k();
        }
        if (!this.f14505a.p() && !this.f14505a.l()) {
            i().a(this.f14505a.i(), (com.taobao.android.order.core.c) null);
        }
        hzc e2 = i().e();
        if (this.f14505a.l()) {
            a(e2);
        }
        if (e2 instanceof hzp) {
            com.taobao.android.order.bundle.helper.e.a((hzp) e2);
        }
        int u = hyk.u();
        if (u > 0 && hyk.v()) {
            try {
                this.I = this.f.d().b(this.k);
                Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                declaredField.setAccessible(true);
                declaredField.set(this.I, Integer.valueOf(gbg.a((Context) this, u)));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (this.Q == null) {
            this.Q = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode != 2142696127) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    TBOrderListActivity.g(TBOrderListActivity.this).a(recyclerView, TBOrderListActivity.f(TBOrderListActivity.this), i);
                    if ((i == 2 && i != 0) || TBOrderListActivity.h(TBOrderListActivity.this) || TBOrderListActivity.i(TBOrderListActivity.this) == null || !"true".equals(TBOrderListActivity.i(TBOrderListActivity.this).optString("hasMore")) || recyclerView.getAdapter().getItemCount() - ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() >= 25) {
                        return;
                    }
                    TBOrderListActivity.b(TBOrderListActivity.this, true);
                    TBOrderListActivity.this.F();
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    TBOrderListActivity.g(TBOrderListActivity.this).a(recyclerView, TBOrderListActivity.f(TBOrderListActivity.this), i, i2);
                }
            };
        }
        this.I = this.f.d().b(this.k);
        RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.Q);
        }
        this.n = Long.valueOf(System.currentTimeMillis());
        com.taobao.android.order.bundle.helper.b.a(this.f);
    }

    private void a(final hzc hzcVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf223a7", new Object[]{this, hzcVar});
        } else if (!(hzcVar instanceof hzf)) {
        } else {
            if (bax.a().f25741a != 1) {
                z = false;
            }
            if (bxd.a("olAsyncParseData", z)) {
                jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ((hzf) hzcVar).a(TBOrderListActivity.c(TBOrderListActivity.this).t(), true, new hzf.a() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.hzf.a
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else if (bxd.a(qpf.KEY_WAIT_PAY_LOADING, false) && TabType.WAIT_PAY.getValue().equals(TBOrderListActivity.c(TBOrderListActivity.this).j())) {
                                    } else {
                                        TBOrderListActivity.j(TBOrderListActivity.this);
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (bxd.a("loadOLCacheDelay", false)) {
                jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ((hzf) hzcVar).a(TBOrderListActivity.c(TBOrderListActivity.this).t(), true, (hzf.a) null);
                        TBOrderListActivity.k(TBOrderListActivity.this);
                    }
                }, 0L);
            } else {
                ((hzf) hzcVar).a(this.f14505a.t(), false, (hzf.a) null);
                if (bxd.a(qpf.KEY_WAIT_PAY_LOADING, false) && TabType.WAIT_PAY.getValue().equals(this.f14505a.j())) {
                    return;
                }
                this.f14505a.d(false);
            }
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
        this.r = false;
        if (com.taobao.android.order.bundle.helper.j.a().a(getApplicationContext()) != null) {
            com.taobao.android.order.bundle.helper.j.a().a(this.f);
        }
        if (this.o) {
            a(true);
            Map<String, Object> map = this.ac;
            if (map != null) {
                b(map);
                this.ac = null;
            } else {
                e(this.A ? "FirstScreen" : "NativeRefresh");
                this.o = false;
            }
        }
        hyp.a(ParallelBizValueHelper.a(w()), this);
        hyn.a("TBOrderListActivity", "onResume", "页面在前台");
        getIntent();
        OrderRecommendWrapper orderRecommendWrapper = this.i;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.c();
        }
        BehaviR.getInstance().commitEnter(ParallelBizValueHelper.a(w()), null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        p pVar = this.K;
        if (pVar != null) {
            pVar.onActivityResume();
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar != null && qpfVar.F() != null) {
            this.f14505a.a(TradeHybridTMSFragment.b.d.INSTANCE);
        }
        if (this.A && this.ab != null) {
            jpo.b(this).a("d8", "tab", this.f14505a.j());
            this.ab.c().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
        }
        if (this.A) {
            t();
        }
        this.A = false;
        qpf qpfVar2 = this.f14505a;
        if (qpfVar2 == null) {
            return;
        }
        qpfVar2.I();
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            shc h = rVar.h();
            if (h == null) {
                jqg.b("orderListSpan", "falco-parentSpan is null");
                return;
            }
            this.j = rVar.a(shc.MODULE, shc.SCENE_TAP).a(h).av_();
            this.j.a(h);
            this.j.l(j());
            this.j.d(this.m);
            this.j.e(this.n);
        } catch (Exception e2) {
            jqg.b("orderListSpan", e2.getMessage());
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void a(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0eb4043", new Object[]{this, tBSwipeRefreshLayout});
            return;
        }
        this.b = tBSwipeRefreshLayout;
        ParallelBizValueHelper.PageType w = w();
        com.taobao.android.order.bundle.base.parallelbiz.a.a(w, "_Button-" + this.f14505a.j() + "-pullStartLoad", null);
        e("PullToRefresh");
    }

    private void a(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            a(hashMap);
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            a(str, (HashMap<String, Object>) null);
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (i() == null) {
        } else {
            if (!this.A) {
                this.f.a((ria) null);
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout = this.b;
            if (tBSwipeRefreshLayout == null || !tBSwipeRefreshLayout.isRefreshing()) {
                z = false;
            }
            if (!z && !this.f14505a.p() && !this.f14505a.l()) {
                k();
            }
            if (this.f14505a.l() && this.f14505a.y()) {
                k();
            }
            if (this.f14505a.l()) {
                this.f14505a.d().setIsCanScroll(false);
            }
            r();
            i().b();
            this.x = System.currentTimeMillis();
            if (!StringUtils.isEmpty(this.f14505a.m()) && e.get(this.f14505a.m()) != null) {
                i().a(e.get(this.f14505a.m()), this);
                e.remove(this.f14505a.m());
                this.f14505a.b((String) null);
            } else {
                q();
                a((Map<String, Object>) hashMap);
                i().a(this);
            }
            this.o = false;
            v();
        }
    }

    private void q() {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        try {
            Intent intent = getIntent();
            if (intent == null || (data = intent.getData()) == null || (queryParameter = data.getQueryParameter("queryParams")) == null) {
                return;
            }
            a((Map<String, Object>) JSONObject.parseObject(queryParameter));
        } catch (Exception e2) {
            jqg.a("OrderList", "appendQueryParamsFromOriginUriToCondition", e2.getMessage());
        }
    }

    private void a(Map<String, Object> map) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            try {
                String str = this.f14505a.h().l().get("condition");
                if (str == null) {
                    parseObject = new JSONObject();
                } else {
                    parseObject = JSONObject.parseObject(str);
                }
                parseObject.putAll(map);
                this.f14505a.h().l().put("condition", parseObject.toJSONString());
            } catch (Exception e2) {
                jqg.a(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), "appendParamsToCondition", e2.getMessage());
            }
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.f14505a.h().l().put("page", "1");
        this.f.e("true".equals(this.f14505a.C()));
        if (this.f14505a.q() != null) {
            this.f14505a.q().remove(CoreConstants.KEY_PAGE_CONTEXT);
            String a2 = com.taobao.android.purchase.aura.helper.a.a(this, false);
            if (!StringUtils.isEmpty(a2)) {
                this.f14505a.q().put("installApp", (Object) a2);
            }
            c_(this.f14505a.q());
            try {
                this.f14505a.h().l().put("condition", this.f14505a.q().toJSONString());
            } catch (JSONException e2) {
                hyq.a("resetRequestConfig", "RESET-CONFIG-ERROR", e2.toString());
            }
        }
        a(this.f14505a.h(), true);
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        ParallelBizValueHelper.PageType w = w();
        com.taobao.android.order.bundle.base.parallelbiz.a.a(w, "_Button-" + this.f14505a.j() + "-pullEndLoad", null);
        org.json.JSONObject jSONObject = this.p;
        if (jSONObject != null) {
            a(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
            this.f14505a.h().l().put("page", this.p.optString("nextPageIndex"));
        }
        a(this.f14505a.h(), false);
        this.x = System.currentTimeMillis();
        i().a(this);
    }

    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        org.json.JSONObject jSONObject = this.p;
        if (jSONObject != null) {
            a(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
        }
        a(map);
        a(this.f14505a.h(), false);
        this.x = System.currentTimeMillis();
        k();
        i().a(this);
    }

    private void a(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.f14505a.q() == null) {
        } else {
            try {
                this.f14505a.q().put(CoreConstants.KEY_PAGE_CONTEXT, (Object) jSONObject.toString());
                this.f14505a.h().l().put("condition", this.f14505a.q().toJSONString());
            } catch (Exception e2) {
                hyq.a("addPageContext", "ADD-PAC-ERROR", e2.toString());
            }
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void b(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23ccfc4", new Object[]{this, tBSwipeRefreshLayout});
        } else {
            this.b = tBSwipeRefreshLayout;
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(i());
        }
    }

    public void a(com.taobao.android.order.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f24e", new Object[]{this, gVar});
        } else {
            this.f14505a.a(gVar);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public com.taobao.android.order.core.g d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.g) ipChange.ipc$dispatch("ed5fe251", new Object[]{this});
        }
        OrderConfigs u = this.f14505a.u();
        if (u != null) {
            u.a(this);
            u.a((ViewGroup) this.f14505a.f());
            u.a((ViewPager) this.f14505a.d());
            u.a(this.f14505a.k());
            u.a(this.ab);
            u.b(this.f14505a.l());
            u.c((View) this.f14505a.r());
            u.a(this.f14505a.s());
            u.b(this.f14505a.E());
            u.a(this.f14505a.e());
            u.a(this.f14505a.p());
            u.c(this instanceof TBFoldedOrderListActivity);
            this.f = u;
        } else {
            this.f = this.f14505a.c(getIntent());
        }
        this.f.a(this.f14505a.D());
        this.f14505a.a((Bundle) null);
        com.taobao.android.order.bundle.nav.list.g.INSTANCE.a(false);
        return com.taobao.android.order.core.g.a(this.f);
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void updateCurrentContainView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2473c2", new Object[]{this, view});
        } else {
            this.k = view;
        }
    }

    private void a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f821c7", new Object[]{this, hVar, new Boolean(z)});
        } else if (hVar == null || OrderType.ORDERFILTER.getValue().equals(this.f14505a.n())) {
        } else {
            if (OrderType.ORDERSEARCH.getValue().equals(this.f14505a.n())) {
                hVar.e("orderList_search");
            } else {
                hVar.e(z ? "orderList_pageload" : "orderList_loadmore");
            }
        }
    }

    private void b(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
        } else if (c(jSONObject)) {
        } else {
            g(CoreConstants.UT_ORDER_LIST_SPM_CNT);
        }
    }

    private boolean c(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3638bc98", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("events");
            if (optJSONObject3 == null || optJSONObject3.length() == 0 || (optJSONObject = optJSONObject3.optJSONObject("utSPM")) == null || (optJSONObject2 = optJSONObject.optJSONObject("fields")) == null) {
                return false;
            }
            String optString = optJSONObject2.optString(jjj.SPM_A);
            String optString2 = optJSONObject2.optString(jjj.SPM_B);
            if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString2)) {
                g(String.format("%s.%s.0.0", optString, optString2));
                return true;
            }
            return false;
        } catch (Exception e2) {
            jqg.a(OrderBizCode.orderList, "updateSpmException", e2.getMessage());
            return false;
        }
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                Map<String, String> pageProperties = defaultTracker.getPageProperties(this);
                if (pageProperties == null) {
                    pageProperties = new HashMap<>();
                }
                pageProperties.put("spm-cnt", str);
                defaultTracker.updatePageProperties(this, pageProperties);
            } catch (Exception e2) {
                jqg.a(OrderBizCode.orderList, "updatePageSpmCntException", e2.getMessage());
            }
        }
    }

    private void d(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38120fb3", new Object[]{this, jSONObject});
        } else if (!OrderType.ORDERSEARCH.getValue().equals(this.f14505a.n())) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("searchKey", this.f14505a.g());
            String optString = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID);
            if (StringUtils.isEmpty(optString)) {
                return;
            }
            this.f.b(optString);
            hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, optString);
            hashMap.put("isSearchResult", "true");
            hashMap.put("recommend", StringUtils.equals(this.f14505a.z(), this.f14505a.g()) ? "1" : "0");
            String b = com.taobao.android.order.bundle.helper.g.b(getIntent(), "utLogMap");
            String b2 = com.taobao.android.order.bundle.helper.g.b(getIntent(), "utArgs");
            String b3 = com.taobao.android.order.bundle.helper.g.b(getIntent(), "utParam");
            try {
                if (!StringUtils.isEmpty(b)) {
                    hashMap.put("utLogMap", URLEncoder.encode(b, "UTF-8"));
                }
                if (!StringUtils.isEmpty(b2)) {
                    hashMap.put("utArgs", URLEncoder.encode(b2, "UTF-8"));
                }
                if (!StringUtils.isEmpty(b3)) {
                    hashMap.put("utParam", URLEncoder.encode(b3, "UTF-8"));
                }
            } catch (Throwable unused) {
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        }
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        if (this.f14505a.p() && (tBSwipeRefreshLayout = this.b) != null) {
            tBSwipeRefreshLayout.enablePullRefresh(false);
        }
        this.f14505a.c(false);
        long currentTimeMillis = System.currentTimeMillis();
        u();
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.f.d().b(this.k);
            if (mtopResponse.getDataJsonObject() != null && mtopResponse.getDataJsonObject().optJSONObject("global") != null) {
                org.json.JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global");
                b(optJSONObject);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("globalUtArgs");
                if (optJSONObject2 != null) {
                    d(optJSONObject2);
                }
                if (StringUtils.isEmpty(this.f14505a.C())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        this.f14505a.d("true");
                        this.f14505a.h().l().put("forceBoughtlist4", "true");
                        this.f14505a.d().setBackgroundColor(Color.parseColor("#F3F6F8"));
                    } else {
                        this.f14505a.d("false");
                    }
                }
                this.p = optJSONObject.optJSONObject("pageControl");
                if (this.p != null) {
                    if (optJSONObject.optJSONObject("recommendData") != null) {
                        this.q = optJSONObject.optJSONObject("recommendData");
                    }
                    this.f14505a.a(optJSONObject, (JSONObject) null);
                    a(orderRecyclerView, this.p.optString("hasMore"), mtopResponse.getDataJsonObject().optString(TBSearchChiTuJSBridge.ABTEST));
                    a(currentTimeMillis, optJSONObject2, mtopResponse.getDataJsonObject().optJSONObject("hierarchy"));
                }
                org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("tocDegradeInfo");
                if (optJSONObject3 != null) {
                    this.g = StringUtils.equals("true", optJSONObject3.optString("isCloseTradeItemDetailTimeout"));
                }
                if (orderRecyclerView != null) {
                    orderRecyclerView.resetScroll();
                }
                if (optJSONObject.optJSONObject("routeControl") != null) {
                    String optString = optJSONObject.optJSONObject("routeControl").optString("taoTmRoute");
                    if (!StringUtils.isEmpty(optString)) {
                        JSONObject parseObject = JSONObject.parseObject(this.f14505a.h().l().get("condition"));
                        parseObject.put("taoTmRoute", (Object) optString);
                        this.f14505a.h().l().put("condition", parseObject.toJSONString());
                    }
                }
                if (PageStatus.FIRST_PAGE.equals(pageStatus) && OrderType.ORDERLIST.getValue().equals(this.f14505a.n())) {
                    com.taobao.android.order.bundle.cache.a.a(this, this.f14505a.j(), mtopResponse.getDataJsonObject(), this.q != null ? this.q.optString("orderIdsStr") : null, this.f14505a.t() != null);
                    this.f14505a.a((RecyclerView) orderRecyclerView);
                    a(optJSONObject, this.f14505a.t());
                }
                this.f14505a.a(this, mtopResponse, this.f14505a.c(orderRecyclerView));
                this.P.a(mtopResponse);
                a(orderRecyclerView);
                this.f14505a.a(this, pageStatus);
                this.f14505a.c((JSONObject) null);
                this.f14505a.b(false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return true;
        }
        return I().b().b("feedStream") != null;
    }

    private void a(OrderRecyclerView orderRecyclerView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd849ce7", new Object[]{this, orderRecyclerView, str, str2});
        } else if (this.f14505a.A()) {
            G();
        } else if ("true".equals(str)) {
            OrderRecommendWrapper orderRecommendWrapper = this.i;
            if (orderRecommendWrapper == null) {
                return;
            }
            orderRecyclerView.removeEndView(orderRecommendWrapper.e());
        } else {
            this.b.enableLoadMore(false);
            try {
                if (this.i != null) {
                    orderRecyclerView.removeEndView(this.i.e());
                    this.i.d();
                    this.i = null;
                    orderRecyclerView.removeAllEndViews();
                }
                JSONObject jSONObject = new JSONObject();
                if (!StringUtils.isEmpty(this.f14505a.z()) && StringUtils.equals(this.f14505a.z(), this.f14505a.g())) {
                    jSONObject.put(com.taobao.android.order.bundle.helper.rec.c.PARAM_REC_QUERY, (Object) this.f14505a.z());
                    jSONObject.put("channelSrp", (Object) "gouhou_searchfg");
                } else if (!StringUtils.isEmpty(this.f14505a.g())) {
                    jSONObject.put(com.taobao.android.order.bundle.helper.rec.c.PARAM_REC_QUERY, (Object) this.f14505a.g());
                }
                this.i = new OrderRecommendWrapper(orderRecyclerView, this, this.f14505a.B() ? OrderRecommendWrapper.RecType.MAIN_SEARCH : OrderRecommendWrapper.RecType.GUESS, jSONObject);
                this.i.a();
                com.taobao.android.order.bundle.helper.rec.a f = this.i.f();
                if ("true".equals(this.f14505a.C()) && (f instanceof com.taobao.android.order.bundle.helper.rec.b)) {
                    ((com.taobao.android.order.bundle.helper.rec.b) f).b("#FFFFFF");
                }
                if (this.q == null || !e()) {
                    return;
                }
                jSONObject.putAll(JSONObject.parseObject(this.q.toString()));
                this.i.a(jSONObject, str2);
            } catch (Throwable unused) {
            }
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        try {
            g(CoreConstants.UT_ORDER_LIST_SPM_CNT);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", CoreConstants.UT_ORDER_LIST_SPM_CNT);
            defaultTracker.updateNextPageProperties(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.R = false;
        l();
        f();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.b;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            this.b.setLoadMore(false);
        }
        this.f14505a.d().setIsCanScroll(true);
        bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadSuccess").a(true));
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        u();
        if (jSONObject == null) {
            return;
        }
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.f.d().b(this.k);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("global");
            if (jSONObject2 != null && jSONObject3 != null) {
                if (StringUtils.equals("true", OrangeConfig.getInstance().getConfig("babelorder", "orderDetailFilterEnablePreRender", "true"))) {
                    this.f14505a.a(this, jSONObject, this.f14505a.c(orderRecyclerView));
                }
                if (jSONObject3.getJSONObject("pageControl") != null) {
                    this.p = new org.json.JSONObject(jSONObject3.getJSONObject("pageControl"));
                    if (jSONObject3.getJSONObject("recommendData") != null) {
                        this.q = new org.json.JSONObject(jSONObject3.getJSONObject("recommendData"));
                    }
                    this.f14505a.a((org.json.JSONObject) null, jSONObject3);
                    a(orderRecyclerView, this.p.optString("hasMore"), jSONObject2.getString(TBSearchChiTuJSBridge.ABTEST));
                    a(currentTimeMillis, new org.json.JSONObject(jSONObject3.getJSONObject("globalUtArgs")), new org.json.JSONObject(jSONObject2.getJSONObject("hierarchy")));
                }
                if (orderRecyclerView == null) {
                    return;
                }
                orderRecyclerView.resetScroll();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(final org.json.JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686ec75a", new Object[]{this, jSONObject, jSONObject2});
        } else {
            jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String string;
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject3 = jSONObject2;
                    if (jSONObject3 == null) {
                        string = jSONObject.optString("orderCount");
                    } else {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("global");
                        if (jSONObject4 == null) {
                            return;
                        }
                        string = jSONObject4.getString("orderCount");
                    }
                    if (StringUtils.isEmpty(string)) {
                        return;
                    }
                    try {
                        i = Integer.parseInt(string);
                    } catch (Exception unused) {
                    }
                    s.f18233a.b(TBOrderListActivity.this).a("bizStage", i >= 4 ? "itemCountMoreThan4" : "itemCountNoMoreThan4");
                }
            });
        }
    }

    private void a(long j, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6691c71c", new Object[]{this, new Long(j), jSONObject, jSONObject2});
            return;
        }
        long j2 = this.x;
        if (j2 == -1) {
            return;
        }
        long j3 = j - j2;
        HashMap hashMap = new HashMap();
        hashMap.put("costTime", String.valueOf(j3));
        org.json.JSONObject jSONObject3 = this.p;
        if (jSONObject3 != null) {
            hashMap.put("nextPageIndex", jSONObject3.optString("nextPageIndex"));
            hashMap.put("hasMore", this.p.optString("hasMore"));
            if ("true".equals(this.p.optString("emptyPage"))) {
                hashMap.put("orderCount", "0");
            }
        }
        if (jSONObject != null) {
            hashMap.put("tabType", jSONObject.optString("tabType"));
            hashMap.put("isSearchResult", jSONObject.optString("isSearchResult"));
        }
        org.json.JSONObject optJSONObject = jSONObject2 == null ? null : jSONObject2.optJSONObject("structure");
        if (!hashMap.containsKey("orderCount") && optJSONObject != null && optJSONObject.optJSONArray("boughtlist") != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("boughtlist");
            int i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                if (!StringUtils.isEmpty(optJSONArray.optString(i2)) && optJSONArray.optString(i2).startsWith("MainGroup")) {
                    i++;
                }
            }
            hashMap.put("orderCount", String.valueOf(i));
        }
        hyq.a(this, "BabelOrderList", "", hashMap);
        this.x = -1L;
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadError(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
            return;
        }
        this.R = false;
        if (mtopResponse == null) {
            return;
        }
        this.b.setRefreshing(false);
        this.b.setLoadMore(false);
        this.f14505a.d().setIsCanScroll(true);
        if (mtopResponse.isApiSuccess()) {
            if (hyk.k()) {
                a(mtopResponse, "ReturnH5");
                bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadError：isApiSuccess and enableDowngradeToH5").a(false));
                return;
            }
            b(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
        } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
            if (hvn.b()) {
                if (this.p != null && !"1".equals(this.f14505a.h().l().get("page"))) {
                    kpn.a(this, mtopResponse.getRetMsg());
                } else {
                    try {
                        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableBlockErrorView", true) && (b = this.f14505a.b((OrderRecyclerView) this.f.d().b(this.k))) != null) {
                            if (!b.isEmpty()) {
                                z = false;
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (!this.f14505a.l() && z) {
                        if (StringUtils.isEmpty(this.f14505a.g())) {
                            this.f14505a.a(hyj.b());
                        } else {
                            this.f14505a.a(hyj.c());
                        }
                        i().b();
                        i().a(this.f14505a.i(), this);
                        a(mtopResponse);
                    } else {
                        kpn.a(this, mtopResponse.getRetMsg());
                    }
                    this.f14505a.b(false);
                }
                l();
            } else {
                b(mtopResponse, mtopResponse.getRetCode());
            }
            hyq.a(this, "TBOrderListActivity", mtopResponse);
        } else if (!"ReturnH5".equals(mtopResponse.getRetCode())) {
        } else {
            a(mtopResponse, "ReturnH5");
            bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadError：retCode == ReturnH5").a(false));
        }
    }

    private void a(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dca6b7", new Object[]{this, mtopResponse, str});
            return;
        }
        hyq.a(this, "TBOrderListActivity", "OrderList", str + "-" + this.f14505a.j(), this.f14505a.j(), mtopResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("DownGradeTOH5List downGrade = ");
        sb.append(str);
        hyn.a("TBOrderListActivity", "handleMtopResponseByH5", sb.toString());
        d.d(this, this.f14505a.j(), str);
        overridePendingTransition(0, 0);
        finish();
    }

    private void b(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c70afb8", new Object[]{this, mtopResponse, str});
            return;
        }
        org.json.JSONObject jSONObject = this.p;
        if (jSONObject != null && !"1".equals(jSONObject.optString("nextPageIndex"))) {
            str = CoreConstants.DOWNGRADLE_V2TOV1_NONE_FIRST;
            hyq.a(this, "TBOrderListActivity", "OrderList", str + "-" + this.f14505a.j(), this.f14505a.j(), (MtopResponse) null);
        } else {
            hyq.a(this, "TBOrderListActivity", "OrderList", str + "-" + this.f14505a.j(), this.f14505a.j(), mtopResponse);
        }
        if (StringUtils.isEmpty(com.taobao.android.order.bundle.helper.g.c(getIntent()))) {
            d.a(this, this.f14505a.j(), str);
        } else {
            d.b(this, this.f14505a.g(), str);
        }
        overridePendingTransition(0, 0);
        finish();
    }

    @Override // com.taobao.android.order.core.c
    public void onReloadRequested(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        } else if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.o = true;
        } else if (this.r) {
            this.o = true;
        } else {
            HashMap<String, Object> hashMap = null;
            if (jSONObject != null && this.f14505a.q() != null) {
                try {
                    HashMap<String, Object> hashMap2 = new HashMap<>(jSONObject);
                    try {
                        this.f14505a.q().putAll(hashMap2);
                        hashMap = hashMap2;
                    } catch (Exception e2) {
                        e = e2;
                        hashMap = hashMap2;
                        e.printStackTrace();
                        a("NativeRefresh", hashMap);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            a("NativeRefresh", hashMap);
        }
    }

    private TBErrorView E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("fc40eaa5", new Object[]{this});
        }
        View view = this.k;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            return (TBErrorView) this.k.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        }
        return (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
    }

    private TBErrorView s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("1f404353", new Object[]{this});
        }
        if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", false)) {
            return E();
        }
        View view = this.k;
        if (view == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.order_list_error_view);
        if (viewGroup == null) {
            return E();
        }
        TBErrorView tBErrorView = new TBErrorView(this);
        viewGroup.addView(tBErrorView);
        viewGroup.setVisibility(0);
        return tBErrorView;
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        TBErrorView s = s();
        if (s == null) {
            return;
        }
        s.setTopic("order_list");
        if (mtopResponse != null) {
            s.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
        s.setVisibility(0);
        s.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.order_biz_refresh), new View.OnClickListener() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBOrderListActivity.l(TBOrderListActivity.this);
                TBOrderListActivity.this.i().b();
                TBOrderListActivity.this.i().a(TBOrderListActivity.this);
            }
        });
    }

    public void f() {
        TBErrorView tBErrorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.k == null) {
        } else {
            if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", true)) {
                ViewGroup viewGroup = (ViewGroup) this.k.findViewById(R.id.order_list_error_view);
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
            } else if (((ViewStub) this.k.findViewById(R.id.order_list_view_stub)) != null || (tBErrorView = (TBErrorView) this.k.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view)) == null) {
            } else {
                tBErrorView.setVisibility(8);
            }
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
        this.r = true;
        p pVar = this.K;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        if (this.ab != null) {
            this.ab.a(true, false, "首屏退出");
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar != null && qpfVar.F() != null) {
            this.f14505a.a(TradeHybridTMSFragment.b.c.INSTANCE);
        }
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.a(w()), null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        p pVar = this.K;
        if (pVar != null) {
            pVar.onActivityStop();
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.f14505a.a(TradeHybridTMSFragment.b.f.INSTANCE);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity
    public BroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("9ef5465f", new Object[]{this}) : this.S;
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        ibo iboVar = this.P;
        if (iboVar == null) {
            return;
        }
        iboVar.b(cts.a.BIZ_ORDER_DETAIL);
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this}) : hyt.a((g.a) this, this.l);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this}) : this.n_;
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f14505a.j();
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        OrderRecommendWrapper orderRecommendWrapper = this.i;
        if (orderRecommendWrapper == null) {
            return;
        }
        orderRecommendWrapper.b();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (bxd.a("enableWXNavToHomePage", true) && isTaskRoot()) {
            Nav.from(this).disableTransition().toUri("http://m.taobao.com/index.htm");
            jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBOrderListActivity.m(TBOrderListActivity.this);
                    }
                }
            }, 100L);
        } else {
            super.finish();
        }
        OrderRecommendWrapper orderRecommendWrapper = this.i;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.b();
            this.i.d();
        }
        Long l = 0L;
        if (this.ab != null) {
            l = this.ab.f();
        }
        if (this.j != null) {
            if (l.longValue() > 0) {
                this.j.c_(l);
            }
            this.j.c();
        }
        a(false);
        hyn.a("TBOrderListActivity", "finish", new String[0]);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!OrderType.ORDERLIST.getValue().equals(this.f14505a.n())) {
        } else {
            if (z) {
                jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            scn.a();
                        } catch (Throwable th) {
                            jqg.b("OrderList", "processRecPreRequest: " + th.toString());
                        }
                    }
                });
            } else {
                scn.b();
            }
        }
    }

    private void v() {
        com.taobao.android.order.core.d d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        OrderConfigs orderConfigs = this.f;
        if (orderConfigs == null || (d = orderConfigs.d()) == null) {
            return;
        }
        d.a(this.k, true ^ StringUtils.equals(this.f14505a.j(), TabType.REFUND.getValue()));
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f14505a.a(ibn.a(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
        this.f14505a.s().setPrefetchCache(this.O);
        if (this.s == null) {
            this.s = new a(ParallelBizValueHelper.PageType.order_detail);
        }
        this.f14505a.s().setFragmentLifeCycleListener(this.s);
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.P = new ibo(this.O);
        }
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (!ibl.z()) {
            jqg.a("TBOrderListActivity", "initLogisticsWeex2Fragment", "switcher is off");
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f14505a.b(ibn.a(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.logistics_detail), ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
            if (this.t == null) {
                this.t = new a(ParallelBizValueHelper.PageType.logistics_detail);
            }
            this.f14505a.E().setFragmentLifeCycleListener(this.t);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.f14505a.s() != null && this.f14505a.s().onKeyDown(i, keyEvent)) {
            return true;
        }
        if (this.f14505a.E() != null && this.f14505a.E().onKeyDown(i, keyEvent)) {
            return true;
        }
        if (this.f14505a.F() != null && this.f14505a.F().onKeyDown(Integer.valueOf(i), keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // tb.tey
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = this.N;
        if (hashMap == null) {
            return;
        }
        hashMap.remove(str);
    }

    @Override // tb.tey
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.N == null) {
            this.N = new HashMap<>();
        }
        this.N.put(str, obj);
    }

    @Override // tb.tey
    public Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.N;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    @Override // tb.rhz
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (this.ab == null) {
            jqg.b(com.taobao.android.order.core.dinamicX.view.g.TAG, "tracker is null");
        } else {
            this.ab.c().put("cache_img_load_end_time", Long.valueOf(System.currentTimeMillis()));
            this.ab.b(true);
            this.ab.a();
            jqg.b(com.taobao.android.order.core.dinamicX.view.g.TAG, "图片缓存命中");
        }
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (this.g) {
            jqg.a("TBOrderListActivity", "prefetchWhenResponse", "server degrade");
            if (this.h) {
                return;
            }
            H();
            this.h = true;
        } else {
            org.json.JSONObject jSONObject = this.p;
            if (jSONObject != null) {
                try {
                    if (Integer.parseInt(jSONObject.optString("nextPageIndex")) - 1 > ibl.h()) {
                        jqg.a("TBOrderListActivity", "prefetchWhenResponse", "invalid page");
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            if (recyclerView == null || !(recyclerView.getAdapter() instanceof nkj) || !(((nkj) recyclerView.getAdapter()).c() instanceof bnn)) {
                jqg.a("TBOrderListActivity", "prefetchWhenResponse", "invalid recyclerView");
                return;
            }
            qpf qpfVar = this.f14505a;
            List<IDMComponent> b = qpfVar == null ? null : qpfVar.b(recyclerView);
            if (b == null || b.isEmpty()) {
                jqg.a("TBOrderListActivity", "prefetchWhenResponse", "no components");
                return;
            }
            int n = ibl.n();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : b) {
                if (arrayList.size() >= n) {
                    break;
                } else if (iDMComponent != null && StringUtils.equals(iDMComponent.getTag(), "item")) {
                    arrayList.add(iDMComponent);
                }
            }
            this.P.a(arrayList, this.f);
        }
    }

    @Override // com.taobao.tao.m
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !bxd.a("removeActionbarConfig", true);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a
    public boolean displayByTMSHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea604cbe", new Object[]{this, str})).booleanValue();
        }
        qpf qpfVar = this.f14505a;
        if (qpfVar == null) {
            return false;
        }
        return qpfVar.a((Activity) this, str);
    }

    /* loaded from: classes6.dex */
    public class a implements com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g = false;
        private ParallelBizValueHelper.PageType h;

        static {
            kge.a(1559096798);
            kge.a(539449516);
        }

        public a(ParallelBizValueHelper.PageType pageType) {
            this.h = pageType;
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a
        public void b(DialogFragment dialogFragment, p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f13d726c", new Object[]{this, dialogFragment, pVar});
                return;
            }
            try {
                if (q.a("WebAppInterface") == null) {
                    q.a("WebAppInterface", (Class<? extends e>) WebAppInterface.class, true);
                    this.g = true;
                } else {
                    jqg.b("TBOrderListActivity", "WebAppInterface is registered!");
                }
                if (pVar != null) {
                    if (TBOrderListActivity.n(TBOrderListActivity.this) == null) {
                        TBOrderListActivity.a(TBOrderListActivity.this, new b());
                        TBOrderListActivity.n(TBOrderListActivity.this).a(TBOrderListActivity.this.getPublicMenu());
                    }
                    if (pVar.getTag("ali_ms_navigation") == null) {
                        pVar.setTag("ali_ms_navigation", TBOrderListActivity.n(TBOrderListActivity.this));
                    }
                }
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(TBOrderListActivity.this);
                if (pageAllProperties != null && !pageAllProperties.isEmpty()) {
                    String str = "";
                    this.b = StringUtils.isEmpty(pageAllProperties.get("spm-cnt")) ? str : pageAllProperties.get("spm-cnt");
                    this.c = StringUtils.isEmpty(pageAllProperties.get("spm-url")) ? str : pageAllProperties.get("spm-url");
                    this.d = StringUtils.isEmpty(pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE)) ? str : pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE);
                    this.e = StringUtils.isEmpty(pageAllProperties.get(ag.KEY_UTPARAM_URL)) ? str : pageAllProperties.get(ag.KEY_UTPARAM_URL);
                    if (!StringUtils.isEmpty(pageAllProperties.get("utparam-pre"))) {
                        str = pageAllProperties.get("utparam-pre");
                    }
                    this.f = str;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: Throwable -> 0x007a, TryCatch #0 {Throwable -> 0x007a, blocks: (B:6:0x0018, B:9:0x0025, B:16:0x0044, B:18:0x004e, B:21:0x0055, B:23:0x0059, B:27:0x0067, B:31:0x0075, B:30:0x0073, B:26:0x0065, B:14:0x0037, B:15:0x003e), top: B:36:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: Throwable -> 0x007a, TryCatch #0 {Throwable -> 0x007a, blocks: (B:6:0x0018, B:9:0x0025, B:16:0x0044, B:18:0x004e, B:21:0x0055, B:23:0x0059, B:27:0x0067, B:31:0x0075, B:30:0x0073, B:26:0x0065, B:14:0x0037, B:15:0x003e), top: B:36:0x0018 }] */
        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.support.v4.app.DialogFragment r6, com.taobao.android.weex_framework.p r7) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.TBOrderListActivity.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L18
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4 = 0
                r1[r4] = r5
                r1[r3] = r6
                r1[r2] = r7
                java.lang.String r6 = "10c41c6b"
                r0.ipc$dispatch(r6, r1)
                return
            L18:
                com.ut.mini.l r6 = com.ut.mini.l.getInstance()     // Catch: java.lang.Throwable -> L7a
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: java.lang.Throwable -> L7a
                com.ut.mini.l$c r6 = r6.getOrNewUTPageStateObject(r7)     // Catch: java.lang.Throwable -> L7a
                if (r6 != 0) goto L25
                return
            L25:
                int[] r7 = com.taobao.android.order.bundle.TBOrderListActivity.AnonymousClass13.f14509a     // Catch: java.lang.Throwable -> L7a
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r0 = r5.h     // Catch: java.lang.Throwable -> L7a
                int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L7a
                r7 = r7[r0]     // Catch: java.lang.Throwable -> L7a
                java.lang.String r0 = ""
                if (r7 == r3) goto L3e
                if (r7 == r2) goto L37
                r7 = r0
                goto L44
            L37:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.b(r7)     // Catch: java.lang.Throwable -> L7a
                goto L44
            L3e:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.order_detail     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.b(r7)     // Catch: java.lang.Throwable -> L7a
            L44:
                r6.mSpmCnt = r7     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = r5.b     // Catch: java.lang.Throwable -> L7a
                boolean r7 = android.text.StringUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7a
                if (r7 != 0) goto L58
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = r5.h     // Catch: java.lang.Throwable -> L7a
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r1 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: java.lang.Throwable -> L7a
                if (r7 != r1) goto L55
                goto L58
            L55:
                java.lang.String r7 = r5.b     // Catch: java.lang.Throwable -> L7a
                goto L59
            L58:
                r7 = r0
            L59:
                r6.mSpmUrl = r7     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = r5.c     // Catch: java.lang.Throwable -> L7a
                boolean r7 = android.text.StringUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7a
                if (r7 == 0) goto L65
                r7 = r0
                goto L67
            L65:
                java.lang.String r7 = r5.c     // Catch: java.lang.Throwable -> L7a
            L67:
                r6.mSpmPre = r7     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = r5.e     // Catch: java.lang.Throwable -> L7a
                boolean r7 = android.text.StringUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7a
                if (r7 == 0) goto L73
                r7 = r0
                goto L75
            L73:
                java.lang.String r7 = r5.e     // Catch: java.lang.Throwable -> L7a
            L75:
                r6.mUtparamPre = r7     // Catch: java.lang.Throwable -> L7a
                r6.mUtparamUrl = r0     // Catch: java.lang.Throwable -> L7a
                return
            L7a:
                r6 = move-exception
                r6.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListActivity.a.a(android.support.v4.app.DialogFragment, com.taobao.android.weex_framework.p):void");
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a
        public void c(DialogFragment dialogFragment, p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1b6c86d", new Object[]{this, dialogFragment, pVar});
                return;
            }
            try {
                TBOrderListActivity.b(TBOrderListActivity.this, (String) null);
                if (this.g) {
                    q.b("WebAppInterface");
                    this.g = false;
                }
                l.c orNewUTPageStateObject = l.getInstance().getOrNewUTPageStateObject(TBOrderListActivity.this);
                if (orNewUTPageStateObject == null) {
                    return;
                }
                String str = "";
                orNewUTPageStateObject.mSpmCnt = !StringUtils.isEmpty(this.b) ? this.b : str;
                orNewUTPageStateObject.mSpmPre = !StringUtils.isEmpty(this.d) ? this.d : str;
                orNewUTPageStateObject.mUtparamPre = !StringUtils.isEmpty(this.f) ? this.f : str;
                orNewUTPageStateObject.mUtparamUrl = !StringUtils.isEmpty(this.e) ? this.e : str;
                if (!StringUtils.isEmpty(this.c)) {
                    str = this.c;
                }
                orNewUTPageStateObject.mSpmUrl = str;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
