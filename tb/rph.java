package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class rph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1087645165);
    }

    public long commit(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("519dce5d", new Object[]{this, str, str2, str3, map})).longValue();
        }
        return -1L;
    }

    public void createTable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155e1143", new Object[]{this, str});
        }
    }

    public long update(String str, String str2, String str3, String str4, String[] strArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d351e772", new Object[]{this, str, str2, str3, str4, strArr, map})).longValue();
        }
        return -1L;
    }
}
