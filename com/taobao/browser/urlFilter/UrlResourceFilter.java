package com.taobao.browser.urlFilter;

import com.uc.webview.export.WebResourceResponse;

/* loaded from: classes6.dex */
public interface UrlResourceFilter {
    WebResourceResponse doFilter(String str);

    boolean match(String str);
}
