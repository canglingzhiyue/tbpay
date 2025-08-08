package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.configservice.ConfigManger;
import com.alipay.android.msp.configservice.UpdatePolicyEvaluator;
import com.alipay.android.msp.core.callback.ImageUploadCallback;
import com.alipay.android.msp.core.callback.OnContactSelectCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.ILottiePLugin;
import com.alipay.android.msp.plugin.engine.IWalletEngine;
import com.alipay.android.msp.utils.EnvUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ReflectUtil;
import com.alipay.android.msp.utils.SdkFlavor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class MspWalletImpl implements IWalletEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Typeface> f4674a = new HashMap<>();

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void addTrackerNode(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839fefde", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean autoLogin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae6574a6", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String buildPayOrderInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cba8d90d", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean checkLoginStatus(int i, Context context, String str, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b717393e", new Object[]{this, new Integer(i), context, str, new Integer(i2), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void clearCheckLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8294b87", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void commitTrackerOnTargetPage(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106cca20", new Object[]{this, str, str2, str3, map});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void dumpLogcat(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598c5aac", new Object[]{this, str, new Integer(i)});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void endSpiderBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d8f1fe", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void endSpiderSection(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c304040", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public Map<String, String> getAbTestIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("964c569c", new Object[]{this, list});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getAlipayExtok() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5edc5cbc", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getAlipayTopAppid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39203952", new Object[]{this}) : "";
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getAppMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a3c2c8b", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getAuthToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568bf35e", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public Map<String, String> getAuthUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b09daa13", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getConfigForAB(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb4b80d3", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public int getDevicePerformanceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd21db1a", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getExtractData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2522f84", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getLBSLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da6451d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getProductId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getSofaGroupName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5948b27c", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getTrId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bc6e9aa", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public JSONObject handleOpenServiceAuth(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("33f1ff18", new Object[]{this, str, new Boolean(z)});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void initAuthToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e923e08", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void initNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e852ae3", new Object[]{this, context});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isMyWebInitSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c60e1d00", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isNetworkShutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("386b0fa5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isProcessHotLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87861106", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void joinSpiderBizType(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4a6861", new Object[]{this, activity, str});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void preloadPayData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e01b98", new Object[]{this, context});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void processSharePayToFriends(Bundle bundle, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a5fa1d", new Object[]{this, bundle, activity});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void processSharePayToPhone(Bundle bundle, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ceb1ba4", new Object[]{this, bundle, activity});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String queryExistingAccounts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a678304f", new Object[]{this, list});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String readClipData(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a788325b", new Object[]{this, context, str, str2}) : str;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void registerAppBgListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8ff94a", new Object[]{this, context});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void registerCutPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b604038", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String safeDecryptLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96faf9c4", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String safeEncryptLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("597cee9c", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void selectContact(JSONObject jSONObject, OnContactSelectCallback onContactSelectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa96d08", new Object[]{this, jSONObject, onContactSelectCallback});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void showFeedbackActivity(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff5efc", new Object[]{this, bundle});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void startSpiderBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28049117", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void startSpiderSection(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f5ab19", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void unRegisterAppBgListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff208bc3", new Object[]{this, context});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void uploadBitmap(Bitmap bitmap, String str, ImageUploadCallback imageUploadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399206c5", new Object[]{this, bitmap, str, imageUploadCallback});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean useDynamicLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e23fe8bb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getAlipayLocaleDes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0c8f801", new Object[]{this}) : EnvUtil.getsCashierProvider() != null ? EnvUtil.getsCashierProvider().getLocale() : "zh-CN";
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public Activity getCurrentTopActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("b7065160", new Object[]{this}) : SdkFlavor.getCurrentTopActivity();
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isBackgroundRunning(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dea61dde", new Object[]{this, context})).booleanValue() : SdkFlavor.isBackgroundRunning();
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public void initConfigManger(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7b95d5", new Object[]{this, context});
            return;
        }
        try {
            UpdatePolicyEvaluator.getInstance(context).reset(context);
            ConfigManger.getInstance(context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public String getWalletConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b3175fe", new Object[]{this, str});
        }
        ConfigManger configManger = ConfigManger.getInstance(null);
        if (configManger == null) {
            return null;
        }
        return configManger.getConfig(str);
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean writeClipData(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d9d4c0", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText("msp:copy", str);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
                if (clipboardManager.getPrimaryClip() != null) {
                    return StringUtils.equals(clipboardManager.getPrimaryClip().getItemAt(0).getText().toString(), str);
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public boolean isUserAgednessVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa55a79", new Object[]{this, new Integer(i)})).booleanValue();
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            Map<String, String> extendParamsMap = tradeContextByBizId.getExtendParamsMap();
            if (extendParamsMap.containsKey("agednessVersion")) {
                return StringUtils.equals(extendParamsMap.get("agednessVersion"), "true");
            }
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public Typeface getTypeface(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("5b75537b", new Object[]{this, context, str, new Integer(i)});
        }
        Typeface typeface = f4674a.get(str);
        if (typeface == null) {
            try {
                String str2 = "DINPro".equalsIgnoreCase(str) ? "AlipayNumber" : str;
                AssetManager assets = context.getAssets();
                typeface = Typeface.createFromAsset(assets, str2 + ".ttf");
            } catch (Throwable th) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (mspContextByBizId != null) {
                    mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "MspWallet.getTypeface", "Typeface not found");
                }
                LogUtil.printExceptionStackTrace(th);
            }
            if (typeface != null) {
                f4674a.put(str, typeface);
            }
        }
        return typeface;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public WifiManager getWifiManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WifiManager) ipChange.ipc$dispatch("da8eaf16", new Object[]{this, context});
        }
        if (context != null && DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_GET_WIFI_CONNECT, false, context)) {
            try {
                return (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public LocationManager getLocationManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationManager) ipChange.ipc$dispatch("dfbc66e8", new Object[]{this, context});
        }
        if (context != null && DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_GET_LOCATION, false, context)) {
            try {
                return (LocationManager) context.getSystemService("location");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IWalletEngine
    public ILottiePLugin getLottiePlugin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ILottiePLugin) ipChange.ipc$dispatch("e8133c85", new Object[]{this}) : (ILottiePLugin) ReflectUtil.newInstance("com.alipay.android.msp.lottie.LottiePlugin");
    }
}
