package com.alibaba.analytics;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e("InitUt4Aplus", "init error: application is null");
            }
            if (hashMap != null) {
                return;
            }
            Log.e("InitUt4Aplus", "init error: params is null");
        } else {
            if (hashMap.get("isDebuggable") != null) {
                z = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            }
            if (z) {
                String str = "application:" + application + ",params:" + hashMap;
            }
            try {
                com.alibaba.ut.e.a(application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
