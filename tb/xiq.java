package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class xiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f34315a;
    private boolean b;
    private adt c;
    private boolean d;

    static {
        kge.a(1236627246);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof xiq) {
                xiq xiqVar = (xiq) obj;
                if (this.f34315a != xiqVar.f34315a || this.b != xiqVar.b || !q.a(this.c, xiqVar.c) || this.d != xiqVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.f34315a * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i2 + i3) * 31;
        adt adtVar = this.c;
        if (adtVar != null) {
            i = adtVar.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z2 = this.d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        return i6 + i7;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BottomAreaCache(showType=" + this.f34315a + ", visible=" + this.b + ", allowanceData=" + this.c + ", showAllowance=" + this.d + riy.BRACKET_END_STR;
    }

    public xiq(int i, boolean z, adt adtVar, boolean z2) {
        this.f34315a = i;
        this.b = z;
        this.c = adtVar;
        this.d = z2;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f34315a = i;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public final void a(adt adtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd1ec87", new Object[]{this, adtVar});
        } else {
            this.c = adtVar;
        }
    }

    public final adt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (adt) ipChange.ipc$dispatch("16b3e7ec", new Object[]{this}) : this.c;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }
}
