package tb;

import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class xip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<xio> f34313a = new CopyOnWriteArrayList();

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final xip f34314a;

        static {
            kge.a(-1036339604);
            f34314a = new xip();
        }

        public static /* synthetic */ xip a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (xip) ipChange.ipc$dispatch("f0cc95f", new Object[0]) : f34314a;
        }
    }

    static {
        kge.a(-1631887463);
    }

    public static xip a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xip) ipChange.ipc$dispatch("f0cc95f", new Object[0]) : a.a();
    }

    public void a(xio xioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755927a", new Object[]{this, xioVar});
        } else if (xioVar == null || this.f34313a.contains(xioVar)) {
        } else {
            this.f34313a.add(xioVar);
        }
    }

    public void b(xio xioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d898fb", new Object[]{this, xioVar});
        } else if (xioVar == null) {
        } else {
            this.f34313a.remove(xioVar);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        for (xio xioVar : this.f34313a) {
            if (xioVar != null) {
                try {
                    xioVar.onEnterPage(str, str2);
                } catch (Throwable th) {
                    c.a("LifeCycleListenerManager.dispatchOnEnterPage.error", th);
                }
            }
        }
    }
}
