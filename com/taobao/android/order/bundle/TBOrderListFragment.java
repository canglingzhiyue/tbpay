package com.taobao.android.order.bundle;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.helper.WvOrderPlugin;
import com.taobao.android.order.bundle.helper.d;
import com.taobao.android.order.bundle.helper.j;
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
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.m;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
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
import tb.bip;
import tb.bnn;
import tb.bwx;
import tb.bxb;
import tb.bxd;
import tb.bxi;
import tb.cts;
import tb.cup;
import tb.dtz;
import tb.esy;
import tb.gbg;
import tb.hvn;
import tb.hvo;
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
import tb.jpr;
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
import tb.spk;
import tb.tey;

/* loaded from: classes6.dex */
public class TBOrderListFragment extends SupportSecondaryBaseFragment implements com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a, g.a, com.taobao.android.order.core.c, m, bwx, rhz, tey {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEED_HIDE_BACK_BTN = "hide_back_btn";
    public static final String KEY_ORIGIN_INTENT = "originActivityIntent";
    private static final String TAG = "TBOrderListFragment";
    private static HashMap<String, JSONObject> presetResponse;
    private View contentView;
    private View currentContainView;
    private ParallelBizValueHelper.PageType currentPageType;
    private RecyclerView currentRecyclerView;
    private TBSwipeRefreshLayout currentRefreshLayout;
    private boolean isFirstScreen;
    private hyy loadingHolder;
    private LocalBroadcastManager localBroadcast;
    private String mDetailClickTime;
    private String mDetailPageUserInfo;
    private FragmentActivity mFragmentActivity;
    private Intent mInIntent;
    private f mListContainerScrollListener;
    private a mLogisticsDetailLifecycleImpl;
    private OrderConfigs mOrderConfigs;
    private com.taobao.android.order.core.g mOrderCoreEngine;
    private a mOrderDetailLifecycleImpl;
    private ria mOrderPerformanceTracker;
    private ibo mOrderWeex2PrefetchDataManager;
    private p mRefundMUSInstance;
    private b mTBOrderDetailWeexNavAdapter;
    private qpf mViewModel;
    private Map<String, Object> refreshConditionExtraParams;
    private RecyclerView.OnScrollListener rvScrollListener;
    public final esy mSwitcher = new esy();
    private boolean needRefresh = true;
    private org.json.JSONObject pageInfoJson = null;
    private org.json.JSONObject recommendJson = null;
    private boolean isActivityPaused = true;
    private OrderRecommendWrapper recommendHelper = null;
    private long requestStartTime = -1;
    private HashMap<String, Object> mPageStorageForDX = null;
    private UltronWeex2DataPrefetchCache mUltronWeex2DataPrefetchCache = new UltronWeex2DataPrefetchCache();
    public boolean batchODetailDegrade = false;
    public boolean hasClearedODetailCache = false;
    public BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.1
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
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.TBOrderListFragment.AnonymousClass1.$ipChange
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
                java.lang.String r1 = "TBOrderListFragment"
                java.lang.String r4 = "BroadcastReceiver"
                tb.hyn.a(r1, r4, r0)
                java.lang.String r0 = "orderListNeedRefreshAction"
                boolean r6 = r0.equals(r6)
                if (r6 == 0) goto L46
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this
                com.taobao.android.order.bundle.TBOrderListFragment.access$000(r6)
                return
            L46:
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListFragment.access$100(r6)     // Catch: java.lang.Exception -> L9a
                java.lang.String r6 = "orderListNeedRefresh"
                boolean r6 = r7.getBooleanExtra(r6, r3)     // Catch: java.lang.Exception -> L9a
                if (r6 != 0) goto L54
                return
            L54:
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListFragment.access$202(r6, r2)     // Catch: java.lang.Exception -> L9a
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
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                java.lang.String r0 = "EventRefresh"
                com.taobao.android.order.bundle.TBOrderListFragment.access$300(r7, r0, r6)     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListFragment.access$402(r6, r1)     // Catch: java.lang.Exception -> L9a
                goto L9a
            L7d:
                if (r6 == 0) goto L9a
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                tb.qpf r7 = com.taobao.android.order.bundle.TBOrderListFragment.access$500(r7)     // Catch: java.lang.Exception -> L9a
                java.lang.String r7 = r7.j()     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.constants.TabType r0 = com.taobao.android.order.bundle.constants.TabType.ALL     // Catch: java.lang.Exception -> L9a
                java.lang.String r0 = r0.getValue()     // Catch: java.lang.Exception -> L9a
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L9a
                if (r7 == 0) goto L9a
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Exception -> L9a
                com.taobao.android.order.bundle.TBOrderListFragment.access$402(r7, r6)     // Catch: java.lang.Exception -> L9a
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListFragment.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    private BroadcastReceiver aliPayReceiver = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TextUtils.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS", intent.getAction()) || context == null) {
                bxb.a(bxb.a.b(OrderBizCode.orderList, "payResultOfList").a(1.0f).a("支付失败").a(false));
            } else {
                TBOrderListFragment.access$100(TBOrderListFragment.this);
                com.taobao.android.order.bundle.helper.a.a(context.getApplicationContext(), false);
                com.taobao.android.order.bundle.helper.a.b(context.getApplicationContext(), false);
                bxb.a(bxb.a.b(OrderBizCode.orderList, "payResultOfList").a(0.1f).a("支付成功").a(true));
            }
        }
    };
    private boolean isLoadingMore = false;

    /* renamed from: com.taobao.android.order.bundle.TBOrderListFragment$9  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14529a = new int[ParallelBizValueHelper.PageType.values().length];

        static {
            try {
                f14529a[ParallelBizValueHelper.PageType.order_detail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14529a[ParallelBizValueHelper.PageType.logistics_detail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TBOrderListFragment tBOrderListFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    public static /* synthetic */ void access$000(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ad9e35", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.waitPayDowngradeBroadcast();
        }
    }

    public static /* synthetic */ void access$100(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb16994", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.clearODetailPrefetchData();
        }
    }

    public static /* synthetic */ View access$1000(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b1c9b28", new Object[]{tBOrderListFragment}) : tBOrderListFragment.currentContainView;
    }

    public static /* synthetic */ f access$1100(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1e1f70cc", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mListContainerScrollListener;
    }

    public static /* synthetic */ boolean access$1200(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9066a728", new Object[]{tBOrderListFragment})).booleanValue() : tBOrderListFragment.isLoadingMore;
    }

    public static /* synthetic */ boolean access$1202(TBOrderListFragment tBOrderListFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dda89b6", new Object[]{tBOrderListFragment, new Boolean(z)})).booleanValue();
        }
        tBOrderListFragment.isLoadingMore = z;
        return z;
    }

    public static /* synthetic */ org.json.JSONObject access$1300(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("78f383f1", new Object[]{tBOrderListFragment}) : tBOrderListFragment.pageInfoJson;
    }

    public static /* synthetic */ void access$1400(TBOrderListFragment tBOrderListFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4968732c", new Object[]{tBOrderListFragment, str});
        } else {
            tBOrderListFragment.loadData(str);
        }
    }

    public static /* synthetic */ com.taobao.android.order.core.g access$1500(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.order.core.g) ipChange.ipc$dispatch("1ddc60a7", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mOrderCoreEngine;
    }

    public static /* synthetic */ b access$1600(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("468aca66", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mTBOrderDetailWeexNavAdapter;
    }

    public static /* synthetic */ b access$1602(TBOrderListFragment tBOrderListFragment, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2e7b6dbe", new Object[]{tBOrderListFragment, bVar});
        }
        tBOrderListFragment.mTBOrderDetailWeexNavAdapter = bVar;
        return bVar;
    }

    public static /* synthetic */ String access$1702(TBOrderListFragment tBOrderListFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92a238b9", new Object[]{tBOrderListFragment, str});
        }
        tBOrderListFragment.mDetailPageUserInfo = str;
        return str;
    }

    public static /* synthetic */ boolean access$202(TBOrderListFragment tBOrderListFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("825db5c7", new Object[]{tBOrderListFragment, new Boolean(z)})).booleanValue();
        }
        tBOrderListFragment.needRefresh = z;
        return z;
    }

    public static /* synthetic */ void access$300(TBOrderListFragment tBOrderListFragment, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a91a97", new Object[]{tBOrderListFragment, str, hashMap});
        } else {
            tBOrderListFragment.loadData(str, hashMap);
        }
    }

    public static /* synthetic */ Map access$402(TBOrderListFragment tBOrderListFragment, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3772c16b", new Object[]{tBOrderListFragment, map});
        }
        tBOrderListFragment.refreshConditionExtraParams = map;
        return map;
    }

    public static /* synthetic */ qpf access$500(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpf) ipChange.ipc$dispatch("4357bc2f", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mViewModel;
    }

    public static /* synthetic */ FragmentActivity access$600(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("526c0882", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mFragmentActivity;
    }

    public static /* synthetic */ String access$700(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0955c92", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mDetailClickTime;
    }

    public static /* synthetic */ p access$802(TBOrderListFragment tBOrderListFragment, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("349be47f", new Object[]{tBOrderListFragment, pVar});
        }
        tBOrderListFragment.mRefundMUSInstance = pVar;
        return pVar;
    }

    public static /* synthetic */ OrderConfigs access$900(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("5739c03a", new Object[]{tBOrderListFragment}) : tBOrderListFragment.mOrderConfigs;
    }

    static {
        kge.a(1073187797);
        kge.a(-1056043576);
        kge.a(24233887);
        kge.a(-1603490154);
        kge.a(477856532);
        kge.a(1515948808);
        kge.a(-259503857);
        kge.a(1220076611);
        presetResponse = new HashMap<>(4);
    }

    private void waitPayDowngradeBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dee2526", new Object[]{this});
        } else if (this.mViewModel.q() == null) {
        } else {
            this.mViewModel.q().put("waitPayDowngrade", (Object) "true");
            loadData("WaitPayDowngrade");
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (cup.d()) {
            AsyncInstanceLoadManager.INSTANCE.b();
        }
        this.mFragmentActivity = getActivity();
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        if (fragmentActivity != null && fragmentActivity.getWindow() != null) {
            this.mFragmentActivity.getWindow().setFormat(-3);
        }
        bxb.a(OrderBizCode.orderList, 0.001f);
        this.currentPageType = ParallelBizValueHelper.PageType.order_list;
        if (getArguments() != null && (getArguments().get("originActivityIntent") instanceof Intent)) {
            this.mInIntent = (Intent) getArguments().get("originActivityIntent");
        } else {
            this.mInIntent = this.mFragmentActivity.getIntent();
        }
        String c = ParallelBizValueHelper.c(this.currentPageType);
        jpr.a(c);
        jqi.a("tborder", this.mSwitcher);
        jqi.a(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), this.mSwitcher);
        trackStartAndNavStage(c, bundle);
        this.mViewModel = com.taobao.android.order.bundle.nav.list.g.INSTANCE.a();
        qpf qpfVar = this.mViewModel;
        if (qpfVar == null || !qpfVar.c()) {
            this.mViewModel = new qpf(this.mFragmentActivity);
        }
        this.mViewModel.a(this.mOrderPerformanceTracker);
        Intent intent = this.mInIntent;
        if (intent != null) {
            d.a(this.mFragmentActivity, intent);
        }
        hvo.a(this.mFragmentActivity.getApplicationContext());
        q.a(CoreConstants.ORDER_WV_TB_ODER, (Class<? extends e>) WvOrderPlugin.class, true);
        initParams();
        if (this.mViewModel.p()) {
            if (!TBRefundInstanceManager.isNetStart()) {
                TBRefundInstanceManager.startPreRequestOnIdle();
            }
            this.mViewModel.a(new FrameLayout(this.mFragmentActivity));
            if (cup.d()) {
                AsyncInstanceLoadManager.INSTANCE.b(new AsyncInstanceLoadManager.a() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
                    public void a(boolean z, p pVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2ea220a1", new Object[]{this, new Boolean(z), pVar});
                        } else if (!z || pVar == null) {
                            TBOrderListFragment tBOrderListFragment = TBOrderListFragment.this;
                            TBOrderListFragment.access$802(tBOrderListFragment, TBRefundInstanceManager.refundWeex2PreRender(TBOrderListFragment.access$600(tBOrderListFragment), TBOrderListFragment.access$500(TBOrderListFragment.this).r(), TBOrderListFragment.access$500(TBOrderListFragment.this).o(), new TBRefundInstanceManager.a(TBOrderListFragment.access$500(TBOrderListFragment.this).v(), true, true, Boolean.valueOf("true".equals(TBOrderListFragment.access$500(TBOrderListFragment.this).C())))));
                        } else {
                            TBRefundInstanceManager.INSTANCE.prepareReloadInstance(TBOrderListFragment.access$600(TBOrderListFragment.this), TBOrderListFragment.access$500(TBOrderListFragment.this).r(), new TBRefundInstanceManager.a(TBOrderListFragment.access$700(TBOrderListFragment.this), true, true, Boolean.valueOf("true".equals(TBOrderListFragment.access$500(TBOrderListFragment.this).C()))), pVar);
                            TBOrderListFragment.access$802(TBOrderListFragment.this, pVar);
                        }
                    }
                });
            } else {
                this.mRefundMUSInstance = TBRefundInstanceManager.refundWeex2PreRender(this.mFragmentActivity, this.mViewModel.r(), this.mViewModel.o(), new TBRefundInstanceManager.a(this.mViewModel.v(), true, true, Boolean.valueOf("true".equals(this.mViewModel.C()))));
            }
        }
        initOrderWeex2DialogFragment();
        initOrderWeex2PrefetchDataManager();
        initLogisticsWeex2Fragment();
        this.mViewModel.G();
        com.taobao.android.order.bundle.helper.b.a(this.mFragmentActivity, this.mBroadcastReceiver);
        com.taobao.android.order.bundle.helper.b.a(this.mFragmentActivity);
        registerAliPayBroadcast(this.mFragmentActivity);
        initListener();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        initView();
        ParallelBizValueHelper.PageType pageType = this.currentPageType;
        com.taobao.android.order.bundle.base.parallelbiz.a.a(pageType, "_Button-" + this.mViewModel.j(), null);
        hyn.a(TAG, "onActivityCreate", "页面创建");
        com.taobao.android.order.bundle.nav.list.g.INSTANCE.a(false);
        this.mViewModel.a(bundle);
        this.mOrderCoreEngine = com.taobao.android.order.core.g.a(createOrderConfigs());
        this.mOrderCoreEngine.a();
        registerOrderCoreInfo();
        onCreateFinish();
        this.isFirstScreen = true;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.contentView = LayoutInflater.from(this.mFragmentActivity).inflate(R.layout.activity_order_list, viewGroup, false);
        return this.contentView;
    }

    public void onCreateFinish() {
        if (this.mViewModel.p() && spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableAdvanceLoadRefund", true)) {
            this.mOrderConfigs.k();
        }
        if (!this.mViewModel.p() && !this.mViewModel.l()) {
            this.mOrderCoreEngine.a(this.mViewModel.i(), (com.taobao.android.order.core.c) null);
        }
        if (this.mViewModel.l()) {
            this.mOrderCoreEngine.a(this.mViewModel.t(), (com.taobao.android.order.core.c) null);
        }
        hzc e = this.mOrderCoreEngine.e();
        if (e instanceof hzp) {
            com.taobao.android.order.bundle.helper.e.a((hzp) e);
        }
        int u = hyk.u();
        if (u > 0 && hyk.v()) {
            try {
                this.currentRecyclerView = this.mOrderConfigs.d().b(this.currentContainView);
                Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                declaredField.setAccessible(true);
                declaredField.set(this.currentRecyclerView, Integer.valueOf(gbg.a((Context) this.mFragmentActivity, u)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.currentRecyclerView = this.mOrderConfigs.d().b(this.currentContainView);
        RecyclerView recyclerView = this.currentRecyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.rvScrollListener);
        }
        com.taobao.android.order.bundle.helper.b.a(this.mOrderConfigs);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        p pVar = this.mRefundMUSInstance;
        if (pVar != null) {
            pVar.onActivityStart();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.mViewModel.a(TradeHybridTMSFragment.b.e.INSTANCE);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        ria riaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.isActivityPaused = false;
        if (j.a().a(this.mFragmentActivity) != null) {
            j.a().a(this.mOrderConfigs);
        }
        if (this.needRefresh) {
            processRecPreRequest(true);
            Map<String, Object> map = this.refreshConditionExtraParams;
            if (map != null) {
                loadUpdateInfo(map);
                this.refreshConditionExtraParams = null;
            } else {
                loadData(this.isFirstScreen ? "FirstScreen" : "NativeRefresh");
                this.needRefresh = false;
            }
        }
        hyp.a(ParallelBizValueHelper.a(this.currentPageType), this);
        hyn.a(TAG, "onResume", "页面在前台");
        OrderRecommendWrapper orderRecommendWrapper = this.recommendHelper;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.c();
        }
        BehaviR.getInstance().commitEnter(cts.a.BIZ_ORDER_LIST, null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this.mFragmentActivity)));
        p pVar = this.mRefundMUSInstance;
        if (pVar != null) {
            pVar.onActivityResume();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar != null && qpfVar.F() != null) {
            this.mViewModel.a(TradeHybridTMSFragment.b.d.INSTANCE);
        }
        if (this.isFirstScreen && (riaVar = this.mOrderPerformanceTracker) != null) {
            riaVar.c().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
        }
        this.isFirstScreen = false;
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.mActivity, ParallelBizValueHelper.a(this.currentPageType));
        qpf qpfVar2 = this.mViewModel;
        if (qpfVar2 == null) {
            return;
        }
        qpfVar2.I();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.isActivityPaused = true;
        p pVar = this.mRefundMUSInstance;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar != null && qpfVar.F() != null) {
            this.mViewModel.a(TradeHybridTMSFragment.b.c.INSTANCE);
        }
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.a(this.currentPageType), null, this, com.taobao.android.behavix.j.b(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this.mFragmentActivity)));
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.mActivity);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        p pVar = this.mRefundMUSInstance;
        if (pVar != null) {
            pVar.onActivityStop();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.mViewModel.a(TradeHybridTMSFragment.b.f.INSTANCE);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        qpf qpfVar = this.mViewModel;
        if (qpfVar == null || qpfVar.F() == null) {
            return;
        }
        this.mViewModel.a(new TradeHybridTMSFragment.b.a(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.taobao.android.order.bundle.helper.e.b();
        com.taobao.android.order.core.g gVar = this.mOrderCoreEngine;
        if (gVar != null) {
            gVar.d();
        }
        com.taobao.android.order.bundle.helper.b.b(this.mFragmentActivity, this.mBroadcastReceiver);
        com.taobao.android.order.bundle.helper.b.a();
        com.taobao.android.order.bundle.helper.b.b();
        LocalBroadcastManager.getInstance(this.mFragmentActivity).unregisterReceiver(this.aliPayReceiver);
        RecyclerView.OnScrollListener onScrollListener = this.rvScrollListener;
        if (onScrollListener != null && (recyclerView = this.currentRecyclerView) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        p pVar = this.mRefundMUSInstance;
        if (pVar != null) {
            pVar.destroy();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar != null && qpfVar.F() != null) {
            this.mViewModel.a(TradeHybridTMSFragment.b.C0106b.INSTANCE);
        }
        com.taobao.android.order.bundle.nav.list.g.INSTANCE.b();
        if (this.mViewModel.s() != null) {
            this.mViewModel.s().destroyWeex2Instance();
            this.mOrderDetailLifecycleImpl = null;
            this.mViewModel.s().setFragmentLifeCycleListener(null);
        }
        if (this.mViewModel.E() != null) {
            this.mViewModel.E().destroyWeex2Instance();
            this.mLogisticsDetailLifecycleImpl = null;
            this.mViewModel.E().setFragmentLifeCycleListener(null);
        }
        this.mTBOrderDetailWeexNavAdapter = null;
        HashMap<String, Object> hashMap = this.mPageStorageForDX;
        if (hashMap != null) {
            hashMap.clear();
        }
        p pVar2 = this.mRefundMUSInstance;
        if (pVar2 != null) {
            pVar2.destroy();
        }
        qpf qpfVar2 = this.mViewModel;
        if (qpfVar2 != null) {
            qpfVar2.H();
        }
        JSONObject jSONObject = new JSONObject();
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        if (fragmentActivity != null) {
            jSONObject.put("context", (Object) fragmentActivity.getApplicationContext());
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.j f = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().f();
        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundOrderList", true) && f.c("first_data", alz.BizKeyRefund)) {
            jSONObject.put("enablePreRequestRefund", (Object) true);
        }
        jSONObject.put("useCustomDataSource", (Object) "true");
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, alz.BizKeyOrderList, jSONObject);
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        OrderRecommendWrapper orderRecommendWrapper = this.recommendHelper;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.b();
            this.recommendHelper.d();
        }
        processRecPreRequest(false);
        hyn.a(TAG, "finish", new String[0]);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            translateAnimation.setDuration(250L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TBOrderListFragment.access$900(TBOrderListFragment.this).d(true);
                                }
                            }
                        }, bxd.a("olFragmentDelayRefreshTime", 60));
                    }
                }
            });
            return translateAnimation;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation2.setDuration(200L);
        return translateAnimation2;
    }

    private void initParams() {
        ria riaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        if (!this.mViewModel.c()) {
            this.mViewModel.a(this.mInIntent);
        }
        if (OrderType.ORDERLIST.getValue().equals(this.mViewModel.n())) {
            ria riaVar2 = this.mOrderPerformanceTracker;
            if (riaVar2 != null) {
                riaVar2.c(com.taobao.android.order.bundle.cache.a.g());
            }
            if (this.mOrderPerformanceTracker != null) {
                a("isOLFirstScreen", true);
            }
            this.mViewModel.a();
        } else {
            this.mViewModel.a(hyj.c());
        }
        if ((!OrderType.ORDERLIST.getValue().equals(this.mViewModel.n()) || this.mViewModel.p()) && (riaVar = this.mOrderPerformanceTracker) != null) {
            riaVar.a(true, false, "其他页面");
            this.mOrderPerformanceTracker = null;
        }
        this.mViewModel.a(new g(this));
        ((g) this.mViewModel.k()).a(this.mOrderPerformanceTracker);
        this.mListContainerScrollListener = (f) this.mViewModel.k();
    }

    private void initListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
            return;
        }
        if (this.rvScrollListener == null) {
            this.rvScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.5
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
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    TBOrderListFragment.access$1100(TBOrderListFragment.this).a(recyclerView, TBOrderListFragment.access$1000(TBOrderListFragment.this), i);
                    if ((i == 2 && i != 0) || TBOrderListFragment.access$1200(TBOrderListFragment.this) || TBOrderListFragment.access$1300(TBOrderListFragment.this) == null || !"true".equals(TBOrderListFragment.access$1300(TBOrderListFragment.this).optString("hasMore")) || recyclerView.getAdapter().getItemCount() - ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() >= 25) {
                        return;
                    }
                    TBOrderListFragment.access$1202(TBOrderListFragment.this, true);
                    TBOrderListFragment.this.pullLoadMore();
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    TBOrderListFragment.access$1100(TBOrderListFragment.this).a(recyclerView, TBOrderListFragment.access$1000(TBOrderListFragment.this), i, i2);
                }
            };
        }
        if (!hyk.x()) {
            return;
        }
        this.mViewModel.a(new jnr() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnr
            public void a(List<String> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (!list.isEmpty()) {
                } else {
                    TBOrderListFragment.access$500(TBOrderListFragment.this).q().put("taoTmRoute", (Object) "mergeError");
                    TBOrderListFragment.access$1400(TBOrderListFragment.this, "PullToRefresh");
                    hyq.a(TBOrderListFragment.TAG, "ORDER_3_MERGE_ERROR", "ORDER_3_MERGE_ERROR");
                }
            }
        });
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mViewModel.a((LinearLayout) this.contentView.findViewById(R.id.top_layout));
        this.mViewModel.a((SimpleViewpager) this.contentView.findViewById(R.id.viewpager));
        this.loadingHolder = new hyy(this.mFragmentActivity);
        this.loadingHolder.a(R.id.mask_layout).b();
    }

    private OrderConfigs createOrderConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("432d4620", new Object[]{this});
        }
        OrderConfigs u = this.mViewModel.u();
        if (u != null) {
            u.a((ViewGroup) this.mViewModel.f());
            u.a((ViewPager) this.mViewModel.d());
            u.a(this.mViewModel.k());
            u.a(this.mOrderPerformanceTracker);
            u.b(this.mViewModel.l());
            u.c((View) this.mViewModel.r());
            u.a(this.mViewModel.s());
            u.b(this.mViewModel.E());
            u.a(this.mViewModel.e());
            u.a(this.mViewModel.p());
            u.c(false);
            this.mOrderConfigs = u;
        } else {
            this.mOrderConfigs = this.mViewModel.c(this.mInIntent);
        }
        this.mOrderConfigs.h(true);
        this.mOrderConfigs.a(this.mFragmentActivity);
        this.mOrderConfigs.a(this.mViewModel.D());
        this.mViewModel.a((Bundle) null);
        return this.mOrderConfigs;
    }

    public void registerAliPayBroadcast(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be4702d", new Object[]{this, activity});
            return;
        }
        if (this.localBroadcast == null) {
            this.localBroadcast = LocalBroadcastManager.getInstance(activity);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        BroadcastReceiver broadcastReceiver = this.aliPayReceiver;
        if (broadcastReceiver == null) {
            return;
        }
        this.localBroadcast.registerReceiver(broadcastReceiver, intentFilter);
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
        resetScrollListener();
        hideNetWorkErrorLayout();
        this.mViewModel.H();
        String str2 = null;
        this.pageInfoJson = null;
        if (TabType.REFUND.getValue().equals(this.mViewModel.j()) && this.mViewModel.r() != null && a2) {
            this.mViewModel.r().removeAllViews();
        }
        if (str != null) {
            this.mViewModel.a(str);
        }
        this.mViewModel.h().l().put("tabCode", this.mViewModel.j());
        this.currentRefreshLayout.enablePullRefresh(!TextUtils.equals(this.mViewModel.j(), TabType.REFUND.getValue()));
        enableOrDisableOrderListScrollable();
        if (TabType.REFUND.getValue().equals(str) && a2) {
            hzc e = this.mOrderCoreEngine.e();
            if (this.mViewModel.r() != null && (pVar = this.mRefundMUSInstance) != null) {
                if (pVar.getRenderRoot().getParent() != null) {
                    ((ViewGroup) this.mRefundMUSInstance.getRenderRoot().getParent()).removeView(this.mRefundMUSInstance.getRenderRoot());
                }
                this.mViewModel.r().addView(this.mRefundMUSInstance.getRenderRoot());
                this.mRefundMUSInstance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "instance.expose", null);
                this.mOrderConfigs.b((View) this.mViewModel.r());
                this.mViewModel.a(e);
                return;
            }
            TBRefundInstanceManager.startPreRequestOnIdle();
            if (!TextUtils.isEmpty(this.mOrderConfigs.i())) {
                str2 = this.mOrderConfigs.i();
            }
            FrameLayout frameLayout = new FrameLayout(getActivity());
            this.mViewModel.a(frameLayout);
            long currentTimeMillis = System.currentTimeMillis();
            if (e instanceof hzf) {
                currentTimeMillis = ((hzf) e).h();
            }
            this.mRefundMUSInstance = TBRefundInstanceManager.refundWeex2PreRender(getActivity(), frameLayout, str2, new TBRefundInstanceManager.a(Long.toString(currentTimeMillis), false, true, Boolean.valueOf("true".equals(this.mViewModel.C()))));
            this.mOrderConfigs.b((View) frameLayout);
            this.mViewModel.a(e);
            return;
        }
        renderWithCacheProtocol();
        processRecPreRequest(true);
        loadData("SwitchTab");
    }

    private void renderWithCacheProtocol() {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d953a5", new Object[]{this});
        } else if (!bxd.a("enableOListTabCache", true) || "OrderSearch".equals(this.mViewModel.h().l().get("OrderType")) || (a2 = com.taobao.android.order.bundle.cache.a.a(this.mFragmentActivity, this.mViewModel.j(), com.taobao.android.order.bundle.cache.a.SCENE_RELOADCONTAINER)) == null) {
        } else {
            this.mViewModel.c(a2);
            this.mViewModel.b(true);
            showLoading();
            this.mOrderConfigs.b(true);
            this.mOrderCoreEngine.a(this.mViewModel.t(), (com.taobao.android.order.core.c) null);
        }
    }

    private void resetScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488e0257", new Object[]{this});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.rvScrollListener;
        if (onScrollListener == null) {
            return;
        }
        RecyclerView recyclerView = this.currentRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.currentRecyclerView = this.mViewModel.k().b(this.currentContainView);
        RecyclerView recyclerView2 = this.currentRecyclerView;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.removeOnScrollListener(this.rvScrollListener);
        this.currentRecyclerView.addOnScrollListener(this.rvScrollListener);
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        View findViewById = this.contentView.findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setClickable(true);
            findViewById.setFocusable(true);
            findViewById.setVisibility(0);
            findViewById.bringToFront();
        }
        hyy hyyVar = this.loadingHolder;
        if (!(hyyVar instanceof hyy)) {
            return;
        }
        hyyVar.d();
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        View findViewById = this.contentView.findViewById(R.id.mask_layout);
        if (findViewById == null) {
            return;
        }
        hyy hyyVar = this.loadingHolder;
        if (hyyVar instanceof hyy) {
            hyyVar.e();
        }
        findViewById.setVisibility(8);
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void a(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0eb4043", new Object[]{this, tBSwipeRefreshLayout});
            return;
        }
        this.currentRefreshLayout = tBSwipeRefreshLayout;
        ParallelBizValueHelper.PageType pageType = this.currentPageType;
        com.taobao.android.order.bundle.base.parallelbiz.a.a(pageType, "_Button-" + this.mViewModel.j() + "-pullStartLoad", null);
        loadData("PullToRefresh");
    }

    private void loadData(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d563d2", new Object[]{this, str, hashMap});
        } else {
            loadData(hashMap);
        }
    }

    private void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        } else {
            loadData(str, null);
        }
    }

    private void loadData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eee1c", new Object[]{this, hashMap});
        } else if (this.mOrderCoreEngine == null) {
        } else {
            if (!this.isFirstScreen) {
                this.mOrderConfigs.a((ria) null);
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout = this.currentRefreshLayout;
            if (tBSwipeRefreshLayout == null || !tBSwipeRefreshLayout.isRefreshing()) {
                z = false;
            }
            if (!z && !this.mViewModel.p() && !this.mViewModel.l()) {
                showLoading();
            }
            if (this.mViewModel.l()) {
                this.mViewModel.d().setIsCanScroll(false);
                if (bxd.a(qpf.KEY_WAIT_PAY_LOADING, false) && TabType.WAIT_PAY.getValue().equals(this.mViewModel.j())) {
                    showLoading();
                }
            }
            resetRequestConfig();
            this.mOrderCoreEngine.b();
            this.requestStartTime = System.currentTimeMillis();
            if (!TextUtils.isEmpty(this.mViewModel.m()) && presetResponse.get(this.mViewModel.m()) != null) {
                this.mOrderCoreEngine.a(presetResponse.get(this.mViewModel.m()), this);
                presetResponse.remove(this.mViewModel.m());
                this.mViewModel.b((String) null);
            } else {
                appendQueryParamsFromOriginUriToCondition();
                appendParamsToCondition(hashMap);
                this.mOrderCoreEngine.a(this);
            }
            this.needRefresh = false;
            enableOrDisableOrderListScrollable();
        }
    }

    private void appendQueryParamsFromOriginUriToCondition() {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771790ff", new Object[]{this});
            return;
        }
        try {
            if (this.mInIntent == null || (data = this.mInIntent.getData()) == null || (queryParameter = data.getQueryParameter("queryParams")) == null) {
                return;
            }
            appendParamsToCondition(JSONObject.parseObject(queryParameter));
        } catch (Exception e) {
            jqg.a("OrderList", "appendQueryParamsFromOriginUriToCondition", e.getMessage());
        }
    }

    private void appendParamsToCondition(Map<String, Object> map) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe02289e", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            try {
                String str = this.mViewModel.h().l().get("condition");
                if (str == null) {
                    parseObject = new JSONObject();
                } else {
                    parseObject = JSONObject.parseObject(str);
                }
                parseObject.putAll(map);
                this.mViewModel.h().l().put("condition", parseObject.toJSONString());
            } catch (Exception e) {
                jqg.a(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), "appendParamsToCondition", e.getMessage());
            }
        }
    }

    private void resetRequestConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b884929", new Object[]{this});
            return;
        }
        this.mViewModel.h().l().put("page", "1");
        this.mOrderConfigs.e("true".equals(this.mViewModel.C()));
        if (this.mViewModel.q() != null) {
            this.mViewModel.q().remove(CoreConstants.KEY_PAGE_CONTEXT);
            String a2 = com.taobao.android.purchase.aura.helper.a.a(this.mFragmentActivity, false);
            if (!TextUtils.isEmpty(a2)) {
                this.mViewModel.q().put("installApp", (Object) a2);
            }
            updateFoldedParam(this.mViewModel.q());
            try {
                this.mViewModel.h().l().put("condition", this.mViewModel.q().toJSONString());
            } catch (JSONException e) {
                hyq.a("resetRequestConfig", "RESET-CONFIG-ERROR", e.toString());
            }
        }
        updateMtopBizTopic(this.mViewModel.h(), true);
    }

    private void updateFoldedParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8173b645", new Object[]{this, jSONObject});
        } else if (getArguments() == null || !getArguments().getBoolean(KEY_NEED_HIDE_BACK_BTN)) {
        } else {
            jSONObject.put("foldDeviceRelatedPage", "true");
        }
    }

    public void pullLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f321b347", new Object[]{this});
            return;
        }
        ParallelBizValueHelper.PageType pageType = this.currentPageType;
        com.taobao.android.order.bundle.base.parallelbiz.a.a(pageType, "_Button-" + this.mViewModel.j() + "-pullEndLoad", null);
        org.json.JSONObject jSONObject = this.pageInfoJson;
        if (jSONObject != null) {
            addPageContext(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
            this.mViewModel.h().l().put("page", this.pageInfoJson.optString("nextPageIndex"));
        }
        updateMtopBizTopic(this.mViewModel.h(), false);
        this.requestStartTime = System.currentTimeMillis();
        this.mOrderCoreEngine.a(this);
    }

    private void updateMtopBizTopic(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d785cd93", new Object[]{this, hVar, new Boolean(z)});
        } else if (hVar == null || OrderType.ORDERFILTER.getValue().equals(this.mViewModel.n())) {
        } else {
            if (OrderType.ORDERSEARCH.getValue().equals(this.mViewModel.n())) {
                hVar.e("orderList_search");
            } else {
                hVar.e(z ? "orderList_pageload" : "orderList_loadmore");
            }
        }
    }

    public void loadUpdateInfo(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbbd261", new Object[]{this, map});
            return;
        }
        org.json.JSONObject jSONObject = this.pageInfoJson;
        if (jSONObject != null) {
            addPageContext(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
        }
        appendParamsToCondition(map);
        updateMtopBizTopic(this.mViewModel.h(), false);
        this.requestStartTime = System.currentTimeMillis();
        showLoading();
        this.mOrderCoreEngine.a(this);
    }

    private void addPageContext(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530cafb8", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.mViewModel.q() == null) {
        } else {
            try {
                this.mViewModel.q().put(CoreConstants.KEY_PAGE_CONTEXT, (Object) jSONObject.toString());
                this.mViewModel.h().l().put("condition", this.mViewModel.q().toJSONString());
            } catch (Exception e) {
                hyq.a("addPageContext", "ADD-PAC-ERROR", e.toString());
            }
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void b(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23ccfc4", new Object[]{this, tBSwipeRefreshLayout});
        } else {
            this.currentRefreshLayout = tBSwipeRefreshLayout;
        }
    }

    private void registerOrderCoreInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d708ff", new Object[]{this});
        } else {
            this.mViewModel.a(this.mOrderCoreEngine);
        }
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void updateCurrentContainView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2473c2", new Object[]{this, view});
        } else {
            this.currentContainView = view;
        }
    }

    private void updateSpmCnt(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95149e15", new Object[]{this, jSONObject});
        } else if (updateSpmCntByGlobal(jSONObject)) {
        } else {
            updatePageSpmCnt(CoreConstants.UT_ORDER_LIST_SPM_CNT);
        }
    }

    private boolean updateSpmCntByGlobal(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1412a5f", new Object[]{this, jSONObject})).booleanValue();
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
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                updatePageSpmCnt(String.format("%s.%s.0.0", optString, optString2));
                return true;
            }
            return false;
        } catch (Exception e) {
            jqg.a(OrderBizCode.orderList, "updateSpmException", e.getMessage());
            return false;
        }
    }

    private void updatePageSpmCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22323282", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                Map<String, String> pageProperties = defaultTracker.getPageProperties(getActivity());
                if (pageProperties == null) {
                    pageProperties = new HashMap<>();
                }
                pageProperties.put("spm-cnt", str);
                defaultTracker.updatePageProperties(getActivity(), pageProperties);
            } catch (Exception e) {
                jqg.a(OrderBizCode.orderList, "updatePageSpmCntException", e.getMessage());
            }
        }
    }

    private void updateSearchPageProperties(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a342eba4", new Object[]{this, jSONObject});
        } else if (!OrderType.ORDERSEARCH.getValue().equals(this.mViewModel.n())) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("searchKey", this.mViewModel.g());
            String optString = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            this.mOrderConfigs.b(optString);
            hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, optString);
            hashMap.put("isSearchResult", "true");
            hashMap.put("recommend", TextUtils.equals(this.mViewModel.z(), this.mViewModel.g()) ? "1" : "0");
            String b = com.taobao.android.order.bundle.helper.g.b(this.mInIntent, "utLogMap");
            String b2 = com.taobao.android.order.bundle.helper.g.b(this.mInIntent, "utArgs");
            String b3 = com.taobao.android.order.bundle.helper.g.b(this.mInIntent, "utParam");
            try {
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put("utLogMap", URLEncoder.encode(b, "UTF-8"));
                }
                if (!TextUtils.isEmpty(b2)) {
                    hashMap.put("utArgs", URLEncoder.encode(b2, "UTF-8"));
                }
                if (!TextUtils.isEmpty(b3)) {
                    hashMap.put("utParam", URLEncoder.encode(b3, "UTF-8"));
                }
            } catch (Throwable unused) {
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
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
        if (this.mViewModel.p() && (tBSwipeRefreshLayout = this.currentRefreshLayout) != null) {
            tBSwipeRefreshLayout.enablePullRefresh(false);
        }
        this.mViewModel.c(false);
        long currentTimeMillis = System.currentTimeMillis();
        loadFinish();
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.mOrderConfigs.d().b(this.currentContainView);
            if (mtopResponse.getDataJsonObject() != null && mtopResponse.getDataJsonObject().optJSONObject("global") != null) {
                org.json.JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global");
                updateSpmCnt(optJSONObject);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("globalUtArgs");
                if (optJSONObject2 != null) {
                    updateSearchPageProperties(optJSONObject2);
                }
                String str = "false";
                if (TextUtils.isEmpty(this.mViewModel.C())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        this.mViewModel.d("true");
                        this.mViewModel.h().l().put("forceBoughtlist4", "true");
                        this.mViewModel.d().setBackgroundColor(Color.parseColor("#F3F6F8"));
                    } else {
                        this.mViewModel.d(str);
                    }
                }
                this.pageInfoJson = optJSONObject.optJSONObject("pageControl");
                if (this.pageInfoJson != null) {
                    if (optJSONObject.optJSONObject("recommendData") != null) {
                        this.recommendJson = optJSONObject.optJSONObject("recommendData");
                    }
                    this.mViewModel.a(optJSONObject, (JSONObject) null);
                    initRecommendData(orderRecyclerView, this.pageInfoJson.optString("hasMore"), mtopResponse.getDataJsonObject().optString(TBSearchChiTuJSBridge.ABTEST));
                    burryPointRequestTime(currentTimeMillis, optJSONObject2, mtopResponse.getDataJsonObject().optJSONObject("hierarchy"));
                }
                org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("tocDegradeInfo");
                if (optJSONObject3 != null) {
                    this.batchODetailDegrade = TextUtils.equals("true", optJSONObject3.optString("isCloseTradeItemDetailTimeout"));
                }
                if (orderRecyclerView != null) {
                    orderRecyclerView.resetScroll();
                }
                if (optJSONObject.optJSONObject("routeControl") != null) {
                    String optString = optJSONObject.optJSONObject("routeControl").optString("taoTmRoute");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONObject parseObject = JSONObject.parseObject(this.mViewModel.h().l().get("condition"));
                        parseObject.put("taoTmRoute", (Object) optString);
                        this.mViewModel.h().l().put("condition", parseObject.toJSONString());
                    }
                }
                if (TextUtils.isEmpty(this.mViewModel.C())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        str = "true";
                    }
                    this.mViewModel.d(str);
                }
                if (PageStatus.FIRST_PAGE.equals(pageStatus) && OrderType.ORDERLIST.getValue().equals(this.mViewModel.n())) {
                    com.taobao.android.order.bundle.cache.a.a(this.mFragmentActivity, this.mViewModel.j(), mtopResponse.getDataJsonObject(), this.recommendJson != null ? this.recommendJson.optString("orderIdsStr") : null, this.mViewModel.t() != null);
                    this.mViewModel.a((RecyclerView) orderRecyclerView);
                }
                this.mViewModel.a(this.mFragmentActivity, mtopResponse, this.mViewModel.c(orderRecyclerView));
                this.mOrderWeex2PrefetchDataManager.a(mtopResponse);
                prefetchWhenResponse(orderRecyclerView);
                this.mViewModel.a(this.mFragmentActivity, pageStatus);
                this.mViewModel.c((JSONObject) null);
                this.mViewModel.b(false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        loadFinish();
        if (jSONObject == null) {
            return;
        }
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.mOrderConfigs.d().b(this.currentContainView);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("global");
            if (jSONObject2 != null && jSONObject3 != null) {
                if (TextUtils.equals("true", OrangeConfig.getInstance().getConfig("babelorder", "orderDetailFilterEnablePreRender", "true"))) {
                    this.mViewModel.a(this.mFragmentActivity, jSONObject, this.mViewModel.c(orderRecyclerView));
                }
                if (jSONObject3.getJSONObject("pageControl") != null) {
                    this.pageInfoJson = new org.json.JSONObject(jSONObject3.getJSONObject("pageControl"));
                    if (jSONObject3.getJSONObject("recommendData") != null) {
                        this.recommendJson = new org.json.JSONObject(jSONObject3.getJSONObject("recommendData"));
                    }
                    this.mViewModel.a((org.json.JSONObject) null, jSONObject3);
                    initRecommendData(orderRecyclerView, this.pageInfoJson.optString("hasMore"), jSONObject2.getString(TBSearchChiTuJSBridge.ABTEST));
                    burryPointRequestTime(currentTimeMillis, new org.json.JSONObject(jSONObject3.getJSONObject("globalUtArgs")), new org.json.JSONObject(jSONObject2.getJSONObject("hierarchy")));
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

    private boolean needShowRecommendView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2f1d19", new Object[]{this})).booleanValue();
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return true;
        }
        return this.mViewModel.b(this.mOrderCoreEngine).b().b("feedStream") != null;
    }

    private void initRecommendData(OrderRecyclerView orderRecyclerView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab92d9c", new Object[]{this, orderRecyclerView, str, str2});
        } else if (this.mViewModel.A()) {
            updateSearchWeexInfoFlowUT();
        } else if ("true".equals(str)) {
            OrderRecommendWrapper orderRecommendWrapper = this.recommendHelper;
            if (orderRecommendWrapper == null) {
                return;
            }
            orderRecyclerView.removeEndView(orderRecommendWrapper.e());
        } else {
            this.currentRefreshLayout.enableLoadMore(false);
            try {
                if (this.recommendHelper != null) {
                    orderRecyclerView.removeEndView(this.recommendHelper.e());
                    this.recommendHelper.d();
                    this.recommendHelper = null;
                    orderRecyclerView.removeAllEndViews();
                }
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(this.mViewModel.z()) && TextUtils.equals(this.mViewModel.z(), this.mViewModel.g())) {
                    jSONObject.put(com.taobao.android.order.bundle.helper.rec.c.PARAM_REC_QUERY, (Object) this.mViewModel.z());
                    jSONObject.put("channelSrp", (Object) "gouhou_searchfg");
                } else if (!TextUtils.isEmpty(this.mViewModel.g())) {
                    jSONObject.put(com.taobao.android.order.bundle.helper.rec.c.PARAM_REC_QUERY, (Object) this.mViewModel.g());
                }
                this.recommendHelper = new OrderRecommendWrapper(orderRecyclerView, this.mFragmentActivity, this.mViewModel.B() ? OrderRecommendWrapper.RecType.MAIN_SEARCH : OrderRecommendWrapper.RecType.GUESS, jSONObject);
                this.recommendHelper.a();
                com.taobao.android.order.bundle.helper.rec.a f = this.recommendHelper.f();
                if ("true".equals(this.mViewModel.C()) && (f instanceof com.taobao.android.order.bundle.helper.rec.b)) {
                    ((com.taobao.android.order.bundle.helper.rec.b) f).b("#FFFFFF");
                }
                if (this.recommendJson == null || !needShowRecommendView()) {
                    return;
                }
                jSONObject.putAll(JSONObject.parseObject(this.recommendJson.toString()));
                this.recommendHelper.a(jSONObject, str2);
            } catch (Throwable unused) {
            }
        }
    }

    private void updateSearchWeexInfoFlowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab467db4", new Object[]{this});
            return;
        }
        try {
            updatePageSpmCnt(CoreConstants.UT_ORDER_LIST_SPM_CNT);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", CoreConstants.UT_ORDER_LIST_SPM_CNT);
            defaultTracker.updateNextPageProperties(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void loadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
            return;
        }
        this.isLoadingMore = false;
        dismissLoading();
        hideNetWorkErrorLayout();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.currentRefreshLayout;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            this.currentRefreshLayout.setLoadMore(false);
        }
        this.mViewModel.d().setIsCanScroll(true);
        bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadSuccess").a(true));
    }

    private void burryPointRequestTime(long j, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c6b3eb", new Object[]{this, new Long(j), jSONObject, jSONObject2});
            return;
        }
        long j2 = this.requestStartTime;
        if (j2 == -1) {
            return;
        }
        long j3 = j - j2;
        HashMap hashMap = new HashMap();
        hashMap.put("costTime", String.valueOf(j3));
        org.json.JSONObject jSONObject3 = this.pageInfoJson;
        if (jSONObject3 != null) {
            hashMap.put("nextPageIndex", jSONObject3.optString("nextPageIndex"));
            hashMap.put("hasMore", this.pageInfoJson.optString("hasMore"));
            if ("true".equals(this.pageInfoJson.optString("emptyPage"))) {
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
                if (!TextUtils.isEmpty(optJSONArray.optString(i2)) && optJSONArray.optString(i2).startsWith("MainGroup")) {
                    i++;
                }
            }
            hashMap.put("orderCount", String.valueOf(i));
        }
        this.requestStartTime = -1L;
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
        this.isLoadingMore = false;
        if (mtopResponse == null) {
            return;
        }
        this.currentRefreshLayout.setRefreshing(false);
        this.currentRefreshLayout.setLoadMore(false);
        this.mViewModel.d().setIsCanScroll(true);
        if (mtopResponse.isApiSuccess()) {
            if (hyk.k()) {
                handleMtopResponseByH5(mtopResponse, "ReturnH5");
                bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadError：isApiSuccess and enableDowngradeToH5").a(false));
                return;
            }
            handleMtopResponse(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
        } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
            if (hvn.b()) {
                if (this.pageInfoJson != null && !"1".equals(this.mViewModel.h().l().get("page"))) {
                    kpn.a(this.mFragmentActivity, mtopResponse.getRetMsg());
                } else {
                    try {
                        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableBlockErrorView", true) && (b = this.mViewModel.b((OrderRecyclerView) this.mOrderConfigs.d().b(this.currentContainView))) != null) {
                            if (!b.isEmpty()) {
                                z = false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!this.mViewModel.l() && z) {
                        setPreLocalHeaderJson();
                        showNetWorkErrorLayoutVisible(mtopResponse);
                    } else {
                        kpn.a(this.mFragmentActivity, mtopResponse.getRetMsg());
                    }
                    this.mViewModel.b(false);
                }
                dismissLoading();
            } else {
                handleMtopResponse(mtopResponse, mtopResponse.getRetCode());
            }
            hyq.a(this.mFragmentActivity, TAG, mtopResponse);
        } else if (!"ReturnH5".equals(mtopResponse.getRetCode())) {
        } else {
            handleMtopResponseByH5(mtopResponse, "ReturnH5");
            bxb.a(bxb.a.b(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).a(0.001f).a("onLoadError：retCode == ReturnH5").a(false));
        }
    }

    private void setPreLocalHeaderJson() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2362c6", new Object[]{this});
            return;
        }
        if (getArguments() != null) {
            z = getArguments().getBoolean(KEY_NEED_HIDE_BACK_BTN);
        }
        if (TextUtils.isEmpty(this.mViewModel.g())) {
            this.mViewModel.a(hyj.a(z));
        } else {
            this.mViewModel.a(hyj.b(z));
        }
        this.mOrderCoreEngine.b();
        this.mOrderCoreEngine.a(this.mViewModel.i(), this);
    }

    private void handleMtopResponseByH5(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123fedeb", new Object[]{this, mtopResponse, str});
            return;
        }
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        hyq.a(fragmentActivity, TAG, "OrderList", str + "-" + this.mViewModel.j(), this.mViewModel.j(), mtopResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("DownGradeTOH5List downGrade = ");
        sb.append(str);
        hyn.a(TAG, "handleMtopResponseByH5", sb.toString());
        d.d(this.mFragmentActivity, this.mViewModel.j(), str);
        finish();
    }

    private void handleMtopResponse(MtopResponse mtopResponse, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69317ac7", new Object[]{this, mtopResponse, str});
            return;
        }
        org.json.JSONObject jSONObject = this.pageInfoJson;
        if (jSONObject != null && !"1".equals(jSONObject.optString("nextPageIndex"))) {
            str2 = CoreConstants.DOWNGRADLE_V2TOV1_NONE_FIRST;
            FragmentActivity fragmentActivity = this.mFragmentActivity;
            hyq.a(fragmentActivity, TAG, "OrderList", str2 + "-" + this.mViewModel.j(), this.mViewModel.j(), (MtopResponse) null);
        } else {
            FragmentActivity fragmentActivity2 = this.mFragmentActivity;
            hyq.a(fragmentActivity2, TAG, "OrderList", str + "-" + this.mViewModel.j(), this.mViewModel.j(), mtopResponse);
            str2 = str;
        }
        if (TextUtils.isEmpty(com.taobao.android.order.bundle.helper.g.c(this.mInIntent))) {
            d.a(this.mFragmentActivity, this.mViewModel.j(), str2);
        } else {
            d.b(this.mFragmentActivity, this.mViewModel.g(), str2);
        }
        finish();
    }

    @Override // com.taobao.android.order.core.c
    public void onReloadRequested(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        } else if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.needRefresh = true;
        } else if (this.isActivityPaused) {
            this.needRefresh = true;
        } else {
            HashMap<String, Object> hashMap = null;
            if (jSONObject != null && this.mViewModel.q() != null) {
                try {
                    HashMap<String, Object> hashMap2 = new HashMap<>(jSONObject);
                    try {
                        this.mViewModel.q().putAll(hashMap2);
                        hashMap = hashMap2;
                    } catch (Exception e) {
                        e = e;
                        hashMap = hashMap2;
                        e.printStackTrace();
                        loadData("NativeRefresh", hashMap);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            loadData("NativeRefresh", hashMap);
        }
    }

    private TBErrorView lazyInflateErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("8fb63d3a", new Object[]{this});
        }
        View view = this.currentContainView;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            return (TBErrorView) this.currentContainView.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        }
        return (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
    }

    private TBErrorView initTBErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("e1c02acf", new Object[]{this});
        }
        if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", false)) {
            return lazyInflateErrorView();
        }
        View view = this.currentContainView;
        if (view == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.order_list_error_view);
        if (viewGroup == null) {
            return lazyInflateErrorView();
        }
        TBErrorView tBErrorView = new TBErrorView(getActivity());
        viewGroup.addView(tBErrorView);
        viewGroup.setVisibility(0);
        return tBErrorView;
    }

    public void showNetWorkErrorLayoutVisible(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        TBErrorView initTBErrorView = initTBErrorView();
        if (initTBErrorView == null) {
            return;
        }
        initTBErrorView.setTopic("order_list");
        if (mtopResponse != null) {
            initTBErrorView.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
        initTBErrorView.setVisibility(0);
        initTBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.order_biz_refresh), new View.OnClickListener() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBOrderListFragment.this.showLoading();
                TBOrderListFragment.access$1500(TBOrderListFragment.this).b();
                TBOrderListFragment.access$1500(TBOrderListFragment.this).a(TBOrderListFragment.this);
            }
        });
    }

    public void hideNetWorkErrorLayout() {
        TBErrorView tBErrorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb3ae8d", new Object[]{this});
        } else if (this.currentContainView == null) {
        } else {
            if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", true)) {
                ViewGroup viewGroup = (ViewGroup) this.currentContainView.findViewById(R.id.order_list_error_view);
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
            } else if (((ViewStub) this.currentContainView.findViewById(R.id.order_list_view_stub)) != null || (tBErrorView = (TBErrorView) this.currentContainView.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view)) == null) {
            } else {
                tBErrorView.setVisibility(8);
            }
        }
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
            } catch (JSONException e) {
                hyn.a(TAG, "updateParams-parse-res", e);
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = String.valueOf(UUID.randomUUID());
                presetResponse.put(str, jSONObject2);
                this.mViewModel.b(str);
            } else {
                str = null;
            }
            Object obj = jSONObject.get("openNewPage");
            if (obj instanceof JSONObject) {
                Bundle bundle = new Bundle();
                bundle.putString("tabCode", this.mViewModel.j());
                JSONObject jSONObject4 = (JSONObject) obj;
                String string = jSONObject4.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    Object obj2 = jSONObject4.get("queryParams");
                    if (!TextUtils.isEmpty(str) && (obj2 instanceof JSONObject)) {
                        JSONObject jSONObject5 = (JSONObject) obj2;
                        jSONObject5.put(CoreConstants.PRESETRES_KEY, (Object) str);
                        for (String str2 : jSONObject5.keySet()) {
                            bundle.putString(str2, jSONObject5.getString(str2));
                        }
                        string = ibm.a(string, jSONObject5);
                    }
                    Nav.from(this.mFragmentActivity).withExtras(bundle).toUri(string);
                    return;
                }
            }
            if (this.mViewModel.h() == null || this.mViewModel.h().l() == null) {
                return;
            }
            Object obj3 = jSONObject.get("extraConditionParams");
            if (obj3 instanceof JSONObject) {
                try {
                    jSONObject3 = JSONObject.parseObject(this.mViewModel.h().l().get("condition"));
                } catch (JSONException e2) {
                    hyn.a(TAG, "extCondition-parse-error", e2);
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
                        jSONObject3 = JSONObject.parseObject(this.mViewModel.h().l().get("condition"));
                    } catch (JSONException e3) {
                        hyn.a(TAG, "extBiz-parse-error", e3);
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
                this.mViewModel.b(jSONObject3);
                this.mViewModel.h().l().put("condition", jSONObject3.toJSONString());
            } catch (JSONException unused) {
            }
        }
    }

    private void clearODetailPrefetchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5aba2fb", new Object[]{this});
            return;
        }
        ibo iboVar = this.mOrderWeex2PrefetchDataManager;
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
            this.mDetailPageUserInfo = str;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this}) : hyt.a(this, this.mDetailPageUserInfo);
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public Context getContainerContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e86b45e3", new Object[]{this}) : getContext();
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.mViewModel.j();
    }

    @Override // com.taobao.android.order.bundle.widget.g.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        OrderRecommendWrapper orderRecommendWrapper = this.recommendHelper;
        if (orderRecommendWrapper == null) {
            return;
        }
        orderRecommendWrapper.b();
    }

    private void trackStartAndNavStage(String str, Bundle bundle) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560c24c8", new Object[]{this, str, bundle});
            return;
        }
        this.mOrderPerformanceTracker = new ria("olFragmentBuild", this.mFragmentActivity);
        long currentTimeMillis = System.currentTimeMillis();
        jpo b = jpo.b(this.mFragmentActivity);
        b.a(this.mFragmentActivity, str, ParallelBizValueHelper.d(this.currentPageType));
        com.taobao.android.ultron.performence.model.f fVar = new com.taobao.android.ultron.performence.model.f(bxb.sPid, bxb.b(str));
        fVar.a(bxi.b() ? 0.5f : 0.02f);
        Intent intent = this.mInIntent;
        if (intent == null || bundle != null) {
            b.a("olFragmentBuild");
            b.a(fVar);
            return;
        }
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = this.mInIntent.getLongExtra("NAV_TO_URL_START_UPTIME", 0L);
        long longExtra3 = this.mInIntent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        this.mDetailClickTime = com.taobao.android.order.bundle.helper.g.b(this.mInIntent, CoreConstants.IN_PARAMS_DETAILCLICK);
        boolean z = !TextUtils.isEmpty(this.mDetailClickTime);
        long parseLong = z ? Long.parseLong(this.mDetailClickTime) : 0L;
        if (parseLong <= 0) {
            j = currentTimeMillis;
            j2 = longExtra;
        } else {
            j = currentTimeMillis;
            j2 = parseLong;
        }
        if (j2 <= 0 || j - j2 <= 0) {
            jqg.b("OrderPerformanceTrack", "start time invalid");
            this.mOrderPerformanceTracker = null;
            return;
        }
        b.a("olFragmentBuild", j2);
        b.a(fVar);
        this.mOrderPerformanceTracker.c().put(dtz.STAGE_KEY_CLICK_START, Long.valueOf(j2));
        this.mOrderPerformanceTracker.c().put("up_nav_start_time", Long.valueOf(longExtra2));
        this.mOrderPerformanceTracker.c().put("on_create_time", Long.valueOf(j));
        b.a("apmClientFullStageProcess", longExtra, (String) null);
        boolean z2 = true;
        jpo.b(this.mFragmentActivity).a(1, "d2", String.valueOf(z));
        if (longExtra <= 0) {
            z2 = false;
        }
        if (!z2 || longExtra3 <= 0) {
            return;
        }
        b.a("apmClientLayoutComplete", longExtra, (String) null);
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
        ultronPerformanceStageModel.setStartMills(longExtra);
        ultronPerformanceStageModel.setEndMills(j);
        b.a(ultronPerformanceStageModel, (String) null, false);
    }

    private void processRecPreRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c574c260", new Object[]{this, new Boolean(z)});
        } else if (!OrderType.ORDERLIST.getValue().equals(this.mViewModel.n())) {
        } else {
            if (z) {
                jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.8
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

    private void enableOrDisableOrderListScrollable() {
        com.taobao.android.order.core.d d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7dbb38", new Object[]{this});
            return;
        }
        OrderConfigs orderConfigs = this.mOrderConfigs;
        if (orderConfigs == null || (d = orderConfigs.d()) == null) {
            return;
        }
        if (TextUtils.equals(this.mViewModel.j(), "reFund")) {
            d.a(this.currentContainView, false);
        } else {
            d.a(this.currentContainView, true);
        }
    }

    private void initOrderWeex2DialogFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fda872", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mViewModel.a(ibn.a(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
        this.mViewModel.s().setPrefetchCache(this.mUltronWeex2DataPrefetchCache);
        if (this.mOrderDetailLifecycleImpl == null) {
            this.mOrderDetailLifecycleImpl = new a(ParallelBizValueHelper.PageType.order_detail);
        }
        this.mViewModel.s().setFragmentLifeCycleListener(this.mOrderDetailLifecycleImpl);
    }

    private void initOrderWeex2PrefetchDataManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd87ac60", new Object[]{this});
        } else {
            this.mOrderWeex2PrefetchDataManager = new ibo(this.mUltronWeex2DataPrefetchCache);
        }
    }

    private void initLogisticsWeex2Fragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4bbd25", new Object[]{this});
        } else if (!ibl.z()) {
            jqg.a(TAG, "initLogisticsWeex2Fragment", "switcher is off");
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.mViewModel.b(ibn.a(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.logistics_detail), ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
            if (this.mLogisticsDetailLifecycleImpl == null) {
                this.mLogisticsDetailLifecycleImpl = new a(ParallelBizValueHelper.PageType.logistics_detail);
            }
            this.mViewModel.E().setFragmentLifeCycleListener(this.mLogisticsDetailLifecycleImpl);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.mViewModel.s() != null && this.mViewModel.s().onKeyDown(i, keyEvent)) {
            return true;
        }
        if (this.mViewModel.F() != null && this.mViewModel.F().onKeyDown(Integer.valueOf(i), keyEvent)) {
            return true;
        }
        return this.mViewModel.E() != null && this.mViewModel.E().onKeyDown(i, keyEvent);
    }

    @Override // tb.tey
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = this.mPageStorageForDX;
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
        if (this.mPageStorageForDX == null) {
            this.mPageStorageForDX = new HashMap<>();
        }
        this.mPageStorageForDX.put(str, obj);
    }

    @Override // tb.tey
    public Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.mPageStorageForDX;
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
            return;
        }
        ria riaVar = this.mOrderPerformanceTracker;
        if (riaVar == null) {
            jqg.b(com.taobao.android.order.core.dinamicX.view.g.TAG, "tracker is null");
            return;
        }
        riaVar.c().put("cache_img_load_end_time", Long.valueOf(System.currentTimeMillis()));
        this.mOrderPerformanceTracker.b(true);
        this.mOrderPerformanceTracker.a();
    }

    private void prefetchWhenResponse(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f614e7", new Object[]{this, recyclerView});
        } else if (this.batchODetailDegrade) {
            jqg.a(TAG, "prefetchWhenResponse", "server degrade");
            if (this.hasClearedODetailCache) {
                return;
            }
            clearODetailPrefetchData();
            this.hasClearedODetailCache = true;
        } else {
            org.json.JSONObject jSONObject = this.pageInfoJson;
            if (jSONObject != null) {
                try {
                    if (Integer.parseInt(jSONObject.optString("nextPageIndex")) - 1 > ibl.h()) {
                        jqg.a(TAG, "prefetchWhenResponse", "invalid page");
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            if (recyclerView == null || !(recyclerView.getAdapter() instanceof nkj) || !(((nkj) recyclerView.getAdapter()).c() instanceof bnn)) {
                jqg.a(TAG, "prefetchWhenResponse", "invalid recyclerView");
                return;
            }
            qpf qpfVar = this.mViewModel;
            List<IDMComponent> b = qpfVar == null ? null : qpfVar.b(recyclerView);
            if (b == null || b.isEmpty()) {
                jqg.a(TAG, "prefetchWhenResponse", "no components");
                return;
            }
            int n = ibl.n();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : b) {
                if (arrayList.size() >= n) {
                    break;
                } else if (iDMComponent != null && TextUtils.equals(iDMComponent.getTag(), "item")) {
                    arrayList.add(iDMComponent);
                }
            }
            this.mOrderWeex2PrefetchDataManager.a(arrayList, this.mOrderConfigs);
        }
    }

    @Override // com.taobao.tao.m
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !bxd.a("removeActionbarConfig", true);
    }

    @Override // tb.bwx
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : ParallelBizValueHelper.a(this.currentPageType);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a
    public boolean displayByTMSHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea604cbe", new Object[]{this, str})).booleanValue();
        }
        qpf qpfVar = this.mViewModel;
        if (qpfVar == null) {
            return false;
        }
        return qpfVar.a((Activity) this.mFragmentActivity, str);
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
        private boolean h;
        private ParallelBizValueHelper.PageType i;

        static {
            kge.a(1515341693);
            kge.a(539449516);
        }

        public a(ParallelBizValueHelper.PageType pageType) {
            this.h = true;
            this.i = pageType;
            this.h = spk.a(iro.ORANGE_KEY_ORDER_LIST, "enableOListUTFragmentOpt", true);
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
                    jqg.b(TBOrderListFragment.TAG, "WebAppInterface is registered!");
                }
                if (pVar != null) {
                    if (TBOrderListFragment.access$1600(TBOrderListFragment.this) == null) {
                        TBOrderListFragment.access$1602(TBOrderListFragment.this, new b());
                        TBOrderListFragment.access$1600(TBOrderListFragment.this).a(TBOrderListFragment.this.getPublicMenu());
                    }
                    if (pVar.getTag("ali_ms_navigation") == null) {
                        pVar.setTag("ali_ms_navigation", TBOrderListFragment.access$1600(TBOrderListFragment.this));
                    }
                }
                if (this.h) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-url", ParallelBizValueHelper.b(ParallelBizValueHelper.PageType.order_list));
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
                }
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(TBOrderListFragment.this.getActivity());
                if (pageAllProperties != null && !pageAllProperties.isEmpty()) {
                    String str = "";
                    this.b = TextUtils.isEmpty(pageAllProperties.get("spm-cnt")) ? str : pageAllProperties.get("spm-cnt");
                    this.c = TextUtils.isEmpty(pageAllProperties.get("spm-url")) ? str : pageAllProperties.get("spm-url");
                    this.d = TextUtils.isEmpty(pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE)) ? str : pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE);
                    this.e = TextUtils.isEmpty(pageAllProperties.get(ag.KEY_UTPARAM_URL)) ? str : pageAllProperties.get(ag.KEY_UTPARAM_URL);
                    if (!TextUtils.isEmpty(pageAllProperties.get("utparam-pre"))) {
                        str = pageAllProperties.get("utparam-pre");
                    }
                    this.f = str;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: Throwable -> 0x0083, TryCatch #0 {Throwable -> 0x0083, blocks: (B:6:0x0018, B:9:0x001d, B:12:0x002e, B:19:0x004d, B:21:0x0057, B:24:0x005e, B:26:0x0062, B:30:0x0070, B:34:0x007e, B:33:0x007c, B:29:0x006e, B:17:0x0040, B:18:0x0047), top: B:39:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: Throwable -> 0x0083, TryCatch #0 {Throwable -> 0x0083, blocks: (B:6:0x0018, B:9:0x001d, B:12:0x002e, B:19:0x004d, B:21:0x0057, B:24:0x005e, B:26:0x0062, B:30:0x0070, B:34:0x007e, B:33:0x007c, B:29:0x006e, B:17:0x0040, B:18:0x0047), top: B:39:0x0018 }] */
        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.support.v4.app.DialogFragment r6, com.taobao.android.weex_framework.p r7) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.TBOrderListFragment.a.$ipChange
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
                boolean r6 = r5.h     // Catch: java.lang.Throwable -> L83
                if (r6 == 0) goto L1d
                return
            L1d:
                com.ut.mini.l r6 = com.ut.mini.l.getInstance()     // Catch: java.lang.Throwable -> L83
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: java.lang.Throwable -> L83
                android.support.v4.app.FragmentActivity r7 = com.taobao.android.order.bundle.TBOrderListFragment.access$600(r7)     // Catch: java.lang.Throwable -> L83
                com.ut.mini.l$c r6 = r6.getOrNewUTPageStateObject(r7)     // Catch: java.lang.Throwable -> L83
                if (r6 != 0) goto L2e
                return
            L2e:
                int[] r7 = com.taobao.android.order.bundle.TBOrderListFragment.AnonymousClass9.f14529a     // Catch: java.lang.Throwable -> L83
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r0 = r5.i     // Catch: java.lang.Throwable -> L83
                int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L83
                r7 = r7[r0]     // Catch: java.lang.Throwable -> L83
                java.lang.String r0 = ""
                if (r7 == r3) goto L47
                if (r7 == r2) goto L40
                r7 = r0
                goto L4d
            L40:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: java.lang.Throwable -> L83
                java.lang.String r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.b(r7)     // Catch: java.lang.Throwable -> L83
                goto L4d
            L47:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.order_detail     // Catch: java.lang.Throwable -> L83
                java.lang.String r7 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.b(r7)     // Catch: java.lang.Throwable -> L83
            L4d:
                r6.mSpmCnt = r7     // Catch: java.lang.Throwable -> L83
                java.lang.String r7 = r5.b     // Catch: java.lang.Throwable -> L83
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L83
                if (r7 != 0) goto L61
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r7 = r5.i     // Catch: java.lang.Throwable -> L83
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r1 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: java.lang.Throwable -> L83
                if (r7 != r1) goto L5e
                goto L61
            L5e:
                java.lang.String r7 = r5.b     // Catch: java.lang.Throwable -> L83
                goto L62
            L61:
                r7 = r0
            L62:
                r6.mSpmUrl = r7     // Catch: java.lang.Throwable -> L83
                java.lang.String r7 = r5.c     // Catch: java.lang.Throwable -> L83
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L83
                if (r7 == 0) goto L6e
                r7 = r0
                goto L70
            L6e:
                java.lang.String r7 = r5.c     // Catch: java.lang.Throwable -> L83
            L70:
                r6.mSpmPre = r7     // Catch: java.lang.Throwable -> L83
                java.lang.String r7 = r5.e     // Catch: java.lang.Throwable -> L83
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L83
                if (r7 == 0) goto L7c
                r7 = r0
                goto L7e
            L7c:
                java.lang.String r7 = r5.e     // Catch: java.lang.Throwable -> L83
            L7e:
                r6.mUtparamPre = r7     // Catch: java.lang.Throwable -> L83
                r6.mUtparamUrl = r0     // Catch: java.lang.Throwable -> L83
                return
            L83:
                r6 = move-exception
                r6.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListFragment.a.a(android.support.v4.app.DialogFragment, com.taobao.android.weex_framework.p):void");
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a
        public void c(DialogFragment dialogFragment, p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1b6c86d", new Object[]{this, dialogFragment, pVar});
                return;
            }
            try {
                TBOrderListFragment.access$1702(TBOrderListFragment.this, null);
                if (this.g) {
                    q.b("WebAppInterface");
                    this.g = false;
                }
                String str = "";
                if (this.h) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-cnt", !TextUtils.isEmpty(this.b) ? this.b : str);
                    hashMap.put("spm-url", !TextUtils.isEmpty(this.c) ? this.c : str);
                    hashMap.put(bip.KEY_UMBRELLA_SPM_PRE, !TextUtils.isEmpty(this.d) ? this.d : str);
                    hashMap.put("utparam-pre", !TextUtils.isEmpty(this.f) ? this.f : str);
                    if (!TextUtils.isEmpty(this.e)) {
                        str = this.e;
                    }
                    hashMap.put(ag.KEY_UTPARAM_URL, str);
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
                    return;
                }
                l.c orNewUTPageStateObject = l.getInstance().getOrNewUTPageStateObject(TBOrderListFragment.access$600(TBOrderListFragment.this));
                if (orNewUTPageStateObject == null) {
                    return;
                }
                orNewUTPageStateObject.mSpmCnt = !TextUtils.isEmpty(this.b) ? this.b : str;
                orNewUTPageStateObject.mSpmUrl = !TextUtils.isEmpty(this.c) ? this.c : str;
                orNewUTPageStateObject.mSpmPre = !TextUtils.isEmpty(this.d) ? this.d : str;
                orNewUTPageStateObject.mUtparamPre = !TextUtils.isEmpty(this.f) ? this.f : str;
                if (!TextUtils.isEmpty(this.e)) {
                    str = this.e;
                }
                orNewUTPageStateObject.mUtparamUrl = str;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
