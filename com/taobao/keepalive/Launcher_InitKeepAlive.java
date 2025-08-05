package com.taobao.keepalive;

import android.app.Application;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kaq;
import tb.kat;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class Launcher_InitKeepAlive {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1477781901);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            kaq.a(application);
            AnalyticsMgr.a(application);
            String str = (String) hashMap.get("process");
            kat.a("keepalive", "full_verify", "Launcher_InitKeepAlive-" + str, mto.a.GEO_NOT_SUPPORT);
        } catch (Exception unused) {
        }
    }
}
