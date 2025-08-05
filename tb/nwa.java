package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;

/* loaded from: classes8.dex */
public class nwa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float INSHOP_WATERFALL_OFFSET = 4.5f;
    public static final float INSHOP_WATERFALL_PADDING = 9.0f;
    public static final float MAIN_WATERFALL_OFFSET = 4.5f;

    static {
        kge.a(-1366369236);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        int a2 = j.a(4.5f);
        return (a2 << 2) + (((a2 * 5) / 3) << 1);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        return (j.a(4.5f) << 1) + (j.a(9.0f) << 1);
    }
}
