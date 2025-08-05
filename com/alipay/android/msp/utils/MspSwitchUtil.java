package com.alipay.android.msp.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspSwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CASHIER_SWITCH_SETTING = "cashier_switch_setting";
    public static final String DEFAULT_MSP_BYTES = "a11";
    public static final String KEY_MSP_BYTES = "msp_bytes";
    public static final int MSP_BYTES_DNS_INDEX = 1;
    public static final int MSP_BYTES_ERROR_TPL_TO_NATIVE = 6;
    public static final int MSP_BYTES_H5INTERCEPTOR_INDEX = 5;
    public static final int MSP_BYTES_PRECONN_INDEX = 4;
    public static final int MSP_BYTES_PRELOAD_INDEX = 3;
    public static final int MSP_BYTES_PV3_INDEX = 2;
    public static final String PREFIX_MSP_BYTES = "a";
    private static String mMspBytes;

    public static void setMspBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef5d3d4", new Object[]{str});
            return;
        }
        mMspBytes = getAndroidMspBytes(str);
        PrefUtils.putString(CASHIER_SWITCH_SETTING, KEY_MSP_BYTES, mMspBytes);
        LogUtil.record(4, "", "MspSwitchUtil::setMspBytes", "mspBytes:".concat(String.valueOf(str)));
    }

    private static String getMspBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9863e2e2", new Object[0]);
        }
        if (TextUtils.isEmpty(mMspBytes)) {
            mMspBytes = PrefUtils.getString(CASHIER_SWITCH_SETTING, KEY_MSP_BYTES, DEFAULT_MSP_BYTES);
        }
        if (TextUtils.isEmpty(mMspBytes)) {
            mMspBytes = DEFAULT_MSP_BYTES;
        }
        LogUtil.record(4, "", "MspSwitchUtil::getMspBytes", "mspBytes:" + mMspBytes);
        return mMspBytes;
    }

    public static boolean isDnsEnabled() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0cd8e2d", new Object[0])).booleanValue();
        }
        String mspBytes = getMspBytes();
        if (TextUtils.isEmpty(mspBytes) || mspBytes.length() < 2 || mspBytes.charAt(1) == '1') {
            z = true;
        }
        LogUtil.record(4, "", "MspSwitchUtil::isDnsEnabled", "isEnabled:".concat(String.valueOf(z)));
        return z;
    }

    public static boolean isPbv3Enabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cd93d53", new Object[0])).booleanValue();
        }
        String mspBytes = getMspBytes();
        boolean z = TextUtils.isEmpty(mspBytes) || mspBytes.length() < 3 || mspBytes.charAt(2) == '1';
        LogUtil.record(4, "", "MspSwitchUtil::isPbv3Enabled", "isEnabled:".concat(String.valueOf(z)));
        if (!DeviceInfo.isM836Device()) {
            return z;
        }
        return false;
    }

    public static boolean isPreloadCacheEnabled() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97c3609", new Object[0])).booleanValue();
        }
        String mspBytes = getMspBytes();
        if (TextUtils.isEmpty(mspBytes) || mspBytes.length() < 4 || mspBytes.charAt(3) == '1') {
            z = true;
        }
        LogUtil.record(4, "", "MspSwitchUtil::isPreloadCacheEnabled", "isEnabled:".concat(String.valueOf(z)));
        return z;
    }

    public static boolean isPreloadConnectionEnabled() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc69a94f", new Object[0])).booleanValue();
        }
        String mspBytes = getMspBytes();
        if (TextUtils.isEmpty(mspBytes) || mspBytes.length() < 5 || mspBytes.charAt(4) == '1') {
            z = true;
        }
        LogUtil.record(4, "", "MspSwitchUtil::isPreloadConnectionEnabled", "isEnabled:".concat(String.valueOf(z)));
        return z;
    }

    public static boolean isH5PayInterceptorEnabled() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a50292d8", new Object[0])).booleanValue();
        }
        String mspBytes = getMspBytes();
        if (TextUtils.isEmpty(mspBytes) || mspBytes.length() < 6 || mspBytes.charAt(5) == '1') {
            z = true;
        }
        LogUtil.record(4, "", "MspSwitchUtil::isH5PayInterceptorEnabled", "isEnabled:".concat(String.valueOf(z)));
        return z;
    }

    public static boolean isErrorTplNoIntercept(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab35876", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            z = DrmManager.getInstance(context).isGray(DrmKey.GRAY_ERROR_TPL__NO_INTERCEPT, false, context);
        }
        LogUtil.record(4, "", "MspSwitchUtil::isErrorTplNoIntercept", "isNoIntercept:".concat(String.valueOf(z)));
        return z;
    }

    private static String getAndroidMspBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3e16095", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return DEFAULT_MSP_BYTES;
        }
        String[] split = str.split(";");
        if (split.length <= 0) {
            return DEFAULT_MSP_BYTES;
        }
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith("a")) {
                return str2;
            }
        }
        return DEFAULT_MSP_BYTES;
    }
}
