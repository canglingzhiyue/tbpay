package com.taobao.bootimage.data;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageCouponApplyRequest implements IMTOPDataObject {
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
        kge.a(1991728388);
        kge.a(-350052935);
    }
}
