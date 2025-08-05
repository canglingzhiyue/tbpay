package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class kak extends kar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kak instance;

    @Override // tb.kar
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "__ARanger";
    }

    static {
        kge.a(-434026788);
        instance = new kak();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else {
            instance.c(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else {
            instance.d(str, str2, objArr);
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f0c298", new Object[]{str, str2, th, objArr});
        } else {
            instance.b(str, str2, th, objArr);
        }
    }
}
