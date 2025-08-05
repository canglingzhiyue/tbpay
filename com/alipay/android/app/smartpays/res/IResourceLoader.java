package com.alipay.android.app.smartpays.res;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface IResourceLoader {
    int getDrawableId(String str);

    int getId(String str);

    int getLayoutId(String str);

    Drawable getPaddingDrawable(int i, int i2, Context context);

    int getResourceId(String str, String str2);

    int getStringId(String str);
}
