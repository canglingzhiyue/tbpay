package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.gbp;

/* loaded from: classes5.dex */
public abstract class gbo<T> implements gbp<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gbp.a<T> f28292a;
    public gbp.b<T> b;
    private List<gbm> c;
    private T d;
    private final gbq<T> e;

    static {
        kge.a(-775874522);
        kge.a(447334944);
    }

    public gbo(gbq<T> gbqVar) {
        this.e = gbqVar;
    }

    @Override // tb.gbp
    public void a(List<gbm> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public List<gbm> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    @Override // tb.gbp
    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.d = t;
        }
    }

    @Override // tb.gbp
    public T b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.d;
    }

    @Override // tb.gbp
    public gbq<T> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbq) ipChange.ipc$dispatch("1e683fa6", new Object[]{this}) : this.e;
    }

    @Override // tb.gbp
    public void a(gbp.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30851326", new Object[]{this, aVar});
        } else {
            this.f28292a = aVar;
        }
    }

    @Override // tb.gbp
    public void a(gbp.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30858785", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }
}
