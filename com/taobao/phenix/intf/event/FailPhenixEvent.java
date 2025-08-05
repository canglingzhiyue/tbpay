package com.taobao.phenix.intf.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class FailPhenixEvent extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int httpCode;
    public String httpMessage;
    public int resultCode;

    static {
        kge.a(859295147);
    }

    public FailPhenixEvent(com.taobao.phenix.intf.c cVar) {
        super(cVar);
    }

    public int getResultCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue() : this.resultCode;
    }

    public void setResultCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ad1130", new Object[]{this, new Integer(i)});
        } else {
            this.resultCode = i;
        }
    }

    public int getHttpCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58026b05", new Object[]{this})).intValue() : this.httpCode;
    }

    public String getHttpMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f848570", new Object[]{this}) : this.httpMessage;
    }

    public void setHttpCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b21d0a5", new Object[]{this, new Integer(i)});
        } else {
            this.httpCode = i;
        }
    }

    public void setHttpMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c3576e", new Object[]{this, str});
        } else {
            this.httpMessage = str;
        }
    }
}
