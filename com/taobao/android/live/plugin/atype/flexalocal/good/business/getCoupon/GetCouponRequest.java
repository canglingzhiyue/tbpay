package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class GetCouponRequest implements INetDataObject {
    public String API_NAME = "mtop.taobao.buyerresourcemtopwriteservice.applycoupon";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String VERSION = "3.0";
    public String couponInstanceSource;
    public String querySource;
    public String supplierId;
    public String uuid;

    static {
        kge.a(174675599);
        kge.a(-540945145);
    }
}
