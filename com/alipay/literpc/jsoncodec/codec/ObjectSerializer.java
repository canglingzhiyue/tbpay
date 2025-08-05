package com.alipay.literpc.jsoncodec.codec;

/* loaded from: classes3.dex */
public interface ObjectSerializer {
    boolean match(Class<?> cls);

    Object serialize(Object obj) throws Exception;
}
