package com.uc.webview.internal.interfaces;

import android.content.Context;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.extension.ExtImageDecoder;
import com.uc.webview.export.extension.ILocationManager;
import com.uc.webview.export.extension.IMultiProcessStatus;
import com.uc.webview.export.extension.INetworkDelegate;
import com.uc.webview.export.extension.INetworkHostingService;
import com.uc.webview.export.extension.IOfflineResourceClient;
import com.uc.webview.export.media.MediaPlayerFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface ISdk2Core extends IExtender {

    /* loaded from: classes9.dex */
    public interface IExtenderID {
        public static final int GET_JS_ROUTE_ID = 1;
        public static final int GET_SNAPSHOT_VERSION = 4;
        public static final int INIT_SNAPSHOT_WITH_DATA = 3;
        public static final int INIT_SNAPSHOT_WITH_URLS = 2;
        public static final int NOTIFY_SNAPSHOT_LOAD_RESULT = 5;
        public static final int SET_ON_SNAPSHOT_INIT_FAILED_CALLBACK = 6;
    }

    void clearClientCertPreferences(Runnable runnable);

    void clearDnsCache(String str);

    void clearHttpCache(Runnable runnable);

    void clearPrecacheResources(String[] strArr);

    void commitWpkFile(String str, Map<String, String> map, String str2, String str3, String str4, String str5);

    void commitWpkRecord(String str, Map<String, String> map, String str2, String str3);

    void computeHttpCacheSize(ValueCallback<Long> valueCallback);

    Object createJSInterface(Object obj);

    void deleteWebStorageData(String str, Runnable runnable);

    void enableJSCoverageInfo(ValueCallback<String> valueCallback);

    void generateCodeCache(Map<String, String> map, ValueCallback<Integer> valueCallback);

    void getAllUsernamePassword(Context context, ValueCallback<Map<String, String>[]> valueCallback);

    String getDefaultUserAgent(Context context);

    Object getJSRoute(Object obj);

    void getResourceFromHttpCache(String str, ValueCallback<WebResourceResponse> valueCallback);

    String getUrlFromJSInterface(Object obj);

    JSONObject getWpkConfigs();

    void initWpk(Map<String, Object> map);

    void precacheResources(Map<String, WebResourceResponse> map, Map<String, String> map2);

    void preloadResource(String str, int i, int i2, Map<String, String> map, ValueCallback<WebResourceResponse> valueCallback);

    void reloadFonts();

    void removeResourcesFromHttpCache(String[] strArr, Runnable runnable);

    void removeUserScript(String str);

    void requestExtImageDecoderResult();

    void sendMessageToJS(Object obj, Object[] objArr, ValueCallback<Boolean> valueCallback);

    void setCodeCache(String[] strArr, ValueCallback<Integer> valueCallback);

    void setExtImageDecoder(ExtImageDecoder.ExtImageDecoderParam extImageDecoderParam, ValueCallback<Integer> valueCallback, ValueCallback<Bundle> valueCallback2);

    void setGpuContextEventCallback(ValueCallback<Bundle> valueCallback);

    void setHttpCacheMaxSize(int i, ValueCallback<Boolean> valueCallback);

    void setLocationManager(ILocationManager iLocationManager);

    void setLoginDelegate(ILoginDelegate iLoginDelegate);

    void setMediaPlayerFactory(MediaPlayerFactory mediaPlayerFactory);

    void setMultiProcessStatusCallback(IMultiProcessStatus iMultiProcessStatus);

    void setNetworkDelegate(int i, INetworkDelegate iNetworkDelegate);

    void setNetworkHostingService(INetworkHostingService iNetworkHostingService);

    void setOfflineResourceClient(IOfflineResourceClient iOfflineResourceClient);

    void setStatisticListener(IStatisticListener iStatisticListener);

    void setThreadNotRespondingCallback(ValueCallback<Map<String, Object>> valueCallback);

    void setWebContentsDebuggingEnabled(boolean z);

    void setWpkCallback(Map<String, Object> map);

    void setWpkCommonCustomFields(Map<String, String> map);

    void setWpkConfigs(JSONObject jSONObject);

    void setWpkCustomData(String str, String str2, Map<String, String> map);

    void startRemoteDebugging(String str);

    void timeToCommitCoreStats();

    void updateDnsCache(String[] strArr);

    void updateUserScript(String str, HashMap<String, Object> hashMap);

    boolean wpkShouldSample(String str, String str2, double d);
}
