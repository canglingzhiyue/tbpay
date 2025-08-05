package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierEmbedTemplateProvider implements BirdNestEngine.EmbedTemplateProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4368a;

    public CashierEmbedTemplateProvider(ICashierProvider iCashierProvider) {
        this.f4368a = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmbedTemplateProvider
    public String getTemplate(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe26a945", new Object[]{this, context, str});
        }
        return null;
    }
}
