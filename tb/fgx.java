package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1279149954);
        emu.a("com.taobao.android.detail.wrapper.utils.PrefetchTrackUtils");
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hitPrefetch", "true");
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("fromSource", str2);
        hashMap.put("executePrefetch", "true");
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("prefetchCallback", "success");
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else {
            ecg.a(context, z);
        }
    }

    public static void a(Activity activity, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8719f5", new Object[]{activity, str, list});
            return;
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            hashMap.put(str, list.toString());
        } else {
            hashMap.put(str, "true");
        }
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{activity});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hitPrefetchFailOverThreshold", "true");
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }
}
