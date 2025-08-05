package com.taobao.mytaobao.pagev2;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.base.Versions;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.ultron.j;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.ut.c;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.search.common.util.i;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.h;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.acj;
import tb.ack;
import tb.kge;
import tb.kng;
import tb.mts;
import tb.muj;
import tb.muk;
import tb.mvp;
import tb.mwp;
import tb.mxf;
import tb.mxz;
import tb.nwv;
import tb.xnx;
import tb.xny;
import tb.xol;
import tb.xon;
import tb.xor;
import tb.xos;
import tb.xot;
import tb.xou;
import tb.xov;
import tb.xow;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u001e\u0010*\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/H\u0002J\u0016\u00100\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0018\u000101H\u0016J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0016J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u000107H\u0017J\u0006\u0010;\u001a\u00020(J\n\u0010<\u001a\u0004\u0018\u00010=H\u0016J\n\u0010>\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010?\u001a\u00020(2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0006\u0010B\u001a\u00020(J\b\u0010C\u001a\u00020(H\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020(2\u0006\u0010E\u001a\u00020FH\u0016J\u0012\u0010H\u001a\u00020(2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J&\u0010K\u001a\u0004\u0018\u00010\f2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010O2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010P\u001a\u00020(H\u0016J\b\u0010Q\u001a\u00020(H\u0016J\b\u0010R\u001a\u00020(H\u0016J\b\u0010S\u001a\u00020(H\u0016J\b\u0010T\u001a\u00020(H\u0016J\b\u0010U\u001a\u00020(H\u0016J\u0010\u0010V\u001a\u00020(2\u0006\u0010W\u001a\u00020XH\u0016J\u0018\u0010Y\u001a\u00020(2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u000205H\u0002J\b\u0010]\u001a\u00020(H\u0002J\b\u0010^\u001a\u00020(H\u0002J\u0018\u0010_\u001a\u00020(2\u0006\u0010`\u001a\u0002072\u0006\u0010a\u001a\u000203H\u0016J\u001a\u0010b\u001a\u00020(2\u0006\u0010c\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u000105H\u0016J\u0006\u0010e\u001a\u00020(J\b\u0010f\u001a\u00020(H\u0002J\b\u0010g\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006h"}, d2 = {"Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "Lcom/taobao/mytaobao/base/AbsMtbBizProxy;", "Lcom/taobao/mytaobao/basement/listener/IContainerChangeListener;", "Lcom/taobao/mytaobao/ultron/listener/IMTBFragmentProcessor;", "mtbFragment", "Lcom/taobao/mytaobao/homepage/MyTaobaoFragment;", "(Lcom/taobao/mytaobao/homepage/MyTaobaoFragment;)V", "mAdapter", "Lcom/taobao/mytaobao/pagev2/architecture/MtbAdapter;", "mMtbPopPresenter", "Lcom/taobao/mytaobao/pop/MTBPopPresenter;", "mRootView", "Landroid/view/View;", "mtbContext", "Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;", "getMtbContext", "()Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;", "mtbPageExposureProcessor", "Lcom/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor;", "mtbWeexManager", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager;", "onCreateTimeMillis", "", "getOnCreateTimeMillis", "()J", "setOnCreateTimeMillis", "(J)V", "presenter", "Lcom/taobao/mytaobao/pagev2/presenter/MtbPresenterV2;", "refreshHeaderUIHelper", "Lcom/taobao/mytaobao/pagev2/ui/RefreshHeaderUIHelper;", "screenChangeProcessor", "Lcom/taobao/mytaobao/pagev2/ui/MtbScreenChangeProcessor;", "themeHelper", "Lcom/taobao/mytaobao/pagev2/ui/ThemeHelperV2;", "titleBarHelper", "Lcom/taobao/mytaobao/pagev2/ui/TitleBarHelperV2;", "getTitleBarHelper", "()Lcom/taobao/mytaobao/pagev2/ui/TitleBarHelperV2;", "changeToBasement", "", "changeToMainPage", "diffUpdateList", "newList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "diffCallback", "Landroid/support/v7/util/DiffUtil$Callback;", "findBasementLocalInWindow", "Landroid/util/Pair;", "Landroid/graphics/Rect;", "", "findWeexNodeLocal", "Lcom/alibaba/fastjson/JSONObject;", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "", "findWidgetNodeByUserId", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "userId", "forceRefreshList", "getIBasementManager", "Lcom/taobao/mytaobao/base/IBasementManager;", "getRootView", "handleLoginAction", "action", "Lcom/taobao/login4android/broadcast/LoginAction;", "handleThemeChange", "initData", mxf.initView, "ctx", "Landroid/content/Context;", "onAttach", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", MessageID.onDestroy, "onDestroyView", "onPause", "onResume", "onStart", MessageID.onStop, "preloadMtb", "aty", "Landroid/app/Activity;", "processGlobalChange", "sourceFrom", "", "global", "registerBackKeyDown", "registerListeners", "scrollToTop", "behavior", "smoothScroll", "sendWeexEvent", "eventName", "eventData", "subscribeDataService", "unRegisterListeners", "updateActionBar", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a extends com.taobao.mytaobao.base.d implements mts, mwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f18439a;
    private final xny b;
    private final com.taobao.mytaobao.pagev2.b c;
    private final xnx d;
    private xou e;
    private final xov f;
    private final xow g;
    private xot h;
    private final xos i;
    private long j;
    private final xor k;
    private mvp l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/mytaobao/pagev2/MtbBizProxyV2$initView$2", "Lcom/taobao/mytaobao/view/ScrollEnableChangeListener;", "onScrollEnableChange", "", "enable", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements com.taobao.mytaobao.view.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xou f18442a;

        public c(xou xouVar) {
            this.f18442a = xouVar;
        }

        @Override // com.taobao.mytaobao.view.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f18442a.a().enablePullRefresh(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTPtrRecyclerView b;

        public d(MTPtrRecyclerView mTPtrRecyclerView) {
            this.b = mTPtrRecyclerView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.b.smoothScrollToPosition(0);
            com.taobao.mytaobao.ut.c.a("Page_MyTaobao", "Page_MyTaobao_click-headbar", "a2141.7631743.1102.1", (String) null, (JSONObject) null);
            if (!a.b(a.this).t()) {
                return;
            }
            a.b(a.this).a(BasementConstants.BEHAVIOR_HEADER_TAP);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "kotlin.jvm.PlatformType", "onKeyDown"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class e implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.tao.h
        public final boolean onKeyDown(int i, KeyEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), event})).booleanValue();
            }
            if (!a.this.A().isVisible()) {
                return false;
            }
            q.a((Object) event, "event");
            if (event.getAction() != 0 || i != 4 || !a.b(a.this).t()) {
                return false;
            }
            com.taobao.mytaobao.ut.c.a("Page_MyTaobao", "Page_MyTaobao_slide-basement", "a2141.7631743.567.1", (String) null, (JSONObject) null);
            a.this.a(BasementConstants.BEHAVIOR_BACK_PRESS, true);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MTPtrRecyclerView d;
        public final /* synthetic */ RecyclerView.LayoutManager e;

        public f(String str, boolean z, MTPtrRecyclerView mTPtrRecyclerView, RecyclerView.LayoutManager layoutManager) {
            this.b = str;
            this.c = z;
            this.d = mTPtrRecyclerView;
            this.e = layoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (a.b(a.this).t()) {
                a.b(a.this).a(this.b);
            }
            if (this.c) {
                this.d.smoothScrollToPosition(0);
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.e;
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
            } else {
                this.d.scrollToPosition(0);
            }
        }
    }

    static {
        kge.a(-1547043632);
        kge.a(1961048505);
        kge.a(-1963128178);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.mytaobao.base.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MyTaobaoFragment mtbFragment) {
        super(mtbFragment);
        q.c(mtbFragment, "mtbFragment");
        this.b = new xny();
        Lifecycle lifecycle = mtbFragment.getLifecycle();
        q.a((Object) lifecycle, "mtbFragment.lifecycle");
        this.c = new com.taobao.mytaobao.pagev2.b(lifecycle, this);
        this.d = new xnx(this.b, this.c);
        this.f = new xov();
        this.g = new xow();
        this.i = new xos(this);
        this.k = new xor();
    }

    public static final /* synthetic */ xov a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xov) ipChange.ipc$dispatch("d19593ef", new Object[]{aVar}) : aVar.f;
    }

    public static final /* synthetic */ void a(a aVar, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0788165", new Object[]{aVar, new Integer(i), jSONObject});
        } else {
            aVar.a(i, jSONObject);
        }
    }

    public static final /* synthetic */ void a(a aVar, List list, acj.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a009bd4", new Object[]{aVar, list, aVar2});
        } else {
            aVar.a(list, aVar2);
        }
    }

    public static final /* synthetic */ com.taobao.mytaobao.pagev2.b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.pagev2.b) ipChange.ipc$dispatch("a4ba446c", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ xnx c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xnx) ipChange.ipc$dispatch("e05ffaaa", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3316d21c", new Object[]{aVar});
        } else {
            aVar.s();
        }
    }

    public final xny g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xny) ipChange.ipc$dispatch("3d36bd75", new Object[]{this}) : this.b;
    }

    public final xow k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xow) ipChange.ipc$dispatch("5bfd5674", new Object[]{this}) : this.g;
    }

    public final long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.j;
    }

    public com.taobao.mytaobao.base.e o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.base.e) ipChange.ipc$dispatch("a4fa2c86", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(Activity aty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, aty});
            return;
        }
        q.c(aty, "aty");
        this.i.a(this, aty);
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        mxf.a("myTaobaoOnCreate");
        mxf.a(mxf.outerFragmentOnCreate);
        A().setUTPageName("Page_MyTaobao");
        com.taobao.mytaobao.basement.monitor.b.a().a(bundle);
        this.j = System.currentTimeMillis();
        xos xosVar = this.i;
        if (bundle == null) {
            z = false;
        }
        xosVar.a(z);
        this.i.d();
        mxf.b(mxf.outerFragmentOnCreate);
    }

    @Override // com.taobao.mytaobao.base.d
    public View a(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        nwv.a("mtbOnCreateView");
        nwv.c();
        if (this.f18439a == null) {
            a(viewGroup);
            nwv.a(mxf.initView);
            Context context = inflater.getContext();
            q.a((Object) context, "inflater.context");
            b(context);
            nwv.e(mxf.initView);
            nwv.a("initData");
            t();
            nwv.e("initData");
        }
        nwv.e("mtbOnCreateView");
        mxf.b("myTaobaoOnCreate");
        return this.f18439a;
    }

    private final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        UserHeaderBgLayout userHeaderBgLayout = new UserHeaderBgLayout(context);
        frameLayout.addView(userHeaderBgLayout, -1, -1);
        xou xouVar = new xou(context);
        xouVar.a().setOnPullRefreshListener(new b(xouVar));
        this.e = xouVar;
        frameLayout.addView(xouVar.a(), -1, -1);
        MTPtrRecyclerView mTPtrRecyclerView = new MTPtrRecyclerView(context);
        a(mTPtrRecyclerView);
        mTPtrRecyclerView.v2 = true;
        mTPtrRecyclerView.setLayoutManager(new j(context, 1, false));
        mTPtrRecyclerView.setAdapter(this.d);
        xouVar.a().addView(mTPtrRecyclerView, -1, -1);
        mTPtrRecyclerView.onScrollEnableChangeListener = new c(xouVar);
        this.g.a(context, mTPtrRecyclerView);
        this.g.a(new d(mTPtrRecyclerView));
        this.g.a(new MtbBizProxyV2$initView$4(xouVar));
        FrameLayout a2 = this.g.a();
        if (a2 == null) {
            q.a();
        }
        frameLayout.addView(a2);
        this.c.a(mTPtrRecyclerView);
        if (Versions.isDebug()) {
            TextView textView = new TextView(context);
            textView.setText("新");
            textView.setGravity(17);
            textView.setTextColor(-65536);
            frameLayout.addView(textView, -1, 250);
        }
        View view = new View(context);
        view.setBackgroundColor(-65536);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(2, 2);
        marginLayoutParams.topMargin = 250;
        marginLayoutParams.leftMargin = 5;
        frameLayout.addView(view, marginLayoutParams);
        this.f18439a = frameLayout;
        this.f.a(userHeaderBgLayout, mTPtrRecyclerView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/mytaobao/pagev2/MtbBizProxyV2$initView$1", "Lcom/taobao/uikit/extend/component/refresh/TBSwipeRefreshLayout$OnPullRefreshListener;", "onPullDistance", "", com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, "", "onRefresh", "onRefreshStateChanged", "refreshState", "Lcom/taobao/uikit/extend/component/refresh/TBRefreshHeader$RefreshState;", "refreshState1", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ xou b;

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            }
        }

        public b(xou xouVar) {
            this.b = xouVar;
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else {
                a.a(a.this).a(-i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            this.b.a().setRefreshing(true);
            com.taobao.mytaobao.pagev2.dataservice.a.a(2);
        }
    }

    private final void a(int i, JSONObject jSONObject) {
        TBSwipeRefreshLayout a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        this.i.a(i, jSONObject);
        this.d.a(jSONObject);
        boolean z = i == 1 || i == 2;
        this.f.a(true, jSONObject.getJSONObject("customSkin"));
        this.f.b(z, jSONObject.getJSONObject("skinConfig"));
        xou xouVar = this.e;
        if (xouVar == null || (a2 = xouVar.a()) == null) {
            return;
        }
        a2.setRefreshing(false);
    }

    private final void a(List<xol> list, acj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae113124", new Object[]{this, list, aVar});
            return;
        }
        nwv.f("执行diffUpdateList");
        acj.b a2 = acj.a(aVar);
        this.d.a(list);
        a2.a(new C0736a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/taobao/mytaobao/pagev2/MtbBizProxyV2$diffUpdateList$1", "Landroid/support/v7/util/ListUpdateCallback;", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.pagev2.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0736a implements ack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0736a() {
        }

        @Override // tb.ack
        public void onChanged(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdc6818", new Object[]{this, new Integer(i), new Integer(i2), obj});
                return;
            }
            nwv.f("onChanged, pos=" + i + " count=" + i2 + " payload=" + obj);
            a.c(a.this).notifyItemRangeChanged(i, i2, obj);
        }

        @Override // tb.ack
        public void onMoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbec943b", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            nwv.f("onMoved, fromPosition=" + i + " toPosition=" + i2);
            a.c(a.this).notifyItemMoved(i, i2);
        }

        @Override // tb.ack
        public void onInserted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("706b59fe", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            nwv.f("onInserted, position=" + i + " count=" + i2);
            a.c(a.this).notifyItemRangeInserted(i, i2);
        }

        @Override // tb.ack
        public void onRemoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11dc13e8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            nwv.f("onRemoved, position=" + i + " count=" + i2);
            a.c(a.this).notifyItemRangeRemoved(i, i2);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.pagev2.dataservice.a.d(new MtbBizProxyV2$subscribeDataService$1(this));
        com.taobao.mytaobao.pagev2.dataservice.a.c(new MtbBizProxyV2$subscribeDataService$2(this));
        com.taobao.mytaobao.pagev2.dataservice.a.b(new MtbBizProxyV2$subscribeDataService$3(this));
        com.taobao.mytaobao.pagev2.dataservice.a.b(new MtbBizProxyV2$subscribeDataService$4(this));
        com.taobao.mytaobao.pagev2.dataservice.a.a(new MtbBizProxyV2$subscribeDataService$5(this));
        com.taobao.mytaobao.pagev2.dataservice.a.a(new MtbBizProxyV2$subscribeDataService$6(this));
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.g.a(com.taobao.mytaobao.pagev2.dataservice.a.c(), com.taobao.mytaobao.pagev2.dataservice.a.d(), com.taobao.mytaobao.pagev2.dataservice.a.e(), com.taobao.mytaobao.pagev2.dataservice.a.f(), com.taobao.mytaobao.pagev2.dataservice.a.g());
        }
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        nwv.f("开始监听");
        xor xorVar = this.k;
        MTPtrRecyclerView e2 = e();
        if (e2 == null) {
            q.a();
        }
        xorVar.a(e2, this.d);
        xon h = com.taobao.mytaobao.pagev2.dataservice.a.h();
        List<xol> b2 = h != null ? h.b() : null;
        JSONObject a2 = h != null ? h.a() : null;
        if (a2 != null) {
            a(h.d(), a2);
        }
        if (b2 != null) {
            this.d.a(b2);
            this.d.notifyDataSetChanged();
            xor.a(this.k, false, 1, null);
        }
        s();
        p();
        this.b.c().a(new MtbBizProxyV2$initData$1(this));
        this.l = new mvp();
        u();
        this.i.b();
        this.c.c();
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        FragmentActivity requireActivity = A().requireActivity();
        q.a((Object) requireActivity, "mtbFragment.requireActivity()");
        this.h = new xot(requireActivity, this.f, this.c, this);
        xot xotVar = this.h;
        if (xotVar != null) {
            xotVar.a();
        }
        this.c.a(this);
        mvp mvpVar = this.l;
        if (mvpVar != null) {
            mvpVar.a(this);
        }
        muk.a(new muj(this));
        w();
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        xot xotVar = this.h;
        if (xotVar != null) {
            xotVar.b();
        }
        FragmentActivity activity = A().getActivity();
        if (!(activity instanceof TBMainActivity)) {
            activity = null;
        }
        TBMainActivity tBMainActivity = (TBMainActivity) activity;
        if (tBMainActivity == null) {
            return;
        }
        tBMainActivity.registerOnKeyDownListener(null);
    }

    @Override // com.taobao.mytaobao.base.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.i.a()) {
            mxf.a(mxf.outerFragmentOnResume);
        }
        if (this.c.t()) {
            xon h = com.taobao.mytaobao.pagev2.dataservice.a.h();
            c.a c2 = com.taobao.mytaobao.basement.weex.a.INSTANCE.c(h != null ? h.c() : null);
            A().setUTPageName(c2.b);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().updatePageName(m(), c2.b);
            com.taobao.mytaobao.ut.c.a(com.taobao.mytaobao.basement.i.class.getName(), m(), c2.b, c2.c, ai.b(kotlin.j.a("isWeex", "true")));
        } else {
            A().setUTPageName("Page_MyTaobao");
            UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
            q.a((Object) uTAnalytics2, "UTAnalytics.getInstance()");
            uTAnalytics2.getDefaultTracker().updatePageName(m(), "Page_MyTaobao");
            com.taobao.mytaobao.ut.c.a(this, m(), ai.b(kotlin.j.a("isWeex", "true")));
        }
        BehaviR.getInstance().commitEnter("Page_MyTaobao", null, m(), "");
        com.taobao.mytaobao.basement.monitor.c.a().a(o());
        mxz.a();
        kng.a();
        if (!this.i.a()) {
            com.taobao.mytaobao.pagev2.dataservice.a.j();
        }
        this.c.f();
        if (this.i.a()) {
            mxf.b(mxf.outerFragmentOnResume);
        }
        this.i.b(false);
    }

    @Override // com.taobao.mytaobao.base.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.mytaobao.pagev2.dataservice.a.k();
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
        BehaviR.getInstance().commitLeave("Page_MyTaobao", null, m(), "");
        com.taobao.mytaobao.basement.monitor.c.a().b(o());
    }

    @Override // com.taobao.mytaobao.base.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        v();
        this.i.c();
        com.taobao.mytaobao.base.c.x = null;
        this.g.b();
        this.c.e();
        mvp mvpVar = this.l;
        if (mvpVar != null) {
            mvpVar.a();
        }
        com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).d();
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, ctx});
            return;
        }
        q.c(ctx, "ctx");
        this.i.e();
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf872664", new Object[]{this, loginAction});
        } else {
            this.i.a(A().getActivity(), loginAction);
        }
    }

    @Override // com.taobao.mytaobao.base.d
    public void a(String behavior, boolean z) {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, behavior, new Boolean(z)});
            return;
        }
        q.c(behavior, "behavior");
        MTPtrRecyclerView e2 = e();
        if (e2 == null || (layoutManager = e2.getLayoutManager()) == null) {
            return;
        }
        f fVar = new f(behavior, z, e2, layoutManager);
        if (e2.isAttachedToWindow()) {
            fVar.run();
        } else {
            e2.post(fVar);
        }
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        FragmentActivity activity = A().getActivity();
        if (!(activity instanceof TBMainActivity)) {
            activity = null;
        }
        TBMainActivity tBMainActivity = (TBMainActivity) activity;
        if (tBMainActivity == null) {
            return;
        }
        tBMainActivity.registerOnKeyDownListener(new e());
    }

    @Override // tb.mts
    public void changeToBasement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803d8ea1", new Object[]{this});
        } else {
            this.i.f();
        }
    }

    @Override // tb.mts
    public void changeToMainPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88d65a", new Object[]{this});
        } else {
            this.i.g();
        }
    }

    @Override // tb.mwp
    public DXWidgetNode findWidgetNodeByUserId(String str) {
        MTPtrRecyclerView e2;
        RecyclerView.LayoutManager layoutManager;
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c707e44c", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (e2 = e()) != null && (layoutManager = e2.getLayoutManager()) != null) {
            int itemCount = layoutManager.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View findViewByPosition = layoutManager.findViewByPosition(i);
                if (!(findViewByPosition instanceof ViewGroup)) {
                    findViewByPosition = null;
                }
                ViewGroup viewGroup = (ViewGroup) findViewByPosition;
                View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                if (!(childAt instanceof DXRootView)) {
                    childAt = null;
                }
                DXRootView dXRootView = (DXRootView) childAt;
                if (dXRootView != null && (flattenWidgetNode = dXRootView.getFlattenWidgetNode()) != null && (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str)) != null) {
                    return queryWidgetNodeByUserId;
                }
            }
        }
        return null;
    }

    @Override // tb.mwp
    public Pair<Rect, Boolean> findBasementLocalInWindow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5e426f69", new Object[]{this});
        }
        MTBBasementContainerView b2 = this.c.b();
        if (b2 == null) {
            return null;
        }
        Rect rect = new Rect();
        if (b2.getGlobalVisibleRect(rect) && b2.isShown()) {
            z = true;
        }
        return new Pair<>(rect, Boolean.valueOf(z));
    }

    @Override // tb.mwp
    public JSONObject findWeexNodeLocal(String nodeId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, nodeId});
        }
        q.c(nodeId, "nodeId");
        return this.c.b(nodeId);
    }

    @Override // tb.mwp
    public void a(String eventName, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, eventName, jSONObject});
            return;
        }
        q.c(eventName, "eventName");
        this.c.a(eventName, jSONObject);
    }

    @Override // tb.mwp
    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.f18439a;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        for (xol xolVar : this.d.a()) {
            xolVar.b(true);
        }
        this.d.notifyDataSetChanged();
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        List<xol> a2 = this.d.a();
        xol xolVar = (xol) p.a((List<? extends Object>) a2, 0);
        if (xolVar != null) {
            xolVar.b(true);
        }
        xol xolVar2 = (xol) p.a((List<? extends Object>) a2, 1);
        if (xolVar2 != null) {
            xolVar2.b(true);
        }
        this.d.notifyDataSetChanged();
    }
}
