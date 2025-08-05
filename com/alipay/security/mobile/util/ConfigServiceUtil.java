package com.alipay.security.mobile.util;

import com.alibaba.fastjson.JSONObject;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes3.dex */
public class ConfigServiceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AIDL_MANAGER_SWITCH = "AIDL_MANAGER_SWITCH";
    public static final String KEY_AIDL_WAIT_TIME_CONFIG = "AIDL_WAIT_TIME_CONFIG";
    public static final String KEY_BIO_NEW_UI = "IFAA_BIO_NEW_UI";
    public static final String KEY_BIO_NEW_UI_COMPAT = "IFAA_BIO_NEW_UI_COMPAT";
    public static final String KEY_FACE_ID_UI_RALL_BACK = "FACE_ID_UI_ROLL_BACK";
    public static final String KEY_IFAA_BIO_BEHAVIOR_LOG = "IFAA_BIO_BEHAVIOR_LOG";
    public static final String KEY_IFAA_DI_MAX_LENGTH = "IFAA_DI_MAX_LENGTH";
    public static final String KEY_IFAA_SILENT_REG = "IFAA_SILENT_REG";
    public static final String KEY_IGNORE_FP = "IFAA_IGNORE_FP";
    public static final String KEY_NEED_KM_PROTECT_IFAA = "NEED_KM_PROTECT_IFAA";
    public static final String KEY_SECCAM_H5_FACE_SWITCH = "SECCAM_H5_FACE_SWITCH";

    public static synchronized String syncConfigMode(String str, String str2) {
        synchronized (ConfigServiceUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b427ae5", new Object[]{str, str2});
            }
            try {
                AuthenticatorLOG.fpInfo("ConfigServiceUtil :: synConfigMode key = " + str + " defaultValue = " + str2);
                String customConfig = OrangeConfig.getInstance().getCustomConfig(str, str2);
                StringBuilder sb = new StringBuilder();
                sb.append("ConfigServiceUtil :: synConfigMode value = ");
                sb.append(customConfig);
                AuthenticatorLOG.fpInfo(sb.toString());
                return customConfig;
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo("taobao fp synConfigMode error! e = " + e);
                return "";
            }
        }
    }

    public static synchronized Map<String, Object> getConfig(String str) {
        synchronized (ConfigServiceUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8dd8e53e", new Object[]{str});
            }
            String syncConfigMode = syncConfigMode(str, "");
            if (CommonUtils.isBlank(syncConfigMode)) {
                return null;
            }
            try {
                return JSONObject.parseObject(syncConfigMode);
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo("ConfigServiceUtil :: json2Map error e = " + e);
                return null;
            }
        }
    }
}
