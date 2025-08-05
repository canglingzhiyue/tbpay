package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import tb.kge;

/* loaded from: classes2.dex */
public final class dq implements bu {

    /* renamed from: a  reason: collision with root package name */
    static final Class f2998a;
    static final Class b;
    static final Class c;
    static final Class d;
    static final Class e;
    static final Class f;
    static final Class g;
    static final Class h;
    public static dq i;
    public static dq v;
    final Type j;
    final Class k;
    final Class l;
    final long m;
    final Type n;
    final Class o;
    final String p;
    final long q;
    final com.alibaba.fastjson2.function.d r;
    Object s;
    bu t;
    volatile boolean u;

    static {
        kge.a(2085210666);
        kge.a(438295340);
        f2998a = Collections.emptySet().getClass();
        b = Collections.emptyList().getClass();
        c = Collections.singleton(0).getClass();
        d = Collections.singletonList(0).getClass();
        e = Arrays.asList(0).getClass();
        f = Collections.unmodifiableCollection(Collections.emptyList()).getClass();
        g = Collections.unmodifiableList(Collections.emptyList()).getClass();
        h = Collections.unmodifiableSet(Collections.emptySet()).getClass();
        i = new dq(ArrayList.class, ArrayList.class, ArrayList.class, 65L, Object.class, Object.class, null, "Object", 127970252055119L);
        v = new dq(JSONArray.class, JSONArray.class, JSONArray.class, 8893561198416334968L, Object.class, Object.class, null, "Object", 127970252055119L);
    }

    dq(Class cls, Object obj) {
        this(cls, cls, cls, Object.class, null);
        this.s = obj;
    }

    private dq(Type type, Class cls, Class cls2, long j, Type type2, Class cls3, com.alibaba.fastjson2.function.d dVar, String str, long j2) {
        this.j = type;
        this.k = cls;
        this.l = cls2;
        this.m = j;
        this.n = type2;
        this.o = cls3;
        this.r = dVar;
        this.p = str;
        this.q = j2;
    }

