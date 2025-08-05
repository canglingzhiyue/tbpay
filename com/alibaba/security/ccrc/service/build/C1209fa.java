package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.fa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1209fa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            android.taobao.windvane.jsbridge.q.a("CCRCRiskService", (Class<? extends android.taobao.windvane.jsbridge.e>) C1215ha.class);
        } catch (Throwable th) {
            Logging.e("windVane", "register plugin fail", th);
        }
    }
}
