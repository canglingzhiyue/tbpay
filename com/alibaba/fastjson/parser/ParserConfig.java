package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.ArrayCodec;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.NumberCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes.dex */
public class ParserConfig {
    private static long[] denyList;
    public static ParserConfig global;
    public boolean autoTypeSupport;
    public ClassLoader defaultClassLoader;
    public PropertyNamingStrategy propertyNamingStrategy;
    private final IdentityHashMap<ObjectDeserializer> deserializers = new IdentityHashMap<>(1024);
    public final SymbolTable symbolTable = new SymbolTable(16384);

    static {
        kge.a(475444903);
        denyList = new long[]{-7600952144447537354L, -4082057040235125754L, -2364987994247679115L, -676156662527871184L, -254670111376247151L, 1502845958873959152L, 4147696707147271408L, 5347909877633654828L, 5751393439502795295L, 7702607466162283393L};
        global = new ParserConfig();
    }

    public ParserConfig() {
        this.deserializers.put(SimpleDateFormat.class, MiscCodec.instance);
        this.deserializers.put(Date.class, DateCodec.instance);
        this.deserializers.put(Calendar.class, DateCodec.instance);
        this.deserializers.put(Map.class, MapDeserializer.instance);
        this.deserializers.put(HashMap.class, MapDeserializer.instance);
        this.deserializers.put(LinkedHashMap.class, MapDeserializer.instance);
        this.deserializers.put(TreeMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentHashMap.class, MapDeserializer.instance);
        this.deserializers.put(Collection.class, CollectionCodec.instance);
        this.deserializers.put(List.class, CollectionCodec.instance);
        this.deserializers.put(ArrayList.class, CollectionCodec.instance);
        this.deserializers.put(Object.class, JavaObjectDeserializer.instance);
        this.deserializers.put(String.class, StringCodec.instance);
        this.deserializers.put(Character.TYPE, MiscCodec.instance);
        this.deserializers.put(Character.class, MiscCodec.instance);
        this.deserializers.put(Byte.TYPE, NumberCodec.instance);
        this.deserializers.put(Byte.class, NumberCodec.instance);
        this.deserializers.put(Short.TYPE, NumberCodec.instance);
        this.deserializers.put(Short.class, NumberCodec.instance);
        this.deserializers.put(Integer.TYPE, IntegerCodec.instance);
        this.deserializers.put(Integer.class, IntegerCodec.instance);
        this.deserializers.put(Long.TYPE, IntegerCodec.instance);
        this.deserializers.put(Long.class, IntegerCodec.instance);
        this.deserializers.put(BigInteger.class, BigDecimalCodec.instance);
        this.deserializers.put(BigDecimal.class, BigDecimalCodec.instance);
        this.deserializers.put(Float.TYPE, NumberCodec.instance);
        this.deserializers.put(Float.class, NumberCodec.instance);
        this.deserializers.put(Double.TYPE, NumberCodec.instance);
        this.deserializers.put(Double.class, NumberCodec.instance);
        this.deserializers.put(Boolean.TYPE, BooleanCodec.instance);
        this.deserializers.put(Boolean.class, BooleanCodec.instance);
        this.deserializers.put(Class.class, MiscCodec.instance);
        this.deserializers.put(char[].class, ArrayCodec.instance);
        this.deserializers.put(Object[].class, ArrayCodec.instance);
        this.deserializers.put(UUID.class, MiscCodec.instance);
        this.deserializers.put(TimeZone.class, MiscCodec.instance);
        this.deserializers.put(Locale.class, MiscCodec.instance);
        this.deserializers.put(Currency.class, MiscCodec.instance);
        this.deserializers.put(URI.class, MiscCodec.instance);
        this.deserializers.put(URL.class, MiscCodec.instance);
        this.deserializers.put(Pattern.class, MiscCodec.instance);
        this.deserializers.put(Charset.class, MiscCodec.instance);
        this.deserializers.put(Number.class, NumberCodec.instance);
        this.deserializers.put(StackTraceElement.class, MiscCodec.instance);
        this.deserializers.put(Serializable.class, JavaObjectDeserializer.instance);
        this.deserializers.put(Cloneable.class, JavaObjectDeserializer.instance);
        this.deserializers.put(Comparable.class, JavaObjectDeserializer.instance);
        this.deserializers.put(Closeable.class, JavaObjectDeserializer.instance);
    }

