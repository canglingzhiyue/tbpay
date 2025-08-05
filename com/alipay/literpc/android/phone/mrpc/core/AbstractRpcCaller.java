package com.alipay.literpc.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class AbstractRpcCaller implements RpcCaller {

    /* renamed from: a  reason: collision with root package name */
    public Method f5279a;
    public byte[] b;
    public String c;
    public int d;
    public String e;
    public boolean f;

    public AbstractRpcCaller(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f5279a = method;
        this.d = i;
        this.c = str;
        this.b = bArr;
        this.e = str2;
        this.f = z;
    }
}
