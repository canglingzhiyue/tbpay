package com.ali.user.mobile.exception;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class RpcException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mExtCode;
    private String mMsg;

    static {
        kge.a(714437874);
    }

    public String getExtCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a58b1a81", new Object[]{this}) : this.mExtCode;
    }

    public RpcException(Integer num, String str, String str2) {
        super(format(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
        this.mExtCode = str2;
    }

    public RpcException(Integer num, String str) {
        super(format(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public RpcException(Integer num, Throwable th) {
        super(th);
        this.mCode = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.mCode;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.mMsg;
    }

    public static String format(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d092f0bd", new Object[]{num, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
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

    public static boolean isSystemError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("451e0f31", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 3004 || i == 406) {
            return true;
        }
        if (i >= 400 && i <= 407) {
            return LoginSwitch.getSwitch("clean_session_when_syserror", "false");
        }
        return false;
    }
}
