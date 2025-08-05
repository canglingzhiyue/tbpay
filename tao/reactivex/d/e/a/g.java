package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.muz;

/* loaded from: classes9.dex */
public final class g<T> extends a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-600305273);
    }

    public g(tao.reactivex.c<T> cVar) {
        super(cVar);
    }

    @Override // tao.reactivex.c
    public void b(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
        } else {
            this.b.a((tao.reactivex.d) new tao.reactivex.d.g.e(muzVar));
        }
    }
}
