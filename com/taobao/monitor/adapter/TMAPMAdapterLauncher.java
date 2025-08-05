package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class TMAPMAdapterLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        new TMAPMInitiator().init(application, hashMap);
        com.taobao.monitor.common.c.a(new Runnable() { // from class: com.taobao.monitor.adapter.TMAPMAdapterLauncher.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    new TBAPMAdapterLauncherPart2().init(application, hashMap);
                }
            }
        });
    }
}
