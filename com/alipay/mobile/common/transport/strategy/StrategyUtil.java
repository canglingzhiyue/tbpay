package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class StrategyUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isUse4Net(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a1a9da9", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return StringUtils.isEmpty(str) || !str.contains(String.valueOf(ConnectionUtil.getConnType(context)));
    }

    public static final boolean isUse4SdkVersion(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("466b6b4a", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || !str.contains(String.valueOf(Build.VERSION.SDK_INT));
    }

    public static final boolean isUse4Brand(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be00885", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || StringUtils.isEmpty(Build.BRAND) || !str.contains(Build.BRAND.trim().toLowerCase().replaceAll("\\s+", "_"));
    }

    public static final boolean isUse4Model(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7edf72a7", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || StringUtils.isEmpty(Build.MODEL) || !str.contains(Build.MODEL.trim().toLowerCase().replaceAll("\\s+", "_"));
    }

    public static final boolean isUse4Hardware(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f1a8434", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || StringUtils.isEmpty(Build.HARDWARE) || !str.contains(Build.HARDWARE.trim().toLowerCase().replaceAll("\\s+", "_"));
    }

    public static final boolean grayscaleUtdid(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8da6bb5c", new Object[]{str, iArr})).booleanValue() : MiscUtils.grayscaleUtdid(str, iArr);
    }

    public static final boolean isUse4OperationType(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2c5fa70", new Object[]{list, str})).booleanValue() : list.contains("ALL") || list.contains("ALL1") || list.contains(str);
    }

    public static final boolean isSwitchRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe357b5c", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return StringUtils.equals(str, "alipay.client.switches.all.get.afterlogin") || str.contains("alipay.client.switches.all.get");
    }

    public static final boolean isRetryTaskForSwitchRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d86d80", new Object[]{str})).booleanValue();
        }
        if (isSwitchRpc(str)) {
            return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.AFTER_LOGIN_GO_EXT, "T");
        }
        return false;
    }
}
