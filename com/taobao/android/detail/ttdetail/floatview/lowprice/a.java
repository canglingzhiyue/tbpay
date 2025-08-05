package com.taobao.android.detail.ttdetail.floatview.lowprice;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.snb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoApiRequestClient;", "Lcom/taobao/android/detail/ttdetail/request/client/MtopRequestClient;", "Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceRequestParams;", "lowPriceRequestParams", "(Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceRequestParams;)V", "getApiName", "", "getApiVersion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class a extends snb<LowPriceRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1114747516);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LowPriceRequestParams lowPriceRequestParams) {
        super(lowPriceRequestParams);
        q.c(lowPriceRequestParams, "lowPriceRequestParams");
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : ((LowPriceRequestParams) this.b).getMApiName();
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : ((LowPriceRequestParams) this.b).getMApiVersion();
    }
}
