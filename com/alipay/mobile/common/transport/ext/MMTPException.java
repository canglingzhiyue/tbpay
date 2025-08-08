package com.alipay.mobile.common.transport.ext;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.riy;

/* loaded from: classes3.dex */
public class MMTPException extends IOException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MMTP_EXP_BASE = 1000;
    public static final int MMTP_EXP_DOWNGRADED = 1003;
    public static final int MMTP_EXP_GENERIC = 1002;
    public static final int MMTP_EXP_IPC_ERROR = 1004;
    public static final int MMTP_EXP_NONE = 1000;
    public static final int MMTP_EXP_TIMEOUT = 1001;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f5535a = {"ssl", "tls", "cert"};
    public int errorCode;
    public String errorMesage;

    public MMTPException() {
    }

    public MMTPException(String str) {
        super(str);
    }

    public MMTPException(String str, Throwable th) {
        super(str, th);
    }

    public MMTPException(Throwable th) {
        super(th);
    }

    public MMTPException(int i, String str) {
        super("errorCode=[" + i + "] errorMessage=[" + str + riy.ARRAY_END_STR);
        this.errorCode = i;
        this.errorMesage = str;
    }

    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this});
        }
        return "errorCode=[" + this.errorCode + "] errorMessage=[" + this.errorMesage + riy.ARRAY_END_STR;
    }

    public static final boolean isTlsError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d606c6c", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase();
        for (String str2 : f5535a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
