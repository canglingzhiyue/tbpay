package com.taobao.infoflow;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.uikit.extend.component.TBErrorView;
import com.uc.webview.export.media.MessageID;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.text.n;
import tb.ept;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.ljj;
import tb.ljl;
import tb.mut;
import tb.mva;
import tb.mvc;
import tb.nwq;
import tb.nwu;
import tb.riy;
import tb.shc;
import tb.syb;
import tb.szx;
import tb.tbt;
import tb.tbv;
import tb.tbw;
import tb.thf;
import tb.tmv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 I2\u00020\u0001:\u0001IB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\"H\u0002J(\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0014\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010-\u001a\u00020\u0005H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050/H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0002J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\u000fH\u0016J\u001c\u00104\u001a\u00020\"2\b\u00105\u001a\u0004\u0018\u0001062\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020\"H\u0016J\b\u00109\u001a\u00020\"H\u0016J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\b\u0010>\u001a\u00020\"H\u0016J\n\u0010?\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010D\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020\u0005J\u0006\u0010G\u001a\u00020\"J\b\u0010H\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/taobao/infoflow/HomeWebTabController;", "Lcom/taobao/tao/topmultitab/protocol/AbsHomeSubTabController;", "callBack", "Lcom/taobao/tao/topmultitab/protocol/IHomeTabContainerCallBack;", "businessId", "", "performanceListener", "Lcom/taobao/tao/infoflow/multitab/protocol/IMultiTabPerformanceListener;", "stabilityListener", "Lcom/taobao/tao/infoflow/multitab/viewprovider/IMultiTabStabilityListener;", "(Lcom/taobao/tao/topmultitab/protocol/IHomeTabContainerCallBack;Ljava/lang/String;Lcom/taobao/tao/infoflow/multitab/protocol/IMultiTabPerformanceListener;Lcom/taobao/tao/infoflow/multitab/viewprovider/IMultiTabStabilityListener;)V", "(Lcom/taobao/tao/topmultitab/protocol/IHomeTabContainerCallBack;Ljava/lang/String;)V", "mContext", "Landroid/content/Context;", "mIsCreateView", "", "mPassParamsService", "Lcom/taobao/infoflow/passparams/PassParamsService;", "mPerformanceListener", "mPopLayerPassParams", "Lcom/alibaba/fastjson/JSONObject;", "mPreloadFirstChunkService", "Lcom/taobao/infoflow/preload/PreloadFirstChunkService;", "mStabilityListener", "mTabBarButtonService", "Lcom/taobao/infoflow/rocket/TabBarButtonService;", "mTabClickedTime", "", "mWebViewProvider", "Lcom/taobao/infoflow/webview/WebViewProvider;", "appendParamsToUrl", "baseUrl", "params", "checkReInitWebTabConfig", "", "compensateUpdatePagePropertiesParams", "", "paramsMap", "createRenderListener", "Lcom/taobao/infoflow/webview/IRenderListener;", ept.SUB_CREATE_VIEW, "Landroid/view/View;", "context", "getFinalUrl", "getPageUrlConcatBusinessId", "getUpdatePageName", "getUpdatePageProperties", "", "getWebViewUrl", "Landroid/net/Uri;", "initWebTabConfig", "isOnRocketState", "notifyOutLinkParams", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "notifyRefreshPage", "onClickRocket", MessageID.onDestroy, "onPageSelected", "onPageUnSelected", "onPause", "onResume", ljl.TAB_CLICKED_TIME, tbt.PARSE_MANIFEST_URL, "passThroughData", "data", "Lcom/taobao/infoflow/protocol/engine/invoke/biz/passparams/IPassParamsModel;", "sectionBizCode", "itemBizCode", tbt.PRE_REQUEST, "pageUrl", "preloadFirstChunk", m.UPDATE_PAGEURL, "Companion", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class a extends com.taobao.tao.topmultitab.protocol.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIOR = "behavior";
    public static final String CLICK_TAB_BAR_BUTTON = "WV.Event.clickNavigationTabBarButton";
    public static final String COMPENSATE_UPDATE_PAGE_PROPERTIES_PARAMS_ENABLE = "compensatePagePropertiesParamsEnable";
    public static final String CURRENT_TAB_BAR_BUTTON_STATUS = "currentTabBarButtonStatus";
    public static final C0668a Companion;
    public static final String PAGE_NAME = "pageName";
    public static final String PAGE_PROP = "params";
    public static final String PAGE_SELECTED = "WV.Event.pageSelected";
    public static final String PAGE_UNSELECTED = "WV.Event.pageUnSelected";
    public static final String SCM = "scm";
    public static final String SPM_CNT = "spm-cnt";
    public static final String TAB_PAGE_SPM_CNT = "tabPageSpmCnt";
    public static final String TAG = "WebTabController";
    public static final String UPDATE_PAGE_URL_ENABLE = "updatePageUrlEnable";
    public static final String UPDATE_PAGE_URL_ON_RESUME_ENABLE = "updatePageUrlOnResumeEnable";

    /* renamed from: a  reason: collision with root package name */
    private mvc f17349a;
    private nwu b;
    private nwq c;
    private IMultiTabPerformanceListener d;
    private IMultiTabStabilityListener e;
    private syb f;
    private boolean g;
    private Context h;
    private JSONObject i;
    private final com.taobao.tao.topmultitab.protocol.c j;
    private final String k;
    private long l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/taobao/infoflow/HomeWebTabController$createRenderListener$1", "Lcom/taobao/infoflow/webview/IRenderListener;", "onJSException", "", "errorCode", "", "errorMsg", "onRenderFail", ljl.RENDER_SUCCESS_TIME, "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements szx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.szx
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            IMultiTabStabilityListener a2 = a.a(a.this);
            if (a2 == null) {
                return;
            }
            a2.a(IMultiTabStabilityListener.ON_RENDER, a.b(a.this), "tmsRenderFail");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"com/taobao/infoflow/HomeWebTabController$getUpdatePageProperties$1$1", "Lcom/alibaba/fastjson/TypeReference;", "", "", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class c extends TypeReference<Map<String, ? extends String>> {
    }

    static {
        kge.a(1141438780);
        Companion = new C0668a(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.taobao.tao.topmultitab.protocol.c callBack, String businessId) {
        super(callBack);
        q.d(callBack, "callBack");
        q.d(businessId, "businessId");
        this.j = callBack;
        this.k = businessId;
        f();
    }

    public static final /* synthetic */ IMultiTabStabilityListener a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMultiTabStabilityListener) ipChange.ipc$dispatch("eadc617c", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90f28489", new Object[]{aVar}) : aVar.k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.taobao.tao.topmultitab.protocol.c callBack, String businessId, IMultiTabPerformanceListener iMultiTabPerformanceListener, IMultiTabStabilityListener iMultiTabStabilityListener) {
        this(callBack, businessId);
        q.d(callBack, "callBack");
        q.d(businessId, "businessId");
        this.d = iMultiTabPerformanceListener;
        this.e = iMultiTabStabilityListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/infoflow/HomeWebTabController$Companion;", "", "()V", "BEHAVIOR", "", "CLICK_TAB_BAR_BUTTON", "COMPENSATE_UPDATE_PAGE_PROPERTIES_PARAMS_ENABLE", "CURRENT_TAB_BAR_BUTTON_STATUS", "PAGE_NAME", "PAGE_PROP", "PAGE_SELECTED", "PAGE_UNSELECTED", "SCM", "SPM_CNT", "TAB_PAGE_SPM_CNT", RPCDataItems.SWITCH_TAG_LOG, "UPDATE_PAGE_URL_ENABLE", "UPDATE_PAGE_URL_ON_RESUME_ENABLE", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.infoflow.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0668a {
        static {
            kge.a(-1357936252);
        }

        private C0668a() {
        }

        public /* synthetic */ C0668a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        mva b2;
        ljl d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View view = null;
        if (!(context instanceof Activity)) {
            tbw tbwVar = tbw.INSTANCE;
            tbwVar.a("ucNotSupport", "contextNotActivity", "context" + context, this.k, TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "");
            if (context instanceof Application) {
                return null;
            }
            return new TBErrorView(context);
        }
        this.h = context;
        e();
        String b3 = b();
        String str = b3;
        if (str == null || str.length() == 0) {
            ldf.d(TAG, "createView webViewUrl == null");
            return new TBErrorView(context);
        }
        ldf.d(TAG, "createView webViewUrl: " + b3);
        this.g = true;
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            view = mvcVar.a((Activity) context, TMSEmbedSolutionType.WEB_SINGLE_PAGE, b3);
        }
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 != null && (b2 = mvcVar2.b()) != null && (d = b2.d()) != null) {
            d.a(ljl.TAB_CLICKED_TIME, this.l);
        }
        return view;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.c();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "behavior", "fromOther");
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 != null) {
            mvcVar2.a(PAGE_SELECTED, jSONObject);
        }
        if (ldj.a(UPDATE_PAGE_URL_ON_RESUME_ENABLE, false)) {
            g();
            ldf.d(TAG, "onResume，更新页面参数");
        }
        ldf.d(TAG, "onResume，发送选中事件");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b1a18", new Object[]{this});
        } else {
            this.l = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.c();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "behavior", "fromTab");
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 != null) {
            mvcVar2.a(PAGE_SELECTED, jSONObject);
        }
        ldf.d(TAG, "onPageSelected，发送选中事件");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        shc c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.a(PAGE_UNSELECTED, (JSONObject) null);
        }
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 != null) {
            mvcVar2.d();
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.d;
        if (iMultiTabPerformanceListener != null && (c2 = iMultiTabPerformanceListener.c(this.k)) != null) {
            g.a(TAG, "WebTabController onPageUnSelected: span:" + c2);
            mvc mvcVar3 = this.f17349a;
            if (mvcVar3 != null) {
                mvcVar3.a(c2);
            }
        }
        ldf.d(TAG, "onPageUnSelected，发送离开事件：" + this.d);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        shc c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.d();
        }
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 != null) {
            mvcVar2.a(PAGE_UNSELECTED, (JSONObject) null);
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.d;
        if (iMultiTabPerformanceListener != null && (c2 = iMultiTabPerformanceListener.c(this.k)) != null) {
            g.a(TAG, "WebTabController onPause: span:" + c2);
            mvc mvcVar3 = this.f17349a;
            if (mvcVar3 != null) {
                mvcVar3.a(c2);
            }
        }
        ldf.d(TAG, "onPause，发送离开事件：" + this.d);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        nwu nwuVar = this.b;
        if (nwuVar == null) {
            q.b("mTabBarButtonService");
        }
        nwuVar.a();
        nwq nwqVar = this.c;
        if (nwqVar == null) {
            q.b("mPassParamsService");
        }
        nwqVar.a();
        syb sybVar = this.f;
        if (sybVar == null) {
            q.b("mPreloadFirstChunkService");
        }
        sybVar.a();
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.a();
        }
        this.f17349a = null;
        this.g = false;
        ldf.d(TAG, MessageID.onDestroy);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            nwu nwuVar = this.b;
            if (nwuVar == null) {
                q.b("mTabBarButtonService");
            }
            String b2 = nwuVar.b();
            if (b2 == null) {
                b2 = com.taobao.share.taopassword.busniess.model.g.TAO;
            }
            jSONObject.put((JSONObject) CURRENT_TAB_BAR_BUTTON_STATUS, b2);
            mvc mvcVar = this.f17349a;
            if (mvcVar != null) {
                mvcVar.a(CLICK_TAB_BAR_BUTTON, jSONObject);
            }
            ldf.d(TAG, "发送给前端一个小火箭点击的事件,小火箭的状态是: " + b2);
        } catch (Exception e) {
            ldf.d(TAG, "发送给前端一个小火箭点击的事件出现异常： " + e);
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        nwu nwuVar = this.b;
        if (nwuVar == null) {
            q.b("mTabBarButtonService");
        }
        String b2 = nwuVar.b();
        if (b2 == null) {
            b2 = com.taobao.share.taopassword.busniess.model.g.TAO;
        }
        ldf.d(TAG, "isOnRocketState，当前的小火箭状态是：" + b2);
        return TextUtils.equals(b2, NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyRefreshPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b07908", new Object[]{this});
            return;
        }
        String c2 = c();
        if (c2 == null) {
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.a(c2);
        }
        ldf.d(TAG, "notifyRefreshPage, pageUrl: " + c2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        JSONObject b2;
        mva b3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        mvc mvcVar = this.f17349a;
        mut c2 = (mvcVar == null || (b3 = mvcVar.b()) == null) ? null : b3.c();
        if (c2 == null || (b2 = c2.b()) == null) {
            return "Page_HomeSale";
        }
        String string = b2.getString("pageName");
        String str = string;
        if (str == null || str.length() == 0) {
            z = true;
        }
        return z ? "Page_HomeSale" : string;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        mva b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        mvc mvcVar = this.f17349a;
        JSONObject jSONObject = null;
        mut c2 = (mvcVar == null || (b2 = mvcVar.b()) == null) ? null : b2.c();
        if (c2 != null) {
            jSONObject = c2.b();
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return a(hashMap);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        if (jSONObject2 != null) {
            Object parseObject = JSONObject.parseObject(jSONObject2.toJSONString(), new c(), new Feature[0]);
            if (parseObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            }
            hashMap = x.i(parseObject);
        }
        if (ldj.a(UPDATE_PAGE_URL_ENABLE, false)) {
            g();
            ldf.d(TAG, "getUpdatePageProperties，更新页面参数");
        }
        return a(hashMap);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        mva b2;
        ljl d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar == null || (b2 = mvcVar.b()) == null || (d = b2.d()) == null) {
            return;
        }
        d.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(tmv data, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d691b50c", new Object[]{this, data, str, str2});
            return;
        }
        q.d(data, "data");
        this.i = null;
        if (!this.g) {
            this.i = data.a();
            return;
        }
        nwq nwqVar = this.c;
        if (nwqVar == null) {
            q.b("mPassParamsService");
        }
        nwqVar.a(data.a());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!tbt.a(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "preloadFirstChunk")) {
            ldf.d(TAG, "uc降级不做任何优化");
        } else if (this.g) {
            ldf.d(TAG, "预加载时已经进入会场了");
        } else {
            String b2 = b();
            if (b2 == null) {
                return;
            }
            mvc mvcVar = this.f17349a;
            if (mvcVar != null) {
                mvcVar.b(b2);
            }
            ldf.d(TAG, "preloadFirstChunk, pageUrl: " + b2);
        }
    }

    public final void a(String pageUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, pageUrl});
            return;
        }
        q.d(pageUrl, "pageUrl");
        String str = pageUrl + "&businessId=" + this.k;
        String b2 = b();
        String str2 = b2;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        String a2 = tbv.INSTANCE.a(b2);
        String str3 = str;
        if (TextUtils.equals(str3, str2) || TextUtils.equals(a2, str3)) {
            ldf.d(TAG, "链接没变化，不预请求了");
            return;
        }
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.a(str, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        }
        ldf.d(TAG, "preRequest, pageUrl: " + pageUrl);
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String c2 = c();
        JSONObject jSONObject = null;
        if (c2 == null) {
            return null;
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null) {
            return c2;
        }
        if (true ^ jSONObject2.isEmpty()) {
            jSONObject = jSONObject2;
        }
        if (jSONObject == null) {
            return c2;
        }
        JSONObject jSONObject3 = jSONObject;
        ArrayList arrayList = new ArrayList(jSONObject3.size());
        for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
            String encode = URLEncoder.encode(entry.getValue().toString(), "UTF-8");
            arrayList.add(entry.getKey() + '=' + encode);
        }
        String a2 = a(c2, p.a(arrayList, "&", null, null, 0, null, null, 62, null));
        return a2 == null ? c2 : a2;
    }

    private final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (n.b((CharSequence) str, (CharSequence) "?", false, 2, (Object) null)) {
            return str + '&' + str2;
        }
        return str + riy.CONDITION_IF + str2;
    }

    private final String c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String d = d();
        String str = d;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            ldf.d(TAG, "webViewUrl == null");
            tbw.INSTANCE.a("getManifestUrl", "pageUrl == null", "", this.k, TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "");
            return null;
        }
        return d + "&businessId=" + this.k;
    }

    private final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        JSONObject g = this.j.g(this);
        String b2 = thf.b(g);
        String a2 = thf.a(g);
        String str = b2;
        if (str == null || str.length() == 0) {
            ldf.d(TAG, "页面刷新,ssrManifestUrl为空,manifestUrl: " + a2);
            return a2;
        } else if (!tbt.a(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), tbt.PARSE_MANIFEST_URL)) {
            ldf.d(TAG, "页面刷新,uc降级,manifestUrl: " + a2);
            return a2;
        } else {
            ldf.d(TAG, "页面刷新,ssrManifestUrl: " + b2);
            return b2;
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f17349a != null) {
        } else {
            f();
            ldf.d(TAG, "重新初始化引擎");
        }
    }

    private final void f() {
        mva b2;
        ljj b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f17349a = new mvc(this.k, this.j.c());
        mvc mvcVar = this.f17349a;
        if (mvcVar != null) {
            mvcVar.a(i());
        }
        mvc mvcVar2 = this.f17349a;
        if (mvcVar2 == null || (b2 = mvcVar2.b()) == null || (b3 = b2.b()) == null) {
            return;
        }
        ljj ljjVar = b3;
        com.taobao.tao.topmultitab.protocol.c cVar = this.j;
        mvc mvcVar3 = this.f17349a;
        q.a(mvcVar3);
        this.f = new syb(ljjVar, cVar, mvcVar3);
        a aVar = this;
        this.b = new nwu(ljjVar, this.j, aVar);
        this.c = new nwq(ljjVar, this.j, aVar);
        ldf.d(TAG, "初始化引擎");
    }

    private final Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Uri h = h();
        if (h == null) {
            ldf.d(TAG, "compensateUpdatePagePropertiesParams webViewUrl == null");
            return map;
        }
        if (ldj.a(COMPENSATE_UPDATE_PAGE_PROPERTIES_PARAMS_ENABLE, true)) {
            String scm = h.getQueryParameter("scm");
            if (scm != null) {
                q.b(scm, "scm");
                map.put("scm", scm);
                ldf.d(TAG, "compensateUpdatePagePropertiesParams scm:" + scm);
            }
            String spmCnt = h.getQueryParameter(TAB_PAGE_SPM_CNT);
            if (spmCnt != null) {
                q.b(spmCnt, "spmCnt");
                map.put("spm-cnt", spmCnt);
                ldf.d(TAG, "compensateUpdatePagePropertiesParams spmCnt: " + spmCnt);
            }
        }
        return map;
    }

    private final void g() {
        mva b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Uri h = h();
        if (h == null) {
            ldf.d(TAG, "updatePageUrl webViewUrl == null");
            return;
        }
        mvc mvcVar = this.f17349a;
        mut c2 = (mvcVar == null || (b2 = mvcVar.b()) == null) ? null : b2.c();
        if (c2 == null) {
            return;
        }
        c2.a(this.h, h);
    }

    private final Uri h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2a871c26", new Object[]{this});
        }
        String b2 = b();
        String str = b2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            ldf.d(TAG, "getWebViewUrl finalUrl == null");
            return null;
        }
        return Uri.parse(b2);
    }

    private final szx i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (szx) ipChange.ipc$dispatch("4c97ef45", new Object[]{this}) : new b();
    }
}
