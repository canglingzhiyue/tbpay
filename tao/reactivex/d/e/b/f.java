package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.kge;

/* loaded from: classes9.dex */
public final class f<T> extends a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final jew<? super jdz> b;
    private final jev c;

    static {
        kge.a(-600304313);
    }

    public f(tao.reactivex.e<T> eVar, jew<? super jdz> jewVar, jev jevVar) {
        super(eVar);
        this.b = jewVar;
        this.c = jevVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25109a.b(new tao.reactivex.d.d.d(jVar, this.b, this.c));
        }
    }
}
