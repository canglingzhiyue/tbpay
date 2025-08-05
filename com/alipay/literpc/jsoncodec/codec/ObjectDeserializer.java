package com.alipay.literpc.jsoncodec.codec;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface ObjectDeserializer {
    Object deserialize(Object obj, Type type) throws Exception;

    boolean match(Class<?> cls);
}
