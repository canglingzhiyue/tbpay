package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public interface bu<T> {
    public static final long HASH_TYPE = 435678704704L;

    /* renamed from: com.alibaba.fastjson2.reader.bu$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static d $default$a(bu buVar, String str) {
            long b = com.alibaba.fastjson2.util.c.b(str);
            d b2 = buVar.b(b);
            if (b2 == null) {
                long a2 = com.alibaba.fastjson2.util.c.a(str);
                return a2 != b ? buVar.c(a2) : b2;
            }
            return b2;
        }

        public static Object $default$a(bu buVar, long j) {
            throw new UnsupportedOperationException();
        }

        public static Object $default$a(bu buVar, Map map, long j) {
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            Object obj = map.get(buVar.d());
            if (obj instanceof String) {
                String str = (String) obj;
                long b = com.alibaba.fastjson2.util.c.b(str);
                bu buVar2 = null;
                if ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (buVar instanceof en)) {
                    buVar2 = buVar.a(objectReaderProvider, b);
                }
                if (buVar2 == null) {
                    buVar2 = objectReaderProvider.a(str, (Class<?>) buVar.bm_(), buVar.c() | j);
                }
                if (buVar2 != buVar && buVar2 != null) {
                    return buVar2.a(map, j);
                }
            }
            Object a2 = buVar.a(0L);
            for (Map.Entry entry : map.entrySet()) {
                String obj2 = entry.getKey().toString();
                Object value = entry.getValue();
                d a3 = buVar.a(obj2);
                if (a3 == null) {
                    buVar.a(a2, obj2, entry.getValue(), j);
                } else {
                    a3.a((d) a2, value, j);
                }
            }
            com.alibaba.fastjson2.function.d f = buVar.f();
            return f != null ? f.apply(a2) : a2;
        }

        public static Object $default$a(bu buVar, Map map, JSONReader.Feature... featureArr) {
            long j = 0;
            for (JSONReader.Feature feature : featureArr) {
                j |= feature.mask;
            }
            return buVar.a(map, j);
        }

        public static void $default$a(bu buVar, Object obj, String str, Object obj2, long j) {
        }

        public static d $default$b(bu buVar, long j) {
            return null;
        }

        public static Object $default$b(bu buVar, JSONReader jSONReader, Type type, Object obj, long j) {
            if (!jSONReader.w() || !jSONReader.m()) {
                jSONReader.n();
                Object obj2 = null;
                int i = 0;
                while (!jSONReader.p()) {
                    long G = jSONReader.G();
                    if (G == buVar.e() && i == 0) {
                        long F = jSONReader.F();
                        JSONReader.c cVar = jSONReader.f2934a;
                        bu a2 = buVar.a(cVar, F);
                        if (a2 == null) {
                            String aG = jSONReader.aG();
                            bu a3 = cVar.a(aG, null);
                            if (a3 == null) {
                                throw new JSONException(jSONReader.d("No suitable ObjectReader found for" + aG));
                            }
                            a2 = a3;
                        }
                        if (a2 != buVar) {
                            return a2.b(jSONReader, type, obj, j);
                        }
                    } else if (G != 0) {
                        d b = buVar.b(G);
                        if (b == null && jSONReader.b(buVar.c() | j)) {
                            b = buVar.c(jSONReader.H());
                        }
                        if (b == null) {
                            jSONReader.N();
                        } else {
                            if (obj2 == null) {
                                obj2 = buVar.a(jSONReader.f2934a.p | j);
                            }
                            b.b(jSONReader, obj2);
                        }
                    }
                    i++;
                }
                return obj2 == null ? buVar.a(jSONReader.f2934a.p | j) : obj2;
            }
            return buVar.c(jSONReader, type, obj, j);
        }

        public static Object $default$b(bu buVar, Collection collection) {
            throw new UnsupportedOperationException(buVar.getClass().getName());
        }

        public static Class $default$bm_(bu buVar) {
            return null;
        }

        public static long $default$c(bu buVar) {
            return 0L;
        }

        public static d $default$c(bu buVar, long j) {
            return null;
        }

        public static Object $default$c(bu buVar, JSONReader jSONReader, Type type, Object obj, long j) {
            throw new UnsupportedOperationException();
        }

        public static Object $default$d(bu buVar, JSONReader jSONReader, Type type, Object obj, long j) {
            throw new UnsupportedOperationException();
        }

        public static com.alibaba.fastjson2.function.d $default$f(bu buVar) {
            return null;
        }
    }

    bu a(JSONReader.c cVar, long j);

    bu a(ObjectReaderProvider objectReaderProvider, long j);

    d a(String str);

    T a(long j);

    T a(JSONReader jSONReader);

    T a(JSONReader jSONReader, Type type, Object obj, long j);

    T a(Map map, long j);

    T a(Map map, JSONReader.Feature... featureArr);

    void a(Object obj, String str, Object obj2, long j);

    d b(long j);

    T b();

    T b(JSONReader jSONReader, Type type, Object obj, long j);

    T b(Collection collection);

    Class<T> bm_();

    long c();

    d c(long j);

    T c(JSONReader jSONReader, Type type, Object obj, long j);

    T d(JSONReader jSONReader, Type type, Object obj, long j);

    String d();

    long e();

    com.alibaba.fastjson2.function.d f();
}
