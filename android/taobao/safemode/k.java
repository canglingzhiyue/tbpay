package android.taobao.safemode;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1531a;
    public final String b;
    public final String c;
    public final String d;
    public final Intent e;
    public final String f;
    public final boolean g;
    public String h;

    public k(String str, String str2, boolean z, String str3, Intent intent, boolean z2, String str4) {
        this.f1531a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = intent;
        this.f = str4;
        this.g = z2;
    }

    public k(String str, String str2, String str3, Intent intent, boolean z) {
        this(str, str2, true, str3, intent, z, null);
    }

    public k(String str) {
        this(null, null, false, null, null, false, str);
    }

    public static k a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("d7c5f756", new Object[]{str}) : new k(str);
    }

    public static k a(String str, String str2, boolean z, String str3, Intent intent, boolean z2, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("7d655fc3", new Object[]{str, str2, new Boolean(z), str3, intent, new Boolean(z2), str4}) : new k(str, str2, z, str3, intent, z2, str4);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StartupContext{packageName='" + this.b + "', processName='" + this.c + "', referrer='" + this.d + "', intent=" + this.e + ", launchSource='" + this.f + "', fromActivity='" + this.f1531a + "', deathRecovery='" + this.g + "'}";
    }
}
