package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.b;
import java.io.File;

/* loaded from: classes4.dex */
public class iyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1511515748);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b.c() || com.alibaba.ability.localization.b.c() || b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : new File("/data/local/tmp/.skipFloatBuy").exists();
    }
}
