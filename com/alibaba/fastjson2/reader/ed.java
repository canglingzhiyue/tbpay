package com.alibaba.fastjson2.reader;

import android.support.media.ExifInterface;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class ed extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final ed f3009a;

    static {
        kge.a(223452272);
        f3009a = new ed();
        HASH_TYPE = com.alibaba.fastjson2.util.c.b(ExifInterface.LATITUDE_SOUTH);
    }

    public ed() {
        super(Short.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer T = jSONReader.T();
        if (T == null) {
            return null;
        }
        return Short.valueOf(T.shortValue());
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer T = jSONReader.T();
        if (T == null) {
            return null;
        }
        return Short.valueOf(T.shortValue());
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
