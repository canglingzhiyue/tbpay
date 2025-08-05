package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public final class pmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static pmc f32757a;
    private pnz b;

    static {
        kge.a(-1395762292);
    }

    public static pmc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmc) ipChange.ipc$dispatch("f0933d8", new Object[0]);
        }
        synchronized (pmc.class) {
            if (f32757a == null) {
                synchronized (pmc.class) {
                    f32757a = new pmc();
                }
            }
        }
        return f32757a;
    }

    private pmc() {
    }

    public pnz b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnz) ipChange.ipc$dispatch("16badfc1", new Object[]{this}) : this.b;
    }

    public void a(pnz pnzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fa431c", new Object[]{this, pnzVar});
        } else {
            this.b = pnzVar;
        }
    }
}
