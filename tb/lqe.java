package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.m;
import com.taobao.tao.recommend3.tracelog.a;
import com.taobao.tao.recommend3.tracelog.b;
import java.util.Map;

/* loaded from: classes7.dex */
public class lqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2001883258);
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
        } else {
            b.a(str).a(str2, i);
        }
    }

    public static void a(String str, String str2, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9077b79e", new Object[]{str, str2, new Integer(i), map});
        } else {
            b.a(str).a(str2, i, map);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            b.a(str).a(str2, map);
        }
    }

    public static void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{str, new Boolean(z), new Boolean(z2)});
        } else {
            m.a(str, z, z2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a.a(str, str2, str3);
        }
    }

    public static void a(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d29d8f6", new Object[]{str, new Boolean(z), str2, str3});
        } else {
            a.a(str, z, str2, str3);
        }
    }
}
