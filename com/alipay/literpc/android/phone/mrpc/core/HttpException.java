package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_AUTH_ERROR = 8;
    public static final int NETWORK_CONNECTION_EXCEPTION = 3;
    public static final int NETWORK_DNS_ERROR = 9;
    public static final int NETWORK_IO_EXCEPTION = 6;
    public static final int NETWORK_SCHEDULE_ERROR = 7;
    public static final int NETWORK_SERVER_EXCEPTION = 5;
    public static final int NETWORK_SOCKET_EXCEPTION = 4;
    public static final int NETWORK_SSL_EXCEPTION = 2;
    public static final int NETWORK_UNAVAILABLE = 1;
    public static final int NETWORK_UNKNOWN_ERROR = 0;
    private static final long serialVersionUID = -6320569206365033676L;
    private int mCode;
    private String mMsg;

    public HttpException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    public HttpException(Integer num, String str) {
        super(format(num, str));
        this.mCode = num.intValue();
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

    private static String format(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d092f0bd", new Object[]{num, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Http Transport error");
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
