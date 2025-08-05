package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public final class dl extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final dl f2994a;
    final com.alibaba.fastjson2.function.d<long[], Object> b;

    static {
        kge.a(912399657);
        f2994a = new dl(long[].class, null);
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("[J");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dl(Class cls, com.alibaba.fastjson2.function.d<long[], Object> dVar) {
        super(cls);
        this.b = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        com.alibaba.fastjson2.function.d<long[], Object> dVar;
        long[] X = jSONReader.X();
        return (X == null || (dVar = this.b) == null) ? X : dVar.apply(X);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        com.alibaba.fastjson2.function.d<long[], Object> dVar;
        long[] X = jSONReader.X();
        return (X == null || (dVar = this.b) == null) ? X : dVar.apply(X);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        long longValue;
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                longValue = 0;
            } else if (obj instanceof Number) {
                longValue = ((Number) obj).longValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Long.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to long " + obj.getClass());
                }
                longValue = ((Long) a2.apply(obj)).longValue();
            }
            jArr[i] = longValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<long[], Object> dVar = this.b;
        return dVar != null ? dVar.apply(jArr) : jArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
