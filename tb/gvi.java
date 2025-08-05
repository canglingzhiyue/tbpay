package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.adapter.c;

/* loaded from: classes.dex */
public class gvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        c.a(str);
        gve.a(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        c.b(str);
        gve.b(str);
    }
}
