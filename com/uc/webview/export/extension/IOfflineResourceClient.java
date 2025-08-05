package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebResourceResponse;

/* loaded from: classes9.dex */
public abstract class IOfflineResourceClient implements IExtender {
    public static final int RESOURCE_TYPE_AOT_CACHE = 3;
    public static final int RESOURCE_TYPE_AOT_COVERAGE = 2;
    public static final int RESOURCE_TYPE_AOT_SCRIPT = 1;

    public WebResourceResponse getResource(int i, String str) {
        return null;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }
}
