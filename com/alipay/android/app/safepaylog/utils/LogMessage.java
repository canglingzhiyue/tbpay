package com.alipay.android.app.safepaylog.utils;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class LogMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_LINE_SEPARATOR = " 》 ";

    public static String getStackTraceMessage(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4e8f086", new Object[]{th}) : getStackTraceMessage(th, true);
    }

    public static String getStackTraceMessage(Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b734526", new Object[]{th, new Boolean(z)});
        }
        try {
            String str = "" + a(th, z);
            if (th == th.getCause()) {
                return str;
            }
            return (str + ERROR_LINE_SEPARATOR) + a(th.getCause(), z);
        } catch (Throwable th2) {
            return " ex:" + th2.getMessage();
        }
    }

    private static String a(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93af7399", new Object[]{th, new Boolean(z)});
        }
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(th.getClass().getName());
        stringBuffer.append(":");
        stringBuffer.append(th.getMessage());
        stringBuffer.append(ERROR_LINE_SEPARATOR);
        if (z && (stackTrace = th.getStackTrace()) != null) {
            for (int i = 0; i < stackTrace.length; i++) {
                stringBuffer.append(stackTrace[i].toString() + ERROR_LINE_SEPARATOR);
            }
        }
        return stringBuffer.toString();
    }
}
