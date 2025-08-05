package com.alipay.vi.android.phone.mrpc.core;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AbstractRpcCaller implements RpcCaller {
    public String mContentType;
    public int mId;
    public Method mMethod;
    public String mOperationType;
    public byte[] mReqData;
    public boolean mResetCookie;
    public Map<String, String> mRpcHeaders;

    public AbstractRpcCaller(Method method, int i, String str, byte[] bArr, String str2, boolean z, Map<String, String> map) {
        this.mMethod = method;
        this.mId = i;
        this.mOperationType = str;
        this.mReqData = bArr;
        this.mContentType = str2;
        this.mResetCookie = z;
        this.mRpcHeaders = map;
    }
}
