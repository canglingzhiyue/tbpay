package com.taobao.message.message_open_api.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class CallException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errCode;
    public String errMsg;
    public Object errObject;
    public boolean needReportSLS;

    static {
        kge.a(-1268044200);
    }

    public CallException(String str, String str2) {
        this.needReportSLS = true;
        this.errCode = str;
        this.errMsg = str2;
    }

    public CallException(String str, String str2, boolean z) {
        this.needReportSLS = true;
        this.errCode = str;
        this.errMsg = str2;
        this.needReportSLS = z;
    }

    public CallException(String str) {
        this.needReportSLS = true;
        this.errMsg = str;
        this.errCode = "-10000";
    }

    public CallException(String str, boolean z) {
        this.needReportSLS = true;
        this.errMsg = str;
        this.needReportSLS = z;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CallException{errCode='" + this.errCode + "', errMsg='" + this.errMsg + "', errObject=" + this.errObject + '}';
    }
}
