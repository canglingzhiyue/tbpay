package com.taobao.android.revisionswitch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        TBRevisionSwitchManager.f14881a = ABGlobal.isFeatureOpened(application, "version_switch_opt");
        TBRevisionSwitchManager.i().a(application, hashMap);
    }
}
