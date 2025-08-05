package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import tb.ihq;
import tb.ikq;

/* loaded from: classes6.dex */
public final class TaobaoRSoInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.c("TaobaoRSoInitializer.init(), start");
            String obj = ihq.c().toString();
            RSoLog.c("TaobaoRSoInitializer.init(), success" + obj);
        } catch (Throwable th) {
            ikq.a("TaobaoRSoInitializer.init()  error", th);
        }
    }
}
