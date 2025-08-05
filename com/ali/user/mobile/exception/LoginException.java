package com.ali.user.mobile.exception;

import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class LoginException<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Throwable cause;
    private int code;
    private String message;
    private RpcResponse<T> orinResponse;

    static {
        kge.a(-1305210386);
    }

    public LoginException(int i, String str, RpcResponse<T> rpcResponse) {
        this.message = ResourceUtil.getNetworkError();
        this.code = i;
        this.message = str;
        this.orinResponse = rpcResponse;
    }

    public LoginException(int i, String str) {
        this.message = ResourceUtil.getNetworkError();
        this.code = i;
        this.message = str;
    }

    public LoginException(int i, Throwable th) {
        this.message = ResourceUtil.getNetworkError();
        this.code = i;
        this.cause = th;
    }

    public RpcResponse<T> getOrinResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcResponse) ipChange.ipc$dispatch("b24de103", new Object[]{this}) : this.orinResponse;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.message;
    }

    public static String format(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d092f0bd", new Object[]{num, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LoginException: ");
        if (num != null) {
            sb.append(riy.ARRAY_START_STR);
            sb.append(num);
            sb.append(riy.ARRAY_END_STR);
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }
}
