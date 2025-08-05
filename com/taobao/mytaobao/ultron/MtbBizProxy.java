package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.i;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.ultron.e;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.ut.c;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.oversea.mytaobao.OvsMTPtrRecyclerView;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.aek;
import tb.aem;
import tb.ghi;
import tb.ghl;
import tb.ghm;
import tb.ghp;
import tb.kge;
import tb.kng;
import tb.mts;
import tb.mtx;
import tb.mug;
import tb.muj;
import tb.muk;
import tb.mvn;
import tb.mvp;
import tb.mvx;
import tb.mwp;
import tb.mwy;
import tb.mxa;
import tb.mxe;
import tb.mxf;
import tb.mxj;
import tb.mxo;
import tb.mxq;
import tb.nwv;
import tb.oby;

/* loaded from: classes7.dex */
public class MtbBizProxy extends com.taobao.mytaobao.base.d implements View.OnClickListener, mts, mwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private aek C;
    private e.a D;

    /* renamed from: a  reason: collision with root package name */
    private ghl f18479a;
    public LinearLayout b;
    public LinearLayout c;
    public mvp d;
    public final com.taobao.mytaobao.ui.b e;
    private final e g;
    private TBSwipeRefreshLayout h;
    private mwy i;
    private boolean j;
    private boolean k;
    private boolean l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private com.taobao.mytaobao.basement.i o;
    private boolean q;
    private boolean r;
    private long s;
    private View t;
    private boolean u;
    private final com.taobao.mytaobao.ui.a v;
    private final k w;
    private muj y;

    public static /* synthetic */ Object ipc$super(MtbBizProxy mtbBizProxy, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public static /* synthetic */ k a(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("58e38a19", new Object[]{mtbBizProxy}) : mtbBizProxy.w;
    }

    public static /* synthetic */ boolean a(MtbBizProxy mtbBizProxy, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54a0377e", new Object[]{mtbBizProxy, new Boolean(z)})).booleanValue();
        }
        mtbBizProxy.l = z;
        return z;
    }

    public static /* synthetic */ void b(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4b111b", new Object[]{mtbBizProxy});
        } else {
            mtbBizProxy.p();
        }
    }

    public static /* synthetic */ TBSwipeRefreshLayout c(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("ebf14295", new Object[]{mtbBizProxy}) : mtbBizProxy.h;
    }

    public static /* synthetic */ e d(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a83674bc", new Object[]{mtbBizProxy}) : mtbBizProxy.g;
    }

    public static /* synthetic */ com.taobao.mytaobao.basement.i e(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.i) ipChange.ipc$dispatch("da04f23c", new Object[]{mtbBizProxy}) : mtbBizProxy.o;
    }

    public static /* synthetic */ mwy f(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mwy) ipChange.ipc$dispatch("9dfda458", new Object[]{mtbBizProxy}) : mtbBizProxy.i;
    }

    public static /* synthetic */ boolean g(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("606edda4", new Object[]{mtbBizProxy})).booleanValue() : mtbBizProxy.x();
    }

    public static /* synthetic */ long h(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb0fa015", new Object[]{mtbBizProxy})).longValue() : mtbBizProxy.s;
    }

    public static /* synthetic */ boolean i(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95b062a6", new Object[]{mtbBizProxy})).booleanValue() : mtbBizProxy.k;
    }

    static {
        kge.a(513839197);
        kge.a(-1201612728);
        kge.a(-1963128178);
        kge.a(1961048505);
        TAG = MtbBizProxy.class.getSimpleName();
    }

    public MtbBizProxy(MyTaobaoFragment myTaobaoFragment) {
        super(myTaobaoFragment);
        this.g = new e();
        this.e = new com.taobao.mytaobao.ui.b();
        this.j = true;
        this.k = false;
        this.l = false;
        this.r = false;
        this.u = true;
        this.v = new com.taobao.mytaobao.ui.a();
        this.w = new k();
        this.C = new com.taobao.mytaobao.pop.bridge.a();
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        com.taobao.mytaobao.base.c.w = System.currentTimeMillis();
        this.w.a(activity);
        mxe.INSTANCE.l();
        final boolean a2 = a().a(activity);
        com.taobao.mytaobao.base.b.c(new Runnable() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nwv.c("进入异步1");
                mxe mxeVar = mxe.INSTANCE;
                nwv.c("进入异步2");
                mxe.INSTANCE.b();
                nwv.c("进入异步3");
                oby.INSTANCE.a(MtbBizProxy.a(MtbBizProxy.this).c());
                nwv.c("进入异步4");
                if (!a2) {
                    MtbBizProxy.this.a().a(activity);
                }
                nwv.c("进入异步5");
                mxe.INSTANCE.e();
                mxe.INSTANCE.f();
            }
        });
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        mxf.a("myTaobaoOnCreate");
        mxf.a(mxf.outerFragmentOnCreate);
        A().setUTPageName("Page_MyTaobao");
        com.taobao.mytaobao.basement.monitor.b.a().a(bundle);
        this.s = System.currentTimeMillis();
        if (com.taobao.mytaobao.base.c.w == 0) {
            com.taobao.mytaobao.base.c.w = System.currentTimeMillis();
        }
        if (bundle != null) {
            z = true;
        }
        this.q = z;
        mtx.d(this.q).a(1);
        mtx.d(this.q).a("PageInit");
        mxf.b(mxf.outerFragmentOnCreate);
    }

    @Override // com.taobao.mytaobao.base.d
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        nwv.a("mtbOnCreateView");
        nwv.c();
        if (this.t == null) {
            mxf.a(mxf.outerFragmentOnCreateView);
            a(viewGroup);
            if (com.taobao.mytaobao.base.c.r()) {
                this.t = layoutInflater.inflate(R.layout.mtb_ovs_activity_layout, viewGroup, false);
            } else {
                this.t = layoutInflater.inflate(R.layout.mtb_activity_layout, viewGroup, false);
            }
            nwv.b("step 1");
            mxf.a(mxf.viewInflate);
            mxf.b(mxf.viewInflate);
            r();
            nwv.b("step 2");
            this.y = new muj(this);
            muk.a(this.y);
            s();
            z();
            mxf.b(mxf.outerFragmentOnCreateView);
            nwv.b("step 4");
            q();
            this.g.i.postDelayed(new Runnable() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtbBizProxy.b(MtbBizProxy.this);
                    }
                }
            }, 2000L);
        }
        nwv.a();
        mxf.b("myTaobaoOnCreate");
        nwv.b("step 5");
        return this.t;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        aem.a().a(this.C);
        v();
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        View view = this.t;
        if (view == null || this.h == null) {
            return;
        }
        TBOldRefreshHeader tBOldRefreshHeader = new TBOldRefreshHeader(view.getContext());
        tBOldRefreshHeader.setBackgroundColor(0);
        this.h.setHeaderView(tBOldRefreshHeader);
        int a2 = this.e.a();
        if (a2 != -1) {
            tBOldRefreshHeader.setRefreshTipColor(a2);
        }
        this.h.setCustomRefreshHeight(DensityUtil.dip2px(this.t.getContext(), 40.0f));
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar != null && iVar.t()) {
            this.h.enablePullRefresh(false);
        } else {
            this.h.enablePullRefresh(true);
        }
        this.h.setDragRate(0.75f);
        this.h.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                MtbBizProxy.c(MtbBizProxy.this).setRefreshing(true);
                MtbBizProxy.d(MtbBizProxy.this).c("action_pull_refresh");
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                } else {
                    MtbBizProxy.this.e.a(-i);
                }
            }
        });
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        t();
        a().d();
        u();
        s();
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar != null) {
            iVar.a(this);
            b().a(this.o);
        }
        this.d.a(this);
        this.e.a(new View.OnClickListener() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                MtbBizProxy.this.e().smoothScrollToPosition(0);
                if (MtbBizProxy.this.e() instanceof OvsMTPtrRecyclerView) {
                    ((OvsMTPtrRecyclerView) MtbBizProxy.this.e()).scrollChildRVToTop();
                }
                com.taobao.mytaobao.ut.c.a("Page_MyTaobao", "Page_MyTaobao_click-headbar", "a2141.7631743.1102.1", (String) null, (JSONObject) null);
                if (MtbBizProxy.e(MtbBizProxy.this) == null || !MtbBizProxy.e(MtbBizProxy.this).t()) {
                    return;
                }
                MtbBizProxy.e(MtbBizProxy.this).c(BasementConstants.BEHAVIOR_HEADER_TAP);
            }
        });
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        mxf.a(mxf.initView);
        MTPtrRecyclerView mTPtrRecyclerView = (MTPtrRecyclerView) this.t.findViewById(R.id.recycler_view);
        a(mTPtrRecyclerView);
        mTPtrRecyclerView.setItemViewCacheSize(15);
        mTPtrRecyclerView.onScrollEnableChangeListener = new com.taobao.mytaobao.view.a() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.mytaobao.view.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (MtbBizProxy.c(MtbBizProxy.this) == null) {
                } else {
                    MtbBizProxy.c(MtbBizProxy.this).enablePullRefresh(z);
                }
            }
        };
        this.b = (LinearLayout) this.t.findViewById(R.id.top_layout);
        this.c = (LinearLayout) this.t.findViewById(R.id.bottom_layout);
        this.h = (TBSwipeRefreshLayout) this.t.findViewById(R.id.mtb_refresh);
        this.h.enableLoadMore(false);
        nwv.b("before");
        UserHeaderBgLayout userHeaderBgLayout = (UserHeaderBgLayout) this.t.findViewById(R.id.mtb_head_layout);
        this.v.a(userHeaderBgLayout);
        this.e.a(this.t, mTPtrRecyclerView, this.h, userHeaderBgLayout);
        this.e.a(mTPtrRecyclerView);
        this.e.a(m());
        nwv.b("after initView 1");
        this.o = new com.taobao.mytaobao.basement.i(mTPtrRecyclerView, this);
        nwv.b("after initView 2");
        mxf.b(mxf.initView);
        nwv.b("after initView");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    @Override // com.taobao.mytaobao.base.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.ultron.MtbBizProxy.d():void");
    }

    @Override // com.taobao.mytaobao.base.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.j = true;
        mwy mwyVar = this.i;
        if (mwyVar == null) {
            return;
        }
        mwyVar.b();
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        nwv.b("beforeInitData");
        mxf.a("mytaobaoInitData");
        this.k = true;
        mxf.a("ultronDXContainerInit");
        com.alibaba.android.ultron.vfw.instance.d b = this.w.b();
        nwv.b("beforeInitData 1");
        mvx a2 = this.w.a();
        if (a2 == null) {
            a2 = new mvx();
        }
        this.g.a(this, this.q, b, a2);
        nwv.b("beforeInitData 2");
        this.g.a(A(), this.b, e(), this.c);
        nwv.b("beforeInitData 3");
        mxf.b("ultronDXContainerInit");
        mxf.a(mxf.initSnapshot);
        this.D = new e.a() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.mytaobao.ultron.e.a
            public void a(int i, int i2, int i3, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49ba1515", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                    return;
                }
                TLog.loge("mtbMainLink", "onRequestPageFinish,requestType=" + i);
                if (i2 != 0) {
                    return;
                }
                com.taobao.mytaobao.ui.b bVar = MtbBizProxy.this.e;
                if (i != 0) {
                    z = false;
                }
                bVar.a(z, jSONObject);
                if (MtbBizProxy.f(MtbBizProxy.this) == null) {
                    return;
                }
                MtbBizProxy.f(MtbBizProxy.this).a();
                if (i == 0) {
                    return;
                }
                MtbBizProxy.f(MtbBizProxy.this).a(MtbBizProxy.this.e());
            }

            @Override // com.taobao.mytaobao.ultron.e.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (MtbBizProxy.f(MtbBizProxy.this) == null) {
                } else {
                    MtbBizProxy.f(MtbBizProxy.this).a(MtbBizProxy.this.e());
                }
            }
        };
        this.g.a(this.D);
        this.i = new mwy(this.g.h(), e());
        e().addOnScrollListener(this.i);
        nwv.b("beforeInitData 4");
        this.g.c();
        nwv.b("beforeInitData 5");
        nwv.b("beforeInitData 6");
        mtx.d(this.q).a("PageInit", null);
        mxf.b(mxf.initSnapshot);
        if (com.taobao.mytaobao.basement.a.b()) {
            mxf.a(mxf.initWindWeexBasement);
            String c = com.taobao.mytaobao.basement.a.c();
            if (!TextUtils.isEmpty(c)) {
                mtx.d(this.q).a(true);
                if (this.o != null) {
                    com.taobao.mytaobao.basement.a.g();
                    nwv.b("beforeInitData 6.1");
                    this.o.a().a(BasementConstants.INIT_BY_CACHE, c);
                }
            } else {
                mtx.b("【错误】首次预加载，weexUrl=null");
            }
            mxf.b(mxf.initWindWeexBasement);
        } else {
            mtx.d(this.q).a(false);
        }
        this.g.j();
        this.g.b();
        nwv.b("beforeInitData 7");
        this.d = new mvp();
        mxf.b("mytaobaoInitData");
        nwv.b("beforeInitData 8");
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf872664", new Object[]{this, loginAction});
        } else if (loginAction == null) {
        } else {
            if (loginAction.equals(LoginAction.NOTIFY_LOGOUT)) {
                this.g.d();
                mtx.d(this.q).b(1);
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGOUT, thread=" + Thread.currentThread().getName());
                this.r = true;
            } else if (!loginAction.equals(LoginAction.NOTIFY_LOGIN_SUCCESS) || mxq.b(m())) {
            } else {
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGIN_SUCCESS, thread=" + Thread.currentThread().getName() + " isLogout=" + this.r);
                if (this.r) {
                    mtx.d(this.q).a(2);
                    com.taobao.mytaobao.basement.i iVar = this.o;
                    if (iVar != null && iVar.k()) {
                        a(BasementConstants.BEHAVIOR_CHANGE_ACCOUNT, false);
                        this.o.i();
                    }
                }
                this.g.e();
                mxe mxeVar = mxe.INSTANCE;
                this.j = true;
                this.r = false;
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        boolean b = com.taobao.mytaobao.basement.a.b();
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar == null || !b || !iVar.k()) {
            return;
        }
        this.o.c(i);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.e.a(false, (JSONObject) null);
        }
    }

    @Override // com.taobao.mytaobao.base.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        kng.b();
        mwy mwyVar = this.i;
        if (mwyVar != null) {
            mwyVar.a(e());
        }
        BehaviR.getInstance().commitLeave("Page_MyTaobao", null, m(), "");
        com.taobao.mytaobao.basement.monitor.c.a().b(B());
    }

    @Override // com.taobao.mytaobao.base.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar == null) {
            return;
        }
        iVar.n();
    }

    @Override // com.taobao.mytaobao.base.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.base.c.x = null;
        this.e.b();
        mwy mwyVar = this.i;
        if (mwyVar != null) {
            mwyVar.a();
        }
        this.g.n();
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar != null) {
            iVar.o();
        }
        mvp mvpVar = this.d;
        if (mvpVar != null) {
            mvpVar.a();
        }
        com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).d();
        try {
            w();
        } catch (Exception unused) {
        }
        Activity m = m();
        if (m instanceof TBMainActivity) {
            ((TBMainActivity) m).registerOnKeyDownListener(null);
        }
        aem.a().b(this.C);
        if (!mxj.a("fixWeexPreloadLeak", true)) {
            return;
        }
        a().e();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.h;
        if (tBSwipeRefreshLayout != null && tBSwipeRefreshLayout.isRefreshing()) {
            this.h.setRefreshing(false);
        }
        e.a aVar = this.D;
        if (aVar == null) {
            return;
        }
        aVar.a(2, 0, 2, null);
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d h = this.g.h();
        if (h != null) {
            if (z) {
                if (h.x() != null) {
                    h.x().B();
                }
                h.a(jSONObject, this.g.f);
            } else {
                h.a(this.g.f);
            }
        }
        l();
        this.e.a(true);
        a(false, e.b(jSONObject.getJSONObject("data")));
        e.a aVar = this.D;
        if (aVar == null) {
            return;
        }
        aVar.a(2, 0, 0, jSONObject);
    }

    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            this.v.a(z, jSONObject);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.h;
        if (tBSwipeRefreshLayout == null || !tBSwipeRefreshLayout.isRefreshing()) {
            return;
        }
        this.h.setRefreshing(false);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.m = new MyTaobaoPageBroadcastReceiver();
        this.n = new PageBroadcastReceiver();
        if (mxa.c()) {
            mug.a(true, this.n, com.taobao.android.tbtheme.kit.j.ACTION_THEME_CHANGE);
        } else {
            mug.a(false, this.n, FestivalMgr.ACTION_FESTIVAL_CHANGE);
            mug.a(true, this.n, FestivalMgr.ACTION_FESTIVAL_CHANGE);
        }
        mug.a(true, this.n, mxo.SKIN_BROADCAST_ACTION);
        mug.a(false, this.m, "MyTaobao_Order_Refresh", "EDITON_SWITCHER_EDITTION_CODE_CHANGED", mug.ACTION_REFRESH_PAGE, mvn.ACTION_USER_AVATAR_CHANGED);
        mug.a(true, this.m, "MyTaobao_Order_Refresh", mug.ACTION_REFRESH_PAGE, mug.ACTION_SCROLL_TO_CARD, "taobao.action.ACTION_REVISION_SWITCH_CHANGE", mug.ACTION_REFRESH_PAGE_WHEN_SHOW);
        this.f18479a = new ghl() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ghl
            public void a(ghp ghpVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea458cc9", new Object[]{this, ghpVar});
                } else {
                    MtbBizProxy.a(MtbBizProxy.this, true);
                }
            }
        };
        if (!mxj.a("enableSwitchSink", true)) {
            return;
        }
        ((ghm) ghi.a(ghm.class)).addChangeVersionListener(this.f18479a);
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver != null) {
            mug.a(true, broadcastReceiver);
            mug.a(false, this.m);
        }
        BroadcastReceiver broadcastReceiver2 = this.n;
        if (broadcastReceiver2 != null) {
            mug.a(false, broadcastReceiver2);
            mug.a(true, this.n);
        }
        if (this.f18479a == null) {
            return;
        }
        ((ghm) ghi.a(ghm.class)).removeChangeVersionListener(this.f18479a);
    }

    public com.taobao.mytaobao.base.e B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.base.e) ipChange.ipc$dispatch("b47ef253", new Object[]{this}) : this.o;
    }

    /* loaded from: classes7.dex */
    public class MyTaobaoPageBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2123062016);
        }

        public MyTaobaoPageBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction()) || mxq.b(MtbBizProxy.this.m())) {
            } else {
                String action = intent.getAction();
                if (MtbBizProxy.d(MtbBizProxy.this) == null) {
                    return;
                }
                if (mug.ACTION_REFRESH_PAGE_WHEN_SHOW.equals(action) && !MtbBizProxy.g(MtbBizProxy.this)) {
                    MtbBizProxy.a(MtbBizProxy.this, true);
                } else {
                    MtbBizProxy.d(MtbBizProxy.this).a(action, intent);
                }
            }
        }
    }

    private boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : A().isAdded() && A().isResumed() && com.taobao.tao.navigation.e.c() != null && com.taobao.tao.navigation.e.c().getCurrentTab() == 4;
    }

    @Override // tb.mwp
    public JSONObject findWeexNodeLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, str});
        }
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar != null) {
            return iVar.a().d(str);
        }
        return null;
    }

    @Override // tb.mwp
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.mytaobao.basement.i iVar = this.o;
        i.b a2 = iVar == null ? null : iVar.a();
        if (a2 == null) {
            return;
        }
        a2.a(str, jSONObject);
    }

    @Override // tb.mwp
    public DXWidgetNode findWidgetNodeByUserId(String str) {
        RecyclerView.LayoutManager layoutManager;
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c707e44c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (layoutManager = e().getLayoutManager()) == null) {
            return null;
        }
        for (int i = 0; i < layoutManager.getItemCount(); i++) {
            View findViewByPosition = layoutManager.findViewByPosition(i);
            if ((findViewByPosition instanceof DXRootView) && (flattenWidgetNode = ((DXRootView) findViewByPosition).getFlattenWidgetNode()) != null && (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str)) != null) {
                return queryWidgetNodeByUserId;
            }
        }
        return null;
    }

    @Override // tb.mwp
    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.t;
    }

    @Override // tb.mwp
    public Pair<Rect, Boolean> findBasementLocalInWindow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5e426f69", new Object[]{this});
        }
        FrameLayout flEndViewContainer = e().getFlEndViewContainer();
        if (flEndViewContainer == null || !com.taobao.mytaobao.basement.a.b()) {
            return null;
        }
        Rect rect = new Rect();
        if (flEndViewContainer.getGlobalVisibleRect(rect) && flEndViewContainer.isShown()) {
            z = true;
        }
        return new Pair<>(rect, Boolean.valueOf(z));
    }

    /* loaded from: classes7.dex */
    public class PageBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1174281690);
        }

        public PageBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction()) || mxq.b(MtbBizProxy.this.m())) {
            } else {
                String stringExtra = intent.getStringExtra("extra-festival-change-reason");
                if (mxa.c()) {
                    if (!TextUtils.equals(com.taobao.android.tbtheme.kit.j.ACTION_THEME_CHANGE, intent.getAction())) {
                        return;
                    }
                    MtbBizProxy.this.e.c();
                    if (System.currentTimeMillis() - MtbBizProxy.h(MtbBizProxy.this) < 3000) {
                        return;
                    }
                    MtbBizProxy.d(MtbBizProxy.this).k();
                } else if ((!TextUtils.equals(stringExtra, FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE) && !TextUtils.equals(intent.getAction(), mxo.SKIN_BROADCAST_ACTION)) || !MtbBizProxy.i(MtbBizProxy.this)) {
                } else {
                    FestivalMgr.a().c();
                    MtbBizProxy.this.e.e();
                    MtbBizProxy.d(MtbBizProxy.this).k();
                }
            }
        }
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        final MTPtrRecyclerView e = e();
        if (e == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (MtbBizProxy.e(MtbBizProxy.this) != null && MtbBizProxy.e(MtbBizProxy.this).t()) {
                    MtbBizProxy.e(MtbBizProxy.this).c(str);
                }
                RecyclerView recyclerView = e;
                if (recyclerView instanceof OvsMTPtrRecyclerView) {
                    ((OvsMTPtrRecyclerView) recyclerView).scrollChildRVToTop();
                }
                if (z) {
                    e.smoothScrollToPosition(0);
                } else if (e.getLayoutManager() instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) e.getLayoutManager()).scrollToPositionWithOffset(0, 0);
                } else {
                    e.scrollToPosition(0);
                }
            }
        };
        if (e.isAttachedToWindow()) {
            runnable.run();
        } else {
            e.post(runnable);
        }
    }

    public com.taobao.mytaobao.basement.i o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.i) ipChange.ipc$dispatch("de2afa64", new Object[]{this}) : this.o;
    }

    @Override // tb.mts
    public void changeToBasement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803d8ea1", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(m());
        c.a c = com.taobao.mytaobao.basement.weex.a.INSTANCE.c(b.a().o());
        A().setUTPageName(c.b);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(m(), c.b);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(m(), c.b);
        HashMap hashMap = new HashMap();
        if (com.taobao.mytaobao.basement.a.b()) {
            hashMap.put("isWeex", "true");
        }
        com.taobao.mytaobao.basement.i iVar = this.o;
        if (iVar != null) {
            com.taobao.mytaobao.ut.c.a(iVar, m(), c.b, c.c, hashMap);
        } else {
            hashMap.put("scm", "20140623.1.20.2");
            hashMap.put("spm-cnt", BasementConstants.SPM);
            com.taobao.mytaobao.ut.c.a(m(), hashMap);
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("spm-url", c.c);
        com.taobao.mytaobao.ut.c.a(hashMap2);
        if (A().isResumed()) {
            com.taobao.mytaobao.basement.monitor.b.a().b("changeToBasementStatus");
        } else {
            com.taobao.mytaobao.basement.monitor.b.a().a("changeToBasementStatus", "-1", "");
        }
    }

    @Override // tb.mts
    public void changeToMainPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88d65a", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(m());
        A().setUTPageName("Page_MyTaobao");
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(m(), A().getUTPageName());
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(m(), "Page_MyTaobao");
        HashMap hashMap = new HashMap();
        hashMap.put("scm", "20140623.1.20.2");
        hashMap.put("spm-cnt", "a2141.7631743");
        if (com.taobao.mytaobao.basement.a.b()) {
            hashMap.put("isWeex", "true");
        }
        com.taobao.mytaobao.ut.c.a(m(), hashMap);
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("spm-url", "a2141.7631743");
        com.taobao.mytaobao.ut.c.a(hashMap2);
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        Activity m = m();
        if (!(m instanceof TBMainActivity)) {
            return;
        }
        ((TBMainActivity) m).registerOnKeyDownListener(new com.taobao.tao.h() { // from class: com.taobao.mytaobao.ultron.MtbBizProxy.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.h
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
                }
                if (!MtbBizProxy.this.A().isVisible() || keyEvent.getAction() != 0 || i != 4 || MtbBizProxy.e(MtbBizProxy.this) == null || !MtbBizProxy.e(MtbBizProxy.this).t()) {
                    return false;
                }
                com.taobao.mytaobao.ut.c.a("Page_MyTaobao", "Page_MyTaobao_slide-basement", "a2141.7631743.567.1", (String) null, (JSONObject) null);
                MtbBizProxy.this.a(BasementConstants.BEHAVIOR_BACK_PRESS, true);
                return true;
            }
        });
    }
}
