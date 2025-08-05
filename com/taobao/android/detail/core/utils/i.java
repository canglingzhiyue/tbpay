package com.taobao.android.detail.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.epj;
import tb.epp;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1653403620);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : epp.a();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (epj.i() == null) {
        } else {
            epj.i().a("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (epj.i() == null) {
        } else {
            epj.i().d("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (epj.i() == null) {
        } else {
            epj.i().c("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (epj.i() == null) {
        } else {
            epj.i().b("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (epj.i() == null) {
        } else {
            epj.i().b("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2, th);
            n.a(str, str2, th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else if (epj.i() == null) {
        } else {
            epj.i().a("Detail_Core", riy.ARRAY_START_STR + str + "] " + str2, th);
        }
    }
}
