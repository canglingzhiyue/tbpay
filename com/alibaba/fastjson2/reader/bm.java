package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public class bm extends bj {
    static {
        kge.a(-239896880);
    }

    public bm(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, com.alibaba.fastjson2.function.a aVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, aVar);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(Object obj, Object obj2) {
        if (obj2 != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj2 instanceof Collection) {
                Collection<Object> collection = (Collection) obj2;
                int i = 0;
                for (Object obj3 : collection) {
                    if (obj3 == null) {
                        i++;
                    }
                }
                if (i == collection.size()) {
                    obj2 = new StackTraceElement[0];
                } else {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[collection.size()];
                    collection.toArray(stackTraceElementArr);
                    obj2 = stackTraceElementArr;
                }
            }
            this.z.accept(obj, obj2);
        }
    }
}
