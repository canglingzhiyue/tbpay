package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.l;

/* loaded from: classes.dex */
public class ijl implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijk f29084a;
    private final a<ijo> b = new a<ijo>() { // from class: tb.ijl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v3, types: [tb.ijo, java.lang.Object] */
        @Override // tb.ijl.a
        public /* synthetic */ ijo b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a(str);
        }

        public ijo a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
            }
            if (!ikx.a("/disabled/" + str)) {
                return null;
            }
            RSoException error = RSoException.error(6305, "lib obtain disabled by local switch, libName = " + str);
            j a2 = l.a(str);
            return new ijo(a2, l.a(a2, error, "local-disabled"));
        }
    };

    /* loaded from: classes.dex */
    interface a<V> {
        V b(String str);
    }

    public ijl(ijk ijkVar) {
        this.f29084a = ijkVar;
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        ijo b = this.b.b(str);
        return b != null ? b : this.f29084a.a(str);
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        ijo b = this.b.b(str);
        return b != null ? b : this.f29084a.b(str);
    }

    @Override // tb.ijk
    public void a(String str, ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        ijo b = this.b.b(str);
        if (b != null) {
            ijmVar.onFinish(b);
        } else {
            this.f29084a.a(str, ijmVar);
        }
    }
}
