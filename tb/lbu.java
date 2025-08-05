package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.face.AliFaceDetectorV2;
import tb.cok;

/* loaded from: classes3.dex */
public class lbu implements cok.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2038047084);
        kge.a(1744013170);
    }

    @Override // tb.cok.a
    public coo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (coo) ipChange.ipc$dispatch("f0353fb", new Object[]{this});
        }
        if (b.bT()) {
            return AliFaceDetectorV2.INSTANCE;
        }
        if (!b.f()) {
            return null;
        }
        return lbv.b();
    }
}
