package com.taobao.android.preload;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14683a;

    static {
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            f14683a = true;
        } catch (ClassNotFoundException e) {
            f14683a = false;
            e.printStackTrace();
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f14683a;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!a()) {
        } else {
            AdapterForTLog.loge("Preload_Core", str + "|" + str2 + "|" + str3);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (!a()) {
        } else {
            AdapterForTLog.loge("Preload_Core", str + "|" + str2 + "|" + str3);
        }
    }
}
