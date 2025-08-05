package com.taobao.taolive.room.utils;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-265727694);
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

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getBoolean(str, false);
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getInt(str, i);
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

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getLong(str, 0L);
    }
}
