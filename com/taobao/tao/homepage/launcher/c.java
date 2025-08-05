package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.ook;

/* loaded from: classes.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(713294972);
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomeDinamicX2Launcher", 4);
        ook.b();
        this.f20600a.b("HomeDinamicX2Launcher");
    }
}
