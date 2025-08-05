package com.taobao.android.protodb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("PROTODB", "FailedToOpenDB", str2, str);
        }
    }
}
