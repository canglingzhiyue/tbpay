package com.taobao.android.remoteso.tbadapter.ext;

import android.app.Application;
import android.os.Build;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import tb.iju;
import tb.ikj;
import tb.ikl;
import tb.ikq;
import tb.ikw;
import tb.iky;
import tb.kna;
import tb.nwc;

/* loaded from: classes6.dex */
public class h implements iju {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Application b;
    private volatile String c = null;
    private volatile Boolean e = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f14861a = true;

    public h(Application application) {
        this.b = application;
    }

    @Override // tb.iju
    public Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : this.b;
    }

    @Override // tb.iju
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (ikw.b((CharSequence) this.c)) {
            return this.c;
        }
        synchronized (h.class) {
            if (ikw.b((CharSequence) this.c)) {
                return this.c;
            }
            this.c = nwc.a(this.b) ? iju.ABI_ARM64 : iju.ABI_ARM;
            if (!Build.CPU_ABI.equalsIgnoreCase(this.c) && (Build.CPU_ABI.equalsIgnoreCase(iju.ABI_ARM64) || Build.CPU_ABI.equalsIgnoreCase(iju.ABI_ARM))) {
                this.c = Build.CPU_ABI;
                ikq.a("runtime,abi,conflict", "ABIUtils=" + this.c + ", CPU_ABI=" + Build.CPU_ABI);
            }
            return this.c;
        }
    }

    @Override // tb.iju
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        long a2 = iky.a();
        if (this.f14861a) {
            boolean a3 = ikj.a(str, str2);
            RSoLog.c("runtime -> new md5=" + a3 + ", cost = " + (iky.a() - a2) + ", md5=" + str + ", path=" + str2);
            if (a3) {
                return true;
            }
            if (ikw.a((CharSequence) str) || ikw.a((CharSequence) str2)) {
                return false;
            }
            boolean a4 = kna.a(str, str2);
            RSoLog.c("runtime -> fallback old md5=" + a4 + ", cost = " + (iky.a() - a2) + ", md5=" + str + ", path=" + str2);
            return a4;
        } else if (ikw.a((CharSequence) str) || ikw.a((CharSequence) str2)) {
            return false;
        } else {
            boolean a5 = kna.a(str, str2);
            RSoLog.c("runtime -> old md5, cost = " + (iky.a() - a2));
            return a5;
        }
    }

    @Override // tb.iju
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = LauncherRuntime.c;
        boolean equalsIgnoreCase = "com.taobao.taobao".equalsIgnoreCase(str);
        RSoLog.c("runtime -> isMainProcess= + " + equalsIgnoreCase + ",  currentProcessName=" + str);
        this.e = Boolean.valueOf(equalsIgnoreCase);
        return equalsIgnoreCase;
    }

    @Override // tb.iju
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : LauncherRuntime.c;
    }

    @Override // tb.iju
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (!a(LauncherRuntime.e)) {
            return "";
        }
        String b = ikl.b(this.b, "rso_common_group", "curr_app_version", "");
        if (!LauncherRuntime.e.equals(b)) {
            ikl.c(this.b, "rso_common_group", "curr_app_version", LauncherRuntime.e);
            ikl.c(this.b, "rso_common_group", "last_app_version", b);
            return b;
        }
        String b2 = ikl.b(this.b, "rso_common_group", "last_app_version", "");
        if (ikw.a((CharSequence) b2)) {
            String string = PreferenceManager.getDefaultSharedPreferences(this.b).getString("lastInstalledVersionName", "");
            if (a(string)) {
                return string;
            }
        }
        return b2;
    }

    @Override // tb.iju
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : ikw.a((CharSequence) LauncherRuntime.e) ? "unknown" : LauncherRuntime.e;
    }

    @Override // tb.iju
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : b(str);
    }

    @Override // tb.iju
    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.b.getFilesDir().getFreeSpace();
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !ikw.a((CharSequence) str) && str.split("\\.").length == 3;
    }
}
