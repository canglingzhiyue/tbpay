package com.taobao.android.detail2.core.framework;

import android.app.Application;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.PreloadWindVanePlugin;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import tb.fig;
import tb.fjt;
import tb.fjw;
import tb.flp;
import tb.iyy;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-97062263);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        if (hashMap != null) {
            fig.b = fjw.a(hashMap.get("launchStartTime"), -1L);
            Number number = (Number) hashMap.get(OConstant.LAUNCH_ENVINDEX);
            if (number != null && (number.intValue() == 0 || number.intValue() == 1 || number.intValue() == 2)) {
                fig.k = number.intValue();
            }
        }
        new iyy().a();
        flp flpVar = new flp();
        flpVar.b();
        flpVar.a(application);
        flpVar.a();
        q.a(PreloadWindVanePlugin.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) PreloadWindVanePlugin.class);
        fjt.c("NewDetailLaunchTask", "init_task" + application + "," + hashMap);
    }
}
