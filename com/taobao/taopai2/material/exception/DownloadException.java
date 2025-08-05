package com.taobao.taopai2.material.exception;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DownloadException extends MaterialException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String errorInfo;

    static {
        kge.a(1517897861);
    }

    public DownloadException(String str, String str2) {
        this.errorInfo = "";
        this.errorCode = str;
        this.errorInfo = str2;
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this}) : this.errorInfo;
    }
}
