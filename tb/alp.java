package tb;

import com.alibaba.ability.f;
import com.alibaba.ability.middleware.h;
import com.alibaba.ability.utils.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/alibaba/ability/entrance/AbilityEntrance;", "", "()V", "gInitiated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class alp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final alp INSTANCE = new alp();

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f25425a = new AtomicBoolean(false);

    private alp() {
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f25425a.compareAndSet(false, true)) {
        } else {
            a.INSTANCE.d();
            xis xisVar = new xis();
            xisVar.a(xhx.class);
            alv.a(xisVar);
            alv.b(new imj());
            h.a(new com.alibaba.ability.middleware.a());
            f.INSTANCE.a(new com.alibaba.ability.inject.f());
        }
    }
}
