package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rkw implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(870780048);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        String str = map.get("condition");
        String f = rkq.d().f();
        if (str != null && f != null) {
            try {
                z = gsk.a(new JSONObject(str), f);
            } catch (Throwable unused) {
            }
            hashMap.put("result", "" + z);
        }
        return hashMap;
    }
}
