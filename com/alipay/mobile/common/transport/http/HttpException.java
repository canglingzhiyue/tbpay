package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpException extends IOException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOWNLOAD_CACHE_DIR_CREATE_ERR = 17;
    public static final int DOWNLOAD_CACHE_FILE_READ_ERR = 20;
    public static final int DOWNLOAD_CACHE_SPACE_NOT_ENOUGH_ERR = 14;
    public static final int DOWNLOAD_COPY_FAILURE_ERR = 16;
    public static final int DOWNLOAD_FILE_CHECK_ERR = 22;
    public static final int DOWNLOAD_SD_WRITE_ERR = 21;
    public static final int DOWNLOAD_TARGET_DIR_CREATE_ERR = 18;
    public static final int DOWNLOAD_TARGET_SPACE_NOT_ENOUGH_ERR = 15;
    public static final int DOWNLOAD_TOO_MANY_REQUESTS = 429;
    public static final int DOWNLOAD_URL_BLACK_SET_ERR = 19;
    public static final int ILLEGAL_HTTP_STATUS_CODE = 52;
    public static final int LOGIN_REFRESH_ERR = 50;
    public static final int NETWORK_AUTH_ERROR = 8;
    public static final int NETWORK_CANCEL_ERROR = 13;
    public static final int NETWORK_CONNECTION_EXCEPTION = 3;
    public static final int NETWORK_DNS_ERROR = 9;
    public static final int NETWORK_IO_EXCEPTION = 6;
    public static final int NETWORK_SCHEDULE_ERROR = 7;
    public static final int NETWORK_SERVER_EXCEPTION = 5;
    public static final int NETWORK_SOCKET_EXCEPTION = 4;
    public static final int NETWORK_SSL_EXCEPTION = 2;
    public static final int NETWORK_TASK_TIME_OUT_ERROR = 14;
    public static final int NETWORK_TRAFIC_BEYOND_LIMIT = 11;
    public static final int NETWORK_UNAVAILABLE = 1;
    public static final int NETWORK_UNKNOWN_ERROR = 0;
    public static final int REQ_INTERCEPTOR_ERR = 51;
    public static final int URL_ERROR = 10;
    public boolean canRetry;
    public int mCode;
    public String mMsg;

    public HttpException(String str) {
        super(str);
        this.canRetry = true;
        this.mCode = 0;
        this.mMsg = str;
    }

    public HttpException(String str, Throwable th) {
        super(str, th);
        this.canRetry = true;
        this.mCode = 0;
        this.mMsg = str;
    }

    public HttpException(Integer num, String str) {
        super(format(num, str));
        this.canRetry = true;
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public HttpException(Integer num, String str, Throwable th) {
        super(format(num, str), th);
        this.canRetry = true;
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

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.mMsg = str;
        }
    }

    public static String format(Integer num, String str) {
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

    public boolean isCanRetry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69e46f8d", new Object[]{this})).booleanValue() : this.canRetry;
    }

    public void setCanRetry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a10033", new Object[]{this, new Boolean(z)});
        } else {
            this.canRetry = z;
        }
    }
}
