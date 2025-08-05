package com.taobao.android.meta.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14271a;
    private final BaseTypedBean b;
    private final String c;

    static {
        kge.a(1768586895);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!q.a((Object) this.f14271a, (Object) cVar.f14271a) || !q.a(this.b, cVar.b) || !q.a((Object) this.c, (Object) cVar.c)) {
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
        String str = this.f14271a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        BaseTypedBean baseTypedBean = this.b;
        int hashCode2 = (hashCode + (baseTypedBean != null ? baseTypedBean.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MetaMod(type=" + this.f14271a + ", bean=" + this.b + ", id=" + this.c + riy.BRACKET_END_STR;
    }

    public c(String type, BaseTypedBean bean, String str) {
        q.c(type, "type");
        q.c(bean, "bean");
        this.f14271a = type;
        this.b = bean;
        this.c = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14271a;
    }

    public final BaseTypedBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseTypedBean) ipChange.ipc$dispatch("9dcf786", new Object[]{this}) : this.b;
    }
}
