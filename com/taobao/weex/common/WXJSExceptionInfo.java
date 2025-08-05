package com.taobao.weex.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXJSExceptionInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mBundleUrl;
    private WXErrorCode mErrCode;
    private String mException;
    private Map<String, String> mExtParams;
    private String mFunction;
    private String mInstanceId;
    private String mWeexVersion = WXEnvironment.WXSDK_VERSION;
    private String mJsFrameworkVersion = WXEnvironment.JS_LIB_SDK_VERSION;
    public long time = System.currentTimeMillis();

    static {
        kge.a(-1997896790);
    }

    public WXJSExceptionInfo(String str, String str2, WXErrorCode wXErrorCode, String str3, String str4, Map<String, String> map) {
        this.mInstanceId = str;
        this.mBundleUrl = str2;
        this.mErrCode = wXErrorCode;
        this.mFunction = str3;
        this.mException = str4;
        this.mExtParams = map;
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this}) : this.mInstanceId;
    }

    public void setInstanceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b03f3a3", new Object[]{this, str});
        } else {
            this.mInstanceId = str;
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.mBundleUrl;
    }

    public void setBundleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.mBundleUrl = str;
        }
    }

    public WXErrorCode getErrCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXErrorCode) ipChange.ipc$dispatch("fadce677", new Object[]{this}) : this.mErrCode;
    }

    public void setErrCode(WXErrorCode wXErrorCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9e513b", new Object[]{this, wXErrorCode});
        } else {
            this.mErrCode = wXErrorCode;
        }
    }

    public String getFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff88fa6b", new Object[]{this}) : this.mFunction;
    }

    public void setFunction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c73ad6b", new Object[]{this, str});
        } else {
            this.mFunction = str;
        }
    }

    public String getException() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1fd1700", new Object[]{this}) : this.mException;
    }

    public void setException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe384de", new Object[]{this, str});
        } else {
            this.mException = str;
        }
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.mExtParams;
    }

    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.mExtParams = map;
        }
    }

    public String getWeexVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72e25d38", new Object[]{this}) : this.mWeexVersion;
    }

    public String getJsFrameworkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ee72640", new Object[]{this}) : this.mJsFrameworkVersion;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" errCode:");
        WXErrorCode wXErrorCode = this.mErrCode;
        sb.append(wXErrorCode == null ? "unSetErrorCode" : wXErrorCode.getErrorCode());
        sb.append(",function:");
        String str = this.mFunction;
        if (str == null) {
            str = "unSetFuncName";
        }
        sb.append(str);
        sb.append(",exception:");
        String str2 = this.mException;
        if (str2 == null) {
            str2 = "unSetException";
        }
        sb.append(str2);
        return sb.toString();
    }
}
