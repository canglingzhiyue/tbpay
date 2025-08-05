package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ckg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String a(Context context, String str, String str2) {
        String a2;
        synchronized (ckg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
            }
            String str3 = null;
            if (context == null || cjw.a(str) || cjw.a(str2)) {
                return null;
            }
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

    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (ckg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            } else if (cjw.a(str) || cjw.a(str2) || context == null) {
            } else {
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
}
