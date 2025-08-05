package tb;

import com.alibaba.ability.builder.c;
import com.alibaba.ability.builder.d;
import com.alibaba.ability.builder.e;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class xis implements alw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(1739066170);
        kge.a(-934569644);
        Companion = new a(null);
    }

    public xis() {
        e.INSTANCE.a("abilityMap", xir.class);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(45528578);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(Class<? extends amk<d>> staticMapBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, staticMapBuilder});
            return;
        }
        q.d(staticMapBuilder, "staticMapBuilder");
        e.INSTANCE.a("staticAbilityMap", staticMapBuilder);
    }

    @Override // tb.alw
    public c a(String name, String namespace, String businessId) {
        c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b91d874e", new Object[]{this, name, namespace, businessId});
        }
        q.d(name, "name");
        q.d(namespace, "namespace");
        q.d(businessId, "businessId");
        d a3 = e.INSTANCE.a(name, "staticAbilityMap");
        if (a3 != null && (a2 = a3.a(namespace)) != null) {
            return a2;
        }
        d a4 = e.INSTANCE.a(name, "abilityMap");
        if (a4 == null) {
            return null;
        }
        return a4.a(namespace);
    }
}
