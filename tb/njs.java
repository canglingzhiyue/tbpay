package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class njs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_OPERATION_TIMEOUT = 300000;

    /* renamed from: a  reason: collision with root package name */
    public njr f31506a;
    public long b;

    public njs(njr njrVar, long j) {
        this.f31506a = njrVar;
        this.b = j;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        njr njrVar = this.f31506a;
        if (njrVar != null) {
            if (njrVar.d() >= 0) {
                if (System.currentTimeMillis() > this.b + (this.f31506a.d() == 0 ? 300000L : this.f31506a.d())) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        njr njrVar = this.f31506a;
        return njrVar == null || njrVar.c() || a();
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        njr njrVar = this.f31506a;
        if (njrVar != null) {
            return njrVar.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        njr njrVar = this.f31506a;
        if (njrVar != null && (obj instanceof njs)) {
            return njrVar.equals(((njs) obj).f31506a);
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "strategyIdentifier=" + this.f31506a.a() + ", operationStartTime=" + this.b + ", showTimeout=" + this.f31506a.d();
    }
}
