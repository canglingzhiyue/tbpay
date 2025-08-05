package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.utils.t;
import com.taobao.weex.adapter.WXInitAdapter;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class LauncherInitWeexTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(200043697);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (t.b(application.getApplicationContext())) {
            TLog.loge("Weex", "Weex", "skip LauncherInitWeexTask");
        } else {
            TLog.loge("Weex", "Weex", "enter LauncherInitWeexTask");
            WXSDKManager.getInstance().setWXInitTaskAdapter(new WXInitAdapter());
        }
    }
}
