package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.mute.helper.f;
import tb.shm;

/* loaded from: classes5.dex */
public class sji extends shm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sii f33623a;

    static {
        kge.a(2126037814);
    }

    public sji(sii siiVar) {
        this.f33623a = siiVar;
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f.a(this.f33623a.z(), this.f33623a);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f33623a.t().addCardLifecycleListener(this);
        }
    }

    @Override // tb.shm.a, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        } else {
            a();
        }
    }
}
