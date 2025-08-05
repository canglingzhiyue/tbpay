package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.a;
import org.json.alipay.b;

/* loaded from: classes3.dex */
public class JSONSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<ObjectSerializer> f5306a;

    static {
        ArrayList arrayList = new ArrayList();
        f5306a = arrayList;
        arrayList.add(new SimpleClassCodec());
        f5306a.add(new EnumCodec());
        f5306a.add(new DateCodec());
        f5306a.add(new MapCodec());
        f5306a.add(new CollectionCodec());
        f5306a.add(new ArrayCodec());
        f5306a.add(new JavaBeanCodec());
    }

    public static String serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93d8b7d", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        Object serializeToSimpleObject = serializeToSimpleObject(obj);
        if (ClassUtil.isSimpleType(serializeToSimpleObject.getClass())) {
            return b.d(serializeToSimpleObject.toString());
        }
        if (Collection.class.isAssignableFrom(serializeToSimpleObject.getClass())) {
            return new a((Collection) ((List) serializeToSimpleObject)).toString();
        }
        if (Map.class.isAssignableFrom(serializeToSimpleObject.getClass())) {
            return new b((Map) serializeToSimpleObject).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + serializeToSimpleObject.getClass());
    }

    public static Object serializeToSimpleObject(Object obj) throws Exception {
        Object serialize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1d0286c3", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        for (ObjectSerializer objectSerializer : f5306a) {
            if (objectSerializer.match(obj.getClass()) && (serialize = objectSerializer.serialize(obj)) != null) {
                return serialize;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