    public dq(Type type, Class cls, Class cls2, Type type2, com.alibaba.fastjson2.function.d dVar) {
        this.j = type;
        this.k = cls;
        this.l = cls2;
        this.m = com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls2));
        this.n = type2;
        this.o = TypeUtils.e(type2);
        this.r = dVar;
        Class cls3 = this.o;
        this.p = cls3 != null ? TypeUtils.a(cls3) : null;
        String str = this.p;
        this.q = str != null ? com.alibaba.fastjson2.util.c.b(str) : 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d0 A[Catch: IllegalAccessException -> 0x01dd, IllegalAccessException | NoSuchFieldException -> 0x01df, TryCatch #2 {IllegalAccessException | NoSuchFieldException -> 0x01df, blocks: (B:144:0x01c4, B:146:0x01d0, B:147:0x01d3), top: B:155:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.reader.bu a(java.lang.reflect.Type r9, java.lang.Class r10, long r11) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.dq.a(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.bu");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Object obj) {
        return EnumSet.copyOf((Collection) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection a(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Object obj) {
        return Collections.unmodifiableSet((Set) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List b(List list) {
        return Collections.singletonList(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection c(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(Object obj) {
        return Collections.unmodifiableCollection((Collection) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e(Object obj) {
        return Arrays.asList(((List) obj).toArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f(Object obj) {
        return Collections.singletonList(((List) obj).get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g(Object obj) {
        return Collections.singleton(((List) obj).get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h(Object obj) {
        return EnumSet.copyOf((Collection) obj);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(ObjectReaderProvider objectReaderProvider, long j) {
        bu a2;
        a2 = objectReaderProvider.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d a(String str) {
        return bu.CC.$default$a(this, str);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(long j) {
        Class cls = this.l;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == TreeSet.class) {
            return new TreeSet();
        }
        Object obj = this.s;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            JSONException jSONException = null;
            if (!this.u) {
                try {
                    return this.l.newInstance();
                } catch (IllegalAccessException | InstantiationException unused) {
                    this.u = true;
                    jSONException = new JSONException("create list error, type " + this.l);
                }
            }
            if (this.u && List.class.isAssignableFrom(this.l.getSuperclass())) {
                try {
                    return this.l.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.u = true;
                    jSONException = new JSONException("create list error, type " + this.l);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Object a2;
        JSONReader.c cVar = jSONReader.f2934a;
        if (this.t == null) {
            this.t = cVar.a(this.n);
        }
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.aF()) {
            return null;
        }
        Collection hashSet = jSONReader.A() ? new HashSet() : (Collection) a(cVar.p | j);
        char a3 = jSONReader.a();
        if (a3 == '\"') {
            String az = jSONReader.az();
            String str = az;
            if (this.o != String.class) {
                if (az.isEmpty()) {
                    jSONReader.s();
                    return null;
                }
                com.alibaba.fastjson2.function.d a4 = cVar.w.a(String.class, this.n);
                if (a4 == null) {
                    throw new JSONException(jSONReader.aR());
                }
                str = a4.apply(az);
            }
            jSONReader.s();
            hashSet.add(str);
            return hashSet;
        }
        int i2 = 0;
        if (a3 != '[') {
            if ((this.o == Object.class || this.t == null) && (this.o != Object.class || !jSONReader.x())) {
                throw new JSONException(jSONReader.aR());
            }
            hashSet.add(this.t.a(jSONReader, this.n, (Object) 0, 0L));
            com.alibaba.fastjson2.function.d dVar = this.r;
            return dVar != null ? (Collection) dVar.apply(hashSet) : hashSet;
        }
        jSONReader.D();
        bu buVar = this.t;
        Type type2 = this.n;
        if (type != null && type != this.j && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != this.n) {
                buVar = jSONReader.a(type2);
            }
        }
        while (!jSONReader.r()) {
            if (jSONReader.a() == ',') {
                throw new JSONException(jSONReader.d("illegal input error"));
            }
            if (type2 == String.class) {
                a2 = jSONReader.az();
            } else if (buVar == null) {
                throw new JSONException(jSONReader.d("TODO : " + type2));
            } else if (jSONReader.u()) {
                String v2 = jSONReader.v();
                if ("..".equals(v2)) {
                    a2 = this;
                } else {
                    jSONReader.a(hashSet, i2, com.alibaba.fastjson2.d.a(v2));
                    i2++;
                }
            } else {
                a2 = buVar.a(jSONReader, type2, Integer.valueOf(i2), 0L);
            }
            hashSet.add(a2);
            i2++;
        }
        jSONReader.s();
        com.alibaba.fastjson2.function.d dVar2 = this.r;
        return dVar2 != null ? dVar2.apply(hashSet) : hashSet;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j) {
        return bu.CC.$default$a(this, map, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return bu.CC.$default$a(this, map, featureArr);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ void a(Object obj, String str, Object obj2, long j) {
        bu.CC.$default$a(this, obj, str, obj2, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d b(long j) {
        return bu.CC.$default$b(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b() {
        ?? a2;
        a2 = a(0L);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2 A[RETURN] */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.alibaba.fastjson2.JSONReader r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.dq.b(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        bu buVar;
        Map map;
        if (collection.size() == 0 && this.k == List.class) {
            ArrayList arrayList = new ArrayList();
            com.alibaba.fastjson2.function.d dVar = this.r;
            return dVar != null ? dVar.apply(arrayList) : arrayList;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Collection arrayList2 = this.l == ArrayList.class ? new ArrayList(collection.size()) : (Collection) a(0L);
        for (Object obj : collection) {
            if (obj == null) {
                obj = null;
            } else {
                Class<?> cls = obj.getClass();
                if ((cls == JSONObject.class || cls == JSONFactory.d()) && this.o != cls) {
                    if (this.t == null) {
                        this.t = objectReaderProvider.a(this.n);
                    }
                    buVar = this.t;
                    map = (JSONObject) obj;
                } else {
                    Type type = this.n;
                    if (cls == type) {
                        continue;
                    } else {
                        com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls, type);
                        if (a2 != null) {
                            obj = a2.apply(obj);
                        } else if (obj instanceof Map) {
                            map = (Map) obj;
                            if (this.t == null) {
                                this.t = objectReaderProvider.a(this.n);
                            }
                            buVar = this.t;
                        } else if (obj instanceof Collection) {
                            if (this.t == null) {
                                this.t = objectReaderProvider.a(this.n);
                            }
                            obj = this.t.b((Collection) obj);
                        } else if (this.o.isInstance(obj)) {
                            continue;
                        } else if (!Enum.class.isAssignableFrom(this.o)) {
                            throw new JSONException("can not convert from " + cls + " to " + this.n);
                        } else {
                            if (this.t == null) {
                                this.t = objectReaderProvider.a(this.n);
                            }
                            bu buVar2 = this.t;
                            if (buVar2 instanceof cu) {
                                obj = ((cu) buVar2).b((String) obj);
                            } else if (!(buVar2 instanceof cv)) {
                                throw new JSONException("can not convert from " + cls + " to " + this.n);
                            } else {
                                obj = ((cv) buVar2).b((String) obj);
                            }
                        }
                    }
                }
                obj = buVar.a(map, 0L);
            }
            arrayList2.add(obj);
        }
        com.alibaba.fastjson2.function.d dVar2 = this.r;
        return dVar2 != null ? dVar2.apply(arrayList2) : arrayList2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.k;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long c() {
        return bu.CC.$default$c(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d c(long j) {
        return bu.CC.$default$c(this, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T c(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$c(this, jSONReader, type, obj, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T d(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$d(this, jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ String d() {
        String str;
        str = JSON.DEFAULT_TYPE_KEY;
        return str;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long e() {
        long j;
        j = bu.HASH_TYPE;
        return j;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public com.alibaba.fastjson2.function.d f() {
        return this.r;
    }
}
