package com.taobao.android.tbtheme;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile q f15446a;

    private static q b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("8d1c339c", new Object[]{context});
        }
        if (f15446a == null) {
            synchronized (p.class) {
                if (f15446a == null) {
                    o oVar = new o(context.getFilesDir().getAbsolutePath());
                    if (!"true".equals(oVar.a("tbtheme", "enable_dark_theme"))) {
                        q qVar = new q(false);
                        f15446a = qVar;
                        return qVar;
                    }
                    String str = Build.MODEL;
                    String a2 = oVar.a("tbtheme", "dark_theme_model_whitelist");
                    if (a2 == null) {
                        a2 = "";
                    }
                    if (!new HashSet(Arrays.asList(a2.split(","))).contains(str)) {
                        q qVar2 = new q(false);
                        f15446a = qVar2;
                        return qVar2;
                    }
                    String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                    String a3 = oVar.a("tbtheme", "dark_theme_os_whitelist");
                    if (a3 == null) {
                        a3 = "";
                    }
                    if (!new HashSet(Arrays.asList(a3.split(","))).contains(valueOf)) {
                        q qVar3 = new q(false);
                        f15446a = qVar3;
                        return qVar3;
                    }
                    f15446a = new q(true);
                }
            }
        }
        return f15446a;
    }

    public static boolean a(Context context) {
        Configuration c;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context).f15447a && (c = c(context)) != null && (c.uiMode & 48) == 32;
    }

    private static Configuration c(Context context) {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("a84822fe", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getConfiguration();
    }
}
