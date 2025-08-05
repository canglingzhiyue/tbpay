package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.e;
import com.taobao.mrt.utils.a;
import java.util.Map;

/* loaded from: classes7.dex */
public class msk implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1723614451);
        kge.a(1895387482);
    }

    @Override // com.taobao.mrt.e
    public Map<String, Object> a(String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49ed9a08", new Object[]{this, str, map});
        }
        if ("log".equalsIgnoreCase(str)) {
            if (map != null) {
                str2 = map.get("task_name") + "";
            } else {
                str2 = null;
            }
            a.a(str2, map);
        }
        return null;
    }
}
