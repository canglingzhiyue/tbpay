package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlb implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Md5ModTask";

    static {
        kge.a(-1066486590);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = "params: " + map;
        HashMap hashMap = new HashMap();
        int i = -1;
        try {
            i = gsh.a(map.get("base"), Integer.parseInt(map.get("total")));
        } catch (Exception unused) {
            z = true;
        }
        if (i < 0) {
            z = true;
        }
        hashMap.put("mod", String.valueOf(i));
        hashMap.put("hasException", String.valueOf(z));
        return hashMap;
    }
}
