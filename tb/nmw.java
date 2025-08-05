package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.nmq;

/* loaded from: classes.dex */
public class nmw<OUT, NEXT_OUT extends nmq, CONTEXT extends c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<nmt<OUT, NEXT_OUT, CONTEXT>> f31580a;
    private final int b;

    public nmw() {
        this(15);
    }

    public nmw(int i) {
        this.b = i;
        this.f31580a = new ConcurrentLinkedQueue();
    }

    public nmt<OUT, NEXT_OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmt) ipChange.ipc$dispatch("f084d29", new Object[]{this});
        }
        if (!nmr.a()) {
            return null;
        }
        return this.f31580a.poll();
    }

    public boolean a(nmt<OUT, NEXT_OUT, CONTEXT> nmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67fc027", new Object[]{this, nmtVar})).booleanValue();
        }
        if (nmtVar != null) {
            nmtVar.a();
        }
        return nmr.a() && this.f31580a.size() < this.b && this.f31580a.offer(nmtVar);
    }
}
