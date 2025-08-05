package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.config.c;
import java.util.LinkedHashMap;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cqd INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final cqb f26429a;

    static {
        kge.a(1855746546);
        cqd cqdVar = new cqd();
        INSTANCE = cqdVar;
        f26429a = b.dN() ? new cqb() : null;
        cqdVar.b();
    }

    private cqd() {
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cox.a("pltScan", "scanMonitor", p.b("loadCostTime", "detectTime", "decodeTime"), p.b("detectResult", "decodeResult"));
        cox.a("pltScan", "frameMonitor", p.a("frameDetectTime"), p.a("deviceLevel"));
    }

    public final void a(cqc scanMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3eb1503", new Object[]{this, scanMonitor});
            return;
        }
        q.c(scanMonitor, "scanMonitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("loadCostTime", Double.valueOf(scanMonitor.e()));
        linkedHashMap.put("detectTime", Double.valueOf(scanMonitor.b()));
        linkedHashMap.put("decodeTime", Double.valueOf(scanMonitor.d()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("detectResult", String.valueOf(scanMonitor.a()));
        linkedHashMap2.put("decodeResult", String.valueOf(scanMonitor.c()));
        cox.a("pltScan", "scanMonitor", linkedHashMap, linkedHashMap2);
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        cqb cqbVar = f26429a;
        if (cqbVar == null) {
            return;
        }
        cqbVar.a(j);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cqb cqbVar = f26429a;
        if (cqbVar == null) {
            return;
        }
        long a2 = cqbVar.a();
        cqbVar.b();
        if (a2 <= 0) {
            return;
        }
        cox.a("pltScan", "frameMonitor", ai.b(j.a("frameDetectTime", Double.valueOf(a2))), ai.b(j.a("deviceLevel", c.a())));
    }
}
