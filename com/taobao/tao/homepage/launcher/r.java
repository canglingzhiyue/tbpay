package com.taobao.tao.homepage.launcher;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.linklog.RecommendLinkLogAdapter;
import java.util.HashMap;
import tb.kge;
import tb.lap;
import tb.lar;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(582260449);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        lar.a("TopMultiTabManager");
        com.taobao.homepage.utils.i.a(application);
        com.taobao.tao.linklog.a.a(new RecommendLinkLogAdapter());
        com.taobao.android.home.component.utils.m.a().a(application);
        com.taobao.tao.topmultitab.c.a();
        lar.b("TopMultiTabManager");
        lap.a("LauncherTask", "HomePageFrameInitLauncher", "HomePageFrameInitLauncher init:" + (SystemClock.uptimeMillis() - uptimeMillis));
    }
}
