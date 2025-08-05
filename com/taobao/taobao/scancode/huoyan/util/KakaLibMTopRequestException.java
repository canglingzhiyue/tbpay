package com.taobao.taobao.scancode.huoyan.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class KakaLibMTopRequestException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVER_RESULT_NOTHING = "KAKALIB_SERVER_RESULT_NOTHING";
    private static final long serialVersionUID = -2120277779106940443L;
    private String errorCode;
    private String errorInfo;

    static {
        kge.a(1460417928);
    }

    public KakaLibMTopRequestException(String str, String str2) {
        this.errorCode = str;
        this.errorInfo = str2;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    public void setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.errorCode = str;
        }
    }

    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this}) : this.errorInfo;
    }

    public void setErrorInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e66c25", new Object[]{this, str});
        } else {
            this.errorInfo = str;
        }
    }
}
