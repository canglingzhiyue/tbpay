package com.alipay.literpc.jsoncodec.codec;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.a;

/* loaded from: classes3.dex */
public class ArrayCodec implements ObjectDeserializer, ObjectSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public Object serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e67aae0f", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(JSONSerializer.serializeToSimpleObject(obj2));
        }
        return arrayList;
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer
    public Object deserialize(Object obj, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82aa5401", new Object[]{this, obj, type});
        }
        if (!obj.getClass().equals(a.class)) {
            return null;
        }
        a aVar = (a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int a2 = aVar.a();
        Object newInstance = Array.newInstance(componentType, a2);
        for (int i = 0; i < a2; i++) {
            Array.set(newInstance, i, JSONDeserializer.deserialize0(aVar.a(i), componentType));
        }
        return newInstance;
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue() : cls.isArray();
    }
}
