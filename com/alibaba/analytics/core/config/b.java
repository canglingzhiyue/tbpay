package com.alibaba.analytics.core.config;

import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aob;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class b implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "sw_plugin";

    static {
        kge.a(1365312499);
        kge.a(-2114741388);
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!KEY.equalsIgnoreCase(str)) {
        } else {
            try {
                z = Boolean.parseBoolean(str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!z) {
                return;
            }
            aob.a().b();
        }
    }
}
