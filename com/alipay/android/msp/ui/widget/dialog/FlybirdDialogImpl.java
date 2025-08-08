package com.alipay.android.msp.ui.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class FlybirdDialogImpl extends FlybirdDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Dialog showAntUIDialog(Context context, String str, String str2, String str3, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("339d8185", new Object[]{context, str, str2, str3, list});
        }
        return null;
    }

    public static Dialog showAntUIDialog(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("c22cc1cf", new Object[]{context, str, str2, list}) : showAntUIDialog(context, str, str2, null, list);
    }

    public static Dialog showDialog(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("9521f44e", new Object[]{context, str, str2, list}) : showDialog(context, str, str2, null, list);
    }

    public static Dialog showDialog(Context context, String str, String str2, String str3, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("61f0b244", new Object[]{context, str, str2, str3, list});
        }
        try {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
            if (mspContextByBizId != null) {
                String str4 = null;
                if (!StringUtils.isEmpty(str)) {
                    str4 = str;
                }
                if (StringUtils.isEmpty(str4) && !StringUtils.isEmpty(str2)) {
                    str4 = str2;
                }
                if (StringUtils.isEmpty(str4)) {
                    str4 = "null";
                }
                AlertIntelligenceEngine.startAction(mspContextByBizId, "dialog", str4, "", "");
            } else {
                LogUtil.record(8, "AntDialogBuilder:buildAndShow", "latest mspContext is null");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return showDialogV2(context, str, str2, list);
    }

    public static boolean antDialogEnable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("911a25f3", new Object[]{context})).booleanValue() : context != null && DrmManager.getInstance(context).isGray(DrmKey.GRAY_ANT_UI_FOR_DIALOG, false, context);
    }
}
