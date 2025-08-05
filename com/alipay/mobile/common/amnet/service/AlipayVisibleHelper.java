package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class AlipayVisibleHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_BACKGROUND = 2;
    public static final int STATE_FORGROUND = 1;
    public static final int STATE_NO_EXIST_MAIN_PROC = 3;

    public static final boolean isVisibleAlipay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("930b0bdd", new Object[0])).booleanValue() : AmnetServiceLifeCycleListener.getInstance().isBindedMainProc() && MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext()) && MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext());
    }

    public static final int getStateVisibleAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fae5a63b", new Object[0])).intValue();
        }
        if (!AmnetServiceLifeCycleListener.getInstance().isBindedMainProc()) {
            return 3;
        }
        return (MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext()) && MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) ? 1 : 2;
    }
}
