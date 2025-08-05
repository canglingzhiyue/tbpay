package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class AVFSException extends IllegalStateException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = -1;
    public static final int ERROR_INDEXING = -4;
    public static final int ERROR_IO = -2;
    public static final int ERROR_SERIALIZATION = -3;
    private final int mErrorCode;

    static {
        kge.a(-881316557);
    }

    public AVFSException(String str, Throwable th, int i) {
        super(str, th);
        this.mErrorCode = i;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.mErrorCode;
    }
}
