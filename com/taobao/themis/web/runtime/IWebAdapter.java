package com.taobao.themis.web.runtime;

import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebResourceRequest;

/* loaded from: classes9.dex */
public interface IWebAdapter extends com.taobao.themis.kernel.basic.a {
    void registerPlugins();

    boolean shouldOverrideUrlLoading(ITMSPage iTMSPage, WebResourceRequest webResourceRequest);
}
