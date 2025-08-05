package com.taobao.tao.homepage.launcher;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.gmq;
import tb.kge;
import tb.ktp;
import tb.lap;
import tb.laq;
import tb.oiy;

/* loaded from: classes.dex */
public class l extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1173835649);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
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
        this.f20600a.a("HomeSwitchLauncher", 4);
        this.f20600a.c(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START);
        com.taobao.tao.recommend3.tracelog.c.a(SystemClock.uptimeMillis());
        this.f20600a.a("homeLauncher", 1);
        laq.a().a("LauncherTask").b("HomeSwitchLauncher").c("HomeSwitchLauncher.init").c("首页开关启动初始化");
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeSwitchLauncher", "HomeSwitchLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        com.taobao.android.home.component.utils.c.a().a(application);
        if (com.taobao.homepage.utils.n.o()) {
            com.taobao.android.home.component.utils.c.a().b();
        }
        gmq.a(false);
        gmq.a("launcher", true);
        if (!com.taobao.homepage.utils.n.o()) {
            ktp.a();
        }
        oiy.a();
        this.f20600a.b("HomeSwitchLauncher");
    }
}
