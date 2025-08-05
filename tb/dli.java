package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.dlg;

/* loaded from: classes.dex */
public final class dli<T extends dlg<?>> implements dln<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f26832a;

    static {
        kge.a(733690904);
        kge.a(-1749066050);
    }

    public dli(Class<T> abilityClass) {
        q.d(abilityClass, "abilityClass");
        this.f26832a = abilityClass;
    }

    @Override // tb.dln
    public /* synthetic */ dlg b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a((dlg) obj);
    }

    public dlg<?> a(T t) {
        try {
            return this.f26832a.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
