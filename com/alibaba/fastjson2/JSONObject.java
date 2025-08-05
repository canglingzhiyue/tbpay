package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.reader.cu;
import com.alibaba.fastjson2.time.e;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.bg;
import com.alibaba.fastjson2.writer.bt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.dqj;
import tb.dqv;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static bu<JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements com.alibaba.fastjson2.function.c<Method> {

        /* renamed from: a  reason: collision with root package name */
        final Annotation f2933a;
        String b;

        static {
            kge.a(181921884);
            kge.a(-1053621173);
        }

        a(Annotation annotation) {
            this.f2933a = annotation;
        }

        @Override // com.alibaba.fastjson2.function.c
        /* renamed from: a */
        public void accept(Method method) {
            if ("name".equals(method.getName())) {
                try {
                    String str = (String) method.invoke(this.f2933a, new Object[0]);
                    if (str.isEmpty()) {
                        return;
                    }
                    this.b = str;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    static {
        kge.a(306137129);
        kge.a(16938580);
    }

    public JSONObject() {
    }

    public JSONObject(int i) {
        super(i);
    }

    public JSONObject(int i, float f) {
        super(i, f);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) a.CC.b(obj);
    }

    public static JSONObject from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONObject) a.CC.b(obj, featureArr);
    }

    private String getJSONFieldName(Method method) {
        Annotation[] annotations;
        String str = null;
        for (Annotation annotation : method.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.a(annotation, (Class<Annotation>) JSONField.class);
            if (jSONField != null) {
                str = jSONField.name();
                if (str.isEmpty()) {
                    str = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(annotationType.getName())) {
                a aVar = new a(annotation);
                BeanUtils.d(annotationType, aVar);
                if (aVar.b != null) {
                    str = aVar.b;
                }
            }
        }
        return str;
    }

    static void nameFilter(Iterable<?> iterable, dqj dqjVar) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(dqjVar);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable) obj, dqjVar);
            }
        }
    }

    static void nameFilter(Map map, dqj dqjVar) {
        String str;
        String process;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(dqjVar);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable) value, dqjVar);
            }
            if ((key instanceof String) && (process = dqjVar.process(map, (str = (String) key), value)) != null && !process.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(process, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    public static JSONObject of() {
        return new JSONObject();
    }

    public static JSONObject of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    public static JSONObject parse(String str, JSONReader.Feature... featureArr) {
        return a.CC.a(str, featureArr);
    }

    public static JSONObject parseObject(String str) {
        return a.CC.b(str);
    }

    public static <T> T parseObject(String str, t<T> tVar, JSONReader.Feature... featureArr) {
        return (T) a.CC.a(str, tVar, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) a.CC.a(str, (Class<Object>) cls);
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) a.CC.a(str, (Class<Object>) cls, featureArr);
    }

    public static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        return (T) a.CC.a(str, type, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return a.CC.a(obj, featureArr);
    }

    static void valueFilter(Iterable<?> iterable, dqv dqvVar) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, dqvVar);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable) obj, dqvVar);
            }
        }
    }

    static void valueFilter(Map map, dqv dqvVar) {
        Object apply;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, dqvVar);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable) value, dqvVar);
            }
            if ((key instanceof String) && (apply = dqvVar.apply(map, (String) key, value)) != value) {
                entry.setValue(apply);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    /* renamed from: clone */
    public JSONObject mo210clone() {
        return new JSONObject(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? super.containsKey(obj) || super.containsKey((Object) obj.toString()) : super.containsKey(obj);
    }

    public boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public Object eval(d dVar) {
        return dVar.a(this);
    }

    public JSONObject fluentPut(String str, Object obj) {
        put(str, obj);
        return this;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        return (((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) && (obj2 = super.get((Object) obj.toString())) != null) ? obj2 : super.get(obj);
    }

    public Object get(String str) {
        return super.get((Object) str);
    }

    public BigDecimal getBigDecimal(String str) {
        Object obj = super.get((Object) str);
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

    public BigInteger getBigInteger(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj instanceof Number) {
            return obj instanceof BigDecimal ? ((BigDecimal) obj).toBigInteger() : BigInteger.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                return new BigInteger(str2);
            }
            return null;
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to BigInteger");
        }
    }

    public Boolean getBoolean(String str) {
        Object obj = super.get((Object) str);
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
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str2) || "1".equals(str2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public boolean getBooleanValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
        }
    }

    public boolean getBooleanValue(String str, boolean z) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        } else {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to boolean value");
        }
    }

    public Object getByPath(String str) {
        return d.a(str).a(this);
    }

    public Byte getByte(String str) {
        byte parseByte;
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseByte = ((Number) obj).byteValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Byte");
        } else {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseByte = Byte.parseByte(str2);
        }
        return Byte.valueOf(parseByte);
    }

    public byte getByteValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                return Byte.parseByte(str2);
            }
            return (byte) 0;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to byte value");
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return com.alibaba.fastjson2.util.d.b((String) obj);
        }
        throw new JSONException("can not cast to byte[], value : " + obj);
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (!(obj instanceof String)) {
            return obj instanceof Number ? new Date(((Number) obj).longValue()) : TypeUtils.a(obj);
        }
        long a2 = DateUtils.a((String) obj, e.b);
        if (a2 != 0) {
            return new Date(a2);
        }
        return null;
    }

    public Date getDate(String str, Date date) {
        Date date2 = getDate(str);
        return date2 == null ? date : date2;
    }

    public Double getDouble(String str) {
        double parseDouble;
        Object obj = super.get((Object) str);
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
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseDouble = Double.parseDouble(str2);
        }
        return Double.valueOf(parseDouble);
    }

    public double getDoubleValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return (str2.isEmpty() || "null".equalsIgnoreCase(str2)) ? mto.a.GEO_NOT_SUPPORT : Double.parseDouble(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to double value");
    }

    public Float getFloat(String str) {
        float parseFloat;
        Object obj = super.get((Object) str);
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
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseFloat = Float.parseFloat(str2);
        }
        return Float.valueOf(parseFloat);
    }

    public float getFloatValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                return Float.parseFloat(str2);
            }
            return 0.0f;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to float value");
    }

    public com.alibaba.fastjson2.time.a getInstant(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.alibaba.fastjson2.time.a) {
            return (com.alibaba.fastjson2.time.a) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.b(obj);
        }
        long longValue = ((Number) obj).longValue();
        if (longValue != 0) {
            return com.alibaba.fastjson2.time.a.a(longValue);
        }
        return null;
    }

    public int getIntValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return 0;
            }
            return str2.indexOf(46) != -1 ? (int) Double.parseDouble(str2) : Integer.parseInt(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public int getIntValue(String str, int i) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return i;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return (str2.isEmpty() || "null".equalsIgnoreCase(str2)) ? i : str2.indexOf(46) != -1 ? (int) Double.parseDouble(str2) : Integer.parseInt(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to int value");
    }

    public Integer getInteger(String str) {
        int parseDouble;
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).intValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Integer");
        } else {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseDouble = str2.indexOf(46) != -1 ? (int) Double.parseDouble(str2) : Integer.parseInt(str2);
        }
        return Integer.valueOf(parseDouble);
    }

    public JSONArray getJSONArray(String str) {
        Object obj = super.get((Object) str);
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof JSONObject) {
            return JSONArray.of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            JSONReader c = JSONReader.c(str2);
            if (arrayReader == null) {
                arrayReader = c.a((Type) JSONArray.class);
            }
            return arrayReader.a(c, (Type) null, (Object) null, 0L);
        } else if (obj instanceof Collection) {
            JSONArray jSONArray2 = new JSONArray((Collection) obj);
            put(str, jSONArray2);
            return jSONArray2;
        } else if (obj instanceof Object[]) {
            return JSONArray.of((Object[]) obj);
        } else {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                jSONArray = new JSONArray(length);
                for (int i = 0; i < length; i++) {
                    jSONArray.add(Array.get(obj, i));
                }
            }
            return jSONArray;
        }
    }

    public JSONObject getJSONObject(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return JSONFactory.y.a(JSONReader.c(str2), (Type) null, (Object) null, 0L);
        } else if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        } else {
            bg b = JSONFactory.defaultObjectWriterProvider.b(obj.getClass());
            if (!(b instanceof bt)) {
                return null;
            }
            return ((bt) b).a((bt) obj);
        }
    }

    public <T> List<T> getList(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, featureArr);
    }

    public Long getLong(String str) {
        long parseDouble;
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).longValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("Can not cast '" + obj.getClass() + "' to Long");
        } else {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseDouble = str2.indexOf(46) != -1 ? (long) Double.parseDouble(str2) : Long.parseLong(str2);
        }
        return Long.valueOf(parseDouble);
    }

    public long getLongValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return 0L;
            }
            return str2.indexOf(46) != -1 ? (long) Double.parseDouble(str2) : Long.parseLong(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public long getLongValue(String str, long j) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return j;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return (str2.isEmpty() || "null".equalsIgnoreCase(str2)) ? j : str2.indexOf(46) != -1 ? (long) Double.parseDouble(str2) : Long.parseLong(str2);
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to long value");
    }

    public <T> T getObject(String str, com.alibaba.fastjson2.function.d<JSONObject, T> dVar) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return dVar.apply(jSONObject);
    }

    public <T> T getObject(String str, t<T> tVar, JSONReader.Feature... featureArr) {
        return (T) getObject(str, tVar.b, featureArr);
    }

    public <T> T getObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        bu buVar = null;
        if (t == null) {
            return null;
        }
        if (cls == Object.class && featureArr.length == 0) {
            return t;
        }
        int length = featureArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (featureArr[i] == JSONReader.Feature.FieldBased) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        Class<?> cls2 = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls2, cls);
        if (a2 != null) {
            return (T) a2.apply(t);
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.a(cls, z).a((Map) t, featureArr);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.a(cls, z).b((Collection) t);
        }
        Class<?> b = TypeUtils.b((Type) cls);
        if (b.isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str2 = (String) t;
            if (str2.isEmpty() || "null".equals(str2)) {
                return null;
            }
            if (b.isEnum()) {
                buVar = objectReaderProvider.a(b, z);
                if (buVar instanceof cu) {
                    return (T) ((cu) buVar).d(com.alibaba.fastjson2.util.c.b(str2));
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

    public <T> T getObject(String str, Type type, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        if (t == null) {
            return null;
        }
        if (type == Object.class && featureArr.length == 0) {
            return t;
        }
        int length = featureArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (featureArr[i] == JSONReader.Feature.FieldBased) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        Class<?> cls = t.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls, type);
        if (a2 != null) {
            return (T) a2.apply(t);
        }
        if (t instanceof Map) {
            return (T) objectReaderProvider.a(type, z).a((Map) t, featureArr);
        }
        if (t instanceof Collection) {
            return (T) objectReaderProvider.a(type, z).b((Collection) t);
        }
        if ((type instanceof Class) && ((Class) type).isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str2 = (String) t;
            if (str2.isEmpty() || "null".equals(str2)) {
                return null;
            }
        }
        JSONReader c = JSONReader.c(a.CC.a(t));
        c.f2934a.a(featureArr);
        return (T) objectReaderProvider.a(type, z).a(c, (Type) null, (Object) null, 0L);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        if ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) {
            return getOrDefault(obj.toString(), obj2);
        }
        Object obj3 = super.get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    public Object getOrDefault(String str, Object obj) {
        Object obj2 = super.get((Object) str);
        return obj2 == null ? obj : obj2;
    }

    public Short getShort(String str) {
        short parseShort;
        Object obj = super.get((Object) str);
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
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            parseShort = Short.parseShort(str2);
        }
        return Short.valueOf(parseShort);
    }

    public short getShortValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                return Short.parseShort(str2);
            }
            return (short) 0;
        }
        throw new JSONException("Can not cast '" + obj.getClass() + "' to short value");
    }

    public int getSize(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (!(obj instanceof Collection)) {
            return 0;
        }
        return ((Collection) obj).size();
    }

    public String getString(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.a(((Date) obj).getTime(), false, e.b) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum)) ? obj.toString() : a.CC.a(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (r11 != false) goto L83;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONObject.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public void nameFilter(dqj dqjVar) {
        nameFilter(this, dqjVar);
    }

    public JSONArray putArray(String str) {
        JSONArray jSONArray = new JSONArray();
        put(str, jSONArray);
        return jSONArray;
    }

    public JSONObject putObject(String str) {
        JSONObject jSONObject = new JSONObject();
        put(str, jSONObject);
        return jSONObject;
    }

    public <T> T to(com.alibaba.fastjson2.function.d<JSONObject, T> dVar) {
        return dVar.apply(this);
    }

    public <T> T to(t<T> tVar, JSONReader.Feature... featureArr) {
        return (T) to(tVar.a(), featureArr);
    }

    public <T> T to(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        return cls == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.a(cls, z).a(this, j);
    }

    public <T> T to(Type type, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        return type == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.a(type, z).a(this, j);
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter b = JSONWriter.b(featureArr);
        try {
            b.a((Object) this);
            b.a(this);
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

    public <T> T toJavaObject(t<T> tVar, JSONReader.Feature... featureArr) {
        return (T) to(tVar, featureArr);
    }

    public <T> T toJavaObject(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = 0;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        return cls == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.a(cls, z).a(this, j);
    }

    public <T> T toJavaObject(Type type, JSONReader.Feature... featureArr) {
        return (T) to(type, featureArr);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        JSONWriter g = JSONWriter.g();
        try {
            g.a((Object) this);
            g.a(this);
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
            a2.a((Object) this);
            a2.a(this);
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

    public void valueFilter(dqv dqvVar) {
        valueFilter(this, dqvVar);
    }
}
