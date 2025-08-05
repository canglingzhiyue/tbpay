package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import tb.adb;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cg extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cg f2964a;
    final com.alibaba.fastjson2.function.d<BigDecimal, Object> b;
    private com.alibaba.fastjson2.function.d c;

    static {
        kge.a(393629373);
        f2964a = new cg(null);
    }

    public cg(com.alibaba.fastjson2.function.d<BigDecimal, Object> dVar) {
        super(BigDecimal.class);
        this.c = new adb(BigDecimal.class);
        this.b = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        BigDecimal ag = jSONReader.ag();
        com.alibaba.fastjson2.function.d<BigDecimal, Object> dVar = this.b;
        return dVar != null ? dVar.apply(ag) : ag;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object a(Map map, long j) {
        Object obj = map.get("value");
        if (obj == null) {
            obj = map.get("$numberDecimal");
        }
        if (!(obj instanceof BigDecimal)) {
            obj = this.c.apply(obj);
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        com.alibaba.fastjson2.function.d<BigDecimal, Object> dVar = this.b;
        return dVar != null ? dVar.apply(bigDecimal) : bigDecimal;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        BigDecimal ag = jSONReader.ag();
        com.alibaba.fastjson2.function.d<BigDecimal, Object> dVar = this.b;
        return dVar != null ? dVar.apply(ag) : ag;
    }
}
