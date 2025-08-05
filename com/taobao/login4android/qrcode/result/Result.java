package com.taobao.login4android.qrcode.result;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class Result implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_API_LIMIT = -103;
    public static final int ERROR_CANCEL = -105;
    public static final int ERROR_NO_NETWORK = -102;
    public static final int ERROR_PARAM_INVALID = -104;
    public static final int ERROR_UNKNOWN = -101;
    public static final String MSG_ERROR_API_LIMIT = "被挤爆了，请稍候再试";
    public static final String MSG_ERROR_PARAM_INVALID = "参数错误";
    public static final String MSG_ERROR_UNKNOWN = "系统开小差，请重试";
    public static final String MSG_NO_NETWORK = "网络开小差，请稍后再试";
    public static final String MSG_SCAN_SUCCESS = "SCAN_Success";
    public static final String MSG_SUCCESS = "Success";
    public static final int SCANED = 14031;
    public static final int SUCCESS = 3000;
    private String mActionType;
    private LoginReturnData mLoginData;
    private String mResultMsg;
    private String mUrl;
    private int mResultCode = -101;
    public SparseArray<String> mMsgMap = new SparseArray<>();

    static {
        kge.a(522692140);
        kge.a(1028243835);
    }

    public LoginReturnData getLoginData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginReturnData) ipChange.ipc$dispatch("5458dd10", new Object[]{this}) : this.mLoginData;
    }

    public void setLoginData(LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a19a4e4", new Object[]{this, loginReturnData});
        } else {
            this.mLoginData = loginReturnData;
        }
    }

    public Result() {
        this.mMsgMap.put(3000, MSG_SUCCESS);
        this.mMsgMap.put(SCANED, MSG_SCAN_SUCCESS);
        this.mMsgMap.put(-102, MSG_NO_NETWORK);
        this.mMsgMap.put(-101, MSG_ERROR_UNKNOWN);
        this.mMsgMap.put(-103, MSG_ERROR_API_LIMIT);
        this.mMsgMap.put(-104, "参数错误");
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mUrl;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }

    public String getActionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65717033", new Object[]{this}) : this.mActionType;
    }

    public void setActionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa61da3", new Object[]{this, str});
        } else {
            this.mActionType = str;
        }
    }

    public int getResultCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue() : this.mResultCode;
    }

    public void setResultCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ad1130", new Object[]{this, new Integer(i)});
        } else {
            this.mResultCode = i;
        }
    }

    public String getResultMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f82b84b", new Object[]{this}) : !TextUtils.isEmpty(this.mResultMsg) ? this.mResultMsg : this.mMsgMap.get(this.mResultCode) != null ? this.mMsgMap.get(this.mResultCode) : this.mMsgMap.get(-101);
    }

    public void setResultMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13120cf3", new Object[]{this, str});
        } else {
            this.mResultMsg = str;
        }
    }
}
