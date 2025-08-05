package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public interface IWebSettingsExtension extends IExtender {
    boolean getKeywordHyperlinkEnabled();

    void setBlockNavigationPattern(int i, String str);

    void setDisableBlinkFeatureStopInBackground(boolean z);

    void setExportWebViewHashCode(int i);

    void setExposeMainFrameCallingStack(boolean z);

    void setForceUserSelect(boolean z);

    void setKeywordHyperlinkEnabled(boolean z);

    void setWebCompassInfo(boolean z, String str);
}
