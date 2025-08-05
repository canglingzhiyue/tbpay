package com.alipay.android.app.render.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface ICashierProvider {
    View createWebView(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map);

    void createWebViewAsync(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map, BirdNestEngine.UiWidgetProvider.CreateCallback createCallback);

    void destroyWebView(View view);

    Context getContext();

    Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle);

    void loadData(View view, String str, String str2, String str3);

    void loadUrlWithWebView(View view, String str);

    void openWebPage(String str, Context context);
}
