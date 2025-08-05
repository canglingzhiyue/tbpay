package com.taobao.search.m3.property;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f19131a;
    private final Integer b;

    static {
        kge.a(-1707507640);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!q.a(this.f19131a, aVar.f19131a) || !q.a(this.b, aVar.b)) {
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
        List<b> list = this.f19131a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PropertyInfo(propertyList=" + this.f19131a + ", color=" + this.b + riy.BRACKET_END_STR;
    }

    public a(List<b> propertyList, Integer num) {
        q.c(propertyList, "propertyList");
        this.f19131a = propertyList;
        this.b = num;
    }

    public final List<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f19131a;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.b;
    }
}
