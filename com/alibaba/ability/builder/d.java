package com.alibaba.ability.builder;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.collections.ao;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f1818a;
    private final Set<String> b;

    static {
        kge.a(1268901312);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!q.a(this.f1818a, dVar.f1818a) || !q.a(this.b, dVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        c cVar = this.f1818a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Set<String> set = this.b;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AbilityBuilderBox(abilityBuilder=" + this.f1818a + ", namespaces=" + this.b + riy.BRACKET_END_STR;
    }

    public d(c abilityBuilder, Set<String> namespaces) {
        q.d(abilityBuilder, "abilityBuilder");
        q.d(namespaces, "namespaces");
        this.f1818a = abilityBuilder;
        this.b = namespaces;
    }

    public /* synthetic */ d(c cVar, Set set, int i, o oVar) {
        this(cVar, (i & 2) != 0 ? ao.a() : set);
    }

    public final c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("13b85e3a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f1818a;
        }
        if (!this.b.isEmpty() && !p.a(this.b, str)) {
            return null;
        }
        return this.f1818a;
    }
}
