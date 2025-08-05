package tb;

import android.content.Context;
import com.alibaba.motu.tbrest.d;
import com.alibaba.motu.tbrest.rest.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class jgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79908c52", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        d.a().a(context, str, str2, str3, str4, str5);
        if (!jdw.a().a(jdw.enableSecuritySDK, true)) {
            return;
        }
        e.a();
        e.a(context);
    }

    public static boolean a(jdy jdyVar, String str, int i, String str2, String str3) {
        Boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = (Boolean) ipChange.ipc$dispatch("bcc79af8", new Object[]{jdyVar, str, new Integer(i), str2, str3});
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("btaolack", String.valueOf(!jgk.a(jdyVar)));
            a2 = d.a().a(str, System.currentTimeMillis(), "-", i, str2, str3, "-", hashMap);
        }
        return a2.booleanValue();
    }
}
