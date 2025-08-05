package com.alipay.android.msp.plugin;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface IProtobufCodec {
    Object deserialize(Type type, byte[] bArr);

    boolean isPBBean(Class cls);

    boolean isPBBean(Object obj);

    byte[] serialize(Object obj);

    String toString(Object obj);
}
