package com.alipay.mobile.common.transportext.biz.appevent;

import com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmnetEventNotify {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5656a = LogUtilAmnet.PRETAG + AmnetEventNotify.class.getSimpleName();

    public static void onAppLeave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e26a61c", new Object[0]);
            return;
        }
        LogUtilAmnet.i(f5656a, "frameworkActivityUserleavehint: [AmnetEventNotify] ");
        AppEventManager.getListener().onAppLeaveEvent();
    }

    public static void onAppResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a063396", new Object[0]);
            return;
        }
        LogUtilAmnet.i(f5656a, "frameworkActivityResume:  [AmnetEventNotify]  ");
        AppEventManager.getListener().onAppResumeEvent();
    }

    public static void setUserInfo(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e8effd", new Object[]{str, str2, bArr});
            return;
        }
        LogUtilAmnet.i(f5656a, "setUserInfo:  [AmnetEventNotify] ");
        AmnetUserInfo.setUserInfo(str, str2, bArr);
    }

    public static void onSyncConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd18fd2", new Object[0]);
            return;
        }
        LogCatUtil.info(f5656a, "onSyncConnState");
        AmnetGeneralEventManager amnetGeneralEventManager = AmnetHelper.getAmnetManager().getAmnetGeneralEventManager();
        if (amnetGeneralEventManager.getLatestConnState() != -1) {
            LogCatUtil.info(f5656a, "onSyncConnState state have synchronous");
            return;
        }
        int connState = AmnetHelper.getConnState();
        if (connState == -1) {
            return;
        }
        amnetGeneralEventManager.notifyConnStateChange(connState);
        LogCatUtil.info(f5656a, "onSyncConnState notifyConnStateChange");
    }

    public static int onSyncGetConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfcb7c43", new Object[0])).intValue();
        }
        LogCatUtil.info(f5656a, "onSyncGetConnState");
        try {
            return AmnetHelper.getConnState();
        } catch (Throwable th) {
            String str = f5656a;
            LogCatUtil.info(str, "onSyncGetConnState exception:" + th.toString());
            return -1;
        }
    }

    public static void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{map});
            return;
        }
        LogCatUtil.info(f5656a, "onSyncInitChanged onSyncInitChanged.");
        AppEventManager.getListener().onSyncInitChanged(map);
    }
}
