package com.alibaba.android.bindingx.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2241a;
    public String b;
    public l c;
    public String d;
    public String e;
    public Map<String, Object> f;

    static {
        kge.a(-917866175);
    }

    public k(String str, String str2, l lVar, String str3, String str4, Map<String, Object> map) {
        this.f2241a = str;
        this.b = str2;
        this.c = lVar;
        this.d = str3;
        this.e = str4;
        if (map == null) {
            this.f = Collections.emptyMap();
        } else {
            this.f = map;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k kVar = (k) obj;
            String str = this.f2241a;
            if (str == null ? kVar.f2241a != null : !str.equals(kVar.f2241a)) {
                return false;
            }
            l lVar = this.c;
            if (lVar == null ? kVar.c != null : !lVar.equals(kVar.c)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null ? kVar.d != null : !str2.equals(kVar.d)) {
                return false;
            }
            String str3 = this.e;
            if (str3 == null ? kVar.e != null : !str3.equals(kVar.e)) {
                return false;
            }
            Map<String, Object> map = this.f;
            if (map != null) {
                return map.equals(kVar.f);
            }
            if (kVar.f == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f2241a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        l lVar = this.c;
        int hashCode2 = (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, Object> map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }
}
