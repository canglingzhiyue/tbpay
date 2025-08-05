package com.alipay.android.app.smartpays.api;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface IResourceProvider {
    Context getContext();

    String getPackageName();

    Resources getResources();
}
