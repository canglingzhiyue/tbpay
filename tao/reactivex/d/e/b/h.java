package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import tb.kge;
import tb.kgk;

/* loaded from: classes9.dex */
public final class h<T> extends tao.reactivex.e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Callable<? extends Throwable> f25119a;

    static {
        kge.a(-600304311);
    }

    public h(Callable<? extends Throwable> callable) {
        this.f25119a = callable;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        try {
            th = (Throwable) kgk.a(this.f25119a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            tao.reactivex.b.b.a(th);
        }
        tao.reactivex.d.a.b.a(th, jVar);
    }
}
