package tb;

import com.alibaba.ability.builder.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class imj implements alw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private alw f29153a;

    static {
        kge.a(-1738749076);
        kge.a(-934569644);
    }

    @Override // tb.alw
    public c a(String name, String namespace, String businessId) {
        q.d(name, "name");
        q.d(namespace, "namespace");
        q.d(businessId, "businessId");
        if (this.f29153a == null) {
            try {
                Class<?> cls = Class.forName("com.alibaba.rocket.ability.RocketEntrance");
                Method method = cls != null ? cls.getMethod("getAbilityHub", new Class[0]) : null;
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.hub.IAbilityHub");
                }
                this.f29153a = (alw) invoke;
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
        alw alwVar = this.f29153a;
        if (alwVar != null) {
            return alwVar.a(name, namespace, businessId);
        }
        return null;
    }
}
