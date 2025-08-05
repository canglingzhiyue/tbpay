package com.alibaba.security.ccrc.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class InitResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorMsg;
    public String pid;

    public InitResult(String str, String str2) {
        this.errorMsg = str;
        this.pid = str2;
    }

    public static InitResult createResult(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InitResult) ipChange.ipc$dispatch("7967956e", new Object[]{str, str2}) : new InitResult(str, str2);
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.pid;
    }

    public void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }
}
