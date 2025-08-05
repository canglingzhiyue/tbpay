package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.khl;

/* loaded from: classes9.dex */
public abstract class b<T> extends AtomicInteger implements khl<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471015057);
        kge.a(-1471016018);
    }

    @Override // tb.muw
    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called");
    }
}
