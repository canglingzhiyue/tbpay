package com.alipay.literpc.jsoncodec;

import com.alipay.literpc.jsoncodec.codec.JSONDeserializer;
import com.alipay.literpc.jsoncodec.codec.JSONSerializer;
import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class JSONCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Object parseObject(String str, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5064a320", new Object[]{str, type}) : JSONDeserializer.deserialize(str, type);
    }

    public static final <T> List<T> parseArray(String str, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("80cfe2a1", new Object[]{str, type}) : (List) JSONDeserializer.deserialize(str, ClassUtil.makeParameterizedType(List.class, type));
    }

    public static final <K, V> Map<K, V> parseMap(String str, Type type, Type type2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("48241b8d", new Object[]{str, type, type2}) : (Map) JSONDeserializer.deserialize(str, ClassUtil.makeParameterizedType(Map.class, type, type2));
    }

    public static String toJSONString(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj}) : JSONSerializer.serialize(obj);
    }
}
