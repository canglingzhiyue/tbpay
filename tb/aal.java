package tb;

import com.alibaba.fastjson2.JSONWriter;

/* loaded from: classes2.dex */
public abstract class aal implements cqa {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<JSONWriter> f25185a;

    static {
        kge.a(870278175);
        kge.a(686256365);
        f25185a = new ThreadLocal<>();
    }

    public void a(JSONWriter jSONWriter, Object obj) {
        f25185a.set(jSONWriter);
        f25185a.set(f25185a.get());
    }
}
