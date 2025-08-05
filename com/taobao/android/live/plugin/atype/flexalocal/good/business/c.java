package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public GoodListSearchRequest f13753a;

    static {
        kge.a(1379142156);
    }

    public c(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acce0c3", new Object[]{this, cVar, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        this.f13753a = new GoodListSearchRequest();
        this.f13753a.anchorId = cVar.m();
        this.f13753a.liveId = cVar.g();
        GoodListSearchRequest goodListSearchRequest = this.f13753a;
        goodListSearchRequest.n = i;
        goodListSearchRequest.groupNum = i2;
        goodListSearchRequest.searchWord = str;
        goodListSearchRequest.searchType = str2;
        goodListSearchRequest.transParams = cVar.w();
        this.f13753a.liveSource = cVar.v();
        this.f13753a.entryLiveSource = cVar.u();
        this.f13753a.matchNewVersion = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar) ? "1" : "0";
        a(1, this.f13753a, GoodListSearchResponse.class);
    }
}
