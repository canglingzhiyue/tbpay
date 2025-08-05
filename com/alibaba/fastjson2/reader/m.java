package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
final class m<T> extends l<T> {
    final boolean w;

    static {
        kge.a(-714603795);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, Type type, Class cls, int i, String str2, Field field) {
        super(str, type, cls, i, 0L, str2, null, field);
        this.w = Modifier.isFinal(field.getModifiers());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (this.w) {
                ((AtomicReference) this.h.get(t)).set(obj);
            } else {
                this.h.set(t, new AtomicReference(obj));
            }
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
