package com.taobao.search.m3.icons;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SearchDomBean f19100a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    static {
        kge.a(17709252);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!q.a(this.f19100a, cVar.f19100a) || !q.a((Object) this.b, (Object) cVar.b) || !q.a((Object) this.c, (Object) cVar.c) || !q.a((Object) this.d, (Object) cVar.d) || !q.a((Object) this.e, (Object) cVar.e)) {
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
        SearchDomBean searchDomBean = this.f19100a;
        int hashCode = (searchDomBean != null ? searchDomBean.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IconItemInfo(domBean=" + this.f19100a + ", type=" + this.b + ", text=" + this.c + ", prefix=" + this.d + ", domClass=" + this.e + riy.BRACKET_END_STR;
    }

    public c(SearchDomBean domBean, String type, String str, String str2, String domClass) {
        q.c(domBean, "domBean");
        q.c(type, "type");
        q.c(domClass, "domClass");
        this.f19100a = domBean;
        this.b = type;
        this.c = str;
        this.d = str2;
        this.e = domClass;
    }

    public final SearchDomBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchDomBean) ipChange.ipc$dispatch("88762bef", new Object[]{this}) : this.f19100a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : (!q.a((Object) this.b, (Object) "text") && !q.a((Object) this.b, (Object) "richText")) || !StringUtils.isEmpty(this.c) || !StringUtils.isEmpty(this.d);
    }
}
