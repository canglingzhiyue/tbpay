package com.taobao.themis.kernel.utils;

import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import tb.als;
import tb.kge;
import tb.qpt;
import tb.qqb;
import tb.ruk;
import tb.suj;
import tb.thk;
import tb.thl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0006\u0010\u0011\u001a\u00020\b\u001a\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u001a\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000b\u001a\f\u0010 \u001a\u0004\u0018\u00010!*\u00020\u001e\u001a\f\u0010\"\u001a\u0004\u0018\u00010\u001d*\u00020\u001e\u001a\f\u0010#\u001a\u0004\u0018\u00010$*\u00020!\u001a\u0014\u0010%\u001a\u00020\u0013*\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0010\u001a\u0014\u0010(\u001a\u00020\u0013*\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0010\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "uiHandler", "checkInMainThread", "", "getAsyncHandler", "getRealPxByWidth", "", "pxValue", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, com.taobao.android.detail2.core.framework.data.model.d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "getUserAgent", "", "isDebugMode", "removeMainThreadCallbacks", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_block, "Lkotlin/Function0;", "runnable", "Ljava/lang/Runnable;", "runInMainThread", "runInMainThreadDelay", "delayTime", "", "getPageByTabIndex", "Lcom/taobao/themis/kernel/page/ITMSPage;", "Lcom/alibaba/ability/env/IAbilityContext;", "tabIndex", "getTMSInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "getTMSPage", "rumPerformanceMonitor", "Lcom/taobao/themis/kernel/monitor/IRumPerformanceMonitor;", "showToastLong", "Landroid/content/Context;", "msg", "showToastShort", "themis_kernel_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f22568a;
    private static final kotlin.d b;

    private static final Handler d() {
        IpChange ipChange = $ipChange;
        return (Handler) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a41b85fb", new Object[0]) : b.getValue());
    }

    static {
        kge.a(-246849659);
        f22568a = new Handler(Looper.getMainLooper());
        b = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, CommonExtKt$handler$2.INSTANCE);
    }

    public static final void a(ruk<kotlin.t> block) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{block});
            return;
        }
        kotlin.jvm.internal.q.d(block, "block");
        if (kotlin.jvm.internal.q.a(Looper.getMainLooper(), Looper.myLooper())) {
            block.mo2427invoke();
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.UI)) == null) {
            return;
        }
        executor.execute(new b(block));
    }

    public static final Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[0]) : d();
    }

    public static final void a(Runnable runnable) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        kotlin.jvm.internal.q.d(runnable, "runnable");
        if (kotlin.jvm.internal.q.a(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.UI)) == null) {
            return;
        }
        executor.execute(runnable);
    }

    public static /* synthetic */ void a(ruk rukVar, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c7b22b", new Object[]{rukVar, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 32;
        }
        a(rukVar, j);
    }

    public static final void a(ruk<kotlin.t> block, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba399974", new Object[]{block, new Long(j)});
            return;
        }
        kotlin.jvm.internal.q.d(block, "block");
        f22568a.postDelayed(new b(block), j);
    }

    public static final void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
            return;
        }
        kotlin.jvm.internal.q.d(runnable, "runnable");
        f22568a.postDelayed(runnable, j);
    }

    public static final void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        kotlin.jvm.internal.q.d(runnable, "runnable");
        f22568a.removeCallbacks(runnable);
    }

    public static final int a(int i, int i2) {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return i2;
        }
        Resources resources = applicationContext.getResources();
        kotlin.jvm.internal.q.b(resources, "context.resources");
        return (i * resources.getDisplayMetrics().widthPixels) / 750;
    }

    public static final int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > 0) {
            return (i2 * i) / 750;
        }
        return a(i2, i3);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Object a2 = qpt.a(IEnvironmentService.class);
        kotlin.jvm.internal.q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        return Build.MODEL + "(Android/" + Build.VERSION.RELEASE + ") AliApp(TB/" + ((IEnvironmentService) a2).getAppVersion() + ") Ariver/1.0.13.6";
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        return com.taobao.themis.utils.f.a(iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null) || g.a();
    }

    public static final ITMSPage a(als getTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("db755651", new Object[]{getTMSPage});
        }
        kotlin.jvm.internal.q.d(getTMSPage, "$this$getTMSPage");
        IMegaAdapter iMegaAdapter = (IMegaAdapter) qpt.b(IMegaAdapter.class);
        if (iMegaAdapter == null) {
            return null;
        }
        return iMegaAdapter.getPageFromAbilityContext(getTMSPage);
    }

    public static final com.taobao.themis.kernel.f b(als getTMSInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("5204f64a", new Object[]{getTMSInstance});
        }
        kotlin.jvm.internal.q.d(getTMSInstance, "$this$getTMSInstance");
        ITMSPage a2 = a(getTMSInstance);
        if (a2 == null) {
            return null;
        }
        return a2.b();
    }

    public static final ITMSPage a(als getPageByTabIndex, int i) {
        qqb b2;
        ITMSPage b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8d01244e", new Object[]{getPageByTabIndex, new Integer(i)});
        }
        kotlin.jvm.internal.q.d(getPageByTabIndex, "$this$getPageByTabIndex");
        com.taobao.themis.kernel.f b4 = b(getPageByTabIndex);
        if (b4 == null || (b2 = b4.b()) == null || (b3 = b2.b(0)) == null) {
            return null;
        }
        suj sujVar = (suj) b3.a(suj.class);
        ITMSPage iTMSPage = null;
        if (sujVar != null) {
            return sujVar.a(i);
        }
        return i == 0 ? b3 : iTMSPage;
    }

    public static final thk a(com.taobao.themis.kernel.f rumPerformanceMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (thk) ipChange.ipc$dispatch("dd28be22", new Object[]{rumPerformanceMonitor});
        }
        kotlin.jvm.internal.q.d(rumPerformanceMonitor, "$this$rumPerformanceMonitor");
        return (thk) rumPerformanceMonitor.b(thl.class);
    }
}
