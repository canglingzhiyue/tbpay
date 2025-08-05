package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class l<T> extends tao.reactivex.e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.h<T> f25124a;

    static {
        kge.a(-600304307);
    }

    public l(tao.reactivex.h<T> hVar) {
        this.f25124a = hVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25124a.b(jVar);
        }
    }
}
