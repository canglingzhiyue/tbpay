package com.alibaba.android.umbrella.link;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.bpr;
import tb.mto;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2823a = "/data/local/tmp/.com_taobao_taobao_umbrella_switcher";
    private final bpr b = new bpr("umbrella_trace2");
    private boolean c;

    public e() {
        this.c = false;
        try {
            this.c = new File(this.f2823a).exists();
            Object[] objArr = new Object[2];
            objArr[0] = this.f2823a;
            objArr[1] = this.c ? "存在" : "不存在";
            Log.e("umbrella", String.format("%s %s", objArr));
        } catch (Throwable th) {
            Log.e("umbrella", th.getMessage());
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (c()) {
            return true;
        }
        Boolean a2 = this.b.a("enableLogcat");
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    public boolean b() {
        Boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (c() || (a2 = this.b.a("enableFeedback")) == null) {
            return true;
        }
        return a2.booleanValue();
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (c()) {
            return false;
        }
        return a(false, "G_" + str, "G_ANY");
    }

    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (c()) {
            return false;
        }
        double random = Math.random();
        return a(random, mto.a.GEO_NOT_SUPPORT, "I_" + str, "I_ANY");
    }

    public boolean b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb13315", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (c()) {
            return false;
        }
        double random = Math.random();
        if (j.b(str4)) {
            return a(random, mto.a.GEO_NOT_SUPPORT, "CF_" + str, "E_" + str4, "CF_ANY");
        }
        return a(random, mto.a.GEO_NOT_SUPPORT, "CS_" + str, "CS_ANY");
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return a(false, "DC_" + str, "DC_ANY");
    }

    private boolean a(boolean z, String... strArr) {
        Boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea50237", new Object[]{this, new Boolean(z), strArr})).booleanValue();
        }
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                if (!j.a(str) && (a2 = this.b.a(str)) != null) {
                    return a2.booleanValue();
                }
            }
        }
        return z;
    }

    private boolean a(double d, double d2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("724389fb", new Object[]{this, new Double(d), new Double(d2), strArr})).booleanValue();
        }
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                int a2 = a(d, str);
                if (2 != a2) {
                    return 1 == a2;
                }
            }
        }
        return d > d2;
    }

    private int a(double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1f46113", new Object[]{this, new Double(d), str})).intValue();
        }
        double a2 = this.b.a(str, -1.0d);
        if (a2 == -1.0d) {
            return 2;
        }
        return d > a2 ? 1 : 0;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
