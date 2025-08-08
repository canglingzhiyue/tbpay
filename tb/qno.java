package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.launcher.g;

/* loaded from: classes7.dex */
public class qno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(636809291);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : StringUtils.equals("l", g.b());
    }
}
