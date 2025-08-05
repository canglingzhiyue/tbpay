package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.lap;

/* loaded from: classes.dex */
public class k extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-582506752);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
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
        this.f20600a.a("HomePrepareParamsLauncher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomePrepareParamsLauncher", "HomePrepareParamsLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        com.taobao.tao.topmultitab.c.a();
        this.f20600a.b("HomePrepareParamsLauncher");
    }
}
