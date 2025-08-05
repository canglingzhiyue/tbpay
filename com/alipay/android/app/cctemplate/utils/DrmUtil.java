package com.alipay.android.app.cctemplate.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class DrmUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isDrmDegraded(Context context, String str, boolean z, boolean z2) {
        StringBuilder sb;
        try {
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::isDrmDegraded", "获取 DRM 开关时发生异常，返回 " + z2);
                sb = new StringBuilder("获取 DRM 开关 ");
            } finally {
                LogUtils.record(2, "DrmUtil::isDrmDegraded", "获取 DRM 开关 " + str + "，返回 " + z2);
            }
        }
        if (context == null) {
            LogUtils.record(2, "DrmUtil::isDrmDegraded", "Context 为空");
            return z2;
        }
        Class<?> cls = Class.forName("com.alipay.android.msp.framework.drm.DrmManager");
        z2 = ((Boolean) cls.getMethod("isDegrade", String.class, Boolean.TYPE, Context.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), str, Boolean.valueOf(z), context)).booleanValue();
        sb = new StringBuilder("获取 DRM 开关 ");
        sb.append(str);
        sb.append("，返回 ");
        sb.append(z2);
        LogUtils.record(2, "DrmUtil::isDrmDegraded", sb.toString());
        return z2;
    }

    public static boolean isDrmGray(Context context, String str, boolean z, boolean z2) {
        StringBuilder sb;
        try {
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::isDrmGray", "获取 DRM 开关时发生异常，返回 " + z2);
                sb = new StringBuilder("获取 DRM 开关 ");
            } finally {
                LogUtils.record(2, "DrmUtil::isDrmGray", "获取 DRM 开关 " + str + "，返回 " + z2);
            }
        }
        if (context == null) {
            LogUtils.record(2, "DrmUtil::isDrmGray", "Context 为空");
            return z2;
        }
        Class<?> cls = Class.forName("com.alipay.android.msp.framework.drm.DrmManager");
        z2 = ((Boolean) cls.getMethod("isGray", String.class, Boolean.TYPE, Context.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), str, Boolean.valueOf(z), context)).booleanValue();
        sb = new StringBuilder("获取 DRM 开关 ");
        sb.append(str);
        sb.append("，返回 ");
        sb.append(z2);
        LogUtils.record(2, "DrmUtil::isDrmGray", sb.toString());
        return z2;
    }

    public static JSONObject getDrmValueFromKey(Context context, String str, JSONObject jSONObject) {
        String str2 = "null";
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", "Context 为空");
                return jSONObject;
            }
            Class<?> cls = Class.forName("com.alipay.android.msp.framework.drm.DrmManager");
            JSONObject jSONObject2 = (JSONObject) cls.getMethod("getDrmValueFromKey", String.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), str);
            StringBuilder sb = new StringBuilder("获取 DRM 开关 ");
            sb.append(str);
            sb.append("，返回 ");
            if (jSONObject2 != null) {
                str2 = jSONObject2.toJSONString();
            }
            sb.append(str2);
            LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb.toString());
            return jSONObject2;
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                StringBuilder sb2 = new StringBuilder("获取 DRM 开关时发生异常，返回 ");
                sb2.append(jSONObject == null ? str2 : jSONObject.toJSONString());
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb2.toString());
                StringBuilder sb3 = new StringBuilder("获取 DRM 开关 ");
                sb3.append(str);
                sb3.append("，返回 ");
                if (jSONObject != null) {
                    str2 = jSONObject.toJSONString();
                }
                sb3.append(str2);
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb3.toString());
                return jSONObject;
            } finally {
                StringBuilder sb4 = new StringBuilder("获取 DRM 开关 ");
                sb4.append(str);
                sb4.append("，返回 ");
                if (jSONObject != null) {
                    str2 = jSONObject.toJSONString();
                }
                sb4.append(str2);
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb4.toString());
            }
        }
    }

    public static String getRawDrmValueFromKey(Context context, String str, String str2) {
        String str3 = "null";
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", "Context 为空");
                StringBuilder sb = new StringBuilder("获取 DRM 开关 ");
                sb.append(str);
                sb.append("，返回 ");
                if (str2 != null) {
                    str3 = str2;
                }
                sb.append(str3);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb.toString());
                return str2;
            }
            Class<?> cls = Class.forName("com.alipay.android.msp.framework.drm.DrmManager");
            String str4 = (String) cls.getMethod("getRawDrmValueFromKey", String.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), str);
            StringBuilder sb2 = new StringBuilder("获取 DRM 开关 ");
            sb2.append(str);
            sb2.append("，返回 ");
            if (str4 != null) {
                str3 = str4;
            }
            sb2.append(str3);
            LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb2.toString());
            return str4;
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                StringBuilder sb3 = new StringBuilder("获取 DRM 开关时发生异常，返回 ");
                sb3.append(str2 == null ? str3 : str2);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb3.toString());
                StringBuilder sb4 = new StringBuilder("获取 DRM 开关 ");
                sb4.append(str);
                sb4.append("，返回 ");
                if (str2 != null) {
                    str3 = str2;
                }
                sb4.append(str3);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb4.toString());
                return str2;
            } catch (Throwable th2) {
                StringBuilder sb5 = new StringBuilder("获取 DRM 开关 ");
                sb5.append(str);
                sb5.append("，返回 ");
                if (str2 == null) {
                    str2 = str3;
                }
                sb5.append(str2);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb5.toString());
                throw th2;
            }
        }
    }

    public static boolean procGraySwitchWithRate(Context context, int i, boolean z) {
        StringBuilder sb;
        try {
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "获取 DRM 开关时发生异常，返回 " + z);
                sb = new StringBuilder("获取 DRM 开关 ");
            } finally {
                LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "获取 DRM 开关 " + z + "，返回 " + z);
            }
        }
        if (context == null) {
            LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "Context 为空");
            return z;
        }
        Class<?> cls = Class.forName("com.alipay.android.msp.framework.drm.DrmManager");
        z = ((Boolean) cls.getMethod("procGraySwitchWithRate", Context.class, Integer.TYPE).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), context, Integer.valueOf(i))).booleanValue();
        sb = new StringBuilder("获取 DRM 开关 ");
        sb.append(z);
        sb.append("，返回 ");
        sb.append(z);
        LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", sb.toString());
        return z;
    }
}
