package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.writer.bg;
import com.alibaba.fastjson2.writer.bt;
import com.alibaba.fastjson2.writer.du;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import tb.cqa;

/* loaded from: classes2.dex */
public interface a {
    public static final String VERSION = "2.0.47";

    /* renamed from: com.alibaba.fastjson2.a$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static JSONObject a(String str, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            JSONReader.c a2 = JSONFactory.a(featureArr);
            o oVar = new o(a2, str, 0, str.length());
            try {
                if (oVar.g()) {
                    oVar.close();
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                oVar.a((Map) jSONObject, 0L);
                if (oVar.b != null) {
                    oVar.a((Object) jSONObject);
                }
                if (oVar.d != 26 && (a2.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return jSONObject;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static Object a(String str) {
            Object obj;
            Object obj2;
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider c = JSONFactory.c();
            JSONReader.c cVar = new JSONReader.c(c);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                char a2 = oVar.a();
                if (cVar.s == null && (cVar.p & JSONReader.Feature.UseNativeObject.mask) == 0 && (a2 == '{' || a2 == '[')) {
                    if (a2 == '{') {
                        Map jSONObject = new JSONObject();
                        oVar.a(jSONObject, 0L);
                        obj2 = jSONObject;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        oVar.a((List) jSONArray);
                        obj2 = jSONArray;
                    }
                    obj = obj2;
                    if (oVar.b != null) {
                        oVar.a(obj2);
                        obj = obj2;
                    }
                } else {
                    obj = c.a((Type) Object.class, false).a(oVar, (Type) null, (Object) null, 0L);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return obj;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, t<T> tVar, cqa cqaVar, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider, null, cqaVar, featureArr);
            Type a2 = tVar.a();
            bu a3 = objectReaderProvider.a(a2, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                T t = (T) a3.a(oVar, a2, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, t<T> tVar, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
            Type a2 = tVar.a();
            bu a3 = objectReaderProvider.a(a2, (JSONFactory.f2931a & JSONReader.Feature.FieldBased.mask) != 0);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                T t = (T) a3.a(oVar, a2, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, Class<T> cls) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
            bu a2 = objectReaderProvider.a(cls, (JSONFactory.f2931a & JSONReader.Feature.FieldBased.mask) != 0);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                T t = (T) a2.a(oVar, cls, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, Class<T> cls, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
            bu a2 = objectReaderProvider.a(cls, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                T t = (T) a2.a(oVar, cls, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, Type type) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
            boolean z = false;
            o oVar = new o(cVar, str, 0, str.length());
            try {
                if ((JSONFactory.f2931a & JSONReader.Feature.FieldBased.mask) != 0) {
                    z = true;
                }
                T t = (T) objectReaderProvider.a(type, z).a(oVar, type, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(String str, Type type, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
            bu a2 = objectReaderProvider.a(type, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                T t = (T) a2.a(oVar, type, (Object) null, 0L);
                if (oVar.b != null) {
                    oVar.a(t);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static Object a(byte[] bArr, JSONReader.c cVar) {
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            bu a2 = cVar.a(Object.class);
            c cVar2 = new c(cVar, null, bArr, 0, bArr.length);
            try {
                Object a3 = a2.a(cVar2, (Type) null, (Object) null, 0L);
                if (cVar2.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(cVar2.d("input not end"));
                }
                cVar2.close();
                return a3;
            } catch (Throwable th) {
                try {
                    cVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> T a(byte[] bArr, Class<T> cls, JSONReader.c cVar) {
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            c cVar2 = new c(cVar, null, bArr, 0, bArr.length);
            try {
                T t = (T) cVar.w.a(cls, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0).a(cVar2, cls, (Object) null, 0L);
                if (cVar2.b != null) {
                    cVar2.a(t);
                }
                if (cVar2.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(cVar2.d("input not end"));
                }
                cVar2.close();
                return t;
            } catch (Throwable th) {
                try {
                    cVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static String a(Object obj) {
            du duVar = JSONFactory.defaultObjectWriterProvider;
            JSONWriter.a aVar = new JSONWriter.a(duVar);
            boolean z = true;
            try {
                JSONWriter rVar = ((JSONFactory.d & JSONWriter.Feature.OptimizedForAscii.mask) > 0L ? 1 : ((JSONFactory.d & JSONWriter.Feature.OptimizedForAscii.mask) == 0L ? 0 : -1)) != 0 ? new r(aVar) : new q(aVar);
                if (obj == null) {
                    rVar.n();
                } else {
                    rVar.n = obj;
                    rVar.p = JSONWriter.b.ROOT;
                    Class<?> cls = obj.getClass();
                    if (cls == JSONObject.class && aVar.k == 0) {
                        rVar.a((JSONObject) obj);
                    } else {
                        if ((aVar.k & JSONWriter.Feature.FieldBased.mask) == 0) {
                            z = false;
                        }
                        duVar.b(cls, cls, z).a(rVar, obj, null, null, 0L);
                    }
                }
                String obj2 = rVar.toString();
                rVar.close();
                return obj2;
            } catch (NullPointerException | NumberFormatException e) {
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj + "'", e);
            }
        }

        public static String a(Object obj, JSONWriter.Feature... featureArr) {
            du duVar = JSONFactory.defaultObjectWriterProvider;
            JSONWriter.a aVar = new JSONWriter.a(duVar, featureArr);
            boolean z = (aVar.k & JSONWriter.Feature.FieldBased.mask) != 0;
            JSONWriter a2 = JSONWriter.a(aVar);
            try {
                if (obj == null) {
                    a2.n();
                } else {
                    a2.n = obj;
                    a2.p = JSONWriter.b.ROOT;
                    Class<?> cls = obj.getClass();
                    duVar.b(cls, cls, z).a(a2, obj, null, null, 0L);
                }
                String obj2 = a2.toString();
                if (a2 != null) {
                    a2.close();
                }
                return obj2;
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

        public static JSONArray b(String str, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider, featureArr);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                if (oVar.g()) {
                    oVar.close();
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                oVar.a((List) jSONArray);
                if (oVar.b != null) {
                    oVar.a((Object) jSONArray);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return jSONArray;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static JSONObject b(String str) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                if (oVar.g()) {
                    oVar.close();
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                oVar.a((Map) jSONObject, 0L);
                if (oVar.b != null) {
                    oVar.a((Object) jSONObject);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return jSONObject;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static Object b(Object obj) {
            return b(obj, (JSONWriter.Feature[]) null);
        }

        public static Object b(Object obj, JSONWriter.Feature... featureArr) {
            if (obj == null) {
                return null;
            }
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                return obj;
            }
            JSONWriter.a a2 = featureArr == null ? JSONFactory.a() : JSONFactory.a(featureArr);
            Class<?> cls = obj.getClass();
            bg a3 = a2.a(cls, cls);
            if ((a3 instanceof bt) && !a2.a(JSONWriter.Feature.ReferenceDetection)) {
                return ((bt) a3).a((bt) obj, a2.k);
            }
            try {
                JSONWriter a4 = JSONWriter.a(a2);
                try {
                    a3.a(a4, obj, null, null, a2.k);
                    String obj2 = a4.toString();
                    if (a4 != null) {
                        a4.close();
                    }
                    return a(obj2);
                } catch (Throwable th) {
                    if (a4 != null) {
                        try {
                            a4.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (NullPointerException | NumberFormatException e) {
                throw new JSONException("toJSONString error", e);
            }
        }

        public static <T> List<T> b(String str, Class<T> cls) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                List c = oVar.c(cls);
                if (oVar.b != null) {
                    oVar.a((Object) c);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return c;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static <T> List<T> b(String str, Class<T> cls, JSONReader.Feature... featureArr) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider, featureArr);
            o oVar = new o(cVar, str, 0, str.length());
            try {
                List c = oVar.c(cls);
                if (oVar.b != null) {
                    oVar.a((Object) c);
                }
                if (oVar.d != 26 && (cVar.p & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(oVar.d("input not end"));
                }
                oVar.close();
                return c;
            } catch (Throwable th) {
                try {
                    oVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
