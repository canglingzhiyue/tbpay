package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class csz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26502a;

    static {
        kge.a(1061229404);
        f26502a = false;
    }

    public static void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(oyw.VIDEO_LENGTH, Double.valueOf(j));
        hashMap2.put("videoResult", z ? "1" : "0");
        cox.a("VideoAvailable", "pickResult", hashMap, hashMap2);
    }

    public static void a(long j, long j2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f68bb6", new Object[]{new Long(j), new Long(j2), new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(oyw.VIDEO_LENGTH, Double.valueOf(j));
        hashMap.put("analysisCost", Double.valueOf(j2));
        hashMap2.put("result", z ? "1" : "0");
        hashMap2.put("format", str);
        cox.a("VideoAvailable", "pickResult", hashMap, hashMap2);
    }
}
