package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.alr;
import tb.dkt;
import tb.ept;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.nfc;
import tb.ogg;
import tb.ogq;
import tb.ohg;
import tb.ruk;
import tb.rul;
import tb.rva;
import tb.syc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 i2\u00020\u0001:\u0003ijkB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010.\u001a\u00020\u001fJ\u0006\u0010/\u001a\u00020\u001fJ(\u00100\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f04H\u0002Jk\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132?\u00109\u001a;\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(:\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\u0004\u0012\u00020\u001f\u0018\u00010,J\u0091\u0001\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a2?\u00109\u001a;\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(:\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\u0004\u0012\u00020\u001f\u0018\u00010,J\u008d\u0001\u0010@\u001a\u00020!2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u0010A\u001a\u00020B2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010C\u001a\u00020=2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a2?\u00109\u001a;\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(:\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010;\u0012\u0004\u0012\u00020\u001f\u0018\u00010,H\u0002J \u0010D\u001a\u00020E2\u0006\u00108\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00052\u0006\u0010C\u001a\u00020=H\u0002J\b\u0010G\u001a\u0004\u0018\u00010\u0018J\b\u0010H\u001a\u0004\u0018\u00010\u0016J\u0006\u0010I\u001a\u00020\u0005J\u0010\u0010J\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0005H\u0002J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020!J\u0006\u0010N\u001a\u00020OJ\u0006\u0010P\u001a\u00020\u001fJ\u000e\u0010Q\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\fJ\u0006\u0010S\u001a\u00020\u001fJ\u0006\u0010T\u001a\u00020\u001fJ\u0006\u0010U\u001a\u00020\u001fJ\u0006\u0010V\u001a\u00020\u001fJ\u0006\u0010W\u001a\u00020\u001fJ\u0006\u0010X\u001a\u00020\u001fJ\u0006\u0010Y\u001a\u00020\nJ\u0010\u0010Z\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\u0005H\u0002J\"\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010_\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020\nJ\u000e\u0010a\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020!J\u000e\u0010c\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020!J8\u0010d\u001a\u00020!2\u0006\u0010e\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f04H\u0002J\b\u0010g\u001a\u00020!H\u0002J\u0010\u0010h\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010+\u001a\u001a\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer;", "", "context", "Landroid/content/Context;", "bizType", "", PopConst.BRIDGE_KEY_BUSINESS_ID, DxContainerActivity.PARAMS_NAMESPACE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "callBackHasRegister", "", "containerHeight", "", "containerView", "Landroid/widget/FrameLayout;", "containerWidth", "getContext", "()Landroid/content/Context;", "currentRenderViewParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$CustomParams;", "currentTemplateName", "dinamicXEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "dxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "engineDownloadCallBak", "Lkotlin/Function1;", "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "Lkotlin/ParameterName;", "name", "result", "", nfc.PHA_MONITOR_MODULE_POINT_ERROR_VIEW, "Landroid/view/View;", "isDestroy", "loadingView", "reTryTimes", "refreshAuto", "getRefreshAuto", "()Z", "setRefreshAuto", "(Z)V", "reuseLastView", "updateListener", "Lkotlin/Function3;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/ItemData;", "callRealDestroy", "createDXEngine", "createErrorView", "dxPageUrl", "reason", "retry", "Lkotlin/Function0;", ept.SUB_CREATE_VIEW, "height", "width", "customParams", "renderCallback", "isReuse", "Lcom/taobao/android/dinamicx/DXResult;", "version", "", "url", "downloadCallBak", "createViewInner", "dxTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "startRenderTime", "generateRenderParams", "Lcom/alibaba/fastjson/JSONObject;", "templateName", "getDXRootView", "getDxEngine", "getIdentifier", "getOrangeParams", "getPrefetchExecutor", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxPreloadExecutor;", "getRootView", "getVersionManager", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxTemplateVersionManager;", i.b.MEASURE_ONCREATE, MessageID.onDestroy, "flag", "onPageAppear", "onPageDisAppear", "onPause", "onResume", "onStart", MessageID.onStop, "openCache", "registerVersionUpdateListener", "reportError", "pageName", "errorMessage", "errorStack", "reuseRenderedView", com.taobao.tao.flexbox.layoutmanager.core.h.DSL_TYPE_REUSE, "setErrorView", "view", "setLoadingView", "showErrorView", "dxPageName", "uploadErrorInfo", "showLoadingView", "unregisterVersionUpdateListener", "Companion", "CustomParams", "DxContainerCache", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0845a Companion;
    public static final int DESTROY_DELAY = 2;
    public static final int DESTROY_IN_TIME = 1;
    public static final int DESTROY_NOT_DESTROY = 3;
    private static final c r;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f20239a;
    private DXRootView b;
    private DinamicXEngine c;
    private View d;
    private View e;
    private int f;
    private int g;
    private String h;
    private b i;
    private boolean j;
    private boolean k;
    private rul<? super fvb, t> l;
    private final rva<f, Boolean, Integer, t> m;
    private final Context n;
    private final String o;
    private final String p;
    private final String q;
    private boolean s;
    private boolean t;
    private int u;

    private a(Context context, String str, String str2, String str3) {
        this.n = context;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.f20239a = new FrameLayout(this.n);
        this.h = "";
        this.j = true;
        this.k = true;
        this.m = new DxContainer$updateListener$1(this);
    }

    public /* synthetic */ a(Context context, String str, String str2, String str3, o oVar) {
        this(context, str, str2, str3);
    }

    public static final /* synthetic */ void a(a aVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfa63d", new Object[]{aVar, dXRootView});
        } else {
            aVar.b = dXRootView;
        }
    }

    public static final /* synthetic */ c l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8d4c7068", new Object[0]) : r;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$Companion;", "", "()V", "CACHE_ORANGE_CONFIG_KEY", "", "DESTROY_DELAY", "", "DESTROY_IN_TIME", "DESTROY_NOT_DESTROY", RPCDataItems.SWITCH_TAG_LOG, "cache", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$DxContainerCache;", "obtainContainer", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer;", "context", "Landroid/content/Context;", "bizType", PopConst.BRIDGE_KEY_BUSINESS_ID, DxContainerActivity.PARAMS_NAMESPACE, "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.container.dx.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0845a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1297241391);
        }

        private C0845a() {
        }

        public /* synthetic */ C0845a(o oVar) {
            this();
        }

        public final a a(Context context, String bizType, String businessID, String nameSpace) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17b7e012", new Object[]{this, context, bizType, businessID, nameSpace});
            }
            q.d(context, "context");
            q.d(bizType, "bizType");
            q.d(businessID, "businessID");
            q.d(nameSpace, "nameSpace");
            if (q.a((Object) ohg.a().a("weitao_switch", "openDxContainerVersionManager", "false"), (Object) "true")) {
                d.INSTANCE.b();
            }
            if (q.a((Object) ohg.a().a("weitao_switch", "openDxContainerCache", "false"), (Object) "true")) {
                return a.l().a(context, bizType, businessID, nameSpace);
            }
            return new a(context, bizType, businessID, nameSpace, null);
        }
    }

    static {
        kge.a(-1242241335);
        Companion = new C0845a(null);
        r = new c();
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return this.o + '_' + this.q + '_' + this.p;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c != null) {
        } else {
            DXEngineConfig.a aVar = new DXEngineConfig.a(this.o);
            aVar.f(true);
            aVar.a(new dkt(new alr(this.p, this.q), null));
            this.c = new DinamicXEngine(aVar.a());
            ogg.a("DxContainer", "createDXEngine 创建引擎：bizType:" + this.o + ",businessId:" + this.p + ",nameSpace:" + this.q);
        }
    }

    public final DXRootView o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("49f417a1", new Object[]{this}) : this.b;
    }

    public final View a(int i, int i2, String name, b bVar, rva<? super Boolean, ? super DXResult<DXRootView>, ? super DXResult<DXRootView>, t> rvaVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20871409", new Object[]{this, new Integer(i), new Integer(i2), name, bVar, rvaVar});
        }
        q.d(name, "name");
        ogg.a("DxContainer", "createView: name:" + name);
        if (this.k && q.a((Object) this.h, (Object) name) && this.b != null) {
            this.f20239a.removeAllViews();
            this.f20239a.addView(this.b);
            ogg.a("DxContainer", "dxRootView 已经存在，复用该View");
            if (rvaVar != null) {
                rvaVar.invoke(true, null, null);
            }
            return this.f20239a;
        }
        f a2 = d.INSTANCE.a(name);
        long b2 = a2 != null ? a2.b() : -1L;
        if (a2 == null || (str = a2.c()) == null) {
            str = "";
        }
        return a(i, i2, name, b2, str, bVar, (rul<? super fvb, t>) null, rvaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.taobao.android.dinamicx.template.download.DXTemplateItem, T] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.taobao.tao.flexbox.layoutmanager.container.dx.h] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.taobao.tao.flexbox.layoutmanager.container.dx.h] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    public final View a(int i, int i2, String name, long j, String url, b bVar, rul<? super fvb, t> rulVar, rva<? super Boolean, ? super DXResult<DXRootView>, ? super DXResult<DXRootView>, t> rvaVar) {
        a aVar;
        a aVar2;
        long currentTimeMillis;
        DXTemplateItem dXTemplateItem;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4beeaa6", new Object[]{this, new Integer(i), new Integer(i2), name, new Long(j), url, bVar, rulVar, rvaVar});
        }
        q.d(name, "name");
        q.d(url, "url");
        try {
            ogg.a("DxContainer", "createView: name:" + name + ",version:" + j + ",url:" + url);
            currentTimeMillis = System.currentTimeMillis();
            dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = name;
            dXTemplateItem.b = j;
            dXTemplateItem.c = url;
        } catch (Throwable th) {
            th = th;
            aVar = "DxContainer";
            aVar2 = this;
        }
        if (this.k && q.a((Object) this.h, (Object) name) && this.b != null) {
            this.f20239a.removeAllViews();
            this.f20239a.addView(this.b);
            ogg.a("DxContainer", "dxRootView 已经存在，复用该View");
            if (rvaVar != null) {
                rvaVar.invoke(true, null, null);
            }
            return this.f20239a;
        }
        m();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        DinamicXEngine dinamicXEngine = this.c;
        q.a(dinamicXEngine);
        objectRef.element = dinamicXEngine.a(dXTemplateItem);
        StringBuilder sb = new StringBuilder();
        sb.append("fetch的结果,是否为空：");
        sb.append(((DXTemplateItem) objectRef.element) == null);
        sb.append(",文件是否存在:");
        sb.append(false);
        sb.append(",下载模板？");
        sb.append(true);
        ogg.a("DxContainer", sb.toString());
        try {
        } catch (Throwable th2) {
            th = th2;
            aVar2 = this;
            aVar = this;
        }
        if (((DXTemplateItem) objectRef.element) != null) {
            try {
                ogg.a("DxContainer", "fetch的结果：" + ((DXTemplateItem) objectRef.element).toString() + ",开始渲染此模板");
                return a(i, i2, (DXTemplateItem) objectRef.element, bVar, currentTimeMillis, rulVar, rvaVar);
            } catch (Throwable th3) {
                th = th3;
                aVar2 = this;
                aVar = "DxContainer";
            }
        } else {
            ogg.a("DxContainer", "开始下载模板：name:" + name + ",version:" + j + ",url:" + url);
            aVar = "DxContainer";
            try {
                aVar2 = this;
                try {
                    aVar2.l = new DxContainer$createView$1(this, name, j, url, objectRef, i, i2, bVar, currentTimeMillis, rulVar, rvaVar, dXTemplateItem);
                    if (!aVar2.t || aVar2.l == null) {
                        c2 = 0;
                    } else {
                        DinamicXEngine dinamicXEngine2 = aVar2.c;
                        if (dinamicXEngine2 != null) {
                            rul<? super fvb, t> rulVar2 = aVar2.l;
                            if (rulVar2 != null) {
                                rulVar2 = new h(rulVar2);
                            }
                            dinamicXEngine2.d((fve) rulVar2);
                        }
                        c2 = 0;
                        aVar2.t = false;
                    }
                    DinamicXEngine dinamicXEngine3 = aVar2.c;
                    if (dinamicXEngine3 != null) {
                        rul<? super fvb, t> rulVar3 = aVar2.l;
                        if (rulVar3 != null) {
                            rulVar3 = new h(rulVar3);
                        }
                        dinamicXEngine3.a((fve) rulVar3);
                    }
                    aVar2.t = true;
                    DinamicXEngine dinamicXEngine4 = aVar2.c;
                    if (dinamicXEngine4 != null) {
                        DXTemplateItem[] dXTemplateItemArr = new DXTemplateItem[1];
                        dXTemplateItemArr[c2] = dXTemplateItem;
                        dinamicXEngine4.a(p.c(dXTemplateItemArr));
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                aVar2 = this;
            }
            return aVar2.f20239a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("渲染异常:");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        sb2.append(message);
        ogg.a(aVar, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("渲染异常:");
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        sb3.append(message2);
        a(name, "渲染错误", sb3.toString(), kotlin.a.a(th), new DxContainer$createView$2(this, i, i2, name, j, url, bVar, rulVar, rvaVar));
        return aVar2.f20239a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View a(int r21, int r22, com.taobao.android.dinamicx.template.download.DXTemplateItem r23, com.taobao.tao.flexbox.layoutmanager.container.dx.a.b r24, long r25, tb.rul<? super tb.fvb, kotlin.t> r27, tb.rva<? super java.lang.Boolean, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, kotlin.t> r28) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.container.dx.a.a(int, int, com.taobao.android.dinamicx.template.download.DXTemplateItem, com.taobao.tao.flexbox.layoutmanager.container.dx.a$b, long, tb.rul, tb.rva):android.view.View");
    }

    private final JSONObject a(b bVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52dbe25c", new Object[]{this, bVar, str, new Long(j)});
        }
        JSONObject b2 = bVar.b();
        JSONObject jSONObject = b2;
        jSONObject.put((JSONObject) "orangeParams", (String) a(str));
        jSONObject.put((JSONObject) "renderTime", (String) Long.valueOf(j));
        jSONObject.put((JSONObject) "readLocalIOTime", (String) Long.valueOf(d.INSTANCE.a()));
        return b2;
    }

    private final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        try {
            ohg a2 = ohg.a();
            JSONObject parseObject = JSONObject.parseObject(a2.a("weitao_switch", str + "_config", "{}"));
            q.b(parseObject, "JSONObject.parseObject(orangeParamsString)");
            return parseObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.j) {
        } else {
            d.INSTANCE.a(str, this.m);
        }
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!this.j) {
        } else {
            d.INSTANCE.b(str, this.m);
        }
    }

    public final DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c0d4a65d", new Object[]{this}) : this.c;
    }

    private final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String[] strArr = {"errorMessage=" + str2, "errorStack=" + str3};
        com.taobao.tao.flexbox.layoutmanager.adapter.a a2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a();
        q.b(a2, "AdapterFactory.instance()");
        a2.k().a("TNode", 19997, "dxContainerError", null, null, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final View a(String str, String str2, String str3, String str4, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4f1011ba", new Object[]{this, str, str2, str3, str4, rukVar});
        }
        ogg.a("DxContainer", "显示错误页");
        a(str, str3, str4);
        if (this.u <= 0) {
            rukVar.mo2427invoke();
            this.u++;
            return this.f20239a;
        }
        try {
            View view = this.e;
            if (view != null) {
                this.f20239a.removeAllViews();
                this.f20239a.addView(view);
            } else {
                View b2 = b(str, str2, rukVar);
                this.f20239a.removeAllViews();
                this.f20239a.addView(b2);
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("错误页展示异常");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            sb.append(message);
            ogg.a("DxContainer", sb.toString());
        }
        return this.f20239a;
    }

    private final View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this});
        }
        ogg.a("DxContainer", "显示loading页");
        View view = this.d;
        if (view != null) {
            this.f20239a.removeAllViews();
            this.f20239a.addView(view);
        }
        return this.f20239a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.tao.flexbox.layoutmanager.container.dx.b] */
    private final View b(String str, String str2, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3103d767", new Object[]{this, str, str2, rukVar});
        }
        Context context = this.n;
        if (rukVar != null) {
            rukVar = new com.taobao.tao.flexbox.layoutmanager.container.dx.b(rukVar);
        }
        return ogq.a(context, str, "", str2, null, (ogq.a) rukVar);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            ogg.a("DxContainer", i.b.MEASURE_ONCREATE);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ogg.a("DxContainer", "onStart");
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ogg.a("DxContainer", "onResume");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.m();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            ogg.a("DxContainer", "onPause");
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ogg.a("DxContainer", MessageID.onStop);
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.n();
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ogg.a("DxContainer", "onDestroy: 标记：" + i);
        if (n()) {
            r.a(this, i);
        } else {
            k();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ogg.a("DxContainer", "onPageAppear");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.b(this.b);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ogg.a("DxContainer", "onPageDisAppear");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.a(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.taobao.tao.flexbox.layoutmanager.container.dx.i] */
    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.s) {
        } else {
            ogg.a("DxContainer", "callRealDestroy");
            c(this.h);
            this.s = true;
            try {
                if (this.c == null) {
                    return;
                }
                rul<? super fvb, t> rulVar = this.l;
                if (rulVar != null) {
                    DinamicXEngine dinamicXEngine = this.c;
                    q.a(dinamicXEngine);
                    if (rulVar != null) {
                        rulVar = new i(rulVar);
                    }
                    dinamicXEngine.d((fve) rulVar);
                }
                DinamicXEngine dinamicXEngine2 = this.c;
                q.a(dinamicXEngine2);
                dinamicXEngine2.o();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("callRealDestroy Error:");
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                sb.append(message);
                ogg.a("DxContainer", sb.toString());
            }
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : q.a((Object) ohg.a().a("weitao_switch", "openDxContainerCache", "false"), (Object) "true");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$CustomParams;", "", "()V", "data", "Lcom/alibaba/fastjson/JSONObject;", "getData", "()Lcom/alibaba/fastjson/JSONObject;", "useContext", "getUseContext", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f20240a = new JSONObject();
        private final JSONObject b = new JSONObject();

        static {
            kge.a(-704725390);
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f20240a;
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$DxContainerCache;", "", "()V", "cacheList", "", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer;", "handler", "Landroid/os/Handler;", "waitDestroyList", "waitDestroyTime", "", "checkHandler", "destroyDxContainer", "", syc.DX_CONTAINER, "flag", "", "obtainDxContainer", "context", "Landroid/content/Context;", "bizType", "", PopConst.BRIDGE_KEY_BUSINESS_ID, DxContainerActivity.PARAMS_NAMESPACE, "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Handler f20241a;
        private final List<a> b = new ArrayList();
        private final List<a> c = new ArrayList();
        private long d = 120;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.container.dx.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class RunnableC0846a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ a b;

            public RunnableC0846a(a aVar) {
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!c.a(c.this).contains(this.b)) {
                } else {
                    this.b.k();
                    c.a(c.this).remove(this.b);
                    c.b(c.this).remove(this.b);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes8.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c cVar = c.this;
                    String a2 = ohg.a().a("weitao_switch", "dxContainerDestroyDelayTime", "120");
                    q.b(a2, "TNodeOrange.getInstance(…DestroyDelayTime\", \"120\")");
                    c.a(cVar, Long.parseLong(a2));
                } catch (Throwable unused) {
                    ogg.a("DxContainer", "读取orange销毁延时配置异常");
                }
            }
        }

        static {
            kge.a(795754960);
        }

        public static final /* synthetic */ List a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("16a5a60a", new Object[]{cVar}) : cVar.c;
        }

        public static final /* synthetic */ void a(c cVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0c6cbc7", new Object[]{cVar, new Long(j)});
            } else {
                cVar.d = j;
            }
        }

        public static final /* synthetic */ List b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a53d0cb", new Object[]{cVar}) : cVar.b;
        }

        private final Handler a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this});
            }
            if (this.f20241a == null) {
                ogg.a("DxContainer", "创建cache 的Handler");
                this.f20241a = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f20241a;
            q.a(handler);
            return handler;
        }

        public final a a(Context context, String bizType, String businessID, String nameSpace) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17b7e012", new Object[]{this, context, bizType, businessID, nameSpace});
            }
            q.d(context, "context");
            q.d(bizType, "bizType");
            q.d(businessID, "businessID");
            q.d(nameSpace, "nameSpace");
            String str = bizType + '_' + nameSpace + '_' + businessID;
            ogg.a("DxContainer", "obtainDxContainer 标识为：" + str);
            for (a aVar : this.b) {
                if (q.a((Object) str, (Object) aVar.a())) {
                    ogg.a("DxContainer", "obtainDxContainer 找到相同标识的容器，返回缓存");
                    if (this.c.contains(aVar)) {
                        this.c.remove(aVar);
                    }
                    return aVar;
                }
            }
            ogg.a("DxContainer", "obtainDxContainer 没找到相同标识的容器，重新创建对象");
            a aVar2 = new a(context, bizType, businessID, nameSpace, null);
            this.b.add(aVar2);
            a().postDelayed(new b(), 1000L);
            return aVar2;
        }

        public final void a(a dxContainer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee42dc7", new Object[]{this, dxContainer, new Integer(i)});
                return;
            }
            q.d(dxContainer, "dxContainer");
            ogg.a("DxContainer", "destroyDxContainer 标识为" + i);
            if (i == 1) {
                dxContainer.k();
                this.b.remove(dxContainer);
            } else if (i != 2) {
            } else {
                this.c.add(dxContainer);
                a().postDelayed(new RunnableC0846a(dxContainer), this.d * 1000);
            }
        }
    }
}
