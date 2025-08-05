package com.alipay.mobile.security.faceauth.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AntDetectResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 110;
    public String token = "";
    public String resultMessage = "";
    public int result = 0;
    public boolean isSuccess = false;
    public String tag = "";
    public Map<String, String> ext = new HashMap();

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.token;
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.token = str;
        }
    }

    public String getResultMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9dbbe05", new Object[]{this}) : this.resultMessage;
    }

    public void setResultMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63be479", new Object[]{this, str});
        } else {
            this.resultMessage = str;
        }
    }

    public int getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc18ae0d", new Object[]{this})).intValue() : this.result;
    }

    public void setResult(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d62fb9d", new Object[]{this, new Integer(i)});
        } else {
            this.result = i;
        }
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.isSuccess;
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.isSuccess = z;
        }
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public Map<String, String> getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this}) : this.ext;
    }

    public void setExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
        } else {
            this.ext = map;
        }
    }
}
