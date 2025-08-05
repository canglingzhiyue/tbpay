package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class luk extends lua implements lkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(438688546);
        kge.a(-947525823);
    }

    public luk(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkd
    public void a(llh llhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30282f0", new Object[]{this, llhVar});
        } else {
            e().a(llhVar);
        }
    }
}
