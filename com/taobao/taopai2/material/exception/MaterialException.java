package com.taobao.taopai2.material.exception;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorCode;

    static {
        kge.a(-414355770);
    }

    public MaterialException() {
        this.errorCode = "";
    }

    public MaterialException(String str) {
        this.errorCode = "";
        this.errorCode = str;
    }

    public MaterialException(String str, String str2) {
        super(str2);
        this.errorCode = "";
        this.errorCode = str;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this}) : getMessage();
    }
}
