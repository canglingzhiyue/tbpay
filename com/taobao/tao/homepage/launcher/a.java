package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.ktq;
import tb.lap;

/* loaded from: classes.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-907901946);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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
        this.f20600a.a("HomeAdvLauncher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeAdvLauncher", "HomeAdvLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        ktq.a(application);
        lap.a("LauncherTask", "HomeAdvLauncher", "HomeAdvLauncher.init;首页广告初始化");
        this.f20600a.b("HomeAdvLauncher");
    }
}
