package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.c;

/* loaded from: classes5.dex */
public class fjk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-715335750);
    }

    public static synchronized boolean a() {
        synchronized (fjk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            }
            return ((Boolean) c.a("isDebuggable", false)).booleanValue();
        }
    }
}
