package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ijo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f29086a;
    private final k b;
    private final List<k> c;

    public ijo(j jVar, k kVar) {
        this.f29086a = jVar;
        this.b = kVar;
        this.c = Collections.singletonList(kVar);
    }

    public ijo(j jVar, List<k> list) {
        a(list);
        this.f29086a = jVar;
        this.b = list.get(list.size() - 1);
        this.c = list;
    }

    private static void a(List<k> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list.size() <= 0) {
            throw new IllegalArgumentException("do not create RSResolveResult with empty results");
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f29086a.a();
    }

    public SoIndexData.SoFileInfo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("86ebb71b", new Object[]{this}) : this.f29086a.e();
    }

    public k c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("cf9c936d", new Object[]{this}) : this.b;
    }

    public List<k> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b.i();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RSPullResult{, finalResult=" + this.b + '}';
    }
}
