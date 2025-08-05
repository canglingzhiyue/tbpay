package com.alipay.mobile.common.rpc.protocol;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class AbstractDeserializer implements Deserializer {
    public byte[] mData;
    public Type mType;

    public AbstractDeserializer(Type type, byte[] bArr) {
        this.mType = type;
        this.mData = bArr;
    }
}
