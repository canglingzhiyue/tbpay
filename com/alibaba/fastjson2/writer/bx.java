package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.du;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.aai;
import tb.aak;
import tb.cqa;
import tb.kge;

/* loaded from: classes2.dex */
public class bx {
    public static final bx INSTANCE;

    static {
        kge.a(1825068384);
        INSTANCE = new bx();
    }

    protected static String a(Class cls, aai aaiVar, aak aakVar, Method method) {
        char charAt;
        if (aakVar.f25184a == null || aakVar.f25184a.isEmpty()) {
            String a2 = BeanUtils.a(method, aaiVar.u, aaiVar.p);
            int length = a2.length();
            char charAt2 = length > 0 ? a2.charAt(0) : (char) 0;
            if ((length == 1 && charAt2 >= 'a' && charAt2 <= 'z') || (length > 2 && charAt2 >= 'A' && charAt2 <= 'Z' && (charAt = a2.charAt(1)) >= 'A' && charAt <= 'Z')) {
                char[] charArray = a2.toCharArray();
                if (charAt2 < 'a' || charAt2 > 'z') {
                    charArray[0] = (char) (charArray[0] + ' ');
                } else {
                    charArray[0] = (char) (charArray[0] - ' ');
                }
                Field b = BeanUtils.b(cls, new String(charArray));
                if (b != null && (length == 1 || Modifier.isPublic(b.getModifiers()))) {
                    return b.getName();
                }
            }
            return a2;
        }
        return aakVar.f25184a;
    }

