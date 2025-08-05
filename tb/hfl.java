package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.v;

/* loaded from: classes5.dex */
public class hfl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        kge.a(-1033580793);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveReward", "true"));
    }
}
