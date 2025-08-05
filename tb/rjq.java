package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class rjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2105723948);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str == null || str.length() == 0;
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static boolean a(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue() : list == null || list.isEmpty();
    }
}
