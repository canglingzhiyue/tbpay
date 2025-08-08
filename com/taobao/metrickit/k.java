package com.taobao.metrickit;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.MetricKitPlugin;
import com.taobao.metrickit.context.a;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.i;
import com.taobao.metrickit.utils.b;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import tb.mki;
import tb.mkl;
import tb.mkn;
import tb.mkp;
import tb.mkr;
import tb.mkt;
import tb.mkv;
import tb.mla;
import tb.mlc;
import tb.mlw;
import tb.mlx;
import tb.mly;
import tb.mlz;
import tb.mmd;
import tb.mmf;
import tb.mmg;
import tb.mmh;
import tb.mmi;
import tb.mmj;
import tb.mmk;
import tb.mml;
import tb.mmm;
import tb.mmo;
import tb.mmp;
import tb.mqe;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: lambda$FXIFUbAVWbXZWmuRMw-S2ykxSko */
    public static /* synthetic */ void m1161lambda$FXIFUbAVWbXZWmuRMwS2ykxSko(Application application, HashMap hashMap, Handler handler) {
        a(application, hashMap, handler);
    }

    public static void a(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        final Handler handler = new Handler(a.a().b().getLooper());
        com.taobao.metrickit.context.c.a(application);
        b.a(application);
        handler.post(new Runnable() { // from class: com.taobao.metrickit.-$$Lambda$k$FXIFUbAVWbXZWmuRMw-S2ykxSko
            @Override // java.lang.Runnable
            public final void run() {
                k.m1161lambda$FXIFUbAVWbXZWmuRMwS2ykxSko(application, hashMap, handler);
            }
        });
    }

    public static /* synthetic */ void a(Application application, HashMap hashMap, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e2d20c", new Object[]{application, hashMap, handler});
            return;
        }
        long a2 = mlz.a(application);
        int b = mlz.b(application);
        mlx.a(hashMap);
        a();
        MetricContext a3 = a(application, handler, hashMap);
        a(application, a2);
        a(application, a3);
        a(application);
        b();
        a(application, a3, a2, b);
        d.a(application);
        d.a(application, a3, a2, b);
        EventCenter.a().a(a3);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            q.a(MetricKitPlugin.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) MetricKitPlugin.class, false);
        } catch (Exception e) {
            TLog.loge("MetricKit", "请检查是否缺少WindVane依赖", e);
        }
    }

    private static MetricContext a(Application application, Handler handler, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetricContext) ipChange.ipc$dispatch("8b2a4396", new Object[]{application, handler, hashMap}) : new MetricContext.a().a(application).a(new com.taobao.metrickit.context.b()).a(handler).a(EventCenter.a()).a(hashMap.get("launchStartTime")).a();
    }

    private static void a(Application application, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e8f62d", new Object[]{application, new Long(j)});
            return;
        }
        mlw mlwVar = null;
        if (j != -1) {
            mlwVar = new mlw(application, mlw.KEY_PATH_SAVE_TYPE, j);
            mlwVar.c().a(mlz.a((Context) application).getAll()).a();
        }
        mlz.a((Context) application).edit().clear().commit();
        String str = "from";
        if (StringUtils.equals(com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.CONFIG_SP_AREA, str), str)) {
            str = "to";
        }
        Map<String, ?> all = application.getSharedPreferences(mlz.SP_NAME_PREFIX + str, 0).getAll();
        if (all != null && all.size() > 0) {
            application.getSharedPreferences(mlz.SP_NAME_PREFIX + str, 0).edit().clear().commit();
        }
        if (mlwVar == null) {
            return;
        }
        mlwVar.c().a(all).a();
    }

    private static void a(Application application, MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef00c7a3", new Object[]{application, metricContext});
            return;
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_APP_TIME_METRIC)) {
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_APP_TIME_METRIC, new mmp(metricContext, new mlz(application, "applicationTimeMetrics"), new mla()));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_MEMORY_METRIC)) {
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_MEMORY_METRIC, new mml(metricContext, new mlz(application, "memoryMetrics"), new mlz(application, "gcMetrics"), new mkt(application)));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_REACHABILITY_OBJECT_METRIC)) {
            mkv mkvVar = new mkv(metricContext.getDefaultInnerHandler());
            m.a().a(mkvVar);
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_REACHABILITY_OBJECT_METRIC, new mmk(metricContext, new mlz(application, "gcMetrics"), mkvVar));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_CPU_LOAD_METRIC)) {
            final mkr mkrVar = new mkr(application.getPackageName(), metricContext.getDefaultInnerHandler());
            f.a(new n<String, Integer, Void>() { // from class: com.taobao.metrickit.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.metrickit.n
                public Void a(String str, Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("b106d958", new Object[]{this, str, num});
                    }
                    mkrVar.a(str, num.intValue());
                    return null;
                }
            });
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_CPU_LOAD_METRIC, new mmj(metricContext, new mlz(application, "cpuMetrics"), mkrVar));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_CPU_LOAD_ABNORMAL_METRIC)) {
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_CPU_LOAD_ABNORMAL_METRIC, new mmi(metricContext, new mlz(application, "cpuMetrics"), new mkp(application, metricContext.getDefaultInnerHandler())));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_BLOCK_STACK_METRIC)) {
            mkn.a(mqe.a(com.taobao.metrickit.utils.c.a("/data/local/tmp/.apm/.blockTriggerDuration"), mkn.d()));
            mkn.b(mqe.a(com.taobao.metrickit.utils.c.a("/data/local/tmp/.apm/.blockObserverDuration"), mkn.e()));
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_BLOCK_STACK_METRIC, new mmm(metricContext, new mkn(application, metricContext.getDefaultInnerHandler())));
        }
        if (Build.VERSION.SDK_INT >= 21 && com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_POWER_CONSUME_METRIC)) {
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_POWER_CONSUME_METRIC, new mmg(metricContext, new mlz(application, "batteryMetrics"), new mkl(application)));
        }
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_BATTERY_HARDWARE_STAT_METRIC)) {
            mmd.a().a(com.taobao.metrickit.context.c.SWITCH_BATTERY_HARDWARE_STAT_METRIC, new mmf(metricContext, new mlz(application, "batteryMetrics"), new mki()));
        }
        if (!com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_POWER_SAVE_MODE_METRIC)) {
            return;
        }
        mmd.a().a(com.taobao.metrickit.context.c.SWITCH_POWER_SAVE_MODE_METRIC, new mmh(metricContext, new mlz(application, "metaData"), new mki()));
    }

    private static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            j.a(new n<String, String, Void>() { // from class: com.taobao.metrickit.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public final mly f18093a;

                {
                    this.f18093a = new mlw(application, "metaData", mly.LAUNCH_SESSION);
                }

                @Override // com.taobao.metrickit.n
                public Void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("f4171c01", new Object[]{this, str, str2});
                    }
                    this.f18093a.c().a(str, str2).a();
                    return null;
                }
            });
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            i.a(new i.b() { // from class: com.taobao.metrickit.k.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.metrickit.i.b
                public void a(int i, i.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("25002660", new Object[]{this, new Integer(i), aVar});
                    } else {
                        EventCenter.a().a(i, aVar);
                    }
                }
            });
        }
    }

    private static void a(Application application, MetricContext metricContext, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fc3fa2", new Object[]{application, metricContext, new Long(j), new Integer(i)});
            return;
        }
        File file = new File(mlw.a(application) + mlw.b(mly.SIMPLE_DATE_FORMAT.format(new Date()), j));
        if (Build.VERSION.SDK_INT < 30 || !com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_APP_EXIT_METRIC) || j == -1 || !file.exists()) {
            return;
        }
        mmd.a().a(com.taobao.metrickit.context.c.SWITCH_APP_EXIT_METRIC, new mmo(metricContext, new mlw(application, "applicationExitMetrics", j), new mlc(application, i)));
    }
}
