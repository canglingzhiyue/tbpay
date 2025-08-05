package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ijs implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijk f29098a;
    private final iib b;
    private final Map<String, ijo> c = new ConcurrentHashMap();

    public static /* synthetic */ ijo a(ijs ijsVar, ijo ijoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijo) ipChange.ipc$dispatch("40fc2f70", new Object[]{ijsVar, ijoVar}) : ijsVar.a(ijoVar);
    }

    public ijs(ijk ijkVar, iib iibVar) {
        this.f29098a = ijkVar;
        this.b = iibVar;
    }

    private ijo a(ijo ijoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("8d7f80ee", new Object[]{this, ijoVar});
        }
        if (ijoVar.e() && this.c.get(ijoVar.a()) == null) {
            this.c.put(ijoVar.a(), ijoVar);
            RSoLog.c("Restrictive-> update result = " + ijoVar);
            this.b.a(ijoVar.c().c());
        }
        return ijoVar;
    }

    private void b(ijo ijoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4dff2b", new Object[]{this, ijoVar});
            return;
        }
        k c = ijoVar.c();
        if (ijp.a(c.f())) {
            return;
        }
        c.a(ijp.FROM_RESTRICTIVE);
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        ijo ijoVar = this.c.get(str);
        if (ijoVar != null && ijoVar.e()) {
            b(ijoVar);
            RSoLog.c("Restrictive-> fetch result = " + ijoVar);
            return ijoVar;
        }
        return a(this.f29098a.a(str));
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        ijo ijoVar = this.c.get(str);
        if (ijoVar != null && ijoVar.e()) {
            b(ijoVar);
            RSoLog.c("Restrictive-> fetchSync result = " + ijoVar);
            return ijoVar;
        }
        return a(this.f29098a.b(str));
    }

    @Override // tb.ijk
    public void a(String str, final ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        ijo ijoVar = this.c.get(str);
        if (ijoVar != null && ijoVar.e()) {
            b(ijoVar);
            RSoLog.c("Restrictive-> fetchAsync result = " + ijoVar);
            ijmVar.onFinish(ijoVar);
            return;
        }
        this.f29098a.a(str, new ijm() { // from class: tb.ijs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ijm
            public void onFinish(ijo ijoVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("559f7a1b", new Object[]{this, ijoVar2});
                } else {
                    ijmVar.onFinish(ijs.a(ijs.this, ijoVar2));
                }
            }
        });
    }
}
