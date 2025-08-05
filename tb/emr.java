package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class emr implements ark {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27438a;
    private f b;
    private AURAGlobalData c;
    private aqs d;

    static {
        kge.a(524443122);
        kge.a(781738200);
    }

    public void a(a aVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d29f31", new Object[]{this, aVar, new Long(j), new Long(j2)});
        }
    }

    public void a(a aVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36335c3", new Object[]{this, aVar, new Boolean(z), new Long(j), new Long(j2)});
        }
    }

    public void b(a aVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27361b2", new Object[]{this, aVar, new Long(j), new Long(j2)});
        }
    }

    public void b(a aVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdac362", new Object[]{this, aVar, new Boolean(z), new Long(j), new Long(j2)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.c = aURAGlobalData;
        this.d = aqsVar;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f27438a = qVar;
        this.b = fVar;
    }

    public final AURAGlobalData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("818197e", new Object[]{this}) : this.c;
    }
}
