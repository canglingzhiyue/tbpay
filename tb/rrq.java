package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rrq f33340a;
    private rrp b;

    static {
        kge.a(-1390684016);
        f33340a = null;
    }

    private rrq() {
    }

    public static synchronized rrq a() {
        synchronized (rrq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rrq) ipChange.ipc$dispatch("f0a310d", new Object[0]);
            }
            if (f33340a == null) {
                f33340a = new rrq();
            }
            return f33340a;
        }
    }

    public void a(rrp rrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd97c6a8", new Object[]{this, rrpVar});
        } else {
            this.b = rrpVar;
        }
    }

    public void a(rrr rrrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd98af66", new Object[]{this, rrrVar});
            return;
        }
        rrp rrpVar = this.b;
        if (rrpVar != null) {
            rrpVar.a(rrrVar);
        }
        this.b = null;
        f33340a = null;
    }
}
