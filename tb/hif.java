package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class hif implements ark {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f28689a;
    private f b;
    private AURAGlobalData c;
    private aqs d;

    static {
        kge.a(743665196);
        kge.a(781738200);
    }

    public abstract boolean a(AURAEventIO aURAEventIO);

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
        this.f28689a = qVar;
        this.b = fVar;
    }

    public final AURAGlobalData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("818197e", new Object[]{this}) : this.c;
    }
}
