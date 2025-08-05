package com.taobao.ugc.fragment.request;

import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/taobao/ugc/fragment/request/GetOrderRateInfoRequest;", "Lmtopsdk/mtop/domain/MtopRequest;", "()V", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class GetOrderRateInfoRequest extends MtopRequest {
    static {
        kge.a(1127774939);
    }

    public GetOrderRateInfoRequest() {
        setApiName("mtop.createrate.getOrderRateInfo");
        setVersion("2.0");
        setNeedEcode(true);
        setNeedSession(true);
    }
}
