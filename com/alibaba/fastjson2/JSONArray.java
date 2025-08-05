package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.reader.cu;
import com.alibaba.fastjson2.time.e;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.bg;
import com.alibaba.fastjson2.writer.bt;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class JSONArray extends ArrayList<Object> {
    static bg<JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    static {
        kge.a(-556758993);
    }

    public JSONArray() {
    }

    public JSONArray(int i) {
        super(i);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public JSONArray(Object... objArr) {
        super(objArr.length);
        for (Object obj : objArr) {
            super.add(obj);
        }
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray(collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) a.CC.b(obj);
    }

    public static JSONArray from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONArray) a.CC.b(obj, featureArr);
    }

    public static JSONArray of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    public static JSONArray of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    public static JSONArray of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public static JSONArray of(Object... objArr) {
        return new JSONArray(objArr);
    }

    public static JSONArray parse(String str, JSONReader.Feature... featureArr) {
        return a.CC.b(str, featureArr);
    }

    public static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        return a.CC.b(str, featureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        return a.CC.b(str, cls);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return a.CC.b(str, cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return a.CC.a(obj, featureArr);
    }

    public JSONArray addArray() {
        JSONArray jSONArray = new JSONArray();
        add(jSONArray);
        return jSONArray;
    }

    public JSONObject addObject() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject);
        return jSONObject;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return new JSONArray(this);
    }

    public JSONArray fluentAdd(Object obj) {
        add(obj);
        return this;
    }

    public JSONArray fluentAddAll(Collection<?> collection) {
        addAll(collection);
        return this;
    }

    public JSONArray fluentClear() {
        clear();
        return this;
    }

    public JSONArray fluentRemove(int i) {
        remove(i);
        return this;
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    public JSONArray fluentSet(int i, Object obj) {
        set(i, obj);
        return this;
    }

    public BigDecimal getBigDecimal(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof BigDecimal ? (BigDecimal) obj : obj instanceof BigInteger ? new BigDecimal((BigInteger) obj) : obj instanceof Float ? TypeUtils.a(((Float) obj).floatValue()) : obj instanceof Double ? TypeUtils.a(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            return TypeUtils.b((String) obj);
        } else {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            throw new JSONException("Can not cast '" + obj.getClass() + "' to BigDecimal");
        }
    }

    public BigInteger getBigInteger(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof BigInteger ? (BigInteger) obj : obj instanceof BigDecimal ? ((BigDecimal) obj).toBigInteger() : BigInteger.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return new BigInteger(str);
            }
            return null;
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to BigInteger");
        }
    }

    public Boolean getBoolean(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        boolean z = false;
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Boolean");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public boolean getBooleanValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        } else if (obj instanceof String) {
            String str = (String) obj;
            return "true".equalsIgnoreCase(str) || "1".equals(str);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
        }
    }

    public Byte getByte(int i) {
        byte parseByte;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseByte = ((Number) obj).byteValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Byte");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseByte = Byte.parseByte(str);
        }
        return Byte.valueOf(parseByte);
    }

    public byte getByteValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return Byte.parseByte(str);
            }
            return (byte) 0;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to byte value");
    }

    public Date getDate(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.a(obj);
        }
        long longValue = ((Number) obj).longValue();
        if (longValue != 0) {
            return new Date(longValue);
        }
        return null;
    }

    public Date getDate(int i, Date date) {
        Date date2 = getDate(i);
        return date2 == null ? date : date2;
    }

    public Double getDouble(int i) {
        double parseDouble;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Double");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseDouble = Double.parseDouble(str);
        }
        return Double.valueOf(parseDouble);
    }

    public double getDoubleValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return (str.isEmpty() || "null".equalsIgnoreCase(str)) ? mto.a.GEO_NOT_SUPPORT : Double.parseDouble(str);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to double value");
    }

    public Float getFloat(int i) {
        float parseFloat;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            parseFloat = ((Number) obj).floatValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Float");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseFloat = Float.parseFloat(str);
        }
        return Float.valueOf(parseFloat);
    }

    public float getFloatValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return Float.parseFloat(str);
            }
            return 0.0f;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to float value");
    }

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return Integer.parseInt(str);
            }
            return 0;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public Integer getInteger(int i) {
        int parseInt;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            parseInt = ((Number) obj).intValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Integer");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseInt = Integer.parseInt(str);
        }
        return Integer.valueOf(parseInt);
    }

    public JSONArray getJSONArray(int i) {
        Object obj = get(i);
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return JSONFactory.x.a(JSONReader.c(str), (Type) null, (Object) null, 0L);
        } else if (obj instanceof Collection) {
            JSONArray jSONArray2 = new JSONArray((Collection) obj);
            set(i, jSONArray2);
            return jSONArray2;
        } else if (obj instanceof Object[]) {
            return of((Object[]) obj);
        } else {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                jSONArray = new JSONArray(length);
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray.add(Array.get(obj, i2));
                }
            }
            return jSONArray;
        }
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return JSONFactory.y.a(JSONReader.c(str), (Type) null, (Object) null, 0L);
        } else if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        } else {
            bg b = JSONFactory.defaultObjectWriterProvider.b(obj.getClass());
            if (!(b instanceof bt)) {
                return null;
            }
            return ((bt) b).a((bt) obj);
        }
    }

    public Long getLong(int i) {
        long parseLong;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            parseLong = ((Number) obj).longValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Long");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseLong = Long.parseLong(str);
        }
        return Long.valueOf(parseLong);
    }

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return Long.parseLong(str);
            }
            return 0L;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public <T> T getObject(int i, com.alibaba.fastjson2.function.d<JSONObject, T> dVar) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return dVar.apply(jSONObject);
    }

    public <T> T getObject(int i, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        bu buVar = null;
        if (t == null) {
            return null;
        }
        Class<?> cls2 = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls2, cls);
        if (a2 != null) {
            return (T) a2.apply(t);
        }
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.a(cls, z).a((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.a(cls, z).b((Collection) t);
        }
        Class<?> b = TypeUtils.b((Type) cls);
        if (b.isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str = (String) t;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (b.isEnum()) {
                buVar = objectReaderProvider.a(b, z);
                if (buVar instanceof cu) {
                    return (T) ((cu) buVar).d(com.alibaba.fastjson2.util.c.b(str));
                }
            }
        }
        String a3 = a.CC.a(t);
        JSONReader c = JSONReader.c(a3);
        c.f2934a.a(featureArr);
        if (buVar == null) {
            buVar = objectReaderProvider.a(b, z);
        }
        T t2 = (T) buVar.a(c, (Type) null, (Object) null, 0L);
        if (c.b()) {
            return t2;
        }
        throw new JSONException("not support input " + a3);
    }

    public <T> T getObject(int i, Type type, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        if (t == null) {
            return null;
        }
        Class<?> cls = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls, type);
        if (a2 != null) {
            return (T) a2.apply(t);
        }
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.a(type, z).a((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.a(type, z).b((Collection) t);
        }
        Class<?> b = TypeUtils.b(type);
        if (b.isInstance(t)) {
            return t;
        }
        JSONReader c = JSONReader.c(a.CC.a(t));
        c.f2934a.a(featureArr);
        return (T) objectReaderProvider.a(b, z).a(c, (Type) null, (Object) null, 0L);
    }

    public Short getShort(int i) {
        short parseShort;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            parseShort = ((Number) obj).shortValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Short");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            parseShort = Short.parseShort(str);
        }
        return Short.valueOf(parseShort);
    }

    public short getShortValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equalsIgnoreCase(str)) {
                return Short.parseShort(str);
            }
            return (short) 0;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to short value");
    }

    public String getString(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.a(((Date) obj).getTime(), false, e.b) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum)) ? obj.toString() : a.CC.a(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int size = super.size();
        if (i < 0) {
            int i2 = i + size;
            if (i2 >= 0) {
                return super.set(i2, obj);
            }
            super.add(0, obj);
            return null;
        } else if (i < size) {
            return super.set(i, obj);
        } else {
            if (i < size + 4096) {
                while (true) {
                    int i3 = i - 1;
                    if (i == size) {
                        break;
                    }
                    super.add(null);
                    i = i3;
                }
                super.add(obj);
            }
            return null;
        }
    }

    public <T> T to(Class<T> cls) {
        return cls == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.a((Type) cls).b(this);
    }

    public <T> T to(Type type) {
        return type == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.a(type).b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        bu a2 = objectReaderProvider.a(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if ((obj instanceof JSONObject) || (obj instanceof Map)) {
                obj = a2.a((Map) obj, j);
            } else if (obj != null && !cls.isInstance(obj)) {
                Class<?> cls2 = obj.getClass();
                com.alibaba.fastjson2.function.d a3 = objectReaderProvider.a(cls2, cls);
                if (a3 == null) {
                    throw new JSONException(cls2 + " cannot be converted to " + cls);
                }
                tArr[i] = a3.apply(obj);
            }
            tArr[i] = obj;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter b = JSONWriter.b(featureArr);
        try {
            b.a((Object) this);
            b.b((List) this);
            byte[] s = b.s();
            if (b != null) {
                b.close();
            }
            return s;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toJSONString(JSONWriter.Feature... featureArr) {
        return toString(featureArr);
    }

    public <T> List<T> toJavaList(Class<T> cls, JSONReader.Feature... featureArr) {
        return toList(cls, featureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) to(type);
    }

    public <T> List<T> toList(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        bu a2 = objectReaderProvider.a(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if ((obj instanceof JSONObject) || (obj instanceof Map)) {
                obj = a2.a((Map) obj, j);
            } else if (obj != null && !cls.isInstance(obj)) {
                Class<?> cls2 = obj.getClass();
                com.alibaba.fastjson2.function.d a3 = objectReaderProvider.a(cls2, cls);
                if (a3 == null) {
                    throw new JSONException(cls2 + " cannot be converted to " + cls);
                }
                obj = a3.apply(obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        JSONWriter g = JSONWriter.g();
        try {
            g.a((Object) this);
            g.b((List) this);
            String obj = g.toString();
            if (g != null) {
                g.close();
            }
            return obj;
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter a2 = JSONWriter.a(featureArr);
        try {
            if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & a2.b.k) == 0) {
                a2.b((List) this);
            } else {
                a2.a((Object) this);
                if (arrayWriter == null) {
                    arrayWriter = a2.a((Type) JSONArray.class, JSONArray.class);
                }
                arrayWriter.a(a2, this, null, null, 0L);
            }
            String obj = a2.toString();
            if (a2 != null) {
                a2.close();
            }
            return obj;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
