package com.taobao.search.m3.interactive;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f19117a;
    private boolean b;
    private final boolean c;

    static {
        kge.a(-1807752402);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a(this.f19117a, bVar.f19117a) || this.b != bVar.b || this.c != bVar.c) {
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
        List<c> list = this.f19117a;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = i * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i2 + i3) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        return i5 + i6;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveInfo(tagList=" + this.f19117a + ", exposed=" + this.b + ", bottomTag=" + this.c + riy.BRACKET_END_STR;
    }

    public b(List<c> tagList, boolean z, boolean z2) {
        q.c(tagList, "tagList");
        this.f19117a = tagList;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ b(List list, boolean z, boolean z2, int i, o oVar) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f19117a;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
