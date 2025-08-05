package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f28190a;
    public static long b;
    public static String c;
    public static String d;
    public static String e;

    static {
        kge.a(-1438879397);
    }

    public static void a(String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a26130", new Object[]{str, new Long(j), str2, str3, str4});
            return;
        }
        f28190a = str;
        b = j;
        c = str2;
        d = str3;
        e = str4;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return " name: " + f28190a + " v: " + b + " threadName: " + d + " pipelineName: " + e + " biz: " + c;
    }
}
