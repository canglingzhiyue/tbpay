package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.resolver2.d;
import java.util.HashMap;
import java.util.Map;
import tb.ijg;

/* loaded from: classes.dex */
public class ihr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final iju f29033a;
    public final ijd b;
    public final iik c;
    public final iiq d;
    public final iit e;
    public final iiw<ihl, iix<String>> f;
    public final ijg.b g;
    public final a h;
    public final b i;
    public final c<d> j;
    public final iiw<ihl, nvf> k;
    public final Map<Class<?>, iiw<ihl, ?>> l = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        ihx a(ihl ihlVar, ihx ihxVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        iia a(ihl ihlVar, iia iiaVar);
    }

    /* loaded from: classes6.dex */
    public interface c<T> {
        T a(ihl ihlVar, T t);
    }

    public ihr(iju ijuVar, ijd ijdVar, iik iikVar, iiq iiqVar, iit iitVar, iiw<ihl, iix<String>> iiwVar, ijg.b bVar, a aVar, b bVar2, c<d> cVar, iiw<ihl, nvf> iiwVar2) {
        this.f29033a = ijuVar;
        this.b = ijdVar;
        this.c = iikVar;
        this.d = iiqVar;
        this.e = iitVar;
        this.f = iiwVar;
        this.g = bVar;
        this.h = aVar;
        this.i = bVar2;
        this.j = cVar;
        this.k = iiwVar2;
    }

    public <T> void a(Class<T> cls, iiw<ihl, T> iiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d866a28e", new Object[]{this, cls, iiwVar});
        } else {
            this.l.put(cls, iiwVar);
        }
    }

    public <T> iiw<ihl, T> a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iiw) ipChange.ipc$dispatch("271bd89a", new Object[]{this, cls}) : (iiw<ihl, T>) this.l.get(cls);
    }
}
