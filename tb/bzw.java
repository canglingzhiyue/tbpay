package tb;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class bzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1488923231);
    }

    public static void a(PopRequest popRequest, PopRequest.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bae61a", new Object[]{popRequest, status});
        } else if (popRequest == null || status == null) {
        } else {
            popRequest.a(status);
            PopRequest.b i = popRequest.i();
            if (i == null) {
                return;
            }
            if (status == PopRequest.Status.READY) {
                i.a(popRequest);
            } else if (status == PopRequest.Status.SHOWING) {
                i.b(popRequest);
            } else if (status == PopRequest.Status.SUSPENDED) {
            } else {
                if (status == PopRequest.Status.REMOVED) {
                    if (!(i instanceof PopRequest.c)) {
                        return;
                    }
                    ((PopRequest.c) i).e(popRequest);
                } else if (status == PopRequest.Status.ENQUEUED) {
                    if (!(i instanceof PopRequest.c)) {
                        return;
                    }
                    ((PopRequest.c) i).d(popRequest);
                } else if (status != PopRequest.Status.FORCE_REMOVED) {
                } else {
                    i.c(popRequest);
                }
            }
        }
    }
}
