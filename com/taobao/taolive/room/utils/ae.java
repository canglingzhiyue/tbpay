package com.taobao.taolive.room.utils;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class ae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHINA_UNICOM_NETFLOW_LASTDATE = "ChinaUnicomNetFlowLastDate";
    public static final String NON_CHINA_UNICOM_NETFLOW_LASTDATE = "NonChinaUnicomNetFlowLastDate";
    public static final String SHOW_TIME_PLAY_BOTTOM_TOAST = "showTimePlayBottomToast";
    public static final String SHOW_TIME_RIGHT_SCROLL_TIPS = "showTimeRightScrollTips";

    static {
        kge.a(-1990376746);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("TaoLiveTimeMove", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : pmd.a().u().c().getSharedPreferences("taolive", 0).getString(str, "");
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getBoolean(str, false);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue() : (pmd.a().u() == null || pmd.a().u().c() == null) ? z : pmd.a().u().c().getSharedPreferences("taolive", 0).getBoolean(str, z);
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getLong(str, 0L);
    }
}
