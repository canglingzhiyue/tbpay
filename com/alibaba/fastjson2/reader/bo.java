package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class bo<T> extends d<T> {
    final boolean v;
    final long w;

    static {
        kge.a(1229207190);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo(String str, Class cls, int i, long j, String str2, String str3, Field field) {
        super(str, cls, cls, i, j, str2, null, str3, null, field);
        this.v = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
        this.w = com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        String az = jSONReader.az();
        if (this.v && az != null) {
            az = az.trim();
        }
        a((bo<T>) t, az);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        String obj2 = (obj == null || (obj instanceof String)) ? (String) obj : obj.toString();
        if (this.v && obj2 != null) {
            obj2 = obj2.trim();
        }
        com.alibaba.fastjson2.util.e.UNSAFE.putObject(t, this.w, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean a(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        String az = jSONReader.az();
        if (this.v && az != null) {
            az = az.trim();
        }
        com.alibaba.fastjson2.util.e.UNSAFE.putObject(t, this.w, az);
    }

    @Override // com.alibaba.fastjson2.reader.d
    /* renamed from: d */
    public String b(JSONReader jSONReader) {
        String az = jSONReader.az();
        return (!this.v || az == null) ? az : az.trim();
    }
}
