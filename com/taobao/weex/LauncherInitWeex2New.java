package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.taobao.weex2.AppWeexEngineAutoInit;
import com.taobao.weex.base.b;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class LauncherInitWeex2New implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(199012122);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (b.a(application)) {
            AppWeexEngineAutoInit.init(application);
        } else {
            MUSEngine.initApplicationAsync(application, null);
        }
    }
}
