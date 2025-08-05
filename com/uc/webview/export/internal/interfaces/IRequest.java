package com.uc.webview.export.internal.interfaces;

import java.util.Map;

@Deprecated
/* loaded from: classes9.dex */
public interface IRequest {
    void cancel();

    EventHandler getEventHandler();

    Map<String, String> getHeaders();

    boolean getIsUCProxy();

    int getLoadtype();

    String getMethod();

    int getRequestType();

    Map<String, String> getUCHeaders();

    Map<String, byte[]> getUploadDataMap();

    Map<String, String> getUploadFileMap();

    long getUploadFileTotalLen();

    String getUrl();

    void handleSslErrorResponse(boolean z);

    void setEventHandler(EventHandler eventHandler);

    void waitUntilComplete(int i);
}
