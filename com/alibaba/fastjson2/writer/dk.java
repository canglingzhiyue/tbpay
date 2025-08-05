package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dk extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dk f3089a;

    static {
        kge.a(1907618534);
        f3089a = new dk();
    }

    dk() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.d(((Locale) obj).toString());
        }
    }
}
