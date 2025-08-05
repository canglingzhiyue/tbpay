package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import tb.lks;

/* loaded from: classes7.dex */
public class lho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lks<RecyclerView> f30613a;
    private lks.c<RecyclerView> b;
    private final IHostService c;

    static {
        kge.a(-533943238);
    }

    public static /* synthetic */ IHostService a(lho lhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHostService) ipChange.ipc$dispatch("2b7492e8", new Object[]{lhoVar}) : lhoVar.c;
    }

    public lho(ljs ljsVar, lks<RecyclerView> lksVar) {
        this.f30613a = lksVar;
        this.c = (IHostService) ljsVar.a(IHostService.class);
        a(lksVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b(this.f30613a);
        }
    }

    private void a(lks<RecyclerView> lksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f96b84", new Object[]{this, lksVar});
            return;
        }
        this.b = b();
        lksVar.a(this.b);
    }

    private void b(lks<RecyclerView> lksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17c7205", new Object[]{this, lksVar});
            return;
        }
        lks.c<RecyclerView> cVar = this.b;
        if (cVar != null) {
            lksVar.b(cVar);
        }
        this.b = null;
    }

    private lks.c<RecyclerView> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("4c80d1ca", new Object[]{this}) : new lks.c<RecyclerView>() { // from class: tb.lho.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.c
            public /* bridge */ /* synthetic */ void a(RecyclerView recyclerView, int i) {
            }

            @Override // tb.lks.c
            public /* bridge */ /* synthetic */ void a(RecyclerView recyclerView, int i, int i2) {
            }

            @Override // tb.lks.c
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                } else if (lho.a(lho.this) == null) {
                    ldf.d("ReachEdgeHandler", "mHostService is null");
                } else {
                    lju invokeCallback = lho.a(lho.this).getInvokeCallback();
                    lke a2 = invokeCallback.a();
                    if (a2 != null) {
                        a2.a(z);
                    }
                    ljy f = invokeCallback.f();
                    if (f == null) {
                        return;
                    }
                    f.a(z);
                }
            }
        };
    }
}
