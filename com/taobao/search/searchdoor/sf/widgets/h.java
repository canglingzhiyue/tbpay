package com.taobao.search.searchdoor.sf.widgets;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f19393a;

    static {
        kge.a(604462399);
    }

    public h(String searchText) {
        q.c(searchText, "searchText");
        this.f19393a = searchText;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19393a;
    }
}
