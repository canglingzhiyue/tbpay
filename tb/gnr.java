package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.a;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "alibuy.impl.aspect.performance.jsTracker")
/* loaded from: classes4.dex */
public final class gnr extends emr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, gnu> f28394a = new HashMap();
    private long b;
    private long c;
    private long d;

    static {
        kge.a(917111833);
    }

    public static /* synthetic */ Object ipc$super(gnr gnrVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : a.PRELOAD_MAIN_PAGE_FLOW.equals(str);
    }

    @Override // tb.emr
    public void a(com.alibaba.android.aura.datamodel.a aVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d29f31", new Object[]{this, aVar, new Long(j), new Long(j2)});
        } else if (a(aVar.d())) {
        } else {
            this.b = j;
            this.f28394a.put("beforeFlowAspectTime", new gnu("beforeFlowAspectTime", j, j2));
        }
    }

    @Override // tb.emr
    public void b(com.alibaba.android.aura.datamodel.a aVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27361b2", new Object[]{this, aVar, new Long(j), new Long(j2)});
        } else if (a(aVar.d())) {
        } else {
            String c = aVar.c();
            this.f28394a.put("before_" + c, new gnu("before_" + c, j, j2));
            if (asw.RENDER_SERVICE_CODE.equals(c)) {
                this.d = j2;
            }
            this.f28394a.put(c, new gnu(c, j2));
        }
    }

    @Override // tb.emr
    public void b(com.alibaba.android.aura.datamodel.a aVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdac362", new Object[]{this, aVar, new Boolean(z), new Long(j), new Long(j2)});
        } else if (a(aVar.d())) {
        } else {
            String c = aVar.c();
            this.f28394a.put("after_" + c, new gnu("after_" + c, j, j2));
            gnu gnuVar = this.f28394a.get(c);
            if (gnuVar == null) {
                return;
            }
            gnuVar.a(j);
        }
    }

    @Override // tb.emr
    public void a(com.alibaba.android.aura.datamodel.a aVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36335c3", new Object[]{this, aVar, new Boolean(z), new Long(j), new Long(j2)});
        } else if (a(aVar.d())) {
        } else {
            this.c = j2;
            this.f28394a.put("afterFlowAspectTime", new gnu("afterFlowAspectTime", j, j2));
            if (z) {
                return;
            }
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AURAGlobalData a2 = a();
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        long j = 0;
        for (gnu gnuVar : this.f28394a.values()) {
            String a3 = gnuVar.a();
            long b = gnuVar.b();
            if (!StringUtils.isEmpty(a3) && b != 0) {
                hashMap.put(a3, Long.valueOf(b));
                j += b;
            }
        }
        hashMap.put("aspectTime", Long.valueOf((this.c - this.b) - j));
        a2.update("globalDataPerformanceStage", hashMap);
        a2.update("globalDataPerformanceRenderStartStage", Long.valueOf(this.d));
        a2.update("globalDataPerformanceFlowStartStage", Long.valueOf(this.b));
    }
}
