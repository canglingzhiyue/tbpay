package com.taobao.themis.taobao.impl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.canvas.TMSGameSolution;
import com.taobao.themis.inside.TMSSDK;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.taobao.themis.mix.TMSTinyAppSolution;
import com.taobao.themis.weex.solution.TMSLegacyWeexSolution;
import com.taobao.themis.widget.TMSWidgetSolution;
import com.taobao.themis.widget.group.TMSWidgetIsomorphicSolution;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class TBTMSSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean isInitialized;

    static {
        kge.a(1804115154);
        kge.a(1028243835);
        isInitialized = false;
    }

    public static void initTBTMS(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5c30fc", new Object[]{application});
        } else {
            initTBTMS(application.getApplicationContext());
        }
    }

    public static void initTBTMS(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b425e5", new Object[]{context});
        } else {
            initTBTMS(context, true);
        }
    }

    public static void initTBTMS(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d1498f", new Object[]{context, new Boolean(z)});
            return;
        }
        TMSLogger.d("TBTMSSDK", "try init");
        if (t.b(context)) {
            TMSLogger.d("initTBTMSNew", "try init");
            initTBTMSNew(context);
            return;
        }
        TMSSDK.init(context);
        registerSolution();
        if (isInitialized) {
            return;
        }
        TMSLogger.d("TBTMSSDK", "init");
        isInitialized = true;
        v a2 = t.a(context, "enableAsyncExecuteTask", "[0,98],[99,100]");
        if (!a2.b()) {
            com.taobao.themis.taobao.utils.a.a();
        }
        s.f18233a.d().a("enableAsyncExecuteTask", a2.a());
        com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.a();
        if (z) {
            com.taobao.themis.kernel.preload.a.a();
            com.taobao.themis.kernel.preload.b.a();
            return;
        }
        Log.e("极简链路", "不执行 Themis 的预加载任务");
    }

    private static void registerSolution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7d13c3", new Object[0]);
            return;
        }
        com.taobao.themis.kernel.solution.b.a(TMSSolutionType.MIX, TMSTinyAppSolution.class);
        com.taobao.themis.kernel.solution.b.a(TMSSolutionType.WIDGET, TMSWidgetSolution.class);
        com.taobao.themis.kernel.solution.b.a(TMSSolutionType.CLUSTER_WIDGET, TMSWidgetIsomorphicSolution.class);
        com.taobao.themis.kernel.solution.b.a(TMSSolutionType.MINIGAME, TMSGameSolution.class);
        com.taobao.themis.kernel.solution.b.a(TMSSolutionType.WEEX, TMSLegacyWeexSolution.class);
    }

    public static void initTBTMSNew(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdeec5d", new Object[]{context});
            return;
        }
        TMSLogger.d("TBTMSSDK", "try init new");
        TMSSDK.init(context);
        if (isInitialized) {
            return;
        }
        registerSolution();
        TMSLogger.d("TBTMSSDK", "init new");
        v b = t.b(context, "enableAsyncInitTask");
        if (!b.b()) {
            com.taobao.themis.taobao.utils.a.a();
        }
        s.f18233a.d().a("enableAsyncExecuteTask", b.a());
        isInitialized = true;
        com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.a();
    }
}
