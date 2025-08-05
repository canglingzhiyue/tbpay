package com.taobao.themis.taobao.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.extra.launch.WVOptimizedStartup;
import android.widget.Toast;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.browser.utils.i;
import com.taobao.monitor.procedure.s;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.TMSActivity;
import com.taobao.themis.external.embed.CardPreviewActivity;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.g;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.taobao.themis.utils.o;
import com.taobao.themis.widget.group.WidgetPreviewActivity;
import com.ut.device.UTDevice;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpo;
import tb.qpt;
import tb.qpv;
import tb.sfv;
import tb.tme;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0003J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/taobao/impl/TMS;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "asyncExecuteDoPrefetch", "", "uri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "asyncExecuteSDK", "pauseTask", "type", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "prefetch", "ssrPrerender", "", "previewEmbed", "previewWidgetGroup", "startApp", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "navContext", "Lcom/taobao/android/nav/NavContext;", "solutionType", "startAppByActivity", "startAppByNavActivity", "startAppByTBFragment", "startClearCache", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMS {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TMS INSTANCE;
    private static final String TAG = "TMS";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22856a;
        public final /* synthetic */ TMSSolutionType b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public a(String str, boolean z, TMSSolutionType tMSSolutionType, String str2) {
            this.f22856a = str;
            this.d = z;
            this.b = tMSSolutionType;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sfv appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f22856a);
            if (appInfoSync == null) {
                return;
            }
            if (!appInfoSync.c() || appInfoSync.a() == null) {
                str = "Nav not prefetch HTML (AppInfo remote)";
            } else if (n.aI() || this.d || appInfoSync.b() == AppInfoStrategy.LOCAL_LOAD) {
                AppModel appInfo = appInfoSync.a();
                if (this.b != TMSSolutionType.MIX) {
                    return;
                }
                TMSSolutionType tMSSolutionType = this.b;
                q.b(appInfo, "appInfo");
                TBTMSColdLaunchTask.preloadHTMLResource(tMSSolutionType, new TMSMetaInfoWrapper(appInfo), this.c, this.d);
                return;
            } else {
                str = "AppInfo.strategy != LOCAL_LOAD";
            }
            TMSLogger.d(TMS.TAG, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.kernel.metaInfo.appinfo.a.a().b();
            AppManifestManager.INSTANCE.a();
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.taobao.themis.taobao.impl.TMS.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(b.this.b, R.string.triver_clear_cache, 0).show();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22858a;

        public c(Context context) {
            this.f22858a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSSDK.initTBTMS(this.f22858a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f22859a;

        public d(Uri uri) {
            this.f22859a = uri;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tme tmeVar = tme.INSTANCE;
            String uri = this.f22859a.toString();
            q.b(uri, "uri.toString()");
            tmeVar.a(uri);
        }
    }

    static {
        kge.a(-1427286410);
        INSTANCE = new TMS();
    }

    private TMS() {
    }

    public final boolean startApp(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9618c4b", new Object[]{this, uri, context})).booleanValue();
        }
        q.d(uri, "uri");
        q.d(context, "context");
        try {
            TMSLogger.d(TAG, "startApp: " + uri);
            Context applicationContext = context.getApplicationContext();
            q.b(applicationContext, "context.applicationContext");
            asyncExecuteSDK(applicationContext);
            String uri2 = uri.toString();
            q.b(uri2, "uri.toString()");
            qpv.a(uri2);
            if (uri.getBooleanQueryParameter("isWidgetGroup", false)) {
                Intent intent = new Intent(context, WidgetPreviewActivity.class);
                intent.putExtra("oriUrl", uri.toString());
                context.startActivity(intent);
                return true;
            } else if (uri.getBooleanQueryParameter("tms_embed_preview", false)) {
                Intent intent2 = new Intent(context, CardPreviewActivity.class);
                intent2.putExtra("oriUrl", uri.toString());
                context.startActivity(intent2);
                return true;
            } else if (m.d(uri)) {
                startClearCache(uri, context);
                return true;
            } else {
                prefetch$default(this, uri, false, 2, null);
                startAppByActivity(uri, context);
                return true;
            }
        } catch (Throwable th) {
            TMSLogger.b(TAG, "themis container start fail", th);
            return false;
        }
    }

    @JvmStatic
    private static final void asyncExecuteDoPrefetch(Uri uri, Context context) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafb8ac3", new Object[]{uri, context});
        } else if (t.b(context, "enableAsyncInitTask").c()) {
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
                return;
            }
            executor.execute(new d(uri));
        } else {
            tme tmeVar = tme.INSTANCE;
            String uri2 = uri.toString();
            q.b(uri2, "uri.toString()");
            tmeVar.a(uri2);
        }
    }

    @JvmStatic
    private static final void asyncExecuteSDK(Context context) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942cf0a0", new Object[]{context});
        } else if (t.b(context, "enableAsyncInitTask").c()) {
            qpo.d(context);
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
                return;
            }
            executor.execute(new c(context));
        } else {
            TBTMSSDK.initTBTMS(context);
        }
    }

    public static /* synthetic */ boolean startApp$default(Intent intent, com.taobao.android.nav.d dVar, TMSSolutionType tMSSolutionType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e2d015f", new Object[]{intent, dVar, tMSSolutionType, new Integer(i), obj})).booleanValue();
        }
        if ((i & 4) != 0) {
            tMSSolutionType = null;
        }
        return startApp(intent, dVar, tMSSolutionType);
    }

    @JvmStatic
    public static final boolean startApp(Intent intent, com.taobao.android.nav.d navContext, TMSSolutionType tMSSolutionType) {
        int i;
        Bundle extras;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d525245", new Object[]{intent, navContext, tMSSolutionType})).booleanValue();
        }
        q.d(intent, "intent");
        q.d(navContext, "navContext");
        Uri uri = null;
        if (tMSSolutionType == TMSSolutionType.WEB_SINGLE_PAGE && (extras = intent.getExtras()) != null && (string = extras.getString(i.URL_REFERER_ORIGIN)) != null) {
            try {
                uri = o.b(string);
            } catch (Exception e) {
                TMSLogger.b(TAG, "parse originalUrl fail: " + string + ' ', e);
            }
        }
        if (uri == null) {
            uri = intent.getData();
        }
        if (uri == null) {
            return false;
        }
        Context context = navContext.a();
        if (tMSSolutionType == null) {
            tMSSolutionType = TMSSolutionType.getType(intent.getData());
        }
        TMSLogger.d(TAG, "startApp: " + uri);
        if (tMSSolutionType != null) {
            TMS tms = INSTANCE;
            Context a2 = navContext.a();
            q.b(a2, "navContext.context");
            tms.pauseTask(tMSSolutionType, a2);
        }
        if (tMSSolutionType != null) {
            switch (f.$EnumSwitchMapping$0[tMSSolutionType.ordinal()]) {
                case 1:
                    String uri2 = uri.buildUpon().scheme("https").build().toString();
                    q.b(uri2, "uri.buildUpon().scheme(\"https\").build().toString()");
                    android.taobao.windvane.export.network.f.a(new Request.a().a(uri2).b("GET").a());
                    break;
                case 2:
                case 3:
                    try {
                        q.b(context, "context");
                        Context applicationContext = context.getApplicationContext();
                        q.b(applicationContext, "context.applicationContext");
                        asyncExecuteSDK(applicationContext);
                    } catch (Throwable th) {
                        TMSLogger.b(TAG, "themis init fail", th);
                    }
                    if (m.d(uri)) {
                        TMS tms2 = INSTANCE;
                        q.b(context, "context");
                        tms2.startClearCache(uri, context);
                        return true;
                    }
                    TMS tms3 = INSTANCE;
                    q.b(context, "context");
                    if (tms3.previewWidgetGroup(uri, context) || INSTANCE.previewEmbed(uri, context)) {
                        return true;
                    }
                    if (tMSSolutionType == TMSSolutionType.MIX && com.taobao.themis.taobao.utils.b.INSTANCE.a(context, uri)) {
                        return true;
                    }
                    prefetch$default(INSTANCE, uri, false, 2, null);
                    if (com.taobao.themis.utils.f.b(context)) {
                        Uri.Builder buildUpon = uri.buildUpon();
                        if (tMSSolutionType == TMSSolutionType.MINIGAME) {
                            String uri3 = uri.toString();
                            q.b(uri3, "uri.toString()");
                            if (!kotlin.text.n.b((CharSequence) uri3, (CharSequence) com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, false, 2, (Object) null)) {
                                buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
                            }
                        }
                        intent.setData(buildUpon.build());
                        break;
                    }
                    break;
                case 5:
                case 6:
                    try {
                        q.b(context, "context");
                        Context applicationContext2 = context.getApplicationContext();
                        q.b(applicationContext2, "context.applicationContext");
                        asyncExecuteSDK(applicationContext2);
                    } catch (Throwable th2) {
                        TMSLogger.b(TAG, "themis init fail", th2);
                    }
                    TMS tms4 = INSTANCE;
                    q.b(context, "context");
                    if (tms4.previewWidgetGroup(uri, context)) {
                        return true;
                    }
                    if (m.d(uri)) {
                        INSTANCE.startClearCache(uri, context);
                        return true;
                    }
                    break;
                case 7:
                    TMS tms5 = INSTANCE;
                    q.b(context, "context");
                    if (!tms5.previewEmbed(uri, context)) {
                        if (m.d(uri)) {
                            INSTANCE.startClearCache(uri, context);
                            return true;
                        }
                        asyncExecuteDoPrefetch(uri, context);
                        break;
                    } else {
                        return true;
                    }
            }
        }
        if (tMSSolutionType != null && ((i = f.$EnumSwitchMapping$1[tMSSolutionType.ordinal()]) == 1 || i == 2 || i == 3)) {
            try {
                Result.a aVar = Result.Companion;
                if (com.taobao.themis.kernel.utils.c.a(context)) {
                    q.b(context, "context");
                    WVOptimizedStartup.startup(new WVOptimizedStartup.Params((Application) context.getApplicationContext()));
                }
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th3));
            }
        } else {
            TMSLogger.d(TAG, "skip wvPreStartUp");
        }
        if ((context instanceof FragmentActivity) && com.taobao.tao.tbmainfragment.i.b(((FragmentActivity) context).getSupportFragmentManager()) && t.a(uri, context)) {
            INSTANCE.startAppByTBFragment(intent, navContext);
            return false;
        } else if (INSTANCE.startAppByNavActivity(uri, intent, navContext)) {
            return false;
        } else {
            TMS tms6 = INSTANCE;
            q.b(context, "context");
            tms6.startAppByActivity(uri, context);
            return true;
        }
    }

    private final void pauseTask(TMSSolutionType tMSSolutionType, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4625f1c", new Object[]{this, tMSSolutionType, context});
            return;
        }
        v b2 = t.b(context, "pauseAndRestartInitTask");
        q.b(b2, "TMSABTestUtils.getExperi…pauseAndRestartInitTask\")");
        s sVar = s.f18233a;
        q.b(sVar, "ProcedureManagerProxy.PROXY");
        sVar.d().a("pauseAndRestartInitTask", b2.a());
        if (!b2.b()) {
            return;
        }
        if (tMSSolutionType != TMSSolutionType.WEEX && com.taobao.themis.inside.Initializer.a.a().get() != 1) {
            com.taobao.themis.inside.Initializer.a.a().set(0);
        }
        if (tMSSolutionType != TMSSolutionType.WEEX && com.taobao.themis.inside.Initializer.a.d().get() != 1) {
            com.taobao.themis.inside.Initializer.a.d().set(0);
        }
        if (com.taobao.themis.inside.Initializer.a.b().get() != 1) {
            com.taobao.themis.inside.Initializer.a.b().set(0);
        }
        if (com.taobao.themis.inside.Initializer.a.c().get() == 1) {
            return;
        }
        com.taobao.themis.inside.Initializer.a.c().set(0);
    }

    private final void startClearCache(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d871f", new Object[]{this, uri, context});
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.IO).execute(new b(context));
        }
    }

    private final void startAppByTBFragment(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77f402", new Object[]{this, intent, dVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_JUMP, "true");
        bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_NAME, "com.taobao.themis.taobao.container.fragment.TMSTBHomeFragment");
        intent.putExtra(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_BUNDLE, bundle);
        String d2 = g.d();
        String str = d2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            intent.setData(o.b(d2));
        }
        String str2 = UTDevice.getUtdid(dVar.a()) + '_' + System.currentTimeMillis();
        intent.putExtra("oriUrl", String.valueOf(intent.getData()));
        intent.putExtra("traceId", str2);
        Context a2 = dVar.a();
        q.b(a2, "navContext.context");
        dVar.a(a2.getPackageName());
        dVar.b(TMSActivity.class.getName());
        dVar.c(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
        qpv.b(String.valueOf(intent.getData()), str2);
    }

    private final void startAppByActivity(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f78f7ad", new Object[]{this, uri, context});
        } else if (com.taobao.themis.utils.f.b(context)) {
            TMSSolutionType type = TMSSolutionType.getType(uri);
            Uri.Builder buildUpon = uri.buildUpon();
            if (type == TMSSolutionType.MINIGAME) {
                String uri2 = uri.toString();
                q.b(uri2, "uri.toString()");
                if (!kotlin.text.n.b((CharSequence) uri2, (CharSequence) com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, false, 2, (Object) null)) {
                    buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("oriUrl", uri.toString());
            bundle.putBoolean("disableHook", true);
            Nav.from(context).withClassName(context.getPackageName(), TMSActivity.class.getName()).withExtras(bundle).toUri(buildUpon.build());
        } else {
            Intent intent = new Intent(context, TMSActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(uri);
            intent.putExtra("oriUrl", uri.toString());
            context.startActivity(intent);
        }
    }

    private final boolean startAppByNavActivity(Uri uri, Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78917b8f", new Object[]{this, uri, intent, dVar})).booleanValue();
        }
        if (intent.getStringExtra("oriUrl") == null) {
            intent.putExtra("oriUrl", uri.toString());
        }
        Context a2 = dVar.a();
        q.b(a2, "navContext.context");
        dVar.a(a2.getPackageName());
        dVar.b(TMSActivity.class.getName());
        Context a3 = dVar.a();
        q.b(a3, "navContext.context");
        intent.setPackage(a3.getPackageName());
        intent.setClassName(dVar.a(), TMSActivity.class.getName());
        return true;
    }

    public static /* synthetic */ void prefetch$default(TMS tms, Uri uri, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0081842", new Object[]{tms, uri, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        tms.prefetch(uri, z);
    }

    public final void prefetch(Uri uri, boolean z) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292875eb", new Object[]{this, uri, new Boolean(z)});
            return;
        }
        q.d(uri, "uri");
        TMSSolutionType type = TMSSolutionType.getType(uri);
        String queryParameter = uri.getQueryParameter(com.taobao.themis.kernel.i.APP_ID);
        if (queryParameter == null) {
            return;
        }
        String uri2 = uri.toString();
        q.b(uri2, "uri.toString()");
        TMSLogger.a(TAG, "Nav prefetch AppInfo " + queryParameter);
        AppInfoPrefetchJob.prefetchAppInfo$default(queryParameter, uri2, false, 4, null);
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
            return;
        }
        executor.execute(new a(queryParameter, z, type, uri2));
    }

    private final boolean previewWidgetGroup(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf31c9f", new Object[]{this, uri, context})).booleanValue();
        }
        if (!uri.getBooleanQueryParameter("isWidgetGroup", false)) {
            return false;
        }
        Intent intent = new Intent(context, WidgetPreviewActivity.class);
        intent.putExtra("oriUrl", uri.toString());
        context.startActivity(intent);
        return true;
    }

    private final boolean previewEmbed(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a5ea5d", new Object[]{this, uri, context})).booleanValue();
        }
        if (!uri.getBooleanQueryParameter("tms_embed_preview", false)) {
            return false;
        }
        Intent intent = new Intent(context, CardPreviewActivity.class);
        intent.putExtra("oriUrl", uri.toString());
        context.startActivity(intent);
        return true;
    }
}
