package com.alibaba.analytics;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.lyc;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e("InitJTrack", "init error: application is null");
            }
            if (hashMap != null) {
                return;
            }
            Log.e("InitJTrack", "init error: params is null");
        } else {
            if (hashMap.get("isDebuggable") != null) {
                z = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            }
            if (z) {
                String str = "application:" + application + ",params:" + hashMap;
            }
            try {
                lyc.a(application);
                lyc.a.a("ut_page_android.csv");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
