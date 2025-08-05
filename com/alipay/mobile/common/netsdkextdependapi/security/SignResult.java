package com.alipay.mobile.common.netsdkextdependapi.security;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SignResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SignResult f5494a;
    private boolean b;
    private String c;
    public String sign;
    public int signType;

    public SignResult() {
        this.sign = "";
        this.signType = SignRequest.SIGN_TYPE_MD5;
        this.b = false;
        this.c = "";
    }

    public SignResult(String str) {
        this.sign = "";
        this.signType = SignRequest.SIGN_TYPE_MD5;
        this.b = false;
        this.c = "";
        this.b = false;
        this.c = str;
    }

    public static final SignResult newEmptySignData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("6477177a", new Object[0]);
        }
        if (f5494a == null) {
            f5494a = new SignResult();
        }
        return f5494a;
    }

    public static final SignResult newErrorResult(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SignResult) ipChange.ipc$dispatch("bc989695", new Object[]{str}) : new SignResult(str);
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.b;
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.c;
    }

    public void setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
