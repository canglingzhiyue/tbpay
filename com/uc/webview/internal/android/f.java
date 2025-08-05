package com.uc.webview.internal.android;

import android.webkit.MimeTypeMap;
import com.uc.webview.internal.interfaces.IMimeTypeMap;

/* loaded from: classes9.dex */
public final class f implements IMimeTypeMap {

    /* renamed from: a  reason: collision with root package name */
    private MimeTypeMap f23862a = MimeTypeMap.getSingleton();

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getExtensionFromMimeType(String str) {
        return this.f23862a.getExtensionFromMimeType(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getFileExtensionFromUrlEx(String str) {
        return MimeTypeMap.getFileExtensionFromUrl(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getMimeTypeFromExtension(String str) {
        return this.f23862a.getMimeTypeFromExtension(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final boolean hasExtension(String str) {
        return this.f23862a.hasExtension(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final boolean hasMimeType(String str) {
        return this.f23862a.hasMimeType(str);
    }
}
