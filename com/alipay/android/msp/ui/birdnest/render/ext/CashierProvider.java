package com.alipay.android.msp.ui.birdnest.render.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.msp.core.callback.ImageLoadCallback;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class CashierProvider implements ICashierProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public void destroyWebView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88107f4c", new Object[]{this, view});
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public void loadData(View view, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8167bcd9", new Object[]{this, view, str, str2, str3});
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public void loadUrlWithWebView(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3512f2b", new Object[]{this, view, str});
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public void openWebPage(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d82ade", new Object[]{this, str, context});
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : PhoneCashierMspEngine.getMspBase().getContext();
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, final BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8625300e", new Object[]{this, view, str, new Integer(i), new Integer(i2), drawable, drawable2, new Integer(i3), new Boolean(z), callback, bundle});
        }
        ImageLoader.ClipsInfo clipsInfo = new ImageLoader.ClipsInfo();
        clipsInfo.setWh(new int[]{i, i2});
        clipsInfo.setClipsType(ImageLoader.ClipsType.None);
        ImageLoader.loadImage(view, str, false, z, clipsInfo, getContext(), new ImageLoadCallback() { // from class: com.alipay.android.msp.ui.birdnest.render.ext.CashierProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
            public void onLoadSuccess(int i4, int i5, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i4), new Integer(i5), obj});
                    return;
                }
                BirdNestEngine.ResourceProvider.Callback callback2 = callback;
                if (callback2 == null) {
                    return;
                }
                callback2.onLoadSuccess(i4, i5, obj);
            }

            @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
            public void onLoadFailure(int i4, int i5, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i4), new Integer(i5), obj});
                    return;
                }
                BirdNestEngine.ResourceProvider.Callback callback2 = callback;
                if (callback2 == null) {
                    return;
                }
                callback2.onLoadFailure(i4, i5, obj);
            }
        });
        return null;
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public View createWebView(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d726c0b", new Object[]{this, context, str, loadUrlListener, map});
        }
        WebView webView = new WebView(context);
        try {
            if (Build.VERSION.SDK_INT <= 18) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibilityTraversal");
                webView.removeJavascriptInterface("accessibility");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return webView;
    }

    @Override // com.alipay.android.app.render.api.ICashierProvider
    public void createWebViewAsync(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map, BirdNestEngine.UiWidgetProvider.CreateCallback createCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91e568f", new Object[]{this, context, str, loadUrlListener, map, createCallback});
            return;
        }
        View createWebView = createWebView(context, str, loadUrlListener, map);
        if (createCallback == null) {
            return;
        }
        createCallback.onSuccess(createWebView, null);
    }
}
