package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class blt extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25967a;
    private boolean b;

    static {
        kge.a(410610731);
    }

    public static /* synthetic */ Object ipc$super(blt bltVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1277220435) {
            super.a((RecyclerView.State) objArr[0], (VirtualLayoutManager.a) objArr[1], (e) objArr[2]);
            return null;
        } else if (hashCode != 1453898639) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.a(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (e) objArr[3]));
        }
    }

    public blt() {
        this(0);
    }

    public blt(int i) {
        this(i, 0);
    }

    public blt(int i, int i2) {
        this.f25967a = 0;
        this.b = false;
        b_(i2);
        c(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f25967a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // tb.bln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.v7.widget.RecyclerView.Recycler r20, android.support.v7.widget.RecyclerView.State r21, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.c r22, tb.bls r23, com.alibaba.android.ultron.ext.vlayout.e r24) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blt.a(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$c, tb.bls, com.alibaba.android.ultron.ext.vlayout.e):void");
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3df29ad", new Object[]{this, state, aVar, eVar});
            return;
        }
        super.a(state, aVar, eVar);
        this.b = true;
    }

    @Override // tb.blu, com.alibaba.android.ultron.ext.vlayout.c
    public int a(int i, boolean z, boolean z2, e eVar) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56a8bb8f", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), eVar})).intValue();
        }
        if (eVar.getOrientation() == 1) {
            z3 = true;
        }
        if (z) {
            if (i == f() - 1) {
                return z3 ? this.w + this.s : this.u + this.q;
            }
        } else if (i == 0) {
            return z3 ? (-this.v) - this.r : (-this.t) - this.p;
        }
        return super.a(i, z, z2, eVar);
    }
}
