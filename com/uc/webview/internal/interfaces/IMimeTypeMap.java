package com.uc.webview.internal.interfaces;

/* loaded from: classes9.dex */
public interface IMimeTypeMap {
    String getExtensionFromMimeType(String str);

    String getFileExtensionFromUrlEx(String str);

    String getMimeTypeFromExtension(String str);

    boolean hasExtension(String str);

    boolean hasMimeType(String str);
}
