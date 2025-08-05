package com.taobao.artc.utils;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int battery_perc;
    public static String brand;
    public static boolean is_tmall_cc;
    public static int temperature;

    /* renamed from: a  reason: collision with root package name */
    private Context f16380a;

    public static boolean isIPv6Only() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eab18368", new Object[0])).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-301387426);
        brand = Build.BRAND;
        is_tmall_cc = false;
    }

    public ArtcDeviceInfo(Context context) {
        this.f16380a = context;
        battery_perc = 0;
        temperature = 0;
    }

    public static String convertIPv4ToIPv6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a28f1d5", new Object[]{str});
        }
        ArtcLog.w("ArtcDeviceInfo", "convertIPv4ToIPv6, ipv4:" + str + ", ipv6:", new Object[0]);
        return "";
    }

    public static void set_tmall_cc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13df4f9", new Object[]{new Boolean(z)});
        } else {
            is_tmall_cc = z;
        }
    }

    public static boolean is_tmall_cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5b89977", new Object[0])).booleanValue() : is_tmall_cc;
    }
}
