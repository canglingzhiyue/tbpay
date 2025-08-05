package com.taobao.search.m3.composite;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<c> f19074a;

    static {
        kge.a(293976440);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : this == obj || ((obj instanceof b) && q.a(this.f19074a, ((b) obj).f19074a));
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        ArrayList<c> arrayList = this.f19074a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CompositeInfo(compositeList=" + this.f19074a + riy.BRACKET_END_STR;
    }

    public b(ArrayList<c> compositeList) {
        q.c(compositeList, "compositeList");
        this.f19074a = compositeList;
    }

    public final ArrayList<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f19074a;
    }
}
