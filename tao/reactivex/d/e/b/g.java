package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.muo;

/* loaded from: classes9.dex */
public final class g extends tao.reactivex.e<Object> implements muo<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final tao.reactivex.e<Object> f25118a;

    static {
        kge.a(-600304312);
        kge.a(-1471016015);
        f25118a = new g();
    }

    private g() {
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super Object> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            tao.reactivex.d.a.b.a((tao.reactivex.j<?>) jVar);
        }
    }

    @Override // tb.muo, java.util.concurrent.Callable
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return null;
    }
}
