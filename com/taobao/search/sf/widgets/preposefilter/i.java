package com.taobao.search.sf.widgets.preposefilter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.preposefilter.perf.OriginPreposeFilterBean;
import com.taobao.search.sf.widgets.preposefilter.perf.RecyclerPreposeFilterBean;
import tb.kge;

/* loaded from: classes8.dex */
public class i extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1997595474);
    }

    @Override // com.taobao.search.sf.widgets.preposefilter.e, com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_prepose_filter_new";
    }

    @Override // com.taobao.search.sf.widgets.preposefilter.e
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.search.sf.widgets.preposefilter.e
    public /* synthetic */ RecyclerPreposeFilterBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerPreposeFilterBean) ipChange.ipc$dispatch("d13c6417", new Object[]{this}) : f();
    }

    @Override // com.taobao.search.sf.widgets.preposefilter.e, com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : f();
    }

    public i(boolean z) {
        super(z);
    }

    public OriginPreposeFilterBean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OriginPreposeFilterBean) ipChange.ipc$dispatch("6b490203", new Object[]{this}) : new OriginPreposeFilterBean();
    }
}
