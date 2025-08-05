package com.taobao.mmad.ability.biz.coupon;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class CouponApplyRequest implements IMTOPDataObject {
    public String asac;
    public String benefitId;
    public String benefitQuerySource;
    public String benefitSource;
    public String benefitStrategyCode;
    public String benefitSupplier;
    public String benefitType;
    public String API_NAME = "mtop.alimama.bulgari.coupon.issue";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-1019431370);
        kge.a(-350052935);
    }
}
