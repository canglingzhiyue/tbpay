package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class abj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(963985414);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a(str, th, 1.0f);
        }
    }

    public static void a(String str, Throwable th, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dc2d1d", new Object[]{str, th, new Float(f)});
            return;
        }
        try {
            String a2 = bpi.a(th);
            String str2 = "";
            int a3 = jqi.a("iCart", "subStackTraceLength", 300);
            if (a2 != null) {
                str2 = a2.substring(0, a3);
            }
            bed.a(str, "错误堆栈：" + str2, f);
        } catch (Exception unused) {
        }
    }
}
