package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.reader.bu;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class ds implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Class f3000a;
    final Class b;

    static {
        kge.a(-1895935065);
        kge.a(438295340);
    }

    public ds(Class cls, Class cls2) {
        this.f3000a = cls;
        this.b = cls2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection a(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection c(Collection collection) {
        return Collections.singleton(collection.iterator().next());
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
        Class cls = this.b;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create list error, type " + this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.aF()) {
            return null;
        }
        Collection hashSet = jSONReader.A() ? new HashSet() : (Collection) a(jSONReader.f2934a.p | j);
        char a2 = jSONReader.a();
        if (a2 == '[') {
            jSONReader.D();
            while (!jSONReader.r()) {
                hashSet.add(jSONReader.az());
            }
        } else if (a2 != '\"' && a2 != '\'' && a2 != '{') {
            throw new JSONException(jSONReader.aR());
        } else {
            String az = jSONReader.az();
            if (!az.isEmpty()) {
                hashSet.add(az);
            }
        }
        jSONReader.s();
        return hashSet;
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

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Collection collection;
        Class cls = this.b;
        com.alibaba.fastjson2.function.d dVar = null;
        if (jSONReader.g()) {
            return null;
        }
        bu a2 = jSONReader.a(this.f3000a, 0L, j);
        if (a2 != null) {
            cls = a2.bm_();
        }
        int i = 0;
        if (cls == dq.e) {
            int t = jSONReader.t();
            String[] strArr = new String[t];
            while (i < t) {
                strArr[i] = jSONReader.az();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int t2 = jSONReader.t();
        if (cls == ArrayList.class) {
            collection = t2 > 0 ? new ArrayList(t2) : new ArrayList();
        } else if (cls == JSONArray.class) {
            collection = t2 > 0 ? new JSONArray(t2) : new JSONArray();
        } else if (cls == dq.f) {
            collection = new ArrayList();
            dVar = $$Lambda$BJTrgSpxqq610XYt9GmF9nYOEJ8.INSTANCE;
        } else if (cls == dq.g) {
            collection = new ArrayList();
            dVar = $$Lambda$pdKaov3HfmrewUSE_RhBH6kxf3Y.INSTANCE;
        } else if (cls == dq.h) {
            collection = new LinkedHashSet();
            dVar = $$Lambda$utrKItNfF_AKo4JAkkEJ458KBOs.INSTANCE;
        } else if (cls == dq.c) {
            collection = new ArrayList();
            dVar = $$Lambda$ds$1saK4TMWhiAiXIBy30UCqRswSbM.INSTANCE;
        } else if (cls == dq.d) {
            collection = new ArrayList();
            dVar = $$Lambda$ds$vMXV62Og32uYe_DrMoymWMWxC4U.INSTANCE;
        } else if (cls == null || cls == this.f3000a) {
            collection = (Collection) a(j | jSONReader.f2934a.p);
        } else {
            try {
                collection = (Collection) cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new JSONException(jSONReader.d("create instance error " + cls), e);
            }
        }
        while (i < t2) {
            collection.add(jSONReader.az());
            i++;
        }
        return dVar != null ? (Collection) dVar.apply(collection) : collection;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        if (this.f3000a.isInstance(collection)) {
            boolean z = true;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!(it.next() instanceof String)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return collection;
            }
        }
        Collection collection2 = (Collection) a(0L);
        for (Object obj : collection) {
            if (obj != null && !(obj instanceof String)) {
                obj = a.CC.a(obj);
            }
            collection2.add(obj);
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.f3000a;
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
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }
}
