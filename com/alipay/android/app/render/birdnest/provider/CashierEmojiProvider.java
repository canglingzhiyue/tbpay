package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierEmojiProvider implements BirdNestEngine.EmojiProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4369a;

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmojiProvider
    public String prepareContent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ef4d87d", new Object[]{this, str}) : str;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmojiProvider
    public int renderEmojiReturncount(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b923fc35", new Object[]{this, context, spannableStringBuilder, new Integer(i)})).intValue();
        }
        return 0;
    }

    public CashierEmojiProvider(ICashierProvider iCashierProvider) {
        this.f4369a = iCashierProvider;
    }
}
