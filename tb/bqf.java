package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.bed;

/* loaded from: classes2.dex */
public class bqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-578549107);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : ifp.a() ? "http://taobao.com/jstracker/android/debug/tbbuy.html" : "http://taobao.com/jstracker/android/tbbuy.html";
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
            return;
        }
        bed.a aVar = new bed.a("AliBuy", "prefetchOnTouchDown", "29224-tracker", a());
        aVar.c(z ? "命中TouchDown预请求" : "未命中TouchDown预请求").c("c1", str).a(z).a(0.001f);
        bed.a(aVar);
        if (!z) {
            return;
        }
        bed.a aVar2 = new bed.a("AliBuy", "icartBtnPerfHit", "29224-tracker", a());
        aVar2.c("onTouchDown").b(true).a(0.001f);
        bed.a(aVar2);
    }

    public static void a(long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262844ec", new Object[]{new Long(j), new Long(j2), new Boolean(z)});
        } else if (!z) {
        } else {
            long j3 = j2 - j;
            HashMap hashMap = new HashMap();
            hashMap.put(TBBuyPreloadScene.TOUCH_DOWN, Long.valueOf(j3));
            a(hashMap, 0.001f);
            ard a2 = arc.a();
            a2.b("touchDown save " + j3, arc.a.a().a("AURA/performance").a("start", j).a("end", j2).b());
            bed.a(new bed.a("AliBuy", "icartBtnPerfHit", "29224-tracker", a()).c("onTouchUp").b(false).a(1).a(0.001f));
        }
    }

    private static void a(Map<String, Long> map, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee009943", new Object[]{map, new Float(f)});
        } else if (map.isEmpty()) {
            jqg.a("CartJSTracker#reportPerf", "stages 不能为空");
        } else {
            fgf a2 = new fgf("AliBuy", "29224-tracker", a()).a("iCartSettlementTouchDownCostMonitor");
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                a2.a(entry.getKey(), entry.getValue().longValue());
            }
            if (ifp.a()) {
                f = 1.0f;
            }
            a2.b(f);
            jpr.a(a2);
        }
    }
}
