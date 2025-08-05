package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.d;
import com.taobao.phenix.request.a;
import com.taobao.phenix.request.b;

/* loaded from: classes7.dex */
public class nit extends nms<nje, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final d c;
    private a d;

    static {
        kge.a(-789924099);
    }

    public nit(b bVar, d dVar) {
        super(bVar);
        this.c = dVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71689964", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    @Override // tb.nms
    public void a(nje njeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3870ca5", new Object[]{this, njeVar, new Boolean(z)});
            return;
        }
        nhx.d(b().b());
        this.c.a(b(), njeVar, null);
        nhx.f(b().b());
        if (this.d == null) {
            return;
        }
        b().b().k = true;
        this.d.a(b().b());
    }

    @Override // tb.nms
    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        if (niw.a(3) && th != null) {
            th.printStackTrace();
        }
        niw.d("PrefetchConsumer", b(), "received failure=%s", th);
        nhx.d(b().b());
        this.c.a(b(), null, th);
        nhx.f(b().b());
        if (this.d == null) {
            return;
        }
        b().b().k = true;
        this.d.a(b().b(), th);
    }

    @Override // tb.nms
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        nhx.e(b().b());
        nhx.d(b().b());
        this.c.a(b(), null, null);
        nhx.f(b().b());
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.c(b().b());
    }
}
