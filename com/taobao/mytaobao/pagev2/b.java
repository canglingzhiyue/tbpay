package com.taobao.mytaobao.pagev2;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.p;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.l;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.basement.weex.f;
import com.taobao.mytaobao.basement.weex.g;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.jvb;
import tb.kge;
import tb.ljl;
import tb.mtr;
import tb.mts;
import tb.mtt;
import tb.mtw;
import tb.mtx;
import tb.mua;
import tb.mxf;
import tb.mxo;
import tb.nwv;
import tb.xoh;
import tb.xok;
import tb.xol;
import tb.xon;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001#\b\u0007\u0018\u00002\u00020\u0001:\u0001LB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\u000e\u00103\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u00104\u001a\u00020,J\u0018\u00105\u001a\u00020,2\u0006\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u0013H\u0002J\u000e\u00108\u001a\u00020,2\u0006\u00106\u001a\u000202J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u000202J.\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020\u0013H\u0016J\u0006\u0010C\u001a\u00020,J\u0006\u0010D\u001a\u00020,J\u0006\u0010E\u001a\u00020,J\u0006\u0010F\u001a\u00020,J\b\u0010G\u001a\u00020,H\u0002J\u0006\u0010H\u001a\u00020,J\u0018\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u0002022\b\u0010K\u001a\u0004\u0018\u00010:R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u001e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00060(R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/taobao/mytaobao/pagev2/MtbWeexManager;", "Lcom/taobao/mytaobao/base/IBasementManager;", DIConstants.EVENT_NAME_LIFE_CYCLE, "Landroid/arch/lifecycle/Lifecycle;", "mtbBizProxyV2", "Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "(Landroid/arch/lifecycle/Lifecycle;Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;)V", "basementCeilingHelper", "Lcom/taobao/mytaobao/basement/BasementCeilingHelper;", "<set-?>", "Lcom/taobao/mytaobao/basement/MTBBasementContainerView;", "basementContainerView", "getBasementContainerView", "()Lcom/taobao/mytaobao/basement/MTBBasementContainerView;", "basementTabLocalHelper", "Lcom/taobao/mytaobao/basement/BasementTabLocalHelper;", "enterBasementTask", "Ljava/lang/Runnable;", "isDestroyed", "", "mBasementExposureManager", "Lcom/taobao/mytaobao/basement/BasementExposureManager;", "mContainerChangeListener", "Lcom/taobao/mytaobao/basement/listener/IContainerChangeListener;", "getMContainerChangeListener", "()Lcom/taobao/mytaobao/basement/listener/IContainerChangeListener;", "setMContainerChangeListener", "(Lcom/taobao/mytaobao/basement/listener/IContainerChangeListener;)V", "mIsInBasement", "mIsRenderSuccess", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "rv", "getRv", "()Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "scrollListener", "com/taobao/mytaobao/pagev2/MtbWeexManager$scrollListener$1", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager$scrollListener$1;", "scrollStateChangeSender", "Lcom/taobao/mytaobao/basement/weex/ScrollStateChangeSender;", "weexBridgeAbility", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager$BasementWeexBridgeAbility;", "weexNestedScrollHelper", "Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper;", "attachWeexView", "", "containerView", "dstWidth", "", "dstHeight", "weexUrl", "", "bindRecyclerView", "considerStealTicket", "enterBasement", "behavior", "isDirty", "exitBasement", "findWeexNodeLocal", "Lcom/alibaba/fastjson/JSONObject;", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "generateWeexViewByUrl", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "data", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "isInBasement", MessageID.onDestroy, "onDestroyView", "onResume", "renderSuccess", "resetData", "resizeBasement", "sendEvent", "eventName", "eventData", "BasementWeexBridgeAbility", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class b implements com.taobao.mytaobao.base.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.scroll.a f18446a;
    private MTPtrRecyclerView b;
    private MTBBasementContainerView c;
    private boolean d;
    private final a e;
    private final com.taobao.mytaobao.basement.weex.e f;
    private com.taobao.mytaobao.basement.e g;
    private mts h;
    private boolean i;
    private Runnable j;
    private boolean k;
    private com.taobao.mytaobao.basement.c l;
    private final l m;
    private final e n;
    private final Lifecycle o;
    private final com.taobao.mytaobao.pagev2.a p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.a(b.this, BasementConstants.BEHAVIOR_RENDER_SUCCESS_BACKGROUND, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTBBasementContainerView b;

        public d(MTBBasementContainerView mTBBasementContainerView) {
            this.b = mTBBasementContainerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b.d(b.this) != null) {
            } else {
                b bVar = b.this;
                MTPtrRecyclerView a2 = bVar.a();
                if (a2 == null) {
                    q.a();
                }
                b.a(bVar, new com.taobao.mytaobao.basement.e(a2, this.b));
            }
        }
    }

    static {
        kge.a(-1897761869);
        kge.a(1127814513);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "success", "", "errorMsg", "", "wxInstance", "Lcom/taobao/android/weex/WeexInstance;", "onResult"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.pagev2.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0738b<T> implements mtr<WeexInstance> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTBBasementContainerView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ BasementWeexView f;
        public final /* synthetic */ Ref.ObjectRef g;

        public C0738b(MTBBasementContainerView mTBBasementContainerView, int i, int i2, String str, BasementWeexView basementWeexView, Ref.ObjectRef objectRef) {
            this.b = mTBBasementContainerView;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = basementWeexView;
            this.g = objectRef;
        }

        @Override // tb.mtr
        public /* synthetic */ void onResult(boolean z, String str, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, weexInstance});
            } else {
                a(z, str, weexInstance);
            }
        }

        public final void a(boolean z, String str, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            boolean z2 = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0c108d4", new Object[]{this, new Boolean(z), str, weexInstance});
                return;
            }
            Object obj = null;
            jvb jvbVar = null;
            if (weexInstance == null) {
                nwv.b("getWxInstanceFailed");
            } else {
                jvbVar = ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
                if (jvbVar != null) {
                    obj = jvbVar.getTag("mtbRenderSuccess");
                }
                z2 = q.a((Object) "true", obj);
                nwv.b("getWxInstanceSuccess");
            }
            p pVar = jvbVar;
            TLog.loge("mtbMainLink", "预取weexInstance回调，errorMsg=" + str);
            a aVar = new a();
            this.f.addRenderListener(new com.taobao.mytaobao.basement.weex.d());
            this.f.addRenderListener(aVar);
            this.f.setUp(b.c(b.this), (String) this.g.element, this.c, this.d, pVar, b.a(b.this).a().b(), b.a(b.this).a().c());
            if (!z2) {
                return;
            }
            TLog.loge("mtbMainLink", "补发renderSuccess");
            b.this.g();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/taobao/mytaobao/pagev2/MtbWeexManager$attachWeexView$1$renderListener$1", "Lcom/taobao/mytaobao/basement/listener/IMUSRenderListenerAdapter;", "onRenderFailed", "", "instance", "Lcom/taobao/android/weex_framework/MUSInstance;", "type", "", "errorMsg", "", "isFatal", "", ljl.RENDER_SUCCESS_TIME, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.taobao.mytaobao.pagev2.b$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends mtt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
            /* renamed from: com.taobao.mytaobao.pagev2.b$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class View$OnClickListenerC0739a implements View.OnClickListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public View$OnClickListenerC0739a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    com.taobao.mytaobao.scroll.a b = b.b(b.this);
                    if (b != null) {
                        b.a();
                    }
                    b.a(b.this, (com.taobao.mytaobao.scroll.a) null);
                    if (C0738b.this.b.getWeexView() == null) {
                        return;
                    }
                    BasementWeexView weexView = C0738b.this.b.getWeexView();
                    if (weexView != null) {
                        weexView.dispose();
                    }
                    b.a(b.this, C0738b.this.b, C0738b.this.c, C0738b.this.d, C0738b.this.e);
                }
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 66974264) {
                    super.onRenderSuccess((p) objArr[0]);
                    return null;
                } else if (hashCode != 1112741915) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onRenderFailed((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                    return null;
                }
            }

            public a() {
            }

            @Override // tb.mtt, com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                super.onRenderFailed(pVar, i, str, z);
                nwv.a("dsw", "onRenderFailed");
                com.taobao.mytaobao.basement.monitor.b a2 = com.taobao.mytaobao.basement.monitor.b.a();
                String valueOf = String.valueOf(i);
                if (str == null) {
                    str = "errMsg";
                }
                a2.a("TaoFriend_HomePage0", valueOf, str);
                C0738b.this.b.showErrorPage(new View$OnClickListenerC0739a());
                mtw c = mtx.c();
                q.a((Object) c, "TaoLiveStartLinkMonitor.getInstance()");
                if (c.a()) {
                    return;
                }
                mtx.c().a("WebLoad", mtx.b());
                mtx.c().b(3);
            }

            @Override // tb.mtt, com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    return;
                }
                super.onRenderSuccess(pVar);
                nwv.a("dsw", ljl.RENDER_SUCCESS_TIME);
                com.taobao.mytaobao.basement.monitor.b.a().b("TaoFriend_HomePage0");
                b bVar = b.this;
                MTPtrRecyclerView a2 = b.this.a();
                if (a2 == null) {
                    q.a();
                }
                b.a(bVar, new com.taobao.mytaobao.scroll.a(a2, C0738b.this.f));
            }
        }
    }

    public b(Lifecycle lifecycle, com.taobao.mytaobao.pagev2.a mtbBizProxyV2) {
        q.c(lifecycle, "lifecycle");
        q.c(mtbBizProxyV2, "mtbBizProxyV2");
        this.o = lifecycle;
        this.p = mtbBizProxyV2;
        this.e = new a();
        this.f = new com.taobao.mytaobao.basement.weex.e(this);
        this.m = new l();
        this.n = new e();
        MtbBasementWeexApiPlugin.setBasementWeexBridgeAbility(this.e);
    }

    public static final /* synthetic */ com.taobao.mytaobao.pagev2.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.pagev2.a) ipChange.ipc$dispatch("a430fc6f", new Object[]{bVar}) : bVar.p;
    }

    public static final /* synthetic */ void a(b bVar, MTBBasementContainerView mTBBasementContainerView, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4704c51a", new Object[]{bVar, mTBBasementContainerView, new Integer(i), new Integer(i2), str});
        } else {
            bVar.a(mTBBasementContainerView, i, i2, str);
        }
    }

    public static final /* synthetic */ void a(b bVar, com.taobao.mytaobao.basement.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad53d07f", new Object[]{bVar, eVar});
        } else {
            bVar.g = eVar;
        }
    }

    public static final /* synthetic */ void a(b bVar, com.taobao.mytaobao.scroll.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a66da5", new Object[]{bVar, aVar});
        } else {
            bVar.f18446a = aVar;
        }
    }

    public static final /* synthetic */ void a(b bVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285bc173", new Object[]{bVar, str, new Boolean(z)});
        } else {
            bVar.a(str, z);
        }
    }

    public static final /* synthetic */ com.taobao.mytaobao.scroll.a b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.scroll.a) ipChange.ipc$dispatch("5a41b8c", new Object[]{bVar}) : bVar.f18446a;
    }

    public static final /* synthetic */ Lifecycle c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lifecycle) ipChange.ipc$dispatch("d5242960", new Object[]{bVar}) : bVar.o;
    }

    public static final /* synthetic */ com.taobao.mytaobao.basement.e d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.e) ipChange.ipc$dispatch("e7950024", new Object[]{bVar}) : bVar.g;
    }

    public static final /* synthetic */ com.taobao.mytaobao.basement.weex.e e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.weex.e) ipChange.ipc$dispatch("b3c76d97", new Object[]{bVar}) : bVar.f;
    }

    public static final /* synthetic */ boolean f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99f00640", new Object[]{bVar})).booleanValue() : bVar.d;
    }

    public final MTPtrRecyclerView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("d2ae823a", new Object[]{this}) : this.b;
    }

    public final MTBBasementContainerView b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTBBasementContainerView) ipChange.ipc$dispatch("fd7de5a0", new Object[]{this}) : this.c;
    }

    public final void a(mts mtsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52d17ac", new Object[]{this, mtsVar});
        } else {
            this.h = mtsVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/taobao/mytaobao/pagev2/MtbWeexManager$scrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class e extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
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

        public e() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            b.e(b.this).a(i);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            q.c(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean z2 = i2 < 0;
            boolean z3 = !recyclerView.canScrollVertically(1);
            MTPtrRecyclerView a2 = b.this.a();
            if (a2 == null) {
                q.a();
            }
            boolean isCloseToTheBottom = a2.isCloseToTheBottom();
            if (z3 && !b.f(b.this) && !z2) {
                MTPtrRecyclerView a3 = b.this.a();
                if (a3 == null) {
                    q.a();
                }
                if (a3.calcVerticalScrollOffset() <= 0) {
                    z = true;
                }
                b.a(b.this, "scroll", z);
            } else if (!z2 || isCloseToTheBottom || !b.f(b.this)) {
            } else {
                b.this.a("scroll");
            }
        }
    }

    public final void a(MTPtrRecyclerView rv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7e4274", new Object[]{this, rv});
            return;
        }
        q.c(rv, "rv");
        this.b = rv;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.p.a().d();
        }
    }

    public final void d() {
        MTPtrRecyclerView e2;
        int g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView == null || (e2 = this.p.e()) == null) {
            return;
        }
        int height = e2.getHeight();
        ViewGroup.LayoutParams layoutParams = mTBBasementContainerView.getLayoutParams();
        if (layoutParams == null || layoutParams.height == (g = height - mxo.g())) {
            return;
        }
        layoutParams.height = g;
        mTBBasementContainerView.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.mytaobao.base.e
    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.d;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.i = true;
        h();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
        }
        this.j = null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, java.lang.String] */
    private final void a(MTBBasementContainerView mTBBasementContainerView, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07fd789", new Object[]{this, mTBBasementContainerView, new Integer(i), new Integer(i2), str});
            return;
        }
        Context context = mTBBasementContainerView.getContext();
        q.a((Object) context, "containerView.context");
        BasementWeexView basementWeexView = new BasementWeexView(context, null, 0, 6, null);
        mTBBasementContainerView.installWeex(basementWeexView);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? a2 = g.a(false, str);
        q.a((Object) a2, "WeexUtils.processUrl(false, weexUrl)");
        objectRef.element = a2;
        ?? uri = Uri.parse((String) objectRef.element).buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).appendQueryParameter("wx_opaque", "0").build().toString();
        q.a((Object) uri, "Uri.parse(newWeexUrl).bu…      .build().toString()");
        objectRef.element = uri;
        f a3 = this.p.a();
        Context context2 = mTBBasementContainerView.getContext();
        if (context2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        a3.a((Activity) context2, new C0738b(mTBBasementContainerView, i, i2, str, basementWeexView, objectRef));
    }

    public final View a(Context ctx, int i, int i2, String weexUrl, xol data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a7419b87", new Object[]{this, ctx, new Integer(i), new Integer(i2), weexUrl, data});
        }
        q.c(ctx, "ctx");
        q.c(weexUrl, "weexUrl");
        q.c(data, "data");
        MTBBasementContainerView mTBBasementContainerView = new MTBBasementContainerView(ctx, null, 0, 6, null);
        this.c = mTBBasementContainerView;
        mTBBasementContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        a(mTBBasementContainerView, i, i2, weexUrl);
        if (!this.k) {
            mTBBasementContainerView.delayShowPlaceHolder(data);
        }
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null) {
            mTPtrRecyclerView.removeOnScrollListener(this.n);
        }
        MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
        if (mTPtrRecyclerView2 != null) {
            mTPtrRecyclerView2.addOnScrollListener(this.n);
        }
        com.taobao.mytaobao.basement.c cVar = this.l;
        if (cVar != null) {
            cVar.b();
        }
        MTPtrRecyclerView mTPtrRecyclerView3 = this.b;
        if (mTPtrRecyclerView3 == null) {
            q.a();
        }
        this.l = new com.taobao.mytaobao.basement.c(mTPtrRecyclerView3);
        com.taobao.mytaobao.basement.c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a();
        }
        return mTBBasementContainerView;
    }

    public final void a(String behavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, behavior});
            return;
        }
        q.c(behavior, "behavior");
        if (!this.d || !this.k || this.c == null) {
            return;
        }
        com.taobao.mytaobao.scroll.a aVar = this.f18446a;
        if (aVar != null) {
            aVar.a(false);
        }
        if (q.a((Object) behavior, (Object) BasementConstants.BEHAVIOR_RETURN_TOP_TAP) || q.a((Object) behavior, (Object) BasementConstants.BEHAVIOR_MTB_TAB_TAP) || q.a((Object) behavior, (Object) BasementConstants.BEHAVIOR_HEADER_TAP) || q.a((Object) behavior, (Object) BasementConstants.BEHAVIOR_MTB_TAB_DOUBLE_TAP) || q.a((Object) behavior, (Object) BasementConstants.BEHAVIOR_BACK_PRESS)) {
            String str = com.taobao.mytaobao.basement.Bridge.a.i;
            q.a((Object) str, "BasementEventSender.EVEN…IFY_QUICK_BACK_FIRST_PAGE");
            a(str, (JSONObject) null);
        }
        this.d = false;
        com.taobao.mytaobao.basement.e eVar = this.g;
        if (eVar != null) {
            eVar.a(false);
        }
        com.taobao.mytaobao.basement.Bridge.a.a(this.c, false, false);
        if (this.h == null) {
            return;
        }
        com.taobao.mytaobao.basement.monitor.c.a().b(behavior, this.p);
        mts mtsVar = this.h;
        if (mtsVar == null) {
            return;
        }
        mtsVar.changeToMainPage();
    }

    private final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (this.d || !this.k || this.c == null) {
        } else {
            this.d = true;
            com.taobao.mytaobao.basement.e eVar = this.g;
            if (eVar != null) {
                eVar.a(true);
            }
            if (this.h != null) {
                com.taobao.mytaobao.basement.monitor.c.a().a(str, this.p);
                mts mtsVar = this.h;
                if (mtsVar != null) {
                    mtsVar.changeToBasement();
                }
            }
            com.taobao.mytaobao.basement.Bridge.a.a(this.c, true, z);
            mua.a(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19997, "enterBasementCheck", true, str, null);
        }
    }

    public final void a(String eventName, JSONObject jSONObject) {
        BasementWeexView weexView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, eventName, jSONObject});
            return;
        }
        q.c(eventName, "eventName");
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView == null || (weexView = mTBBasementContainerView.getWeexView()) == null) {
            return;
        }
        com.taobao.mytaobao.basement.Bridge.a.a(weexView, eventName, jSONObject);
    }

    public final void g() {
        xok a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView == null) {
            return;
        }
        mtx.b("收到前端renderSuccess");
        JSONObject jSONObject = new JSONObject();
        xon h = com.taobao.mytaobao.pagev2.dataservice.a.h();
        jSONObject.put("isDowngradePrestrain", (Object) Integer.valueOf((h == null || (a2 = xoh.Companion.a()) == null || !a2.a(h)) ? 0 : 1));
        mtx.c().a("WebLoad", jSONObject);
        this.k = true;
        mTBBasementContainerView.hidePlaceHolder();
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView == null) {
            q.a();
        }
        if (mTPtrRecyclerView.canScrollVertically(1) || this.d) {
            z = false;
        }
        MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
        if (mTPtrRecyclerView2 == null) {
            q.a();
        }
        int calcVerticalScrollOffset = mTPtrRecyclerView2.calcVerticalScrollOffset();
        if (z && calcVerticalScrollOffset <= 0) {
            z = false;
        }
        if (z) {
            if (this.p.A().isResumed()) {
                a(BasementConstants.BEHAVIOR_RENDER_SUCCESS_FOREGROUND, false);
            } else {
                this.j = new c();
            }
        }
        mTBBasementContainerView.post(new d(mTBBasementContainerView));
        mxf.b("basementRender");
        com.taobao.mytaobao.basement.monitor.b.a().b();
        mtx.b("renderSuccess");
    }

    public final JSONObject b(String nodeId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, nodeId});
        }
        q.c(nodeId, "nodeId");
        return this.m.a(nodeId);
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TLog.loge(BasementConstants.TAG, "real resetData");
        this.k = false;
        this.j = null;
        this.d = false;
        com.taobao.mytaobao.basement.e eVar = this.g;
        if (eVar != null) {
            eVar.a();
        }
        this.g = null;
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null) {
            mTBBasementContainerView.onDestroy();
        }
        this.c = null;
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null) {
            mTPtrRecyclerView.removeOnScrollListener(this.n);
        }
        TLog.loge(BasementConstants.WEEX_TAG, "resetData scrollEnable=true");
        MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
        if (mTPtrRecyclerView2 != null) {
            mTPtrRecyclerView2.setScrollEnable(true);
        }
        xok a2 = xoh.Companion.a();
        if (a2 != null) {
            a2.a();
        }
        com.taobao.mytaobao.basement.c cVar = this.l;
        if (cVar != null) {
            cVar.b();
        }
        com.taobao.mytaobao.scroll.a aVar = this.f18446a;
        if (aVar != null) {
            aVar.a();
        }
        this.f18446a = null;
        this.f.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/pagev2/MtbWeexManager$BasementWeexBridgeAbility;", "Lcom/taobao/mytaobao/basement/Bridge/IBasementWeexBridgeAbility;", "(Lcom/taobao/mytaobao/pagev2/MtbWeexManager;)V", "changeReturnTopVisibility", "", "isHidden", "", "getPreloadData", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/android/weex_framework/bridge/MUSCallback;", "nav", "url", "", "spm", "renderSuccess", "requestCeilBasement", "verifyFirstCardExpose", "params", "verifyFirstCardExposeV2", "instance", "Lcom/taobao/android/weex_framework/MUSInstance;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public final class a implements com.taobao.mytaobao.basement.Bridge.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1497364192);
            kge.a(-942815056);
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(JSONObject params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, params});
            } else {
                q.c(params, "params");
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(p instance, JSONObject params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85077e6b", new Object[]{this, instance, params});
                return;
            }
            q.c(instance, "instance");
            q.c(params, "params");
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "success", "", "errorMsg", "", "ext", "Lcom/alibaba/fastjson/JSONObject;", "onResult"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.taobao.mytaobao.pagev2.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C0737a<T> implements mtr<JSONObject> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.taobao.android.weex_framework.bridge.b f18448a;

            public C0737a(com.taobao.android.weex_framework.bridge.b bVar) {
                this.f18448a = bVar;
            }

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
                } else {
                    a(z, str, jSONObject);
                }
            }

            public final void a(boolean z, String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                    return;
                }
                com.taobao.android.weex_framework.bridge.b bVar = this.f18448a;
                if (bVar == null) {
                    return;
                }
                bVar.a(jSONObject);
            }
        }

        public a() {
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                b.this.g();
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public JSONObject a(com.taobao.android.weex_framework.bridge.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("f252df9f", new Object[]{this, bVar});
            }
            xok a2 = xoh.Companion.a();
            if (a2 == null) {
                return null;
            }
            return a2.a(new C0737a(bVar));
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                b.a(b.this).y();
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(String url, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, url, str});
                return;
            }
            q.c(url, "url");
            if (!StringUtils.isEmpty(str)) {
                UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
                uTAnalytics.getDefaultTracker().updateNextPageProperties(ai.b(j.a("spm-url", str)));
            }
            Nav.from(Globals.getApplication()).toUri(url);
            com.taobao.mytaobao.base.c.x = url;
        }
    }
}
