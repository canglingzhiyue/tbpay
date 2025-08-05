package com.taobao.update;

import android.preference.PreferenceManager;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureDynamicJSBridge;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.reu;
import tb.rfl;
import tb.rfm;
import tb.rfx;
import tb.rfy;
import tb.rgl;
import tb.rgn;
import tb.rgq;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<com.taobao.update.framework.d> f23418a = new ArrayList();
    private i b;

    static {
        kge.a(1329850622);
    }

    public static /* synthetic */ List a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7a740e22", new Object[]{gVar}) : gVar.f23418a;
    }

    public static /* synthetic */ void a(g gVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd706aad", new Object[]{gVar, bVar});
        } else {
            gVar.a(bVar);
        }
    }

    public g(final e eVar) {
        this.b = null;
        this.b = new i();
        if (eVar.config == null) {
            return;
        }
        final b bVar = eVar.config;
        if (!rfy.inited) {
            rfy.getInstance().init(bVar.application, bVar.group, bVar.ttid, bVar.isOutApk, new reu());
            this.f23418a.add(new rgl(bVar));
        }
        this.f23418a.add(new rfl());
        InstantPatchUpdater.instance().setStartFromBackground(!bVar.autoStart);
        rfy.getInstance().registerListener(rfx.HOTPATCH, InstantPatchUpdater.instance());
        this.f23418a.add(InstantPatchUpdater.instance());
        rfy.getInstance().registerListener(rfx.CPPINLINEPATCH, rfm.instance());
        this.f23418a.add(rfm.instance());
        this.f23418a.add(com.taobao.update.dynamicfeature.a.instance());
        if (eVar.apkUpdateEnabled) {
            this.f23418a.add(new com.taobao.update.apk.b());
        }
        i iVar = this.b;
        iVar.addTask("initcpuArch", iVar.getTasks().createTask(new Runnable() { // from class: com.taobao.update.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e("UpdateSDK", "init initcpuArch");
                g.a(g.this, bVar);
                c.getInstance().init(bVar);
                FeatureDynamicJSBridge.init();
                Log.e("UpdateSDK", "init initcpuArch done");
            }
        }, TimeUnit.SECONDS, 1L));
        i iVar2 = this.b;
        iVar2.addTask("initTask", iVar2.getTasks().createTask(new Runnable() { // from class: com.taobao.update.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (com.taobao.update.framework.d dVar : g.a(g.this)) {
                    try {
                        Log.e("UpdateSDK", "init updater:" + dVar.getClass().getName());
                        dVar.init(eVar.config.application);
                        Log.e("UpdateSDK", "init updater done:" + dVar.getClass().getName());
                    } catch (Exception e) {
                        Log.e("UpdateSDK", "init updater Exception:" + dVar.getClass().getName());
                        e.printStackTrace();
                    }
                }
            }
        }));
        this.b.idleRun();
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d488a3aa", new Object[]{this, bVar});
            return;
        }
        int currentRuntimeCpuArchValue = rgn.getCurrentRuntimeCpuArchValue(bVar.application);
        String versionName = rgq.getVersionName();
        if (PreferenceManager.getDefaultSharedPreferences(bVar.application).getInt(versionName.concat("_bit_runtime"), 0) != 0) {
            return;
        }
        AppMonitor.Counter.commit("update-sdk", "bit-runtime", currentRuntimeCpuArchValue);
        PreferenceManager.getDefaultSharedPreferences(bVar.application).edit().putInt(versionName.concat("_bit_runtime"), currentRuntimeCpuArchValue).apply();
    }

    public void init(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e580eef8", new Object[]{this, eVar});
            return;
        }
        if (eVar.checkUpdateOnStartUp) {
            rfy.getInstance().startUpdate(true, false);
        }
        new h().initSwitchConfig(eVar.config);
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("mtb_plugin", "true");
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        } else {
            UpdateRuntime.execute(new Runnable() { // from class: com.taobao.update.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (com.taobao.update.framework.d dVar : g.a(g.this)) {
                        dVar.onForeground();
                    }
                }
            });
        }
    }

    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        for (com.taobao.update.framework.d dVar : this.f23418a) {
            dVar.onBackground();
        }
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        for (com.taobao.update.framework.d dVar : this.f23418a) {
            dVar.onExit();
        }
    }
}
