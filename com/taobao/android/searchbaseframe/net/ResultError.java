package com.taobao.android.searchbaseframe.net;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.error.Error;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class ResultError implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_CACHE_TEMPLATE_NOT_VALID = 8;
    public static final int CODE_CANCELED = 2;
    public static final int CODE_EMPTY_CELL = 9;
    public static final int CODE_HANDLE_RESULT_ERROR = 4;
    public static final int CODE_NETWORK = 1;
    public static final int CODE_PARSE_ERROR = 3;
    public static final int CODE_RAW_DATA_EMPTY = 5;
    public static final int CODE_RAW_DATA_ENCODE = 6;
    public static final int CODE_RAW_DATA_NOT_JSON = 7;
    public static final int CODE_UNKNOWN = 0;
    public static final int CUSTOM_CODE_START = 1000;
    private Throwable e;
    private int mErrorCode;
    private String mErrorMsg;
    private NetError mNetError;

    static {
        kge.a(-794495573);
        kge.a(1028243835);
    }

    public ResultError(int i) {
        this.mErrorCode = i;
    }

    public ResultError(int i, String str) {
        this.mErrorCode = i;
        this.mErrorMsg = str;
    }

    public ResultError(int i, Throwable th) {
        this.mErrorCode = i;
        this.e = th;
    }

    public ResultError(NetError netError) {
        this.mErrorCode = 1;
        this.mNetError = netError;
    }

    public Error getUniError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("e88b9dac", new Object[]{this});
        }
        NetError netError = this.mNetError;
        if (netError != null) {
            return netError.getUniError();
        }
        return null;
    }

    public boolean isNetError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b79fbc0", new Object[]{this})).booleanValue() : this.mErrorCode == 1;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.mErrorCode;
    }

    public String getMtopCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3136f28e", new Object[]{this});
        }
        NetError netError = this.mNetError;
        if (netError != null) {
            return netError.getMtopCode();
        }
        return this.mErrorCode + "";
    }

    public void setErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0c969", new Object[]{this, new Integer(i)});
        } else {
            this.mErrorCode = i;
        }
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        NetError netError = this.mNetError;
        if (netError != null) {
            return netError.getMsg();
        }
        return this.mErrorMsg;
    }

    public void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.mErrorMsg = str;
        }
    }

    public Throwable getException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("d8eb9685", new Object[]{this});
        }
        NetError netError = this.mNetError;
        if (netError != null) {
            return netError.getException();
        }
        return this.e;
    }

    public void setException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6400d061", new Object[]{this, th});
        } else {
            this.e = th;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        NetError netError = this.mNetError;
        if (netError != null) {
            return netError.toString();
        }
        String str = this.mErrorMsg;
        if (TextUtils.isEmpty(str) && getException() != null) {
            str = getException().getMessage();
        }
        return "ResultError(" + this.mErrorCode + "): " + str;
    }
}
