package com.taobao.message.uikit.util;

import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.o;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ApmTraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isClose;

    static {
        kge.a(236480462);
        isClose = "1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "messageApmTrace", "0"));
    }

    public static void onSubTaskBegin(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4427372", new Object[]{fragment, str});
        } else if (isClose) {
        } else {
            s.f18233a.b(fragment).a(str);
        }
    }

    public static void onSubTaskSuccess(Fragment fragment, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8d032d", new Object[]{fragment, str, map});
        } else if (isClose) {
        } else {
            s.f18233a.b(fragment).e(str, map);
        }
    }

    public static String getPageSession(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9775fc06", new Object[]{fragment}) : o.f18229a.a(fragment).c();
    }

    public static void onSubTaskBegin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5191765e", new Object[]{str, str2});
        } else if (isClose) {
        } else {
            s.f18233a.a(str).a(str2);
        }
    }

    public static void onSubTaskSuccess(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d292274d", new Object[]{str, str2, map});
        } else if (isClose) {
        } else {
            s.f18233a.a(str).e(str2, map);
        }
    }
}
