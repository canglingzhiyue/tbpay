package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend.util.UTABTestUtil;

/* loaded from: classes8.dex */
public class osg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1314540776);
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : UTABTestUtil.a("recommend", str, "lazyLoadEnable", z);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : UTABTestUtil.a("recommend", str, "lazyLoadOffset", i);
    }
}
