package com.taobao.taobao.utils;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f21302a;
    private static Boolean b;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String str = f21302a;
        if (str != null) {
            return str;
        }
        try {
            Application application = Globals.getApplication();
            if (application == null) {
                return "";
            }
            f21302a = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            return f21302a == null ? "" : f21302a;
        } catch (Exception unused) {
            b.a("", "");
            return "";
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            try {
                b = Boolean.valueOf("9999".equals(a().split("\\.")[3]));
            } catch (Exception unused) {
                b = false;
            }
        }
        return b.booleanValue();
    }
}
