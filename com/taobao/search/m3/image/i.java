package com.taobao.search.m3.image;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f19114a;
    private final int b;
    private final int c;

    static {
        kge.a(-675920388);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!q.a((Object) this.f19114a, (Object) iVar.f19114a) || this.b != iVar.b || this.c != iVar.c) {
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
        String str = this.f19114a;
        if (str != null) {
            i = str.hashCode();
        }
        return (((i * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "P4pIcon(img=" + this.f19114a + ", width=" + this.b + ", height=" + this.c + riy.BRACKET_END_STR;
    }

    public i(String str, int i, int i2) {
        this.f19114a = str;
        this.b = i;
        this.c = i2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19114a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }
}
