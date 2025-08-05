package com.alibaba.wireless.aliprivacy;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4234a = true;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f4234a) {
        } else {
            a(str);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (!f4234a) {
        } else {
            a(str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!f4234a) {
        } else {
            Log.e(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else if (!f4234a) {
        } else {
            Log.e(a(str), str2, th);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "AliPrivacy==>" + str;
    }
}
