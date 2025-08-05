package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;
import tb.snb;

/* loaded from: classes5.dex */
public class a extends snb<SearchRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-419404666);
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.relationrecommend.wirelessrecommend.recommend";
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "2.0";
    }

    @Override // tb.snb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "UNIT_GUIDE";
    }

    public a(SearchRequestParams searchRequestParams) {
        super(searchRequestParams);
    }

    @Override // tb.snb
    public MethodEnum d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("27517117", new Object[]{this}) : MethodEnum.POST;
    }
}
