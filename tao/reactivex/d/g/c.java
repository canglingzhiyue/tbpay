package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.mun;

/* loaded from: classes9.dex */
public abstract class c<T> extends AtomicInteger implements mun<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471012173);
        kge.a(-1471016016);
    }

    @Override // tb.muw
    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called!");
    }
}
