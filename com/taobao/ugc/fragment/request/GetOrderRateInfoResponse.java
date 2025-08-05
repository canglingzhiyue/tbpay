package com.taobao.ugc.fragment.request;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/ugc/fragment/request/GetOrderRateInfoResponse;", "Lmtopsdk/mtop/domain/BaseOutDo;", "()V", "taobaoOrderRateInfoData", "Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "getData", "setData", "", "data", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class GetOrderRateInfoResponse extends BaseOutDo {
    private OrderRateInfoData taobaoOrderRateInfoData;

    static {
        kge.a(654218613);
    }

    public final void setData(OrderRateInfoData orderRateInfoData) {
        this.taobaoOrderRateInfoData = orderRateInfoData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public OrderRateInfoData mo2429getData() {
        OrderRateInfoData orderRateInfoData = this.taobaoOrderRateInfoData;
        q.a(orderRateInfoData);
        return orderRateInfoData;
    }
}
