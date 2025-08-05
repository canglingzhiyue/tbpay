package com.ali.user.mobile.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class RpcResponse<T> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionType;
    public int code;
    public String codeGroup;
    public String message;
    public String msgCode;
    public String msgInfo;
    public T returnValue;

    static {
        kge.a(2146093524);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcResponse{code=" + this.code + ", message='" + this.message + "', msgCode='" + this.msgCode + "', msgInfo='" + this.msgInfo + "', codeGroup='" + this.codeGroup + "', actionType='" + this.actionType + "', returnValue=" + this.returnValue + '}';
    }
}
