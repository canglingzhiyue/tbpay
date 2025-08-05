package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.lar;
import tb.ojd;

/* loaded from: classes8.dex */
public class q extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-746693746);
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        lar.a("PreCreateNativeView");
        if (com.taobao.homepage.utils.n.n().H() || com.taobao.homepage.utils.i.a()) {
            com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "preCreateNativeView");
            if (com.taobao.homepage.utils.n.n().g()) {
                ojd.a().a(3);
            } else {
                ojd.a().a(2);
            }
            ojd.a().b();
            ojd.a().c();
        }
        lar.b("PreCreateNativeView");
    }
}
