package tb;

import com.alibaba.analytics.core.config.q;
import com.alibaba.analytics.core.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class aoo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25479a;
    private static int b;

    static {
        kge.a(-680198511);
        f25479a = false;
        b = 0;
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else if (!q.a().a(19999, "IPV6_DETECT")) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "" + b);
            hashMap.put("time", "" + j);
            apf.a().a(new a("UT_ANALYTICS", "19999", "IPV6_DETECT", "", "", hashMap));
        }
    }

    public static void a(boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27090c8d", new Object[]{new Boolean(z), new Integer(i), new Long(j)});
        } else if (f25479a) {
        } else {
            f25479a = true;
            if (!q.a().a(19999, "IPV6_INIT")) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                hashMap.put("success", "1");
            } else {
                hashMap.put("success", "0");
                hashMap.put("errorCode", "" + i);
            }
            hashMap.put("time", "" + j);
            hashMap.put("type", "" + b);
            apf.a().a(new a("UT_ANALYTICS", "19999", "IPV6_INIT", "", "", hashMap));
        }
    }

    public static void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{new Integer(i), new Long(j)});
        } else if (!q.a().a(19999, "IPV6_ERROR")) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", "" + i);
            hashMap.put("time", "" + j);
            hashMap.put("type", "" + b);
            apf.a().a(new a("UT_ANALYTICS", "19999", "IPV6_ERROR", "", "", hashMap));
        }
    }
}
