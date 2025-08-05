package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class cqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26428a;
    private long b;
    private boolean c;
    private long d;
    private long e;

    static {
        kge.a(-1093699526);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof cqc) {
                cqc cqcVar = (cqc) obj;
                if (this.f26428a != cqcVar.f26428a || this.e != cqcVar.e || this.b != cqcVar.b || this.c != cqcVar.c || this.d != cqcVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        boolean z = this.f26428a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.e;
        long j2 = this.b;
        int i4 = ((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        long j3 = this.d;
        return ((i4 + i) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ScanMonitorBean(aiDetectedCode=" + this.f26428a + ", loadCostTime=" + this.e + ", aiDetectCostTime=" + this.b + ", alipayDecodeCode=" + this.c + ", alipayDecodeCostTime=" + this.d + riy.BRACKET_END_STR;
    }

    public cqc(boolean z, long j, long j2, boolean z2, long j3) {
        this.f26428a = z;
        this.e = j;
        this.b = j2;
        this.c = z2;
        this.d = j3;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f26428a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26428a;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }
}
