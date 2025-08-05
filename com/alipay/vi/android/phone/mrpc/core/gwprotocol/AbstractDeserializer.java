package com.alipay.vi.android.phone.mrpc.core.gwprotocol;

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
