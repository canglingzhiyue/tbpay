package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.shm;

/* loaded from: classes5.dex */
public class sjb extends shm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jqr f33621a;
    private final sii b;

    static {
        kge.a(-225844074);
    }

    public sjb(sii siiVar) {
        this.b = siiVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.t().addCardLifecycleListener(this);
        }
    }

    @Override // tb.shm.a, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        } else {
            jct.a(this.b.z(), this, this.b.E());
        }
    }

    @Override // tb.shm.a, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        } else {
            jct.a(this, this.b.ae(), this.b.E());
        }
    }
}
