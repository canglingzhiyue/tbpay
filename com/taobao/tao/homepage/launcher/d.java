package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.lap;

/* loaded from: classes.dex */
public class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1094159491);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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
        this.f20600a.a("HomeDinamicX3Launcher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeDinamicX3Launcher", "HomeDinamicX3Launcher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        com.taobao.tao.homepage.f.a();
        lap.a("LauncherTask", "HomeDinamicX3Launcher", "HomeDinamicX3Launcher.init; 首页dinamicX 3.0自定义控件初始化");
        this.f20600a.b("HomeDinamicX3Launcher");
    }
}
