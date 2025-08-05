package com.taobao.android.change.app.icon.biz;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(639041266);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        if (hashMap != null) {
            try {
                z = TextUtils.equals((String) hashMap.get("process"), "com.taobao.taobao");
            } catch (Throwable th) {
                th.printStackTrace();
                AdapterForTLog.loge(igc.TAG, "ChangeAppIconLauncher error", th);
                return;
            }
        }
        AdapterForTLog.loge(igc.TAG, "ChangeAppIconLauncher init isMainProcess:" + z);
        c.a(application, z);
    }
}
