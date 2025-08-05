package com.uc.webview.export;

import android.webkit.ValueCallback;
import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IGeolocationPermissions;
import java.util.HashMap;
import java.util.Set;
import tb.riy;

/* loaded from: classes9.dex */
public class GeolocationPermissions implements IGeolocationPermissions {
    private static HashMap<Integer, GeolocationPermissions> sInstances;
    private IGeolocationPermissions mPermissions;

    /* loaded from: classes9.dex */
    public interface Callback {
        void invoke(String str, boolean z, boolean z2);
    }

    private GeolocationPermissions(IGeolocationPermissions iGeolocationPermissions) {
        this.mPermissions = iGeolocationPermissions;
    }

    public static GeolocationPermissions getInstance() throws RuntimeException {
        return getInstance(e.a());
    }

    private static synchronized GeolocationPermissions getInstance(int i) throws RuntimeException {
        GeolocationPermissions geolocationPermissions;
        synchronized (GeolocationPermissions.class) {
            if (sInstances == null) {
                sInstances = new HashMap<>();
            }
            geolocationPermissions = sInstances.get(Integer.valueOf(i));
            if (geolocationPermissions == null) {
                geolocationPermissions = new GeolocationPermissions(b.c(i));
                sInstances.put(Integer.valueOf(i), geolocationPermissions);
            }
        }
        return geolocationPermissions;
    }

    public static GeolocationPermissions getInstance(WebView webView) throws RuntimeException {
        return getInstance(webView.getCurrentViewCoreType());
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public void allow(String str) {
        this.mPermissions.allow(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public void clear(String str) {
        this.mPermissions.clear(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public void clearAll() {
        this.mPermissions.clearAll();
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        this.mPermissions.getAllowed(str, valueCallback);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public void getOrigins(ValueCallback<Set<String>> valueCallback) {
        this.mPermissions.getOrigins(valueCallback);
    }

    public String toString() {
        return "GeolocationPermissions@" + hashCode() + riy.ARRAY_START_STR + this.mPermissions + riy.ARRAY_END_STR;
    }
}
