package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ixk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1746515672);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        hashMap.clear();
        hashMap.put(bip.KEY_UMBRELLA_SPM_PRE, str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
    }
}
