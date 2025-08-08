package com.alipay.android.msp.utils;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.settings.base.SettingsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RedDotUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static JSONObject sSettingsRedDot;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            loadSp();
        }
    }

    public static boolean isShow(String str, int i, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c991d879", new Object[]{str, new Integer(i), str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2) || (jSONObject = sSettingsRedDot) == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return !StringUtils.equals(jSONObject.getJSONArray(str).getString(i), str2);
    }

    public static void setRedDotToken(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2da829d", new Object[]{str, new Integer(i), str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            if (sSettingsRedDot == null) {
                sSettingsRedDot = new JSONObject();
            }
            JSONArray jSONArray = null;
            try {
                jSONArray = sSettingsRedDot.getJSONArray(str);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            try {
                jSONArray.put(i, str2);
                sSettingsRedDot.put(str, jSONArray);
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
            saveSp();
        }
    }

    private static void loadSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cb08ea", new Object[0]);
            return;
        }
        try {
            sSettingsRedDot = new JSONObject(PrefUtils.getString(SettingsConstants.SP_FILE, "redDot", "{}"));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            sSettingsRedDot = null;
        }
    }

    private static void saveSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6df841", new Object[0]);
            return;
        }
        try {
            if (sSettingsRedDot == null) {
                return;
            }
            PrefUtils.putString(SettingsConstants.SP_FILE, "redDot", sSettingsRedDot.toString());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
