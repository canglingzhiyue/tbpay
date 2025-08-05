package com.taobao.securityjni;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class DnameManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(669237883);
    }

    public static void RegisterName(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4bd98a", new Object[]{strArr});
        }
    }

    public static void StartDsAHick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a961d340", new Object[0]);
        }
    }
}
