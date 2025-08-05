package com.taobao.tao.util;

import android.content.Context;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class TBStatusBarSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TB_STATUS_BAR_BUTTON_VISIBLE_KEY = "isNavigationIconVisible";

    public static boolean isIconVisibleFeatureOpen(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71d7b614", new Object[]{context})).booleanValue() : EVO.isSwitchOpened(context, TB_STATUS_BAR_BUTTON_VISIBLE_KEY);
    }
}
