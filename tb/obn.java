package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import com.taobao.android.remoteso.resolver2.l;
import com.taobao.android.remoteso.resolver2.o;

/* loaded from: classes6.dex */
public class obn implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f31893a;
    private final c b;
    private final ijr c;

    public obn(ijd ijdVar, c cVar, ijr ijrVar) {
        this.f31893a = ijdVar;
        this.b = cVar;
        this.c = ijrVar;
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        throw new UnsupportedOperationException("RemoAssetsPuller not support resolve()");
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        final j a2 = j.a(str, this.b.d(str), null);
        k a3 = this.c.a(a2);
        if (a3.i()) {
            return new ijo(a2, a3);
        }
        final o oVar = new o();
        this.c.a(a2, new c.a() { // from class: tb.obn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.resolver2.c.a
            public void a(k kVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                } else {
                    oVar.a((o) new ijo(a2, kVar));
                }
            }
        });
        ijo ijoVar = (ijo) oVar.a(ijn.a(this.f31893a, str));
        return ijoVar == null ? new ijo(a2, l.a(a2, RSoException.error(6304), "puller-error")) : ijoVar;
    }

    @Override // tb.ijk
    public void a(String str, ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        throw new UnsupportedOperationException("RemoAssetsPuller not support resolveAsync()");
    }
}
