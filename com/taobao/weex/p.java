package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import tb.kge;
import tb.rtc;

/* loaded from: classes9.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f23514a;

    static {
        kge.a(1288854144);
        f23514a = -1L;
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        WXLogUtils.e("weex", "enter LauncherInitWeexIdle");
        if (com.taobao.android.weex_framework.util.f.k()) {
            com.taobao.android.weex_framework.util.g.b("weex", "prefetch warmUpDefaultFont");
            rtc.a().c().b();
            f23514a = System.currentTimeMillis();
        }
        WXSDKManager.getInstance().setInitListener(new WXSDKManager.a() { // from class: com.taobao.weex.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.WXSDKManager.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.weex.WXSDKManager.a
            public void onInitSuccess() {
                try {
                    Class.forName("com.taobao.weex.InitWeexIdleTask").getMethod("doInit", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable th) {
                    WXLogUtils.e("LauncherInitWeexIdle", th);
                }
            }
        });
    }
}
