package tb;

import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.datamodel.nextrpc.d;
import com.alibaba.android.nextrpc.stream.internal.response.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.search.common.util.i;
import tb.arc;

/* loaded from: classes2.dex */
public class xhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1030607633);
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a20635", new Object[]{str, dVar});
        } else {
            arc.a().a(str, arc.a.a().a("AURA/performance").a("uiThread", bbl.a()).a("requestStart", dVar.a()).a("requestStartEndTime", System.nanoTime() / 1000000).a("requestEnd", dVar.b()).a("requestTotalCost", dVar.c()).a(i.b.MEASURE_PARSEDATA, dVar.k()).a(NativeBroadcast.SWITCH_THREAD, dVar.l()).b());
        }
    }

    public static void a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c101a528", new Object[]{aVar, bVar});
            return;
        }
        d i = aVar.i();
        i.b(true);
        if (bVar == null) {
            return;
        }
        i.a(bVar.a());
        i.a(bVar.f());
        i.c(bVar.b());
        i.d(bVar.c());
        i.e(bVar.d());
        i.f(bVar.e());
    }

    public static void a(d dVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5135d2f8", new Object[]{dVar, new Integer(i), new Long(j), new Long(j2)});
        } else if (i == 0) {
            dVar.b(j);
            dVar.a(j2);
        } else if (i == 1) {
            if (dVar.k() > 0 || j2 - j <= 0) {
                return;
            }
            dVar.c(j);
            dVar.d(j2);
            bbe.a("增加解析埋点：" + dVar.k() + "ms");
        } else if (i != 2 || dVar.l() > 0 || j2 - j <= 0) {
        } else {
            dVar.e(j);
            dVar.f(j2);
            bbe.a("增加线程切换埋点：" + dVar.l() + "ms");
        }
    }
}
