package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.d;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.bg;
import com.alibaba.fastjson2.writer.bt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends g {

    /* renamed from: a  reason: collision with root package name */
    final String f2947a;
    final long b;

    static {
        kge.a(-1857574577);
    }

    public i(String str, long j) {
        this.f2947a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.alibaba.fastjson2.JSONArray] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.alibaba.fastjson2.JSONArray] */
    @Override // com.alibaba.fastjson2.g
    public void a(d.a aVar) {
        Object obj;
        Object obj2 = aVar.b == null ? aVar.f : aVar.b.g;
        if (obj2 == null) {
            return;
        }
        ?? r2 = 0;
        Long l = null;
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(this.f2947a);
            if (obj3 == null) {
                boolean a2 = com.alibaba.fastjson2.util.d.a(this.f2947a);
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof Enum) || !((Enum) key).name().equals(this.f2947a)) {
                        if (key instanceof Long) {
                            if (l == null && a2) {
                                l = Long.valueOf(Long.parseLong(this.f2947a));
                            }
                            if (key.equals(l)) {
                            }
                        }
                    }
                    obj3 = entry.getValue();
                }
            }
            aVar.g = obj3;
        } else if (!(obj2 instanceof Collection)) {
            Class<?> cls = obj2.getClass();
            JSONWriter.a aVar2 = aVar.f2943a.c;
            bg a3 = aVar2 != null ? aVar2.a(cls) : JSONFactory.defaultObjectWriterProvider.b(cls);
            if (a3 instanceof bt) {
                FieldWriter a4 = a3.a(this.b);
                if (a4 == null) {
                    return;
                }
                aVar.g = a4.a((FieldWriter) obj2);
            } else if (!(obj2 instanceof Number) && !(obj2 instanceof Boolean)) {
                throw new JSONException("not support : " + cls);
            } else {
                aVar.g = null;
            }
        } else {
            Collection collection = (Collection) obj2;
            int size = collection.size();
            for (Object obj4 : collection) {
                if ((obj4 instanceof Map) && (obj = ((Map) obj4).get(this.f2947a)) != null) {
                    if (!(obj instanceof Collection)) {
                        if (r2 == 0) {
                            r2 = new JSONArray(size);
                        }
                        r2.add(obj);
                    } else if (size == 1) {
                        r2 = (Collection) obj;
                    } else {
                        if (r2 == 0) {
                            r2 = new JSONArray(size);
                        }
                        r2.addAll((Collection) obj);
                    }
                }
            }
            aVar.g = r2;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if ((this.b == iVar.b && this.f2947a == iVar.f2947a) || ((str = this.f2947a) != null && str.equals(iVar.f2947a))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2947a, Long.valueOf(this.b)});
    }

    public String toString() {
        return this.f2947a;
    }
}
