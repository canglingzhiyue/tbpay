package com.alipay.mobile.common.transport.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APNetworkStartupUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5617a = false;

    public static void notifyNetworkStartupListener() {
        if (f5617a) {
            return;
        }
        f5617a = true;
        try {
            String stringFromMetaData = MiscUtils.getStringFromMetaData(TransportEnvUtil.getContext(), "apnetwork.startup.listener");
            if (TextUtils.isEmpty(stringFromMetaData)) {
                if (!MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    return;
                }
                LogCatUtil.info("APNetworkStartupUtil", "[notifyNetworkStartupListener] No meta-data config:  apnetwork.startup.listener");
                return;
            }
            Object newInstance = Class.forName(stringFromMetaData).newInstance();
            if (!(newInstance instanceof APNetworkStartupListener)) {
                LogCatUtil.warn("APNetworkStartupUtil", "[notifyNetworkStartupListener] Illegal listener class, Not an implementation of APNetworkStartupListener， class name = " + stringFromMetaData);
                return;
            }
            APNetworkStartupListener aPNetworkStartupListener = (APNetworkStartupListener) newInstance;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aPNetworkStartupListener.onNetworkStartup(TransportEnvUtil.getContext());
            LogCatUtil.info("APNetworkStartupUtil", "[notifyNetworkStartupListener] Execution finished. listener = " + stringFromMetaData + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (Throwable th) {
            LogCatUtil.warn("APNetworkStartupUtil", "[notifyNetworkStartupListener] Exception = " + th.toString(), th);
        }
    }
}
