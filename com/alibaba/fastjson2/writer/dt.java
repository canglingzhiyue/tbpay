package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.bg;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class dt<T> implements bg<T> {
    static {
        kge.a(2111911387);
        kge.a(-1047766740);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ FieldWriter a(long j) {
        return bg.CC.$default$a(this, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
        a(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(cqa cqaVar) {
        bg.CC.$default$a(this, cqaVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqj dqjVar) {
        bg.CC.$default$a((bg) this, dqjVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqo dqoVar) {
        bg.CC.$default$a((bg) this, dqoVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqs dqsVar) {
        bg.CC.$default$a((bg) this, dqsVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqv dqvVar) {
        bg.CC.$default$a((bg) this, dqvVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ boolean a(JSONWriter jSONWriter) {
        boolean a2;
        a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
        return a2;
    }

    public com.alibaba.fastjson2.function.d b() {
        return null;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
        e(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        a(jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ List<FieldWriter> bn_() {
        List<FieldWriter> emptyList;
        emptyList = Collections.emptyList();
        return emptyList;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        b(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        a(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
    }
}
