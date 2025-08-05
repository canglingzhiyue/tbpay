package com.uc.webview.export.extension;

import android.content.Context;
import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebResourceResponse;
import java.util.Map;

/* loaded from: classes9.dex */
public final class StorageUtils {
    private static final String TAG = "StorageUtils";

    public static void clearDnsCache(String str) {
        try {
            Sdk2CoreHost.impl().clearDnsCache(str);
        } catch (Throwable th) {
            Log.w(TAG, "clearDnsCache falied", th);
        }
    }

    public static void clearHttpCache(Runnable runnable) {
        try {
            Sdk2CoreHost.impl().clearHttpCache(runnable);
        } catch (Throwable th) {
            Log.w(TAG, "clearHttpCache failed", th);
        }
    }

    public static void clearPrecacheResources(String[] strArr) {
        try {
            Sdk2CoreHost.impl().clearPrecacheResources(strArr);
        } catch (Throwable th) {
            Log.w(TAG, "clearPrecacheResources failed", th);
        }
    }

    public static void computeHttpCacheSize(ValueCallback<Long> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        try {
            Sdk2CoreHost.impl().computeHttpCacheSize(valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "computeHttpCacheSize failed", th);
        }
    }

    public static void deleteWebStorageData(String str, Runnable runnable) {
        if (str == null && runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                Log.w(TAG, "deleteWebStorageData falied", th);
                return;
            }
        }
        Sdk2CoreHost.impl().deleteWebStorageData(str, runnable);
    }

    public static void getAllUsernamePassword(Context context, ValueCallback<Map<String, String>[]> valueCallback) {
        try {
            Sdk2CoreHost.impl().getAllUsernamePassword(context, valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "getAllUsernamePassword falied", th);
        }
    }

    public static void getResourceFromHttpCache(String str, ValueCallback<WebResourceResponse> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        try {
            Sdk2CoreHost.impl().getResourceFromHttpCache(str, valueCallback);
        } catch (Throwable th) {
            Log.e(TAG, "getResourceFromHttpCache failed", th);
        }
    }

    public static void precacheResources(Map<String, WebResourceResponse> map, Map<String, String> map2) {
        try {
            Sdk2CoreHost.impl().precacheResources(map, map2);
        } catch (Throwable th) {
            Log.w(TAG, "precacheResources failed", th);
        }
    }

    public static void preloadResource(String str, int i, int i2, Map<String, String> map, ValueCallback<WebResourceResponse> valueCallback) {
        try {
            Sdk2CoreHost.impl().preloadResource(str, i, i2, map, valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "preloadResource falied", th);
        }
    }

    public static void reloadFonts() {
        try {
            Sdk2CoreHost.impl().reloadFonts();
        } catch (Throwable th) {
            Log.w(TAG, "reloadFonts falied", th);
        }
    }

    public static void removeResourcesFromHttpCache(String[] strArr, Runnable runnable) {
        try {
            Sdk2CoreHost.impl().removeResourcesFromHttpCache(strArr, runnable);
        } catch (Throwable th) {
            Log.w(TAG, "removeResourcesFromHttpCache falied", th);
        }
    }

    public static void setHttpCacheMaxSize(int i, ValueCallback<Boolean> valueCallback) {
        try {
            Sdk2CoreHost.impl().setHttpCacheMaxSize(i, valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "setHttpCacheMaxSize falied", th);
        }
    }

    public static void setOfflineResourceClient(IOfflineResourceClient iOfflineResourceClient) {
        try {
            Sdk2CoreHost.impl().setOfflineResourceClient(iOfflineResourceClient);
        } catch (Throwable th) {
            Log.w(TAG, "setOfflineResourceClient falied", th);
        }
    }

    public static void updateDnsCache(String[] strArr) {
        try {
            Sdk2CoreHost.impl().updateDnsCache(strArr);
        } catch (Throwable th) {
            Log.w(TAG, "updateDnsCache failed", th);
        }
    }
}
