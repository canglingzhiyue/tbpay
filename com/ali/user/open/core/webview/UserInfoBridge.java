package com.ali.user.open.core.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ali.user.open.core.callback.DataProvider;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.util.CommonUtils;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class UserInfoBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1948238376);
    }

    @BridgeMethod
    public void getInfoByNative(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c54f77", new Object[]{this, bridgeCallbackContext, str});
        } else if (bridgeCallbackContext == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                DataProvider loginEntrenceCallback = ConfigManager.getInstance().getLoginEntrenceCallback();
                if (loginEntrenceCallback != null) {
                    jSONObject.put("loginEntrance", loginEntrenceCallback.getLoginEntrance());
                }
                bridgeCallbackContext.success(jSONObject.toString());
            } catch (Throwable th) {
                bridgeCallbackContext.onFailure(1001, th.getMessage());
            }
        }
    }

    @BridgeMethod
    public void getUIMode(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c373392", new Object[]{this, bridgeCallbackContext, str});
        } else if (bridgeCallbackContext == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mode", CommonUtils.getDarkModeStatus(KernelContext.applicationContext) ? BlobManager.SUB_TYPE_DARK : "Light");
                bridgeCallbackContext.success(jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
                bridgeCallbackContext.onFailure(1001, e.getMessage());
            }
        }
    }

    @BridgeMethod
    public void isAppsInstalled(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30e4903", new Object[]{this, bridgeCallbackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            JSONObject jSONObject2 = new JSONObject();
            PackageManager packageManager = KernelContext.getApplicationContext().getPackageManager();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(jSONObject.getJSONObject(next).optString("android"), 0);
                    } catch (Exception unused) {
                    }
                    jSONObject2.put(next, packageInfo == null ? "0" : "1");
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2.put(next, "0");
                }
            }
            bridgeCallbackContext.success(jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
            bridgeCallbackContext.onFailure(1001, e2.getMessage());
        }
    }

    @BridgeMethod
    public final void getNetworkType(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764ed437", new Object[]{this, bridgeCallbackContext, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = KernelContext.getApplicationContext();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            jSONObject2.optBoolean("wifiStatus", false);
            jSONObject2.optBoolean("wifiList", false);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                jSONObject.put("type", "NONE");
                bridgeCallbackContext.success(jSONObject.toString());
            } else if (activeNetworkInfo.getType() == 1) {
                jSONObject.put("type", "WIFI");
                bridgeCallbackContext.success(jSONObject.toString());
            } else {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                        jSONObject.put("message", "GPRS");
                        jSONObject.put("type", "2G");
                        break;
                    case 2:
                        jSONObject.put("message", "EDGE");
                        jSONObject.put("type", "2G");
                        break;
                    case 3:
                        jSONObject.put("message", "UMTS");
                        jSONObject.put("type", "3G");
                        break;
                    case 4:
                        jSONObject.put("message", "CDMA");
                        jSONObject.put("type", "2G");
                        break;
                    case 5:
                        jSONObject.put("message", "EVDO_0");
                        jSONObject.put("type", "3G");
                        break;
                    case 6:
                        jSONObject.put("message", "EVDO_A");
                        jSONObject.put("type", "3G");
                        break;
                    case 7:
                        jSONObject.put("message", "1xRTT");
                        jSONObject.put("type", "2G");
                        break;
                    case 8:
                        jSONObject.put("message", "HSDPA");
                        jSONObject.put("type", "3G");
                        break;
                    case 9:
                        jSONObject.put("message", "HSUPA");
                        jSONObject.put("type", "3G");
                        break;
                    case 10:
                        jSONObject.put("message", "HSPA");
                        jSONObject.put("type", "3G");
                        break;
                    case 11:
                        jSONObject.put("message", "IDEN");
                        jSONObject.put("type", "2G");
                        break;
                    case 12:
                        jSONObject.put("message", "EVDO_B");
                        jSONObject.put("type", "3G");
                        break;
                    case 13:
                        jSONObject.put("message", "LTE");
                        jSONObject.put("type", "4G");
                        break;
                    case 14:
                        jSONObject.put("message", "EHRPD");
                        jSONObject.put("type", "3G");
                        break;
                    case 15:
                        jSONObject.put("message", "HSPAP");
                        jSONObject.put("type", "3G");
                        break;
                    default:
                        jSONObject.put("type", "UNKNOWN");
                        break;
                }
                bridgeCallbackContext.success(jSONObject.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            bridgeCallbackContext.onFailure(1001, e.getMessage());
        }
    }
}
