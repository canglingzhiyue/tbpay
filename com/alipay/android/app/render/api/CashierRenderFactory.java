package com.alipay.android.app.render.api;

import com.alipay.android.app.render.api.ext.BirdNestRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierRenderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static BirdNestRender create() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestRender) ipChange.ipc$dispatch("c4cc73c4", new Object[0]) : new BirdNestRender();
    }
}
