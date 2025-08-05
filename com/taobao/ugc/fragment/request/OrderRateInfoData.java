package com.taobao.ugc.fragment.request;

import com.ut.share.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "Lmtopsdk/mtop/domain/IMTOPDataObject;", "()V", "isTmall", "", "()Z", "orderType", "", "getOrderType", "()Ljava/lang/String;", "setOrderType", "(Ljava/lang/String;)V", Constants.WEIBO_REDIRECTURL_KEY, "getRedirectUrl", "setRedirectUrl", "sellerId", "getSellerId", "setSellerId", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public class OrderRateInfoData implements IMTOPDataObject {
    private String orderType;
    private String redirectUrl;
    private String sellerId;

    static {
        kge.a(-898179848);
        kge.a(-350052935);
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final void setSellerId(String str) {
        this.sellerId = str;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public final boolean isTmall() {
        return q.a((Object) "2", (Object) this.orderType);
    }
}
