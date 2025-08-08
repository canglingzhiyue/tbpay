package com.taobao.android.miniLive.model;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.l;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1676913815);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "TBLIVE_ORANGE_RTCLive_MiniLive_Enable_V2", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean d = l.d(pmd.a().d().a("tblive", "TBLIVE_ORANGE_BFRTC_MiniLive_Enable", "true"));
        if (d && e()) {
            return false;
        }
        return d;
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "BFRTCDeviceBlackist", "");
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !StringUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean d = l.d(pmd.a().d().a("tblive", "TBLIVE_ORANGE_ARTP_MiniLive_Enable", "false"));
        if (d && d()) {
            return false;
        }
        return d;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "ARTPDeviceBlackist", "");
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !StringUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
