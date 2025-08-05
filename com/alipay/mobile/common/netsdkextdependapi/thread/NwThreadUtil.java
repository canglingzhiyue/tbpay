package com.alipay.mobile.common.netsdkextdependapi.thread;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class NwThreadUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean addIdleTask(Runnable runnable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fce1515e", new Object[]{runnable, str, new Integer(i)})).booleanValue();
        }
        try {
            return NwThreadManagerFactory.getInstance().getDefaultBean().addIdleTask(runnable, str, i);
        } catch (Throwable th) {
            InnerMiscUtil.log(Level.FINEST, "[NwThreadUtil#addIdleTask] Exception ", th);
            return false;
        }
    }

    public static void executeNormalTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c072e6", new Object[]{runnable});
            return;
        }
        try {
            NwThreadManagerFactory.getInstance().getDefaultBean().executeNormalTask(runnable);
        } catch (Throwable th) {
            InnerMiscUtil.log(Level.FINEST, "[NwThreadUtil#executeNormalTask] Exception ", th);
        }
    }
}
