package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes9.dex */
public final class c extends AtomicReference<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471011212);
    }

    public Throwable a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("7a107d4d", new Object[]{this}) : e.a(this);
    }

    public boolean a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue() : e.a(this, th);
    }
}
