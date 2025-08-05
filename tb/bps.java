package tb;

import com.alibaba.android.umbrella.link.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* loaded from: classes2.dex */
public final class bps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Random f26040a = new Random();
    private static String b;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (j.a(b)) {
            synchronized (bps.class) {
                if (j.a(b)) {
                    b = bpt.d() + "-" + bpt.c() + f26040a.nextInt(9999);
                }
            }
        }
        return b;
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (j.b(str)) {
            str2 = "-" + str;
        } else {
            str2 = "";
        }
        return bpt.d() + "-" + bpt.c() + f26040a.nextInt(9999) + str2;
    }
}
