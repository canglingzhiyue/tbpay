package com.alibaba.triver;

import android.app.Application;
import com.alibaba.triver.bundle.nav.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class TriverNavInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1403039763);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            Nav.registerPriorHooker(new d(), 3);
        }
    }
}
