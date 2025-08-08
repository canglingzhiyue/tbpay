package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class fkh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28009a;

    static {
        kge.a(602481230);
        f28009a = "unknown";
    }

    public static String a() {
        int a2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (!StringUtils.equals(f28009a, "unknown")) {
            return f28009a;
        }
        try {
            a2 = akt.a();
        } catch (Exception unused) {
            f28009a = "unknown";
        }
        if (a2 == 0) {
            str = "high";
        } else if (a2 == 1) {
            str = "middle";
        } else if (a2 != 2) {
            f28009a = "unknown";
            return f28009a;
        } else {
            str = "low";
        }
        f28009a = str;
        return f28009a;
    }
}