    public static ParserConfig getGlobalInstance() {
        return global;
    }

    public static boolean isPrimitive(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    public Class<?> checkAutoType(String str, Class<?> cls, int i) {
        if (str == null) {
            return null;
        }
        throw new JSONException("safeMode not support autoType : " + str);
    }

    public boolean containsKey(Class cls) {
        return this.deserializers.get(cls) != null;
    }

    public FieldDeserializer createFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        Class<?> cls2 = fieldInfo.fieldClass;
        return (cls2 == List.class || cls2 == ArrayList.class || (cls2.isArray() && !cls2.getComponentType().isPrimitive())) ? new ListTypeFieldDeserializer(parserConfig, cls, fieldInfo) : new DefaultFieldDeserializer(parserConfig, cls, fieldInfo);
    }

    public ObjectDeserializer getDeserializer(Class<?> cls, Type type) {
        JSONType jSONType;
        Class<?> mappingTo;
        ObjectDeserializer objectDeserializer = this.deserializers.get(type);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type == null) {
            type = cls;
        }
        ObjectDeserializer objectDeserializer2 = this.deserializers.get(type);
        if (objectDeserializer2 != null) {
            return objectDeserializer2;
        }
        if (!isPrimitive(cls) && (jSONType = (JSONType) cls.getAnnotation(JSONType.class)) != null && (mappingTo = jSONType.mappingTo()) != Void.class) {
            return getDeserializer(mappingTo, mappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            objectDeserializer2 = this.deserializers.get(cls);
        }
        if (objectDeserializer2 != null) {
            return objectDeserializer2;
        }
        ObjectDeserializer objectDeserializer3 = this.deserializers.get(type);
        if (objectDeserializer3 != null) {
            return objectDeserializer3;
        }
        ObjectDeserializer enumDeserializer = cls.isEnum() ? new EnumDeserializer(cls) : cls.isArray() ? ArrayCodec.instance : (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) ? CollectionCodec.instance : Map.class.isAssignableFrom(cls) ? MapDeserializer.instance : Throwable.class.isAssignableFrom(cls) ? new ThrowableDeserializer(this, cls) : cls.getName().equals("android.net.Uri") ? MiscCodec.instance : new JavaBeanDeserializer(this, cls, type);
        putDeserializer(type, enumDeserializer);
        return enumDeserializer;
    }

    public ObjectDeserializer getDeserializer(Type type) {
        ObjectDeserializer objectDeserializer = this.deserializers.get(type);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type instanceof Class) {
            return getDeserializer((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? getDeserializer((Class) rawType, type) : getDeserializer(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getDeserializer(upperBounds[0]);
            }
        }
        return JavaObjectDeserializer.instance;
    }

    public void putDeserializer(Type type, ObjectDeserializer objectDeserializer) {
        this.deserializers.put(type, objectDeserializer);
    }

    public ObjectDeserializer registerIfNotExists(Class<?> cls) {
        return registerIfNotExists(cls, cls.getModifiers(), false, true, true, true);
    }

    public ObjectDeserializer registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        ObjectDeserializer objectDeserializer = this.deserializers.get(cls);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        JavaBeanDeserializer javaBeanDeserializer = new JavaBeanDeserializer(this, cls, cls, JavaBeanInfo.build(cls, i, cls, z, z2, z3, z4, this.propertyNamingStrategy));
        putDeserializer(cls, javaBeanDeserializer);
        return javaBeanDeserializer;
    }
}
