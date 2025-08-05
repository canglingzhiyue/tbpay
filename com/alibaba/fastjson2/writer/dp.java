package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class dp extends dt {
    public static final dp DIRECT;
    public static final dp INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3094a;

    static {
        kge.a(-112376840);
        INSTANCE = new dp(false);
        DIRECT = new dp(true);
    }

    public dp() {
        this(false);
    }

    public dp(boolean z) {
        this.f3094a = z;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        String obj3 = obj.toString();
        if (this.f3094a) {
            jSONWriter.a(obj3);
        } else {
            jSONWriter.d(obj3);
        }
    }
}
