package com.taobao.runtimepermission;

import android.app.Application;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.runtimepermission.config.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        q.a("TBRunTimePermission", (Class<? extends android.taobao.windvane.jsbridge.e>) TBRunTimePermission.class);
        a.a().a(application);
    }
}
