package com.taobao.android.detail.mainpic.a11y;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) throws RuntimeException {
        AccessibilityManager accessibilityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return false;
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_detail_mainArea_OCR", "false"))) {
            return a(context);
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_mainPic_OCR", "false"))) {
            return false;
        }
        Variation variation = UTABTest.activate("A11yDetailPicOcr", "AccessibilityPicOcr").getVariation("useOCR");
        if (variation == null) {
            return true;
        }
        return Constants.VAL_YES.equals(variation.getValueAsString(Constants.VAL_YES));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_mainVideo_OCR", "false"))) {
            return false;
        }
        Variation variation = UTABTest.activate("A11yDetailPicOcr", "AccessibilityPicOcr").getVariation("useOCR");
        if (variation == null) {
            return true;
        }
        return Constants.VAL_YES.equals(variation.getValueAsString(Constants.VAL_YES));
    }
}
