package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class eqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1130434467);
        emu.a("com.taobao.android.detail.datasdk.utils.sku.CheckUtils");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str == null || str.isEmpty();
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static boolean a(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue() : list == null || list.isEmpty();
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }
}
