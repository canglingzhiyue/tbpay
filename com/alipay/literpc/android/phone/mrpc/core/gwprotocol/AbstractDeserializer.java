package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class AbstractDeserializer implements Deserializer {

    /* renamed from: a  reason: collision with root package name */
    public Type f5303a;
    public byte[] b;

    public AbstractDeserializer(Type type, byte[] bArr) {
        this.f5303a = type;
        this.b = bArr;
    }
}
