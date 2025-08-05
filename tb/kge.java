package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class kge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, Integer> f30049a = new ConcurrentHashMap();
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final int[] c = new int[120000];

    public static void a(int i) {
        try {
            int incrementAndGet = b.incrementAndGet();
            if (incrementAndGet < 120000) {
                c[incrementAndGet] = i;
                String str = "addClassCallTime[" + incrementAndGet + "]=" + i;
                return;
            }
            String str2 = "addClassCallTime failed, t >= ALL_CLASS_COUNT" + i;
        } catch (Throwable th) {
            Log.e("CodeTrack.ReportUtil", "addClassCallTime ...", th);
        }
    }

    public static String a() {
        try {
            String b2 = b();
            Log.e("CodeTrack.ReportUtil", "dump coverageResult complete,  length=" + b2.length());
            return b2;
        } catch (Throwable th) {
            AppMonitor.Alarm.commitFail(kga.MODULE_NAME, kga.MODULE_POINT_EXCEPTION, "outputCallTime", th.toString());
            return null;
        }
    }

    public static String b() {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        if (f30049a.size() > 0) {
            for (Map.Entry<Integer, Integer> entry : f30049a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append("\n");
            }
        } else {
            for (int i : c) {
                if (i != 0) {
                    sb.append(i);
                    sb.append(":");
                    sb.append(1);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void c() {
        f30049a.clear();
    }
}
