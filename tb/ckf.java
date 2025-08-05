package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ckf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context, String str, String str2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        synchronized (ckf.class) {
            String str3 = null;
            if (context != null) {
                if (!cjw.a(str) && !cjw.a(str2)) {
                    try {
                        a2 = ckh.a(context, str, str2, "");
                    } catch (Throwable unused) {
                    }
                    if (cjw.a(a2)) {
                        return null;
                    }
                    str3 = cka.b(cka.a(), a2);
                    return str3;
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        synchronized (ckf.class) {
            if (cjw.a(str) || cjw.a(str2) || context == null) {
                return;
            }
            try {
                String a2 = cka.a(cka.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, a2);
                ckh.a(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }
}
