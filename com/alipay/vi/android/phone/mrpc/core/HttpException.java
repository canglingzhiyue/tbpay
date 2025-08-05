package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

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

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.mCode;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.mMsg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpException(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Http Transport error"
            r0.append(r1)
            if (r3 == 0) goto L19
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "]"
            r0.append(r1)
        L19:
            java.lang.String r1 = " : "
            r0.append(r1)
            if (r4 == 0) goto L23
            r0.append(r4)
        L23:
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r3 = r3.intValue()
            r2.mCode = r3
            r2.mMsg = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.vi.android.phone.mrpc.core.HttpException.<init>(java.lang.Integer, java.lang.String):void");
    }
}
