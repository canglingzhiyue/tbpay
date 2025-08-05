package com.alipay.literpc.jsoncodec.codec;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.Date;

/* loaded from: classes3.dex */
public class DateCodec implements ObjectDeserializer, ObjectSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer
    public Object deserialize(Object obj, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("82aa5401", new Object[]{this, obj, type}) : new Date(((Long) obj).longValue());
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public Object serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e67aae0f", new Object[]{this, obj}) : Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue() : Date.class.isAssignableFrom(cls);
    }
}
