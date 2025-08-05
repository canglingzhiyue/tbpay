package com.alibaba.analytics.core.config;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aqe;
import tb.kge;

/* loaded from: classes2.dex */
public class l extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1140753831);
    }

    @Override // com.alibaba.analytics.core.config.g
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            aqe.a().a(new Runnable() { // from class: com.alibaba.analytics.core.config.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.this.b();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
