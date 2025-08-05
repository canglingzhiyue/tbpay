package com.alipay.android.app.render.birdnest.provider;

import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierIdProvider implements BirdNestEngine.IdProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4370a;

    public CashierIdProvider(ICashierProvider iCashierProvider) {
        this.f4370a = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.IdProvider
    public int getUniqueResId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4376e2d8", new Object[]{this, str})).intValue() : ResUtils.getStringId(str);
    }
}
