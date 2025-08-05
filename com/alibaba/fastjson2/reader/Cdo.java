package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.fastjson2.reader.do  reason: invalid class name */
/* loaded from: classes2.dex */
public class Cdo extends em {

    /* renamed from: a  reason: collision with root package name */
    static final Cdo f2997a;

    static {
        kge.a(-119837646);
        f2997a = new Cdo();
    }

    public Cdo() {
        super(Integer.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.T();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.T();
    }
}
