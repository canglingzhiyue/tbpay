package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.e.b.q;
import tb.kge;
import tb.muo;

/* loaded from: classes9.dex */
public final class n<T> extends tao.reactivex.e<T> implements muo<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f25127a;

    static {
        kge.a(-600304305);
        kge.a(-1471016015);
    }

    public n(T t) {
        this.f25127a = t;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        q.a aVar = new q.a(jVar, this.f25127a);
        jVar.onSubscribe(aVar);
        aVar.run();
    }

    @Override // tb.muo, java.util.concurrent.Callable
    public T call() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : this.f25127a;
    }
}
