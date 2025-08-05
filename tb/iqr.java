package tb;

import com.alibaba.android.split.core.splitinstall.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;

/* loaded from: classes7.dex */
public class iqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        g c = c.Companion.a().c();
        return c == null || b.a().j().isEmpty() || (b.a().c("tmgbusiness4androidremote") != null && c.a().contains("tmgbusiness4androidremote"));
    }
}
