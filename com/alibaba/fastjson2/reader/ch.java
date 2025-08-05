package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.math.BigInteger;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ch extends em<BigInteger> {

    /* renamed from: a  reason: collision with root package name */
    static final ch f2965a;

    static {
        kge.a(809417898);
        f2965a = new ch();
    }

    public ch() {
        super(BigInteger.class);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    /* renamed from: e */
    public BigInteger b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.af();
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: f */
    public BigInteger a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.af();
    }
}
