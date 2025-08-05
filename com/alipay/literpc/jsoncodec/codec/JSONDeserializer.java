package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.a;
import org.json.alipay.b;
import tb.riy;

/* loaded from: classes3.dex */
public class JSONDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<ObjectDeserializer> f5305a;

    static {
        ArrayList arrayList = new ArrayList();
        f5305a = arrayList;
        arrayList.add(new SimpleClassCodec());
        f5305a.add(new EnumCodec());
        f5305a.add(new DateCodec());
        f5305a.add(new MapCodec());
        f5305a.add(new SetDeserializer());
        f5305a.add(new CollectionCodec());
        f5305a.add(new ArrayCodec());
        f5305a.add(new JavaBeanCodec());
    }

    public static final Object deserialize(String str, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3349dd3", new Object[]{str, type});
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith(riy.ARRAY_START_STR) && trim.endsWith(riy.ARRAY_END_STR)) {
            return deserialize0(new a(trim), type);
        }
        if (trim.startsWith(riy.BLOCK_START_STR) && trim.endsWith(riy.BLOCK_END_STR)) {
            return deserialize0(new b(trim), type);
        }
        return deserialize0(trim, type);
    }

    public static final <T> T deserialize0(Object obj, Type type) throws Exception {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("364fc0af", new Object[]{obj, type});
        }
        for (ObjectDeserializer objectDeserializer : f5305a) {
            if (objectDeserializer.match(ClassUtil.getRawClass(type)) && (t = (T) objectDeserializer.deserialize(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }
}
