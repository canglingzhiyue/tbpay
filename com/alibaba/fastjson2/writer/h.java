package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class h extends g {
    static {
        kge.a(1780591926);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(String str, int i, long j, String str2, String str3, Field field, Class cls) {
        super(str, i, j, str2, str3, cls, cls, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return Boolean.valueOf(b(obj));
    }

    public boolean b(Object obj) {
        if (obj == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getBoolean(obj, this.k) : this.i.getBoolean(obj);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }
}
