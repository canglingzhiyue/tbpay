package com.alibaba.fastjson2;

import com.alibaba.fastjson2.d;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    static final h f2946a;
    static final h b;
    static final h c;
    final int d;

    static {
        kge.a(-1754475890);
        f2946a = new h(0);
        b = new h(1);
        c = new h(2);
    }

    public h(int i) {
        if (i >= 0) {
            this.d = i;
            return;
        }
        throw new JSONException("not support negative index");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(int i) {
        return i == 0 ? f2946a : i == 1 ? b : i == 2 ? c : new h(i);
    }

    private Object a(Map map) {
        Object obj = map.get(Integer.valueOf(this.d));
        if (obj == null) {
            obj = map.get(Integer.toString(this.d));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i = 0;
            if (size != 1 && !(map instanceof LinkedHashMap) && !(map instanceof SortedMap)) {
                while (i <= this.d && i < map.size() && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof Long) && key.equals(Long.valueOf(this.d))) {
                        return value;
                    }
                    i++;
                }
                return obj;
            }
            while (i <= this.d && i < size && it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (key2 instanceof Long) {
                    if (key2.equals(Long.valueOf(this.d))) {
                        return value2;
                    }
                } else if (i == this.d) {
                    obj = value2;
                }
                i++;
            }
            return obj;
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.g
    public void a(d.a aVar) {
        Object obj = aVar.b == null ? aVar.f : aVar.b.g;
        if (obj == null) {
            aVar.h = true;
        } else if (obj instanceof List) {
            List list = (List) obj;
            if (this.d < list.size()) {
                aVar.g = list.get(this.d);
            }
            aVar.h = true;
        } else if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (this.d == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            int i = 0;
            Iterator it = ((Collection) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i == this.d) {
                    aVar.g = next;
                    break;
                }
                i++;
            }
            aVar.h = true;
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i2 = this.d;
            if (i2 < objArr.length) {
                aVar.g = objArr[i2];
            }
            aVar.h = true;
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                int i3 = this.d;
                if (i3 < length) {
                    aVar.g = Array.get(obj, i3);
                }
                aVar.h = true;
                return;
            }
            if (Map.class.isAssignableFrom(cls)) {
                obj = a((Map) obj);
            } else if (this.d != 0) {
                throw new JSONException("jsonpath not support operate : " + aVar.f2943a + ", objectClass" + cls.getName());
            }
            aVar.g = obj;
            aVar.h = true;
        }
    }

    public String toString() {
        char[] cArr = new char[com.alibaba.fastjson2.util.d.a(this.d) + 2];
        cArr[0] = '[';
        com.alibaba.fastjson2.util.d.b(cArr, 1, this.d);
        cArr[cArr.length - 1] = ']';
        return new String(cArr);
    }
}
