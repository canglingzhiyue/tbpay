package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f26273a;
    public static PackageInfo b;

    public static Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : f26273a;
    }

    public static PackageInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("c2c16a4", new Object[0]);
        }
        PackageInfo packageInfo = b;
        if (packageInfo != null) {
            return packageInfo;
        }
        Context context = f26273a;
        if (context == null) {
            return null;
        }
        try {
            b = context.getPackageManager().getPackageInfo(f26273a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return b;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (f26273a != null && b() != null) {
            return b().applicationInfo.loadLabel(f26273a.getPackageManager()).toString();
        }
        return null;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (f26273a != null && b() != null) {
            return b().applicationInfo.loadIcon(f26273a.getPackageManager()).toString();
        }
        return null;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        Context context = f26273a;
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        Context context = f26273a;
        if (context == null) {
            return -1;
        }
        return context.getApplicationInfo().uid;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        if (f26273a != null && f() != -1) {
            return f26273a.getPackageManager().getNameForUid(f());
        }
        return null;
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue();
        }
        if (b() == null) {
            return -1L;
        }
        return b().versionCode;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        if (b() == null) {
            return null;
        }
        return b().versionName;
    }
}
