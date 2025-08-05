package com.taobao.themis.kernel.extension.page.tab;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;
import tb.sul;

/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f22530a;
    private final ArrayList<TabBarItem> b;
    private boolean c;
    private final ArrayList<sul> d;

    static {
        kge.a(326409829);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f22530a != cVar.f22530a || !q.a(this.b, cVar.b) || this.c != cVar.c || !q.a(this.d, cVar.d)) {
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
        int i2 = this.f22530a * 31;
        ArrayList<TabBarItem> arrayList = this.b;
        int hashCode = (i2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i3) * 31;
        ArrayList<sul> arrayList2 = this.d;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabBarState(selectedIndex=" + this.f22530a + ", tabBarItemModels=" + this.b + ", isBulge=" + this.c + ", tmsTabItems=" + this.d + riy.BRACKET_END_STR;
    }

    public c(int i, ArrayList<TabBarItem> tabBarItemModels, boolean z, ArrayList<sul> tmsTabItems) {
        q.d(tabBarItemModels, "tabBarItemModels");
        q.d(tmsTabItems, "tmsTabItems");
        this.f22530a = i;
        this.b = tabBarItemModels;
        this.c = z;
        this.d = tmsTabItems;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f22530a = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f22530a;
    }

    public final ArrayList<TabBarItem> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this}) : this.b;
    }

    public final ArrayList<sul> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[]{this}) : this.d;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c && this.b.size() % 2 == 1;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
