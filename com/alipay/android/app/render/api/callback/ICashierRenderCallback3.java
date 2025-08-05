package com.alipay.android.app.render.api.callback;

import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface ICashierRenderCallback3 extends ICashierRenderCallback {
    Object getStatisticAgent();

    void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str);

    void onEvent(Object obj, String str);
}
