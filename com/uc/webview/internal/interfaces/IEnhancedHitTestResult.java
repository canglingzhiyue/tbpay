package com.uc.webview.internal.interfaces;

import android.graphics.Rect;
import com.uc.webview.base.IExtender;
import com.uc.webview.internal.interfaces.IWebView;

/* loaded from: classes9.dex */
public interface IEnhancedHitTestResult extends IExtender, IWebView.IHitTestResult {
    public static final int DOWNLOAD_TEXT_TYPE = 24;
    public static final int PASSWORD_TYPE = 22;
    public static final int PHONE_TEXT_TYPE = 23;
    public static final int PLUGIN_TYPE = 21;

    boolean canEnterPictureMode();

    String getAnchorText();

    Rect getBoundingClientRect();

    String getImageUrl();

    String getLinkUrl();

    boolean hasImage();

    boolean imageIsLoaded();

    boolean imageIsVisible();
}
