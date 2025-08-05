package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.lap;
import tb.lar;
import tb.oqc;
import tb.seb;
import tb.sec;

/* loaded from: classes.dex */
public class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(248229655);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomeGatewayLauncher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeGatewayLauncher", "HomeGatewayLauncher.offline switcher on");
            return;
        }
        lar.a("initGateway");
        super.a(application, hashMap);
        oqc.a().a(application, oqc.j(), false);
        seb.a(new sec());
        lar.b("initGateway");
        lap.a("LauncherTask", "HomeGatewayLauncher", "HomeGatewayLauncher.init;网关2.0初始化");
        this.f20600a.b("HomeGatewayLauncher");
    }
}
