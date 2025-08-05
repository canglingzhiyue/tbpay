package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.arc;
import tb.ifz;

/* loaded from: classes4.dex */
public class tcz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float EXCEPTION_SAMPLING = 1.0f;
    public static final float PERF_SAMPLING = 0.01f;

    static {
        kge.a(460288205);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, 1.0f);
        }
    }

    public static void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{str, new Float(f)});
        } else {
            ifz.a(ifz.a.b("streamDataTracker").a(str).a(f));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ifz.a(ifz.a.b("streamDataSuccessRate").c("mainStreamData").b(true).a(0.01f));
        a("mainStreamData_pv", 0.01f);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ifz.a(ifz.a.b("streamDataSuccessRate").c("streamData").b(false).a(1).a(0.01f));
        a("streamData_pv", 0.01f);
    }

    public static void a(String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f667217c", new Object[]{str, new Long(j), new Long(j2), str2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        long j3 = j2 - j;
        HashMap hashMap = new HashMap();
        hashMap.put("cost", Long.valueOf(j3));
        ifz.a("steamDataCostMonitor", hashMap, arrayList, str2, 0.01f);
        ard a2 = arc.a();
        a2.b("stream请求二段包 耗时 = " + j3, arc.a.a().a("AURA/performance").a("start", j).a("end", j2).b());
    }
}
