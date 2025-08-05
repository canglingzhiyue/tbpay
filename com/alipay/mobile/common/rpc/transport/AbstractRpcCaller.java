package com.alipay.mobile.common.rpc.transport;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class AbstractRpcCaller implements RpcCaller {
    public String mContentType;
    public int mId;
    public Method mMethod;
    public String mOperationType;
    public byte[] mReqData;
    public boolean mResetCookie;

    public AbstractRpcCaller(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.mMethod = method;
        this.mId = i;
        this.mOperationType = str;
        this.mReqData = bArr;
        this.mContentType = str2;
        this.mResetCookie = z;
    }
}
