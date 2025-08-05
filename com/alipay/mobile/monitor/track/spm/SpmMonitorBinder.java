package com.alipay.mobile.monitor.track.spm;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class SpmMonitorBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void bind(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4899e04", new Object[]{context});
            return;
        }
        SpmMonitor.INTANCE.setContext(context);
        LoggerFactory.getLogContext().setSpmMonitor(SpmMonitor.INTANCE);
    }
}
