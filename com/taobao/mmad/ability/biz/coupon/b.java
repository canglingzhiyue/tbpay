package com.taobao.mmad.ability.biz.coupon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18101a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(550147951);
    }

    public b(BaseMmAdModel baseMmAdModel) {
        this.f18101a = baseMmAdModel.benefitType;
        this.b = baseMmAdModel.benefitId;
        this.c = baseMmAdModel.benefitQuerySource;
        this.d = baseMmAdModel.benefitSource;
        this.e = baseMmAdModel.benefitSupplier;
        this.f = baseMmAdModel.benefitStrategyCode;
        this.g = baseMmAdModel.benefitSafeCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ReceiveCouponModel{benefitType='" + this.f18101a + "', benefitId='" + this.b + "', benefitQuerySource='" + this.c + "', benefitSource='" + this.d + "', benefitSupplier='" + this.e + "', benefitStrategyCode='" + this.f + "', asac='" + this.g + "'}";
    }
}
