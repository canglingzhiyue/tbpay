package com.taobao.themis.pub.titlebar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taobao.R;
import com.taobao.themis.container.title.titlebar.TMSBaseTitleBar;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub.titlebar.action.PubFavorAction;
import com.taobao.themis.pub.titlebar.action.a;
import com.taobao.themis.pub.titlebar.action.b;
import com.taobao.themis.pub.titlebar.action.j;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.PubIconChangeGuide;
import com.taobao.themis.pub_kit.guide.h;
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qpv;
import tb.qqc;
import tb.qrc;
import tb.qrd;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0002\f\u0019\u0018\u0000 I2\u00020\u0001:\u0001IB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u001c\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001c\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010$2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010\u001f\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0002J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u00020\u0017H\u0003J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0003J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0003J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0003J\u0018\u00107\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u00020\u0017H\u0002J\u0018\u00108\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u00020\u0017H\u0002J\u001a\u00109\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010:\u001a\u00020\u001cH\u0016J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010=\u001a\u00020\u001cH\u0016J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020@H\u0016J(\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010$J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u0010H\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006J"}, d2 = {"Lcom/taobao/themis/pub/titlebar/PubTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mAddIconStatusEventListener", "Landroid/taobao/windvane/service/WVEventListener;", "mHomePagePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "mPageCloseInterceptor", "com/taobao/themis/pub/titlebar/PubTitleBar$mPageCloseInterceptor$1", "Lcom/taobao/themis/pub/titlebar/PubTitleBar$mPageCloseInterceptor$1;", "mPubBackAction", "Lcom/taobao/themis/pub/titlebar/action/PubBackAction;", "mPubNameAction", "Lcom/taobao/themis/pub/titlebar/action/PubAppNameAction;", "mUserActiveIconChangeGuideDisplay", "", "mUserEnterTime", "", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "pubTitleBarPosition", "com/taobao/themis/pub/titlebar/PubTitleBar$pubTitleBarPosition$1", "Lcom/taobao/themis/pub/titlebar/PubTitleBar$pubTitleBarPosition$1;", "addRightAction", "", "action", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "addRightButton", "icon", "Landroid/graphics/drawable/Drawable;", DataReceiveMonitor.CB_LISTENER, "Landroid/view/View$OnClickListener;", "", "lightIcon", "darkIcon", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "configBackground", "getActionLocationAndSize", "Lcom/alibaba/fastjson/JSONObject;", "actionView", "Landroid/view/View;", "hideTitleBar", "type", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "initAddIconAction", "pubUserGuideModule", "initAppNameAction", "initBackAction", "initFavorAction", "initPopWindows", "initRecommendGuide", "initTitleBarActions", MessageID.onDestroy, "registerBackGuide", "registerTitleBarPositionListener", "resetBackground", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "showIconChangeStrongGuide", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$ShowIconChangeGuideResult;", "guideType", "", "strongGuidePopTitle", "strongGuidePopDesc", "showOperateGuide", "userGuideModule", "Companion", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String PUB_GUIDE_RECOMMEND_CUSTOM_REPLACE = "recommendCustomReplace";
    public static final String PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE = "userActiveCustomReplace";

    /* renamed from: a  reason: collision with root package name */
    private final i f22727a;
    private final com.taobao.themis.pub.titlebar.action.c b;
    private final com.taobao.themis.pub.titlebar.action.b c;
    private PubUserGuideModule d;
    private boolean e;
    private final long f;
    private JSONArray g;
    private final h h;
    private aek i;
    private final AtomicBoolean j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$attachPage$1", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public b(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (PubTitleBar.access$getHasInit$p(PubTitleBar.this).get()) {
            } else {
                PubTitleBar.access$getHasInit$p(PubTitleBar.this).set(true);
                PubTitleBar.access$setMHomePagePopDataList$p(PubTitleBar.this, qrc.a(this.b.b()));
                PubTitleBar.access$initTitleBarActions(PubTitleBar.this, this.b, pubUserGuideModule);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "hasClickAddIcon"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public c(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.pub.titlebar.action.a.b
        public final void a() {
            PubAddIconGuide pubAddIconGuide;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            PubTitleBar.access$setMUserActiveIconChangeGuideDisplay$p(PubTitleBar.this, true);
            PubContainerContext c = qrc.c(this.b.b());
            if (c != null && (pubAddIconGuide = c.getPubAddIconGuide()) != null) {
                pubAddIconGuide.b();
            }
            j jVar = (j) PubTitleBar.this.getAction(j.class);
            if (jVar == null) {
                return;
            }
            jVar.m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (n.bz()) {
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).b(com.taobao.themis.utils.k.a(PubTitleBar.access$getMContext$p(PubTitleBar.this), 180));
            } else {
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).a();
                PubTitleBar.access$getMTitleView$p(PubTitleBar.this).getContentView().measure(-2, -2);
                int a2 = com.taobao.themis.utils.k.a(PubTitleBar.access$getMContext$p(PubTitleBar.this));
                View findViewById = PubTitleBar.access$getMTitleView$p(PubTitleBar.this).getContentView().findViewById(R.id.right_panel);
                q.b(findViewById, "mTitleView.getContentVie…ntainer.R.id.right_panel)");
                int measuredWidth = a2 - findViewById.getMeasuredWidth();
                View a3 = PubTitleBar.access$getMPubBackAction$p(PubTitleBar.this).a(PubTitleBar.access$getMContext$p(PubTitleBar.this));
                if (a3 != null) {
                    i = a3.getMeasuredWidth();
                }
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).b((measuredWidth - i) - com.taobao.themis.utils.k.a(PubTitleBar.access$getMContext$p(PubTitleBar.this), 24.0f));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public e(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object systemService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                systemService = PubTitleBar.access$getMContext$p(PubTitleBar.this).getSystemService("input_method");
            } catch (Throwable th) {
                TMSLogger.b("PubTitleBar", "backClick cause error", th);
            }
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            q.b(view, "view");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.b.b().a(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$mAddIconStatusEventListener$1", "Landroid/taobao/windvane/service/WVEventListener;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "Landroid/taobao/windvane/service/WVEventResult;", "id", "", "eventContext", "Landroid/taobao/windvane/service/WVEventContext;", "params", "", "", "(ILandroid/taobao/windvane/service/WVEventContext;[Ljava/lang/Object;)Landroid/taobao/windvane/service/WVEventResult;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... params) {
            String string;
            JSONObject jSONObject;
            View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, params});
            }
            q.d(params, "params");
            try {
                ITMSPage access$getMPage$p = PubTitleBar.access$getMPage$p(PubTitleBar.this);
                if (access$getMPage$p == null) {
                    return null;
                }
                if (i == 3005) {
                    Object obj = params[0];
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    JSONObject parseObject = JSON.parseObject((String) obj);
                    if (parseObject == null || (string = parseObject.getString("event")) == null || (jSONObject = parseObject.getJSONObject("param")) == null) {
                        return null;
                    }
                    int hashCode = string.hashCode();
                    if (hashCode != -1792089436) {
                        if (hashCode == 401852682 && string.equals("pub_user_cancel_add_icon")) {
                            com.taobao.themis.pub.titlebar.action.a aVar = (com.taobao.themis.pub.titlebar.action.a) PubTitleBar.this.getAction(com.taobao.themis.pub.titlebar.action.a.class);
                            if (aVar != null && (a2 = aVar.a(PubTitleBar.access$getMContext$p(PubTitleBar.this))) != null) {
                                new com.taobao.themis.pub_kit.guide.f(PubTitleBar.access$getMContext$p(PubTitleBar.this)).a(a2);
                            }
                            return null;
                        }
                    } else if (string.equals("pub_broadcast_update_add_icon_status") && q.a((Object) jSONObject.getString("code"), (Object) "1")) {
                        com.taobao.themis.pub.titlebar.action.a aVar2 = (com.taobao.themis.pub.titlebar.action.a) PubTitleBar.this.getAction(com.taobao.themis.pub.titlebar.action.a.class);
                        if (aVar2 != null) {
                            PubTitleBar.this.removeAction(aVar2);
                        }
                        PubContainerContext c = qrc.c(access$getMPage$p.b());
                        if (c != null) {
                            c.setHasAddToIcon(true);
                        }
                        if (q.a((Object) jSONObject.getString("popType"), (Object) PubTitleBar.PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE)) {
                            access$getMPage$p.a("userActiveAddIcon", (JSON) null);
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                TMSLogger.b("PubTitleBar", th.getMessage(), th);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onInvisible"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.themis.pub.titlebar.action.b.a
        public final void a() {
            PubFavorAction pubFavorAction;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (n.INSTANCE.X() || (pubFavorAction = (PubFavorAction) PubTitleBar.access$getMTitleView$p(PubTitleBar.this).getAction(PubFavorAction.class)) == null) {
            } else {
                com.taobao.themis.container.title.titleView.a access$getMTitleView$p = PubTitleBar.access$getMTitleView$p(PubTitleBar.this);
                if (pubFavorAction == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.container.ui.titlebar.Action");
                }
                PubFavorAction pubFavorAction2 = pubFavorAction;
                access$getMTitleView$p.removeAction(pubFavorAction2);
                PubTitleBar.access$getMTitleView$p(PubTitleBar.this).addCenterAction(pubFavorAction2, 2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$pubTitleBarPosition$1", "Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition;", "commit", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class h extends com.taobao.themis.container.title.titlebar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.themis.container.title.titlebar.a
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
                return;
            }
            ITMSPage access$getMPage$p = PubTitleBar.access$getMPage$p(PubTitleBar.this);
            if (access$getMPage$p == null) {
                return;
            }
            access$getMPage$p.a(com.taobao.themis.container.title.titlebar.a.TARGET, com.taobao.themis.container.title.titlebar.a.EVENT_NAME, generatePosition());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$showOperateGuide$1$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class k implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22738a;
        public final /* synthetic */ PubTitleBar b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ com.taobao.themis.pub_kit.guide.e e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public k(View view, PubTitleBar pubTitleBar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, com.taobao.themis.pub_kit.guide.e eVar, String str, String str2) {
            this.f22738a = view;
            this.b = pubTitleBar;
            this.c = objectRef;
            this.d = objectRef2;
            this.e = eVar;
            this.f = str;
            this.g = str2;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.c.element = PubTitleBar.access$getActionLocationAndSize(this.b, this.f22738a);
            this.f22738a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (((JSONObject) this.d.element) == null) {
                return;
            }
            com.taobao.themis.pub_kit.guide.e eVar = this.e;
            String appId = this.f;
            q.b(appId, "appId");
            String str = this.g;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "addIconFrame", (String) ((JSONObject) this.c.element));
            jSONObject2.put((JSONObject) "backHomeFrame", (String) ((JSONObject) this.d.element));
            t tVar = t.INSTANCE;
            eVar.a(appId, str, 1, jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$showOperateGuide$2$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class l implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22739a;
        public final /* synthetic */ PubTitleBar b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ com.taobao.themis.pub_kit.guide.e d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Ref.ObjectRef g;

        public l(View view, PubTitleBar pubTitleBar, Ref.ObjectRef objectRef, com.taobao.themis.pub_kit.guide.e eVar, String str, String str2, Ref.ObjectRef objectRef2) {
            this.f22739a = view;
            this.b = pubTitleBar;
            this.c = objectRef;
            this.d = eVar;
            this.e = str;
            this.f = str2;
            this.g = objectRef2;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.c.element = PubTitleBar.access$getActionLocationAndSize(this.b, this.f22739a);
            this.f22739a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.b.getAction(com.taobao.themis.pub.titlebar.action.a.class) == null) {
                com.taobao.themis.pub_kit.guide.e eVar = this.d;
                String appId = this.e;
                q.b(appId, "appId");
                String str = this.f;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "backHomeFrame", (String) ((JSONObject) this.c.element));
                t tVar = t.INSTANCE;
                eVar.a(appId, str, 0, jSONObject);
            } else if (((JSONObject) this.g.element) == null) {
            } else {
                com.taobao.themis.pub_kit.guide.e eVar2 = this.d;
                String appId2 = this.e;
                q.b(appId2, "appId");
                String str2 = this.f;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "addIconFrame", (String) ((JSONObject) this.g.element));
                jSONObject3.put((JSONObject) "backHomeFrame", (String) ((JSONObject) this.c.element));
                t tVar2 = t.INSTANCE;
                eVar2.a(appId2, str2, 1, jSONObject2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class m implements PubAddIconGuide.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public m(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.pub_kit.guide.PubAddIconGuide.b
        public final void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            j jVar = (j) PubTitleBar.this.getAction(j.class);
            if (jVar != null) {
                jVar.l();
            }
            PubContainerContext pubContainerContext = (PubContainerContext) this.b.b().a(PubContainerContext.class);
            if (pubContainerContext == null) {
                return;
            }
            pubContainerContext.setAddIconGuideIsShowing(false);
        }
    }

    static {
        kge.a(-1845158868);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(PubTitleBar pubTitleBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1548369673) {
            if (hashCode != -1504501726) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDestroy();
            return null;
        }
        return new Boolean(super.hideTitleBar((NavigatorBarAnimType) objArr[0]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubTitleBar(Context context) {
        super(context);
        q.d(context, "context");
        this.b = new com.taobao.themis.pub.titlebar.action.c();
        this.c = new com.taobao.themis.pub.titlebar.action.b(new g());
        this.f = System.currentTimeMillis();
        this.h = new h();
        this.f22727a = new i();
        this.i = new f();
        this.j = new AtomicBoolean(false);
    }

    public static final /* synthetic */ void access$addRightAction(PubTitleBar pubTitleBar, com.taobao.themis.kernel.container.ui.titlebar.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f191412c", new Object[]{pubTitleBar, aVar});
        } else {
            pubTitleBar.a(aVar);
        }
    }

    public static final /* synthetic */ JSONObject access$getActionLocationAndSize(PubTitleBar pubTitleBar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ac9c5051", new Object[]{pubTitleBar, view}) : pubTitleBar.a(view);
    }

    public static final /* synthetic */ AtomicBoolean access$getHasInit$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4574d4ea", new Object[]{pubTitleBar}) : pubTitleBar.j;
    }

    public static final /* synthetic */ Context access$getMContext$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("eaeabd06", new Object[]{pubTitleBar}) : pubTitleBar.getMContext();
    }

    public static final /* synthetic */ ITMSPage access$getMPage$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7e42dd05", new Object[]{pubTitleBar}) : pubTitleBar.getMPage();
    }

    public static final /* synthetic */ com.taobao.themis.pub.titlebar.action.c access$getMPubBackAction$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.pub.titlebar.action.c) ipChange.ipc$dispatch("ac139ff4", new Object[]{pubTitleBar}) : pubTitleBar.b;
    }

    public static final /* synthetic */ com.taobao.themis.pub.titlebar.action.b access$getMPubNameAction$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.pub.titlebar.action.b) ipChange.ipc$dispatch("fc3a6579", new Object[]{pubTitleBar}) : pubTitleBar.c;
    }

    public static final /* synthetic */ com.taobao.themis.container.title.titleView.a access$getMTitleView$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.container.title.titleView.a) ipChange.ipc$dispatch("9f10a119", new Object[]{pubTitleBar}) : pubTitleBar.getMTitleView();
    }

    public static final /* synthetic */ void access$initAddIconAction(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419415da", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.c(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initPopWindows(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a43b9c", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.e(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initRecommendGuide(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fbe8ca", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.b(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initTitleBarActions(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4463ac", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.a(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$registerBackGuide(PubTitleBar pubTitleBar, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d79fe7", new Object[]{pubTitleBar, iTMSPage});
        } else {
            pubTitleBar.d(iTMSPage);
        }
    }

    public static final /* synthetic */ void access$setMAddIconStatusEventListener$p(PubTitleBar pubTitleBar, aek aekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89feac", new Object[]{pubTitleBar, aekVar});
        } else {
            pubTitleBar.i = aekVar;
        }
    }

    public static final /* synthetic */ void access$setMHomePagePopDataList$p(PubTitleBar pubTitleBar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe3aefe", new Object[]{pubTitleBar, jSONArray});
        } else {
            pubTitleBar.g = jSONArray;
        }
    }

    public static final /* synthetic */ void access$setMPage$p(PubTitleBar pubTitleBar, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3d31b", new Object[]{pubTitleBar, iTMSPage});
        } else {
            pubTitleBar.setMPage(iTMSPage);
        }
    }

    public static final /* synthetic */ void access$setMUserActiveIconChangeGuideDisplay$p(PubTitleBar pubTitleBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3232b273", new Object[]{pubTitleBar, new Boolean(z)});
        } else {
            pubTitleBar.e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"com/taobao/themis/pub/titlebar/PubTitleBar$mPageCloseInterceptor$1", "Lcom/taobao/themis/kernel/extension/page/IPageClosePageExtension$PageCloseInterceptor;", "hasIntercept", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPriority", "", "onClose", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "type", "Lcom/taobao/themis/kernel/TMSBackPressedType;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class i implements s.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicBoolean b = new AtomicBoolean(false);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "exit"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements h.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ITMSPage f22736a;

            public a(ITMSPage iTMSPage) {
                this.f22736a = iTMSPage;
            }

            @Override // com.taobao.themis.pub_kit.guide.h.a
            public final void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    this.f22736a.b().a((TMSBackPressedType) null);
                }
            }
        }

        @Override // com.taobao.themis.kernel.extension.page.s.c
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            return 2;
        }

        public i() {
        }

        @Override // com.taobao.themis.kernel.extension.page.s.c
        public boolean a(ITMSPage page, TMSBackPressedType tMSBackPressedType) {
            PubContainerContext c;
            com.taobao.themis.pub_kit.guide.h pubRevisitBackGuide;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("19000c3b", new Object[]{this, page, tMSBackPressedType})).booleanValue();
            }
            q.d(page, "page");
            if (!qqc.a(page) || this.b.get()) {
                return false;
            }
            if (PubTitleBar.showIconChangeStrongGuide$default(PubTitleBar.this, 0, null, null, 7, null).a() == 0) {
                this.b.set(true);
                return true;
            }
            String userId = ((IAccountAdapter) qpt.a(IAccountAdapter.class)).getUserId(page.b());
            if (userId != null && (c = qrc.c(page.b())) != null && (pubRevisitBackGuide = c.getPubRevisitBackGuide()) != null) {
                View contentView = PubTitleBar.this.getContentView();
                q.a(contentView);
                String h = page.b().h();
                q.b(h, "page.getInstance().appId");
                if (pubRevisitBackGuide.a(contentView, h, userId, new a(page))) {
                    this.b.set(true);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public void attachPage(ITMSPage page) {
        Window.Theme theme;
        com.taobao.themis.kernel.f b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        setMPage(page);
        getMTitleView().attachPage(page);
        e(page);
        if (qqc.d(page)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        }
        ITMSPage mPage = getMPage();
        if (((mPage == null || (b2 = mPage.b()) == null) ? null : b2.j()) == TMSSolutionType.UNIAPP) {
            theme = qqc.c(page);
        } else {
            Window c2 = page.c().e().c();
            if (c2 == null || (theme = c2.g()) == null) {
                theme = Window.Theme.DARK;
            }
        }
        if (page.b().j() == TMSSolutionType.UNIAPP) {
            a();
        } else if (!qqc.b(page)) {
            a();
        }
        setStyle(theme);
        PubContainerContext c3 = qrc.c(page.b());
        if (c3 == null) {
            return;
        }
        c3.setUserClickedCount(c3.getUserClickedCount() + 1);
        a(page);
        b(page);
        qrc.a(page.b(), new b(page));
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad477f9f", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        com.taobao.themis.pub.titlebar.action.e eVar = (com.taobao.themis.pub.titlebar.action.e) getMTitleView().getAction(com.taobao.themis.pub.titlebar.action.e.class);
        if (eVar == null) {
            com.taobao.themis.pub.titlebar.action.e eVar2 = new com.taobao.themis.pub.titlebar.action.e();
            getMTitleView().addRightAction(eVar2);
            ITMSPage mPage = getMPage();
            q.a(mPage);
            eVar2.a(mPage);
            eVar2.a(str, onClickListener);
        } else {
            eVar.a(str, onClickListener);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324b505", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        com.taobao.themis.pub.titlebar.action.e eVar = (com.taobao.themis.pub.titlebar.action.e) getMTitleView().getAction(com.taobao.themis.pub.titlebar.action.e.class);
        if (eVar == null) {
            com.taobao.themis.pub.titlebar.action.e eVar2 = new com.taobao.themis.pub.titlebar.action.e();
            getMTitleView().addRightAction(eVar2);
            ITMSPage mPage = getMPage();
            q.a(mPage);
            eVar2.a(mPage);
            eVar2.a(drawable, onClickListener);
        } else {
            eVar.a(drawable, onClickListener);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1873dd15", new Object[]{this, str, str2, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        com.taobao.themis.pub.titlebar.action.e eVar = (com.taobao.themis.pub.titlebar.action.e) getMTitleView().getAction(com.taobao.themis.pub.titlebar.action.e.class);
        if (eVar == null) {
            com.taobao.themis.pub.titlebar.action.e eVar2 = new com.taobao.themis.pub.titlebar.action.e();
            getMTitleView().addRightAction(eVar2);
            ITMSPage mPage = getMPage();
            q.a(mPage);
            eVar2.a(mPage);
            eVar2.a(str, str2, onClickListener);
        } else {
            eVar.a(str, str2, onClickListener);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public void resetBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff85e4", new Object[]{this});
            return;
        }
        ITMSPage mPage = getMPage();
        if (mPage != null) {
            setTranslucent(qqc.b(mPage));
        }
        a();
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setStyle(Window.Theme style) {
        com.taobao.themis.kernel.extension.page.i iVar;
        com.taobao.themis.kernel.f b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f45710", new Object[]{this, style})).booleanValue();
        }
        q.d(style, "style");
        ITMSPage mPage = getMPage();
        if (((mPage == null || (b2 = mPage.b()) == null) ? null : b2.j()) == TMSSolutionType.UNIAPP) {
            int i2 = com.taobao.themis.pub.titlebar.a.$EnumSwitchMapping$0[style.ordinal()];
            if (i2 == 1) {
                style = Window.Theme.DARK;
            } else if (i2 == 2) {
                style = Window.Theme.LIGHT;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                style = Window.Theme.DARK;
            }
        }
        ITMSPage mPage2 = getMPage();
        if (mPage2 != null && (iVar = (com.taobao.themis.kernel.extension.page.i) mPage2.a(com.taobao.themis.kernel.extension.page.i.class)) != null) {
            if (style == Window.Theme.DARK) {
                z = true;
            }
            iVar.b(z);
        }
        getMTitleView().setStyle(style);
        setMStyle(style);
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean hideTitleBar(NavigatorBarAnimType type) {
        com.taobao.themis.kernel.f b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3b5c0f7", new Object[]{this, type})).booleanValue();
        }
        q.d(type, "type");
        if (n.aW()) {
            return false;
        }
        ITMSPage mPage = getMPage();
        if (mPage != null && (b2 = mPage.b()) != null) {
            qpv.b(b2);
        }
        return super.hideTitleBar(type);
    }

    private final void a(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a74e318", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else {
            com.taobao.themis.kernel.utils.a.a(new PubTitleBar$initTitleBarActions$1(this, pubUserGuideModule, iTMSPage));
        }
    }

    private final void b(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        Integer b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddb5259", new Object[]{this, iTMSPage, pubUserGuideModule});
            return;
        }
        JSONObject b3 = qrc.b(iTMSPage.b());
        JSONArray a2 = com.taobao.themis.pub_kit.utils.h.a(b3);
        PubContainerContext c2 = qrc.c(iTMSPage.b());
        if (b3 == null || a2 == null || c2 == null) {
            String a3 = com.taobao.themis.kernel.logger.b.a(iTMSPage);
            String a4 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(iTMSPage));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "errorMsg", "delta or homePagePopData is null");
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, a3, a4, jSONObject);
            return;
        }
        IAccountAdapter iAccountAdapter = (IAccountAdapter) qpt.b(IAccountAdapter.class);
        String userId = iAccountAdapter != null ? iAccountAdapter.getUserId(null) : null;
        String str = userId;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return;
        }
        com.taobao.themis.pub_kit.utils.b bVar = com.taobao.themis.pub_kit.utils.b.INSTANCE;
        Context mContext = getMContext();
        String h2 = iTMSPage.b().h();
        q.b(h2, "page.getInstance().appId");
        Runnable a5 = bVar.a(mContext, h2, userId, b3, a2, pubUserGuideModule, c2, com.taobao.themis.kernel.logger.b.a(iTMSPage));
        Integer c3 = com.taobao.themis.pub_kit.guide.model.a.c(pubUserGuideModule);
        if (c2.getUserClickedCount() - 1 == (c3 != null ? c3.intValue() : -1)) {
            com.taobao.themis.kernel.utils.a.a(a5);
        } else if (!qqc.a(iTMSPage) || (b2 = com.taobao.themis.pub_kit.guide.model.a.b(pubUserGuideModule)) == null) {
        } else {
            com.taobao.themis.kernel.utils.a.a(a5, (b2.intValue() * 1000) - (System.currentTimeMillis() - c2.getUserEnterTime()));
        }
    }

    private final void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, iTMSPage});
            return;
        }
        this.b.a(new e(iTMSPage));
        getMTitleView().addLeftAction(this.b);
    }

    private final void b(ITMSPage iTMSPage) {
        Boolean m2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, iTMSPage});
            return;
        }
        Window c2 = iTMSPage.c().e().c();
        if (c2 != null && (m2 = c2.m()) != null) {
            z = m2.booleanValue();
        }
        if (!z) {
            getMTitleView().addLeftAction(this.c);
            getMTitleView().getContentView().post(new d());
        }
        if (qqc.e(iTMSPage)) {
            return;
        }
        setTitle(qqc.f(iTMSPage), (Drawable) null);
        setTitle((String) null, qqc.h(iTMSPage));
        if (!n.aO() || qqc.g(iTMSPage) == null) {
            return;
        }
        Integer g2 = qqc.g(iTMSPage);
        q.a(g2);
        setTitleColor(g2);
    }

    private final void a(com.taobao.themis.kernel.container.ui.titlebar.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a55479", new Object[]{this, aVar});
            return;
        }
        if (getAction(com.taobao.themis.pub.titlebar.action.e.class) == null) {
            getMTitleView().addRightAction(aVar);
        } else {
            getMTitleView().addRightAction(aVar, 1);
        }
        if (getMTitleView().getContentView().getVisibility() == 0) {
            aVar.e();
        } else {
            aVar.f();
        }
    }

    private final void e(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680ea01c", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else if (com.taobao.android.autosize.l.b(getMContext())) {
            TMSLogger.d("PubTitleBar", "当前设备为平板，不展示AddIcon");
        } else if (Build.VERSION.SDK_INT >= 19 && com.taobao.android.autosize.l.d(getMContext())) {
            TMSLogger.d("PubTitleBar", "当前设备为折叠屏，不展示AddIcon");
        } else {
            PubNavBarModel navbar = pubUserGuideModule.getNavbar();
            if (navbar != null && navbar.getEnableNewNavbar()) {
                PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.b().a(PubContainerContext.class);
                if (pubContainerContext != null) {
                    pubContainerContext.setPubOperateGuide(new com.taobao.themis.pub_kit.guide.e(getMContext(), pubUserGuideModule));
                }
                d(iTMSPage, pubUserGuideModule);
            }
            PubContainerContext pubContainerContext2 = (PubContainerContext) iTMSPage.b().a(PubContainerContext.class);
            if (pubContainerContext2 != null) {
                pubContainerContext2.setPubRevisitBackGuide(new com.taobao.themis.pub_kit.guide.h(getMContext(), pubUserGuideModule));
            }
            PubContainerContext pubContainerContext3 = (PubContainerContext) iTMSPage.b().a(PubContainerContext.class);
            if (pubContainerContext3 != null) {
                pubContainerContext3.setPubIconChangeGuide(new PubIconChangeGuide(getMContext(), pubUserGuideModule, this.g));
            }
            PubContainerContext pubContainerContext4 = (PubContainerContext) iTMSPage.b().a(PubContainerContext.class);
            if (pubContainerContext4 == null) {
                return;
            }
            pubContainerContext4.setPubAddIconGuide(new PubAddIconGuide(getMContext(), pubUserGuideModule, new m(iTMSPage)));
        }
    }

    private final void c(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e141c19a", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else if (com.taobao.android.autosize.l.b(getMContext())) {
            TMSLogger.d("PubTitleBar", "当前设备为平板，不展示AddIcon");
        } else if (Build.VERSION.SDK_INT >= 19 && com.taobao.android.autosize.l.d(getMContext())) {
            TMSLogger.d("PubTitleBar", "当前设备为折叠屏，不展示AddIcon");
        } else {
            PubContainerContext c2 = qrc.c(iTMSPage.b());
            if (c2 != null && c2.getHasAddToIcon()) {
                TMSLogger.d("PubTitleBar", "用户已经添加上Icon区");
                return;
            }
            a(new com.taobao.themis.pub.titlebar.action.a(pubUserGuideModule, new c(iTMSPage)));
            if (!n.v() || new PubIconChangeGuide(getMContext(), pubUserGuideModule, null, 4, null).a("", "").a() != 10000) {
                return;
            }
            TMSLogger.d("PubTitleBar", "临时保障Triver复用，不会调用到");
        }
    }

    private final void a() {
        com.taobao.themis.kernel.entity.a c2;
        com.taobao.themis.kernel.entity.a c3;
        com.taobao.themis.kernel.container.b e2;
        Window c4;
        com.taobao.themis.kernel.f b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ITMSPage mPage = getMPage();
        String str = null;
        Integer num = null;
        str = null;
        if (((mPage == null || (b2 = mPage.b()) == null) ? null : b2.j()) == TMSSolutionType.UNIAPP) {
            ITMSPage mPage2 = getMPage();
            if (mPage2 != null) {
                num = Integer.valueOf(qqc.i(mPage2));
            }
            if (num == null) {
                return;
            }
            setTitleBarBgColor(num.intValue());
            return;
        }
        ITMSPage mPage3 = getMPage();
        Integer e3 = (mPage3 == null || (c3 = mPage3.c()) == null || (e2 = c3.e()) == null || (c4 = e2.c()) == null) ? null : c4.e();
        ITMSPage mPage4 = getMPage();
        if (mPage4 != null && (c2 = mPage4.c()) != null) {
            str = c2.d();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            setTitleBarBgDrawable(str);
        } else if (e3 != null) {
            setTitleBarBgColor(e3.intValue());
        } else {
            setTitleBarBgColor(Color.parseColor("#FFFFFF"));
        }
    }

    public static /* synthetic */ PubIconChangeGuide.b showIconChangeStrongGuide$default(PubTitleBar pubTitleBar, int i2, String str, String str2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubIconChangeGuide.b) ipChange.ipc$dispatch("93257b5f", new Object[]{pubTitleBar, new Integer(i2), str, str2, new Integer(i3), obj});
        }
        if ((i3 & 1) != 0) {
            i2 = -1;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        return pubTitleBar.showIconChangeStrongGuide(i2, str, str2);
    }

    public final PubIconChangeGuide.b showIconChangeStrongGuide(int i2, String str, String str2) {
        PubIconChangeGuide pubIconChangeGuide;
        PubIconChangeGuide pubIconChangeGuide2;
        PubIconChangeGuidePopupModel iconChangeGuidePopup;
        String touchPopupUserStayTime;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (PubIconChangeGuide.b) ipChange.ipc$dispatch("e6d805fc", new Object[]{this, new Integer(i2), str, str2});
        }
        ITMSPage mPage = getMPage();
        if (mPage == null) {
            return new PubIconChangeGuide.b(4, "environment illegality");
        }
        if (this.e) {
            return new PubIconChangeGuide.b(100, "已展示过添加Icon弹窗");
        }
        if (!com.taobao.themis.pub_kit.utils.h.INSTANCE.e(this.g)) {
            return new PubIconChangeGuide.b(104, "首页不允许替换");
        }
        PubUserGuideModule pubUserGuideModule = this.d;
        if (pubUserGuideModule != null && (iconChangeGuidePopup = pubUserGuideModule.getIconChangeGuidePopup()) != null && (touchPopupUserStayTime = iconChangeGuidePopup.getTouchPopupUserStayTime()) != null) {
            i3 = Integer.parseInt(touchPopupUserStayTime);
        }
        if (i3 > System.currentTimeMillis() - this.f) {
            return new PubIconChangeGuide.b(103, "停留时长不满足条件");
        }
        String userId = ((IAccountAdapter) qpt.a(IAccountAdapter.class)).getUserId(mPage.b());
        if (userId == null) {
            return new PubIconChangeGuide.b(4, "未登录不展示");
        }
        if (str2 != null && str != null) {
            PubContainerContext c2 = qrc.c(mPage.b());
            if (c2 != null && (pubIconChangeGuide2 = c2.getPubIconChangeGuide()) != null) {
                PubIconChangeGuide.PubIconChangeGuideType pubIconChangeGuideType = PubIconChangeGuide.PubIconChangeGuideType.ICON_CHANGE_STRONG_GUIDE_API;
                String h2 = mPage.b().h();
                q.b(h2, "page.getInstance().appId");
                PubIconChangeGuide.b a2 = pubIconChangeGuide2.a(pubIconChangeGuideType, userId, h2, i2, str, str2);
                if (a2 != null) {
                    return a2;
                }
            }
            return new PubIconChangeGuide.b(102, "轻应用服务端不允许展示");
        }
        PubContainerContext c3 = qrc.c(mPage.b());
        if (c3 != null && (pubIconChangeGuide = c3.getPubIconChangeGuide()) != null) {
            PubIconChangeGuide.PubIconChangeGuideType pubIconChangeGuideType2 = PubIconChangeGuide.PubIconChangeGuideType.ICON_CHANGE_STRONG_GUIDE;
            String h3 = mPage.b().h();
            q.b(h3, "page.getInstance().appId");
            PubIconChangeGuide.b a3 = PubIconChangeGuide.a(pubIconChangeGuide, pubIconChangeGuideType2, userId, h3, i2, null, null, 48, null);
            if (a3 != null) {
                return a3;
            }
        }
        return new PubIconChangeGuide.b(102, "轻应用服务端不允许展示");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.alibaba.fastjson.JSONObject] */
    private final void d(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        com.taobao.themis.pub_kit.guide.e pubOperateGuide;
        View a2;
        View findViewById;
        View a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a830db", new Object[]{this, iTMSPage, pubUserGuideModule});
            return;
        }
        String h2 = iTMSPage.b().h();
        String userId = ((IAccountAdapter) qpt.a(IAccountAdapter.class)).getUserId(iTMSPage.b());
        if (userId == null) {
            return;
        }
        if (getMTitleView().getContentView().getVisibility() != 0) {
            TMSLogger.d("PubTitleBar", "showOperateGuide, titleView is invisible");
            return;
        }
        PubContainerContext c2 = qrc.c(iTMSPage.b());
        if (c2 == null || (pubOperateGuide = c2.getPubOperateGuide()) == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r0 = (JSONObject) 0;
        objectRef.element = r0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = r0;
        com.taobao.themis.pub.titlebar.action.a aVar = (com.taobao.themis.pub.titlebar.action.a) getAction(com.taobao.themis.pub.titlebar.action.a.class);
        if (aVar != null && (a3 = aVar.a(getMContext())) != null) {
            ViewTreeObserver viewTreeObserver = a3.getViewTreeObserver();
            q.b(viewTreeObserver, "addIconView.viewTreeObserver");
            viewTreeObserver.addOnGlobalLayoutListener(new k(a3, this, objectRef, objectRef2, pubOperateGuide, h2, userId));
        }
        j jVar = (j) getAction(j.class);
        if (jVar == null || (a2 = jVar.a(getMContext())) == null || (findViewById = a2.findViewById(R.id.back_home_btn)) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = findViewById.getViewTreeObserver();
        q.b(viewTreeObserver2, "backHomeView.viewTreeObserver");
        viewTreeObserver2.addOnGlobalLayoutListener(new l(findViewById, this, objectRef2, pubOperateGuide, h2, userId, objectRef));
    }

    private final void d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb36d996", new Object[]{this, iTMSPage});
            return;
        }
        s sVar = (s) iTMSPage.a(s.class);
        if (sVar == null) {
            return;
        }
        sVar.a(this.f22727a);
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        aem.a().b(this.i);
    }

    private final void e(ITMSPage iTMSPage) {
        rnc pageContainer;
        rnc pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d79c17", new Object[]{this, iTMSPage});
            return;
        }
        View contentView = getMTitleView().getContentView();
        if (contentView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) contentView;
        this.h.getSafeAreaInsets()[0] = com.taobao.themis.utils.k.a(getMContext(), com.taobao.themis.utils.k.b(getMContext()));
        this.h.setImmersive(qqc.b(iTMSPage));
        qpm f2 = iTMSPage.f();
        View view = null;
        View view2 = (f2 == null || (pageContainer2 = f2.getPageContainer()) == null) ? null : pageContainer2.getView();
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        if (((ViewGroup) view2) != null && n.ab()) {
            qpm f3 = iTMSPage.f();
            if (f3 != null && (pageContainer = f3.getPageContainer()) != null) {
                view = pageContainer.getView();
            }
            if (view != null) {
                com.taobao.themis.container.title.titlebar.b.a(viewGroup, ((ViewGroup) view).getChildAt(0), this.h);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.taobao.themis.container.title.titlebar.b.a(viewGroup, (View) null, this.h);
    }

    private final JSONObject a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b048668a", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "x", (String) Integer.valueOf(com.taobao.themis.utils.k.a(getMContext(), iArr[0])));
        jSONObject2.put((JSONObject) "y", (String) Integer.valueOf(com.taobao.themis.utils.k.a(getMContext(), iArr[1])));
        jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(com.taobao.themis.utils.k.a(getMContext(), view.getWidth())));
        jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(com.taobao.themis.utils.k.a(getMContext(), view.getHeight())));
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/themis/pub/titlebar/PubTitleBar$Companion;", "", "()V", "BROADCAST_UPDATE_ADD_ICON_STATUS", "", "PUB_GUIDE_RECOMMEND_CUSTOM_REPLACE", "PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE", RPCDataItems.SWITCH_TAG_LOG, "WV_EVENT_USER_CANCEL_ADD_ICON", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1473200012);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
