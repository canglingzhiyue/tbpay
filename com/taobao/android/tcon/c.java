package com.taobao.android.tcon;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.motu.tbrest.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!StringUtils.equals(LauncherRuntime.c, LauncherRuntime.b) || ABGlobal.isFeatureOpened(null, "disable_ut_pre_track")) {
        } else {
            try {
                if (d.a().f3151a == null || d.a().c == null) {
                    Log.e("DAUPreTrack", "you need init rest send service");
                }
                HashMap hashMap2 = new HashMap();
                if (hashMap != null) {
                    hashMap2.put(com.taobao.tao.homepage.launcher.b.LAUNCHER_TYPE, hashMap.containsKey(com.taobao.tao.homepage.launcher.b.LAUNCHER_TYPE) ? String.valueOf(hashMap.get(com.taobao.tao.homepage.launcher.b.LAUNCHER_TYPE)) : "unknown");
                }
                d.a().b(null, System.currentTimeMillis(), BHRTaskConfigBase.TYPE_CONFIG_UT, 61004, "app_start", "", "", hashMap2);
            } catch (Exception e) {
                Log.e("DAUPreTrack", "adapter err", e);
            }
        }
    }
}
