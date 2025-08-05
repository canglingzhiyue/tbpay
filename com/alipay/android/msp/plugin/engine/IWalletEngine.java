package com.alipay.android.msp.plugin.engine;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.ImageUploadCallback;
import com.alipay.android.msp.core.callback.OnContactSelectCallback;
import com.alipay.android.msp.plugin.ILottiePLugin;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IWalletEngine {
    void addTrackerNode(String str, String str2, String str3);

    boolean autoLogin(int i);

    String buildPayOrderInfo(String str);

    boolean checkLoginStatus(int i, Context context, String str, int i2, boolean z);

    void clearCheckLoginStatus();

    void commitTrackerOnTargetPage(String str, String str2, String str3, Map<String, String> map);

    void dumpLogcat(String str, int i);

    void endSpiderBizType(String str);

    void endSpiderSection(String str, String str2);

    Map<String, String> getAbTestIds(List<String> list);

    String getAlipayExtok();

    String getAlipayLocaleDes();

    String getAlipayTopAppid();

    String getAppMode();

    String getAuthToken();

    Map<String, String> getAuthUserInfo();

    String getConfigForAB(String str, String str2);

    Activity getCurrentTopActivity();

    int getDevicePerformanceLevel();

    String getExtractData();

    String getLBSLocation();

    LocationManager getLocationManager(Context context);

    ILottiePLugin getLottiePlugin();

    String getProductId();

    String getSofaGroupName(Context context);

    String getTrId();

    Typeface getTypeface(Context context, String str, int i);

    String getUserId();

    String getWalletConfig(String str);

    WifiManager getWifiManager(Context context);

    JSONObject handleOpenServiceAuth(String str, boolean z);

    void initAuthToken();

    void initConfigManger(Context context);

    void initNetwork(Context context);

    boolean isBackgroundRunning(Context context);

    boolean isLowDevice();

    boolean isMyWebInitSuccess();

    boolean isNetworkShutdown();

    boolean isProcessHotLaunch();

    boolean isUserAgednessVersion(int i);

    void joinSpiderBizType(Activity activity, String str);

    void preloadPayData(Context context);

    void processSharePayToFriends(Bundle bundle, Activity activity);

    void processSharePayToPhone(Bundle bundle, Activity activity);

    String queryExistingAccounts(List<String> list);

    String readClipData(Context context, String str, String str2);

    void registerAppBgListener(Context context);

    void registerCutPoint();

    String safeDecryptLocal(String str);

    String safeEncryptLocal(String str);

    void selectContact(JSONObject jSONObject, OnContactSelectCallback onContactSelectCallback);

    void showFeedbackActivity(Bundle bundle);

    void startSpiderBizType(String str);

    void startSpiderSection(String str, String str2);

    void unRegisterAppBgListener(Context context);

    void uploadBitmap(Bitmap bitmap, String str, ImageUploadCallback imageUploadCallback);

    boolean useDynamicLanguage();

    boolean writeClipData(Context context, String str, String str2);
}
