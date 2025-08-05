package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.TimeZone;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.fastjson2.writer.do  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cdo extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final Cdo f3093a;

    static {
        kge.a(-412635739);
        f3093a = new Cdo();
    }

    Cdo() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.d(((TimeZone) obj).getID());
        }
    }
}
