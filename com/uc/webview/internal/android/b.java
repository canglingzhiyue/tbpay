package com.uc.webview.internal.android;

import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import com.uc.webview.internal.interfaces.IGeolocationPermissions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class b implements IGeolocationPermissions {

    /* renamed from: a  reason: collision with root package name */
    private GeolocationPermissions f23859a = GeolocationPermissions.getInstance();

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void allow(String str) {
        this.f23859a.allow(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void clear(String str) {
        this.f23859a.clear(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void clearAll() {
        this.f23859a.clearAll();
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        this.f23859a.getAllowed(str, valueCallback);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void getOrigins(ValueCallback<Set<String>> valueCallback) {
        this.f23859a.getOrigins(valueCallback);
    }
}
