package com.taobao.search.searchdoor.sf.widgets;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nqh;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SearchDoorContext f19369a;
    private b b;
    private nqh c;
    private boolean d = true;

    static {
        kge.a(-369625933);
    }

    public e(SearchDoorContext searchDoorContext, b bVar, nqh nqhVar) {
        this.f19369a = searchDoorContext;
        this.b = bVar;
        this.c = nqhVar;
    }

    public SearchDoorContext a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchDoorContext) ipChange.ipc$dispatch("30396e97", new Object[]{this}) : this.f19369a;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("101976cf", new Object[]{this}) : this.b;
    }

    public nqh c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nqh) ipChange.ipc$dispatch("1e6ba577", new Object[]{this}) : this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
