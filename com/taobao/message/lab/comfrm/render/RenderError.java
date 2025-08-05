package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class RenderError {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String detail;
    private String errorCode;
    private String errorMsg;

    static {
        kge.a(1278746891);
    }

    public RenderError(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.detail = str3;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public String getDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed839612", new Object[]{this}) : this.detail;
    }
}
