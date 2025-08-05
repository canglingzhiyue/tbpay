package com.alibaba.ability.builder;

import com.alibaba.ability.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes.dex */
public class a<T extends com.alibaba.ability.b> implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f1816a;
    private final int b;
    private final Map<String, b> c;

    static {
        kge.a(1559240715);
        kge.a(-1951105504);
    }

    public a(Class<T> cls) {
        this(cls, 0, null, 6, null);
    }

    public a(Class<T> abilityClass, int i, Map<String, b> apiSpecs) {
        q.d(abilityClass, "abilityClass");
        q.d(apiSpecs, "apiSpecs");
        this.f1816a = abilityClass;
        this.b = i;
        this.c = apiSpecs;
    }

    @Override // com.alibaba.ability.builder.c
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public /* synthetic */ a(Class cls, int i, Map map, int i2, o oVar) {
        this(cls, (i2 & 2) != 0 ? 4 : i, (i2 & 4) != 0 ? ai.a() : map);
    }

    public Map<String, b> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.ability.builder.c
    public boolean a(String api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, api})).booleanValue();
        }
        q.d(api, "api");
        if (!c().isEmpty()) {
            return c().containsKey(api);
        }
        return true;
    }

    @Override // com.alibaba.ability.builder.c
    public T a() {
        try {
            return this.f1816a.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.alibaba.ability.builder.c
    public int b(String api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, api})).intValue();
        }
        q.d(api, "api");
        b bVar = c().get(api);
        if (bVar == null) {
            return 1;
        }
        return bVar.a();
    }
}
