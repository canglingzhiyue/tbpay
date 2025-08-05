package com.ali.user.open.device;

import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.service.StorageService;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeviceTokenManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEVICE_TOKEN_ACCOUNT = "device_token";
    private static volatile DeviceTokenManager singleton;

    private DeviceTokenManager() {
    }

    public static DeviceTokenManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenManager) ipChange.ipc$dispatch("1cfa2780", new Object[0]);
        }
        if (singleton == null) {
            synchronized (DeviceTokenManager.class) {
                if (singleton == null) {
                    singleton = new DeviceTokenManager();
                }
            }
        }
        return singleton;
    }

    public void clearDeviceToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709b5a3d", new Object[]{this});
        } else {
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue("device_token");
        }
    }

    public void removeDeviceToken(DeviceTokenAccount deviceTokenAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24f0158", new Object[]{this, deviceTokenAccount});
        } else if (deviceTokenAccount == null) {
        } else {
            try {
                ((StorageService) AliMemberSDK.getService(StorageService.class)).removeSafeToken(deviceTokenAccount.tokenKey);
                ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue("device_token");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void putDeviceToken(DeviceTokenAccount deviceTokenAccount, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d513986d", new Object[]{this, deviceTokenAccount, str});
        } else if (ConfigManager.getInstance().isSaveHistoryWithSalt() && !((StorageService) AliMemberSDK.getService(StorageService.class)).saveSafeToken(deviceTokenAccount.tokenKey, str)) {
        } else {
            ((StorageService) AliMemberSDK.getService(StorageService.class)).putDDpExValue("device_token", toJSONString(deviceTokenAccount));
        }
    }

    public DeviceTokenAccount getDeviceToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenAccount) ipChange.ipc$dispatch("697fd702", new Object[]{this});
        }
        try {
            return parseObject(((StorageService) AliMemberSDK.getService(StorageService.class)).getDDpExValue("device_token"));
        } catch (JSONException unused) {
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue("device_token");
            return null;
        }
    }

    private DeviceTokenAccount parseObject(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenAccount) ipChange.ipc$dispatch("67183751", new Object[]{this, str});
        }
        DeviceTokenAccount deviceTokenAccount = new DeviceTokenAccount();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            deviceTokenAccount.openId = jSONObject.optString("openId");
            deviceTokenAccount.tokenKey = jSONObject.optString("tokenKey");
            deviceTokenAccount.site = jSONObject.optString("site");
            deviceTokenAccount.hid = jSONObject.optString("userId");
            deviceTokenAccount.t = jSONObject.optString("t");
        }
        return deviceTokenAccount;
    }

    private String toJSONString(DeviceTokenAccount deviceTokenAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83773abd", new Object[]{this, deviceTokenAccount});
        }
        if (deviceTokenAccount != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("openId", deviceTokenAccount.openId);
                jSONObject.put("tokenKey", deviceTokenAccount.tokenKey);
                jSONObject.put("site", deviceTokenAccount.site);
                jSONObject.put("userId", deviceTokenAccount.hid);
                jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
