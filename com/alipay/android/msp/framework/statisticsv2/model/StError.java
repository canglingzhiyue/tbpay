package com.alipay.android.msp.framework.statisticsv2.model;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.safepaylog.utils.LogMessage;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StError implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4864a;
    private String b;
    private String c;
    private String d;

    public StError(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f4864a = ThreadSafeDateFormat.format(new Date(), "HH:mm:ss.SSS");
    }

    public StError(String str, String str2, Throwable th, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3 + " " + getStackTraceMessage(th);
        this.f4864a = ThreadSafeDateFormat.format(new Date(), "HH:mm:ss.SSS");
    }

    public StError(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        if (StringUtils.isEmpty(str4)) {
            str4 = ThreadSafeDateFormat.format(new Date(), "HH:mm:ss.SSS");
        } else if (StringUtils.isDigitsOnly(str4)) {
            try {
                str4 = ThreadSafeDateFormat.format(Long.parseLong(str4), "HH:mm:ss.SSS");
            } catch (Throwable unused) {
            }
        }
        this.f4864a = str4;
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorType", this.b);
        hashMap.put("errorCode", this.c);
        hashMap.put("errorMsg", this.d);
        hashMap.put("errorTime", this.f4864a);
        return hashMap;
    }

    public static String getStackTraceMessage(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4e8f086", new Object[]{th});
        }
        try {
            String str = "" + a(th);
            if (th == th.getCause()) {
                return str;
            }
            return (str + LogMessage.ERROR_LINE_SEPARATOR) + a(th.getCause());
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(th.getClass().getName());
        stringBuffer.append(":");
        stringBuffer.append(th.getMessage());
        stringBuffer.append(LogMessage.ERROR_LINE_SEPARATOR);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (int i = 0; i < stackTrace.length; i++) {
                stringBuffer.append(stackTrace[i].toString() + LogMessage.ERROR_LINE_SEPARATOR);
            }
        }
        return stringBuffer.toString();
    }
}
