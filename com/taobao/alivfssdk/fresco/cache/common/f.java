package com.taobao.alivfssdk.fresco.cache.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class f implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f8503a;
    public final String b;

    static {
        kge.a(-1364677550);
        kge.a(-989494056);
    }

    public f(String str, String str2) {
        this.f8503a = (String) com.taobao.alivfssdk.fresco.common.internal.c.a(str);
        this.b = str2;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.b
    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f8503a;
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
            f fVar = (f) obj;
            String str = this.f8503a;
            if (str == null ? fVar.f8503a != null : !str.equals(fVar.f8503a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 != null) {
                return str2.equals(fVar.b);
            }
            if (fVar.b == null) {
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
        String str = this.f8503a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
