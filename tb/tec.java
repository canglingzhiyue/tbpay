package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.g;

/* loaded from: classes8.dex */
public class tec {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_LINE = "_";

    static {
        kge.a(-14769764);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        String[] split = str.split("_");
        if (split.length < 2) {
            return -1;
        }
        try {
            return Integer.parseInt(split[split.length - 1]);
        } catch (Throwable th) {
            g.a("MultiTabUtils", "parse index error", th);
            return -1;
        }
    }
}
