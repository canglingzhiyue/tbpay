package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.transition.Transition;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.search.common.util.i;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.flexbox.layoutmanager.container.dx.a;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.fvb;
import tb.gwf;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogq;
import tb.ohd;
import tb.rul;
import tb.rva;
import tb.syc;

@PopLayer.PopupAllowedFromFragment
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0017\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0005&'()*B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\u00020\u00122\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity;", "Lcom/taobao/tao/BaseActivity;", "Lcom/taobao/android/launcher/bootstrap/tao/ability/LinkLifeCycle;", "Lcom/taobao/taobaocompat/lifecycle/IUtActivityNotTrack;", "()V", "businessParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$DxBusinessParams;", syc.DX_CONTAINER, "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer;", "dxRenderParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$DxRenderParams;", "onCreateTime", "", "pageParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$PageParams;", "viewParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$ViewParams;", "finish", "", "hideActionBar", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onPause", "onResume", "onSetActivityTheme", "onStart", MessageID.onStop, "parsePageUrl", "", "setupThemeAndTransition", "updatePageName", "pageName", "", com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_PROPERTIES, "pageProperties", "", "Companion", "DxBusinessParams", "DxRenderParams", "PageParams", "ViewParams", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class DxContainerActivity extends BaseActivity implements com.taobao.android.launcher.bootstrap.tao.ability.c, IUtActivityNotTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String PARAMS_BIZ_TYPE = "bizType";
    public static final String PARAMS_NAME = "name";
    public static final String PARAMS_NAMESPACE = "nameSpace";
    public static final String PARAMS_PAGE_NAME = "pageName";
    public static final String PARAMS_PAGE_SPM = "spm";
    public static final String PARAMS_SHOW_ACTION_BAR = "showActionBar";
    public static final String PARAMS_SHOW_STATUS_BAR = "showStatusBar";
    public static final String PARAMS_URL = "url";
    public static final String PARAMS_URL_BUSINESS_PARAMS = "urlParams";
    public static final String PARAMS_VERSION = "version";
    public static final String PARAM_BUSINESS_ID = "businessId";

    /* renamed from: a  reason: collision with root package name */
    private long f20233a;
    private com.taobao.tao.flexbox.layoutmanager.container.dx.a b;
    private final b c = new b();
    private final c d = new c();
    private final e e = new e();
    private final d f = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.container.dx.a a2 = DxContainerActivity.a(DxContainerActivity.this);
            if (a2 != null) {
                a2.a(1);
            }
            DxContainerActivity.b(DxContainerActivity.this);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().pageDisAppear(DxContainerActivity.this);
        }
    }

    static {
        kge.a(143680760);
        kge.a(-1864841087);
        kge.a(1698775038);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(DxContainerActivity dxContainerActivity, String str, Object... objArr) {
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.container.dx.a a(DxContainerActivity dxContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.container.dx.a) ipChange.ipc$dispatch("973101f5", new Object[]{dxContainerActivity}) : dxContainerActivity.b;
    }

    public static final /* synthetic */ void b(DxContainerActivity dxContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab14900", new Object[]{dxContainerActivity});
        } else {
            super.finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        boolean f2 = oec.f();
        ogg.a("DxContainerActivity", "onCreate: " + f2);
        if (!f2) {
            return;
        }
        if (!d()) {
            DxContainerActivity dxContainerActivity = this;
            Intent intent = getIntent();
            q.b(intent, "intent");
            Uri data = intent.getData();
            if (data == null || (str = data.toString()) == null) {
                str = "";
            }
            ogq.a(dxContainerActivity, str, "", "url 参数无法解析", null, null);
        }
        a(this.f.a());
        a(this.f.c());
        c();
        super.onCreate(bundle);
        this.f20233a = System.nanoTime();
        gwf.a((Activity) this);
        DxContainerActivity dxContainerActivity2 = this;
        this.b = com.taobao.tao.flexbox.layoutmanager.container.dx.a.Companion.a(dxContainerActivity2, this.c.a(), this.c.b(), this.c.c());
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        q.a(aVar);
        aVar.b();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar2 = this.b;
        q.a(aVar2);
        aVar2.d();
        if (!this.e.a()) {
            Window window = getWindow();
            q.b(window, "window");
            ohd.a(window.getDecorView());
        }
        if (!this.e.b()) {
            b();
        }
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar3 = this.b;
        q.a(aVar3);
        setContentView(aVar3.a(ohd.g(dxContainerActivity2), ohd.f(dxContainerActivity2), this.d.a(), this.d.b(), this.d.c(), (a.b) null, (rul<? super fvb, t>) null, (rva<? super Boolean, ? super DXResult<DXRootView>, ? super DXResult<DXRootView>, t>) null));
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar4 = this.b;
        q.a(aVar4);
        aVar4.d();
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageAppear(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        android.app.ActionBar actionBar = getActionBar();
        if (actionBar == null) {
            return;
        }
        actionBar.hide();
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            setTheme(R.style.Theme_OverLayingActionBar);
            getWindow().requestFeature(12);
            Window window = getWindow();
            q.b(window, "this.window");
            Transition transition = null;
            window.setEnterTransition(transition);
            Window window2 = getWindow();
            q.b(window2, "this.window");
            window2.setExitTransition(transition);
            overridePendingTransition(0, 0);
        }
    }

    private final boolean d() {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Intent intent = getIntent();
        q.b(intent, "intent");
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        b bVar = this.c;
        String queryParameter = data.getQueryParameter("bizType");
        if (queryParameter == null) {
            queryParameter = this.c.a();
        }
        bVar.a(queryParameter);
        b bVar2 = this.c;
        String queryParameter2 = data.getQueryParameter("businessId");
        if (queryParameter2 == null) {
            queryParameter2 = this.c.b();
        }
        bVar2.b(queryParameter2);
        b bVar3 = this.c;
        String queryParameter3 = data.getQueryParameter(PARAMS_NAMESPACE);
        if (queryParameter3 == null) {
            queryParameter3 = this.c.c();
        }
        bVar3.c(queryParameter3);
        b bVar4 = this.c;
        if (data.getQueryParameter(PARAMS_URL_BUSINESS_PARAMS) != null) {
            d2 = JSONObject.parseObject(data.getQueryParameter(PARAMS_URL_BUSINESS_PARAMS));
            q.b(d2, "JSONObject.parseObject(u…AMS_URL_BUSINESS_PARAMS))");
        } else {
            d2 = this.c.d();
        }
        bVar4.a(d2);
        c cVar = this.d;
        String queryParameter4 = data.getQueryParameter("name");
        if (queryParameter4 == null) {
            queryParameter4 = this.d.a();
        }
        cVar.a(queryParameter4);
        c cVar2 = this.d;
        String queryParameter5 = data.getQueryParameter("version");
        if (queryParameter5 == null) {
            queryParameter5 = String.valueOf(this.d.b());
        }
        cVar2.a(Long.parseLong(queryParameter5));
        c cVar3 = this.d;
        String queryParameter6 = data.getQueryParameter("url");
        if (queryParameter6 == null) {
            queryParameter6 = this.d.c();
        }
        cVar3.b(queryParameter6);
        e eVar = this.e;
        String queryParameter7 = data.getQueryParameter(PARAMS_SHOW_STATUS_BAR);
        if (queryParameter7 == null) {
            queryParameter7 = "false";
        }
        eVar.a(Boolean.parseBoolean(queryParameter7));
        e eVar2 = this.e;
        String queryParameter8 = data.getQueryParameter(PARAMS_SHOW_ACTION_BAR);
        if (queryParameter8 == null) {
            queryParameter8 = "false";
        }
        eVar2.b(Boolean.parseBoolean(queryParameter8));
        d dVar = this.f;
        String queryParameter9 = data.getQueryParameter("pageName");
        if (queryParameter9 == null) {
            queryParameter9 = this.f.a();
        }
        dVar.a(queryParameter9);
        d dVar2 = this.f;
        String queryParameter10 = data.getQueryParameter("spm");
        if (queryParameter10 == null) {
            queryParameter10 = this.f.b();
        }
        dVar2.b(queryParameter10);
        Set<String> queryParameterNames = data.getQueryParameterNames();
        q.b(queryParameterNames, "uri.queryParameterNames");
        for (String it : queryParameterNames) {
            Map<String, String> c2 = this.f.c();
            q.b(it, "it");
            String queryParameter11 = data.getQueryParameter(it);
            if (queryParameter11 == null) {
                queryParameter11 = "";
            }
            c2.put(it, queryParameter11);
        }
        return true;
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageName(this, str);
    }

    private final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageProperties(this, map);
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ogg.a("DxContainerActivity", "onResume");
        super.onResume();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ogg.a("DxContainerActivity", "onPause");
        super.onPause();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ogg.a("DxContainerActivity", "onStart");
        super.onStart();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ogg.a("DxContainerActivity", MessageID.onStop);
        super.onStop();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ogg.a("DxContainerActivity", MessageID.onDestroy);
        super.onDestroy();
        com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(1);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            oec.a((Runnable) new f(), true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$DxBusinessParams;", "", "()V", "bizType", "", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", PopConst.BRIDGE_KEY_BUSINESS_ID, "getBusinessID", "setBusinessID", DxContainerActivity.PARAMS_NAMESPACE, "getNameSpace", "setNameSpace", DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, "Lcom/alibaba/fastjson/JSONObject;", "getUrlParams", "()Lcom/alibaba/fastjson/JSONObject;", "setUrlParams", "(Lcom/alibaba/fastjson/JSONObject;)V", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20234a = "";
        private String b = "";
        private String c = "";
        private JSONObject d = new JSONObject();

        static {
            kge.a(711967078);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f20234a;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.f20234a = str;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.b = str;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.c = str;
        }

        public final void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            q.d(jSONObject, "<set-?>");
            this.d = jSONObject;
        }

        public final JSONObject d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$PageParams;", "", "()V", "pageName", "", com.taobao.android.tbabilitykit.t.API_GET_PAGE_NAME, "()Ljava/lang/String;", "setPageName", "(Ljava/lang/String;)V", "pageProperties", "", "getPageProperties", "()Ljava/util/Map;", "setPageProperties", "(Ljava/util/Map;)V", "pageSpm", "getPageSpm", "setPageSpm", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20236a = "";
        private String b = "";
        private Map<String, String> c = new LinkedHashMap();

        static {
            kge.a(-2085998527);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f20236a;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.f20236a = str;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.b = str;
        }

        public final Map<String, String> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$DxRenderParams;", "", "()V", "dxTemplateName", "", "getDxTemplateName", "()Ljava/lang/String;", "setDxTemplateName", "(Ljava/lang/String;)V", "dxTemplateUrl", "getDxTemplateUrl", "setDxTemplateUrl", "dxTemplateVersion", "", "getDxTemplateVersion", "()J", "setDxTemplateVersion", "(J)V", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        /* renamed from: a  reason: collision with root package name */
        private String f20235a = "";
        private String c = "";

        static {
            kge.a(-462288196);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f20235a;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.f20235a = str;
        }

        public final void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public final long b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.c = str;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$ViewParams;", "", "()V", DxContainerActivity.PARAMS_SHOW_ACTION_BAR, "", "getShowActionBar", "()Z", "setShowActionBar", "(Z)V", DxContainerActivity.PARAMS_SHOW_STATUS_BAR, "getShowStatusBar", "setShowStatusBar", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f20237a;
        private boolean b;

        static {
            kge.a(-940302377);
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f20237a = z;
            }
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f20237a;
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$Companion;", "", "()V", "MSG_DELAY_ONPAUSE", "", "MSG_TIMEOUT_REFRESH", "PARAMS_BIZ_TYPE", "", "PARAMS_NAME", "PARAMS_NAMESPACE", "PARAMS_PAGE_NAME", "PARAMS_PAGE_SPM", "PARAMS_SHOW_ACTION_BAR", "PARAMS_SHOW_STATUS_BAR", "PARAMS_URL", "PARAMS_URL_BUSINESS_PARAMS", "PARAMS_VERSION", "PARAM_BUSINESS_ID", RPCDataItems.SWITCH_TAG_LOG, "sPAUSE_TIMEOUT", "sTIME_OUT", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1518306752);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
