package com.taobao.tab2interact.core.utils;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1558080580);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Tab2Interact", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, str4, null);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3946b965", new Object[]{str, str2, str3, str4, th});
            return;
        }
        if (th != null) {
            if (TextUtils.isEmpty(str4)) {
                str4 = "throwable=" + th.getMessage();
            } else {
                str4 = str4 + "，throwable=" + th.getMessage();
            }
        }
        AppMonitor.Alarm.commitFail("Tab2Interact", str, str4, str2, str3);
    }
}
