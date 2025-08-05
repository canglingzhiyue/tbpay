package com.alibaba.ut.abtest.internal.util;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static o f4204a;
    private final String b;
    private final Integer c;

    static {
        kge.a(-363521611);
    }

    public static o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("66e3cc32", new Object[0]);
        }
        if (f4204a == null) {
            synchronized (o.class) {
                if (f4204a == null) {
                    f4204a = new o();
                }
            }
        }
        return f4204a;
    }

    private o() {
        String str;
        Integer num = null;
        try {
            PackageInfo packageInfo = cex.a().c().getPackageManager().getPackageInfo(cex.a().c().getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                num = Integer.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                h.c("SystemInformation", "System information constructed with a context that apparently doesn't exist.");
                this.b = str;
                this.c = num;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
        this.b = str;
        this.c = num;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : UTDevice.getUtdid(cex.a().c());
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        SharedPreferences sharedPreferences = cex.a().c().getSharedPreferences("ut_setting", 4);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("channel", null);
    }
}
