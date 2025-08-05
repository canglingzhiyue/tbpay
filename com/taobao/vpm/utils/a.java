package com.taobao.vpm.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.VPMAdapterManager;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : VPMAdapterManager.mConfigAdapter != null && a(VPMAdapterManager.mConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_ENABLE_VPM, "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : VPMAdapterManager.mConfigAdapter != null && a(VPMAdapterManager.mConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, "audioEnable", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : VPMAdapterManager.mConfigAdapter != null && a(VPMAdapterManager.mConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_PUBLISH_ENABLE, "true"));
    }
}
