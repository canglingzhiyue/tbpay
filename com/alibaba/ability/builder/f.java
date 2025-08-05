package com.alibaba.ability.builder;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1819a;
    private final int b;
    private final Map<String, b> c;
    private final String d;

    static {
        kge.a(-2045056937);
        kge.a(-1951105504);
    }

    public f(String implClsName, int i, Map<String, b> apiSpecs, String str) {
        q.d(implClsName, "implClsName");
        q.d(apiSpecs, "apiSpecs");
        this.f1819a = implClsName;
        this.b = i;
        this.c = apiSpecs;
        this.d = str;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f1819a;
    }

    @Override // com.alibaba.ability.builder.c
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public Map<String, b> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.c;
    }

    public /* synthetic */ f(String str, int i, Map map, String str2, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? 4 : i, map, (i2 & 8) != 0 ? null : str2);
    }

    @Override // com.alibaba.ability.builder.c
    public boolean a(String api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, api})).booleanValue();
        }
        q.d(api, "api");
        if (!d().isEmpty()) {
            return d().keySet().contains(api);
        }
        return true;
    }

    @Override // com.alibaba.ability.builder.c
    public com.alibaba.ability.b a() {
        try {
            Class<?> implCls = Class.forName(this.f1819a);
            Object newInstance = implCls.newInstance();
            if (this.d == null) {
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.IAbility");
                }
                return (com.alibaba.ability.b) newInstance;
            }
            Class<?> cls = Class.forName(this.d);
            q.b(implCls, "implCls");
            Object newInstance2 = cls.getConstructor(implCls.getSuperclass()).newInstance(newInstance);
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.IAbility");
            }
            return (com.alibaba.ability.b) newInstance2;
        } catch (Throwable th) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            String name = getClass().getName();
            q.b(name, "this.javaClass.name");
            cVar.a(name, "反射创建能力实现类失败，错误原因：" + kotlin.a.a(th));
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
        b bVar = d().get(api);
        if (bVar == null) {
            return 2;
        }
        return bVar.a();
    }
}
