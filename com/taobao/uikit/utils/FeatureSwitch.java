package com.taobao.uikit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes9.dex */
public class FeatureSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ROUND_RECT_SHAPE_IMAGE_SHOW_COMPLETELY_KEY = "round_rect_show_completely";
    private static final String SWITCH_NAMESPACE = "uikit_namespace";

    public static boolean isRoundRectShowCompletelyOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c275b00", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(SWITCH_NAMESPACE, ROUND_RECT_SHAPE_IMAGE_SHOW_COMPLETELY_KEY, "true"));
    }
}
