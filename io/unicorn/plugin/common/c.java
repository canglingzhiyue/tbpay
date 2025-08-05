package io.unicorn.plugin.common;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.kge;

/* loaded from: classes9.dex */
public final class c implements f<Object> {
    public static final c INSTANCE;

    static {
        kge.a(865051519);
        kge.a(1699229335);
        INSTANCE = new c();
    }

    private c() {
    }

    public static void a() {
    }

    @Override // io.unicorn.plugin.common.f
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(k.INSTANCE.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // io.unicorn.plugin.common.f
    public ByteBuffer a(Object obj) {
        k kVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object b = e.b(obj);
        if (b instanceof String) {
            kVar = k.INSTANCE;
            obj2 = JSONObject.quote((String) b);
        } else {
            kVar = k.INSTANCE;
            obj2 = b.toString();
        }
        return kVar.a(obj2);
    }
}
