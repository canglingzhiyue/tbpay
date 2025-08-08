package com.taobao.android.searchbaseframe.net;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.error.Error;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class NetError implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_CANCELED = 1;
    public static final int CODE_ERROR_PARAM = 5;
    public static final int CODE_HANDLE_RESULT_ERROR = 4;
    public static final int CODE_NETWORK_TIMEOUT = 3;
    public static final int CODE_NET_ERROR = 6;
    public static final int CODE_PARSE_ERROR = 2;
    public static final int CODE_UNKNOWN = 0;
    public static final int CUSTOM_CODE_START = 1000;
    private int mCode;
    private Throwable mException;
    private String mMsg;
    private String mMtopCode;
    private Error uniError;

    static {
        kge.a(-1538606933);
        kge.a(1028243835);
    }

    public Error getUniError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("e88b9dac", new Object[]{this}) : this.uniError;
    }

    public void setUniError(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8741a226", new Object[]{this, error});
        } else {
            this.uniError = error;
        }
    }

    public NetError(int i) {
        this.mCode = 0;
        this.mCode = i;
    }

    public NetError(int i, String str) {
        this.mCode = 0;
        this.mCode = i;
        this.mMsg = str;
    }

    public NetError(int i, Exception exc) {
        this.mCode = 0;
        this.mCode = i;
        this.mException = exc;
    }

    public NetError(int i, String str, Exception exc) {
        this.mCode = 0;
        this.mCode = i;
        this.mMsg = str;
        this.mException = exc;
    }

    public NetError(int i, String str, String str2) {
        this.mCode = 0;
        this.mCode = i;
        this.mMtopCode = str;
        this.mMsg = str2;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.mCode;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.mCode = i;
        }
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.mMsg;
    }

    public String getMtopCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3136f28e", new Object[]{this}) : this.mMtopCode;
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.mMsg = str;
        }
    }

    public Throwable getException() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("d8eb9685", new Object[]{this}) : this.mException;
    }

    public void setException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6400d061", new Object[]{this, th});
        } else {
            this.mException = th;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mMsg;
        if (StringUtils.isEmpty(str) && getException() != null) {
            str = getException().getMessage();
        }
        return "NetError(" + this.mCode + "): " + str;
    }
}
