package com.taobao.alimama;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaAdInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-716147435);
        kge.a(1028243835);
    }

    public static synchronized void init(Application application, HashMap<String, Object> hashMap) {
        synchronized (AlimamaAdInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            } else {
                AlimamaAdvertising.instance().init(application, hashMap);
            }
        }
    }
}
