package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ckp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        synchronized (ckp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f5f4589a", new Object[]{context, map});
            }
            String a2 = cjw.a(map, "appchannel", "");
            HashMap hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            ckb.a();
            hashMap.put("AA2", ckb.a(context));
            hashMap.put("AA3", "APPSecuritySDK-TAOBAO");
            hashMap.put("AA4", "3.5.0.20240702");
            hashMap.put("AA6", a2);
            return hashMap;
        }
    }
}