    protected static void a(aai aaiVar, bt btVar) {
        Class<? extends cqa>[] clsArr;
        for (Class<? extends cqa> cls : aaiVar.x) {
            if (cqa.class.isAssignableFrom(cls)) {
                try {
                    btVar.a(cls.newInstance());
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    public /* synthetic */ void a(aak aakVar, long j, aai aaiVar, du duVar, Class cls, Map map, Method method) {
        boolean z;
        aakVar.b();
        aakVar.e = j;
        aakVar.b = aaiVar.y;
        duVar.a(aaiVar, aakVar, cls, method);
        if (aakVar.f) {
            return;
        }
        String a2 = a(cls, aaiVar, aakVar, method);
        String[] strArr = aaiVar.s;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    z = false;
                    break;
                } else if (strArr[i].equals(a2)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return;
            }
        }
        if ((aaiVar.n & JSONWriter.Feature.WriteClassName.mask) != 0 && a2.equals(aaiVar.f25182a)) {
            return;
        }
        if (aaiVar.r != null) {
            boolean z2 = false;
            for (int i2 = 0; i2 < aaiVar.r.length; i2++) {
                if (a2.equals(aaiVar.r[i2])) {
                    aakVar.d = i2;
                    z2 = true;
                }
            }
            if (!z2 && aakVar.d == 0) {
                aakVar.d = aaiVar.r.length;
            }
        }
        bg bgVar = null;
        if (aakVar.h != null) {
            try {
                Constructor<?> declaredConstructor = aakVar.h.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                bgVar = (bg) declaredConstructor.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create writeUsing Writer error", e);
            }
        }
        if (bgVar == null && aakVar.l) {
            bgVar = du.a.INSTANCE;
        }
        FieldWriter a3 = a(duVar, cls, a2, aakVar.d, aakVar.e, aakVar.b, aakVar.c, method, bgVar);
        FieldWriter fieldWriter = (FieldWriter) map.get(a3.f3039a);
        if (fieldWriter == null) {
            map.put(a3.f3039a, a3);
        }
        if (fieldWriter == null || fieldWriter.compareTo(a3) <= 0) {
            return;
        }
        map.put(a2, a3);
    }

    public /* synthetic */ void a(aak aakVar, Class cls, long j, du duVar, aai aaiVar, Map map, Field field) {
        aakVar.b();
        boolean z = true;
        if ((field.getModifiers() & 1) != 0) {
            z = false;
        }
        aakVar.f = z;
        FieldWriter a2 = a(cls, j, duVar, aaiVar, aakVar, field);
        if (a2 != null) {
            FieldWriter fieldWriter = (FieldWriter) map.get(a2.f3039a);
            if (fieldWriter == null) {
                map.put(a2.f3039a, a2);
            }
            if (fieldWriter == null || fieldWriter.compareTo(a2) <= 0) {
                return;
            }
            map.put(a2.f3039a, a2);
        }
    }

    public /* synthetic */ void b(aak aakVar, Class cls, long j, du duVar, aai aaiVar, Map map, Field field) {
        aakVar.b();
        FieldWriter a2 = a(cls, j, duVar, aaiVar, aakVar, field);
        if (a2 != null) {
            map.put(a2.f3039a, a2);
        }
    }

    public static /* synthetic */ void lambda$N484XHhexkZkvLy8WpDSKGXMRSs(bx bxVar, aak aakVar, long j, aai aaiVar, du duVar, Class cls, Map map, Method method) {
        bxVar.a(aakVar, j, aaiVar, duVar, cls, map, method);
    }

    public static /* synthetic */ void lambda$lRZCPu5BongbPD_BD4Z5LQzBvD0(bx bxVar, aak aakVar, Class cls, long j, du duVar, aai aaiVar, Map map, Field field) {
        bxVar.a(aakVar, cls, j, duVar, aaiVar, map, field);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|(3:130|131|(2:133|(7:137|5|6|7|8|(1:127)(1:11)|(3:13|(1:15)|16)(4:18|(1:20)(1:126)|21|(2:124|125)(2:25|(2:122|123)(2:29|(2:120|121)(2:33|(2:118|119)(2:37|(1:(2:116|117)(2:114|115))(2:41|(2:107|108)(2:45|(2:105|106)(2:49|(2:103|104)(2:53|(2:55|56)(2:57|(2:67|(3:(2:70|(1:72)(1:75))(1:76)|73|74)(2:77|(2:79|80)(2:81|(4:83|(1:85)(1:88)|86|87)(2:89|(2:91|92)(2:93|(2:95|96)(2:97|(2:99|100)(2:101|102)))))))(2:65|66))))))))))))))|4|5|6|7|8|(0)|127|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> a(com.alibaba.fastjson2.writer.du r16, java.lang.Class<T> r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.lang.String r23, java.lang.reflect.Method r24, com.alibaba.fastjson2.writer.bg r25) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bx.a(com.alibaba.fastjson2.writer.du, java.lang.Class, java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.reflect.Method, com.alibaba.fastjson2.writer.bg):com.alibaba.fastjson2.writer.FieldWriter");
    }

    public <T, V> FieldWriter<T> a(du duVar, Class<T> cls, String str, int i, long j, String str2, String str3, Type type, Class<V> cls2, Method method, com.alibaba.fastjson2.function.d<T, V> dVar) {
        bg bgVar;
        if (cls2 == Byte.class) {
            return new am(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == Short.class) {
            return new z(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == Integer.class) {
            return new ad(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == Long.class) {
            return new ai(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == BigInteger.class) {
            return new e(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == BigDecimal.class) {
            return new b(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == String.class) {
            return new bd(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == Date.class) {
            return new n(str, i, j, str2, str3, method, dVar);
        }
        if (cls2 == UUID.class) {
            return new bf(str, i, j, str2, str3, type, cls2, method, dVar);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return new j(str, i, j, str2, str3, method, dVar);
        }
        if (cls2.isEnum()) {
            aai aaiVar = new aai();
            du duVar2 = duVar == null ? JSONFactory.defaultObjectWriterProvider : duVar;
            duVar2.a(aaiVar, cls2);
            boolean z = aaiVar.o;
            if (!z && (bgVar = duVar2.f3097a.get(cls2)) != null && !(bgVar instanceof cs)) {
                z = true;
            }
            if (!z && BeanUtils.a((Class) cls2, (Object) duVar2) == null && BeanUtils.c((Class) cls2) == null) {
                return new t(str, i, j, str2, str3, type, cls2, method, dVar);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                return type2 == String.class ? new at(str, i, j, str2, str3, method, dVar, type, cls2) : new ar(str, i, j, str2, str3, type2, method, dVar, type, cls2);
            }
        }
        return Modifier.isFinal(cls2.getModifiers()) ? new ba(str, i, j, str2, str3, type, cls2, method, dVar) : new az(str, i, j, str2, str3, type, cls2, method, dVar);
    }

    public <T> FieldWriter<T> a(du duVar, String str, int i, long j, String str2, String str3, Field field, bg bgVar) {
        bg bgVar2;
        Method a2 = (field.getDeclaringClass() != Throwable.class || !field.getName().equals("stackTrace")) ? null : BeanUtils.a(Throwable.class, "getStackTrace");
        if (a2 != null) {
            return a(duVar, Throwable.class, str, i, j, str2, str3, a2, bgVar);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (bgVar != null) {
            FieldWriterObject fieldWriterObject = new FieldWriterObject(str, i, j, str2, str3, genericType, type, field, null);
            fieldWriterObject.z = type;
            if (bgVar != du.a.INSTANCE) {
                fieldWriterObject.x = bgVar;
            }
            return fieldWriterObject;
        } else if (type == Boolean.TYPE) {
            return new h(str, i, j, str2, str3, field, type);
        } else {
            if (type == Byte.TYPE) {
                return new ao(str, i, j, str2, str3, field);
            }
            if (type == Short.TYPE) {
                return new ab(str, i, j, str2, str3, field);
            }
            if (type == Integer.TYPE) {
                return new af(str, i, j, str2, str3, field);
            }
            if (type == Long.TYPE) {
                return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new ak(str, i, j, str2, str3, field) : new au(str, i, j, str2, str3, field);
            } else if (type == Float.TYPE) {
                return new x(str, i, j, str2, str3, field);
            } else {
                if (type == Float.class) {
                    return new v(str, i, j, str2, str3, field);
                }
                if (type == Double.TYPE) {
                    return new r(str, i, str2, str3, field);
                }
                if (type == Double.class) {
                    return new p(str, i, j, str2, str3, field);
                }
                if (type == Character.TYPE) {
                    return new l(str, i, j, str2, str3, field);
                }
                if (type == BigInteger.class) {
                    return new d(str, i, j, str2, str3, field);
                }
                if (type == BigDecimal.class) {
                    return new a(str, i, j, str2, str3, field);
                }
                if (type == Date.class) {
                    return new m(str, i, j, str2, str3, field);
                }
                if (type == String.class) {
                    return new bc(str, i, j, str2, str3, field);
                }
                if (type.isEnum()) {
                    aai aaiVar = new aai();
                    duVar.a(aaiVar, type);
                    boolean z = aaiVar.o;
                    if (!z && (bgVar2 = duVar.f3097a.get(type)) != null && !(bgVar2 instanceof cs)) {
                        z = true;
                    }
                    if (BeanUtils.a((Class) type, (Object) duVar) == null && !z && BeanUtils.c((Class) type) == null) {
                        return new s(str, i, j, str2, str3, genericType, type, field, null);
                    }
                }
                if (type == List.class || type == ArrayList.class) {
                    return new aq(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i, j, str2, str3, genericType, type, field);
                } else if (!type.isArray() || type.getComponentType().isPrimitive()) {
                    return new FieldWriterObject(str, i, j, str2, str3, field.getGenericType(), type, field, null);
                } else {
                    Class<?> componentType = type.getComponentType();
                    return new aw(str, componentType, i, j, str2, str3, componentType, type, field);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.alibaba.fastjson2.writer.dl] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.alibaba.fastjson2.writer.du$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.alibaba.fastjson2.writer.FieldWriter a(java.lang.Class r14, long r15, com.alibaba.fastjson2.writer.du r17, tb.aai r18, tb.aak r19, java.lang.reflect.Field r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bx.a(java.lang.Class, long, com.alibaba.fastjson2.writer.du, tb.aai, tb.aak, java.lang.reflect.Field):com.alibaba.fastjson2.writer.FieldWriter");
    }

    public <T> FieldWriter a(String str, com.alibaba.fastjson2.function.g<T> gVar) {
        return new ag(str, 0, 0L, null, null, null, gVar);
    }

    public <T, V> FieldWriter a(String str, Class cls, com.alibaba.fastjson2.function.d<T, V> dVar) {
        return a(null, null, str, 0, 0L, null, null, cls, cls, null, dVar);
    }

    protected bg a(du duVar, Class cls) {
        bg bgVar;
        bg bgVar2;
        bg bgVar3;
        if (cls == Date.class) {
            if ((duVar.g & 16) != 0 && (bgVar3 = duVar.f3097a.get(cls)) != cp.l) {
                return bgVar3;
            }
            return null;
        } else if (cls == Long.TYPE || cls == Long.class) {
            if ((duVar.g & 4) != 0 && (bgVar = duVar.f3097a.get(Long.class)) != da.f3080a) {
                return bgVar;
            }
            return null;
        } else if (cls == BigDecimal.class) {
            if ((duVar.g & 8) != 0 && (bgVar2 = duVar.f3097a.get(cls)) != cg.f3062a) {
                return bgVar2;
            }
            return null;
        } else if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        } else {
            bg bgVar4 = duVar.f3097a.get(cls);
            if (bgVar4 instanceof cs) {
                return null;
            }
            return bgVar4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.writer.bg a(final java.lang.Class r22, long r23, final com.alibaba.fastjson2.writer.du r25) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bx.a(java.lang.Class, long, com.alibaba.fastjson2.writer.du):com.alibaba.fastjson2.writer.bg");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.writer.bg a(java.lang.Class r10, long r11, com.alibaba.fastjson2.writer.FieldWriter... r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bx.a(java.lang.Class, long, com.alibaba.fastjson2.writer.FieldWriter[]):com.alibaba.fastjson2.writer.bg");
    }

    public bg a(Class cls, FieldWriter... fieldWriterArr) {
        return a(cls, 0L, fieldWriterArr);
    }

    protected void a(aai aaiVar, List<FieldWriter> list) {
        if (aaiVar.q == null || aaiVar.q.length == 0) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FieldWriter fieldWriter = list.get(size);
            String[] strArr = aaiVar.q;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].equals(fieldWriter.f3039a)) {
                    list.remove(size);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
