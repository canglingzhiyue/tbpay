package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class MonitorLogRecordUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void recordMultMainProcessItem(TransportContext transportContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9df530", new Object[]{transportContext, context});
            return;
        }
        try {
            if (!MiscUtils.isInAlipayClient(context) || TextUtils.isEmpty(DataItemsUtil.getDataItem2DataContainer(transportContext.getCurrentDataContainer(), "ERROR")) || transportContext.bizType != 1 || !MiscUtils.isExistMultiMainProcess(context)) {
                return;
            }
            DataItemsUtil.putDataItem2DataContainer(transportContext.getCurrentDataContainer(), RPCDataItems.MULTI_MAIN, "T");
            LogCatUtil.warn("MonitorLogUtil", "There are multiple processes.");
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLogUtil", "recordMultMainProcessItem ex= " + th.toString());
        }
    }

    public static final void recordCtrlPrintURLFlagToDataflow(TraficConsumeModel traficConsumeModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c26449", new Object[]{traficConsumeModel, new Boolean(z)});
            return;
        }
        if (traficConsumeModel.extParams == null) {
            traficConsumeModel.extParams = new HashMap(1);
        }
        traficConsumeModel.extParams.put("isPrintReqURL", String.valueOf(z));
    }
}
