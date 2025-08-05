package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson2.util.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public abstract class FieldDeserializer {
    public final Class<?> clazz;
    protected long[] enumNameHashCodes;
    protected Enum[] enums;
    public final FieldInfo fieldInfo;

    static {
        kge.a(-1496215209);
    }

    public FieldDeserializer(Class<?> cls, FieldInfo fieldInfo, int i) {
        this.clazz = cls;
        this.fieldInfo = fieldInfo;
        if (fieldInfo == null) {
            return;
        }
        Class<?> cls2 = fieldInfo.fieldClass;
        if (!cls2.isEnum()) {
            return;
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        long[] jArr = new long[enumArr.length];
        this.enumNameHashCodes = new long[enumArr.length];
        for (int i2 = 0; i2 < enumArr.length; i2++) {
            String name = enumArr[i2].name();
            long j = -3750763034362895579L;
            for (int i3 = 0; i3 < name.length(); i3++) {
                j = (j ^ name.charAt(i3)) * c.MAGIC_PRIME;
            }
            jArr[i2] = j;
            this.enumNameHashCodes[i2] = j;
        }
        Arrays.sort(this.enumNameHashCodes);
        this.enums = new Enum[enumArr.length];
        for (int i4 = 0; i4 < this.enumNameHashCodes.length; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 >= jArr.length) {
                    break;
                } else if (this.enumNameHashCodes[i4] == jArr[i5]) {
                    this.enums[i4] = enumArr[i5];
                    break;
                } else {
                    i5++;
                }
            }
        }
    }

    public Enum getEnumByHashCode(long j) {
        int binarySearch;
        if (this.enums != null && (binarySearch = Arrays.binarySearch(this.enumNameHashCodes, j)) >= 0) {
            return this.enums[binarySearch];
        }
        return null;
    }

    public abstract void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map);

    public void setValue(Object obj, double d) throws IllegalAccessException {
        this.fieldInfo.field.setDouble(obj, d);
    }

    public void setValue(Object obj, float f) throws IllegalAccessException {
        this.fieldInfo.field.setFloat(obj, f);
    }

    public void setValue(Object obj, int i) throws IllegalAccessException {
        this.fieldInfo.field.setInt(obj, i);
    }

    public void setValue(Object obj, long j) throws IllegalAccessException {
        this.fieldInfo.field.setLong(obj, j);
    }

    public void setValue(Object obj, Object obj2) {
        Collection collection;
        Collection collection2;
        Map map;
        Map map2;
        if (obj2 != null || !this.fieldInfo.fieldClass.isPrimitive()) {
            Field field = this.fieldInfo.field;
            Method method = this.fieldInfo.method;
            try {
                if (this.fieldInfo.fieldAccess) {
                    if (!this.fieldInfo.getOnly) {
                        field.set(obj, obj2);
                    } else if (Map.class.isAssignableFrom(this.fieldInfo.fieldClass)) {
                        map = (Map) field.get(obj);
                        if (map == null) {
                            return;
                        }
                        map2 = (Map) obj2;
                        map.putAll(map2);
                    } else {
                        collection = (Collection) field.get(obj);
                        if (collection == null) {
                            return;
                        }
                        collection2 = (Collection) obj2;
                        collection.addAll(collection2);
                    }
                } else if (!this.fieldInfo.getOnly) {
                    method.invoke(obj, obj2);
                } else if (Map.class.isAssignableFrom(this.fieldInfo.fieldClass)) {
                    map = (Map) method.invoke(obj, new Object[0]);
                    if (map == null) {
                        return;
                    }
                    map2 = (Map) obj2;
                    map.putAll(map2);
                } else {
                    collection = (Collection) method.invoke(obj, new Object[0]);
                    if (collection == null) {
                        return;
                    }
                    collection2 = (Collection) obj2;
                    collection.addAll(collection2);
                }
            } catch (Exception e) {
                throw new JSONException("set property error, " + this.fieldInfo.name, e);
            }
        }
    }
}
