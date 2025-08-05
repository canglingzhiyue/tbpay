package com.taobao.tao.homepage.launcher;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.krv;
import tb.lap;
import tb.lar;
import tb.oqc;
import tb.qnl;

/* loaded from: classes.dex */
public class j extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(377551929);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        com.taobao.monitor.procedure.s.f18233a.d().a("preRequestStart", Long.valueOf(SystemClock.uptimeMillis()));
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomePreRequestLauncher", "HomePreRequestLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        com.taobao.monitor.procedure.s.f18233a.d().a("SecondRefreshOpt", Boolean.valueOf(com.taobao.homepage.utils.i.a()));
        if (!com.taobao.homepage.utils.n.n().o() && !b(hashMap)) {
            lar.g("doHomeColdStartReq");
            a();
            lar.h("doHomeColdStartReq");
        }
        if (com.taobao.homepage.utils.n.o() && !com.taobao.homepage.utils.n.n().o()) {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.homepage.launcher.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    j.this.f20600a.a("locationChangeReqPrepareParams", 2);
                    new com.taobao.homepage.view.manager.f().a(application);
                    j.this.f20600a.b("locationChangeReqPrepareParams");
                }
            });
        }
        lap.a("LauncherTask", "HomePreRequestLauncher", "HomePreRequestLauncher.init; 冷启发mtop请求");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f20600a.d("mtopRequestBefore");
        this.f20600a.a("mtopRequestParams", 1);
        this.f20600a.a("coldStartReqPrepareParams", 2);
        krv.a(krv.STAGE_START_COLD_START_TASK);
        com.taobao.homepage.utils.i.a(true);
        oqc.a().e();
        this.f20600a.b("coldStartReqPrepareParams");
    }

    private boolean b(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("616d4b2e", new Object[]{this, hashMap})).booleanValue();
        }
        if (!hashMap.containsKey("linkLaunch") || !hashMap.containsKey("startIntent")) {
            return false;
        }
        Object obj = hashMap.get("linkLaunch");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        Object obj2 = hashMap.get("startIntent");
        if (!(obj2 instanceof String)) {
            return false;
        }
        String str = (String) obj2;
        if (!(str.contains("recmdparams") && str.contains("up_nids")) || com.taobao.homepage.utils.n.n().b()) {
            z = false;
        }
        qnl.f32961a = z;
        return z;
    }
}
