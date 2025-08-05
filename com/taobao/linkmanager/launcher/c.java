package com.taobao.linkmanager.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1600326910);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "Launcher_InitHomePageTask === executeHomePageTask");
        if (!hashMap.containsKey("currentLocale") || Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"))) {
            z = true;
        }
        a.a(application, z);
    }
}
