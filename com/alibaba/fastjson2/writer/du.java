package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.f;
import com.alibaba.fastjson2.writer.bg;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import tb.aai;
import tb.aak;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* loaded from: classes2.dex */
public class du {
    static bt e;
    static final int[] h;
    static final int[] i;
    volatile long g;

    /* renamed from: a */
    final ConcurrentMap<Type, bg> f3097a = new ConcurrentHashMap();
    final ConcurrentMap<Type, bg> b = new ConcurrentHashMap();
    final ConcurrentMap<Class, Class> c = new ConcurrentHashMap();
    final PropertyNamingStrategy f = null;
    final bx d = bx.INSTANCE;

    /* loaded from: classes2.dex */
    public static class a implements bg {
        public static final a INSTANCE;

        static {
            kge.a(1670371053);
            kge.a(-1047766740);
            INSTANCE = new a();
        }

        a() {
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ FieldWriter a(long j) {
            return bg.CC.$default$a(this, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
            a(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(cqa cqaVar) {
            bg.CC.$default$a(this, cqaVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqj dqjVar) {
            bg.CC.$default$a((bg) this, dqjVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqo dqoVar) {
            bg.CC.$default$a((bg) this, dqoVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqs dqsVar) {
            bg.CC.$default$a((bg) this, dqsVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqv dqvVar) {
            bg.CC.$default$a((bg) this, dqvVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ boolean a(JSONWriter jSONWriter) {
            boolean a2;
            a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
            return a2;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
            e(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            a(jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ List<FieldWriter> bn_() {
            List<FieldWriter> emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
        }
    }

    static {
        kge.a(-2065377475);
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, UUID.class, Locale.class, String.class, StackTraceElement.class, Collections.emptyList().getClass(), Collections.emptyMap().getClass(), Collections.emptySet().getClass()};
        int[] iArr = new int[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            iArr[i2] = System.identityHashCode(clsArr[i2]);
        }
        Arrays.sort(iArr);
        h = iArr;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 3);
        copyOf[copyOf.length - 1] = System.identityHashCode(Class.class);
        copyOf[copyOf.length - 2] = System.identityHashCode(int[].class);
        copyOf[copyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(copyOf);
        i = copyOf;
    }

    public /* synthetic */ void a(Annotation annotation, aak aakVar, Method method) {
        String name = method.getName();
        char c = 0;
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            switch (name.hashCode()) {
                case -1371565692:
                    if (name.equals("serializeUsing")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1268779017:
                    if (name.equals("format")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1206994319:
                    if (name.equals("ordinal")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -987658292:
                    if (name.equals("unwrapped")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -940893828:
                    if (name.equals("serialzeFeatures")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -659125328:
                    if (name.equals(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -573479200:
                    if (name.equals(DraftMediaHelper.DraftType.SERIALIZE)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (name.equals("name")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 12396273:
                    if (name.equals("jsonDirect")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 102727412:
                    if (name.equals("label")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String str = (String) invoke;
                    if (str.isEmpty()) {
                        return;
                    }
                    aakVar.f25184a = str;
                    return;
                case 1:
                    a(aakVar, (String) invoke);
                    return;
                case 2:
                    String str2 = (String) invoke;
                    if (str2.isEmpty()) {
                        return;
                    }
                    aakVar.c = str2;
                    return;
                case 3:
                    String str3 = (String) invoke;
                    if (str3.isEmpty()) {
                        return;
                    }
                    aakVar.n = str3;
                    return;
                case 4:
                    Integer num = (Integer) invoke;
                    if (num.intValue() == 0) {
                        return;
                    }
                    aakVar.d = num.intValue();
                    return;
                case 5:
                    if (((Boolean) invoke).booleanValue()) {
                        return;
                    }
                    aakVar.f = true;
                    return;
                case 6:
                    if (!((Boolean) invoke).booleanValue()) {
                        return;
                    }
                    aakVar.e |= aak.UNWRAPPED_MASK;
                    return;
                case 7:
                    a(aakVar, (Enum[]) invoke);
                    return;
                case '\b':
                    Class<?> cls = (Class) invoke;
                    if (!bg.class.isAssignableFrom(cls)) {
                        return;
                    }
                    aakVar.h = cls;
                    return;
                case '\t':
                    if (!((Boolean) invoke).booleanValue()) {
                        return;
                    }
                    aakVar.e |= aak.RAW_VALUE_MASK;
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    private void a(aak aakVar, JSONField jSONField) {
        String name = jSONField.name();
        if (!name.isEmpty()) {
            aakVar.f25184a = name;
        }
        String defaultValue = jSONField.defaultValue();
        if (!defaultValue.isEmpty()) {
            aakVar.n = defaultValue;
        }
        a(aakVar, jSONField.format());
        String label = jSONField.label();
        if (!label.isEmpty()) {
            aakVar.c = label;
        }
        if (!aakVar.f) {
            aakVar.f = !jSONField.serialize();
        }
        if (jSONField.unwrapped()) {
            aakVar.e |= aak.UNWRAPPED_MASK;
        }
        for (JSONWriter.Feature feature : jSONField.serializeFeatures()) {
            aakVar.e |= feature.mask;
        }
        int ordinal = jSONField.ordinal();
        if (ordinal != 0) {
            aakVar.d = ordinal;
        }
        if (jSONField.value()) {
            aakVar.e |= aak.VALUE_MASK;
        }
        if (jSONField.jsonDirect()) {
            aakVar.e |= aak.RAW_VALUE_MASK;
        }
        Class<?> serializeUsing = jSONField.serializeUsing();
        if (bg.class.isAssignableFrom(serializeUsing)) {
            aakVar.h = serializeUsing;
        }
    }

    private void a(aak aakVar, String str) {
        if (!str.isEmpty()) {
            String trim = str.trim();
            if (trim.indexOf(84) != -1 && !trim.contains("'T'")) {
                trim = trim.replaceAll("T", "'T'");
            }
            if (trim.isEmpty()) {
                return;
            }
            aakVar.b = trim;
        }
    }

    private void a(final aak aakVar, final Annotation annotation) {
        BeanUtils.d(annotation.getClass(), new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.writer.-$$Lambda$du$EN-tQkKxBeTDkpuIHmIS88ujEE0
            @Override // com.alibaba.fastjson2.function.c
            public final void accept(Object obj) {
                du.m221lambda$ENtQkKxBeTDkpuIHmIS88ujEE0(du.this, annotation, aakVar, (Method) obj);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(aak aakVar, Enum[] enumArr) {
        char c;
        long j;
        JSONWriter.Feature feature;
        for (Enum r2 : enumArr) {
            String name = r2.name();
            switch (name.hashCode()) {
                case -1937516631:
                    if (name.equals("WriteNullNumberAsZero")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1779797023:
                    if (name.equals("IgnoreErrorGetter")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -527123134:
                    if (name.equals("UseISO8601DateFormat")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -348914872:
                    if (name.equals("WriteBigDecimalAsPlain")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -335314544:
                    if (name.equals("WriteEnumUsingToString")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -211922948:
                    if (name.equals("BrowserCompatible")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -102443356:
                    if (name.equals("WriteNullStringAsEmpty")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -62964779:
                    if (name.equals("NotWriteRootClassName")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1009181687:
                    if (name.equals("WriteNullListAsEmpty")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1519175029:
                    if (name.equals("WriteNonStringValueAsString")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1808123471:
                    if (name.equals("WriteNullBooleanAsFalse")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1879776036:
                    if (name.equals("WriteClassName")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2049970061:
                    if (name.equals("WriteMapNullValue")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    aakVar.b = "iso8601";
                    continue;
                case 1:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNulls;
                    break;
                case 2:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNullListAsEmpty;
                    break;
                case 3:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNullStringAsEmpty;
                    break;
                case 4:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNullNumberAsZero;
                    break;
                case 5:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNullBooleanAsFalse;
                    break;
                case 6:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.BrowserCompatible;
                    break;
                case 7:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteClassName;
                    break;
                case '\b':
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteNonStringValueAsString;
                    break;
                case '\t':
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteEnumUsingToString;
                    break;
                case '\n':
                    j = aakVar.e;
                    feature = JSONWriter.Feature.NotWriteRootClassName;
                    break;
                case 11:
                    j = aakVar.e;
                    feature = JSONWriter.Feature.IgnoreErrorGetter;
                    break;
                case '\f':
                    j = aakVar.e;
                    feature = JSONWriter.Feature.WriteBigDecimalAsPlain;
                    break;
                default:
            }
            aakVar.e = j | feature.mask;
        }
    }

    private void a(aak aakVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.a(annotation, (Class<Annotation>) JSONField.class);
            if (jSONField != null) {
                a(aakVar, jSONField);
            } else {
                String name = annotationType.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != 956114227) {
                    if (hashCode == 1054232478 && name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                        c = 0;
                    }
                } else if (name.equals("java.beans.Transient")) {
                    c = 1;
                }
                if (c == 0) {
                    a(aakVar, annotation);
                } else if (c == 1) {
                    aakVar.f = true;
                    aakVar.m = true;
                }
            }
        }
    }

    public static boolean c(Class<?> cls) {
        if (Arrays.binarySearch(h, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    public static boolean d(Class<?> cls) {
        if (Arrays.binarySearch(i, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson2.writer.bg e(java.lang.Class r10) {
        /*
            r9 = this;
            boolean r0 = r10.isEnum()
            if (r0 != 0) goto L12
            java.lang.Class r0 = r10.getSuperclass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L12
            r4 = r0
            goto L13
        L12:
            r4 = r10
        L13:
            java.lang.reflect.Member r10 = com.alibaba.fastjson2.util.BeanUtils.a(r4, r9)
            if (r10 != 0) goto L41
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r9.c
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Member r0 = com.alibaba.fastjson2.util.BeanUtils.a(r0, r9)
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L32
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Field r10 = r4.getField(r0)     // Catch: java.lang.Throwable -> L41
            goto L41
        L32:
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L41
            java.lang.String r0 = r0.getName()
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r10 = r4.getMethod(r0, r1)
        L41:
            r5 = r10
            tb.aai r10 = new tb.aai
            r10.<init>()
            r9.a(r10, r4)
            boolean r10 = r10.o
            if (r10 == 0) goto L50
            r10 = 0
            return r10
        L50:
            java.lang.String[] r6 = com.alibaba.fastjson2.util.BeanUtils.c(r4)
            com.alibaba.fastjson2.writer.cs r10 = new com.alibaba.fastjson2.writer.cs
            r3 = 0
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.du.e(java.lang.Class):com.alibaba.fastjson2.writer.bg");
    }

    /* renamed from: lambda$EN-tQkKxBeTDkpuIHmIS88ujEE0 */
    public static /* synthetic */ void m221lambda$ENtQkKxBeTDkpuIHmIS88ujEE0(du duVar, Annotation annotation, aak aakVar, Method method) {
        duVar.a(annotation, aakVar, method);
    }

    /* renamed from: lambda$uHDc8kQTfBGDPO-I6aBIr8nbp5I */
    public static /* synthetic */ void m222lambda$uHDc8kQTfBGDPOI6aBIr8nbp5I(aai aaiVar, Annotation annotation, Method method) {
        BeanUtils.a(aaiVar, annotation, method);
    }

    bg a(String str, Class cls) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 1088242009) {
            if (hashCode == 1252880906 && str.equals("java.sql.Timestamp")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("java.sql.Time")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return new f.C0108f(null);
            }
            if (!Clob.class.isAssignableFrom(cls)) {
                return null;
            }
            return new f.a();
        }
        return f.d.a((String) null);
    }

    public bg a(Type type, Class cls) {
        bg e2;
        Type type2 = type;
        if (type2 == String.class) {
            return dm.f3091a;
        }
        Class b = cls == null ? type2 instanceof Class ? (Class) type2 : TypeUtils.b(type) : cls;
        String name = b.getName();
        bg a2 = a(name, b);
        if (a2 != null) {
            return a2;
        }
        char c = 65535;
        switch (name.hashCode()) {
            case -2037224663:
                if (name.equals("java.util.regex.Pattern")) {
                    c = 5;
                    break;
                }
                break;
            case 255703211:
                if (name.equals("net.sf.json.JSONNull")) {
                    c = 0;
                    break;
                }
                break;
            case 444521103:
                if (name.equals("java.net.Inet6Address")) {
                    c = 2;
                    break;
                }
                break;
            case 1253867729:
                if (name.equals("java.net.Inet4Address")) {
                    c = 1;
                    break;
                }
                break;
            case 1539653772:
                if (name.equals("java.text.SimpleDateFormat")) {
                    c = 4;
                    break;
                }
                break;
            case 1585284048:
                if (name.equals("java.net.InetSocketAddress")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
            return dr.f3096a;
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class || rawType == ArrayList.class) {
                if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                    return dj.f3088a;
                }
                type2 = rawType;
            }
            if (Map.class.isAssignableFrom(b)) {
                return dl.a(type2, b);
            }
        }
        if (type2 == LinkedList.class) {
            return dh.f3086a;
        }
        if (type2 == ArrayList.class || type2 == List.class || List.class.isAssignableFrom(b)) {
            return dh.f3086a;
        }
        if (Collection.class.isAssignableFrom(b)) {
            return cn.f3068a;
        }
        if (Map.class.isAssignableFrom(b)) {
            return dl.a(b);
        }
        if (type2 == Integer.class) {
            return cx.f3077a;
        }
        if (type2 == AtomicInteger.class) {
            return cb.f3057a;
        }
        if (type2 == Byte.class) {
            return dd.f3083a;
        }
        if (type2 == Short.class) {
            return cv.f3075a;
        }
        if (type2 == Long.class) {
            return da.f3080a;
        }
        if (type2 == AtomicLong.class) {
            return cd.f3059a;
        }
        if (type2 == AtomicReference.class) {
            return cf.f3061a;
        }
        if (type2 == Float.class) {
            return ct.f3073a;
        }
        if (type2 == Double.class) {
            return cq.f3070a;
        }
        if (type2 == BigInteger.class) {
            return bw.f3054a;
        }
        if (type2 == BigDecimal.class) {
            return cg.f3062a;
        }
        if (type2 == Boolean.class) {
            return ci.f3064a;
        }
        if (type2 == AtomicBoolean.class) {
            return ca.f3056a;
        }
        if (type2 == AtomicIntegerArray.class) {
            return cc.f3058a;
        }
        if (type2 == AtomicLongArray.class) {
            return ce.f3060a;
        }
        if (type2 == Character.class) {
            return cl.f3066a;
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (TimeUnit.class.isAssignableFrom(cls2)) {
                return new cs(null, TimeUnit.class, null, null, 0L);
            }
            if (Enum.class.isAssignableFrom(cls2) && (e2 = e(cls2)) != null) {
                return e2;
            }
            if (com.alibaba.fastjson2.d.class.isAssignableFrom(cls2)) {
                return dp.INSTANCE;
            }
            if (cls2 == boolean[].class) {
                return ch.f3063a;
            }
            if (cls2 == char[].class) {
                return ck.f3065a;
            }
            if (cls2 == StringBuffer.class || cls2 == StringBuilder.class) {
                return dp.INSTANCE;
            }
            if (cls2 == byte[].class) {
                return df.f3085a;
            }
            if (cls2 == short[].class) {
                return cw.f3076a;
            }
            if (cls2 == int[].class) {
                return cz.f3079a;
            }
            if (cls2 == long[].class) {
                return dc.f3082a;
            }
            if (cls2 == float[].class) {
                return cu.f3074a;
            }
            if (cls2 == double[].class) {
                return cr.f3071a;
            }
            if (cls2 == Byte[].class) {
                return de.f3084a;
            }
            if (cls2 == Integer[].class) {
                return cy.f3078a;
            }
            if (cls2 == Long[].class) {
                return db.f3081a;
            }
            if (String[].class == cls2) {
                return dn.c;
            }
            if (BigDecimal[].class == cls2) {
                return bz.f3055a;
            }
            if (Object[].class.isAssignableFrom(cls2)) {
                if (cls2 == Object[].class) {
                    return bu.f3052a;
                }
                Class<?> componentType = cls2.getComponentType();
                return Modifier.isFinal(componentType.getModifiers()) ? new bv(componentType, null) : new bu(componentType);
            } else if (cls2 == UUID.class) {
                return dq.f3095a;
            } else {
                if (cls2 == Locale.class) {
                    return dk.f3089a;
                }
                if (cls2 == Currency.class) {
                    return co.f3069a;
                }
                if (TimeZone.class.isAssignableFrom(cls2)) {
                    return Cdo.f3093a;
                }
                if (cls2 == URI.class || cls2 == URL.class || cls2 == File.class || com.alibaba.fastjson2.time.e.class.isAssignableFrom(cls2) || Charset.class.isAssignableFrom(cls2)) {
                    return dp.INSTANCE;
                }
                bg a3 = a(cls2.getName(), cls2);
                if (a3 != null) {
                    return a3;
                }
                aai aaiVar = new aai();
                Class a4 = a(cls2);
                if (a4 != null) {
                    a(aaiVar, a4);
                }
                if (Date.class.isAssignableFrom(cls2)) {
                    return (aaiVar.y == null && aaiVar.z == null) ? cp.l : new cp(aaiVar.y, aaiVar.z);
                } else if (Calendar.class.isAssignableFrom(cls2)) {
                    return (aaiVar.y == null && aaiVar.z == null) ? cj.l : new cj(aaiVar.y, aaiVar.z);
                } else if (StackTraceElement.class == cls2) {
                    if (e == null) {
                        e = new bt(StackTraceElement.class, null, null, 0L, Arrays.asList(dv.a("fileName", String.class, $$Lambda$4xQ8a1wckVnloQPGhXudTHv35Bg.INSTANCE), dv.a(com.taobao.android.weex_framework.util.a.ATOM_lineNumber, $$Lambda$PzfqWwRMtRw4_XNtK9mcwqHin3k.INSTANCE), dv.a("className", String.class, $$Lambda$tq6aIooJXfzUgzsa94h_hXod048.INSTANCE), dv.a(FluidException.METHOD_NAME, String.class, $$Lambda$2z1KPom_alZcNElpdb1jn9N27Us.INSTANCE)));
                    }
                    return e;
                } else if (Class.class == cls2) {
                    return cm.f3067a;
                } else {
                    if (Method.class == cls2) {
                        return new bt(Method.class, null, null, 0L, Arrays.asList(dv.a("declaringClass", Class.class, $$Lambda$kbkqxP46t73DPZPpKviS_bPctXs.INSTANCE), dv.a("name", String.class, $$Lambda$xmANpof_tS_No0Wslo24KoVJatk.INSTANCE), dv.a("parameterTypes", Class[].class, $$Lambda$wA3z7CH6q0u1ukjGYThKIBrb0g.INSTANCE)));
                    }
                    if (Field.class == cls2) {
                        return new bt(Method.class, null, null, 0L, Arrays.asList(dv.a("declaringClass", Class.class, $$Lambda$TItMveZTQ90eSZjGRP6kpwNsw7Y.INSTANCE), dv.a("name", String.class, $$Lambda$OD3B__nNWZtrLzXzOc69TyxBwfE.INSTANCE)));
                    }
                    if (ParameterizedType.class.isAssignableFrom(cls2)) {
                        return dv.a(ParameterizedType.class, dv.a("actualTypeArguments", Type[].class, $$Lambda$0UXChbnpDYjn5odthaCKw5wPPQM.INSTANCE), dv.a("ownerType", Type.class, $$Lambda$MhLpZBrrT6YKbRFy8BOxET1a7Y.INSTANCE), dv.a("rawType", Type.class, $$Lambda$EklDdOrKZDaPnVrrRnw9DGT2II.INSTANCE));
                    }
                }
            }
        }
        return null;
    }

    public bg a(Type type, Class cls, boolean z) {
        return (z ? this.b : this.f3097a).get(type);
    }

    public Class a(Class cls) {
        return this.c.get(cls);
    }

    public void a(final aai aaiVar, Class cls) {
        Class cls2;
        Class superclass;
        String str;
        PropertyNamingStrategy propertyNamingStrategy = this.f;
        if (propertyNamingStrategy != null && propertyNamingStrategy != PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue) {
            aaiVar.p = this.f.name();
        }
        if (cls != null && (superclass = cls.getSuperclass()) != Object.class && superclass != null && superclass != Enum.class) {
            a(aaiVar, superclass);
            if (aaiVar.f != null && aaiVar.g != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= aaiVar.f.length) {
                        break;
                    }
                    if (aaiVar.f[i2] == cls && i2 < aaiVar.g.length && (str = aaiVar.g[i2]) != null && str.length() != 0) {
                        aaiVar.b = str;
                        break;
                    }
                    i2++;
                }
            }
        }
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        JSONType jSONType = null;
        final Annotation annotation = null;
        int i3 = 0;
        while (i3 < declaredAnnotations.length) {
            Annotation annotation2 = declaredAnnotations[i3];
            Class<? extends Annotation> annotationType = annotation2.annotationType();
            JSONType jSONType2 = (JSONType) BeanUtils.a(annotation2, (Class<Annotation>) JSONType.class);
            if (jSONType2 != annotation2) {
                String name = annotationType.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != 1725974940) {
                    if (hashCode == 2112650262 && name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                        c = 0;
                    }
                } else if (name.equals("kotlin.Metadata")) {
                    c = 1;
                }
                if (c == 0) {
                    annotation = annotation2;
                } else if (c == 1) {
                    aaiVar.u = true;
                    BeanUtils.a((Class<?>) cls, aaiVar);
                    aaiVar.l = BeanUtils.a((Class<?>) cls);
                }
            }
            i3++;
            jSONType = jSONType2;
        }
        if (jSONType == null && (cls2 = this.c.get(cls)) != null) {
            aaiVar.t = true;
            Annotation[] declaredAnnotations2 = cls2.getDeclaredAnnotations();
            int i4 = 0;
            while (i4 < declaredAnnotations2.length) {
                Annotation annotation3 = declaredAnnotations2[i4];
                Class<? extends Annotation> annotationType2 = annotation3.annotationType();
                JSONType jSONType3 = (JSONType) BeanUtils.a(annotation3, (Class<Annotation>) JSONType.class);
                if (jSONType3 != annotation3 && annotationType2.getName().equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation3;
                }
                i4++;
                jSONType = jSONType3;
            }
        }
        if (jSONType != null) {
            Class<?>[] seeAlso = jSONType.seeAlso();
            if (seeAlso.length != 0) {
                aaiVar.f = seeAlso;
            }
            String typeKey = jSONType.typeKey();
            if (!typeKey.isEmpty()) {
                aaiVar.f25182a = typeKey;
            }
            String typeName = jSONType.typeName();
            if (!typeName.isEmpty()) {
                aaiVar.b = typeName;
            }
            for (JSONWriter.Feature feature : jSONType.serializeFeatures()) {
                aaiVar.n |= feature.mask;
            }
            aaiVar.p = jSONType.naming().name();
            String[] ignores = jSONType.ignores();
            if (ignores.length > 0) {
                aaiVar.q = ignores;
            }
            String[] includes = jSONType.includes();
            if (includes.length > 0) {
                aaiVar.s = includes;
            }
            String[] orders = jSONType.orders();
            if (orders.length > 0) {
                aaiVar.r = orders;
            }
            Class<?> serializer = jSONType.serializer();
            if (bg.class.isAssignableFrom(serializer)) {
                aaiVar.v = serializer;
            }
            Class<? extends cqa>[] serializeFilters = jSONType.serializeFilters();
            if (serializeFilters.length != 0) {
                aaiVar.x = serializeFilters;
            }
            String format = jSONType.format();
            if (!format.isEmpty()) {
                aaiVar.y = format;
            }
            String locale = jSONType.locale();
            if (!locale.isEmpty()) {
                String[] split = locale.split("_");
                if (split.length == 2) {
                    aaiVar.z = new Locale(split[0], split[1]);
                }
            }
            if (!jSONType.alphabetic()) {
                aaiVar.A = false;
            }
            if (jSONType.writeEnumAsJavaBean()) {
                aaiVar.o = true;
            }
        } else if (annotation != null) {
            BeanUtils.d(annotation.annotationType(), new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.writer.-$$Lambda$du$uHDc8kQTfBGDPO-I6aBIr8nbp5I
                @Override // com.alibaba.fastjson2.function.c
                public final void accept(Object obj) {
                    du.m222lambda$uHDc8kQTfBGDPOI6aBIr8nbp5I(aai.this, annotation, (Method) obj);
                }
            });
        }
        if (aaiVar.f == null || aaiVar.f.length == 0) {
            return;
        }
        if (aaiVar.b != null && aaiVar.b.length() != 0) {
            return;
        }
        for (Class cls3 : aaiVar.f) {
            if (cls3 == cls) {
                aaiVar.b = cls.getSimpleName();
                return;
            }
        }
    }

    public void a(aai aaiVar, aak aakVar, Class cls, Field field) {
        Annotation[] declaredAnnotations;
        Class cls2;
        Field field2;
        JSONField jSONField = null;
        if (cls != null && (cls2 = this.c.get(cls)) != null && cls2 != cls) {
            try {
                field2 = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                field2 = null;
            }
            if (field2 != null) {
                a(aaiVar, aakVar, cls2, field2);
            }
        }
        if (this.c.get(field.getType()) != null) {
            aakVar.l = true;
        }
        if (Modifier.isTransient(field.getModifiers())) {
            aakVar.f = true;
        }
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if ((jSONField != null || (jSONField = (JSONField) BeanUtils.a(annotation, (Class<Annotation>) JSONField.class)) != annotation) && annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                a(aakVar, annotation);
            }
        }
        if (jSONField == null) {
            return;
        }
        a(aakVar, jSONField);
        Class<?> writeUsing = jSONField.writeUsing();
        if (bg.class.isAssignableFrom(writeUsing)) {
            aakVar.h = writeUsing;
        }
        Class<?> serializeUsing = jSONField.serializeUsing();
        if (bg.class.isAssignableFrom(serializeUsing)) {
            aakVar.h = serializeUsing;
        }
        if (jSONField.jsonDirect()) {
            aakVar.e |= aak.RAW_VALUE_MASK;
        }
        if ((aakVar.e & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0 || String.class.equals(field.getType()) || aakVar.h != null) {
            return;
        }
        aakVar.h = dp.class;
    }

    public void a(aai aaiVar, aak aakVar, Class cls, Method method) {
        Field b;
        Method method2;
        Class cls2 = this.c.get(cls);
        String name = method.getName();
        if (cls2 != null && cls2 != cls) {
            try {
                method2 = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                method2 = null;
            }
            if (method2 != null) {
                a(aaiVar, aakVar, cls2, method2);
            }
        }
        if (this.c.get(method.getReturnType()) != null) {
            aakVar.l = true;
        }
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method a2 = BeanUtils.a(superclass, method);
            if (a2 != null) {
                a(aaiVar, aakVar, superclass, a2);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                Method a3 = BeanUtils.a((Class) cls3, method);
                if (a3 != null) {
                    a(aaiVar, aakVar, superclass, a3);
                }
            }
        }
        a(aakVar, method.getDeclaredAnnotations());
        if (!cls.getName().startsWith("java.lang", 0) && (b = BeanUtils.b(cls, method)) != null) {
            aakVar.e |= aak.FIELD_MASK;
            a(aaiVar, aakVar, cls, b);
        }
        if (!aaiVar.u || aaiVar.i == null || aaiVar.l == null) {
            return;
        }
        String a4 = BeanUtils.a(method, aaiVar.u, (String) null);
        for (int i2 = 0; i2 < aaiVar.l.length; i2++) {
            if (a4.equals(aaiVar.l[i2])) {
                Annotation[][] parameterAnnotations = aaiVar.i.getParameterAnnotations();
                if (i2 < parameterAnnotations.length) {
                    a(aakVar, parameterAnnotations[i2]);
                    return;
                }
            }
        }
    }

    public bg b(Class cls) {
        return b(cls, cls, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x008c, code lost:
        if (r3.equals("com.alibaba.fastjson.JSONObject") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.writer.bg b(java.lang.reflect.Type r9, java.lang.Class r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.du.b(java.lang.reflect.Type, java.lang.Class, boolean):com.alibaba.fastjson2.writer.bg");
    }
}
