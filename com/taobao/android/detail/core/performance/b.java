package com.taobao.android.detail.core.performance;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1697823382);
        emu.a("com.taobao.android.detail.core.performance.AsyncMtopLogTag");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "[DetailOpt][AsyncMtopLog]:" + str;
    }
}
