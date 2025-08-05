package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.module.plugin.a;
import com.ut.mini.module.plugin.d;
import java.util.Map;

/* loaded from: classes.dex */
public class rqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1486216996);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            d.getInstance().registerPlugin(new a() { // from class: tb.rqp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.mini.module.plugin.a
                public String getPluginName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd12a725", new Object[]{this}) : "UTSceneTracker";
                }

                @Override // com.ut.mini.module.plugin.a
                public int[] getAttentionEventIds() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (int[]) ipChange2.ipc$dispatch("873e4cb7", new Object[]{this}) : new int[]{2001};
                }

                @Override // com.ut.mini.module.plugin.a
                public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map}) : UTAnalytics.getInstance().getUTSceneTracker().a(map);
                }
            });
        }
    }
}
