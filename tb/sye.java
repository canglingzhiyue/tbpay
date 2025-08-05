package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;

/* loaded from: classes8.dex */
public class sye implements syd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final i f33943a;

    static {
        kge.a(377495070);
        kge.a(793472947);
    }

    public static /* synthetic */ i a(sye syeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("53c94ce3", new Object[]{syeVar}) : syeVar.f33943a;
    }

    public sye(i iVar) {
        this.f33943a = iVar;
    }

    @Override // tb.syd
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!(this.f33943a.a(i) instanceof ojr)) {
            g.a("SubTabViewRenderListener", "只有推荐容器重新创建了才做会场的端快照预取");
        } else {
            a.b().a(new Runnable() { // from class: tb.sye.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.infoflow.a f = sye.a(sye.this).f();
                    if (f == null) {
                        return;
                    }
                    f.a();
                    g.a("SubTabViewRenderListener", "触发端快照预取");
                }
            }, 1000L);
        }
    }
}
